package Arcade.Intro._11_LandOfLogic;

public class DigitsProduct {

    int digitsProduct(int product) {

        if(product > 0 && product < 10)
            return product;

        if(isPrime(product))
            return -1;

        for(int i = 1; i < 20000; i++){
            int prodNum = product(i);
            if(prodNum == product)
                return i;
        }

        return -1;
    }

    private int product(int num){
        int sum = 1;

        while(num > 0){
            sum *= num % 10;
            num /= 10;
        }

        return sum;
    }


    private boolean isPrime(int num){
        if(num == 0 || num == 1)
            return false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                return false;
            }
        }

        return true;
    }

}
