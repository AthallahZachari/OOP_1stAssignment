/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculate;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Beam beam = new Beam("Beam", 10, 6, 4);
        beam.printData();
        beam.calcVolume();
        beam.calcSurfArea();
        
        Rectangle rectangle = new Rectangle("Rectangle", 5);
        rectangle.printData();
        rectangle.calcArea();
        rectangle.calcCircumference();
        
        Circle circle = new Circle("Circle", 8, Circle.pi);
        circle.printData();
        circle.calcArea();
        circle.calcCircumference();
        
        Cylinder cylinder = new Cylinder("Cylinder", 10, Cylinder.pi, 8);
        cylinder.printData();
        cylinder.calcVolume();
        cylinder.calcSurfArea();
    }
    
}
