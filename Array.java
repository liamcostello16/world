
public class Array {

	
    public static void process() {
    	
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		 for(int i = 0; i < nums.length; i++) {
			 System.out.println(nums[i]);
		 }
    }
    

    public static void process2() {
    	int [] nums = new int[10];
    	
    	for(int i = 0; i < nums.length; i++) {
    		
    		nums[i] = i;
			 System.out.println(nums[i]);
		 }
    	
    	for(int i = 0; i < nums.length; i++) {
    		nums[i] = i * 10;
    		 System.out.println(nums[i]);
    	}
    }
    
	public static void main(String[] args) {
			process2();
	}
}
