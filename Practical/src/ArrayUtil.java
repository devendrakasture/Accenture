

	public class ArrayUtil {
		
		public  static void  printArray(int[] numbers) {
			int n=numbers.length;
			for(int i=0;i<n;i++) {
				System.out.println(numbers[i]+" "); 
			}
			System.out.println();
		}
//		public void  printAr(int[] arr) {
//			int n=arr.length;
//			System.out.println(n);
//			
//		}

		public  static void reverse(int[] numbers,int start,int end) {
			while(start< end) {
		int temp=numbers[start];                           //      3,5,7,9,2
		numbers[start]=numbers[end];
		numbers[end]=temp;
				
		
			start++;
			end--;
			}	
		}
		
			
			public int minArray(int[] arr) {
			
			int min=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<min) {
					min=arr[i];
				}
			}return min;
		}

			public void demo() {
				int[] numbers= {3,5,0,7,9,0,2};
				printArray(numbers);
				int n=numbers.length;
				System.out.println(n);
				
				
			}
			
		public static void main(String[] args){
//			int[] numbers= {3,5,7,9,2};
//			reverse(numbers,0,numbers.length-1);
//			printArray(numbers);
	ArrayUtil arrutil=new ArrayUtil();
//		
//			arrutil.printArray(new int[] {3,5,7,9,2});
////			System.out.println(arrutil.minArray(arr));
//
////			arrutil.printAr(new int[] {3,5,7,9,2});
	arrutil.demo();
//		}
}}