class Singleton
{
    // static variable instance of type Singleton
    private static Singleton instance = null;
  
    // variable of type String
    public String s;
  
    // private constructor restricted to this class itself
    private Singleton()
    {
        s = "Hello I am Aditi Mahajan";
    }
  
    // static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();
  
        return instance;
    }
}
  
// Driver Class
class SingletonEx
{
    public static void main(String args[])
    {
        // instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();
  
        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();
  
        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();
  
        // changing variable of instance x
        x.s = (x.s).toUpperCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
  
       
    }
}