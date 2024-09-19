class Main {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);

    }

    private static void printFactors(int number) {
        if(number < 1){
            System.out.println("Invalid Value");
        }
        int factor = 0;
        for(int i = 1; i <= number; i++){
            if (number % i == 0){
                factor = i;
                System.out.print(factor);
            }
        }
    }
}