package temp;

import java.awt.Image;
import java.awt.Toolkit;

public class Getpic {
  public static Image getpic(){
	  Image img;
	  img=Toolkit.getDefaultToolkit().
	  getImage(Getpic.class.getResource("1.jpg").getFile()).	  
	  getScaledInstance(20,22,Image.SCALE_DEFAULT);
	 //System.out.println(Getpic.class.getResource("1.jpg").getFile());
	  return img;
  }

}
