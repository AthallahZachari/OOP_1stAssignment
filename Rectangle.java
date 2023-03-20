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
public class Rectangle extends ParentFigure implements CalculateFlatField{
    
    public Rectangle(String name, double height){
        this.name = name;
        this.height = height;
    }
    @Override
    public void printData(){
        System.out.println("\nFigure : "+this.name+"\nSide : "+this.height);
    }
    
    @Override
    public void calcArea(){
        super.sumArea = height * height;
        System.out.println("Area = "+super.sumArea);
    }
    @Override
    public void calcCircumference(){
        super.sumCircum = height * 4;
        System.out.println("Circumference = "+super.sumCircum);
    }
}
