//Marcos e Lucas Ronchi 3-52

package sogopro;

public class boletim {

	public static void main(String[] args) {
		
		professor a2 = new professor();
		a2.nomeP = "alex";
		
		
		
		aluno a1 = new aluno();
			a1.nome = "Marcos";
			a1.disciplina = "programação de eclipse";
			a1.nota1 = 6.2f;
			a1.nota2 = 8.3f;
			a1.nota3 = 6.7f;
			a1.nota4 = 9.5f;
			a1.media = (a1.nota1 + a1.nota2 + a1.nota3 + a1.nota4)/4;
		
			System.out.println(a1.nome + " teve media de "+ a1.media + " da disciplina " +a1.disciplina+ " do professor " +a2.nomeP );
	}
}
