class Main{
    int factorial(int n){
if(n==0||n==1)return 1;
return n*factorial(n-1);
}

public static void main(String args[]){
    Main ob=new Main();
    int res=ob.factorial(5);
    System.out.println(res);
}
}