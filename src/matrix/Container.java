package matrix;

import java.util.ArrayList;

public class Container {
	
	private Pack pack;
	private ArrayList<Pack> array;
	private ArrayList<Double> values;
	private static final int MAXIMO = 3;


	private int position;
	private double diagonal;
	
	public Container(int pPosition, Pack pack) {
		
		super();
		array = new ArrayList<>();
		values = new ArrayList<>();
		this.pack = pack;
		position=pPosition;
		calculateTransitions();
		diagonal=0;
	}
	
	public ArrayList<Double> getValues() {
		return values;
	}

	public void setValues(ArrayList<Double> values) {
		this.values = values;
	}

	public Pack getPack() {
		return pack;
	}
	public void setPack(Pack pack) {
		this.pack = pack;
	}
	public ArrayList<Pack> getArray() {
		return array;
	}
	public void setArray(ArrayList<Pack> array) {
		this.array = array;
	}
	
	public void calculateTransitions()
	{
		diagonal=0;
		if(pack.getA()<MAXIMO)
		{
			Pack siguiente= new Pack(MAXIMO, pack.getB(), pack.getC(), pack.getD(), pack.getE(), pack.getF());
			array.add(siguiente);
			values.add(2.89);
			diagonal+=2.89;
		}
		if(pack.getB()<MAXIMO)
		{
			Pack siguiente= new Pack(pack.getA(), MAXIMO, pack.getC(), pack.getD(), pack.getE(), pack.getF());
			array.add(siguiente);
			values.add(7.11);
			diagonal+=7.11;
		}
		if(pack.getC()<MAXIMO)
		{
			Pack siguiente= new Pack(pack.getA(), pack.getB(), MAXIMO, pack.getD(), pack.getE(), pack.getF());
			array.add(siguiente);
			values.add(4.89);
			diagonal+=4.89;
		}
		if(pack.getD()<MAXIMO)
		{

			Pack siguiente= new Pack(pack.getA(), pack.getB(), pack.getC(), MAXIMO, pack.getE(), pack.getF());
			array.add(siguiente);
			values.add(1.94);
			diagonal+=1.94;
		}
		if(pack.getE()<MAXIMO)
		{
			Pack siguiente= new Pack(pack.getA(), pack.getB(), pack.getC(), pack.getD(), MAXIMO, pack.getF());
			array.add(siguiente);
			values.add(5.94);
			diagonal+=5.94;
		}
		if(pack.getF()<MAXIMO)
		{
			Pack siguiente= new Pack(pack.getA(), pack.getB(), pack.getC(), pack.getD(), pack.getE(), MAXIMO);
			array.add(siguiente);
			values.add(4.94);
			diagonal+=4.94;
		}
		if(pack.getA()>0)
		{
			Pack siguiente= new Pack(pack.getA()-1, pack.getB(), pack.getC(), pack.getD(), pack.getE(), pack.getF());
			array.add(siguiente);
			values.add(4.0);
			diagonal+=4.0;
		}
		if(pack.getB()>0)
		{
			Pack siguiente= new Pack(pack.getA(), pack.getB()-1, pack.getC(), pack.getD(), pack.getE(), pack.getF());
			array.add(siguiente);
			values.add(8.09);
			diagonal+=8.09;
		}
		if(pack.getC()>0)
		{
			Pack siguiente= new Pack(pack.getA(), pack.getB(), pack.getC()-1, pack.getD(), pack.getE(), pack.getF());
			array.add(siguiente);
			values.add(6.59);
			diagonal+=6.59;
		}
		if(pack.getD()>0)
		{
			Pack siguiente= new Pack(pack.getA(), pack.getB(), pack.getC(), pack.getD()-1, pack.getE(), pack.getF());
			array.add(siguiente);
			values.add(2.6);
			diagonal+=2.6;
		}
		if(pack.getE()>0)
		{
			Pack siguiente= new Pack(pack.getA(), pack.getB(), pack.getC(), pack.getD(), pack.getE()-1, pack.getF());
			array.add(siguiente);
			values.add(6.0);
			diagonal+=6.0;
		}
		if(pack.getF()>0)
		{
			Pack siguiente= new Pack(pack.getA(), pack.getB(), pack.getC(), pack.getD(), pack.getE(), pack.getF()-1);
			array.add(siguiente);
			values.add(4.6);
			diagonal+=4.6;
		}
		if(pack.getA()==0 && pack.getD()>0)
		{
			Pack siguiente= new Pack(1, pack.getB(), pack.getC(), pack.getD()-1, pack.getE(), pack.getF());
			array.add(siguiente);
			values.add(0.72);
			diagonal+=0.72;
		}
		if(pack.getB()==0 && pack.getE()>0)
		{
			Pack siguiente= new Pack(pack.getA(), 1, pack.getC(), pack.getD(), pack.getE()-1, pack.getF());
			array.add(siguiente);
			values.add(1.17);
			diagonal+=1.17;
		}
		if(pack.getC()==0 && pack.getF()>0)
		{
			Pack siguiente= new Pack(pack.getA(), pack.getB(), 1, pack.getD(), pack.getE(), pack.getF()-1);
			array.add(siguiente);
			values.add(0.78);
			diagonal+=0.78;
		}
		if(pack.getD()==0 && pack.getA()>0)
		{
			Pack siguiente= new Pack(pack.getA()-1, pack.getB(), pack.getC(), 1, pack.getE(), pack.getF());
			array.add(siguiente);
			values.add(0.56);
			diagonal+=0.56;
		}
		if(pack.getE()==0 && pack.getB()>0)
		{
			Pack siguiente= new Pack(pack.getA(), pack.getB()-1, pack.getC(), pack.getD(), 1, pack.getF());
			array.add(siguiente);
			values.add(0.56);
			diagonal+=0.56;
		}
		if(pack.getF()==0 && pack.getC()>0)
		{
			Pack siguiente= new Pack(pack.getA(), pack.getB(), pack.getC()-1, pack.getD(), pack.getE(), 1);
			array.add(siguiente);
			values.add(0.33);
			diagonal+=0.33;
		}
		
		Pack siguiente= new Pack(pack.getA(), pack.getB(), pack.getC(), pack.getD(), pack.getE(), pack.getF());
		array.add(siguiente);
		values.add(-diagonal);
		
//		for (int i = 0; i < array.size(); i++) 
//		{
//			System.out.println(array.get(i)+": "+values.get(i));
//		}
	}
	
	public int getPosition()
	{
		return position;
	}
	


}
