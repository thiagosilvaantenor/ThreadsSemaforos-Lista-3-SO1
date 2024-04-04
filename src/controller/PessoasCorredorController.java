package controller;

import java.util.concurrent.Semaphore;

public class PessoasCorredorController extends Thread {
	private Semaphore semaforo;
	private int pessoaId;
	private int corredorId;
	private int corredorTamanho = 200;
	private int pessoaVelocidade = (int)(Math.random() * (6 + 1)) + 4;
	private int distanciaPercorrida = 0;

	public PessoasCorredorController(Semaphore semaforo, int pessoaId, int corredorId) {
		this.semaforo = semaforo;
		this.pessoaId = pessoaId;
		this.corredorId = corredorId;
	}
	
	//Getters e Setters

	public int getPessoaId() {
		return pessoaId;
	}


	public int getCorredorId() {
		return corredorId;
	}

	public int getPessoaVelocidade() {
		return pessoaVelocidade;
	}

	public int getCorredorTamanho(){
		return corredorTamanho;
	}

	public int getDistanciaPercorrida() {
		return distanciaPercorrida;
	}
	
	public void setDistanciaPercorrida(int distanciaPercorrida) {
		this.distanciaPercorrida += distanciaPercorrida;
	}


	@Override
	public void run() {
		
		while(getDistanciaPercorrida() < getCorredorTamanho()) {
			correr();			
		}
	
		try {
			semaforo.acquire();
			abrirPorta();
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}finally {
			semaforo.release();
		}

	}

	private void correr() {
		setDistanciaPercorrida(getPessoaVelocidade()); 
		System.out.println("A pessoa #" + getPessoaId() +" percorreu " + getDistanciaPercorrida() 
		+ ", no corredor #" + getCorredorId());
	}

	private void abrirPorta() {
		System.out.print("Pessoa #"+getPessoaId()+" está abrindo e passando pela porta");
		int tempo = (int) ((Math.random() * 2001)+1000);
		
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Pessoa #"+getPessoaId()+" passou pela porta!");
	}


}
