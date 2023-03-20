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
public class ParentFigure {
    public String name = "";
    public double height = 0;
    public double sumArea = 0;
    public double sumCircum = 0;
    public double sumVolume = 0;
    
    public ParentFigure(){}
    
    public void setName(String name){
        this.name = name;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void printData(){
        System.out.println("Figure : "+this.name+", Height : "+this.height);
    }
}
