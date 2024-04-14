
class Maths               // class Maths extends object
{
    public int iNo1;
    public int iNo2;

    public Maths()        
    {
        System.out.println("Inside Default Constructor...");
        iNo1 = 0;
        iNo2 = 0;
    }
    public Maths(int a , int b)
    {
        System.out.println("Inside Parameterized Constructor...");
        iNo1 = a;
        iNo2 = b;
    }

    public int Addition()
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

    public int Substraction()
    {
        int iAns = 0;
        iAns = iNo1 - iNo2;
        return iAns;
    }

}
class Demo                  // class Demo extends object
{
    public static void main(String arg[])
    {
        System.out.println("Inside the main function...");

        Maths mobj1 = new Maths();

        Maths mobj2;
        mobj2 = new Maths(400,30);

        int iRet = 0;

        iRet = mobj1.Addition();
        System.out.println("Addition is : "+iRet);

        iRet = mobj2.Substraction();
        System.out.println("Substraction is : "+iRet);

    }
}