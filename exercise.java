//1.Enter 3 numbers from the user & make a function to print their average.
// import java.util.Scanner;
// class exercise{
//     public static void avg(Float a , Float b, Float c){
//         System.out.println((a+b+c)/3);
//     }
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         float a=sc.nextInt();
//         float b=sc.nextInt();
//         float c=sc.nextInt();
//         avg(a,b,c);
//     }
// }




//2.Write a function to print the sum of all odd numbers from 1 to n.
// import java.util.Scanner;
// class exercise{
//     public static void odd(int n){
//       for(int i=1; i<=n; i++){
//         if(i%2!=0){
//             System.out.println(i);
//         }

//       }  
//     }
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         odd(n);
//     }
// }




//3.Write a function which takes in 2 numbers and returns the greater of those two.
// import java.util.Scanner;
// class exercise{
//     public static void greater(int a , int b){
//         if(a>b){
//             System.out.println(a);
//         }
//         else {
//             System.out.println(b);
//         }
      
//     }
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        greater(a,b);
//     }
// }




//4.Write a function that takes in the radius as input and returns the circumference
//  of a circle.
// import java.util.Scanner;
// class exercise{
//     public static float circum(float r ){
//         return 2*(3.14f)*r;
        
//     }
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//        float r=sc.nextFloat();
//        System.out.println(circum(r));
      
//     }
// }






//5.Write a function that takes in age as input and returns if that person is eligible to 
// vote or not. A person of age > 18 is eligible to vote.
// import java.util.Scanner;
// class exercise{
//     public static void vote(int age ){
//         if(age>=18){
//             System.out.println("eligible");

//         }
//         else {
//             System.out.println("not");
//         }

       
        
//     }
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//        int age=sc.nextInt();
//        vote(age);
      
//     }
// }







//6.Write an infinite loop using do while condition.

// import java.util.Scanner;
// class exercise{
   
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int i=1;
//         do{
//             System.out.println("*");
//             i++;
//         }
//         while(true);
       
      
//     }
// }







//7.Write a program to enter the numbers till the user wants and 
//at the end it should display the count of positive, negative and zeros entered. 
// import java.util.Scanner;
// class exercise{
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int pos=0;
//         int neg=0;
//         int zero=0;
//         int n;
//         do{
//             System.out.println("enter 1 for num 0 for stop");
//              n=sc.nextInt();
//             if(n==1){
//                 System.out.println("enter num");
//                 int a=sc.nextInt();
//                 if(a>0){
//                     pos++;
//                 }
//                 else if(a<0){
//                     neg++;
//                 }
//                 else{
//                     zero++;
//                 }
//             }
//         }while(n!=0);
//         System.out.println("positive number " + pos);
//         System.out.println("negative numbers " + neg);
//         System.out.println("zeros" + zero);
        
//     }
//     }






//8.Two numbers are entered by the user, x and n.
//  Write a function to find the value of one number raised to the power of another
//  i.e. xn.
// import java.util.Scanner;
// class exercise{
//     public static void power( int x, int n){
//         double result = Math.pow(x, n);
//         System.out.println(result);
//     }
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int n=sc.nextInt();
//         power(x,n);
//     }
// }







//9.Write a function that calculates the Greatest Common Divisor of 2 numbers. 
// import java.util.Scanner;
// class exercise{
//     public static void common( int a, int b){
//         int ans=1;
//         for(int i=2; i<=a && i<=b; i++){
//           if(a%i==0 && b%i==0){
//             ans=i;
            
//           }
//         }
//         System.out.println(ans);
        
//     }
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         common(a,b);
//     }
// }




//10.Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 ..... .
import java.util.Scanner;
class exercise{
    public static void fibonacci( int n ){
       int  a=0; int b=1;
        
        for(int i=0;i<=n;i++){
            System.out.print(a + " ");
            int c = a+b;
            a=b;
            b=c;
           
            

        }
        
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibonacci(n);
       
    }
}


