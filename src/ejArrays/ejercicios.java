package ejArrays;

public class ejercicios {
	public static int[] reverso(int [] a) {
		int[] rever = new int[a.length];
		int g=0;
		for (int i=a.length-1; i>-1; i--) {
			rever[g]=a[i];
			g++;
		}
		return rever;
	}
	public static int [] opuestos (int[] a) {
		int [] opu = new int [a.length];
		for (int i=0; i<a.length; i++) {
			if (a[i]==0) {
				opu[i]=a[i];
			}
			else {
				opu[i]=-a[i];
			}
		}
		return opu;
	}
	public static void main (String[] args) {
		int [] arr = {0,1, 2 , 3 , 4 ,5, -6};
		int[] aux= opuestos(arr);
		for (int i=0; i<aux.length;i++) {
			System.out.println(aux[i]);
		}
		
	}
}
