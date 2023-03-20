/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculate;

public class Beam extends ParentFigure implements CalculateSpace{
    public double length = 0;
    public double lateral = 0;
    public double baseSurf = 0;
    public double heightSurf = 0;
    
    public Beam(String name, double length, double height, double lateral){
        this.name = name;
        this.height = height;
        this.length = length;
        this.lateral = lateral;
    }
    
    @Override
    public void printData(){
        System.out.println(
            "\nFigure : "+this.name+"\nHeight : "+this.height+
            "\nlength : "+this.length+"\nLateral : "+this.lateral
        );
    }
    @Override
    public void calcVolume(){
        super.sumVolume = length * height * lateral;
        System.out.println("Volume : "+sumVolume);
    }
    @Override
    public void calcSurfArea(){
        super.sumArea = ((length*height)*2)+((length*lateral)*2)+((height*lateral)*2);
        System.out.println("Surface area : "+sumArea);
    }
    
}
