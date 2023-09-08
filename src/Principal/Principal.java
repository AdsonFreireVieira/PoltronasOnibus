package Principal;

import java.util.Scanner;

import Cliente.Cliente;
import Poltrona.Poltronas;

public class Principal {

	public static String JanelaCorredor(int pol) {

		if (pol % 2 == 0) {

			 return "Corredor";

		} else {

			return  "Janela";
		}

	}

	public static void main(String[] args) {
        Poltronas poltr= new Poltronas();
        
		Poltronas[] pol = new Poltronas[44];
		Cliente  [] cliente  = new Cliente[44];
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos Cadastro Deseja");
		double totalCadastro = teclado.nextInt();
	
		
		  for(int i=0; i<=totalCadastro;i++){
			  
			  System.out.println("Cadastro " + i );
			  
			  System.out.println("Digite Nome");
			  String nome = teclado.next();
			  
			  System.out.println("Digite Cidade");
			  String cidade = teclado.next();
			  
			  System.out.println("Digite Idade");
			  int idade = teclado.nextInt();
			  
			  
	         cliente[i] = new Cliente(nome,cidade, idade);
		   
			  System.out.println(" Numero Poltrona");

	          int poltrona = teclado.nextInt();
	       
	          String lugar =JanelaCorredor(poltrona);
	     pol[i] = new Poltronas(poltrona, lugar, cliente[i]);
	      
		}
		  
		  for(Poltronas polt : pol) {
			  System.out.println(polt);
		  }
	}

}
