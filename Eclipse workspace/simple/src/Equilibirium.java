public class Equilibirium {

    public static void main(String arg[]) {
        int arr[] = {1,5,1,2,2,1};
        int n = arr.length;
        if(n==1)
            System.out.println(1);
        else if(n==2)
            System.out.println(-1);
        else
        {
            int i=0;
            int leftSum=arr[0];
            int rightSum=0;
            for(i=i+2;i<n;i++)
            {
                rightSum=rightSum+arr[i];
            }
            for(i=0;i<n-1;i++)
            {

                if(leftSum==rightSum)
                {
                    System.out.println(i+2);
                    break;
                }
                else
                {
                    if(i!=n-2)
                    {
                        leftSum=leftSum+arr[i+1];
                        rightSum=rightSum-arr[i+2];
                    }

                }
            }

            if(i>=n-1)
                System.out.println(-1);


        }
        }

}
