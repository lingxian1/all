package temp;
/*

 * 创建日期 2009-10-27
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */

/**
 * @author xxzxxz
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public class FolderAttribute {
	public String Names[]={"王二","里斯","张启","流域","朱丽","刘胜","徐地","鲁新","马新 ","礼花"};
	int select[]=new int[10];
	
	public FolderAttribute()
	{
		allNotSelected();
	}
	public String getName(int i)
	{
		return Names[i];
	}
	public int get_x_position(int i)
	{
		return 10+i*40;
	}
	public int isSelected(int i)
	{
		return select[i];
	}
	public void setSelected(int x,int y,int type)
	{
		int k=(x-10)/40;
		if(k>=0&&k<10&&y>40&&y<60)
		{
			
			   select[k]=type;
			
		}
			  
	}
	public void allNotSelected()
	{
		for(int i=0;i<select.length;i++)
		{
			select[i]=0;
		}
	}
}
