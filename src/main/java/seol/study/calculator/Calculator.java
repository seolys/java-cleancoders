package seol.study.calculator;

public class Calculator {
    private PriceStrategy strategy;

    public Calculator(PriceStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculate(int price){
        this.strategy.apply(price);
    }
}
