package temp;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.InputStream;

/*
 * Created on 2007-1-16
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

/**
 * @author xxzxxz
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public  class Folder {
	private Color color;
	private int w=20;
	protected int h=22;	
	protected int y_position=40;
	protected int x_position;
	protected String name;
	Image image;
	char flag=0;

	public Folder()//内部Color color
	{
		
	}
	public Folder(Color color)//内部Color color
	{
		this.color=color;
	}
	public Folder(Image image){
		this.image=image;
		flag=1;		
	}
	public void draw(Graphics g,int x,String title,MyPanel p)//外部数据
	   {
		   x_position= x;
		   name=title;
		   g.setColor(Color.black);
	       g.drawString(title,x_position,y_position+h+15);
		   if(flag==0){
		   g.drawRect(x,y_position,w,h);
		   g.setColor(color);
		   g.fillRect(x_position,y_position,w,h);
		   }
		   if(flag==1){
			   g.drawImage(image,x_position,y_position,p);
		   }
       
	   }
}
