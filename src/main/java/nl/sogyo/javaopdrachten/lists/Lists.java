import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
public class Lists {
	
	public static void bubbleSort(int [] array, int length){
		for (int i = 0; i < length - 1; ++i){
			for(int j = 0; j < length - i - 1; ++j){
				if(array[j+1] < array[j]){
					int swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
	}
	
	public static void main (String[] args)  {
	int[] list = new int[10];
	Random nr = new Random();
	int length = list.length;
	for(int i = 0; i < length; i++) {
		list[i] = (int)(Math.random() * 100);
		}
	System.out.println(Arrays.toString(list));
	int highest = list[0];
	int secondLowest = 100;
	int lowest = list[0];
	ArrayList<Integer> even = new ArrayList<>();
	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
	ArrayList<Integer> list3 = new ArrayList<>();
	ArrayList<Integer> list4 = new ArrayList<>();
	for(int i=0; i < length; i++) {
		if(list[i] > highest) {
			highest = list[i];
			}
		if(list[i] < lowest) {
			secondLowest = lowest;
			lowest = list[i];
			}
		else if(list[i] < secondLowest) {
			secondLowest = list[i];
			}
		if(list[i] % 2 == 0) {
			even.add(list[i]);
			list1.add(list[i]);
			}
		if(list[i] % 3 == 0) {
			list2.add(list[i]);
			}
		if(list[i] % 5 == 0) {
			list3.add(list[i]);
			}
		if(list[i] % 2 != 0 && list[i] % 3 != 0 && list[i] % 5 != 0) {
			list4.add(list[i]);
			}
		}
	System.out.println("The highest value in the list is " + highest);
	System.out.println("The sum of the two lowest values in the list is " + lowest + " + " + secondLowest + " = " + (lowest + secondLowest) );
	System.out.println("The even values in the list are " + even);
	System.out.println("List1 contains " + list1);
	System.out.println("List2 contains " + list2);
	System.out.println("List3 contains " + list3);
	System.out.println("List4 contains " + list4);
	bubbleSort(list, length);
	System.out.println("After sorting the array, it looks like this: " + Arrays.toString(list));
	}
}