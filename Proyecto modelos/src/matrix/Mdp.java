package matrix;

import java.util.ArrayList;

public class Mdp {
	
	private double costoTotal;
	private ArrayList<Double> probabilidades;
	private ArrayList<Double> costosActuales;


	
	public Mdp() 
	{
		probabilidades = new ArrayList<Double>();
		probabilidades.add(39.0);
		probabilidades.add(19.0);
		probabilidades.add(42.0);
		probabilidades.add(38.0);
		probabilidades.add(19.0);
		probabilidades.add(43.0);
		
		costosActuales = new ArrayList<Double>();
		costosActuales.add(11257.0);
		costosActuales.add(195000.0);
		costosActuales.add(450000.0);
		
		costoTotal=1167572.44;
		
	}
	
	public ArrayList<Integer> p1LlevarPrincipal()
	{
		ArrayList<Integer> p1 = new ArrayList<Integer>();
		p1.add(3);
		p1.add(3);
		p1.add(3);
		p1.add(0);
		p1.add(0);
		p1.add(0);
		p1.add(0);
		p1.add(0);
		p1.add(0);
		
		return p1;
	}
	
	public ArrayList<Integer> p1LlevarSecundaria()
	{
		ArrayList<Integer> p1 = new ArrayList<Integer>();
		p1.add(6);
		p1.add(0);
		p1.add(0);
		p1.add(3);
		p1.add(0);
		p1.add(0);
		p1.add(3);
		p1.add(3);
		p1.add(0);
		
		return p1;
	}
	
	public ArrayList<Integer> p2LlevarPrincipal()
	{
		ArrayList<Integer> p1 = new ArrayList<Integer>();
		p1.add(3);
		p1.add(6);
		p1.add(6);
		p1.add(3);
		p1.add(3);
		p1.add(3);
		p1.add(0);
		p1.add(0);
		p1.add(0);
		costoTotal=1746788.87;
		costosActuales = new ArrayList<Double>();
		costosActuales.add(11257.0);
		costosActuales.add(65000.0);
		costosActuales.add(450000.0);
		
		return p1;
	}
	
	public ArrayList<Integer> p2LlevarSecundaria()
	{
		ArrayList<Integer> p1 = new ArrayList<Integer>();
		p1.add(6);
		p1.add(0);
		p1.add(0);
		p1.add(6);
		p1.add(3);
		p1.add(0);
		p1.add(6);
		p1.add(3);
		p1.add(0);
		costoTotal=1746788.87;
		
		return p1;
	}

	public ArrayList<Double> darCostosActuales()
	{
		return costosActuales;
	}
	
	public Double darCostoTotal()
	{
		return costoTotal;
	}
	
	
	public static void main(String[] args) {
		new Mdp();
	}

}
