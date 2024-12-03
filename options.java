import java.util.*;
public class options {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int a[]= {12,34,11,5,2,55,33,22,87,23,11};
        System.out.println("Enter your choice");
        System.out.println("1.Ascending&Descending");
        System.out.println("2.Even or Odd");
        System.out.println("3.Prime or even numbers");
        System.out.println("4.Exit");

        options o=new options();
        int ch = s.nextInt();
        while(ch!=4) {
            switch (ch) {
                case 1: {//ascending and descending
                    System.out.println("Ascending order:");
                    o.asec(a);
                    System.out.println("Descending order:");
                    o.desc(a);
                    break;
                }
                case 2: {//to find even or odd
                    o.eveorodd(a);

                    break;
                }
                case 3://prime  or even
                {
                    o.prime(a);

                    break;

                }
                default: {
                    System.out.println("Enter correct value");
                }
            }
        }
    }



    //Method for ascending
    void asec(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    //method for descending
    void desc(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    //TO find even or odd
    void eveorodd(int a[]){
        String eve = "",odd="";

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                eve= eve+a[i]+" ";
            }
            else{
                odd=odd+a[i]+" ";
            }
        }

        System.out.println("Even numbers:" +eve);
        System.out.println("Odd numbers:" +odd);
    }


    //to find prime and even numbers
    void prime(int a[]){

        int c=0;
        String prime="", eve=" ";
        for(int i=0;i<a.length;i++){
            for(int j=1;j<=a[i];j++)
            {
                if(a[i]%j==0){
                    c++;
                }
            }
            if(c==2||c==1){
                prime=prime+a[i]+" ";
            }
            else{
                if(a[i]%2==0)
                {
                    eve=eve+a[i]+" ";

                }
            }
        }
        System.out.println("Prime numbers:" +prime);
        System.out.println("Even numbers:" +eve);

    }



}
