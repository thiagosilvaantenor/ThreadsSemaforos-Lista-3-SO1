package view;

import java.util.concurrent.Semaphore;
import controller.CarroController;

public class Cruzamento {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		for (int i = 1; i <= 4; i++) {
			CarroController carro = new CarroController(i, semaforo);
			carro.start();
		}

	}

}
