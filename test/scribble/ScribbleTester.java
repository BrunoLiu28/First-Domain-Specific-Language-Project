package scribble;

import scribble.dsl.TextProcessing;

public class ScribbleTester {
	public static void main(String[] args) {
		System.out.println("TESTING THE TOKENIZER\n");
		String text = "This is an example text to be processed";
		TextProcessing processor = new TextProcessing();
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
													.tokenize("(\\s|\\.)+")
													.filterStopWords()
													.build();
		for (Token token : stopWordRemovalTest.getTextprocessor().getToken()) {
			System.out.println(token.getTokenName());
		}
		
		
		System.out.println("-------------------------------------------------------");
		System.out.println("TESTING THE STEMMING\n");
		
		ScribbleDSL stemmingTest = processor.withData(text2)
											.tokenize("(\\s|\\.)+")
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

		System.out.println("-------------------------------------------------------");
		System.out.println("TESTING THE STOP WORD REMOVER WITH STEMMING\n");
		ScribbleDSL stopWordRemovalAndStemmingTest = processor.withData(text2)
													.tokenize("(\\s|\\.)+")
													.filterStopWords()
													.performsStemming()
													.build();
		for (StemWords stemWords : stopWordRemovalAndStemmingTest.getTextprocessor().getStemwords()) {
			System.out.println(stemWords.getStemedWordName());
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println("TESTING THE STOP WORD REMOVER WITH WORD FREQUENCY\n");
		ScribbleDSL stopWordRemovalAndWordFreqTest = processor.withData(text2)
													.tokenize("(\\s|\\.)+")
													.filterStopWords()
													.analyseWordFrequency()
													.build();
		for (StringToInt stringint : stopWordRemovalAndWordFreqTest.getTextprocessor().getStringtoint()) {
			System.out.println("the word \"" + stringint.getKey() + "\" appears " + stringint.getValue() + " time(s) in the text");
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println("TESTING THE STEMMING WITH WORD FREQ\n");
		ScribbleDSL stemmingAndWordFreqTest = processor.withData(text2)
													.tokenize("(\\s|\\.)+")
													.performsStemming()
													.analyseWordFrequency()
													.build();
		for (StringToInt stringint : stemmingAndWordFreqTest.getTextprocessor().getStringtoint()) {
			System.out.println("the word \"" + stringint.getKey() + "\" appears " + stringint.getValue() + " time(s) in the text");
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println("TESTING EVERYTHING TOGETHER\n");
		ScribbleDSL allTogetherTest = processor.fromFile("testFile.txt")
													.tokenize("(\\s|\\.)+")
													.filterStopWords()
													.performsStemming()
													.analyseWordFrequency()
													.build();
		for (StringToInt stringint : allTogetherTest.getTextprocessor().getStringtoint()) {
			System.out.println("the word \"" + stringint.getKey() + "\" appears " + stringint.getValue() + " time(s) in the text");
		}

	}
}
