package morsecode;

public class App {

	public static void main(String[] args) {

		Translate translate = new Translate();

		System.out.println(translate.decode(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
	}
}