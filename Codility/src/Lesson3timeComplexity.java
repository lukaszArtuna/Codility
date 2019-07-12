public class Lesson3timeComplexity {

    public static void main(String[] args) {

        //int A[] = {3,1,2,4,3};
        //int A[] = {1,1,3};
        //int A[] = {-1000,1000};
        //int A[] = {-10, -20, -30, -40, 100};
        int A[] = {5, 6, 2, 4, 1};


        int sum=2001;
        int left=0;
        int right=0;




       if (A.length==2){
           sum=Math.abs(A[0]-A[1]);
       }
       else{
           left=A[0];
           for (int i=1; i<A.length; i++){
               right=right+A[i];
           }

           sum=Math.abs(left-right);



           for (int i=1; i<A.length-1;i++){

                 int  temp;
                 temp=Math.abs((left=left+A[i])-(right=right-A[i]));
                    if (temp<sum) {
                        sum=temp;
                    }
           }

           }




        System.out.println(sum);
    }
}

