import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class RandomGen implements Comparable<Object> {

	private LinkedList<Integer> q1 = new LinkedList<Integer>();
	private static Scanner in;

	private void generaterandomlist() {
		Random r = new Random();

		for (int i = 0; i < 100; i++) {
			q1.add(r.nextInt(100));
		}
		
		
		Collections.sort(q1);

	}

	public static void main(String[] args) {
		Integer key = null;
		RandomGen ran = new RandomGen();
		ran.generaterandomlist();

		for(Integer queue : ran.q1) {
			System.out.println(queue.intValue());
		}
			in = new Scanner(System.in);
		System.out.println("enter the key element");
		key=in.nextInt();
		binarySearch(ran.q1,key);	
		

	}
	public static void binarySearch(LinkedList<Integer> q1,int key) {
		Integer mid = 0;
		int low=0;
		int high=q1.size()-1;
		
		while(low<=high) {
			mid=(low + high)/2;
		
			if(q1.get(mid)==key) {
				mid=mid+1;
				System.out.println("element found at pos:"+mid);
				break;
				}
				else if(key>q1.get(mid)){
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			if(low>high) {
				System.out.println("element not found in the list!");
			}
			
			}
		
		
	}

	@Override
	public int compareTo(Object arg0) {
		
		return 0;
	}

}
