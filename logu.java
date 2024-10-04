import java.util.Scanner;

/*class logu{
  public static void main(String args[]){
    int a=5;
    int b=15;
    System.out.println(a+b);
  } 
}

import java.util.Scanner;

class logu{
  public static void main(String args[]){
    Scanner logaraj = new Scanner(System.in);
    int a = logaraj.nextInt();
    System.out.println(a);
  }
}

import java.util.Scanner;
class logu{
  public static void main(String args[]){
    Scanner logaraj = new Scanner(System.in);
    String a = logaraj.nextLine();
    System.out.println(a);
  }
}

class logu{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int Age = sc.nextInt();  **INTHA INT APRAM STRING VARA NALA (sc.nextLINE()) ITHU PODANUM
    sc.nextLine();
    String Address = sc.nextLine();
    String A ="variable";
    String B ="Age";
    String C ="Address";
    System.out.println(A);
    System.out.println(B);
    System.out.println("my name is "+name);
    System.out.println("my age is "+Age);
    System.out.println("my address is "+Address);

  }
}

class logu{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = A*B*C;
    int E = A+B+C;
    System.out.println(D/E);
  }
}

class logu{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String Name = sc.nextLine();
    double Score = sc.nextInt();
    sc.nextLine();
    String Department = sc.nextLine();
    System.out.println("My name is "+Name);
    System.out.println("My score is "+Score/10+"/10");
    System.out.println("My department is "+Department);
  }
}

TYPES OF DATATYPES:-

PRIMITIVE DT: byte,short,int,long,char,boolean

float(RANGE:7decimal)(10.123456f) #float POINTKKU APRAM 6 VALUES EDUTHUKKUM ATHUKKU MELA IRUNTHA ROUND PANNIRUM(EX:10.12345678f)===O/P: 10.123457

double(RANGE:15decimal)


import .java.util.Scanner;
class logu{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0;
    while(N>0){
      int M = N%10;
      if(M%2==1){
        sum+=M;
      }N=N/10;
    }
    System.out.print(sum);

  }
}

REVERSED NUMBER


import java.util.Scanner;

class logu{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //input 1234
    int rev = 0,rem = 0;
    while(N>0){ 
      rev=rev*10; 
      rev+=N%10;
      N/=10;
    }
    System.out.print(rev);  //output 4321
  }
}


class logu{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i=1,sum=0;
    while(N>=i){
      if(N%i==0){
        sum++;
      }i++;
    }if(sum==2){
      System.out.print("YES");
    }else{
      System.out.print("NO");
    }
    
  }
}

// Fibonacci series program in java


class logu {
    // Function to print N Fibonacci Number
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < N; i++) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        int N = 10;

        // Function Call
        Fibonacci(N);
}

ARRAY:-

 for(int i=0;i<5;i++){
        numbers[i]=sc.nextInt();
      }
      for(int i=0;i<5;i++){
        System.out.println(numbers[i]);
    }

    2TABLE
  int n = sc.nextInt();
      for(int i=1;i<=20;i++){
        System.out.println(i + "x" + n + "=" + i*n);



class logu{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int max=0,counter=1;
      int N = sc.nextInt();
      while(N>=counter){
        int x = sc.nextInt();
        if(max<x){
          max=x;
        }counter++;
      
      }System.out.print(max);



  }
}


class logu{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    if(str.substring(0,3).equals("abi")){
      System.out.print("YES");
    }else{
      System.out.print("NO");
    }

  }
}
  
  class logu{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int num1=0,num2=1;
      int N = sc.nextInt();
      for(int i=0;i<N;i++){
        System.out.print(num1 + " ");
        int num3=num1+num2;
        num1=num2;
        num2=num3;
      }
    }
  }
 


public class logu{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int max=Integer.MIN_VALUE;
  int secondmax=Integer.MIN_VALUE;
  for(int i=0;i<N;i++){
    int num=sc.nextInt();
    if(num>max){
      secondmax=max;
      max=num;
    }else if(secondmax<num && num!=max){
      secondmax = num;
    }
  }
  System.out.print(secondmax);
 }
}


public class logu{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min=0;
    int X = sc.nextInt();
    int Y = sc.nextInt();
    min=X<Y?X:Y;
    while(min>=2){
      if(X%min==0 && Y%min==0){
        System.out.print(min);
        break;
      }min--;
    }
  }
}




public class logu{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int i=0;i<N;i++){
      system.out.print(i);
    }
  }
}*/



/*public class logu{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int counter=1;
    int N = sc.nextInt();
    while(N>=counter){
      if(2*counter==N){
        System.out.print("true");
      }counter++;
    }
    sc.close();
  }
}



/*int salary = sc.nextInt();
if(salary>10000){
  salary+=2000;
  System.out.print(salary);
}else{
  System.out.print(salary+1000);
}*/

public class logu{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.print("mid");
  }
}



    









 /* 
 TYPES OF LANGUAGES
 i) PROCEDURAL
        series of process & step by step
ii)FUNCTIONAL
iii)OBJECT ORIENTED

  





 */


/* 
 
STRING

class-non primitive type
java.lang package

















*/
 