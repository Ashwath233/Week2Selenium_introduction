package ass_week2;

public class Find_missingNo {

	
	public static void main(String[] args) {
		
int[] numbers = {1, 4, 3, 2, 8, 6, 7};
        
        
        int totalNumbers = numbers.length + 1;
        
                int expectedTotal = (totalNumbers * (totalNumbers + 1)) / 2;
        
      
        int actualTotal = 0;
        for (int number : numbers) {
            actualTotal = actualTotal + number;
        }
        
       
        int missingNumber = expectedTotal - actualTotal;
        
        System.out.println("Missing Number: " + missingNumber);
	    }
	
	}

