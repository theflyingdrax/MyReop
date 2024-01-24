package utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigWriter {

	public void writeRoleCreationDetails(String userRoleName, String ReportingToRole, String roleDescription) {
		Properties prop = new Properties();
		prop.setProperty("userRoleName", userRoleName);
		prop.setProperty("displayName", userRoleName);
		prop.setProperty("ReportingToRole", ReportingToRole);
		prop.setProperty("roleDescription", roleDescription);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\Role_Creation\\Role_Creation.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void writeInfluencerDetails(String influencerEmailAddress, String influencerFirstName,
			String influencerLastName, String influencerMiddleName, String influencerMobileNumber,
			String influencerPanDetails, String popSPRegistrationNumber, String infleuncerAddressLine1,
			String infleuncerAddressLine2, String influencerPinCode, String ifsCode, String accountType,
			String accountNumber, String uploadedDocument) {
		Properties prop = new Properties();
		prop.setProperty("influencerEmailAddress", influencerEmailAddress);
		prop.setProperty("influencerFirstName", influencerFirstName);
		prop.setProperty("influencerMiddleName", influencerMiddleName);
		prop.setProperty("influencerLastName", influencerLastName);
		prop.setProperty("influencerMobileNumber", influencerMobileNumber);
		prop.setProperty("influencerPanDetails", influencerPanDetails);
		prop.setProperty("popSPRegistrationNumber", popSPRegistrationNumber);
		prop.setProperty("infleuncerAddressLine1", infleuncerAddressLine1);
		prop.setProperty("infleuncerAddressLine2", infleuncerAddressLine2);
		prop.setProperty("influencerPinCode", influencerPinCode);
		prop.setProperty("ifsCode", ifsCode);
		prop.setProperty("accountType", accountType);
		prop.setProperty("accountNumber", accountNumber);
		prop.setProperty("uploadedDocument", uploadedDocument);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\Influencer_Creation\\InfluencerData.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void writeAgentDetails(String agentEmailAddress, String agentFirstName, String agentLastName,
			String agentMiddleName, String agentMobileNumber, String agentPanDetails, String popSPRegistrationNumber,
			String infleuncerAddressLine1, String infleuncerAddressLine2, String agentPinCode, String ifsCode,
			String accountType, String accountNumber, String uploadedDocument, String agentCategory) {
		Properties prop = new Properties();
		prop.setProperty("agentEmailAddress", agentEmailAddress);
		prop.setProperty("agentFirstName", agentFirstName);
		prop.setProperty("agentMiddleName", agentMiddleName);
		prop.setProperty("agentLastName", agentLastName);
		prop.setProperty("agentMobileNumber", agentMobileNumber);
		prop.setProperty("agentPanDetails", agentPanDetails);
		prop.setProperty("popSPRegistrationNumber", popSPRegistrationNumber);
		prop.setProperty("infleuncerAddressLine1", infleuncerAddressLine1);
		prop.setProperty("infleuncerAddressLine2", infleuncerAddressLine2);
		prop.setProperty("agentPinCode", agentPinCode);
		prop.setProperty("ifsCode", ifsCode);
		prop.setProperty("accountType", accountType);
		prop.setProperty("accountNumber", accountNumber);
		prop.setProperty("uploadedDocument", uploadedDocument);
		prop.setProperty("agentCategory", agentCategory);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\Agent_Creation\\AgentData.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void storeDiyPersonalDetailsforRI(String subscriberName, String titleValue, String orphanFlag,
			String nameToBePrintedValue, String fatherFirstName, String fatherMiddleName, String fatherLastName,
			String MotherFirstName, String MotherMiddleName, String MotherLastName, String subscriberDob,
			String placeOfBirth, String countryOfBirth, String subscriberGender, String telephoneNumber,
			String maritalStatus, String indianAddressLine, String indianCountry, String indianAddressPincode,
			String indianAddressState, String indianAddressCity, String indianNationality, String occupation,
			String otherOccupationDetails, String pranCardAndKit, String howDidYouHearAboutNps) {
		Properties prop = new Properties();
		prop.setProperty("subscriberName", subscriberName);
		prop.setProperty("titleValue", titleValue);
		prop.setProperty("orphanFlag", orphanFlag);
		prop.setProperty("nameToBePrintedValue", nameToBePrintedValue);
		prop.setProperty("fatherFirstName", fatherFirstName);
		prop.setProperty("fatherMiddleName", fatherMiddleName);
		prop.setProperty("fatherLastName", fatherLastName);
		prop.setProperty("MotherFirstName", MotherFirstName);
		prop.setProperty("MotherMiddleName", MotherMiddleName);
		prop.setProperty("MotherLastName", MotherLastName);
		prop.setProperty("subscriberDob", subscriberDob);
		prop.setProperty("placeOfBirth", placeOfBirth);
		prop.setProperty("countryOfBirth", countryOfBirth);
		prop.setProperty("subscriberGender", subscriberGender);
		prop.setProperty("telephoneNumber", telephoneNumber);
		prop.setProperty("maritalStatus", maritalStatus);
		prop.setProperty("indianAddressLine", indianAddressLine);
		prop.setProperty("indianCountry", indianCountry);
		prop.setProperty("indianAddressPincode", indianAddressPincode);
		prop.setProperty("indianAddressState", indianAddressState);
		prop.setProperty("indianAddressCity", indianAddressCity);
		prop.setProperty("indianNationality", indianNationality);
		prop.setProperty("occupation", occupation);
		prop.setProperty("otherOccupationDetails", otherOccupationDetails);
		prop.setProperty("pranCardAndKit", pranCardAndKit);
		prop.setProperty("howDidYouHearAboutNps", howDidYouHearAboutNps);

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\DIY_Journey\\DiyPersonalDetails.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void storeCaptcha(String captcha) {
		Properties prop = new Properties();
		prop.setProperty("response", captcha);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\DIY_Journey\\Captcha.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void writePranJsonResponse(String response) {
		Properties prop = new Properties();
		prop.setProperty("response", response);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\Physical_Journey\\pranJsonResponse.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void writeUserCreationDetails(String firstName, String middleName, String lastName, String mobileNumber,
			String emailAddress, String employeeId, String popSpRegistartionNumber) {
		Properties prop = new Properties();
		prop.setProperty("firstName", firstName);
		prop.setProperty("middleName", middleName);
		prop.setProperty("lastName", lastName);
		prop.setProperty("mobileNumber", mobileNumber);
		prop.setProperty("emailAddress", emailAddress);
		prop.setProperty("employeeId", employeeId);
		prop.setProperty("popSpRegistartionNumber", popSpRegistartionNumber);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\User_Creation\\User_Creation_Details.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void writeDiyFatcaDetails(String documentEvidence) {
		Properties prop = new Properties();
		prop.setProperty("documentEvidence", documentEvidence);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\DIY_Journey\\DiyFatcaDetails.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void writeDiyRegistrationDetails(String journeyMode, String journeyType, String cutomerType,
			String pancardDetails, String residentalStatus, String mobileNumber, String emailAddress,
			String emailAddGeneratorKey) {
		Properties prop = new Properties();
		prop.setProperty("journeyMode", journeyMode);
		prop.setProperty("journeyType", journeyType);
		prop.setProperty("cutomerType", cutomerType);
		prop.setProperty("pancardDetails", pancardDetails);
		prop.setProperty("residentalStatus", residentalStatus);
		prop.setProperty("mobileNumber", mobileNumber);
		prop.setProperty("emailAddress", emailAddress);
		prop.setProperty("emailAddGeneratorKey", emailAddGeneratorKey);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\DIY_Journey\\DiyRegistrationDetails.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void writeServerAndPOPDetails(String serverUsed, String popDetails, String userRoleDetails) {
		Properties prop = new Properties();
		prop.setProperty("serverUsed", serverUsed);
		prop.setProperty("popDetails", popDetails);
		prop.setProperty("userRoleDetails", userRoleDetails);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\configuration\\ServerUsed.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void writePhysicalJourneySubscriberInitialDetails(String panOrForm60Flag, String residentalStatus,
			String titleValue, String firstName, String middleName, String lastName, String mobileNumber,
			String emailAddress, String orphanFlag, String tierType, String emailAddGeneratorKey,
			String pancardDetails) {
		Properties prop = new Properties();
		prop.setProperty("panOrForm60Flag", panOrForm60Flag);
		prop.setProperty("residentalStatus", residentalStatus);
		prop.setProperty("titleValue", titleValue);
		prop.setProperty("firstName", firstName);
		prop.setProperty("middleName", middleName);
		prop.setProperty("lastName", lastName);
		prop.setProperty("mobileNumber", mobileNumber);
		prop.setProperty("emailAddress", emailAddress);
		prop.setProperty("orphanFlag", orphanFlag);
		prop.setProperty("tierType", tierType);
		prop.setProperty("emailAddGeneratorKey", emailAddGeneratorKey);
		prop.setProperty("pancardDetails", pancardDetails);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\Physical_Journey\\SubscriberInitialDetails.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void writePhysicalJourneySubscriberRegistartionPersonalDetailsForRI(String nameToBePrintedValue,
			String fatherFirstName, String fatherMiddleName, String fatherLastName, String MotherFirstName,
			String MotherMiddleName, String MotherLastName, String subscriberDOB, String placeOfBrith,
			String countryOfBirth, String genderValue, String telephoneNumber, String maritalStatus,
			String spouseFirstName, String spouseMiddleName, String spouseLastName, String indianAddressLine1,
			String indianCountry, String indianPincode, String indianAddressNationality, String poaValue,
			String poaDocNumber, String poaExpriyDate, String otherOccupationDetails, String occupation) {
		Properties prop = new Properties();
		prop.setProperty("nameToBePrintedValue", nameToBePrintedValue);
		prop.setProperty("fatherFirstName", fatherFirstName);
		prop.setProperty("fatherMiddleName", fatherMiddleName);
		prop.setProperty("fatherLastName", fatherLastName);
		prop.setProperty("MotherFirstName", MotherFirstName);
		prop.setProperty("MotherMiddleName", MotherMiddleName);
		prop.setProperty("MotherLastName", MotherLastName);
		prop.setProperty("subscriberDOB", subscriberDOB);
		prop.setProperty("placeOfBrith", placeOfBrith);
		prop.setProperty("countryOfBirth", countryOfBirth);
		prop.setProperty("genderValue", genderValue);
		prop.setProperty("telephoneNumber", telephoneNumber);
		prop.setProperty("maritalStatus", maritalStatus);
		prop.setProperty("spouseFirstName", spouseFirstName);
		prop.setProperty("spouseMiddleName", spouseMiddleName);
		prop.setProperty("spouseLastName", spouseLastName);
		prop.setProperty("indianAddressLine1", indianAddressLine1);
		prop.setProperty("indianCountry", indianCountry);
		prop.setProperty("indianPincode", indianPincode);
		prop.setProperty("indianAddressNationality", indianAddressNationality);
		prop.setProperty("poaValue", poaValue);
		prop.setProperty("poaDocNumber", poaDocNumber);
		prop.setProperty("poaExpriyDate", poaExpriyDate);
		prop.setProperty("poaExpriyDate", otherOccupationDetails);
		prop.setProperty("poaExpriyDate", occupation);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\Physical_Journey\\SubscriberPersonalDetails.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writePhysicalJourneySubscriberRegistartionPersonalDetailsForNRI(String nameToBePrintedValue,
			String fatherFirstName, String fatherMiddleName, String fatherLastName, String MotherFirstName,
			String MotherMiddleName, String MotherLastName, String subscriberDOB, String placeOfBrith,
			String countryOfBirth, String genderValue, String telephoneNumber, String maritalStatus,
			String spouseFirstName, String spouseMiddleName, String spouseLastName,
			String preferredAddressforCommunication, String indianAddressLine1, String indianCountry,
			String indianPincode, String indianAddressNationality, String poaValue, String poaDocNumber,
			String poaExpriyDate, String correspondenceAddressLine1, String correspondenceAddressLine2,
			String correspondenceAddressCountry, String otherOccupationDetails, String occupation) {
		Properties prop = new Properties();
		prop.setProperty("nameToBePrintedValue", nameToBePrintedValue);
		prop.setProperty("fatherFirstName", fatherFirstName);
		prop.setProperty("fatherMiddleName", fatherMiddleName);
		prop.setProperty("fatherLastName", fatherLastName);
		prop.setProperty("MotherFirstName", MotherFirstName);
		prop.setProperty("MotherMiddleName", MotherMiddleName);
		prop.setProperty("MotherLastName", MotherLastName);
		prop.setProperty("subscriberDOB", subscriberDOB);
		prop.setProperty("placeOfBrith", placeOfBrith);
		prop.setProperty("countryOfBirth", countryOfBirth);
		prop.setProperty("genderValue", genderValue);
		prop.setProperty("telephoneNumber", telephoneNumber);
		prop.setProperty("maritalStatus", maritalStatus);
		prop.setProperty("spouseFirstName", spouseFirstName);
		prop.setProperty("spouseMiddleName", spouseMiddleName);
		prop.setProperty("spouseLastName", spouseLastName);
		prop.setProperty("preferredAddressforCommunication", preferredAddressforCommunication);
		prop.setProperty("indianAddressLine1", indianAddressLine1);
		prop.setProperty("indianCountry", indianCountry);
		prop.setProperty("indianPincode", indianPincode);
		prop.setProperty("indianAddressNationality", indianAddressNationality);
		prop.setProperty("poaValue", poaValue);
		prop.setProperty("poaDocNumber", poaDocNumber);
		prop.setProperty("poaExpriyDate", poaExpriyDate);
		prop.setProperty("correspondenceAddressLine1", correspondenceAddressLine1);
		prop.setProperty("correspondenceAddressLine2", correspondenceAddressLine2);
		prop.setProperty("correspondenceAddressCountry", correspondenceAddressCountry);
		prop.setProperty("poaExpriyDate", otherOccupationDetails);
		prop.setProperty("poaExpriyDate", occupation);

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\Physical_Journey\\SubscriberPersonalDetails.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writePhysicalJourneySubscriberRegistartionBankDetailsFor1Nominees(String accountNumber,
			String bankAccountType, String ifscNumber, String uploadDocCount, String t1Nominee1Relationship,
			String t1Nominee1Age, String t1Nominee1MajorMinorFlag, String t1Nominee1FirstName,
			String t1Nominee1MiddleName, String t1Nominee1LastName, String t1Nominee1GuardianFirstName,
			String t1Nominee1GuardianMiddleName, String t1Nominee1GuardianLastName, String t1Nominee1SharePercenetage,
			String t1Nominee1DOB, String t1Nominee1OtherRelationship, String t2Nominee1Relationship,
			String t2Nominee1Age, String t2Nominee1MajorMinorFlag, String t2Nominee1GuardianFirstName,
			String t2Nominee1GuardianMiddleName, String t2Nominee1GuardianLastName, String t2Nominee1FirstName,
			String t2Nominee1MiddleName, String t2Nominee1LastName, String t2Nominee1DOB,
			String t2Nominee1SharePercenetage, String t2Nominee1OtherRelationship) {
		Properties prop = new Properties();
		prop.setProperty("ifscNumber", ifscNumber);
		prop.setProperty("bankAccountType", bankAccountType);
		prop.setProperty("accountNumber", accountNumber);
		prop.setProperty("uploadDocCount", uploadDocCount);
		prop.setProperty("t1Nominee1Relationship", t1Nominee1Relationship);
		prop.setProperty("t1Nominee1Age", t1Nominee1Age);
		prop.setProperty("t1Nominee1MajorMinorFlag", t1Nominee1MajorMinorFlag);
		prop.setProperty("t1Nominee1FirstName", t1Nominee1FirstName);
		prop.setProperty("t1Nominee1MiddleName", t1Nominee1MiddleName);
		prop.setProperty("t1Nominee1LastName", t1Nominee1LastName);
		prop.setProperty("t1Nominee1DOB", t1Nominee1DOB);
		prop.setProperty("t1Nominee1SharePercenetage", t1Nominee1SharePercenetage);
		prop.setProperty("t1Nominee1GuardianFirstName", t1Nominee1GuardianFirstName);
		prop.setProperty("t1Nominee1GuardianMiddleName", t1Nominee1GuardianMiddleName);
		prop.setProperty("t1Nominee1GuardianLastName", t1Nominee1GuardianLastName);
		prop.setProperty("t1Nominee1OtherRelationship", t1Nominee1OtherRelationship);
		prop.setProperty("t2Nominee1Relationship", t2Nominee1Relationship);
		prop.setProperty("t2Nominee1Age", t2Nominee1Age);
		prop.setProperty("t2Nominee1MajorMinorFlag", t2Nominee1MajorMinorFlag);
		prop.setProperty("t2Nominee1FirstName", t2Nominee1FirstName);
		prop.setProperty("t2Nominee1MiddleName", t2Nominee1MiddleName);
		prop.setProperty("t2Nominee1LastName", t2Nominee1LastName);
		prop.setProperty("t2Nominee1DOB", t2Nominee1DOB);
		prop.setProperty("t2Nominee1SharePercenetage", t2Nominee1SharePercenetage);
		prop.setProperty("t2Nominee1GuardianFirstName", t2Nominee1GuardianFirstName);
		prop.setProperty("t2Nominee1GuardianMiddleName", t2Nominee1GuardianMiddleName);
		prop.setProperty("t2Nominee1GuardianLastName", t2Nominee1GuardianLastName);
		prop.setProperty("t2Nominee1OtherRelationship", t2Nominee1OtherRelationship);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\Physical_Journey\\SubscriberBankAndNomineeDetails.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void writePhysicalJourneySubscriberRegistartionBankDetailsFor2Nominees(String accountNumber,
			String bankAccountType, String ifscNumber, String uploadDocCount, String t1Nominee1Relationship,
			String t1Nominee1Age, String t1Nominee1MajorMinorFlag, String t1Nominee1FirstName,
			String t1Nominee1MiddleName, String t1Nominee1LastName, String t1Nominee1GuardianFirstName,
			String t1Nominee1GuardianMiddleName, String t1Nominee1GuardianLastName, String t1Nominee1SharePercenetage,
			String t1Nominee1DOB, String t1Nominee1OtherRelationship, String t2Nominee1Relationship,
			String t2Nominee1Age, String t2Nominee1MajorMinorFlag, String t2Nominee1GuardianFirstName,
			String t2Nominee1GuardianMiddleName, String t2Nominee1GuardianLastName, String t2Nominee1FirstName,
			String t2Nominee1MiddleName, String t2Nominee1LastName, String t2Nominee1DOB,
			String t2Nominee1SharePercenetage, String t2Nominee1OtherRelationship, String t1Nominee2Relationship,
			String t1Nominee2OtherRelationship, String t1Nominee2Age, String t1Nominee2MajorMinorFlag,
			String t1Nominee2DOB, String t1Nominee2GuardianFirstName, String t1Nominee2GuardianMiddleName,
			String t1Nominee2GuardianLastName, String t1Nominee2FirstName, String t1Nominee2MiddleName,
			String t1Nominee2LastName, String t1Nominee2SharePercenetage, String t2Nominee2Relationship,
			String t2Nominee2OtherRelationship, String t2Nominee2Age, String t2Nominee2MajorMinorFlag,
			String t2Nominee2DOB, String t2Nominee2GuardianFirstName, String t2Nominee2GuardianMiddleName,
			String t2Nominee2GuardianLastName, String t2Nominee2FirstName, String t2Nominee2MiddleName,
			String t2Nominee2LastName) {
		Properties prop = new Properties();
		prop.setProperty("ifscNumber", ifscNumber);
		prop.setProperty("bankAccountType", bankAccountType);
		prop.setProperty("accountNumber", accountNumber);
		prop.setProperty("uploadDocCount", uploadDocCount);
		prop.setProperty("t1Nominee1Relationship", t1Nominee1Relationship);
		prop.setProperty("t1Nominee1Age", t1Nominee1Age);
		prop.setProperty("t1Nominee1MajorMinorFlag", t1Nominee1MajorMinorFlag);
		prop.setProperty("t1Nominee1FirstName", t1Nominee1FirstName);
		prop.setProperty("t1Nominee1MiddleName", t1Nominee1MiddleName);
		prop.setProperty("t1Nominee1LastName", t1Nominee1LastName);
		prop.setProperty("t1Nominee1DOB", t1Nominee1DOB);
		prop.setProperty("t1Nominee1SharePercenetage", t1Nominee1SharePercenetage);
		prop.setProperty("t1Nominee1GuardianFirstName", t1Nominee1GuardianFirstName);
		prop.setProperty("t1Nominee1GuardianMiddleName", t1Nominee1GuardianMiddleName);
		prop.setProperty("t1Nominee1GuardianLastName", t1Nominee1GuardianLastName);
		prop.setProperty("t1Nominee1OtherRelationship", t1Nominee1OtherRelationship);
		prop.setProperty("t2Nominee1Relationship", t2Nominee1Relationship);
		prop.setProperty("t2Nominee1Age", t2Nominee1Age);
		prop.setProperty("t2Nominee1MajorMinorFlag", t2Nominee1MajorMinorFlag);
		prop.setProperty("t2Nominee1FirstName", t2Nominee1FirstName);
		prop.setProperty("t2Nominee1MiddleName", t2Nominee1MiddleName);
		prop.setProperty("t2Nominee1LastName", t2Nominee1LastName);
		prop.setProperty("t2Nominee1DOB", t2Nominee1DOB);
		prop.setProperty("t2Nominee1SharePercenetage", t2Nominee1SharePercenetage);
		prop.setProperty("t2Nominee1GuardianFirstName", t2Nominee1GuardianFirstName);
		prop.setProperty("t2Nominee1GuardianMiddleName", t2Nominee1GuardianMiddleName);
		prop.setProperty("t2Nominee1GuardianLastName", t2Nominee1GuardianLastName);
		prop.setProperty("t2Nominee1OtherRelationship", t2Nominee1OtherRelationship);
		prop.setProperty("t1Nominee2Relationship", t1Nominee2Relationship);
		prop.setProperty("t1Nominee2OtherRelationship", t1Nominee2OtherRelationship);
		prop.setProperty("t1Nominee2Age", t1Nominee2Age);
		prop.setProperty("t1Nominee2MajorMinorFlag", t1Nominee2MajorMinorFlag);
		prop.setProperty("t1Nominee2DOB", t1Nominee2DOB);
		prop.setProperty("t1Nominee2GuardianFirstName", t1Nominee2GuardianFirstName);
		prop.setProperty("t1Nominee2GuardianMiddleName", t1Nominee2GuardianMiddleName);
		prop.setProperty("t1Nominee2GuardianLastName", t1Nominee2GuardianLastName);
		prop.setProperty("t1Nominee2FirstName", t1Nominee2FirstName);
		prop.setProperty("t1Nominee2MiddleName", t1Nominee2MiddleName);
		prop.setProperty("t1Nominee2LastName", t1Nominee2LastName);
		prop.setProperty("t1Nominee2SharePercenetage", t1Nominee2SharePercenetage);
		prop.setProperty("t2Nominee2Relationship", t2Nominee2Relationship);
		prop.setProperty("t2Nominee2OtherRelationship", t2Nominee2OtherRelationship);
		prop.setProperty("t2Nominee2Age", t2Nominee2Age);
		prop.setProperty("t2Nominee2MajorMinorFlag", t2Nominee2MajorMinorFlag);
		prop.setProperty("t2Nominee2DOB", t2Nominee2DOB);
		prop.setProperty("t2Nominee2GuardianFirstName", t2Nominee2GuardianFirstName);
		prop.setProperty("t2Nominee2GuardianMiddleName", t2Nominee2GuardianMiddleName);
		prop.setProperty("t2Nominee2GuardianLastName", t2Nominee2GuardianLastName);
		prop.setProperty("t2Nominee2FirstName", t2Nominee2FirstName);
		prop.setProperty("t2Nominee2MiddleName", t2Nominee2MiddleName);
		prop.setProperty("t2Nominee2LastName", t2Nominee2LastName);

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\Physical_Journey\\SubscriberBankAndNomineeDetails.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void writePhysicalJourneySubscriberRegistartionBankDetailsFor3Nominees(String accountNumber,
			String bankAccountType, String t1Nominee1Relationship, String t1Nominee1Age,
			String t1Nominee1MajorMinorFlag, String t1Nominee1FirstName, String t1Nominee1MiddleName,
			String t1Nominee1LastName, String t1Nominee1GuardianFirstName, String t1Nominee1GuardianMiddleName,
			String t1Nominee1GuardianLastName, String t1Nominee1SharePercenetage, String t1Nominee1DOB,
			String t1Nominee1OtherRelationship, String ifscNumber, String uploadDocCount, String t2Nominee1Relationship,
			String t2Nominee1Age, String t2Nominee1MajorMinorFlag, String t2Nominee1GuardianFirstName,
			String t2Nominee1GuardianMiddleName, String t2Nominee1GuardianLastName, String t2Nominee1FirstName,
			String t2Nominee1MiddleName, String t2Nominee1LastName, String t2Nominee1DOB,
			String t2Nominee1SharePercenetage, String t2Nominee1OtherRelationship, String t1Nominee2Relationship,
			String t1Nominee2OtherRelationship, String t1Nominee2Age, String t1Nominee2MajorMinorFlag,
			String t1Nominee2DOB, String t1Nominee2GuardianFirstName, String t1Nominee2GuardianMiddleName,
			String t1Nominee2GuardianLastName, String t1Nominee2FirstName, String t1Nominee2MiddleName,
			String t1Nominee2LastName, String t1Nominee2SharePercenetage, String t2Nominee2Relationship,
			String t2Nominee2OtherRelationship, String t2Nominee2Age, String t2Nominee2MajorMinorFlag,
			String t2Nominee2DOB, String t2Nominee2GuardianFirstName, String t2Nominee2GuardianMiddleName,
			String t2Nominee2GuardianLastName, String t2Nominee2FirstName, String t2Nominee2MiddleName,
			String t2Nominee2LastName, String t1Nominee3Relationship, String t1Nominee3OtherRelationship,
			String t1Nominee3Age, String t1Nominee3MajorMinorFlag, String t1Nominee3DOB,
			String t1Nominee3GuardianFirstName, String t1Nominee3GuardianMiddleName, String t1Nominee3GuardianLastName,
			String t1Nominee3FirstName, String t1Nominee3MiddleName, String t1Nominee3LastName,
			String t1Nominee3SharePercenetage, String t2Nominee3Relationship, String t2Nominee3OtherRelationship,
			String t2Nominee3Age, String t2Nominee3MajorMinorFlag, String t2Nominee3DOB,
			String t2Nominee3GuardianFirstName, String t2Nominee3GuardianMiddleName, String t2Nominee3GuardianLastName,
			String t2Nominee3FirstName, String t2Nominee3MiddleName, String t2Nominee3LastName,
			String numberOfNominee) {
		Properties prop = new Properties();
		prop.setProperty("ifscNumber", ifscNumber);
		prop.setProperty("bankAccountType", bankAccountType);
		prop.setProperty("accountNumber", accountNumber);
		prop.setProperty("uploadDocCount", uploadDocCount);
		prop.setProperty("t1Nominee1Relationship", t1Nominee1Relationship);
		prop.setProperty("t1Nominee1Age", t1Nominee1Age);
		prop.setProperty("t1Nominee1MajorMinorFlag", t1Nominee1MajorMinorFlag);
		prop.setProperty("t1Nominee1FirstName", t1Nominee1FirstName);
		prop.setProperty("t1Nominee1MiddleName", t1Nominee1MiddleName);
		prop.setProperty("t1Nominee1LastName", t1Nominee1LastName);
		prop.setProperty("t1Nominee1DOB", t1Nominee1DOB);
		prop.setProperty("t1Nominee1SharePercenetage", t1Nominee1SharePercenetage);
		prop.setProperty("t1Nominee1GuardianFirstName", t1Nominee1GuardianFirstName);
		prop.setProperty("t1Nominee1GuardianMiddleName", t1Nominee1GuardianMiddleName);
		prop.setProperty("t1Nominee1GuardianLastName", t1Nominee1GuardianLastName);
		prop.setProperty("t1Nominee1OtherRelationship", t1Nominee1OtherRelationship);
		prop.setProperty("t2Nominee1Relationship", t2Nominee1Relationship);
		prop.setProperty("t2Nominee1Age", t2Nominee1Age);
		prop.setProperty("t2Nominee1MajorMinorFlag", t2Nominee1MajorMinorFlag);
		prop.setProperty("t2Nominee1FirstName", t2Nominee1FirstName);
		prop.setProperty("t2Nominee1MiddleName", t2Nominee1MiddleName);
		prop.setProperty("t2Nominee1LastName", t2Nominee1LastName);
		prop.setProperty("t2Nominee1DOB", t2Nominee1DOB);
		prop.setProperty("t2Nominee1SharePercenetage", t2Nominee1SharePercenetage);
		prop.setProperty("t2Nominee1GuardianFirstName", t2Nominee1GuardianFirstName);
		prop.setProperty("t2Nominee1GuardianMiddleName", t2Nominee1GuardianMiddleName);
		prop.setProperty("t2Nominee1GuardianLastName", t2Nominee1GuardianLastName);
		prop.setProperty("t2Nominee1OtherRelationship", t2Nominee1OtherRelationship);
		prop.setProperty("t1Nominee2Relationship", t1Nominee2Relationship);
		prop.setProperty("t1Nominee2OtherRelationship", t1Nominee2OtherRelationship);
		prop.setProperty("t1Nominee2Age", t1Nominee2Age);
		prop.setProperty("t1Nominee2MajorMinorFlag", t1Nominee2MajorMinorFlag);
		prop.setProperty("t1Nominee2DOB", t1Nominee2DOB);
		prop.setProperty("t1Nominee2GuardianFirstName", t1Nominee2GuardianFirstName);
		prop.setProperty("t1Nominee2GuardianMiddleName", t1Nominee2GuardianMiddleName);
		prop.setProperty("t1Nominee2GuardianLastName", t1Nominee2GuardianLastName);
		prop.setProperty("t1Nominee2FirstName", t1Nominee2FirstName);
		prop.setProperty("t1Nominee2MiddleName", t1Nominee2MiddleName);
		prop.setProperty("t1Nominee2LastName", t1Nominee2LastName);
		prop.setProperty("t1Nominee2SharePercenetage", t1Nominee2SharePercenetage);
		prop.setProperty("t2Nominee2Relationship", t2Nominee2Relationship);
		prop.setProperty("t2Nominee2OtherRelationship", t2Nominee2OtherRelationship);
		prop.setProperty("t2Nominee2Age", t2Nominee2Age);
		prop.setProperty("t2Nominee2MajorMinorFlag", t2Nominee2MajorMinorFlag);
		prop.setProperty("t2Nominee2DOB", t2Nominee2DOB);
		prop.setProperty("t2Nominee2GuardianFirstName", t2Nominee2GuardianFirstName);
		prop.setProperty("t2Nominee2GuardianMiddleName", t2Nominee2GuardianMiddleName);
		prop.setProperty("t2Nominee2GuardianLastName", t2Nominee2GuardianLastName);
		prop.setProperty("t2Nominee2FirstName", t2Nominee2FirstName);
		prop.setProperty("t2Nominee2MiddleName", t2Nominee2MiddleName);
		prop.setProperty("t2Nominee2LastName", t2Nominee2LastName);
		prop.setProperty("t1Nominee3Relationship", t1Nominee3Relationship);
		prop.setProperty("t1Nominee3OtherRelationship", t1Nominee3OtherRelationship);
		prop.setProperty("t1Nominee3Age", t1Nominee3Age);
		prop.setProperty("t1Nominee3MajorMinorFlag", t1Nominee3MajorMinorFlag);
		prop.setProperty("t1Nominee3DOB", t1Nominee3DOB);
		prop.setProperty("t1Nominee3GuardianFirstName", t1Nominee3GuardianFirstName);
		prop.setProperty("t1Nominee3GuardianMiddleName", t1Nominee3GuardianMiddleName);
		prop.setProperty("t1Nominee3GuardianLastName", t1Nominee3GuardianLastName);
		prop.setProperty("t1Nominee3FirstName", t1Nominee3FirstName);
		prop.setProperty("t1Nominee3MiddleName", t1Nominee3MiddleName);
		prop.setProperty("t1Nominee3LastName", t1Nominee3LastName);
		prop.setProperty("t1Nominee3SharePercenetage", t1Nominee3SharePercenetage);
		prop.setProperty("t2Nominee3Relationship", t2Nominee3Relationship);
		prop.setProperty("t2Nominee3OtherRelationship", t2Nominee3OtherRelationship);
		prop.setProperty("t2Nominee3Age", t2Nominee3Age);
		prop.setProperty("t2Nominee3MajorMinorFlag", t2Nominee3MajorMinorFlag);
		prop.setProperty("t2Nominee3DOB", t2Nominee3DOB);
		prop.setProperty("t2Nominee3GuardianFirstName", t2Nominee3GuardianFirstName);
		prop.setProperty("t2Nominee3GuardianMiddleName", t2Nominee3GuardianMiddleName);
		prop.setProperty("t2Nominee3GuardianLastName", t2Nominee3GuardianLastName);
		prop.setProperty("t2Nominee3FirstName", t2Nominee3FirstName);
		prop.setProperty("t2Nominee3MiddleName", t2Nominee3MiddleName);
		prop.setProperty("t2Nominee3LastName", t2Nominee3LastName);
		prop.setProperty("numberOfNominee", numberOfNominee);

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\Physical_Journey\\SubscriberBankAndNomineeDetails.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void writePhysicalJourneySubscriberRegistartionDetails(String journeyType, String journeyMode,
			String cutomerType) {
		Properties prop = new Properties();
		prop.setProperty("journeyType", journeyType);
		prop.setProperty("journeyMode", journeyMode);
		prop.setProperty("cutomerType", cutomerType);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\Physical_Journey\\SubscriberRegistartionDetails.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeDiyJourneyBankDetailsFor1Nominees(String accountNumber,
			String bankAccountType, String ifscNumber, String uploadDocCount, String t1Nominee1Relationship,
			String t1Nominee1Age, String t1Nominee1MajorMinorFlag, String t1Nominee1FirstName,
			String t1Nominee1MiddleName, String t1Nominee1LastName, String t1Nominee1GuardianFirstName,
			String t1Nominee1GuardianMiddleName, String t1Nominee1GuardianLastName, String t1Nominee1SharePercenetage,
			String t1Nominee1DOB, String t1Nominee1OtherRelationship, String t2Nominee1Relationship,
			String t2Nominee1Age, String t2Nominee1MajorMinorFlag, String t2Nominee1GuardianFirstName,
			String t2Nominee1GuardianMiddleName, String t2Nominee1GuardianLastName, String t2Nominee1FirstName,
			String t2Nominee1MiddleName, String t2Nominee1LastName, String t2Nominee1DOB,
			String t2Nominee1SharePercenetage, String t2Nominee1OtherRelationship) {
		Properties prop = new Properties();
		prop.setProperty("ifscNumber", ifscNumber);
		prop.setProperty("bankAccountType", bankAccountType);
		prop.setProperty("accountNumber", accountNumber);
		prop.setProperty("uploadDocCount", uploadDocCount);
		prop.setProperty("t1Nominee1Relationship", t1Nominee1Relationship);
		prop.setProperty("t1Nominee1Age", t1Nominee1Age);
		prop.setProperty("t1Nominee1MajorMinorFlag", t1Nominee1MajorMinorFlag);
		prop.setProperty("t1Nominee1FirstName", t1Nominee1FirstName);
		prop.setProperty("t1Nominee1MiddleName", t1Nominee1MiddleName);
		prop.setProperty("t1Nominee1LastName", t1Nominee1LastName);
		prop.setProperty("t1Nominee1DOB", t1Nominee1DOB);
		prop.setProperty("t1Nominee1SharePercenetage", t1Nominee1SharePercenetage);
		prop.setProperty("t1Nominee1GuardianFirstName", t1Nominee1GuardianFirstName);
		prop.setProperty("t1Nominee1GuardianMiddleName", t1Nominee1GuardianMiddleName);
		prop.setProperty("t1Nominee1GuardianLastName", t1Nominee1GuardianLastName);
		prop.setProperty("t1Nominee1OtherRelationship", t1Nominee1OtherRelationship);
		prop.setProperty("t2Nominee1Relationship", t2Nominee1Relationship);
		prop.setProperty("t2Nominee1Age", t2Nominee1Age);
		prop.setProperty("t2Nominee1MajorMinorFlag", t2Nominee1MajorMinorFlag);
		prop.setProperty("t2Nominee1FirstName", t2Nominee1FirstName);
		prop.setProperty("t2Nominee1MiddleName", t2Nominee1MiddleName);
		prop.setProperty("t2Nominee1LastName", t2Nominee1LastName);
		prop.setProperty("t2Nominee1DOB", t2Nominee1DOB);
		prop.setProperty("t2Nominee1SharePercenetage", t2Nominee1SharePercenetage);
		prop.setProperty("t2Nominee1GuardianFirstName", t2Nominee1GuardianFirstName);
		prop.setProperty("t2Nominee1GuardianMiddleName", t2Nominee1GuardianMiddleName);
		prop.setProperty("t2Nominee1GuardianLastName", t2Nominee1GuardianLastName);
		prop.setProperty("t2Nominee1OtherRelationship", t2Nominee1OtherRelationship);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\dataFiles\\DIY_Journey\\DiyBankDetails.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.store(fos, null);
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
