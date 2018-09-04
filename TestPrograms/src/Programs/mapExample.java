package Programs;

import java.util.HashMap;
import java.util.Map;

public class mapExample {
public static void main(String[] args) {
	
	book b1=new book(101, "my life", "akash");
	book b2=new book(102, "i will survive", "magotra");
	
	HashMap<Integer, book> hashbook=new HashMap<>();
	hashbook.put(1, b1);
	hashbook.put(2, b2);
	
	for(Map.Entry<Integer,book> ent:hashbook.entrySet())
	{
int key=ent.getKey();
book b=ent.getValue();

System.out.println(key +" details");
System.out.println(b.id+","+b.name+","+b.author);
	}
}
}
