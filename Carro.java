package carro;

import java.util.Scanner;

public class Carro {
	int pessoas = 0;
	int km = 0;
	int maxpessoas = 0;
	int gasolina = 0;
	
	void embarcar(int qtd) {
		if (qtd < 0) {
		System.out.println("Não vai dá");
		return;}
		
		else if(qtd + this.pessoas > this.maxpessoas) {
		System.out.println("Vixe vai dar não");
		return;}
		
		this.pessoas += qtd;
		}
		
	
	void setup(int qtd) {
		this.maxpessoas = qtd;
	}
	
	void desembarcar(int qtd) {
		if (qtd < 0) {
			System.out.println("Amigo??? Não tem ninguém");
			return;
		}
			
		
		else if (this.pessoas < qtd) {
			System.out.println("Milagre? Não faço.");
			return;
		}
		else {
			this.pessoas -= qtd;
		}		
	}
	
	void show() {
		System.out.println("........ CARRO ........");
		System.out.println("Nº de passageiros:"+ pessoas);
		System.out.println("Combustível:" + gasolina);
		System.out.println("Quilometragem:" + km);
	}
	
	void dirigir(int kmt) {
		if (this.pessoas==0) {
			System.out.println("Amigo??? Não tem ninguém");
			return;
		}
		else if (this.gasolina < (kmt/10)) {
			System.out.println("Coloque gasolina pfvr néah");
			return;	
		}
		else{
			this.km += kmt;
			this.gasolina = this.gasolina- kmt/10;
			System.out.println("VRUM VRUM BI BI BI BI");
		}	
	}
	
	void abastecer (int lit) {
		this.gasolina += lit;
		System.out.println("1 dólar o litro");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Carro carro = new Carro();
		System.out.println("....... WELCOME .......");
		System.out.println("Primeiro, faça o setup");
		System.out.println("setup (n) ---> informar o número máximo de pessoas que seu carrinho aguenta");
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if (ui[0].equals("end")) {
				break;
			}
			else if(ui[0].equals("embarcar")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.embarcar(qtd);
				carro.show();
			}
			else if(ui[0].equals("desembarcar")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.desembarcar(qtd);
				carro.show();
			}
			else if (ui[0].equals("show")) {
				carro.show();
			}
			else if (ui[0].equals("dirigir")) {
				int kmt = Integer.parseInt(ui[1]);
				carro.dirigir(kmt);
				carro.show();
			}
			else if (ui[0].equals("abastecer")) {
				int lit = Integer.parseInt(ui[1]);
				carro.abastecer(lit);
				carro.show();
			}
			else if (ui[0].equals("setup")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.setup(qtd);
				System.out.println("Digite o que fazer em seguida:");
				System.out.println("embarcar + (n) ---> adiciona passageiros");
				System.out.println("desembarcar + (n) ---> tira passageiros");
				System.out.println("show ---> status atual do veiculo ");
				System.out.println("dirigir ---> BI BI BI BI DIRGINDO O MEU CARRO ");
				System.out.println("abastecer ---> 1 dólar o litro da gasolina");
			}
			else {
				System.out.println("....... COMANDO INVÁLIDO ........");
		scanner.close();
			}
		}
	}
}
