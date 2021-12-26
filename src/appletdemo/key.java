package appletdemo;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

//import java.applet.*;
public class key extends Applet implements KeyListener
{

	key()
	{
setSize(400,400);
setVisible(true);
	setBackground(Color.blue);
      setForeground(Color.red);
   	
	addKeyListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawRect(300,200,50,50);
	}
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
		}
	repaint();
	}
	public void keyReleased(KeyEvent e)
	{ 
	}
	public void keyTyped(KeyEvent e)
	{
	}
}



