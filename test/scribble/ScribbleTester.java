package scribble;

import scribble.dsl.TextProcessing;

public class ScribbleTester {
	public static void main(String[] args) {
		System.out.println("TESTING THE TOKENIZER\n");
		TextProcessing processor = new TextProcessing();
		String text = "This is an example text to be processed";
		ScribbleDSL tokenizeTest = processor.withData(text)
											.tokenize("\\s+")
											.build();
		for (Token token : tokenizeTest.getTextprocessor().getToken()) {
			System.out.println(token.getTokenName());
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println("TESTING THE STOP WORD REMOVER\n");
		String text2 = "The quick brown foxes jumped over the lazy dogs.";
		ScribbleDSL stopWordRemovalTest = processor.withData(text2)
													.tokenize("\\s+")
													.filterStopWords()
													.build();
		for (Token token : stopWordRemovalTest.getTextprocessor().getToken()) {
			System.out.println(token.getTokenName());
		}
		
		
		System.out.println("-------------------------------------------------------");
		System.out.println("TESTING THE STEMMING\n");
		
		ScribbleDSL stemmingTest = processor.withData(text2)
											.tokenize("\\s+")
											.performsStemming()
											.build();
		
		for (StemWords stemWords : stemmingTest.getTextprocessor().getStemwords()) {
			System.out.println(stemWords.getStemedWordName());
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println("TESTING THE WORD FREQUENCY\n");
		
		ScribbleDSL wordFrequencyTest = processor.fromFile("testFile.txt")
											 	.tokenize("(\\s|\\.)+")
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
//		System.out.println("-------------------------------------------------------");
//		ScribbleDSL analyseText = processor.withData(text2)
//										 	.tokenize("\\s+")
//										 	.filterStopWords()
//										 	.performsStemming()
//										 	.analyseWordFrequency()
//											.build();
//		
//		for (StringToInt stringint : analyseText.getTextprocessor().getStringtoint()) {
//			System.out.println("the word \"" + stringint.getKey() + "\" appears " + stringint.getValue() + " time(s) in the text");
//		}
//		for (StemWords token : analyseText.getTextprocessor().getStemwords()) {
//			System.out.println(token.getStemedWordName());
//		}
	}
}
