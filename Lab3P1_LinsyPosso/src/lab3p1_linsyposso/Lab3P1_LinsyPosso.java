/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_linsyposso;
import java.util.Scanner;
/**
 *
 * @author CARMEN POSSO
 */
public class Lab3P1_LinsyPosso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        boolean running = true;
        
        while (running){
            System.out.println ("1.Serie Euclidiana");
            System.out.println ("2.Pokebola");
            System.out.println ("3.¡OK Boomer!");
            System.out.println ("Ingrese una opcion");
            int opcion = Leer.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el numero de puntos: ");
                    int num = Leer.nextInt();
                    double x;
                    double y;
                    int distancia = 0;

                    for (int i = 0; i<num; i++){
                        System.out.println("Ingrese un numero para el punto X" + (i+1) + ":");
                        x = Leer.nextInt();
                        System.out.println("Ingrese un numero para el punto Y" + (i+1) + ":");
                        y = Leer.nextInt();  
                        
                        double dx = Math.pow(x - y,2);
                        distancia += dx;
                    }
                    
                        double resp=Math.sqrt(distancia);
                        System.out.println("La distacia euclidiana entre los puntos es:" + resp);
                    break;
                    
                case 2:
                    System.out.println("Ingrese el tamaño de la pokebola: ");
                    int n = Leer.nextInt();
                    int r = n / 2;
                    int c = n / 2;

                    for (int i = 1; i <=n; i++) {
                        for (int j = 1; j <= (n*2)-1; j++) {
                            //double d =  Math.sqrt(Math.pow(i - r, 2) + Math.pow(j - c, 2));
                            
                            if (i==1 ||j==(n*2)-1||i==n||j==1) {
                                System.out.print("*");
                            
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");        
                    } 
                    break;
                    
                case 3:
                    System.out.println("Ingrese su año de nacimiento: ");
                    int año = Leer.nextInt();
                    if (año>=2013 && año<=2025){
                    System.out.println("Eres Gen Alpha");
                    }else{
                        if (año>=1990 && año<=2012){
                        System.out.println("Eres Gen Z");   
                        }else{
                            if (año>=1980 && año<=1994){
                            System.out.println("Eres Millenials");
                            }else{
                                if(año>=1975 && año<=1985){
                                System.out.println("Eres Xennials");
                                }else{
                                    if (año>=1960 && año<=1979){
                                    System.out.println("Eres Gen X");
                                    }else{
                                        if (año>=1946 && año<=1964){
                                        System.out.println("Eres Baby Boomer");
                                        }else{
                                               System.out.print("Año invalido");
                                    }
                                    
                                }
                            }
                        }
                        break;         
                    
        // TODO code application logic here
    }
 
}
} 
}
}
    }

