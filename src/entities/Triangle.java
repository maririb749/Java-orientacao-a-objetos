package entities;

public class Triangle {

	// declarando os tr�s atributos da classe

	public double a;
	public double b;
	public double c;
	
	//criando uma fun��o que calcula � area do trei�ngulo
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
		
		
	}

}
