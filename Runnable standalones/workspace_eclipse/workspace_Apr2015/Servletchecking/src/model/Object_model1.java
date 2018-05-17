/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author students
 */
public class Object_model1 extends FractalGeometry{
    int obj_zoomLevel;

    public Object_model1() {
        obj_zoomLevel=0;
    }
    public void display(){
        System.out.println(obj_zoomLevel);
    }

    public int zoomin() {
        obj_zoomLevel+=20;
        return obj_zoomLevel;
    }

    public int zoomout() {
        if(obj_zoomLevel >20){
            obj_zoomLevel-=20;
            
        }
       return obj_zoomLevel;
    }

    public void detail_per_level() {
        
    }

    
   
    
}
