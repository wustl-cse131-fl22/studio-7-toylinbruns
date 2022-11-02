package studio7;

public class Die {
	private int n;
	public Die(int initN) {
		this.n = initN;
	}
	
	public int throwDie() {
		return((int)(Math.random()*this.n)+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die sexyDie = new Die(6);
		System.out.print(sexyDie.throwDie());
	}

}
