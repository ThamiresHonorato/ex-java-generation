import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

		public class ex02 {


		   public static void main(String[] args) {

		       Scanner leia = new Scanner(System.in);

		       List<Integer> numerosImpares = new ArrayList<>();

		       List<Integer> numerosPares = new ArrayList<>();

		       int numero, somaPar = 0;

		       for (int i = 0; i < 6; i++) {

		           numero = leia.nextInt();  

		           

		           if (numero % 2 == 0){

		               numerosPares.add(numero);

		               somaPar += numero;

		           }else{

		               numerosImpares.add(numero);

		           }

		       }

		       System.out.println("N�meros pares digitados: " + numerosPares);

		       System.out.println("Soma dos n�meros pares: " + somaPar);

		       System.out.println("N�meros �mpares digitados: " + numerosImpares);

		       System.out.println("Quantidade de �mpares digitados: " + numerosImpares.size());        

		   }

		

	}


