package com.programming.class2.Annotations;

public class MethodReferenceExample {
    @FunctionalInterface

    public static interface Converter<F,T>
    {
    	T convert(F from);

    }

    public static void main(String[] args) {

        Converter<String,Integer> intConverter =(from) -> Integer.valueOf(from);

        Integer convertedValue = intConverter.convert("123");

        System.out.println("Integer Value is : "+convertedValue);

        //Doing same thing with the help of Method Reference

        Converter<String,Integer> intConverter2 = Integer::valueOf;

        Integer convertedValue2 = intConverter2.convert("456");

        System.out.println("Integer Value is : "+convertedValue2);

        

        StartingAtAlphabet obj =new StartingAtAlphabet();

        Converter<String,String> strCon = obj ::startWith ;

        String value = strCon.convert("Java");

        System.out.println(value);

        PersonFactor<Person23> personObject = Person23::new;

        Person23 person = personObject.create("core","Java");

        System.out.println("Person name is "+person.fname+" "+person.lname);

    

    }

    static class StartingAtAlphabet

    {

        String startWith(String str)

        {

            return String.valueOf(str.charAt(0));

        }

    }

    interface PersonFactor<P extends Person23>{
    	P create(String fname,String lname);
    	}
    }
class Person23
{
	String fname;
	String lname;
	public Person23() {}
	public Person23(String fname,String lname)
	{
		this.fname=fname;
        this.lname=lname;
        }

}