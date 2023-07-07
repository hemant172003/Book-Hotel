1.	 import java.net.InetAddress;
2.	public class IP
3.	{
4.	    public static void main(String args[]) throws Exception
5.	    {
6.	        InetAddress IP = InetAddress.getLocalHost();
7.	        System.out.println("IP of my system is= "+IP.getHostAddress());
8.	    }    
9.	}
