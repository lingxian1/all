package temp;
import java.awt.Color;

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
public class FolderFactory {
Folder selFolder,unselFolder,picFolder;
public FolderFactory()
{
	selFolder=new Folder(Color.blue);
	unselFolder=new Folder(Color.yellow);
	picFolder=new Folder( Getpic.getpic());
}
public Folder getFolder(int type)
{
	if(type==1)return selFolder;
	if(type==2)return picFolder;
	else return unselFolder;
}
}
