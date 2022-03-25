package Duplicate Characters;

public class Gg {

  public static void main(String[] args) {
  String string1 = "Great responsibility";
  int count;
       //Converts Given string into character array
        char string[] = string1.toCharArray();
        
        
        System.out.println("Duplicate  in a gven string ");
        System.out.println();
        //Counts each  present in the string
        for(int i =0; i<string.length; i++){
          
          count=1
          for(int j = i+1;j
<string.length; j++){
  if(string[i] ==string[j] && string[i] !=''){
    count++;
    //Set string[j] to 0 to avoid  printed visited character string[j] ='0')
    
    
    System.out.println(string[i]);
  }
}
        }
   
  }
}
