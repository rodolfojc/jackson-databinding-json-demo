package com.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			//CREATE OBJECT MAPPER
			ObjectMapper mapper = new ObjectMapper();
			
			//READ JSON FILE AND MAP / CONVERT TO JAVA POJO DATA/SAMPLE-LITE.JSON
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//PRINT FIRST NAME AND LASTNAME
			System.out.println("First name = " + theStudent.getFirstName());
			System.out.println("Last name = " + theStudent.getLastName());
			
			//PRINT ADDRESS
			Address tempAddress = theStudent.getAddress();
			System.out.println("Street = " + tempAddress.getStreet());
			System.out.println("City = " + tempAddress.getCity());
			
			//PRINT LANGUAGES
			for (String tempLang : theStudent.getLanguages()) {
				System.out.println(tempLang);
			}	
			
			
		}catch (Exception exc) {
			exc.printStackTrace();
		}
		

	}

}
