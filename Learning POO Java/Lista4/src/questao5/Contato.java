package questao5;

public class Contato {
	public int codigo;
	public String nome;
	private String endereco;
	private String email;
	private String telefone;
	private String obb;
	
	public Contato(int codigo) {
		if(codigo>=1000&&codigo<=9999) {
			this.codigo = codigo;
		}else {
			throw new IllegalArgumentException("Código inválido. O código deve ser maior ou igual a 1000 e menor ou igual a 9999.");

		}
		
	}
	public Contato(int codigo, String nome) {
		if(codigo>=1000&&codigo<=9999) {
			this.codigo = codigo;
		}else {
			throw new IllegalArgumentException("Código inválido. O código deve ser maior ou igual a 1000 e menor ou igual a 9999.");

		}
		this.nome = nome;
	}
	public Contato(int codigo, String nome, String email) {
		if(codigo>=1000&&codigo<=9999) {
			this.codigo = codigo;
		}else {
			throw new IllegalArgumentException("Código inválido. O código deve ser maior ou igual a 1000 e menor ou igual a 9999.");

		}
		this.nome = nome;
		this.email = email;
	}
	public Contato(String telefone) {
		if(telefone.length()==8) {
			this.telefone = telefone;
		}else {
			throw new IllegalArgumentException("Telefone inválido");
		}
		
	}
	public String getEmail() {
		return email;
	}
	public void imprimeContato() {
		System.out.println("Código: "+ codigo);
		System.out.println("Nome: "+nome);
		System.out.println("Endereço: "+endereco);
		System.out.println("E-mail: "+email);
		System.out.println("Telefone: "+telefone);
		System.out.println("Observação: "+ obb);
	}
	public void duplicaContato(Contato contato) {
		this.codigo = contato.codigo;
		this.email = contato.email;
		this.endereco = contato.endereco;
		this.nome = contato.nome;
		this.obb = contato.obb;
		this.telefone = contato.telefone;
	}
	public boolean verificaContato() {
		if(codigo!=0&&email!=null&&endereco!=null&&nome!=null&&obb!=null&&telefone!=null) {
			return true;
		}else {
			return false;
		}
	}
	
}
