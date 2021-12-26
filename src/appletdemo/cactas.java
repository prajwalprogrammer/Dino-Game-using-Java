package appletdemo;

import java.awt.Graphics;
import java.util.Vector;

public class cactas
{
	@SuppressWarnings("rawtypes")
	public Vector v;

	int x,y;

	public Object I;
	//int cac[];
	public cactas()
	{
		this.x=600;
		this.y=500;
	}
	public void draw(Graphics g)
	{
		g.fillRect(this.x, this.y, 100, 100);
	}
	public void move1()
	{
		this.x -=3;
	}
}
