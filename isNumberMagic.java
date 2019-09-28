/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isnumbermagic;
 import java.util.Scanner;
/**
 *
 * @author Года
 */
public class isNumberMagic {   

    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter an integer: ");
    	int number = input.nextInt();
    	System.out.println("You entered " + number);
    	if (isMagic(number)){
            System.out.println("The number is magic");
        } else {
            System.out.println("The number is not magic");
        };
    	
    }
    
        public static boolean isMagic (int num){ 
            Boolean isMagic = true;
            String number = Integer.toString(num);
            if (num != 0){ //zero sould not be considered a magic number
            for (int i = 2; i <= 6; i++){ //the number will be chacked with multiplyers from 2 to 6
                Boolean isSame = false; 
                String mult_num = Integer.toString(num*i); // convert each multiplication to string
                 if (number.length()==mult_num.length()){ //compare lengths of the resulting string and the initial number string
                         for (int j = 0; j<number.length(); j++){ //make cyclic permutations to the result of multiplication
                                 String new_num = mult_num.substring(j) + mult_num.substring(0,j); 
                                 if (new_num.compareTo(number)==0){//compare each permutation to the initial number
                                    isSame=true;      //it is enough to have only one permutation of the lot match
                                 }
                            }
                         isMagic = isMagic & isSame; // all of the multiplication results must have a matching permutation
                    } else {
                     return false;
                    }
                } 
                return isMagic;
            } else {return false;}
        }
    }
    

