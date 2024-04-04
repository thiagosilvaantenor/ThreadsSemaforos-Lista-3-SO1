package view;

import java.util.Scanner;
import java.util.concurrent.Semaphore;
import controller.CarroController;
import controller.PessoasCorredorController;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, digite qual exercicio quer ver:"
				+ "\n 1"
				+ "\n 2"
				+ "\n 9 - Sair");
		int opc = sc.nextInt();
		while(opc != 9){
			switch(opc) {
			case 1:
				Semaphore semaforo1 = new Semaphore(1);
				for (int i = 1; i <= 4; i++) {
					CarroController carro = new CarroController(i, semaforo1);
					carro.start();
				}
			break;
			case 2:
				Semaphore semaforo2 = new Semaphore(1);
				for(int i = 1; i <= 4; i++) {
					PessoasCorredorController p = new PessoasCorredorController(semaforo2,i,i);
					p.start();
				}
			break;
			case 9:
				sc.close();
				break;
			}
		}

	}

}
