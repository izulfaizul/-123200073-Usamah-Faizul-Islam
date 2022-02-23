package konversi;
import java.util.Scanner;

public class suhu {
    Scanner scan = new Scanner(System.in); //membuat scanner baru dengan nama scan
    float c;

    public suhu(float c)
        {
            this.c = c;
        }
   
    float kelvin(){
       return   (float) (c + 273.15); //method mengubah ke kelvin  
    } 
     float fahrenheit()
    {
        return(float) ((9 * c)/5 + 32); //method mengubah ke fahrenheit
    }
     float reamur()
    {
       return (float) ((c * 4)/5); //method mengubah ke reamur
    }
    
   public String air()
            {
                //method kondisi air
           if(c<=0)
        {
            return "beku";
        }
           else if(c>=100)
           {
               return "mendidih";
           }
           else
           {
               return "normal";
           }
            }

   

  
   
}

