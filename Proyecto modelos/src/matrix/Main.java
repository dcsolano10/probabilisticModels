package matrix;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.la4j.Matrix;
import org.la4j.inversion.MatrixInverter;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.sparse.CRSMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.la4j.LinearAlgebra;
import org.la4j.Matrices;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Main {

	private Container[] array;
	private HashMap<String, Integer> posiciones;
	private static final int MAXIMO = 3;
	private int tamMatriz;

	public Main()
	{
		Double t = Math.pow(MAXIMO+1, 6);
		tamMatriz = t.intValue();

		array = new Container[tamMatriz];
		//Pack p = new Pack(2, 2, 2, 2, 2, 0);
		//Container c= new Container(0, p);
		posiciones = new HashMap<>();

		nextNumber();

	}


	private void nextNumber() {
		int pos =0;
		for(int i=0; i<=MAXIMO; i++){
			for(int j=0; j<=MAXIMO; j++){
				for(int k=0; k<=MAXIMO; k++){
					for(int l=0; l<=MAXIMO; l++){
						for(int m=0; m<=MAXIMO; m++){
							for(int n=0; n<=MAXIMO; n++){

								//Escribe todas las filas

								Pack pack = new Pack(i, j, k, l, m, n);
								array[pos] = new Container(pos, pack);
								String llave= i+""+j+""+k+""+l+""+m+""+n;
								posiciones.put(llave, pos);
								pos++;

								//System.out.println(llave+"-");

							}
						}
					}
				}
			}
		}

		
		double[][] a = new double[tamMatriz][tamMatriz];
		for (int i = 0; i < array.length; i++) 
		{
			Container actual = array[i];

			ArrayList<Pack> packs =actual.getArray();
			ArrayList<Double> values = actual.getValues();

			int y=actual.getPosition();

			for (int j = 0; j < packs.size(); j++) 
			{
				Pack p =packs.get(j);
				int x= posiciones.get(p.toString());
				a[y][x] =  values.get(j);
			}

		}

		for (int i = 0; i < tamMatriz; i++) 
		{
			a[i][tamMatriz-1] = 1;
		}
		
		System.out.println("Calculando");
		
		RealMatrix m = MatrixUtils.createRealMatrix(a);
		RealMatrix m2 = MatrixUtils.inverse(m);
		RealMatrix pis = m2.getRowMatrix(tamMatriz-1);
		double total=0;
		for (int i = 0; i < tamMatriz; i++) 
		{
			Pack p = array[i].getPack();
			p.setPi(pis.getEntry(0, i));
			total+=pis.getEntry(0, i);
		}
		System.out.println(total);
		System.out.println("Terminé"+ pis.getRowDimension() +" "+ pis.getColumnDimension());
		calcularPisAcumulados();

		System.out.println(pis.toString());
	}
	
	public void calcularPisAcumulados()
	{
		double piQExhibidas=0;
		
		double piInventarioSP=0;
		double piInventarioMP=0;
		double piInventarioLP=0;
		double piInventarioSS=0;
		double piInventarioMS=0;
		double piInventarioLS=0;
		
		double piEnvioSP=0;
		double piEnvioMP=0;
		double piEnvioLP=0;
		double piEnvioSS=0;
		double piEnvioMS=0;
		double piEnvioLS=0;
		
		double piGanaciaSP=0;
		double piGanaciaMP=0;
		double piGanaciaLP=0;
		double piGanaciaSS=0;
		double piGanaciaMS=0;
		double piGanaciaLS=0;




		for(int i=0; i<=MAXIMO; i++){
			for(int j=0; j<=MAXIMO; j++){
				for(int k=0; k<=MAXIMO; k++){
					for(int l=0; l<=MAXIMO; l++){
						for(int m=0; m<=MAXIMO; m++){
							for(int n=0; n<=MAXIMO; n++){


								String llave= i+""+j+""+k+""+l+""+m+""+n;
								int posicion=posiciones.get(llave);
								Pack actual=array[posicion].getPack();
								
								if(actual.getA()<3)
								{
									piInventarioSP+=actual.getPi();
								}
								if(actual.getB()<3)
								{
									piInventarioMP+=actual.getPi();
								}
								if(actual.getC()<3)
								{
									piInventarioLP+=actual.getPi();
								}
								if(actual.getD()<3)
								{
									piInventarioSS+=actual.getPi();
								}
								if(actual.getE()<3)
								{
									piInventarioMS+=actual.getPi();
								}
								if(actual.getF()<3)
								{
									piInventarioLS+=actual.getPi();
								}
								if(actual.getA()==0 && actual.getD()>0)
								{
									piEnvioSP+=actual.getPi();
								}
								if(actual.getB()==0 && actual.getE()>0)
								{
									piEnvioMP+=actual.getPi();
								}
								if(actual.getC()==0 && actual.getF()>0)
								{
									piEnvioLP+=actual.getPi();
								}
								if(actual.getD()==0 && actual.getA()>0)
								{
									piEnvioSS+=actual.getPi();
								}
								if(actual.getE()==0 && actual.getB()>0)
								{
									piEnvioMS+=actual.getPi();
								}
								if(actual.getF()==0 && actual.getC()>0)
								{
									piEnvioLS+=actual.getPi();
								}
								if(actual.getA()>0)
								{
									piGanaciaSP+=actual.getPi();
								}
								if(actual.getB()>0)
								{
									piGanaciaMP+=actual.getPi();
								}
								if(actual.getC()>0)
								{
									piGanaciaLP+=actual.getPi();
								}
								if(actual.getD()>0)
								{
									piGanaciaSS+=actual.getPi();
								}
								if(actual.getE()>0)
								{
									piGanaciaMS+=actual.getPi();
								}
								if(actual.getF()>0)
								{
									piGanaciaLS+=actual.getPi();
								}
								
								piQExhibidas+= actual.getPi()*actual.darNumPrendas();


							}
						}
					}
				}
			}
		}
		
		System.out.println(piQExhibidas);
	}
	
	public void calcularCostoExhibidas()
	{
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
