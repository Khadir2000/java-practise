class Mete
{
 public static void main(String args[])
{
   for (int i=0; i<=8;i++)
      {
        if(i<=4)
          {
            for (int k=4; k>=i;k--)
                 {
                     System.out.print(" ");
                  }
            for (int j=0; j<=i*2;j++)
                {
                  System.out.print("*");
                 }

           }

else
      {
         for (int l=8;l>=i/2;l--)
            {
                  System.out.print("*");
            }
      }
     System.out.println("");

   }
}
}