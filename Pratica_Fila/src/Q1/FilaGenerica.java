package Q1;

import java.util.ArrayList;

public class FilaGenerica<T> {
	private ArrayList<T> Lista;

	public FilaGenerica() {
		Lista = new ArrayList<>();
	}

	public void push(T elemento) {
		Lista.add(elemento);
	}

	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("A fila está vazia.");
		}
		return Lista.remove(0);
	}

	public boolean isEmpty() {
		return Lista.isEmpty();
	}

	public int Tamanho() {
		return Lista.size();
	}
	@Override
	public String toString() {
	return Lista.toString();
	    }

	
}
