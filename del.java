import java.io.*;
import java.util.*;        
class del
{
public static void main(String args[])                 
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
//char a[]=s.toCharArray();
StringBuffer sb=new StringBuffer();
sb.append(s);
for(int i=0;i<s.length()-1;i++)
{
if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
{
sb.deleteCharAt(i);
}
}
System.out.println("out:"+sb.reverse());
}
}