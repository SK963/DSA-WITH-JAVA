import java.util.function.*;

public class FunctionalInterfacesExample {

    public static void main(String[] args) {
        // Function<T, R> - Takes an argument of type T and returns a result of type R
        Function<String, Integer> function = String::length;
        System.out.println("Function: " + function.apply("Hello")); // Output: 5

        // UnaryOperator<T> - A specialization of Function where both input and output are of the same type
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println("UnaryOperator: " + unaryOperator.apply(5)); // Output: 25

        // BiFunction<T, U, R> - Takes two arguments of types T and U and returns a result of type R
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println("BiFunction: " + biFunction.apply(2, 3)); // Output: 5

        // BinaryOperator<T> - A specialization of BiFunction where all inputs and the output are of the same type
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println("BinaryOperator: " + binaryOperator.apply(2, 3)); // Output: 6

        // Predicate<T> - Takes an argument of type T and returns a boolean
        Predicate<String> predicate = String::isEmpty;
        System.out.println("Predicate: " + predicate.test("")); // Output: true

        // BiPredicate<T, U> - Takes two arguments of types T and U and returns a boolean
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println("BiPredicate: " + biPredicate.test(5, 3)); // Output: true

        // Supplier<T> - Takes no arguments and returns a result of type T
        Supplier<String> supplier = () -> "Hello, World!";
        System.out.println("Supplier: " + supplier.get()); // Output: Hello, World!

        // Consumer<T> - Takes an argument of type T and returns no result
        Consumer<String> consumer = System.out::println;
        consumer.accept("Consumer: Hello, Consumer!"); // Output: Consumer: Hello, Consumer!

        // BiConsumer<T, U> - Takes two arguments of types T and U and returns no result
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);
        biConsumer.accept("BiConsumer:", "Hello, BiConsumer!"); // Output: BiConsumer: Hello, BiConsumer!

        // BooleanSupplier - Takes no arguments and returns a boolean
        BooleanSupplier booleanSupplier = () -> true;
        System.out.println("BooleanSupplier: " + booleanSupplier.getAsBoolean()); // Output: true

        // DoubleBinaryOperator - Takes two double arguments and returns a double result
        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a * b;
        System.out.println("DoubleBinaryOperator: " + doubleBinaryOperator.applyAsDouble(2.0, 3.0)); // Output: 6.0

        // DoubleConsumer - Takes a double argument and returns no result
        DoubleConsumer doubleConsumer = System.out::println;
        doubleConsumer.accept(3.14); // Output: 3.14

        // DoubleFunction<R> - Takes a double argument and returns a result of type R
        DoubleFunction<String> doubleFunction = String::valueOf;
        System.out.println("DoubleFunction: " + doubleFunction.apply(3.14)); // Output: 3.14

        // DoublePredicate - Takes a double argument and returns a boolean
        DoublePredicate doublePredicate = x -> x > 0;
        System.out.println("DoublePredicate: " + doublePredicate.test(1.0)); // Output: true

        // DoubleSupplier - Takes no arguments and returns a double result
        DoubleSupplier doubleSupplier = () -> 3.14;
        System.out.println("DoubleSupplier: " + doubleSupplier.getAsDouble()); // Output: 3.14

        // DoubleToIntFunction - Takes a double argument and returns an int result
        DoubleToIntFunction doubleToIntFunction = x -> (int) x;
        System.out.println("DoubleToIntFunction: " + doubleToIntFunction.applyAsInt(3.14)); // Output: 3

        // DoubleToLongFunction - Takes a double argument and returns a long result
        DoubleToLongFunction doubleToLongFunction = x -> (long) x;
        System.out.println("DoubleToLongFunction: " + doubleToLongFunction.applyAsLong(3.14)); // Output: 3

        // DoubleUnaryOperator - Takes a double argument and returns a double result
        DoubleUnaryOperator doubleUnaryOperator = x -> x * x;
        System.out.println("DoubleUnaryOperator: " + doubleUnaryOperator.applyAsDouble(3.14)); // Output: 9.8596

        // IntBinaryOperator - Takes two int arguments and returns an int result
        IntBinaryOperator intBinaryOperator = (a, b) -> a + b;
        System.out.println("IntBinaryOperator: " + intBinaryOperator.applyAsInt(2, 3)); // Output: 5

        // IntConsumer - Takes an int argument and returns no result
        IntConsumer intConsumer = System.out::println;
        intConsumer.accept(42); // Output: 42

        // IntFunction<R> - Takes an int argument and returns a result of type R
        IntFunction<String> intFunction = String::valueOf;
        System.out.println("IntFunction: " + intFunction.apply(42)); // Output: 42

        // IntPredicate - Takes an int argument and returns a boolean
        IntPredicate intPredicate = x -> x > 0;
        System.out.println("IntPredicate: " + intPredicate.test(42)); // Output: true

        // IntSupplier - Takes no arguments and returns an int result
        IntSupplier intSupplier = () -> 42;
        System.out.println("IntSupplier: " + intSupplier.getAsInt()); // Output: 42

