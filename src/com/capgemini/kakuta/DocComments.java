package com.capgemini.kakuta;

public class DocComments {
    public static void main(String[] args) {
    }

    /**
     * Function name: greet
     *
     * Inside the function:
     *  1.prints: "Hi"
     *
     * */
    public static void greet(){
        System.out.println("Hi");
    }

    /**
     * Function name: printText
     * @param name (String)
     * @param age (String)
     */
    public static void printText(String name, String age){
        System.out.println("Hi, I'm " + name + " and I'm " + age + "years old.");
    }
}
