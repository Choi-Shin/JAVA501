package p03.object;

import java.util.HashMap;
//Map<key, value>: 자료가 Key와 Value쌍으로 되어 있는 경우에 사용 자료구조
public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key, String> h = new HashMap<>();
		 
        h.put(new Key(1), new String("홍길동"));
        
        String V =	h.get(new Key(1));
        System.out.println(V);//null
		
System.out.println("-----------------");		
		
       //개발자 hashmap
		 HashMap<String, Integer> h2 = new HashMap<>();
		 
         h2.put(new String("홍길동"),20 );
         
         int V2 =	h2.get("홍길동");
         System.out.println(V2);//20
         System.out.println(h2.hashCode());
	}
  
   
}
