public class Main {
    public static void main(String[] args) {
        String message="Bugün hava çok güzel";
        String newMessage=City();
        int number=Num(5,15);
        System.out.println(number);

        int arraySum=Sum2(2,4,6,8,10);
        System.out.println(arraySum);
    }
    public static void Add(){
        System.out.println("Add");
    }

    public static int Num(int num1, int num2){
        return num1+num2;
    }

    public static int Sum2(int... numbers){
        int sum=0;
        for(int number: numbers){
            sum+=number;
        }
        return sum;
    }



    public static String City(){
        return "İstanbul";
    }
}