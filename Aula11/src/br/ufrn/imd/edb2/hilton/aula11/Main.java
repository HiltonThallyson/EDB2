package br.ufrn.imd.edb2.hilton.aula11;

public class Main {

    public static void main(String[] args) {

    	ArvoreBuscaBinaria tree = new ArvoreBuscaBinaria();

    	tree.insert(100);
    	tree.insert(200);
    	tree.insert(10);
	    tree.insert(5);
	    tree.insert(12);

	    ArvoreBuscaBinaria.Node value = tree.search(10);

	    if(value != null){
			System.out.println("Encontrou o elemento!");
		}else{
			System.out.println("Elemento não encontrado!");
		}
    }
}
