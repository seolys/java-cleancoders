package seol.study.calculator;

@FunctionalInterface
public interface PriceStrategy {
    void apply(int price);
}
