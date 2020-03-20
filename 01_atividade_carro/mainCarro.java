package Atividades;

import java.util.Scanner;

public class mainCarro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Carro carro = new Carro();
		System.out.println("Digite embarcar, abastecer_qtd, dirigir_qtd");
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("embarcar")){
				carro.embarcar();
			}else if(ui[0].equals("abastecer")){
				float combustivel = Float.parseFloat(ui[1]);
				carro.abastecer(combustivel);
			}else if(ui[0].equals("dirigir")){
				float distancia = Float.parseFloat(ui[1]);
				carro.dirigir(distancia);
			}else {
				System.out.println("Comando Invalido");
			}
		}
		scanner.close();
		

	}

}
