package scribble;

import scribble.dsl.TextProcessing;

public class ScribbleTester {
	public static void main(String[] args) {
		TextProcessing processor = new TextProcessing();
		String text = "This is an example text to be processed";
		ScribbleDSL tokenizeText = processor.withData(text).tokenize("\\s+").build();
		System.out.println(tokenizeText.getTextprocessor().getToken().toString());
	}
}
