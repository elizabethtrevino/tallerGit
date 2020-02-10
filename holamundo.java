import java.io.*;

float a, b;

class Hola{
    public static void main(String args[]) {
        System.out.println("ingresa opcion");
        int op = 1;
        while (op != 0 )
        {
            System.out.println("1) Multiplicar dos numeros / 2) Sumar dos numeros / 0) Para terminar");
            op = Lectura.readInt();
            
            switch(op)
            {
               case 1:
               // Mandar llamar metodo de multiplicar
               break;
               
               case 2:
               // Mandar llamar metodo de sumar
               break;
            }
        }
    }
    public static float multiplicar(a, b){
        return a*b;
    }
}