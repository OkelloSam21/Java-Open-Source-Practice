class sumOfOddNumbers{
    public static void main(String[] args) {

        int sum = 0;
        int num = 0;

        // Using for loop
        for(;num = 0; num++){
            if(num % 2 == 1) 
                sum += num;
        }
        System.out.println(sum);

        // Using do-while loop
        do {
            for(;num = 0; num++){
                if(num % 2 == 1) {
                    sum += num;
                    num++
                }
            }while(num <= 100);

            System.out.println(sum);
        }

        // Using while loop
        while(num <= 100){
            for(;num = 0; num++){
                if(num % 2 == 1) {
                    sum += num;
                    num++
                }
                System.out.println(sum);
        }
    }
}