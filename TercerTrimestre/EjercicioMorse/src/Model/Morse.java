package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Morse {
private String [] morse;

public Morse(String[] morse) {
	super();
	this.morse = morse;
}

public String[] getMorse() {
	return morse;
}

public void setMorse(String[] morse) {
	this.morse = morse;
}

@Override
public String toString() {
	return "Morse [morse=" + Arrays.toString(morse) + "]";
}
public String traductorMorse() {
	String[] caracteresEnMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", 
			"--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
			".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
			"-.--", "--..", ".----","..---", "...--", "....-", ".....", "-....",
			"--...", "---..", "----.","-----", "--..--", ".-.-.-", "..--.."};
	String [] caracteres = { "a", "b", "c", "d", "e", "f", "g", "h", "i",
			"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
			"x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
			",", ".", "?"};
	List<String> aux = new ArrayList<>();
	StringBuilder traduccion = new StringBuilder();
	for (int i = 0; i < morse.length; i++) {
		
		if(morse.equals(caracteresEnMorse[i])) {
			aux.add(caracteres[i]);
		}
	}
	for (String string : aux) {
		traduccion.append(string);
	}
	return traduccion.toString();
}
}
