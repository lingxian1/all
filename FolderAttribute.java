package temp;
/*

 * �������� 2009-10-27
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */

/**
 * @author xxzxxz
 *
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public class FolderAttribute {
	public String Names[]={"����","��˹","����","����","����","��ʤ","���","³��","���� ","��"};
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
