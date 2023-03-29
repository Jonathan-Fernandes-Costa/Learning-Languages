public class ExemploFuncao {
	
	public static void terceira(int numero) {
		System.out.println("terceira" + numero);
	    numero++;
	    if(numero <10)
	    	primeira(numero);
	    
	}
	
	public static void segunda(int numero) {
		numero++;
		System.out.println("segunda"+ numero);
		terceira(numero);
	}
	
	public static void primeira(int numero) {
		numero++;
		System.out.println("primeira" + numero);
		segunda(numero);		
	}
	
	public static void main(String[] args) {

//		minhaFuncao(1);
		
		
//		primeira(1);
//	  	System.out.println("fim");

		for (int a= 1; a<10; a++) {
			System.out.println("minhaFuncao" + a);
					
		}
	}
	
	public static void minhaFuncao(int numero) {
		System.out.println("minhaFuncao" + numero);
	    numero++;
	    
	    if(numero<100)
	    	minhaFuncao(numero);
	}

}
