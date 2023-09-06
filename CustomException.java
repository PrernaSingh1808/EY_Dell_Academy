package com.programming.class2;

class InvalidAgeException extends Exception {
	
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String message){
		super(message);
	}
}

public class CustomException {
	public static void main(String[] args) {
		try {
			ValidVoterStatus(17);
			
		}catch (InvalidAgeException e) {
			System.out.println("Exception Message is " + e.getMessage());
		}
		System.out.println("Code will run smoothly");
		
	}
	
	static void ValidVoterStatus(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("User Cannot Vote");
		}
	}

}
