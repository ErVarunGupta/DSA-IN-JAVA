package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12, 345,10, 2, 6,-9456, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int nums[]){
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfdigits = digits2(num);
//        if(numberOfdigits % 2 == 0){
//            return true;
//        }else{
//            return false;
//        }
        return numberOfdigits % 2 == 0;
    }

    static int digits(int num){

//        if(num < 0){
//            num *= -1;
//        }
         if(num == 0){
            return 1;
        }

        int count = 0;
        while(num != 0){
            count++;
            num /= 10;
        }
        return count;
    }

    static int digits2(int num){
        if(num < 0){
            num *= -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
