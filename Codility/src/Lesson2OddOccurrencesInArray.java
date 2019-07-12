public class Lesson2OddOccurrencesInArray {

    public static void main(String[] args) {



        int[] A = new int[] {9,3,9,3,9,7,9};
        int score=0;
        for (int i=0; i<A.length; i++){

            for (int j=1;j<A.length;j++){
                if(A[i]==A[j] && A[i]>0 && j!=i){
                    A[i]=0;
                    A[j]=0;

                    break;
                }

            }



        }
        for (int k=0; k<A.length; k++){
            if(A[k]>0){
                score = A[k];
            }
        }
        //return score;
        System.out.println(score);
    }
}
