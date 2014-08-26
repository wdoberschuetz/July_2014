
public class ArraysIssues {

 public static void main(String[] args) {
  
  int[] arrayOfInts = {2222,10, 4000, 891, 100};

  int index = 0;
  int smallest = 0;
 
 //public void smallestNumber(){
  
  
  for(int number : arrayOfInts){
  
   smallest = arrayOfInts[index];
   if (number < smallest){
  
    number = smallest;
    index++;
   } 
   
  }
 
  System.out.println("The smallest number is: " + smallest);
 
 }
 
}