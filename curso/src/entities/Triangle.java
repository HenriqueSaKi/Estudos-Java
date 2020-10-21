package entities; //Pacote da classe

public class Triangle { //Nome da classe
	
	//Public = Pode ser utilizado em outros arquivos
	public double a;
	public double b;
	public double c;

	public double area(){
		//Corpo do método
		double p = (a + b + c)/2;
		double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return result;
	}
}