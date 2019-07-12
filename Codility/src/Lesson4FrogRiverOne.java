public class Lesson4FrogRiverOne {

    public static void main(String[] args) {

        //int A[] = {1,3,1,4,2,3,2,3,4,2,1,3,1,3,2,5,2};
        int A[] = {1,1,1,1};
        int X=2;
        int sumaLiczbTablicy=0;
        int tymczasowaSumaTablicy=0;
        int out=-1;
        int wynik =0;
        int B[]= new int [X];



        for (int i=0; i<X; i++){
            sumaLiczbTablicy=sumaLiczbTablicy+i+1;

        }


        for(int i=0; i<A.length; i++){
            if(X>A.length){
                break;
            }

            if(X>=A[i]){

                B[A[i]-1]=A[i];
                out=i;


                if (i>=X){
                    for (int j=0; j<X; j++){
                        tymczasowaSumaTablicy=tymczasowaSumaTablicy+B[j];


                    }
                    if(tymczasowaSumaTablicy<sumaLiczbTablicy){
                        tymczasowaSumaTablicy=0;

                    }

                    if(i==A.length-1 && tymczasowaSumaTablicy<sumaLiczbTablicy){
                        out=-1;
                    }

                    if(tymczasowaSumaTablicy==sumaLiczbTablicy){

                        break;
                    }



                }


            }
        }

       //return out;

        System.out.println(sumaLiczbTablicy);
        System.out.println(tymczasowaSumaTablicy);
        System.out.println(out);



    }
}
