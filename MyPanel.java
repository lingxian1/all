package temp;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

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
public class MyPanel extends JPanel implements MouseListener{
	public MyPanel()
	{		
		addMouseListener(this);
		folderAttribute.allNotSelected();
	}
	FolderAttribute folderAttribute=new FolderAttribute();
	FolderFactory folderFactory=new FolderFactory();
	public void paintComponent(Graphics g)
	{
	     super.paintComponent(g);
	 	Folder folder;
	   for(int i=0;i<folderAttribute.Names.length;i++)
	   {
	   	folder=folderFactory.getFolder(folderAttribute.isSelected(i));
		folder.draw(g,folderAttribute.get_x_position(i),folderAttribute.getName(i),this);
	   }
	}
	public void mouseClicked(MouseEvent arg0) {
		int x=arg0.getX();
		int y=arg0.getY();
		if(arg0.getClickCount() == 2){
			folderAttribute.allNotSelected();
			folderAttribute.setSelected(x,y,2);	
		}else{
				folderAttribute.allNotSelected();
				folderAttribute.setSelected(x,y,1);
			  }
			     repaint();
			
		
		
	}
	
	public void mousePressed(MouseEvent arg0) {
		       
	}
	
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 */
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 */
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
