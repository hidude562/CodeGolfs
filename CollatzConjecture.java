class CollatzConjecture {
   // The 'r' method is codegolfed here: (85 characters)
   static void r(int n){System.out.println(n);n=(1+3*n)*(n%2)+(n+1)%2*n/2;if(n!=1)r(n);}
   
   public static void main(String[] args) {
      run(49);
   }
}
