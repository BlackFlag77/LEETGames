package com.forum;

public class ForumValidations {
	public static boolean titleValidation(String title){
		boolean validate = false;
		
		try {
			if (title.length() <= 15) {
				validate = true;
			} else {
				validate = false;				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return validate;
	}
}