package temp;
import java.awt.Container;

import javax.swing.JFrame;

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
public class MyFrame extends JFrame {
  public MyFrame()
  {
  	setSize(420,300);
  	Container container=getContentPane();
  	MyPanel 	folder_Panel=new MyPanel(); 
	container.add(folder_Panel);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
  }
  public static void main(String[] args) {
	MyFrame folder_Frame=new MyFrame();
	
}
	
}
