package com.company;

import java.util.Scanner;

class QuadraticEquation{
    private double a,b,c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        if(getDiscriminant()<0) return 0;
        return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public double getRoot2(){
        if(getDiscriminant()<0) return 0;
        return (-b-Math.sqrt(b*b-4*a*c))/(2*a);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double delta = equation.getDiscriminant();
        if(delta>0) System.out.println("The equation has two roots "+equation.getRoot1()+" and "+equation.getRoot2());
        else if(delta == 0 ) System.out.println("The equation has one root: "+equation.getRoot1());
        else System.out.println("The equation has no real roots");
    }
}
