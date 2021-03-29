import java.util.*;  

class Person implements Comparable<Person> {
    int weight;
    int height;
    String name;
    
    public Person(int weight,int height,String name) {
        this.weight=weight;
        this.height=height;
        this.name=name;
    }

    public int compareTo(Person p) {  
        if(weight>p.weight){  
            return 1;  
        }
        else if(weight<p.weight) {  
            return -1;  
        }
        else { 
            if(height>p.height) {
                return 1;
            }
            else if(height<p.height){
                return -1;
            }
            else{
                return 0;
            }
          
        }  
    }  
}


public class CF1 {
    public static void main(String[] args) {
        Set<Person> treeSet=new TreeSet<Person>();
        Person p1=new Person(50,150,"W2H1");
        Person p2=new Person(48,162,"W1H2");
        Person p3=new Person(50,170,"W2H3");

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);

        for(Person p:treeSet){
            System.out.println(p.name);
        }
    }
}
