package basic;

public class multiplesOf3And5 {
	public static void main(String[] args) {
		
		int n = 100; // Change this value to the desired range
        System.out.println("Multiples of 3 and 5 from 1 to " + n + ":");
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i + " ");
            }
    
        }
        int n1 = 100; // Change this value to the desired range
        System.out.println("Multiples of 3 or 5 from 1 to " + n1 + ":");
        
        for (int i = 1; i <= n1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
    }
	
	
	
}

