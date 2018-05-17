package jdbcdemo;

import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
			Operation o=new  Operation();
			//System.out.println("no of row(s) inserted is"+o.insertValue());
			System.out.println("no of rows modified"+o.update());
			ResultSet r=o.fetchAll();
			System.out.println("name-----mail----------add");
			try{
			while(r.next()){
				System.out.println(r.getString(1)+"-----"+r.getString("smail")+"----------"+r.getString(3));
				
				
				
			}
			}catch(Exception e){
				e.printStackTrace();
			}

	}

}
