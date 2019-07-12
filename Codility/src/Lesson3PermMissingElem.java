import java.util.Arrays;

public class Lesson3PermMissingElem {

    public static void main(String[] args) {

        int A[] = {2, 3, 1, 5};
        int wynik=1;
        Arrays.sort(A);


        for (int i =0; i<A.length; i++){

            if(A[0]!=1){
                break;
            }

            if(A[i]!=i+A[0]){
                wynik=A[i]-1;
                break;
            }
            else if(i==A.length-1){
                wynik=A[A.length-1]+1;
            }

        }

        //return wynik;



    }
}
