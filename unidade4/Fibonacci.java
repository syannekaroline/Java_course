public class Fibonacci {

	public static void main(String[] args) throws Exception{
		double s,s1,s2,s9=0,s10=0,s100=0,s10000=0;
		s1 = 1;
		s2 = 1;
		for(int i =3; i<=10000; i++){ 
			s = s1 + s2;
			s1 = s2;
			s2 = s;
			if (i == 9)
				s9 = s;
			else if (i == 10)
				s10 = s;
			else if (i == 100)
				s100 = s;
			else if (i == 10000)
				s10000 = s;			
		}
		System.out.println("S9="+s9);
		System.out.println("S10="+s10);
		System.out.println("S100="+s100);
		System.out.println("S10000="+s10000);
	}
}
