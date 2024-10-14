import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IntegerCacheProject{
    	// Variable Declaration
    	int minIntegerValue = -128; // Lower Limit of IntegerCache
    	int maxIntegerValue = 127; // Upper limit of IntegerCache

    	static Integer[] IntegerCache = new Integer[256]; // Static Integer Array

    	// Method
    	void checkValue(int x){
        	// Calculate index in the cache array
        	int index = x - minIntegerValue;

        	// Check if the value is within the cache range
        	if(x < minIntegerValue || x > maxIntegerValue){
            		// If not in range, print message
            		System.out.println("\n" + "The value is out of range of Integer cache, Therefore it will create a new object on heap with unique reference." + "\n");
        	}else{
            		// Check if the value is already in the cache
            		boolean foundInCache = false;

            		if(IntegerCache[index] != null && IntegerCache[index].equals(x)){
                		foundInCache = true;
            		}

            		if(foundInCache){
                		System.out.println("\n" + "Value is in the cache at index: " + index);
                		System.out.println("\n" + "The value is previously been stored in the integer cache.");
                		System.out.println("\n" + "Just the reference to the object that is in the integer cache on heap will be pointed to the variable in the main frame of the" + " java stack.");
                	
            			}else{
                		IntegerCache[index] = x;
                
                		printCache();
                		
                		System.out.println("\n" + "There is no element present in Integer Cache having value " + x);
                		System.out.println("\n" + "As a result, a new object has been created on the integer cache, and the variable in the java stack's main frame will point to its" + " reference.");
                		System.out.println("\n" + "Adding to cache at index: " + index);
                		System.out.println("\n" + "New object is being created");
                		System.out.println();
            			}
        		}
    		}


	void printCache() {
    		System.out.println("Integer Cache:" + "\n");
    		for(int i = 0; i < IntegerCache.length; i++){
        		if(IntegerCache[i] != null){
            			System.out.println("IntegerCache[" + i + "]: " + IntegerCache[i]);
        		}else{
            			 System.out.println("IntegerCache[" + i + "]: 0");
        		}
    		}
	}

    	public static void main(String[] args) throws IOException{
        	// Creating object of a class BufferedReader
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        	// Creating object of a class IntegerCacheProject
        	IntegerCacheProject cache = new IntegerCacheProject();
        	System.out.println("\n" + "****************************************************Welcome to an integer cache****************************************************" + "\n");

        	// Variable declaration
        	boolean exit = false;

        	System.out.println("\n" + "Explore Java's Integer Cache - Where integers are effortlessly managed, making your coding experience smoother and faster!" + "\n");
        	System.out.println();
        	System.out.println();

        	System.out.println("Range of Integer Cache\nLower Limit: -128\nUpper Limit: 127\n");
        	while(!exit){
            		System.out.print("\n" + "Enter the value : ");
            		String input = br.readLine();

            		// Check if the input is "n" to exit
            		if(input.equals("n") || input.equals("N")){
                		System.out.println("\n" + "\n" + "Exiting from the Integer Cache Project");
                		exit = true;
           		 }else{
                		int intValue = Integer.parseInt(input);
                		cache.checkValue(intValue);

                		System.out.println("\n" + "If you want to continue type 'y', else 'n'");
                		String continueInput = br.readLine();
                		if (continueInput.equals("n") || continueInput.equals("N")) {
                    		System.out.println("\n" + "\n" + "Exiting from the Integer Cache Project.");
                    		exit = true;
                		}
            		}
        	}
        System.out.println("\n" + "****************************************************Successfully implemented integer cache****************************************************");
    	}
}
