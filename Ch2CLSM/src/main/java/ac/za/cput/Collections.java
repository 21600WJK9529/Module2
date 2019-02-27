package ac.za.cput;

import java.io.IOException;
import java.util.*;

public class Collections implements interfaceCol{

    public void listString() {

        List<String> a1 = Arrays.asList("a","b","c");
        List<String> a2 = Arrays.asList("a","b","c");


          System.out.println(a1);
          System.out.print(a2);

      System.out.println("\n");
}
    public void intSet(){
        int count[] = {1,2,3,4,5};
        Set<Integer> set = new HashSet<Integer>();
        try {
            for(int i=0; i<count.length;i++) {
                set.add(count[i]);
            }
        }catch(Exception e){
             System.out.println("Exception "+e);
            }
        System.out.println(set+"\n");
    }
    Map m1 = new HashMap();
    Map m2= new HashMap();
    public void stringMaps(){

        m1.put("A", "1");
        m1.put("B", "2");
        m1.put("C", "3");
        m1.put("D", "4");

        m2.put("B", "2");
        m2.put("C", "3");
        m2.put("A", "1");
        m2.put("D", "4");

        System.out.println(m1);
    }
}
