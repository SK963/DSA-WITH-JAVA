import java.util.Arrays;

class CustomCollection<T> {
    private Object[] elements;
    private int size;

    public CustomCollection() {
        elements = new Object[10];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
        elements[size++] = element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    
}

public class GenericCollection{
	public static void main(String[] args) {
        CustomCollection<String> names = new CustomCollection<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        System.out.println(names); // Prints the custom collection by calling its name directly
        
        CustomCollection<Integer> marks = new CustomCollection<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);


        System.out.println(marks);
    
    
    
    }
}
