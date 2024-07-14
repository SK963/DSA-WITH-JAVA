# LAMBDA EXPRESSION

Lambda expressions were introduced in Java 8 as a way to provide a concise syntax for defining anonymous functions , implementing functional interfaces or closures. They allow you to treat functionality as a method argument or to create a simple implementation of a functional interface. Lambda expressions are particularly useful when you need to pass behavior as an argument to a method, such as when working with collections, streams, or functional interfaces

Lambda Expression are shorten form of anonymous class by removing the optional and unnecessary coding in the program .But unlike on compiling a file which have a lambda expression it does not form anonymous class files .

## Syntax :

```java
(parameters) -> { statements; };
```

- Parameters: A comma-separated list of formal parameters, enclosed in parentheses. If there are no parameters, empty parentheses are used **`( )`   no need to specify data types** .
- Arrow token (**`>`**): Separates the parameters from the body of the lambda expression.
- Body: The code block or expression that defines the behavior of the lambda expression.

Syntax in Various situaltion may vary or can be optimized

```java
//no parameteres
() ->  {body);
// One parameter : parenthesis  can be ignored for the parameters
p1 -> {body}
// two or more parameters
(p1,p2) -> {body}

//One statement in the body : optional curly braces and a single semicolon for whole lamda expression
(parameters) -> statement ;

//Two or more statement : no change
(parameters) -> {statement1 ; statement2 ; .....};

```

## Important Aspects :

Lambda expressions can be assigned to functional interfaces, which are interfaces with a single abstract method. These interfaces are also known as SAM (Single Abstract Method) interfaces or functional interfaces. Lambda expressions provide a way to implement the abstract method of such interfaces concisely.

Important aspects of lambda expressions in Java:

1. **Conciseness**: Lambda expressions allow you to write compact and readable code, especially when dealing with functional interfaces.
2. **Functional Interfaces**: Lambda expressions are typically used with functional interfaces, enabling a more functional style of programming in Java.
3. **Deferred Execution**: Lambda expressions are executed only when invoked, allowing for deferred execution and lazy evaluation.
4. **Capture Variables**: Lambda expressions can access variables from their enclosing scope. However, these variables must be effectively final or must be explicitly declared **`final`**.
5. **Type Inference**: Java compiler can often infer the type of parameters in lambda expressions based on the context, reducing the need for explicit type declarations.
6. **Method References**: Lambda expressions can often be replaced with method references, which provide a shorthand notation for invoking existing methods.

Lambda expressions have greatly enhanced the expressive power of Java, particularly in functional programming paradigms and when working with APIs like Streams API and Collections Framework. They provide a more concise and flexible way to represent behavior in Java programs.


## Examples:
### [LambdaExpression.java](./LambdaExpression.java)  
### [LambdaExpressionInComparator.java](./LambdaExpressionInComparator.java)



# Methods Referencing

Method referencing in Java is a shorthand notation of a lambda expression to call a method. It uses the `::` operator and is part of the syntax introduced in Java 8 to enhance the capability of lambda expressions. Method references allow you to refer to methods without executing them, providing a more readable and concise way to represent methods as instances of functional interfaces.

## Important Aspects 

1. **Types of Method References**:
    - **Reference to a Static Method**: `ClassName::staticMethodName`
    - **Reference to an Instance Method of a Particular Object**: `instance::instanceMethodName`
    - **Reference to an Instance Method of an Arbitrary Object of a Particular Type**: `ClassName::instanceMethodName`
    - **Reference to a Constructor**: `ClassName::new`
2. **Syntax**:
    - The `::` operator is used to separate the class or instance from the method name.
    - The method reference should match the functional interface's abstract method's signature.
3. **Functional Interfaces**:
    - Method references are often used with functional interfaces from the `java.util.function` package, such as `Function`, `Consumer`, `Supplier`, `Predicate`, `BiFunction`, etc.

## Uses 

1. **Improves Readability**: Method references make code more concise and readable compared to lambda expressions.
2. **Reduces Boilerplate Code**: Eliminates unnecessary code, making the logic more straightforward .
3. **Enhances Reusability**: Methods can be reused as method references wherever applicable, promoting the DRY (Don't Repeat Yourself) principle .


## Examples
### [MethodReferencing.java](./MethodReferencing.java)
### [MethodReferencingRealExamples.java](./MethodReferencingRealExamples.java)