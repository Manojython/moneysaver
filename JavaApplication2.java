/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author ManojK
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int it = 0;
        Scanner input=new Scanner(System.in);
        String number=input.nextLine();
        String [] params = number.split(" ", 2);
        int a=Integer.parseInt(params[0]);
        int limit=Integer.parseInt(params[1]);
        //System.out.println(a);
        int [] items=new int[a];
        
        for(int i=0;i<a;i++){
            items[i]=input.nextInt();
            
        }
        //System.out.println(Arrays.toString(items));
        for(int l=0;l<=a-2;l++){
            for(int r=l+1;r<=a-1;r++){
                 if(items[r]<items[l]){
        
                    int temp=items[l];
                    items[l]=items[r];
                    items[r]=temp;
      }
      
    }
  }
        //System.out.println(Arrays.toString(items));
        int sum=0;
        while(it<limit){
            sum+=items[it];
            if(sum>limit){
                break;
            }
            it++;
            //System.out.println(sum);
            if(sum<limit){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }

    
}
