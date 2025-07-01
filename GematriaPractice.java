package tirgul;

import java.util.Random;
import java.util.Scanner;

//Calculating Hebrew letters to their Gematria form Practice
public class GematriaPractice {
	static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Random rand = new Random();
        char randomHebrewChar = (char) ('א' + rand.nextInt('ת' - 'א' + 1));
        
        //מונע אותיות סופיות
        while (randomHebrewChar=='ך' || randomHebrewChar=='ם' || randomHebrewChar=='ן' || randomHebrewChar=='ף' || randomHebrewChar=='ץ') {
        	randomHebrewChar = (char) ('א' + rand.nextInt('ת' - 'א' + 1));
        }
        
        System.out.println("האות שהוגרלה היא: " + randomHebrewChar);
        System.out.println("?מה מספרה של האות בגימטריה");
        
        boolean bool = false;
        
        while (!bool) {
	        int num = s.nextInt();
	        
	        
	        if (randomHebrewChar < 'כ') {
		        if (num == (int)(randomHebrewChar) - 1487)
		        	bool = true;
	        }
	        
	        else if (randomHebrewChar < 'ם'){
		        if (num == ((int)(randomHebrewChar) - 1497) * 10)
		        	bool = true;
	        }
	        
	        else if (randomHebrewChar == 'מ') {
		        if (num == 40)
		        	bool = true;
	        }
	        
	        else if (randomHebrewChar < 'ן'){
		        if (num == ((int)(randomHebrewChar) - 1499) * 10)
		        	bool = true;
	        }
	        
	        else if (randomHebrewChar == 'פ') {
		        if (num == 80)
		        	bool = true;
	        }
		        
	        else if (randomHebrewChar == 'צ') {
		        if (num == 90)
		        	bool = true;
	        }
	        
	        else if (randomHebrewChar > 'צ') {
		        if (num == ((int)(randomHebrewChar) - 1510) * 100)
		        	bool = true;
	        }
	                
	        
	        else {
		        if (num == ((int)(randomHebrewChar) - 1499) * 10)
		        	bool = true;
	        }
	        
	        
	        //מצבי קיצון: אותיות סופיות
	        if (randomHebrewChar == 'ך') {
		        if (num == 500)
		        	bool = true;
	        }
	        
	        else if (randomHebrewChar == 'ם') {
		        if (num == 600)
		        	bool = true;
	        }
	        
	        else if (randomHebrewChar == 'ן') {
		        if (num == 700)
		        	bool = true;
	        }
	        
	        else if (randomHebrewChar == 'ף') {
		        if (num == 800)
		        	bool = true;
	        }
	        
	        else if (randomHebrewChar == 'ץ') {
		        if (num == 900)
		        	bool = true;
	        }
	        
	        
	        System.out.println(bool);
	        if (!bool)
		        System.out.println("try again");
        }
    }
    
}