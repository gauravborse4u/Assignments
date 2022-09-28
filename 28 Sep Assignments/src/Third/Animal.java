package Third;

class Fruits{  
String fr_name="Apple";  
}  
class Watermelon extends Fruits{  
String fr_name="Watermelon";  
void printColor(){  
	System.out.println("This is fruit from Child Class : " + fr_name);  
	System.out.println("This is fruit from Parent Class : " + super.fr_name);  
}  
}  
class Test{  
public static void main(String args[]){  
	Watermelon f1=new Watermelon();  
	f1.printColor();  
}
}  