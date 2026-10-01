package methods;

import java.util.*;
public class Lamda_With_Comparator 
{
	public static void main(String []args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>(List.of(10,25,13,15));
		Comparator<Integer> cmp=(o1,o2) -> o2-o1;
		Collections.sort(list,cmp);
		System.out.println(list);
	}
}
