 class Box<T> {
    private T data;

    // Generic constructor with type parameter T
    public Box(T data) {
        this.data = data;
    }

    // Getter method
    public T getData() {
        return data;
    }

    
}

public class GenericConstructor{
	public static void main(String[] args) {
        // Creating a Box object with Integer type
        Box<Integer> integerBox = new Box<>(123);
        System.out.println("Data in integerBox: " + integerBox.getData());

        // Creating a Box object with String type
        Box<String> stringBox = new Box<>("Hello, World!");
        System.out.println("Data in stringBox: " + stringBox.getData());
    }
}


//output
// Data in integerBox: 123
// Data in stringBox: Hello, World!
