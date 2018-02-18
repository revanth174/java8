package methodReferences;

public class RefConstructor {
	
	public static void main(String args[]) {
		Mesageable msg = (str) -> new MethodRef(str);
		msg.msg("hello");
		
		// using method reference
		Mesageable methodMsg = MethodRef :: new;
		methodMsg.msg("method ref");
	}

}

interface Mesageable {
	void msg(String msg);
}