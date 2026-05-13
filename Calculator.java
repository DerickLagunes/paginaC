class Calculator{

	//1. Atributos de la clase

	//2. Metodos de la clase
	public double sumar(double n1, double n2){
		return n1 + n2;
	} 

	public double restar(double n1, double n2){
		return n1 - n2;
	}

	public double multiplicar(double n1, double n2){
		return n1 * n2;
	}

	public double dividir(double n1, double n2){
		if(n2 != 0){
			return n1 / n2;
		}else{
			System.out.println("no puedes imprimir entre 0");
			return 0;
		}
	}

	public String imprimirResultado(double res){
		return "El resultado es: "+ res;
	}

	//2.1 Metodo psvm <-- si ejecutamos
	public static void main(String [] args){
		Calculator calcu = new Calculator();
		double resSuma = calcu.sumar(9,5);
		System.out.println(calcu.imprimirResultado(resSuma));
	}
}