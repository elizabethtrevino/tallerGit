import java.io.*;
class Lectura{
   public static byte readByte(){
   DataInputStream h = new DataInputStream(System.in);
   String g;
   int sw=0;
   byte r=0;
   do {
   try{
      g=h.readLine();
      r=Byte.parseByte(g);
      }
   catch(NumberFormatException e) {
   System.out.println("No es un Formato valido para un entero");
   sw = 1;
   }
   
   catch(IOException e){g="0";}
   } while (sw==1);
   return r;
   }
   
   
   public static short readShort(){
   DataInputStream h = new DataInputStream(System.in);
   String g;
   int sw=0;
   short r=0;
   do {
   try{
      g=h.readLine();
      r=Short.parseShort(g);
      }
   catch(NumberFormatException e) {
   System.out.println("No es un Formato valido para un entero");
   sw = 1;
   }
   
   catch(IOException e){g="0";}
   } while (sw==1);
   return r;
   }
   

   public static int readInt(){
   DataInputStream h = new DataInputStream(System.in);
   String g;
   int sw=0;
   int r=0;
   do {
   try{
      g=h.readLine();
      r=Integer.parseInt(g);
      }
   catch(NumberFormatException e) {
   System.out.println("No es un Formato valido para un entero");
   sw = 1;
   }
   
   catch(IOException e){g="0";}
   } while (sw==1);
   return r;
   }
   

   public static long readLong(){
   DataInputStream h = new DataInputStream(System.in);
   String g;
   int sw=0;
   long r=0;
   do {
   try{
      g=h.readLine();
      r=Long.parseLong(g);
      }
   catch(NumberFormatException e) {
   System.out.println("No es un Formato valido para un entero");
   sw = 1;
   }
   
   catch(IOException e){g="0";}
   } while (sw==1);
   return r;
   }
   
   
   public static float readFloat(){
   DataInputStream h = new DataInputStream(System.in);
   String g;
   int sw=0;
   float r=0;
   do {
   try{
      g=h.readLine();
      r=Float.parseFloat(g);
      }
   catch(NumberFormatException e) {
   System.out.println("No es un Formato valido para un Decimal");
   sw = 1;
   }
   
   catch(IOException e){g="0";}
   } while (sw==1);
   return r;
   }
   
   
   public static double readDouble(){
   DataInputStream h = new DataInputStream(System.in);
   String g;
   int sw=0;
   double r=0;
   do {
   try{
      g=h.readLine();
      r=Double.parseDouble(g);
      }
   catch(NumberFormatException e) {
   System.out.println("No es un Formato valido para un entero");
   sw = 1;
   }
   
   catch(IOException e){g="0";}
   } while (sw==1);
   return r;
   }
   
   
   public static String readString(){
   DataInputStream h = new DataInputStream(System.in);
   String g;
   try{
      g=h.readLine();
      }
   catch(IOException e){g="0";}
   return g;
   }
   
   
   public static char readChar(){
   DataInputStream h = new DataInputStream(System.in);
   String g;
   try{
      g=h.readLine();
      }
   catch(IOException e){g="0";}
   char r=g.charAt(0);
   return r;
   }
}