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
public class Cylinder extends ParentFigure implements CalculateSpace{
    static double pi = 3.14;
    public double radius = 0;
    
    public Cylinder(String name, double height, double pi, double radius){
        this.name = name;
        Cylinder.pi = pi;
        this.radius = radius;
        super.height = height;
    }
    @Override
    public void printData(){
        System.out.println(
                "\nFigure : "+this.name+"\nHeight : "
                 +this.height+"\nRadius : "+radius+"\nPi : "+pi);
    }
    @Override
    public void calcVolume(){
        super.sumVolume = pi * radius * radius * height;
        System.out.println("Volume : "+sumVolume);
    }
    @Override
    public void calcSurfArea(){
        super.sumArea = ((pi*radius*radius)*2)+2*pi*radius*height;
        System.out.println("Surface area : "+sumArea);
    }
    
}
