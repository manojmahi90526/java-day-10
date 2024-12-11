//sum of n natural numbers using recursion
class Main{
    int sum(int n)
    {
        if(n==0) return 0;
        return n+sum(n-1);
    }
}
class demo{
    public static void main(String args[]){
        Main ob=new Main();
        int res=ob.sum(10);
        System.out.println(res);
    }
}