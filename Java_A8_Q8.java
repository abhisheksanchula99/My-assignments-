import java.util.*;
public class Java_A8_Q8
{	
	public static class thread extends Thread
	{
		public void run() 
		{
			List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
			list.forEach(System.out::println);
		}
	}
	public static void main(String[] args) 
	{
		thread t= new thread();
		t.start();
	}
}