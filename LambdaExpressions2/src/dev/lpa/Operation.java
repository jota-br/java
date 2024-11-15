package LambdaExpressions2.src.dev.lpa;

@FunctionalInterface
public interface Operation<T> {

    T operate(T value1, T value2);
}
