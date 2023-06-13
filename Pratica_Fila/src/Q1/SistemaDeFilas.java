package Q1;

public class SistemaDeFilas {
	public static void main(String args[]) {
		String i = "cliente";
		FilaGenerica<String> caixa1 = new FilaGenerica<>();
		FilaGenerica<String> caixa2 = new FilaGenerica<>();
		FilaGenerica<String> caixa3 = new FilaGenerica<>();
		
		
		
		caixa1.push(i);
		caixa1.push(i);
		caixa1.push(i);
		caixa1.push(i);
		
		
		
		
		if (caixa1.Tamanho() > 1) {
		    caixa2.push(i);
		    if (caixa2.Tamanho() > 1) {
		        caixa3.push(i);
		    } else {
		        caixa1.push(i);  // Adiciona ao caixa1 mesmo depois de 1 elemento
		    }
		}


		System.out.println("Elementos na caixa 1: " + caixa1);
        System.out.println("Elementos na caixa 2: " + caixa2);
        System.out.println("Elementos na caixa 3: " + caixa3);
		
	}

}
