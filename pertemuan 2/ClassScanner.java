/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author DIAN
 */
public class ClassScanner {
 public String nama;
 public double n1;
 public int n2,n3;
 Scanner input = new Scanner (System.in);
 
 public String getnama (){
     return nama;
 }
public void inputScanner(){
    
System.out.print("masukan Nama anda : ");
nama= input.nextLine();
System.out.print("masukan Nilai 1 : ");
n1= input.nextDouble();
System.out.print("masukan nilai 2 : ");
n2= input.nextInt();
}
public double rata(){
return ((n1 + n2)/2);
} 
}
