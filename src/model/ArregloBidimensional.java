package model;

public class ArregloBidimensional {
private double matrizA[][];

public double[][] getMatrizA() {
	return matrizA;
}

public void setMatrizA(double[][] matrizA) {
	this.matrizA = matrizA;
}



public ArregloBidimensional(double[][] matrizA) {
	super();
	this.matrizA = matrizA;
}

public double[][] sumar (double matrizB[][]) {
	int filas =matrizB.length;
	int columnas=matrizB[0].length;
	double[][] resultado = new double[filas][columnas];
	for (int i=0; i<filas;i++) {
		System.out.println();
		for (int j=0;j<columnas ;j++) {
			resultado[i][j]=matrizA[i][j] + matrizB[i][j];
			System.out.print(resultado[i][j]+" ");
			
		}
	
	}

	return resultado;
	
} 

public double[][] restar (double matrizB[][]) {
	int filas =matrizB.length;
	int columnas=matrizB[0].length;
	double[][] resultado = new double[filas][columnas];
	for (int i=0; i<filas;i++) {
		System.out.println();
		for (int j=0;j<columnas ;j++) {
			resultado[i][j]=matrizA[i][j] - matrizB[i][j];
			System.out.print(resultado[i][j]+" ");
			
		}
	
	}

	return resultado;
	
} 
public double[][] traspuesta(){
	int filas =matrizA.length;
	int columnas=matrizA[0].length;
	double[][] resultado = new double[filas][columnas];

	for (int i=0; i<filas;i++) {
		System.out.println();
		for (int j=0;j<columnas ;j++) {
			resultado[j][i]=matrizA[j][i];
			System.out.print(resultado[j][i]+" ");
		}
	
	}
	return resultado;
	}


public double[][] multiplicar1(double numero){
	
	int filas =matrizA.length;
	int columnas=matrizA[0].length;
	double[][] resultado = new double[filas][columnas];
	for (int i=0; i<filas;i++) {
		System.out.println();
		for (int j=0;j<columnas ;j++) {
			resultado[i][j]=numero* matrizA[i][j];
			System.out.print(resultado[i][j]+" ");
		}
	}
	
	return resultado;
}
public double[][] multiplicarzXm(double [][]matrizB){
	
	int filas =matrizA.length;
	int columnas=matrizA[0].length;
	double[][] resultado = new double[filas][columnas];
	for (int i=0; i<filas;i++) {
		System.out.println();
		for (int j=0;j<columnas ;j++) {
			resultado[i][j]=matrizB[i][j]* matrizA[i][j];
			System.out.print(resultado[i][j]+" ");
		}
	}
	return resultado;
}

public void multiplicar(double numero) {
	// TODO Auto-generated method stub
	
}
}