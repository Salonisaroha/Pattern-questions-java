public class Pattern{
    public static void main(String[] args){
        // Solid pattern
 for(int i=1; i<=4;i++){    //outer loop
    for(int j=1; j<=4; j++){
        System.out.print("*");
    }
    System.out.println("*");       
 }    
      // Hollow rectangle     
   int n = 4;
   int m = 5;
   //outer loop
   for(int x=1;x<=n; x++){
          for(int y=1; y<=m; y++){
            if (x==1 || y==1 || x ==n || y==m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
          }
          System.out.println();
   }    

   // half pyramid   

   int a = 4;
   
   // outer loop
   for(int p = 1; p <= a; p++){
    // inner loop
       for(int q=1; q<=p;q++){
        System.out.print("*");
       }
       System.out.println();

   }   
   // down half pyramid.
   int b = 4;
   // outer loop
   for(int f = b;f>=1; f--)  {
    for(int g = 1; g<=f; g++){  // inner loop 
        System.out.print("*");
    }
    System.out.println();
   }  
  
    }
}