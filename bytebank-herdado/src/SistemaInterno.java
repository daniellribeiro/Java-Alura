
public class SistemaInterno {
	private int senha = 2222;
	
	public void autentica(Autenticavel fa){
		if(fa.autentica(this.senha)){
			System.out.println("Pode entrar!!!");
		}else{
			System.out.println("Nao pode entrar!!!");
		}
	}
}
