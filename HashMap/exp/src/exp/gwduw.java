package exp;
import java.util.Scanner;
public class gwduw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);
int t=s.nextInt();
while(t>0)
{
String m = s.next();
String n = s.next();
char ch[] = new char[m.length()];
for(int i =0 ;i<ch.length ; i++)
{
	if(m.charAt(i) == n.charAt(i))
{
	if(m.charAt(i) == 'B')
	
		ch[i] = 'W';
	else 
		ch[i]= 'B';

	} 
	else
	{
		ch[i] = 'B';
	}

}
System.out.print(ch);
}
		
	}

}
