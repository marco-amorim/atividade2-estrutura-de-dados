package main;

import filacomvetor.FilaComVetor;

public class Main {
	
	public static void main(String[] args) {
		
		FilaComVetor filaVetor = new FilaComVetor();
		
		filaVetor.enfileirar(1);
		filaVetor.enfileirar(2);
		filaVetor.enfileirar(3);
		filaVetor.enfileirar(4);
		filaVetor.enfileirar(5);
		
		System.out.println("Fila completa");
		filaVetor.imprimir();
		
		filaVetor.desenfileirar();
		filaVetor.desenfileirar();
		
		System.out.println("Fila desenfileirada");
		filaVetor.imprimir();
		
		
		System.out.println("Primeiro elemento da fila: " + filaVetor.primeiroElemento());
		
		filaVetor.tamanho();
		
		
	}
	
}
