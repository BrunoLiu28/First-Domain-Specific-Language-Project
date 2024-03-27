package scribble;

import scribble.dsl.TextProcessing;

public class ScribbleTester {
	public static void main(String[] args) {
		TextProcessing processor = new TextProcessing();
		String text = "This is an example text to be processed";
		String text2 = "foxes foxing quick  The quick brown quick foxes jumped quick over quick the quick lazy quick dogs";
		ScribbleDSL tokenizeTest = processor.withData(text)
											.tokenize("\\s+")
											.build();
		for (Token token : tokenizeTest.getTextprocessor().getToken()) {
			System.out.println(token.getTokenName());
		}
		
		ScribbleDSL stopWordRemovalTest = processor.withData(text)
													.tokenize("\\s+")
													.filterStopWords()
													.build();
		for (Token token : stopWordRemovalTest.getTextprocessor().getToken()) {
			System.out.println(token.getTokenName());
		}
		
		ScribbleDSL stemmingTest = processor.withData(text)
											.tokenize("\\s+")
											.performsStemming()
											.build();
		
		for (Token token : stemmingTest.getTextprocessor().getToken()) {
			System.out.println(token.getTokenName());
		}
		
		ScribbleDSL wordFrequencyTest = processor.withData(text2)
											 	.tokenize("\\s+")
											 	.analyseWordFrequency()
												.build();
		
		for (StringToInt stringint : wordFrequencyTest.getTextprocessor().getStringtoint()) {
			System.out.println("the word \"" + stringint.getKey() + "\" appears " + stringint.getValue() + " time(s) in the text");
		}


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
