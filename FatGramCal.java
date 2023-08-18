import java.util.Scanner;
public class FatGramCal{
    public static void main( String args[] )
    { 
      Scanner input = new Scanner (System.in);
     //Calling getFat function
      System.out.println("Please enter the number of fat grams: ");
      int fat = input.nextInt();
      getFat(fat);
      
     ///for function getCalories Function
      //formula for the result of fat * x
      int x = fat*9;
      
      System.out.println( "Please enter the number of calories: ");
      int calories = input.nextInt();
      
      getCalories(calories, x);
      
     ///for module showPercent
      // formula for fat percent
     double percent = ((x)/calories);
      
      showPercent(percent);
    
    }
  
    public static int getFat( int fat)
    {//check if fat is a positive number
      Scanner type = new Scanner (System.in);
      if (fat >= 0)
        return (fat);
      else
        while (fat < 0 ){
            System.out.println( "The number of fat grams cannot be less than 0." );
            System.out.println("Please enter the number of fat grams: ");
            fat = type.nextInt();}
      return (fat);  
    }
        
    
      
    
    public static int getCalories(int calories, int x)
    {//check is calories is a positive number and greater or equal to fat grams * 9
     Scanner type = new Scanner (System.in);
        if (calories >= 0 && calories >= x)
        return(calories);
        else{
            while (calories < x){
                System.out.println("The number of calories cannot be less than the number of fat grams * 9");
                System.out.println("Please enter the number of calories: ");
                calories = type.nextInt();}
            }
     
        return(calories);
    }
    
    public static double showPercent( double percent)
    {//calculation so that percent shows as whole number in output
        double newPercent = percent*100;
        //display fat percentage
        System.out.println("The percentage of calories from fat is " + newPercent );
     //display message for low fat
        if (percent < 0.3)
        System.out.println("That food item is considered 'low fat'/");
        
        return(percent);
    }
    
}
