package Elements;

public class Serrure extends Element {
	
	
	public Serrure()
	{
		super ();
	}
	
	public Serrure(String n, Etat s, boolean on)
	{
		super(n,s,on);
	}
	
	public Serrure(String n)
	{
		super(n,Etat.Disponible,false);
	}
}
