import java.util.Scanner;
public class FatGramCal{
    public static void main( String args[] )
    { 
      Scanner input = new Scanner (System.in);
     //Calling getFat function
      System.out.println("Please enter the number of fat grams: ");
      double fat = input.nextDouble();
      getFat(fat);
      
     ///for function getCalories Function
      //formula for the result of fat * x
      
      
      System.out.println( "Please enter the number of calories: ");
      double calories = input.nextDouble();
      
      getCalories(calories,fat);
      
     ///for module showPercent
      // formula for fat percent
     
      
      showPercent(fat,calories);
    
    }
  
    public static double getFat( double fat)
    {//check if fat is a positive number
      Scanner type = new Scanner (System.in);
      Scanner type2 = new Scanner (System.in);
      if (fat >= 0)
        return (fat);
      else
        while (fat < 0 ){
            System.out.println( "The number of fat grams cannot be less than 0." );
            System.out.println("Please enter the number of fat grams: ");
            //double newFat = type.nextDouble();
            fat = type2.nextDouble();
            }
            return(fat);
        
    }
        
    
      
    
    public static double getCalories(double calories, double fat)
    {//check is calories is a positive number and greater or equal to fat grams * 9
     Scanner type = new Scanner (System.in);
     Scanner type2 = new Scanner (System.in);
        if (calories >= 0 && calories >= (fat*9))
        return(calories);
        else{
            while (calories < (fat*9)){
                System.out.println("The number of calories cannot be less than the number of fat grams * 9");
                System.out.println("Please enter the number of calories: ");
                //double newCalories = type.nextDouble();
                calories = type2.nextDouble();
                }
                return(calories);}
            
     
        
    }
    
    public static double showPercent(double fat, double calories)
    {//calculation so that the decimal is converted into percentage in output
        double newPercent = ((fat*9)/calories)*100;
        //display fat percentage
        System.out.println("The percentage of calories from fat is " + newPercent );
     //display message for low fat
        if ((fat*9)/calories < 0.3)
        System.out.println("That food item is considered 'low fat'/");
        
        return(newPercent);
    }
    
}
