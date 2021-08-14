import java.util.*;
public class Java_A8_Q4 
{
	public static void main(String[] args) 
	{
		List<String> list= new ArrayList<>(List.of("Predicate", "Supplier", "Interface", "Class", "Function"));
		System.out.println("Before removing: "+list);
		list.removeIf(x-> x.length()%2==1);
		System.out.println("After removing: "+list);
	}
}