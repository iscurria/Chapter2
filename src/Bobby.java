public class Bobby {
    // encapsulation
    private String name;
    private int age; // primitive data: holdover from C
    private double coolnessFactor; // camelCase

    /*
    primitives from C/C++
    int (short, int, long), double (float), boolean, char
     */
    private final char duh = 'd';

    /**
     * Javadoc comment
     * constructor -- build an object of this class
     *
     */
    /**
     * Parameterized constructor for class Bobby
     * @param n name
     * @param a age
     * @param c coolness
     */
    public Bobby(String n, int a, double c) {
        name = n; //assignment operator - right-associative
        age = a;
        coolnessFactor = c;
    }

    // accessor methods
    public String getName()     {   return name;   }
    public int getAge()         {   return age;    }
    /**
     * public return of coolnessFactor
     * @return a double representing how cool this Bobby is
     */
    public double getCoolness() {   return coolnessFactor;   }

    public String toString() {
        return name + " is " + age + " years old and is " + (coolnessFactor*100) + " % cool";
    }

    public static void main(String[] args) {
        Bobby b = new Bobby("Bob", 18, .88);
        System.out.println(b.toString());
    }
}
