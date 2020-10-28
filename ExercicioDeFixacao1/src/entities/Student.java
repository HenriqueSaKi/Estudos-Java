package entities;

public class Student {
	
	public String nome;
	public Double nota1;
	public Double nota2;
	public Double nota3;
	
	public Double media(){
		return nota1 + nota2 + nota3;
	}
	
	public Double pontosFaltantes(double notaCorte){
		return notaCorte - media();
	}
	
	public void verificaAprovacao(double notaCorte){
		if(media() >= notaCorte){
			System.out.println("Aê, passou!");
		}
		else{
			System.out.println("Putz! Não passou.");
			System.out.printf("Faltaram: %.2f pontos", pontosFaltantes(notaCorte));
		}
	}
	
}