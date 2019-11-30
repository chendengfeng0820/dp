package xxx.dongtaiguihua;

public class Test1 {
	public static void main(String[] args) {
		int [] a= new int[]{1, 2, 3, 5};
		System.out.println(opt(a,a.length-1));

	}

	public static int opt(int[] a, int i) {
		int A=0;
		int B=0;
			if (i == 0) {
				return a[0];
			}
			if (i == 1) {
				return Math.max(a[0], a[1]);
			} else {
				A=opt(a,i-2)+a[i];
				B=opt(a,i-1);
				return Math.max(A,B);
			}
	}
}

