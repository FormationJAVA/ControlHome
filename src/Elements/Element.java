package Elements;

import Geometry.Point;

public class Element {
	public String name;
	public Etat state;
	public boolean isOn;
	private float value;
	public Point position;
	
	public Element ()
	{
		this.name = "Element inconnu";
		this.state = Etat.Disponible;
		this.isOn = false;
		this.value = 0.0f;

	}
	
	public Element (String name, Etat state, boolean isOn )
	{
		this.name = name;
		this.state = state;
		this.value = 0.0f;
		this.isOn = state == Etat.Disponible ? isOn : false;

	}
	
	public Element (String name, Etat state, boolean isOn, float f )
	{
		this.name = name;
		this.state = state;
		f = f>=0 ? Math.min(f, 1.0f) : 0.0f;
		this.value = f;
		this.isOn = state == Etat.Disponible ? isOn : false;

	}
	
	public void setLocation (Point P)
	{
		this.position = P;
	}
	
	public Point getLocation ()
	{
		return this.position;
	}
	public void Activate ()
	{

		this.isOn = state == Etat.Disponible ? true : false;
	}
	
	public void desactivate ()
	{
		this.isOn = false;
	}
	
	public void repair ()
	{
		this.state = Etat.Disponible;
	}
	
	protected void setValue (float f)
	{
		this.value = f;
	}
	
	public float getValue ()
	{
		return this.value ;
	}
	
	public String toString ()
	{
		String message= "";
		message += this.name+", "+this.state+", ";
		message += this.isOn ? "Active" : "Desactive";
		return message;
	}

}
