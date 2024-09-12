package Evision;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sbbb = new StringBuilder();
//		System.out.println(sbbb.capacity());  // intial capacity is 16.
		
		StringBuilder sbb = new StringBuilder("mncnn");
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb);
		
		sb.append("bnmsdfghjk");
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.insert(2, "RAM");
		System.out.println(sb);
		sb.replace(2, 5, "manoj");
		System.out.println(sb);
		sb.delete(2, 7);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println("cap -- "+sb.capacity());
		System.out.println(sb.charAt(6));
		System.out.println("length -- "+sb.length());
		System.out.println(sb.substring(5));
		System.out.println(sb.substring(0 , 4));
		
		StringBuilder b =new StringBuilder();    
		System.out.println(b.capacity());//default 16    
		sb.append("Hello");    
		System.out.println(b.capacity());//now 16    
		b.append("Java is my favourite language");    
		System.out.println(b.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2    
	}
}
