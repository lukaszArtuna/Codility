
public class Lesson1BinaryGap {

	public static void main(String[] args) {
		int N =1041;
        //int N =15;
        //int N =32;
        //int N =561892;
        //int N =328;
        //String binary = Integer.toBinaryString(N);
        
        String binary = Integer.toBinaryString(N);
        boolean firstOne = false;
        int gap = 0;
        int tempGap=0;

        for (int i = 0; i <binary.length(); i++){

            if(binary.charAt(i)=='1'){
                firstOne = true;
            }
            if (binary.charAt(i)=='0' && firstOne==true){
                tempGap++;
            }

            if (binary.charAt(i)=='1' && firstOne==true){
                if(tempGap>=gap) {
                    gap = tempGap;
                    tempGap = 0;

                }
                if(tempGap<gap) {
                    tempGap = 0;

                }
            }
        }


            System.out.println(binary);
            System.out.println(binary.length());
            System.out.println("najwieksza ilosc zer: " + gap);




	}

}
