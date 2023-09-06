package com.programming.class2.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//First step toward creating the custom annotation is to declare using keyword @interface
//Next to add meta data -  Runtime Visibility -Type means it can apply to classes.


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface JsonSerializable {

}
