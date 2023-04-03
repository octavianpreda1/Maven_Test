package exercitiul2;

public class PerecheNumere {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public PerecheNumere(){}
    public PerecheNumere(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "PerecheNumere{" + "x=" + x + ", y=" + y + '}';
    }

    public boolean pare_egale()
    {
        int even1=0, even2=0, a=x, b=y;
        while(a!=0)
        {
            if((a%10)%2==0)
                even1++;
            a/=10;
        }
        while(b!=0)
        {
            if((b%10)%2==0)
                even2++;
            b/=10;
        }
        if(even1==even2)
            return true;
        return false;
    }

    public boolean suma_numere()
    {
        int sum1=0, sum2=0, a=x, b=y;
        while(a!=0)
        {
            sum1+=a%10;
            a/=10;
        }
        while(b!=0)
        {
            sum2+=b%10;
            b/=10;
        }
        if(sum1==sum2)
            return true;
        return false;
    }

    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int consecutive(int a, int b)
    {
        int c;

        if (((a==1) && (b==0)) || ((a==1) && (b==1))) return(1);

        else if ((a==b) || (a<=0) || (b<=0)) return(0);

        c = a-b;

        if (c>=0) return(consecutive(b,c)); else return(0);
    }
    public int cmmmc()
    {
        return (x / gcd(x, y)) * y;
    }

    public boolean fib()
    {
        int a=x,b=y;
        if(b>a)
        {
            b=x;
            a=y;
        }

        if(consecutive(a,b)==1)
            return true;
        return false;
    }


}
