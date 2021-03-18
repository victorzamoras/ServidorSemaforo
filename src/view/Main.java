package view;

import java.util.concurrent.Semaphore;

import controller.SemaforoController;

public class Main {

	public static void main(String[] args) {		
		final int permissao = 1;
		Semaphore semaforo = new Semaphore(permissao);
		for (int id = 1; id <= 21; id++) {
			Thread t = new SemaforoController(id, semaforo);
			t.start();
		}
	}
}