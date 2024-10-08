import java.util.Scanner;

class  Complex{
    double real,img;
    Complex(){

    }
    Complex(double real,double img){
      this.real=real;
      this.img=img;
    }
    static Complex sum(Complex c1,Complex c2){
      Complex c3 = new Complex();
      c3.real=c1.real+c2.real;
      c3.img=c1.img+c2.img;
      return c3;
    }
    Complex sub(Complex c2){
      Complex c3 = new Complex();
      c3.real=real-c2.real;
      c3.img=img-c2.img;
      return c3;
    }
    Complex mul(Complex c2){
      Complex c3 = new Complex();
      c3.real=real*c2.real-img*c2.img;
      c3.img=img*c2.real+c2.img*real;
      return c3;
    }
  void print(){
    System.out.println(real+"+"+img+"j");
  }

  public static void main(String str[]){
    double r,i;
    int cho;
    Scanner in = new Scanner(System.in);
    System.out,print("num1");
     r = in.nextInt();
     i = in.nextInt();
    System.out.print("num2");
      r=in.nextDouble();
      i=in.nextDouble();
      Complex c2 = new Complex(r,i);

      Complex c3 = null;
      do{
        System.out.print("1:add\n2:sub\n:mul\n4:exit\n");
        System.out.print("enter the coice");
        cho=in.nextInt();
        switch(cho){
          case1:c3=sum(c1,c2);break;//c3=c1+c2
          case2:c3=sub(c2);break;
          case3:c3=c1.mul(c2);break;
          case4:System.exit(0);
        }
        c3.print();
      }while(cho>=4);
  }

}