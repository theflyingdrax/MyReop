package utilities;

public class POPLoginLogic {

	/*	private ConfigReader config= new ConfigReader();
	private String serverName;
	
	public String readUsername(String popName) {
		String Username = null;
		if(popName.equalsIgnoreCase("Axis Bank Limited")&&serverName.equalsIgnoreCase("Qa server")) {
			 Username=config.readProperty().getProperty("QaAxisBankUsername");
		}else if (popName.equalsIgnoreCase("NSDL-CRA")&&serverName.equalsIgnoreCase("Qa server")) {
			 Username=config.readProperty().getProperty("QaSuperadminUsername");
		}else if (popName.equalsIgnoreCase("NSDL-CRA")&&serverName.equalsIgnoreCase("Dev server")) {
			Username=config.readProperty().getProperty("devSuperadminUsername");
		}else if (popName.equalsIgnoreCase("Axis Bank Limited")&&serverName.equalsIgnoreCase("Dev server")) {
			Username=config.readProperty().getProperty("devAxisBankUsername");
		}else if(popName.equalsIgnoreCase("Axis Bank Limited")&&serverName.equalsIgnoreCase("Uat server")) {
			Username=config.readProperty().getProperty("UatAxisBankUsername");
		}
		
		return Username;
	}
	
	public String readPassword(String popName) {
		String password = null;
		if(popName.equalsIgnoreCase("Axis Bank Limited")&&serverName.equalsIgnoreCase("Qa server")) {
			password=config.readProperty().getProperty("QaAxisBankpassword");
			
		}else if (popName.equalsIgnoreCase("NSDL-CRA")&&serverName.equalsIgnoreCase("Qa server")) {
			password=config.readProperty().getProperty("QaSuperadminPassword");
		}else if (popName.equalsIgnoreCase("NSDL-CRA")&&serverName.equalsIgnoreCase("Dev server")) {
			password=config.readProperty().getProperty("devSuperadminPassword");
		}else if (popName.equalsIgnoreCase("Axis Bank Limited")&&serverName.equalsIgnoreCase("Dev server")) {
			password=config.readProperty().getProperty("devAxisBankpassword");
		}else if(popName.equalsIgnoreCase("Axis Bank Limited")&&serverName.equalsIgnoreCase("Uat server")) {
			password=config.readProperty().getProperty("UatAxisBankpassword");
		}
		
		return password;
	}
	
	public void applicationURL(String server) {
		serverName = server;
		if(server.equalsIgnoreCase("Qa server")) {
			 Base.getDriver().get(config.readProperty().getProperty("qaUrl"));
		}else if(server.equalsIgnoreCase("Dev server")){
			Base.getDriver().get(config.readProperty().getProperty("devUrl"));
		}else if(server.equalsIgnoreCase("Uat server")) {
			Base.getDriver().get(config.readProperty().getProperty("uatUrl"));
		}
	} */
	
	
}
