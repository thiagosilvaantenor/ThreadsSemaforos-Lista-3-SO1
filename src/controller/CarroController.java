package controller;

import java.util.concurrent.Semaphore;

public class CarroController extends Thread {
	private int carroId;
	private Semaphore semaforo;
	private String sentido;

	public CarroController(int carroId, Semaphore semaforo) {
		this.carroId = carroId;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		alterarSentido();

		try {
			semaforo.acquire();
			passarCruzamento();
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		} finally {
			semaforo.release();
		}
	}

	private void alterarSentido() {
		switch (this.carroId) {
		case 1:
			this.sentido = "Norte";
			System.out.println("O carro #" + this.carroId + " está no sentido: " + this.sentido);
			break;
		case 2:
			this.sentido = "Sul";
			System.out.println("O carro #" + this.carroId + " está no sentido: " + this.sentido);
			break;
		case 3:
			this.sentido = "Leste";
			System.out.println("O carro #" + this.carroId + " está no sentido: " + this.sentido);
			break;
		case 4:
			this.sentido = "Oeste";
			System.out.println("O carro #" + this.carroId + " está no sentido: " + this.sentido);
			break;
		}
	}

	private void passarCruzamento() {
		System.out.println("O carro #" + this.carroId + " está passando pelo cruzamento no sentido: " + sentido);
	}

}
