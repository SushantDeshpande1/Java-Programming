import java.util.* ;

class Input
{
    public static void main(String args[])
    {
        Scanner iobj = new Scanner(System.in);
        int iNo1 = 0 , iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter the First Number");
        iNo1 = iobj.nextInt();

        System.out.println("Enter the Second Number");
        iNo2 = iobj.nextInt();

        iAns = iNo1 + iNo2;
        
        System.out.println("Addition of above 2 Numbers is : "+iAns);

    }
}