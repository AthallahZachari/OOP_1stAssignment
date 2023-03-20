/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculate;

/**
 *
 * @author MI BAITURRAHMAN
 */
public class Circle extends ParentFigure implements CalculateFlatField{
    static double pi = 3.14;
    
    public Circle(String name, double radius, double pi){
        this.name = name;
        this.height = radius;
        Circle.pi = pi;
    }
    @Override
    public void printData(){
        System.out.println("\nFigure: "+this.name+"\nRadius : "+this.height+"\npi : "+Circle.pi);
    }
    @Override
    public void calcArea(){
        super.sumArea = pi * height * height;
        System.out.println("Area = "+super.sumArea);
    }
    @Override
    public void calcCircumference(){
        super.sumCircum = 2*pi*height ;
        System.out.println("Circumference = "+super.sumCircum);
    }
}
