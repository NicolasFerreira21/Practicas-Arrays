package ejArrays;

public class X {
	static int i;
	public X x;
	static int z;
	
	public X() {
		i=1;
		z=i;
	}
	static int getI() {
		return i;
	}
	static int getZ() {
		return z;
	}
	static int setI(int b) {
		i=b;
		return z;
	}
	static void modificar() {
		i=3;
	}
	public static void main (String[] args) {
		new X();
		
		System.out.println(X.setI(3));
		System.out.println(X.getI());
		System.out.println(X.getZ());
	}
}
