public class LeituroTemperaturaTeste{
	public static void main (String [] args){
		LeitorTemperatura l1 = new LeitorTemperatura("Campo Grande", 14, 5, 2018),
		                  l2 = new LeitorTemperatura("Cuiabá", 13, 5, 2018),
		                  l3 = new LeitorTemperatura("Belo Horizonte", 12, 5, 2018);

		l1.lerTemperatura(0);
		l1.lerTemperatura(1);
		l1.lerTemperatura(2);

		l2.lerTemperatura(0);
		l2.lerTemperatura(1);
		l2.lerTemperatura(2);

		l3.lerTemperatura(0);
		l3.lerTemperatura(1);
		l3.lerTemperatura(2);

		l1.imprimeTemperaturas();
		l2.imprimeTemperaturas();
		l3.imprimeTemperaturas();

		System.out.printf("A média de temperaturas de %s é %.2f.\n", l1.getCidade(), l1.mediaTemperaturas());
		System.out.printf("A média de temperaturas de %s é %.2f.\n", l2.getCidade(), l2.mediaTemperaturas());
		System.out.printf("A média de temperaturas de %s é %.2f.\n", l3.getCidade(), l3.mediaTemperaturas());


	}
}