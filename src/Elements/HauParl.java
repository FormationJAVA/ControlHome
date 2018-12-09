package Elements;

import Geometry.Point;

public class HauParl extends Element {

	
	public HauParl ()
	{
		super();

	}
	
	public HauParl (String n)
	{
		super(n,Etat.Disponible,false,0.5f);
		this.setLocation(new Point ());

	}
	
	public HauParl (String n, Etat s, boolean on, float i)
	{
		super(n,s,on,i);
		this.setLocation(new Point ());

	}
	
	
	public void setVolume (float f)
	{
		f = f>=0 ? Math.min(f, 1.0f) : 0.0f;
		this.setValue(f);

	}

	public float getVolume ()
	{
		return this.getValue();

	}
}
