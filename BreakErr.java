// This program contains an error

class BreakErr{
 public static void main(String arg[]){
  one : for(int i = 0;i<3; i++){
         System.out.println("Pass "+i+" : ");
        }
    for(int j=0;j<100;j++)
     if (j=10) break one; //Wrong
       System.out.println(j+"  ");
     }
 }
