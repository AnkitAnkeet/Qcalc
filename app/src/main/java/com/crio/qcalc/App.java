package com.crio.qcalc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }
    
 public static void main(String[] args) {

    System.out.println(new App().getGreeting());

    ScientificCalculator calc = new ScientificCalculator();

    double result= calc.cubeOf(4.0);

    System.out.println("cube =" + result);
    


    System.out.println(new App().getGreeting());


      result = (int) calc.modulo(5, 2);

    System.out.println("modulo ="+ result);

}



 }   


