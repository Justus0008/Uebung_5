package h2;

public class H2_main {
	public static void main(String[] args)
	{
		int n = 1;
		int digits = 0;
		int [] a = new int[9];
		
		int nNew = n;
		if(nNew == 0) {
			digits = 1;
		} else {
			while(nNew > 0) {
				digits++;
				nNew /= 10;
			}
		}
		
	nNew = n;
	int index = 8;
	while(nNew > 0) {
		a[index] = nNew % 10;
		nNew /= 10;
		index--;
	}
	}

}
