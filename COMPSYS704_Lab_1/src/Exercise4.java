import java.util.List;
import java.util.Vector;

public class Exercise4 {
	public static void main(String[] args) {
		call(null);
	}
	static void call(Object x) {
		System.out.println("call1");
	}
	static void call(List x) {
		System.out.println("call2");
	}
	// TODO: Replace the ellipsis
	static void call(...) {
		System.out.println("call3");
	}
}
