
public class ForLoops {
	
	public static void StringLoop() {
		String[] names = {"Sam", "Ben", "John"};
		
		 for(String str : names) {
		        System.out.println(str);
		    }
	}
	
	public static void IntLoop() {
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 ,20};
		
		for(int str : nums) {
			
			Even(str);
		}
		
	}
	
	public static boolean Even(int num) {
		
		boolean even = false;
		
		if (num % 2 == 0)
		{
			even = true;
			num = num * num * num;
			
			 System.out.println(num + "number is even");
			return even;	
			
		}
		else
		{
			num = num * num;
			 System.out.println(num + "number is Odd");
			return even;
		}
	}
	
	public static void main(String[] args) {
		
		IntLoop();
}
}
