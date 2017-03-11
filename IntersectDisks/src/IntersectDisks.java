//import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import org.apache.commons.lang3.ArrayUtils;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//import org.apache.commons.lang.ArrayUtils;

public class IntersectDisks {
	//protected static int j=0;
	int[] a;

	public IntersectDisks(){
		a = new int[] {3, 5, 1, 4, 2,6,3,1,3,5,6,7,6,3,6,9,5,34,6,54,32,87,99,4,34,5,3,34,87,5,4,3,6,8};	
		//calc3(a);
		//calc2(a);
		//calc(a);

	}

	
	public int calc3(int[] a){
		
		//int[] g ;
		
	 Arrays.sort(a);
	 int j=0;
	 int t=0;
	 for (int i=a.length-1; i>0; i--){
		 t = 2 * a[i];
		 if (a.length < i + a[i-1]){
			 t = a[i];
		 }else;
		 
		 if ((j = j + (2 * t))< 1000);
		 
			else {
				 System.out.println("j= "+ j + "\n");
			System.out.println("Sort array"+ Arrays.toString(a) + "\n");
				return -1;
			}
		 
	 }
	

		return j;
		//return -1;
	}
	
	
	

	public int calc2(int[] a){
		boolean swapped = true;
	    int j = 0;
	    int tmp;
	    while (swapped) {
	        swapped = false;
	        j++;
	        for (int i = 0; i < a.length - j; i++) {
	            if (a[i] > a[i + 1]) {
	                tmp = a[i];
	                a[i] = a[i + 1];
	                a[i + 1] = tmp;
	                swapped = true;
	            }
	        }
	    }
	    
	    
	    int d=0;
		 int t=0;
		 for (int i=a.length-1; i>0; i--){
			 t = 2 * a[i];
			 if (a.length < i + a[i-1]){
				 t = a[i];
			 }else;
			 
			 if ((d = d + (2 * t))< 1000);
			 
				else {
					 System.out.println("d= "+ d + "\n");

					    
						System.out.println("Swapped Sort array"+ Arrays.toString(a) + "\n");
					
					return -1;
				}
			 
		 }


		
		
		 return d;
		//return -1;
	}
	
	
	public int calc(int[] a){


		//  List<Integer> b = Arrays.asList(ArrayUtils.toObject(a));
		List<Integer> b = new LinkedList<Integer>(Arrays.asList(ArrayUtils.toObject(a)));

		//    List<Integer> b = IntStream.of(a).boxed().collect(Collectors.toList());

		//   List<int[]> b = Arrays.asList(a);
		/*     List<Integer> ints = Stream.of(12, 72, 54, 83, 51).collect(Collectors.toList());
       System.out.println("the list: ");
       ints.forEach((i) -> {
           System.out.print(i + " ");
       });
		 */   

		int j=0;
		Integer c=0;
		do { 


			Integer u;

			//  System.out.println(Collections.min(b));
			System.out.println(u=Collections.max(b));
			//   while(b.contains(u))
			//   {
			int i=b.indexOf(u); 
			System.out.println("the index of max:"+b.indexOf(u)+ "\n");

			//  System.out.println(b + "\n");
			//  }       





			Optional<Integer> max1 = b.stream().reduce(Integer::max);
			Optional<Integer> max2 = b.stream().max(Comparator.naturalOrder());
			OptionalInt max3 = b.stream().mapToInt(p->p).max();
			System.out.println("max1: " + max1.get() + ", max2: " 
					+ max2.get() + ", max3: " + max3.getAsInt());

			//    Integer minNumber = b.stream().min(Comparator.comparing(y -> y)).get();
			Integer maxNumber = b.stream().max(Comparator.comparing(y -> y)).get();

			//  System.out.println("Min number is " + minNumber);
			System.out.println("Max number is " + maxNumber);

			System.out.println(b + "\n");
			b.set(i, -1);
			b.remove(i);
			j++;
			if ((c = 2*u + c)< 1000);
			else break;
		}while (j<a.length);
		System.out.println(c + "\n");
		return -1;

	}
	public static void main(String[] args) {
		IntersectDisks n = new IntersectDisks();
	} 

}