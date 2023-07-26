import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import org.eclipse.jdt.annotation.Nullable;

public class Exercise4 {

	static void call(Object x) {
		System.out.println("call1");
	}
	static void call(List x) {
		System.out.println("call2");
	}
	// TODO: Replace the ellipsis
	static void call(int[][] arrc) {
		System.out.println("call3");
	}
	
	public static void main(String[] args) {
		call(null);
	}
}
