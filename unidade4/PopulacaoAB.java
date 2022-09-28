public class PopulacaoAB {

	public static void main(String[] args) throws Exception {
		
		final double habitantesA = 5000000;
		final double habitantesB = 7000000;
		final double taxaA = 0.03;
		final double taxaB = 0.02;
		
		int tempo = 0;
		double populacaoA = habitantesA;
		double populacaoB = habitantesB;
		
		while(populacaoB >= populacaoA)
		{
			populacaoB = populacaoB + populacaoB*taxaB;
			populacaoA = populacaoA + populacaoA*taxaA;
			tempo++;
		}
		System.out.println("A populaçao de A levara "+tempo+" anos para superar a populaçao de B");

	}

}
