class Calculadora {

	public static float sumar(float n1, float n2){
		float resultado = n1 + n2;
		System.out.println("El resultado es: " + resultado);
		return resultado;
	}

	public static float restar(float n1, float n2){
		float resultado = n1 - n2;
		System.out.println("El resultado es: " + resultado);
		return resultado;
	}

	public static float multiplicar(float n1, float n2){
		float resultado = n1 * n2;
		System.out.println("El resultado es: " + resultado);
		return resultado;
	}	

	public static float dividir(float n1, float n2){
		if(n2 == 0){
			System.out.println("No puedes hacer eso");
			return 0;
		} else {
			float resultado = n1 / n2;
			System.out.println("El resultado es: " + resultado);
			return resultado;
		}

	}

	//PSVM
	public static void main(String[] args){
		sumar(8,5);
		restar(200,89);
		multiplicar(9,88);
		dividir(9,0);
		dividir(81,9);
	}


}