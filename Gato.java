
package gato;

public class Gato {
	String name;
	int vidas;
	int felicidade;
	void Miar() {
		if (this.vidas > 0)
			System.out.println("Meow ^. .^");
		else
			System.out.println("...");
		
	}
	void Fingirdemorto() {
		this.vidas-=1;
		this.felicidade-=1;
		System.out.println("Oh no!");
	}
	
	void Status() {
		System.out.println("vidas:" + vidas);
		System.out.println("felicidade:" + felicidade);
		}
	void Brincar() {
		if (this.felicidade == 10)
			System.out.println("Correndo atrás de rato! Uhull! ^. 3 .^");
		this.felicidade -= 10;
		this.vidas -= 1;
	}
	void Escalar() {
		this.vidas -= 2;
		this.felicidade -= 2;
	}
		
	public static void main(String[] args) {
		
		Gato ghatho = new Gato();
		ghatho.name = "Ghato Leopoldo";
		ghatho.vidas = 7;
		ghatho.felicidade = 10;
		ghatho.Status();
		for (int i = 0; i < 10; i+=1) {
			ghatho.Miar();
			ghatho.Fingirdemorto();
		}
		ghatho.Status();
		ghatho.Brincar();
		ghatho.Status();
                ghatho.Escalar();
                ghatho.Status();
	}
	
	
	
}
