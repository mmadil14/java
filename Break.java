// Using break as a civilized form of goto

class Break{
 public static void main(String arg[]){
  boolean t = true;
  first : {
   second : {
      third : {
        System.out.println("Before the break");
     if(t) break second; //break out of second block
     System.out.println("This wont execute");
     }
   System.out.println("This wont execute");
   }
  System.out.println("This is after second block");
  }
 }
}
