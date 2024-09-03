package test;

import model.ArregloBidimensional;

public class Test {

	public static void main(String[] args) {
		
	 double[][] arr= {{1,1,2},{1,1,2},{2,2,2}};
	 double[][] arr2= {{1,1,2},{1,1,2},{2,2,2}};
	 
			ArregloBidimensional a=new 	ArregloBidimensional(arr);
			ArregloBidimensional a1=new ArregloBidimensional(arr);
			ArregloBidimensional a2=new ArregloBidimensional(arr2);
		System.out.println("--------------------SUMAR-----------------------");
		 a1.sumar(arr2);
		 System.out.println("\n---------------------RESTAR------------------");
		 a1.restar(arr2);
		 System.out.println("\n------------TRASPUESTA-----------------------");
		 a1.traspuesta();
		 System.out.println("\n------------MULTIPLICA X ESCALAR-------------");
		 a2.multiplicar1(3.2);
		 System.out.println("\n------------MULTIPLICA X MATRIZ--------------");
		 a2.multiplicarzXm(arr2);
}	
	
}