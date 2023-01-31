
package Ch_01;

// (Approximate pi) pi can be computed using the following formula:
// pi = 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11))
// pi = 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13) )

public class Exercise_01_07 {
    public static void main(String[] args) {
        
        System.out.println("Approximate P1 = 4 * ((1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11)) = " + 
                4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) );
        System.out.println("Approximate p2 = 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13)) = " +  
                4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13)) );
        
        
    }
}
