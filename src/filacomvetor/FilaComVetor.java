package filacomvetor;

public class FilaComVetor {
	
	Object[] elementos = new Object[5];
	int fim = -1;
	int inicio = 0;
	int tamanho = 0;
	
	public void enfileirar(Object valor) {
		
		// checa caso o vetor esteja cheio
		if (tamanho == elementos.length) {
			System.out.println("vetor cheio");
		} else {
			
			// -1 para pegar o index correto, ja que comeca de 0
			if (fim == elementos.length -1) {
				fim = -1;
			}
			// Incrementar a variavel fim
			fim++;
			
			// Inserir o elemento armazenado em valor na posicao fim do vetor elementos
			elementos[fim] = valor;
			
			// Incrementar a variavel tamanho
			tamanho++;
		}
	}
	
	public Object desenfileirar() {
		
		// Verifica se o vetor esta vazio
		if (!vetorVazio()) {
			Object temp = elementos[inicio];
			
			// seta o valor do primeiro elemento para null
			elementos[inicio] = null;
			inicio++;
			
			if (inicio == elementos.length) {
				inicio = 0;
			}
			
			// diminui o tamanho em 1, pois o primeiro elemento foi mudado para null
			tamanho--;
			// retorna o novo objeto sem o primeiro index
			return temp;
		} else {
			// excecao para o vetor vazio
			System.out.println("vetor vazio");
			return null;
		}
	}
	
	// get no primeiro elemento do vetor
	public Object primeiroElemento() {
		
		if (!vetorVazio()) {
			// retorna elemento da posicao inicial
			return elementos[inicio];
		} else {
			System.out.println("vetor vazio");
			return null;
		}
	}
	
	// checa se o vetor esta vazio
	public boolean vetorVazio() {
		return tamanho == 0;
	}
	
	// retorna o tamanho do vetor
	public int tamanho() {
		System.out.println("Quantidade de elementos: " + tamanho);
		return tamanho;
	}
	
	// imprimi o vetor
	public void imprimir() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println(primeiroElemento() + " ");
			enfileirar(desenfileirar());
		}
		System.out.println();
	}
	
}
