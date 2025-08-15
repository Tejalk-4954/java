package multi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamApi_Demo5 {
	
	public static void main(String[] args) {
		
		Function<StringBuffer,StringBuffer> fun =(ch)->{
			
			StringBuffer str=new StringBuffer(ch);
			
			char[] c=str.toString().toCharArray();
			for(int i=0;i<c.length;i++)
			{
				if(c[i]=='a')
				{
					c[i]='A';
				}
				else if(c[i]=='e')
				{
					c[i]='E';
				}
				else if(c[i]=='i')
				{
					c[i]='I';
				}
				else if(c[i]=='o')
				{
					c[i]='O';
				}
				else if(c[i]=='u')
				{
					c[i]='U';
				}
				
				
				else if(c[i]=='A')
				{
					c[i]='a';
				}
				else if(c[i]=='E')
				{
					c[i]='e';
				}
				else if(c[i]=='I')
				{
					c[i]='i';
				}
				else if(c[i]=='O')
				{
					c[i]='o';
				}
				else if(c[i]=='U')
				{
					c[i]='u';
				}
				
			}
			StringBuffer buffer=new StringBuffer();
			
			for(char cha:c)
			{
				buffer.append(cha);
			}
			return buffer;
		};
		
		
		List<StringBuffer> list =new ArrayList<StringBuffer>();
		
		list.add(new StringBuffer("hello..Welcome..to..usa"));
		
		list.stream().map(fun).forEach((i)->{System.out.println(i);});
	}

}
