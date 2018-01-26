/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zaharin
 */
import java.util.Scanner;
public class Soalan3 {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan berat anda");
        double berat = input.nextDouble();
        
        System.out.println("Masukkan panjang anda dalam ukuran M");
        double tinggi = input.nextDouble();
        
        double BMI = ((berat)/(tinggi*tinggi));
        
        if(BMI < 18.5){
            System.out.println("BMI anda ialah "+BMI+". Ianya adalah kurang berat badan");
        }
       
        else if(BMI < 25){
            System.out.println("BMI anda ialah "+BMI+". Ianya adalah normal");
        }
        
        else if(BMI < 30 ){
            System.out.println("BMI anda ialah "+BMI+". Ianya adalah agak berat");
        }
        
        else{
            System.out.println("BMI anda ialah "+BMI+". Ianya adalah obes");
        }
    }
    
}