        // IntToDoubleFunction - Takes an int argument and returns a double result
        IntToDoubleFunction intToDoubleFunction = x -> x / 2.0;
        System.out.println("IntToDoubleFunction: " + intToDoubleFunction.applyAsDouble(42)); // Output: 21.0

        // IntToLongFunction - Takes an int argument and returns a long result
        IntToLongFunction intToLongFunction = x -> x * 2L;
        System.out.println("IntToLongFunction: " + intToLongFunction.applyAsLong(42)); // Output: 84

        // IntUnaryOperator - Takes an int argument and returns an int result
        IntUnaryOperator intUnaryOperator = x -> x * x;
        System.out.println("IntUnaryOperator: " + intUnaryOperator.applyAsInt(6)); // Output: 36

        // LongBinaryOperator - Takes two long arguments and returns a long result
        LongBinaryOperator longBinaryOperator = (a, b) -> a + b;
        System.out.println("LongBinaryOperator: " + longBinaryOperator.applyAsLong(2L, 3L)); // Output: 5

        // LongConsumer - Takes a long argument and returns no result
        LongConsumer longConsumer = System.out::println;
        longConsumer.accept(42L); // Output: 42

        // LongFunction<R> - Takes a long argument and returns a result of type R
        LongFunction<String> longFunction = String::valueOf;
        System.out.println("LongFunction: " + longFunction.apply(42L)); // Output: 42

        // LongPredicate - Takes a long argument and returns a boolean
        LongPredicate longPredicate = x -> x > 0;
        System.out.println("LongPredicate: " + longPredicate.test(42L)); // Output: true

        // LongSupplier - Takes no arguments and returns a long result
        LongSupplier longSupplier = () -> 42L;
        System.out.println("LongSupplier: " + longSupplier.getAsLong()); // Output: 42

        // LongToDoubleFunction - Takes a long argument and returns a double result
        LongToDoubleFunction longToDoubleFunction = x -> x / 2.0;
        System.out.println("LongToDoubleFunction: " + longToDoubleFunction.applyAsDouble(42L)); // Output: 21.0

        // LongToIntFunction - Takes a long argument and returns an int result
        LongToIntFunction longToIntFunction = x -> (int) (x / 2);
        System.out.println("LongToIntFunction: " + longToIntFunction.applyAsInt(42L)); // Output: 21

        // LongUnaryOperator - Takes a long argument and returns a long result
        LongUnaryOperator longUnaryOperator = x -> x * x;
        System.out.println("LongUnaryOperator: " + longUnaryOperator.applyAsLong(6L)); // Output: 36

        // ObjDoubleConsumer<T> - Takes an object of type T and a double argument, and returns no result
        ObjDoubleConsumer<String> objDoubleConsumer = (str, d) -> System.out.println(str + d);
        objDoubleConsumer.accept("Value: ", 3.14); // Output: Value: 3.14

        // ObjIntConsumer<T> - Takes an object of type T and an int argument, and returns no result
        ObjIntConsumer<String> objIntConsumer = (str, i) -> System.out.println(str + i);
        objIntConsumer.accept("Value: ", 42); // Output: Value: 42

        // ObjLongConsumer<T> - Takes an object of type T and a long argument, and returns no result
        ObjLongConsumer<String> objLongConsumer = (str, l) -> System.out.println(str + l);
        objLongConsumer.accept("Value: ", 42L); // Output: Value: 42

        // ToDoubleBiFunction<T, U> - Takes two arguments of types T and U and returns a double result
        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (a, b) -> a + b / 2.0;
        System.out.println("ToDoubleBiFunction: " + toDoubleBiFunction.applyAsDouble(4, 2)); // Output: 5.0

        // ToDoubleFunction<T> - Takes an argument of type T and returns a double result
        ToDoubleFunction<String> toDoubleFunction = Double::parseDouble;
        System.out.println("ToDoubleFunction: " + toDoubleFunction.applyAsDouble("3.14")); // Output: 3.14

        // ToIntBiFunction<T, U> - Takes two arguments of types T and U and returns an int result
        ToIntBiFunction<String, String> toIntBiFunction = (a, b) -> Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println("ToIntBiFunction: " + toIntBiFunction.applyAsInt("3", "4")); // Output: 7

        // ToIntFunction<T> - Takes an argument of type T and returns an int result
        ToIntFunction<String> toIntFunction = Integer::parseInt;
        System.out.println("ToIntFunction: " + toIntFunction.applyAsInt("42")); // Output: 42

        // ToLongBiFunction<T, U> - Takes two arguments of types T and U and returns a long result
        ToLongBiFunction<String, String> toLongBiFunction = (a, b) -> Long.parseLong(a) + Long.parseLong(b);
        System.out.println("ToLongBiFunction: " + toLongBiFunction.applyAsLong("3", "4")); // Output: 7

        // ToLongFunction<T> - Takes an argument of type T and returns a long result
        ToLongFunction<String> toLongFunction = Long::parseLong;
        System.out.println("ToLongFunction: " + toLongFunction.applyAsLong("42")); // Output: 42
    }
}
