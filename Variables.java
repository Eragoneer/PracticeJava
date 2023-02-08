import com.sun.source.tree.ArrayAccessTree;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class Variables {
    public static void main(String[] arf) throws java.io.IOException {
        byte m = 20;
        short n = 100;
        int l = 1000;
        long p = 10000;

        System.out.println("p is " + p + "\nl is " + l + "\nn is " +
                n + "\nm is " + m);

        // Declare some variables
        float floatPI = 3.141592653589793238f;
        double doublePI = 3.141592653589793238;
// Print the result on the console
        System.out.println("Float PI is: " + floatPI);
        System.out.println("Double PI is: " + doublePI);

        float sum = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f
                + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        float num = 1.0f;
        System.out.println("Sum  = " + sum +
                "\nNum  = " + num);

        char symbol = 'a';
        System.out.println("The code of " + symbol + " is:" + (int) symbol);
        symbol = 'A';
        System.out.println("The code of " + symbol + " is:" + (int) symbol);
        symbol = 'b';
        System.out.println("The code of " + symbol + " is:" + (int) symbol);

        String fname = "Nikolay";
        String lname = "Zhurnalov";
        String fullname = fname + ' ' + lname;
        System.out.println("My full name is " + fullname);

        Object container1 = "abc";
        Object container2 = 5.f;
        Object container3 = 3;
        Object container4 = true;

        System.out.println(
                "container1 :" + container1 +
                        "\ncontainer2 :" + container2 +
                        "\ncontainer3 :" + container3 +
                        "\ncontainer4 :" + container4);
        String str1 = "The \"use\" of quotations causes difficulties";
        System.out.println(str1);

        int depth = 8;

        for (int i = 0; i <= depth; i++) {
            for (int j = i; j < depth; j++)
                System.out.print(' ');

            System.out.print('*');

            for (int k = 0; k < i * 2 - 1; k++)
                System.out.print(' ');
            if (i != 0) System.out.print('*');

            System.out.println();
        }
        System.out.println();
        int size = 10;
        for (int i = 0; i < size; i++) {//print the first line
            if (i == 0) {
                for (int j = i; j < size; j++)
                    System.out.print(' ');
                for (int j = 0; j <= size; j++)
                    System.out.print('*');
                for (int j = i; j < size; j++)
                    System.out.print(' ');
                for (int j = i; j < size; j++)
                    System.out.print(' ');
                for (int j = 0; j <= size; j++)
                    System.out.print('*');
                for (int j = i; j < size; j++)
                    System.out.print(' ');
                System.out.println();
            }
            for (int j = i + 1; j < size; j++)
                System.out.print(' ');
            System.out.print('*');
            for (int j = 0; j <= size + 2 * i; j++)
                System.out.print(' ');
            System.out.print('*');
            for (int j = i + 1; j < size; j++)
                System.out.print(' ');

            for (int j = i + 1; j < size; j++)
                System.out.print(' ');
            System.out.print('*');
            for (int j = 0; j <= size + 2 * i; j++)
                System.out.print(' ');
            System.out.print('*');
            for (int j = i + 1; j < size; j++)
                System.out.print(' ');

            System.out.println();

        }
        for (int i = 0; i < size * 3; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(' ');
            System.out.print('*');
            for (int j = 0; j < 8 + 6 * (size - 1) - ((i + 2) * 2); j++)
                System.out.print(' ');
            System.out.print('*');
            System.out.println();
        }
        // int x =10;
        //int y = 20;
        //float b = x + y / 100;
        //System.out.println(b);

        int a = 5;
        int b = 4;
        System.out.println(a + b); // 9
        System.out.println(a + b++); // 9
        System.out.println(a + b); // 10
        System.out.println(a + (++b)); // 11
        System.out.println(a + b); // 11
        System.out.println(14 / a); // 2
        System.out.println(14 % a); // 4


        a = 3;
        b = 4;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a & b);
        System.out.println(a << b);
        System.out.println(a >> b);

        a = 6;
        b = 4;
        System.out.println(b *= 2);
        int z = b = 3;
        System.out.println(z);
        System.out.println(a |= 1);
        System.out.println(a += 3);
        System.out.println(a /= 2);
        System.out.println(a > b ? 100 : 200);
        String s = "Beer";
        System.out.println(s instanceof String);

        double myDouble = 5.1d;
        System.out.println(myDouble);

        long myLong = (long) myDouble;
        System.out.println(myLong);

        myDouble = 5e9d;
        System.out.println(myDouble);

        int myInt = (int) myDouble;
        System.out.println(myInt);

        String str = "eighty-eight :" + (80 + 8);
        System.out.println(str);

        int isEven = 101;
        if ((isEven & 1) == 1) {
            System.out.println("Odd: " + isEven);
        } else {
            System.out.println("Even: " + isEven);
        }

        if ((isEven % 5 == 0) && (isEven % 7 == 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        a = 3;
        isEven = 18792;
        int t1 = isEven;
        int t2 = -1;
        while (a > 0) {
            t2 = t1 % 10;
            t1 /= 10;

            a--;
        }
        ;
        System.out.println(t2 == 7);

        isEven = 11; // 1100
        if ((isEven & 4) == 4)
            System.out.println(1);
        else
            System.out.println(0);

        // Scanner scanner = new Scanner(System.in);

       /* a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("S="+ a*b + '\n' +
                           "P="+ 2*(a+b));*/


      /*  a= scanner.nextInt();
        b= scanner.nextInt();
        double distance = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Distance:" + distance);
        if(distance<=5)
        {
            if((a<=5&&a>=-1)&&(b<=5&&b>=-1))
                System.out.println("Yes");
            else
                System.out.println("Outside rectangle");
        }
        else
            System.out.println("Outside the circle");

       */

       /*a =  scanner.nextInt();
       System.out.println("a=" + a);
       int a1,a2,a3,a4;
        a4 = a%10;
        a = a/10;
        a3 = a%10;
        a = a/10;
        a2 = a%10;
        a = a/10;
        a1 = a%10;
        a = a/10;
        System.out.println(a1+a2+a3+a4);
        System.out.println(a4*1000 + a3*100 + a2 * 10 + a1);
        System.out.println(a4*1000+a1*100+a2*10+a3);
        System.out.print(a1*1000+a3*100+a2*10+a4);*/

       /*a = scanner.nextInt();
       int pos = scanner.nextInt();
       int bit = (int)Math.pow(2,pos);
       System.out.print((a&bit)==bit?1:0);*/

       /*a = scanner.nextInt();
       int pos = scanner.nextInt();
       int bit = scanner.nextInt();
       int curr_bit = (int)Math.pow(2,pos);

       if(bit==0)
           if((a&curr_bit)==curr_bit)
               System.out.println(a-curr_bit);
           else
               System.out.println(a);
       else
           if((a&curr_bit)==curr_bit)
               System.out.println(a);
           else
               System.out.println(a+curr_bit);*/
     /*  boolean isPrime = true;
       a=scanner.nextInt();
       int limit = (int)Math.sqrt(a)+1;
       for(int i=2;i<limit;i++)
       {
           if(a%i==0){isPrime=false; break;}
       }
       System.out.println(isPrime?"Prime":"notPrime");*/


       /*int ch;
       System.out.print("Enter some text :");
       while((ch=System.in.read())!='\n')
           System.out.print((char)ch);*/

       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstName = br.readLine();
        String lastName = br.readLine();
        System.out.printf("my name is %s %s\n",firstName,lastName);*/
       /*Scanner scanner1 = new Scanner(System.in);
        String firstName = scanner1.nextLine();
        String lastName = scanner1.nextLine();
        System.out.printf("my name is %s %s\n",firstName,lastName);*/

        Scanner scanner1 = new Scanner(System.in);
      /*  System.out.print("a = ");
       a = scanner1.nextInt();
       System.out.print("b = ");
       b = scanner1.nextInt();


        System.out.printf("%d * %d = %d\n",a,b,a*b);
        System.out.printf("%d + %d = %d\n",a,b,a+b);
        System.out.print("f = ");
        float f = scanner1.nextFloat();
        System.out.printf("%d * %d / %f = %f%n",
                a, b, f, a * b / f);*/
      /* a = scanner1.nextInt();
       b = scanner1.nextInt();
       System.out.printf("Rectangle = %d\nTriangle = %f\n",(a*b),(double)(a*b)/2);*/

      /*
      int count = 0;
      int acc = 0;
      while(count < 3)
      {
          a =scanner1.nextInt();
          acc+=a;
          count++;
      }
      System.out.printf("%d\n",acc);

      double radius = scanner1.nextDouble();
      System.out.printf("P = %f\nS =%f\n",2*3.14*radius,radius*radius*3.14);*/

      /*  a = scanner1.nextInt();
        b = scanner1.nextInt();
        if (a > b)
        {
            int t =a;
            a=b;
            b=t;
        }
       for(int i = a;i<=b;i++)
       {
           if(i%5==0)
           for(int j = i;j<=b;j+=5)
           {System.out.printf("%d ",i); break;}
       }System.out.println();*/
        /*a = scanner1.nextInt();
        b = scanner1.nextInt();
        System.out.println((b-a)>>31);
        int biggerNum = a - ((a-b)&((a-b)>>31));
        System.out.println(biggerNum);*/

        /*a = scanner1.nextInt();
        switch (a)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:System.out.println("ODD");break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:System.out.println("EVEN");break;
            default:System.out.println("No idea");

        }*/

       /*  a = scanner1.nextInt();
         b= scanner1.nextInt();
        if(((a>>31)^(b>>31))==0)
            System.out.printf("%c\n",'+');
        else
            System.out.printf("%c\n",'-');*/

     /*  a = scanner1.nextInt();
       b= scanner1.nextInt();
       int c = scanner1.nextInt();

       if(a>b)
         if(c>a)
             System.out.print("c>a>b");
         else
             if(c>b)
                 System.out.print("a>c>b");
             else
                 System.out.print("a>b>c");
       else
           if(b<c)
               System.out.print("c>b>a");
           else
               if(c>a)
                   System.out.print("b>c>a");
               else
                   System.out.print("b>a>c");*/

    /* a = scanner1.nextInt();

     switch(a)
     {
         case 0:System.out.println("нула");break;
         case 1:System.out.println("едно");break;
         case 2:System.out.println("две");break;
         case 3:System.out.println("три");break;
         case 4:System.out.println("четири");break;
         case 5:System.out.println("пет");break;
         case 6:System.out.println("шест");break;
         case 7:System.out.println("седем");break;
         case 8:System.out.println("осем");break;
         case 9:System.out.println("девет");break;
         default:System.out.println("нз");
     }*/

    /*float a1 = scanner1.nextFloat();
    float b1 = scanner1.nextFloat();
    float c1 = scanner1.nextFloat();

    float discriminanta = (float)Math.sqrt((b1*b1-4*a1*c1));

    System.out.printf("x1 = %.2f\nx2 = %.2f\n",(-b1+discriminanta)/(2*a1),(-b1-discriminanta)/(2*a1));*/

    /*a =0;
    int t;
    for(int i=0;i<5;i++)
    {
        t=scanner1.nextInt();
        if(t>a)
            a=t;
    }
    System.out.println(a);
    */
    /*size = 10;
    int array [] = new int [size];
    for(int i =0;i<size;i++)
    {
        array[i] = scanner1.nextInt();
    }
    for(int i=0;i<size;i++)
        for(int j=i+1;j<size;j++)
        {
            if((array[i]-array[j])==0||(array[i]+array[j])==0)
            System.out.printf("%d and % d\n",array[i],array[j]);
        }*/

    /*int divider = 2;
    a = scanner1.nextInt();
    boolean prime = true;
    int maxDivider = (int)Math.sqrt(a);
    while(prime&&divider<=maxDivider)
    {
        if(a%divider==0)
        {
            prime = false;
        }
        divider++;
    }
    System.out.println("is a prime? " + prime);*/

    /*a = scanner1.nextInt();
    int sum1 = 1;
    int count = a;
    while (true)
    {
        if(count==1||count==0)
        {
            System.out.printf("fac(%d)=%d\n",a,sum1);break;
        }
        sum1*=count--;
    }*/

   /* for(int i=0;i<100;i++)
    {
        if((i&3)!=3)
        {
            continue;
        }
        System.out.println(Integer.toBinaryString(i));
    }*/

      /*  int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int i : numbers) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        String[] towns = {"Sofia", "Plovdiv", "Varna", "Bourgas"};
        for (String town: towns) {
            System.out.printf("%s ", town);
        }*/

      /*a= scanner1.nextInt();
      for(int i=1;i<a;i++)
      {
          for(int j=1;j<=i;j++)
              System.out.print(j);
          System.out.println();
      }*/

     /* int count = scanner1.nextInt();
      int maxNum = Integer.MIN_VALUE;
      while(0<count--)
      {
          if((a=scanner1.nextInt())>maxNum)
              maxNum = a;
      }
      System.out.printf("Max:%d\n",maxNum);*/

    /* String cvqt [] = {"Spatiq","Karo","Pika","Kupa"};
     String karti [] = {"2","3","4","5","6","7","8","9","10","vale","dama","pop","aso"};
     for(String colour:cvqt)
     {for(String card:karti)
             System.out.printf("\"%s %s\" ",card,colour);
     System.out.println('\n');*/

    /*
    a =scanner1.nextInt();
    int n0 = 0;
    int n1 = 1;
    int t;
    for(int i=1;i<=a;i++)
    {
        System.out.printf("%d ",n0);
        t = n1;
        n1 +=n0;
        n0=t;
    }*/

   /* a = scanner1.nextInt();
    b = scanner1.nextInt();

    int product =1;
    int n1 = a-b;
    for(;n1>0;a--,n1--)
    {
        product*=a;
    }
    System.out.printf("%d\n",product);*/

   /*a = scanner1.nextInt();
   b = scanner1.nextInt();
   int product = 1;
   int count = a;
   int sub = a-b;
   for(;a>sub;a--)
       product*=a;
   for(;b>1;b--)
       product*=b;


   /*for(;count<=b;count++)
       product*=(count*count);
   for(;count<=a;count++)
       product*=count;
   for(int i=2;i<=sub;i++)
       product/=i;*/
        //System.out.println(product);
    /*a= scanner1.nextInt();
    long a1 = a+1;
    long doublea = a<<1;
    System.out.println(doublea);
    long product = 1;

    for(;doublea>a1;doublea--)
    { System.out.printf("%d ",product*doublea);
      product*=doublea;
    }System.out.println();

    System.out.println("Dooublea " + product);

    for(;a>1;a--)
    {
        product/=a;
        System.out.println(product);
    }

    System.out.print(product);*/

   /* a =scanner1.nextInt();
    while(a%10!=0&&a%5!=0)
        a--;
    System.out.println(a);
    System.out.println(a/10);
    System.out.print("Number of back zeroes is :" + (a/5));*/

   /*a =scanner1.nextInt();
   String byteStr = new String("");
   do {
       byteStr = a%2 + byteStr;
   }while((a/=2)>0);
   System.out.println(byteStr);*/


  /* String byteArr = scanner1.nextLine();
   int sum1 =0;
   for(char c:byteArr.toCharArray())
   {
      if(c=='0')
          sum1 = (sum1<<1);
      if(c=='1')
          sum1 = (sum1<<1) + 1;
   }
   System.out.println((int)sum1);*/


  /*a =scanner1.nextInt();
  String hexArr = "";
  int t;
  while(true)
  {
      t = a % 16;
      switch (t)
      {
          case 15:hexArr = 'F' + hexArr;break;
          case 14:hexArr = 'E' + hexArr;break;
          case 13:hexArr = 'D' + hexArr;break;
          case 12:hexArr = 'C' + hexArr;break;
          case 11:hexArr = 'B' + hexArr;break;
          case 10:hexArr = 'A' + hexArr;break;
          default:hexArr = t + hexArr;
      }
      if((a/=16)==0)break;
  }System.out.print("0x" + hexArr);*/

  /*String hexStr = scanner1.nextLine();
  int sum1 = 0;
  char[] hexArr = hexStr.toCharArray();
  for(int i=0;i<hexStr.length();i++)
  {
      switch (hexArr[i])
      {
          case 'A':sum1 = sum1*16 + 10;break;
          case 'B':sum1 = sum1*16 + 11;break;
          case 'C':sum1 = sum1*16 + 12;break;
          case 'D':sum1 = sum1*16 + 13;break;
          case 'E':sum1 = sum1*16 + 14;break;
          case 'F':sum1 = sum1*16 + 15;break;
          default:sum1=sum1*16 + (hexArr[i]-'0');
      }
  }
  System.out.print(sum1);*/

  /*Random random = new Random();
  a = scanner1.nextInt();
  for(int i=0;i<100;i++)
  System.out.printf("%d\n",random.nextInt(a-1)+1);*/

  /*int array [] = new int [20];
   for(int i=0;i<20;i++)
   {
       array[i]=i*5;
       System.out.printf("%d ",array[i]);
   }*/

 /* a = scanner1.nextInt();
  b = scanner1.nextInt();
  int array1 [] = new int [a];
  int array2 [] = new int [b];
  boolean isEqual =true;
  for(int i=0;i<a;i++)
      array1[i]=scanner1.nextInt();
  for(int i=0;i<b;i++)
      array2[i]=scanner1.nextInt();
  if((a^b)==0)
  {
      for(int i=0;i<a;i++)
          if((array1[i]^array2[i])!=0){
              isEqual=false;break;
          }
  }
  else
     isEqual=false;
  System.out.println("Equal?" + isEqual);*/

/* char array1 [];
 char array2 [];
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 array1 =  reader.readLine().toLowerCase().toCharArray();
 array2 = reader.readLine().toLowerCase().toCharArray();
 boolean isDecided=false;
 int min = Integer.min(array1.length,array2.length);
 for(int i=0;i<min;i++)
 {
        if(array1[i]!=array2[i])
            if(array1[i]<array2[i])
            {
                System.out.println("array1 is first");isDecided=true;break;
            }
            else
            {
                System.out.println("array2 is first");isDecided=true;break;
            }
 }
 if(!isDecided)System.out.println("Equal");*/

        /*int array1[] = new int[10];
        int pos = 0;
        int combo = 1;
        int tcombo = 1;

        for (int i = 0; i < array1.length; i++)
            array1[i] = scanner1.nextInt();

        for (int i = 0; i < array1.length; i++)
            System.out.printf("%d ", array1[i]);
        System.out.println();

        for (int i = 0; i < array1.length; i++)
        {
            for (int j = i + 1; j < array1.length; j++)
            {
                if (array1[i] == array1[j])
                {
                    tcombo++;
                }
                else
                    break;
            }
            if (combo < tcombo)
            {
                pos = i;
                combo = tcombo;
            }
            tcombo = 1;
        }

        System.out.printf("Combo = %d\nPos = %d\n", combo, pos);
        for(int i=pos;combo>0;i++,combo--)
            System.out.printf("%d ",array1[i]);*/



      /*  int array1 [] = new int [10];
        int tpos =0,pos=0 ,combo =1 ,tcombo = 1;

        for(int i=0;i<array1.length;i++)
            array1[i] = scanner1.nextInt();

        for(int i=0;i<array1.length;i++)
        {
            tpos = i;
            for(int j = i+1; (array1.length-j-1>=combo-tcombo)&&(j<array1.length);j++,i++)
            {
                if(array1[i]<array1[j])
                {
                    tcombo++;
                }
                else
                    break;
            }
            if(combo<tcombo)
            {
                pos = tpos;
                combo = tcombo;
            }
            tcombo = 1;
        }
        System.out.printf("Combo = %d\nPos = %d\n", combo, pos);
        for(int i=pos;combo>0;i++,combo--)
            System.out.printf("%d ",array1[i]);
*/

       /*a = scanner1.nextInt();
       int array1 [] = new int[a];
       for(int i=0;i<array1.length;i++)
           array1[i]=scanner1.nextInt();
       int max = Integer.MIN_VALUE;
       for(int i = 0;i<array1.length;i++)
           if(array1[i]>max)
               max = array1[i];
           System.out.println(max);*/
       /*int minval ;
       int pos = 0;
       int array1 []= {5,1,3,6,2,4,8,9,7};
       for(int i =0;i<array1.length-1;i++)
       {
           pos = i;
           minval = array1[i];
           for (int j = i + 1; j < array1.length; j++)
           {
               if(minval>array1[j])
               {
                   minval = array1[j];
                   pos = j;
               }
           }
           array1[pos] = array1[i];
           array1[i] = minval;
       }

       for(int i=0;i<array1.length;i++)
       {
           System.out.print(array1[i] + " ");
       }*/
     /*  int max;
       int maxpos = 0;
       int k = 0;
       a =scanner1.nextInt();
       int array1 [] ={1,10,3,8,5,6,7,4,9,2};
       for(int i=0;i<a;i++)
       {
           max = Integer.MIN_VALUE;
           for(int j = 0;j<array1.length-k;j++)
           {
               if(max<array1[j])
               {
                 max = array1[j];
                 maxpos = j;
               }
           }
           System.out.print(max + " ");
           array1[maxpos] = array1[array1.length-k-1];
           array1[array1.length-k-1] = max;
           k++;
       }*/

     /*int array1 [] = {2,2,2,2,2,3,2,1,2,5,4,1,5,7,8,3,4,6,2,1,3,4,5,8,1,2,3,5,3,3,6,3};
     int pos [] = new int [array1.length];
     int k =0;
     int tval,val = -1;
     int count = 0;
     int maxcount = 1;
     for(int i=0;i<array1.length;i++)
     {
         tval = array1[i];
         for(int j = i+1;j<array1.length;j++)
         {
             if(tval==array1[j])
             {
                 count++;
             }
         }
         if(maxcount<count)
         {
             maxcount=count;
             val=tval;
         }
         count=0;
     }
     System.out.print(maxcount + " " + val);*/

     /*a =scanner1.nextInt();
     for(int i=1;i<=a;i++)
     {
         for(int j=1;j<=a;j++)
         {
             System.out.print(i+(j-1)*4 + " ");
         }System.out.println();
     }*/
    /* a = scanner1.nextInt();
     b =scanner1.nextInt();
     int array [][] = new int [a][b];
     int row = 0;
     int column =0;
     a= a;
     b=b;
     int count  = 1;
     while(row!=a&&column!=b)
     {
         row=0;
         for(;row<a;row++)
         {
             array[row][column] = count;
             count++;
         }
         column++;
     }
     for(int i=0;i<a;i++)
     {
         for(int j=0;j<b;j++)
         {
             System.out.print(array[i][j] + " ");
         }System.out.println();
     }*/

    int array [] [] = new int [5][5];
    int count = 1;
    /*boolean keyswitch = false;
    for(int i =0;i<4;i++)
    {
        if(!keyswitch) {
            for (int j = 0; j < 4; j++)
                array[j][i] = count++;
            keyswitch = true;
        }
        else
        {for(int j=3;j>=0;j--)
                array[j][i] = count++;
        keyswitch = false;
        }
    }*/
    int row = 3;
    int col = 3;
   /* for(int i=row;i>=0;i--)
    {
        for(int j = i,k=0;j<=row&&k<=col;j++,k++)
        {
            array[j][k] = count++;
        }
    }
    for(int i=1;i<=row;i++)
    {
        for(int j = i,k=0;j<=row&&k<=col;j++,k++)
        {
            array[k][j] = count++;
        }
    }*/
   /*n =5;
   a=0;
   b=0;
   int trow = n;
   int tcol = n;
   int num1 = 0;
   count=1;
   int maxcount = n*n+1;
   while(true)
   {
       while(num1<trow)
       {
           array[a++][b]=count++;
           num1++;
       }
       System.out.println("a = " + a + " b=  " + b);
       a--;tcol--;num1=1;
       if(count!=maxcount){array[a][++b]=count++;b++;}
       else break;
       System.out.println(a + " " + b);

       while(num1<tcol)
       {
           array[a][b++]=count++;
           num1++;
       }
       b--;trow--;num1=trow-1;
       if(count!=maxcount){array[--a][b]=count++;a--;}
       else break;
       System.out.println(a + " " + b);

       while(num1>0)
       {
           array[a--][b]=count++;
           num1--;
       }
       a++;tcol--;num1=tcol-1;
       if(count!=maxcount){array[a][--b]=count++;--b;}
       else break;
       System.out.println(a + " " + b);

       while(num1>0)
       {
           array[a][b--]=count++;
           num1--;
       }
       b++;trow--;num1=1;
       if(count!=maxcount){array[++a][b]=count++;a++;}
       else break;
       System.out.println(a + " " + b);
   }

    for (int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            System.out.print( array[i][j]+" ");
        }System.out.println();
    }*/


/*   a = 5;b = 5;
   int maxval = Integer.MIN_VALUE;
   int posx=-1,posy=-1;
   int sum1;
   int array1 [] [] = {
           { 0, 2, 5, 4, 1 },
           { 4, 9, 7, 5, 7 },
           { 6, 3, 4, 6, 2 },
           { 7, 3, 1, 8, 3 },
           { 1, 8, 2, 3, 4 }
   };
   for(int i=1;i<a-1;i++)
   {
       for(int j=1;j<b-1;j++)
       {
           sum1 = array1[i][j] + array1[i-1][j] + array1[i+1][j] +
                   array1[i][j-1] + array1[i][j+1] + array1[i-1][j-1] +
                   array1[i+1][j+1] + array1[i-1][j+1] + array1[i+1][j-1];
           if(sum1>maxval)
           {
               maxval=sum1;
               posx=i;
               posy=j;
           }
       }
   }
   System.out.print("posx " + posx + " posy " + posy + '\n');
   for(int i=posx-1;i<=posx+1;i++)
   {
       for(int j=posy-1;j<=posy+1;j++)
       {
           System.out.print(array1[i][j] + " ");
       }System.out.println();
   }
*/
/*char array1 [] = new char [52];
for(int i =0;i<26;i++)
{
    array1[i] = (char)(i+65);
}
for(int i =26;i<=51;i++)
{
    array1[i]=(char)(i+71);
}

for(int i =0;i<array1.length;i++)
    System.out.print(array1[i] + " ");
System.out.println();

a=System.in.read();
if((a>'A'&&a<'Z')||(a>'a'&& a<'z'))
    System.out.println((int)a-(int)'A');*/


/*int array1 [] = {1,2,3,4,5,6,7,8,9,10};
int find = scanner1.nextInt();
int pos1 = 0;
int pos2 = array1.length-1;
int mid = -1;

if(array1[pos1]==find)
{
    mid = pos1;
}
else
{
    if(array1[pos2] == find)
    {
        mid = pos2;
    }
    else
    {
        if(array1[pos2]>array1[pos1]) {
            while (pos1 < pos2 - 1) {
                System.out.println("pos1 = " + pos1 + '\n' + "pos2 = " + pos2);
                mid = pos1 + (pos2 - pos1) / 2;
                System.out.println("mid  = " + mid);
                if (array1[mid] == find) {
                    break;
                }
                if (array1[mid] > find) {
                    pos2 = mid;
                    continue;
                }
                if (array1[mid] < find) {
                    pos1 = mid;
                    continue;
                }
            }
        }
        else
        {
            while (pos1 < pos2 - 1) {
                System.out.println("pos1 = " + pos1 + '\n' + "pos2 = " + pos2);
                mid = pos1 + (pos2 - pos1) / 2;
                System.out.println("mid  = " + mid);
                if (array1[mid] == find) {
                    break;
                }
                if (array1[mid] < find) {
                    pos2 = mid;
                    continue;
                }
                if (array1[mid] > find) {
                    pos1 = mid;
                    continue;
                }
            }

        }
    }
}
System.out.print("array[mid] " + array1[mid] + " mid " + mid);
*/
    }
}
