public class Main {
    public static void main(String[] args) {

        numberFinder();
    }
    public static void numberFinder(){
        int[] numbers =new int[]{1,2,3,4};
        int theNumber =6;
        boolean isThere =false;
        for(int number : numbers){
            if(number==theNumber){
                isThere =true;
                break;
            }
        }
        if(isThere){
            System.out.println("Number is available");
        }
        else{
            System.out.println("Number not available");
        }

    }
}
