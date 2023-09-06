package com.programming.class2.Annotations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {

	@Test

	public void givenObjectSerializedThenTrueReturned() throws IllegalArgumentException, IllegalAccessException {

	Person person = new Person("core", "java","28");

	ObjectToJSONConverter serializer = new ObjectToJSONConverter();

	String jsonString = serializer.convertToJSON(person);

	assertEquals("{\"personAge\":\"28\",\"firstName\":\"Core\","

	+ "\"lastName\":\"Java\"}", jsonString);

	 

	}

}
