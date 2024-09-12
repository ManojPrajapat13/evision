package lambda;
import java.util.function.Consumer;
public interface ConsumerDemo {
	public static void main(String[] args) {
		
		Consumer <String > con = (t) -> System.out.println(t);
		
		con.accept("gita");
	}
}