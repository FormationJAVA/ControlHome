package Elements;

import Geometry.Point;

public class Lampe extends Element {

	
	public Lampe()
	{
		super();
		this.setLocation(new Point ());
		
	}
	
	public Lampe(String n, Etat s, boolean on)
	{
		super(n,s,on);
		this.setLocation(new Point ());

	}
	public Lampe(String n)
	{
		super(n,Etat.Disponible,false,1.0f);
		this.setLocation(new Point ());
	}
	public Lampe(String n, Etat s, boolean on, float i)
	{
		super(n,s,on,i);
		this.setLocation(new Point ());
	}
	public Lampe(Lampe L)
	{
		super(L.name,L.state,L.isOn,L.getIntensity());

	}
	public float getIntensity ()
	{
		return this.getValue();
	}
	public void setIntensity (float f)
	{
		f = f>=0 ? Math.min(f, 1.0f) : 0.0f;//definir 0 <= f <= 1
		this.setValue(f);;
	}
	
	public String toString ()
	{
		String m = super.toString();
		m+=" "+ this.getIntensity();
		return m;
	}

}
