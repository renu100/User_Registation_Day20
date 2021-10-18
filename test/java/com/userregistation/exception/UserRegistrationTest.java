package com.userregistation.exception;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();

	// Test case for valid first name
	@Test
	public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Renu");
		Assert.assertEquals(true, result);
	}

	// Test case for invalid first name
	@Test
	public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
		boolean result = userRegistration.firstName("renu");
		Assert.assertEquals(false, result);
	}

	// Test case for valid last name
	@Test
	public void givenLastName_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Chandraker");
		Assert.assertEquals(true, result);
	}

	// Test case for invalid last name
	@Test
	public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("chandraker");
		Assert.assertEquals(false, result);

	}

	// Test case for valid Email address
	@Test
	public void givenEmail_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.emailAddress("abc@gmail.com");
		Assert.assertEquals(true, result);
	}

	// Test case for invalid Email address
	@Test
	public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.emailAddress("abc()*gmail.com");
		Assert.assertEquals(false, result);
	}

}