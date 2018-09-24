import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;    
                
 class OddEven{
 
        public static void main(String[] args) {
               
                
                     int n=0;  
                     
                     {
                     try
                      {
        BufferedReader Buffer= new BufferedReader(new InputStreamReader(System.in));
                         n = Integer.parseInt(Buffer.readLine());
                         if(n%2 == 0)
                                System.out.println( "Even ");
                         else if(n<0)
                                     System.out.println("invalid "); 
                         else
                                System.out.println(" Odd ");
                       } 
                     catch(Exception e)
                     {
                                 System.out.println("invalid ");                       
                      } 
                     }
                    
                }
               
        }
        
