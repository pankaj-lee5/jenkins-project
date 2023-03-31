
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

	public static void main(String[] args) {
		//calculateSumByImperative();
		//calculateSumByDeclarative();
		//displayEvenByImperative();
		//displayEvenByDeclarative();
		addPrfixByImperative();
		addPrfixByDeclarative();
	}

	private static void addPrfixByDeclarative() {
		List<String> names = Arrays.asList("John", "Peter", "Ricky");
		List<String> namesWithTitle = null;
		String prefix = "Mr .";
		namesWithTitle = names.stream().map(name->prefix + name).collect(Collectors.toList());
		System.out.println("Names with Title by Declarative : "+namesWithTitle);
	}

	private static void addPrfixByImperative() {
		List<String> names = Arrays.asList("John", "Peter", "Ricky");
		List<String> namesWithTitle = new ArrayList<>();
		String prefix = "Mr .";
		for (String name : names) {
			namesWithTitle.add(prefix + name);
		}
		System.out.println("Names with Title by Imperative : "+namesWithTitle);
	}

	private static void displayEvenByDeclarative() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> evennumbers =null;
		evennumbers = numbers.stream().filter(number->number%2==0).collect(Collectors.toList());
		System.out.println("List of even numbers by Declarative :"+evennumbers);
	}

	private static void displayEvenByImperative() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> evennumbers = new ArrayList<>();
		for(Integer number : numbers) {
			if(number%2==0) {
				evennumbers.add(number);
			}
		}
		System.out.println("List Of even numbers by Imperative :"+evennumbers);
	}

	private static void calculateSumByDeclarative() {
		int sum = IntStream.rangeClosed(1, 100).sum();
		System.out.println("Sum By Declarative : " + sum);
	}

	private static void calculateSumByImperative() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("Sum By Imperative : " + sum);
	}

}
