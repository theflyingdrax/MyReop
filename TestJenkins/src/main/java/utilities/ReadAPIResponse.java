package utilities;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v120.network.Network;
import org.openqa.selenium.devtools.v120.network.model.RequestId;

import commonFunctionality.Base;

public class ReadAPIResponse {
	WebDriver driver;
	private ConfigWriter configWriter = new ConfigWriter();
	
	public void readResponse(String key) {
		DevTools devTools = ((ChromeDriver) Base.getDriver()).getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.of(1000000), Optional.empty(), Optional.empty()));
		devTools.addListener(Network.responseReceived(), responseReceived -> {
			String responseUrl = responseReceived.getResponse().getUrl();
			RequestId requestId = responseReceived.getRequestId();
			if (responseUrl.contains(key)) {
				System.out.println("Url: " + responseUrl);
				String responseBody = devTools.send(Network.getResponseBody(requestId)).getBody();
				System.out.println("Printed response = "+responseBody);
				configWriter.writePranJsonResponse(responseBody);
			}

		});
	}
	
}
