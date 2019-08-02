public class Salario{
	private float salarioLiquido, salarioBruto

	public Salario(float salarioBruto){
		this.setSalarioBruto(salarioBruto);
		this.salarioLiquido = 0f;
	}

	public float getSalarioBruto(){
		return this.salarioBruto;
	}

	public void setSalarioBruto(float salarioBruto){
		this.salarioBruto = salarioBruto;
	}

	public float getSalarioLiquido(){
		return this.salarioLiquido;
	}

	public float CalcularSalarioLiquido(){
		if(getSalarioBruto() <= 150f){
			this.salarioLiquido = getSalarioBruto() - (getSalarioBruto() * 0,10);
		}
		else if(getSalarioBruto() > 1057.5f || getSalarioBruto() < 2115f){
			this.salarioLiquido = (getSalarioBruto() - 1057.5f) * 0.15f;
		}
		else if(getSalarioBruto() > 2115f){
			this.salarioLiquido = (getSalarioBruto() - 2115f) * 0.275f;
		}
		else
			this.salarioLiquido = getSalarioBruto();
		return this.salarioLiquido;
	}
}