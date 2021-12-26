package appletdemo;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
//import processing.core.PApplet;
@SuppressWarnings("serial")
public class intro1 extends Applet implements Runnable,KeyListener,ActionListener 
{//@SuppressWarnings("rawtypes")
	//AudioClip chip;
	int width=getWidth();
	int height=getHeight();
	double z;
	Image img,img1,img2,img3,img4,img6,img5;
	ArrayList<intro1>M;
int z1;
int dis=0;
int a,count=0;
int a1[];
double score=0;
int p=1000,q=550;
int x,y,yspeed=0;
double gravity=1.8;
Thread T1=new Thread(this);
//cactas c1;
public void init()
{	
	Font f1=new Font("Dialog",Font.BOLD ,30);
	setFont(f1);

	a1=new int[100];
	resize(1000,800);
Color c1=new Color(74,197,255);
img=getImage(getDocumentBase(),"back.png");
img1=getImage(getDocumentBase(),"dino.jpg");
img2=getImage(getDocumentBase(),"cac4.png");
img3=getImage(getDocumentBase(),"cac2.png");
img4=getImage(getDocumentBase(),"dino.jpg");
//img4=getImage(getDocumentBase(),"cac.png");

img5=getImage(getDocumentBase(),"ori.png");
img6=getImage(getDocumentBase(),"cloud.png");

setBackground(c1);
	Button start = new Button("      START       ");	
add(start);
	requestFocus();
	M=new ArrayList<intro1>();

	start.addActionListener(this);
	addKeyListener(this);
//resize(600,600);
x=50;
y=height-100;
T1.start();
}
public intro1()
{
	//z=2;
	this.x=1000;
	this.y=550;
	}
public void move1()
{//z1=2;
	this.x-=13;
	
}
public void element()
{
p-=13;
if(p<0)
{
	p=1000;
}
}

public void paint(Graphics g)
{
//c1=new cactas();
//drow1(g);
	//if(M.size()==0)
	//{
		//	g.drawImage(img,0,0,1200,800,this);

	//}	

//g.setColor(Color.blue);
g.drawImage(img1,x,y,130,120,this);
//g.drawRect(x, y, 130, 120);
g.drawLine(0, 620, 1200, 620);
g.setColor(Color.gray);
g.drawString("SCORE="+a, 800, 200);

//g.fillRect(x,y, 100, 100);
//g.drawString("z="+z, 100,100);
//g.drawString("size="+M.size(), 300,100);
//g.drawString("z1="+z1, 400,100);
drow1(g);
draw(g);
//collision();
/*
//g.fillRect(200,400, 100, 100);
for(int i=1;i<M.size();i++)
{
	//z=4;
	dis=M.get(i).x -M.get(i-1).x;
	if(dis>200)
	{
		//M.get(i).drow1(g);
		//M.get(i).draw(g);
		//g.setColor(Color.BLACK);
		//g.fillRect(M.get(i).x,M.get(i).y,120,100);
		g.drawImage(img3,M.get(i).x,M.get(i).y,120,100,this);
		a=(int) (1+(Math.random()*(4-1)));
		z1=a;
switch(a)
{
case 2:	g.drawImage(img2,M.get(i).x,M.get(i).y,70,100,this);
break;
case 1:g.drawImage(img3,M.get(i).x,M.get(i).y,120,100,this);
break;
case 3:g.drawImage(img4,M.get(i).x,M.get(i).y,100,100,this);
break;
	}
	}
	// 
	 M.get(i).move1();
}
*/

//g.drawString("count="+count, 100,100);
//g.drawString("z="+z, 100,100);

//repaint();
}
public void draw(Graphics g)
{	//g.drawString("hii", 100, 100);
g.setColor(Color.black);
g.drawImage(img6, p, q-500, 100,80,this);
g.drawImage(img6, p-400, q-500, 120,100,this);
g.drawImage(img6, p-800, q-500, 100,80,this);

g.fillOval(p-50, q+70,5, 5);
g.fillOval(p-150, q+60,5, 5);
g.fillOval(p-170, q+70,5, 5);
g.fillOval(p-120, q+60,5, 5);
g.fillOval(p-195, q+75,5, 5);
g.fillOval(p-250, q+70,5, 5);
g.fillOval(p-350, q+75,5, 5);
g.fillOval(p-200, q+60,5, 5);
g.fillOval(p-450, q+70,5, 5);
g.fillOval(p-550, q+60,5, 5);
g.fillOval(p-560, q+75,5, 5);
g.fillOval(p-650, q+70,5, 5);
g.fillOval(p-750, q+60,5, 5);
g.fillOval(p-850, q+70,5, 5);

	//z1=4;
	//g.setColor(Color.black);
	//g.drawImage(img2,this.x,this.y,70,90,this);
	//g.drawImage(img,0,0,1200,800,this);
	//g.fillRect(this.x,this.y, 70, 100);
	
	}

public void drow1(Graphics g)
{
	for(int i=1;i<M.size();i++)
	{
		//z=4;
		//if(i!=0)
		//{
		dis=M.get(i).x - M.get(i-1).x;
	//	if(dis>300)
		//{
			//a1[count]=i;
		//	count++;
			//M.get(i).drow1(g);
			//M.get(i).draw(g);
			//g.setColor(Color.BLACK);
			//g.drawRect(M.get(i).x,M.get(i).y,60,70);
		g.drawImage(img4,M.get(i).x,M.get(i).y,60,70,this);
					M.get(i).move1(); 
		//collision();

	}

	
	}
public void jump()
{		
	if(y==500)
	{
		if(dis>300)
	yspeed=-30;
		if(dis<300)
	yspeed=-38;		
	}
	//z++;

}
void move()
{	
	//if(z!=29)
	//{//yspeed=-5;
		y +=yspeed;
		yspeed +=gravity;
		if(y<0)
			y=0;
		if(y>500)
			y=500;
		//y=constrain(y,0,x);
		//y=
	//repaint();
//	}
      
	
}
      

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	requestFocus();	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	int code=e.getKeyCode();
	switch(code)
	{
	case 32://z=2;
		jump();
		//repaint();
	}

}
@Override
public void keyReleased(KeyEvent e) {
	
}
@Override
public void keyTyped(KeyEvent e) {
	
}
@SuppressWarnings({ "static-access", "unchecked" })
@Override
public void run() {
	for(;;)
	{
		//if(z!=6)
		genarete();
		collision();
	
		move();
	element();
	
	//T1.sleep(200);
	try {
		T1.sleep(15);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}	    
score=(score+0.05);
a=(int) score;
	repaint();
		
}//t1.sleep(50);
}
void del()
{
for(int i=0;i<count;i++)
{//g.drawString("hii", 100, 100);
	M.remove(a1[i]);
//count--;
}
}
void genarete()
{
	//a=(int) (1+(Math.random()*(4-1)));
	//z=(int)(1+(Math.random()*(10-1)));
	//z=Math.random()%1000;
	//if(z>0.55 && z<0.56)
	if(Math.random()<0.01)
	{
		M.add(new intro1());
	}
	}
@SuppressWarnings({ "static-access", "deprecation" })
void collision()
{
	//Rectangle r2 = null;
	try
	{
	for(int i=0;i<M.size();i++)
	{
		//j=a1[i];
		Rectangle r2=new Rectangle(M.get(i).x,M.get(i).y,60,70);
	
		Rectangle r1=new Rectangle(x, y, 130, 120);
	if(r1.intersects(r2))
	{
		try {
		T1.stop();
		}
		catch(Exception e)
		{
			
		}
		//System.out.print(" collide ");
		}
 	}
	}

catch(Exception e)
	{
	System.out.print(e);
	}
}
}