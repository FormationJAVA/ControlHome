package Elements;

public class HauParl extends Element {

	
	public HauParl ()
	{
		super();

	}
	
	public HauParl (String n, Etat s, boolean on, float i)
	{
		super(n,s,on,i);
		

	}
	
	
	public void setVolume (float f)
	{
		f = f>=0 ? Math.max(f, 1.0f) : 0.0f;
		this.setValue(f);

	}

	public float getVolume ()
	{
		return this.getValue();

	}
}
