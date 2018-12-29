package entities;

import java.util.List;
import java.util.function.Predicate;

public class Services {
    
    public double filteredSum(List<People> list, Predicate<People> criteria) {
         double sum = 0.0;
		for (People p : list) {
			if (criteria.test(p)) {
				sum += p.getSalary();
			}
		}
		return sum;
    }
    
}
