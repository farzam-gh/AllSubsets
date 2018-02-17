import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class AllSubsets {

	public static void main(String[] args) {
		ArrayList<Integer> set=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements(Integer): ");
		for(int i=0;i<n;i++) {
			set.add(sc.nextInt());		
		}
		AllSubsets as=new AllSubsets();
		as.findSubsets(set);
	}
	void findSubsets(ArrayList<Integer> set){
		//produce all possible binary numbers
		    ArrayList<ArrayList<Integer>> allSubsets=new ArrayList<ArrayList<Integer>>();
		 
		    ArrayList<Integer> newSubset=new ArrayList<>();
		    int n=1<<set.size();		    
		    for(int i=0;i<n;i++){    
		        newSubset=convert(set,i);
		     allSubsets.add(newSubset);   
		    }  
		// convert binary numbers to set of elements
		    System.out.println("\nAll possible subsets: ");
		    System.out.print(allSubsets);
		}
		ArrayList<Integer> convert(ArrayList<Integer> set,int k){
		    ArrayList<Integer> list=new ArrayList<>();
		    int index=0;		    
		     for(int i=k;i>0;i>>=1) {		    	
		         if((i & 1)==1)
		             list.add(set.get(index));
		         index++;
		     }
		      return list;       
		               
		}

}
