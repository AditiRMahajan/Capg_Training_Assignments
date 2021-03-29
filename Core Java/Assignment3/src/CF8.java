import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
  
class CF8 {
    public static void main(String args[])
    {
        CopyOnWriteArrayList<Integer> list
            = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 2, 5, 8 });
        Iterator<Integer> fastSafe = list.iterator();
        while(fastSafe.hasNext()) {
            Integer num = (Integer)fastSafe.next();
            System.out.println(num);
            if(num == 5)
                // This will not print, hence it has created separate copy
                list.add(14);
        }
    }
}