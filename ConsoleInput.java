import java.io.*;
/**
*��� �������� �� �������� ���� �����
*/
public class ConsoleInput
{
	public static void main(String args[])
	{
		ConsoleTools ct=new ConsoleTools();
		//String s = ct.ReadString();
		//System.out.println(s);



	String s1 = new String("tei mesologgiou");
	String s2 = new String("tei mesologgiou");
	boolean b1=s1.toString()==s2.toString();
	boolean b2=s1.equals(s2);
	String  sa=String.valueOf(b1);
	String sb=String.valueOf(b2);
	System.out.println(sa+" "+sb);

	}
}

/**
*����� �� �������� �������� - ���� �� ����� ���� �������� ��������� ��� ������������
*/
class ConsoleTools
{
	BufferedReader reader;

	public ConsoleTools()
	{

	}
	/**
	*�������� ��� �� ������������ �� �� ��������� �� ��� ��������� String
	*/
	public String ReadString(){
		reader=new BufferedReader(new InputStreamReader(System.in));
		String Input=null;
		try
		{
			Input=reader.readLine();
		}
		catch(IOException ex)
		{
			System.out.println("Problem");

		}
		return Input;
	}

}


