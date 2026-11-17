package main;
import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static Queue<String> queue = new LinkedList<>();

	public static void main(String[] args) {
		int choice;
		
		do{
			System.out.println("===PERMUTATIONS AND COMBINATIONS===");
			System.out.println("[1] Add Elements");
			System.out.println("[2] Display Queue");
			System.out.println("[3] Generate Permutations");
			System.out.println("[4] Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice){
				case 1:
					addElements();
					break;
				case 2:
					displayQueue();
					break;
				case 3:
					generatePermutations();
					break;
				case 4:
					System.out.println("\n===Program terminated===");
					break;	
				default:
					System.out.println("\n===Invalid input===\n");
			}
			
		} while(choice!= 4);

	}
	
	static void addElements(){
		System.out.println("\n===ADD ELEMENTS===\n");
		System.out.print("Enter five elements: ");
		String[] elements = sc.nextLine().split(" ");
		
		if(elements.length != 5){
			System.out.println("\n===Invalid input. Please enter five elements===\n");
			return;
		}
		
		for(int i = 0; i < elements.length; i++){
			queue.add(elements[i]);
		}
		
		System.out.println("\n===Elements successfully added===\n");
	}
	
	static void displayQueue(){
		if(queue.isEmpty()){
			System.out.println("\n===Queue is empty. Please add elements first===\n");
			return;
		}
		
		System.out.println("\nQueue: " + queue + "\n");
		
		System.out.println("Dequeueing two elements...");
		queue.poll();
		queue.poll();
		
		System.out.println("Updated Queue: " + queue + "\n");
	}
	
	static void generatePermutations(){
		if(queue.isEmpty()){
			System.out.println("\n===Queue is empty. Please add elements first===\n");
			return;
		}
		System.out.println("\n===PERMUTATIONS===");
		List<String> items = new ArrayList<>(queue);
		int n = items.size();
		
		System.out.print("Enter number of elements to arrange: ");
		int r = sc.nextInt();
		sc.nextLine();
		
		if(r < 1){
			System.out.println("\n===Invalid Input (Cannot be lower than 1)===\n");
			return;
		} else if (r > n){
			System.out.println("\n===Invalid Input (Cannot be greater than queue size)===\n");
			return;
		}
		
		permCount = 0;
		System.out.println("\nGenerated Permutations:");
		permute(items, r, new boolean[n], "");
		System.out.println("\nTotal Permutations: " + permCount + "\n");
	}
	
	static int permCount;
	static void permute(List<String> items, int r, boolean[] used, String current){
		if (r == 0){
			System.out.println(current);
			permCount++;
			return;
		}
		
		for(int i = 0; i < items.size(); i++){
			if(!used[i]){
				used[i] = true;
				permute(items, r - 1, used, current + items.get(i));
				used[i] = false;
			}
		}
	}

}
