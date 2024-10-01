package statoth;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner myObj = new Scanner(System.in);
		Random ran = new Random();
		
		int T = myObj.nextInt(); //inserimento numero thread
		int N = myObj.nextInt(); //inserimento n fino a cui contare
		threadco[] th=new threadco[T]; //arrey dei thread
		int cth=0; //contatore dei thread terminati
		
		
		for(int i=0;i<T;i++){
			th[i]= new threadco(ran.nextInt(N)+1);
			th[i].start(); //avvio i thread
		}
		
		while(true) {
			for(int i=0;i<T;i++){
				if(th[i].isAlive()) { //se il thread è attivo stampo lo stato e il valore
					System.out.println("il thread "+i+" è "+th[i].getState()+" ed è a: "+th[i].getco());
				}else {
					System.out.println("il thread "+i+" è completato");
					cth++;
				}
			}
			if(cth==T) { //se tutti i thread sono completati esco dal while
				break;
			}else {
				cth=0;
				Thread.sleep(1000);
			}
			
			
		}
		
		System.out.println("tutti i thread sono completati");
		
	}
		
}


