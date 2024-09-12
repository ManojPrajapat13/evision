package lambda;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public interface SupplierInterface {
	
	public static void main(String[] args) {
		
		Supplier <LocalDateTime> s = () -> LocalDateTime.now();
		
		System.out.println(s.get());
	}
}
