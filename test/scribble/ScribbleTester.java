package scribble;

import scribble.dsl.TextProcessing;

public class ScribbleTester {
	public static void main(String[] args) {
		TextProcessing processor = new TextProcessing();
		String text = "This is an example text to be processed";
		String text2 = "foxes foxing quick  The quick brown quick foxes jumped quick over quick the quick lazy quick dogs";
//		ScribbleDSL tokenizeText = processor.withData(text)
//											.tokenize("\\s+")
//											.build();
//		for (Token token : tokenizeText.getTextprocessor().getToken()) {
//			System.out.println(token.getTokenName());
//		}
//		
//		ScribbleDSL analyseText = processor.fromFile("testFile.txt")
//										 	.tokenize("\\s+")
//										 	.filterStopWords()
//										 	.performsStemming()
//										 	.analyseWordFrequency()
//											.build();
		ScribbleDSL analyseText = processor.withData(text2)
										 	.tokenize("\\s+")
										 	.filterStopWords()
										 	.performsStemming()
										 	.analyseWordFrequency()
											.build();
		
		for (StringToInt stringint : analyseText.getTextprocessor().getStringtoint()) {
			System.out.println("the word \"" + stringint.getKey() + "\" appears " + stringint.getValue() + " time(s) in the text");
		}
//		for (StemWords token : analyseText.getTextprocessor().getStemwords()) {
//			System.out.println(token.getStemedWordName());
//		}
	}
}
