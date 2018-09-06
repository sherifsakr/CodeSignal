package Arcade.TheCore._02_AtTheCrossroads;

public class ArithmeticExpression {

    boolean arithmeticExpression(int a, int b, int c) {
        if (a + b == c || a - b == c || a * b == c || c * b == a)
            return true;

        return false;

    }

}
