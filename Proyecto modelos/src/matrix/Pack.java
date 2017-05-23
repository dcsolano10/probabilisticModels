package matrix;

public class Pack {
	
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	private double pi;
	
	public Pack(int a, int b, int c, int d, int e, int f) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		pi =0;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	
	public String toString(){
		
		return ""+a+b+c+d+e+f;
	}
	
	public double darNumPrendas()
	{
		return a+b+c+d+e+f;
	}
	
	public void setPi( Double d)
	{
		pi=d;
	}
	
	public double getPi()
	{
		return pi;
	}
	

}
