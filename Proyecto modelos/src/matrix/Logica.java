package matrix;

import java.util.ArrayList;

public class Logica {

	//Probabilidades en estado estable inventario
	private double piInventarioSP;
	private double piInventarioMP;
	private double piInventarioLP;
	private double piInventarioSS;
	private double piInventarioMS;
	private double piInventarioLS;

	//Probabilidades en estado estable envío
	private double piEnvioSP;
	private double piEnvioMP;
	private double piEnvioLP;
	private double piEnvioSS;
	private double piEnvioMS;
	private double piEnvioLS;

	//Probabilidades en estado estable ganancias
	private double piGanaciaSP;
	private double piGanaciaMP;
	private double piGanaciaLP;
	private double piGanaciaSS;
	private double piGanaciaMS;
	private double piGanaciaLS;

	private double piQExhibidas;

	//Lambdas
	private double lambdaSP;
	private double lambdaMP;
	private double lambdaLP;
	private double lambdaSS;
	private double lambdaMS;
	private double lambdaLS;

	//Sigmas
	private double sigmaSP;
	private double sigmaMP;
	private double sigmaLP;
	private double sigmaSS;
	private double sigmaMS;
	private double sigmaLS;

	//Deltas
	private double deltaSP;
	private double deltaMP;
	private double deltaLP;
	private double deltaSS;
	private double deltaMS;
	private double deltaLS;

	//Arreglo costos totales actuales - [0]exhibido [1]envío desde fábrica [2]envío entre tiendas [3]ganancia
	private ArrayList<Double> costosTotales;

	//Arreglo costos unitarios actuales - [0]exhibido [1]envío desde fábrica [2]envío entre tiendas [3]ganancia
	private ArrayList<Double> costosActuales;


	public Logica() 
	{
		piQExhibidas=11.985331;

		piInventarioSP=0.586542;
		piInventarioMP=0.534386;
		piInventarioLP=0.575413;
		piInventarioSS=0.584599;
		piInventarioMS=0.509294;
		piInventarioLS=0.489613;

		piEnvioSP=0.147714;
		piEnvioMP=0.123264;
		piEnvioLP=0.157742;
		piEnvioSS=0.143778;
		piEnvioMS=0.107263;
		piEnvioLS=0.092137;

		piGanaciaSP=0.813492;
		piGanaciaMP=0.856838;
		piGanaciaLP=0.820160;
		piGanaciaSS=0.817428;
		piGanaciaMS=0.872839;
		piGanaciaLS=0.885765;


		lambdaSP=2.89;
		lambdaMP=7.11;
		lambdaLP=4.89;
		lambdaSS=1.94;
		lambdaMS=5.94;
		lambdaLS=4.94;

		sigmaSP=0.72;
		sigmaMP=1.17;
		sigmaLP=0.78;
		sigmaSS=0.56;
		sigmaMS=0.56;
		sigmaLS=0.33;

		deltaSP=4.0;
		deltaMP=8.099;
		deltaLP=6.599;
		deltaSS=2.6;
		deltaMS=6.0;
		deltaLS=4.6;

		costosActuales = new ArrayList<Double>();
		//Costo unitario exhibido
		costosActuales.add(0,65000.0);
		//Costo unitario envío desde fábrica
		costosActuales.add(1, 11257.0);
		//Costo unitario envío entre tiendas
		costosActuales.add(2, 10000.0);
		//Ganancia unitaria
		costosActuales.add(3, 150000.0);

		costosTotales = new ArrayList<Double>();


	}

	//1. Siempre es un arreglo de 4 posiciones
	public ArrayList<Double> darCostosUnitarios()
	{
		return costosActuales;
	}

	//2. Cambiar costos
	public double setCostos(ArrayList<Double> costos)
	{
		costosActuales=costos;
		return darCostoTotal();
	}

	//3. Dar costo actual total
	public double darCostoTotal()
	{
		double costoTotal=0;
		double costoExhibidas=piQExhibidas*costosActuales.get(0);
		costosTotales.add(0, costoExhibidas);

		double envioInventario=piInventarioSP*lambdaSP+piInventarioMP*lambdaMP+piInventarioLP*lambdaLP+piInventarioSS*lambdaSS+piInventarioMS*lambdaMS+piInventarioLS*lambdaLS;
		double costoEnvioInv=costosActuales.get(1)*envioInventario;
		costosTotales.add(1, costoEnvioInv);

		double envioTiendas=piEnvioSP*sigmaSP+piEnvioMP*sigmaMP+piEnvioLP*sigmaLP+piEnvioSS*sigmaSS+piEnvioMS*sigmaMS+piEnvioLS*sigmaLS;
		double costoEnvioTiendas=costosActuales.get(2)* envioTiendas;
		costosTotales.add(2, costoEnvioTiendas);

		double ventas=piGanaciaSP*deltaSP+piGanaciaMP*deltaMP+piGanaciaLP*deltaLP+piGanaciaSS*deltaSS+piGanaciaMS*deltaMS+piGanaciaLS*deltaLS;
		double gananciasTotales=costosActuales.get(3)* ventas;
		costosTotales.add(3, gananciasTotales);

		costoTotal=gananciasTotales+costoEnvioTiendas+costoEnvioInv+costoExhibidas;

		return costoTotal;

	}

	//4. Siempre es un arreglo de 4 posiciones
	public ArrayList<Double> darCostosTotales()
	{
		return costosTotales;
	}
}
