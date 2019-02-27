package ac.za.cput;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;



import static org.junit.Assert.*;

public class CollectionsTest {

   /* @Test
    public void listString() {
        List<String> a1 = Arrays.asList("a","b","c");
        List<String> a2 = Arrays.asList("a","b","c");

        Assert.assertEquals(a1, a2);

        assertThat(a1, hasItem("b"));

        assertThat(a1.size(), is(3));

    }

    @Test
    public void intSet() {
        int count[] = {1,2,3,4,5};
        Set<Integer> set = new HashSet<Integer>();

        int countB[] = {12,34,56,78,91};
        Set<Integer> setB = new HashSet<Integer>();

        try {
            for(int i=0; i<count.length;i++) {
                set.add(count[i]);
                setB.add(countB[i]);
            }
        }catch(Exception e){
            System.out.println("Exception "+e);
        }
        assertThat(set.equals(setB), is(false));

    }

    @Test

    public void stringMaps() {
        Map m1 = new HashMap();

        m1.put("A", "1");
        m1.put("B", "2");
        m1.put("C", "3");
        m1.put("D", "4");

        Map m2= new HashMap();

        m2.put("B", "2");
        m2.put("C", "3");
        m2.put("A", "1");
        m2.put("D", "4");

        assertThat(m1, is(m2));
    }
    */
private Collections collections;

@Before
public void setUp() throws Exception {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    collections = (Collections) ctx.getBean("collections");
}
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testHash() throws Exception {
        int count[] = {1,2,3,4,5};
        Set<Integer> set = new HashSet<Integer>();

        int countB[] = {12,34,56,78,91};
        Set<Integer> setB = new HashSet<Integer>();

        try {
            for(int i=0; i<count.length;i++) {
                set.add(count[i]);
                setB.add(countB[i]);
            }
        }catch(Exception e){
            System.out.println("Exception "+e);
        }
        assertThat(set.equals(setB), is(false));
    }
    @Test
    public void testMaps() throws Exception {
        Map m1 = new HashMap();

        m1.put("A", "1");
        m1.put("B", "2");
        m1.put("C", "3");
        m1.put("D", "4");

        Map m2= new HashMap();

        m2.put("B", "2");
        m2.put("C", "3");
        m2.put("A", "1");
        m2.put("D", "4");

        assertThat(m1, is(m2));
    }
    @Test
    public void testList() throws Exception {
        List<String> a1 = Arrays.asList("a","b","c");
        List<String> a2 = Arrays.asList("a","b","c");

        Assert.assertEquals(a1, a2);

        assertThat(a1, hasItem("b"));

        assertThat(a1.size(), is(3));
    }
}