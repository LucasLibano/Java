package entidade;


public class dados {
	public String nome;
	public double salario;
	public double imposto;
	public double aumento;
	
	public void salarioDesconto(double imposto) {
		salario-=imposto;
} 
	public void salarioAumento(double aumento) {
		salario+=salario * (aumento / 100);
	}
	
	public String toString() {
		return nome + ", R$" + String.format("%.2f", salario);
			
		
	}


}
