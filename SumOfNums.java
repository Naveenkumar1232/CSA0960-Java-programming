package sumofnums;
	import java.util.Scanner; 

	public class SumOfNums {

		    public static void main(String[] args) {
		        Scanner console = new Scanner(System.in);
		        int sum = 0;
		        int count = 0;

		       
		        do {
		            System.out.print("Enter an integer: ");
		            int num = console.nextInt();
		            sum += num; 
		            count++;    
		        } while (count < 10);

		        
		        System.out.println("The sum of the 10 integers is " + sum);

		        console.close(); 
		    }
		}


