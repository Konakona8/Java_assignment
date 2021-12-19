import java.util.Scanner;
import java.io.*; 

public class Main{
    public static void main (String arg[]) throws IOException{
        System.out.println("Enter the below command to choose the function");
        System.out.println("'Rpali' to Palindrome_Recursive");
        System.out.println("'Lpali' to Palindrome_Loop");
        System.out.println("'RGCD1' to R_輾轉相除");
        System.out.println("'RGCD2' to R_減法");
        System.out.println("'RGCD3' to R_暴力");
        System.out.println("'LGCD1' to L_輾轉相除");
        System.out.println("'LGCD2' to L_減法");
        System.out.println("'LGCD3' to L_暴力");
        System.out.println("'Lfactor'to L_質因數分解");
        System.out.println("'Rfactor'to R_質因數分解");
        System.out.println("'Lstar' to L_Star");
        System.out.println("'Ldiam' to L_diam");
        System.out.println("'Rstar' to R_star");
        System.out.println("'Rdiam' to R_diam");
        System.out.println("'End' to End");
    
        int number1,number2,two=2;
        String comments,pattern;
        char p;
        Scanner scanner=new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        comments=scanner.nextLine();
        System.out.println("你輸入了:"+comments);
        while(!comments.equals("End")){
        switch(comments){
            case "Rpali":
                System.out.print("請輸入一字串判斷迴文: ");
                String pal=scanner.nextLine();
                System.out.println("pal is "+pal);
                if (Palindrome_Recursive(pal)==1)
                 System.out.println(pal+"是迴文");
                 else
                 System.out.println(pal+"不是迴文");
                break;
            case "Lpali":
                System.out.print("請輸入一字串判斷迴文: ");
                String pall=scanner.nextLine();
                System.out.println("pal is "+pall);
                if (Palindrome_Recursive(pall)==1)
                 System.out.println(pall+"是迴文");
                 else
                 System.out.println(pall+"不是迴文");
                break;
            case "RGCD1":
                System.out.print("請輸入整數1: ");
                number1=Integer.valueOf(scanner.nextLine());
                System.out.print("請輸入整數2: ");                
                number2=Integer.valueOf(scanner.nextLine());
                System.out.println("\n執行R輾轉相除");
                int n3;
                n3=RGCD1(number1,number2);
                System.out.println("GCD("+number1+","+number2+")="+n3);
                break;
            case "RGCD2":
                System.out.print("請輸入整數1: ");
                number1=Integer.valueOf(scanner.nextLine());
                System.out.print("請輸入整數2: ");                
                number2=Integer.valueOf(scanner.nextLine());
                System.out.println("\n執行R輾轉相減");
                n3=RGCD2(number1,number2);
                System.out.println("GCD("+number1+","+number2+")="+n3);
                break;
            case "RGCD3":
                int gcd=1, i=2;
                System.out.print("請輸入整數1: ");
                number1=Integer.valueOf(scanner.nextLine());
                System.out.print("請輸入整數2: ");                
                number2=Integer.valueOf(scanner.nextLine());
                System.out.println("\n執行R暴力");
                n3=RGCD3(number1,number2,gcd,i);
                System.out.println("GCD("+number1+","+number2+")="+n3);
                break;
            case "LGCD1":
                System.out.print("請輸入整數1: ");
                number1=Integer.valueOf(scanner.nextLine());
                System.out.print("請輸入整數2: ");                
                number2=Integer.valueOf(scanner.nextLine());
                System.out.println("\n執行L輾轉相除");
                LGCD1(number1,number2);
                break;
            case "LGCD2":
                System.out.print("請輸入整數1: ");
                number1=Integer.valueOf(scanner.nextLine());
                System.out.print("請輸入整數2: ");                
                number2=Integer.valueOf(scanner.nextLine());
                System.out.println("\n執行L輾轉相減");
                LGCD2(number1,number2);
                break;
            case "LGCD3":
                System.out.print("請輸入整數1: ");
                number1=Integer.valueOf(scanner.nextLine());
                System.out.print("請輸入整數2: ");                
                number2=Integer.valueOf(scanner.nextLine());
                System.out.println("\n執行L暴力法");
                LGCD3(number1,number2);
                break;
            case "Lfactor":
                System.out.print("請輸入整數: ");
                number1=Integer.valueOf(scanner.nextLine());
                System.out.println("\n執行L_質因數分解");
                Lfactor(number1);
                break;
	    case"Rfactor":
		System.out.print("請輸入整數: ");
                number1=Integer.valueOf(scanner.nextLine());
                if(number1<2)
                System.out.println("不可小於2");
                else{
                System.out.println("\n執行R_質因數分解");
                Rfactor(number1,two);}
                break;
            case "Lstar":
                System.out.print("請輸入一個圖案字元:");
                pattern=bufferedReader.readLine();
                System.out.print("請輸入層數: ");
                number1=Integer.valueOf(scanner.nextLine());
                System.out.println("\n執行L_正三角形");
                Lstar(number1,pattern);
                break;
            case "Ldiam":
                System.out.print("請輸入一個圖案字元:");
                pattern=bufferedReader.readLine();
                System.out.print("請輸入層數: ");
                number1=Integer.valueOf(scanner.nextLine());
                System.out.println("\n執行L_菱形");
                Ldiam(number1,pattern);
                break;
            default:
            System.out.println("wrong comments\n");
            break;
        }
        comments=scanner.nextLine();
        System.out.println("你輸入了:"+comments);
        }
    System.out.println("program End");
    }

public static int Palindrome_Recursive(String pal){
     int i=0,j=pal.length()-1;
     if(pal.charAt(i)==pal.charAt(j)&&pal.length()>2){
        pal=pal.substring(i+1,j);
        System.out.println(""+pal);
        return Palindrome_Recursive(pal);}
        
    if (pal.charAt(i)==pal.charAt(j))
        return 1;
    else return 0;
     
}

public static int Palindrome_Loop(String pal){
    int i, judge = 1,j=pal.length ()-1;
     for (i = 0; i < pal.length ()/2; i++){
          if (pal.charAt(j) != pal.charAt(i)){
          judge = 0;
          break;
        }
        j--;
     }
    return judge;
}
public static int RGCD1(int m,int n){
    int temp=0;
   if (m<n) {temp=m;m=n;n=temp;}
   if (m%n==0) return n;
   else return(RGCD1(n,m%n));
}
public static int RGCD2(int m,int n){
   while(m!=n){
       if(m>n)
       {m=m-n;}
       else if(n>m)
       {n=n-m;}
       return RGCD2(m,n);
   }
   return n;
}
public static int RGCD3(int n1,int n2,int gcd,int i){
    
    if(i<=n1 && i<=n2) {
      if (n1%i==0 && n2%i==0)
                {gcd=i;}
				i++;
                return RGCD3(n1,n2,gcd,i) ;}
    else return gcd;
   
}

public static void LGCD1(int n1,int n2){
    int t,m=n1,n=n2;
    if (n1<n2)
     	{ t=n1;n1=n2;n2=t; }
   		while (n2!=0)
   		 {System.out.print("\n"+n1+"除以"+n2+"餘:");
    	 t=n1%n2;n1=n2;n2=t;
    	 System.out.print(t);
    	 }
    	System.out.println("GCD("+m+","+n+")="+n1);
}
public static void LGCD2(int num1,int num2){
    	int t,m=num1,n=num2;
    	while (num1!=num2){
     if(num1>num2){t=num1;num1=num1-num2;
     System.out.println(t+"-"+num2+"="+num1);}
     else{t=num2;num2=num2-num1;
     System.out.println(t+"-"+num1+"="+num2);}}
    
     System.out.println("GCD("+m+","+n+")="+num1);
}
public static void LGCD3(int n1,int n2){
    int t,m=n1,n=n2;
    int gcd=1, i=2;
    while (i<=n1 && i<=n2) {
      if (n1%i==0 && n2%i==0){
      	System.out.println(n1+"跟"+n2+"能被"+i+"整除，目前GCD("+n1+","+n2+")改成"+i);
               gcd=i;}
				i++;//while
	}
	System.out.println("GCD("+m+","+n+")="+gcd);
    
    }
public static void Lfactor(int i){
    int x=2;
    while (x <= i)
      {
    if (i % x == 0)
      {
        System.out.printf ("%d ", x);
        i /= x;
      }
    else
        x++;
      }
     System.out.println("");
    }
public static void Lstar(int n,String p){//pattern
    
        for(int i=1;i<=n;i++){
            for(int k=0;k<n-i;k++)
                System.out.print(" ");
            for(int j=0;j<2*i-1;j++)
                System.out.print(p);
            System.out.println("");
        }
    }
public static void Ldiam(int n,String p){//pattern
    
        for(int i=1;i<=n;i++){
            for(int k=0;k<n-i;k++)
                System.out.print(" ");
            for(int j=0;j<2*i-1;j++)
                System.out.print(p);
            System.out.println("");
        }
        for (int i = 0; i < n - 1; i++)     {
       		for (int j = 0; j < i + 1; j++)
            		System.out.print(" ");
        	for (int j = 0; j < 2 * ( n - 1 ) - (1 + 2 * i); j++)
           		System.out.print(p);
        System.out.println("");
    }
        
    }
public static int Rfactor(int i,int two){
    
        if(i>1){
        if(i%two==0){
            System.out.printf("%d",two);
            System.out.printf(" ");
            return Rfactor(i/two,two);
            }
        else{
            two++;
            return Rfactor(i,two);
        }
        }
        else
        return 1;
    }
}
//this is a test for git
