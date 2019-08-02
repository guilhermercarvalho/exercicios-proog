public class LeitorTemperatura
{
	private LeituraValidada leitorDados;
	private int dia, mes, ano;
	private String cidade;
	private int[] temperatura;

	public LeitorTemperatura(String nomeCidade, int dia, int mes, int ano)
	{
		this.cidade = nomeCidade;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		temperatura = new int [3];
	}

	public void lerTemperatura(int periodo)
	{
		int minimo = 12, maximo = 25;
		String msg = "Digite a temperatura atual em graus Celsius em " +cidade+ " no periodo " + periodo;
		temperatura[periodo] = leitorDados.leIntIntervalo(msg, minimo, maximo);
	}

	public void imprimeTemperatura()
	{
		for(int i = 0; i < temperatura.length; i++)
		{
			System.out.printf("Temperatura periodo %d: %02d °C\n", i, temperatura[i]);
		}
	}

	public void mediaTemperatura()
	{
		double media = 0;
		for(int i = 0; i < temperatura.length; i++)
			media += temperatura[i];
		media /= temperatura.length;

		System.out.printf("A média de temperatura na cidade %s eh: %.2f\n", getCidade(), media);
	}

	public String getCidade()
	{
		return cidade;
	}
}
