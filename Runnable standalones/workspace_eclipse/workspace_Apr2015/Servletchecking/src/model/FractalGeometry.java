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
public abstract class FractalGeometry implements Asansol_ground_map{
    
    public int zoomin(int level) {
        
        return (level+20);
    }

    public int zoomout(int level) {
        return (level+20);
    }

    public void detail_per_level(int level) {
        
    }
    
    
}