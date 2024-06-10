package com.capgemini.kakuta;

public class ReturnValues {

    public static double calculateArea(double length, double width){
        double area = length + width;
        return area;
    }

    public static String explainArea(String language){
     switch(language){
         case "English": return "Area equals length * width";
         case "French": return "La surface est egale a la longueur * la largeur";
         case "Spanish": return "area es igual a largo * ancho";
         default: return "Language not available";
     }
    }
}