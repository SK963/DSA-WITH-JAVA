import java.util.*;
import java.util.stream.*;

public class StreamApiExample {
	public static void main(String[] args) {
		// Create a stream from a List
		List<Integer> list = Arrays.asList(8, 9, 10, 1, 2, 4, 5, 6);
		System.out.println(list);
		// [8, 9, 10, 1, 2, 4, 5, 6]

		Stream<Integer> stream = list.stream();
		System.out.println(stream);
		// java.util.stream.ReferencePipeline$Head@49476842

		Stream<Integer> fillData = stream.filter(n -> n % 2 == 0);

		// fillData.forEach(n -> System.out.println(n+" "));
		// Exception in thread "main" java.lang.IllegalStateException: stream has
		// already been operated upon or closed
		// at
		// java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
		// at
		// java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596)
		// at Main.main(Main.java:24)
		// Program execution failed(runtime error).

		Stream<Integer> sorted = fillData.sorted();

		Stream<Integer> mapStream = sorted.map(n -> n * 2);

		mapStream.forEach(n -> System.out.print(n + " "));
		// Output : 4 8 12 16 20

		System.out.println();

		// combiing multiple methods using chaining

		Stream<Integer> stream2 = list.stream();

		System.out.println("the same result using method chaining : ");
		Stream<Integer> stream3 = stream2.filter(n -> n % 2 == 0).sorted().map(n -> n * 2);
		stream3.forEach(n -> System.out.print(n + " "));
		// Output: 4 8 12 16 20

	}
}
