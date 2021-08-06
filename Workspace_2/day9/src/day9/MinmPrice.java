package day9;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class MinmPrice {
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1520.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 2240.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1320.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1200.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 950.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1600.22, 4.3f));
		
		List name= busList.stream()
	               .filter(e->e.getProviderName().equals("Xyz Travels"))
				.map(e->e.getCost()).sorted().collect(Collectors.toList());
		
		System.out.println(name.get(0));
	}

}
