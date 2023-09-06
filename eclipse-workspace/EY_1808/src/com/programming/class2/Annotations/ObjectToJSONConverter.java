package com.programming.class2.Annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ObjectToJSONConverter {
	
	public String convertToJSON(Object obj) {
		try {
			CheckIfSerializable(obj);
			intializeObject(obj);
			return getJsonString(obj);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	private void CheckIfSerializable(Object obj) throws JsonSerializableException{
		if(Objects.isNull(obj)) {
			throw new JsonSerializableException("Can't serialize null Object");
		}
		
		Class<?> clazz = obj.getClass();
		if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
			throw new JsonSerializableException("This Class" + " is not annotated with" + "Json Serializable Annotation");
		}
	}
	
	private void intializeObject(Object object) throws IllegalAccessException, InvocationTargetException {
		Class<?> clazz = object.getClass();
		for(Method method: clazz.getDeclaredMethods()) {
			method.setAccessible(true);
			method.invoke(object);
		}
		}
	
	private String getJsonString(Object object) {
		Class<?> clazz = object.getClass();
		Map<String, String> jsonElementsMap = new HashMap<>();
		for(Field field : clazz.getDeclaredFields()) {
			field.setAccessible(true);
			if(field.isAnnotationPresent(JsonElement.class)) {
				jsonElementsMap.put(getKey(field), (String) field.get(object));
			}
		}
		
		String jsonString = jsonElementsMap.entrySet()
				.stream()
				.map(entry -> "\"" + entry.getKey() + "\": \"" + entry.getValue() + "\"")
				.collect(Collectors.joining(","));
		return "{" + jsonString + "}" ;
		
		}
	private String getKey(Field field) {
		String value = field.getAnnotation(JsonElement.class)
				.key();
		return value.isEmpty() ? field.getName() : value;
		
	}

}
