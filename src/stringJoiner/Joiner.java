package stringJoiner;

import java.util.StringJoiner;

public class Joiner {

	
	public static void main(String args[]) {
		StringJoiner newstring = new StringJoiner(";","{","}");
		newstring.add("vendi");
		newstring.add("darling");
		newstring.add("kanna").add("krisha");
		newstring.setEmptyValue("its empty string");
		System.out.println(newstring);
	}
}
