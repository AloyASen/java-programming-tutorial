

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aloy Sen
 */
public class staff {
    int id;
    String name;
    int sal;
    public staff(int i,String s,manager ob) {
        id=i;
        ob.setid(id);
        name=s;
        ob.setname();
        //now let the manager calculate the salary and hand it over to staff
        ob.cal();
        
    }

    
    
    
    
    public void display(){
        System.out.println(id+"......"+name+""+sal);
    }
    
            
    
}
