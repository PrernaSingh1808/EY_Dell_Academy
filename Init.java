package com.programming.class2.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Another Method Level Annotation
//Let's imagine before serializing the object to a JSON String
//we want to execute one method to initialize an object.

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)


public @interface Init {

}
