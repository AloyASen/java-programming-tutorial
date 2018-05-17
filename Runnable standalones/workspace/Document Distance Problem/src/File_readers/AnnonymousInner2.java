//Program of annonymous inner class by abstract class

abstract class Person{  
	  abstract void eat();  
}  
class AnnonymousInner2{  
	 public static void main(String args[]){  
Person p=new Person(){  
						void eat(){System.out.println("nice fruits");}  
 					 };  
	  
	  p.eat();  
 }  
}  
