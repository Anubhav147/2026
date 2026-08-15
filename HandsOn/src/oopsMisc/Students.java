package oopsMisc;

public class Students implements Cloneable{
	
	 int id;
	 String name;
	
	Students(int i, String n){
		this.id=i;
		this.name=n;
	}
	
	// Overriding clone() method  
    public Object clone() throws CloneNotSupportedException {  
        return super.clone();  
    } 

}
