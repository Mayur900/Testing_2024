package Practice;

@FunctionalInterface
public interface FunctionalInterfaceMy {

	
	public int sum(int i , int j);
	
	public default int sums(int i , int j) {
		return 0;
	}
	
	public static int sumss(int i , int j) {
		return 0;
	}
	
//	FunctionalInterfaceMy f = (i, j) -> {return i+j;};
	
//	List<Integer> nL = l.stream().filter(i -> i % 2 == 0 ).collect(Collectors.toList());-- retrun boolean (filter)
	
//	List<Integer> nL = l.stream().map(i -> i * 2).collect(Collectors.toList()); retrun value (map)

//	Predicate<Integer> p = i -> i % 2 == 0;

//	Function<String,Integer> f = i -> str.length();

	
}
