package entities;

public class Triangle {

	// declarando os três atributos da classe

	public double a;
	public double b;
	public double c;
	
	//criando uma função que calcula á area do treiângulo
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
		
		
	}

}
