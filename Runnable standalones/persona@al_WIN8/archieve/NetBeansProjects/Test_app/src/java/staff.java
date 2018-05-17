

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aloy Sen
 */
public abstract class staff implements manager{
    int id;
    String name;
    int sal;
    public staff(int i,String s) {
        id=i;
        
        name=s;
        
    }

    
    
    
    
    public void display(){
        System.out.println(id+"......"+name+""+sal);
    }
    public static void main(String[] args)
    {
        staff s= new staff(1,"rem");
        s.display();
    }
            
    
}
