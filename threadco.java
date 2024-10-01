package statoth;

public class threadco extends Thread{
	private int x;
	private int co;
	
	public threadco(int val) {
		x=val;
		co=0;
	}
	
	public void run() {
		while(co<x) {  //aggiungo uno al contatore ogni 120ms
			co++;
			try {
				threadco.sleep(120);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public int getco() {
		return co;
	}

}
