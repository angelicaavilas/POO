package abelha;

import java.util.Scanner;

public class Abelha {

            
        int felicidade = 0;
        int fome = 0;
        int fama = 0;
        int dinheiro = 0;
        
        void Instagramar(int horas){
            System.out.println("Quero likes <3");
            this.fama += 5;
            this.felicidade += 5;
        }
        
        void Voar(int horas) {
		if (this.fome >= 5) {
			System.out.println("Vai dar não amiga fome d+");
			return;
		}
		else {
			System.out.println("VOU VOAR BEM ALTO WINX!!!");
			this.fome += horas;
			this.felicidade += 5;
                        this.fama += 3;
		}
	}
        
        void Fama(){
            if(this.fama >= 10);
            System.out.println("EU SOU FAMOSA MINHA FILHA");
            
            
        }
        
        void Comer(int qtd) {
		if (this.dinheiro <= 10) {
			System.out.println("Tenho fome, dinheiro? Não.");
			return;
		}
		else {
			System.out.println("Hmmmm buchin chei");
			this.fome -= qtd;	
			this.dinheiro -= qtd*10;
		}
        }
         void status() {
		 System.out.println("-------- Vanessa Karla, the queen bee --------");
		 System.out.println("Felicidade: " + felicidade);
		 System.out.println("Fome: " + fome);
                 System.out.println("Fama: " + fama);
                 System.out.println("Dinheiro: " + dinheiro);
         }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Abelha vanessa = new Abelha();
		System.out.println("..... WELCOME .....");
		System.out.println("EU SOU VANESSA KARLA, THE QUEEN BEE!");
		System.out.println("MENU:");
		System.out.println("Digite o que fazer:");
		System.out.println("Instagramar n(horas) ---> Postar foto pra ficar famosa");
		System.out.println("Voar n(horas)---> Vamos bailar no ar ");
		System.out.println("Comer n(quantidade) ---> Enche meu buchin ");
		System.out.println("Fama n(horas) ---> Ficar famosa pra ganhar mimos!! ");
                System.out.println("Banhar n(horas) ---> Ficar cheirosinha!! ");
		System.out.println("END ---> Tchau! Até a próxima");
		
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if (ui[0].equals("END")) {
				System.out.println("bye bye!!");
				break;
			}
			else if(ui[0].equals("Instagramar")) {
				int horas = Integer.parseInt(ui[1]);
				vanessa.Instagramar(horas);
				vanessa.status();
			}
			else if(ui[0].equals("Voar")) {
				int horas = Integer.parseInt(ui[1]);
				vanessa.Voar(horas);
				vanessa.status();
                        }
			
			else if(ui[0].equals("Comer")) {
				int qtd = Integer.parseInt(ui[1]);
				vanessa.Comer(qtd);
				vanessa.status();
			}
			else if(ui[0].equals("Fama")) {
				vanessa.Fama();
				vanessa.status();
			}
			
		}
	}
}