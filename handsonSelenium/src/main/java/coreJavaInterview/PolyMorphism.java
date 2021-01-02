package coreJavaInterview;

public class PolyMorphism {
	
	
	public static void main(String[] args){
		PolyMorphism obj1 =new PolyMorphism();
		obj1.calcEMI();
		obj1.calcEMI(100);
		obj1.calcEMI(10.0);
		obj1.calcEMI("I have been practising a lot");
		obj1.calcEMI(10,"personal loan");
		obj1.calcEMI("Car Loan", 1);

}

//Method Overloading
//Number of arguments
//Type of arguments
//Order of arguments

public void calcEMI(){
	
	System.out.println("Your EMI Is 10000 INR");
}

public void calcEMI(double tenure){
	System.out.println("Your EMI Is 10000 INR");
}

public void calcEMI(int tenure){
	System.out.println("Your EMI for "+tenure+" years is : 10000 INR");
	
}

public void calcEMI(int tenure , String message){
	
}

public void calcEMI(String message , int tenure){
	
}

public void calcEMI(String message){
	System.out.println("Your EMI is 10000 INR  " + message	);	
}
}
