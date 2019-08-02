public class DataFinal{
	private static final int[] DIASMESSES = {31, 28, 31,30, 31, 30, 31, 31, 30, 31, 30, 31};

	private int dia, mes, ano;

	public DataFinal(int dia, int mes, int ano){
		if(validaDia(dia, mes) && validaMes(mes)){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}

	public boolean validaDia(int dia, int mes){
		if(dia > 0 && dia <= DIASMESSES[mes - 1])
			return true;
		else
			return false;
	}

	public boolean validaMes(int mes){
		if(mes > 0 && mes <= 12)
			return true;
		else
			return false;
	}

	public String dataHoje(){
		String msg = "Hoje é: " + dia + "/" + mes + "/" + ano;
		return msg;
	}

	public String dataAmanha(){
		int diaAmanha = 0, mesAmanha = 0, anoAmanha = 0;
		String msg = "Amanhã será: ";
		if(dia == DIASMESSES[mes - 1]){
			if(mes == 12){
				diaAmanha = 1;
				mesAmanha = 1;
				anoAmanha = ano + 1;
			} 
			else{
				diaAmanha = 1;
				mesAmanha = mes + 1;
				anoAmanha = ano;
			}
		}
		else{
			diaAmanha = dia + 1;
			mesAmanha = mes;
			anoAmanha = ano;
		}

		msg += diaAmanha + "/" + mesAmanha + "/" + anoAmanha;
		return msg;
	}

	public String dataOntem(){
		int diaOntem = 0, mesOntem = 0, anoOntem = 0;
		String msg = "Ontem foi: ";
		if(dia == 1){
			if(mes == 1){
				diaOntem = DIASMESSES[11];
				mesOntem = 12;
				anoOntem = ano - 1;
			}
			else{
				diaOntem = DIASMESSES[mes - 2];
				mesOntem = mes - 1;
				anoOntem = ano;
			}
		}
		else{
			diaOntem = dia - 1;
			mesOntem = mes;
			anoOntem = ano;
		}

		msg += diaOntem + "/" + mesOntem + "/" + anoOntem;
		return msg;
	}

	public static void main(String[] args) {
		DataFinal data1 = new DataFinal(1, 1, 2018);
		System.out.println(data1.dataHoje());
		System.out.println(data1.dataAmanha());
		System.out.println(data1.dataOntem());
	}
}