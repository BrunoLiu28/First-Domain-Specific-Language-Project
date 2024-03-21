package scribble.dsl;

import scribble.ScribbleDSL;
import scribble.ScribbleFactory;
import scribble.StemWords;
import scribble.StopWord;
import scribble.StringToInt;
import scribble.TextProcessor;
import scribble.Token;

public class TextProcessing {
	private static ScribbleFactory factory = ScribbleFactory.eINSTANCE;
	
	
//	public TextprocessorWaitingForData builder(String name) {
//		return new TextprocessorWaitingForData(factory.createStateMachine(), name);
//	}
	
	// steps of the method chain
	public TextProcessorAfterGetData withData(String text)  {
		return new TexprocessorBeingBuilt(factory.createScribbleDSL());
	}
	
	public TextProcessorAfterGetData fromFile(String text)  {
		return new TexprocessorBeingBuilt(factory.createScribbleDSL());
	}
	
	public interface TextProcessorAfterGetData{
		public TextProcessorAfterToken tokenize(String input);
	}
	
	public interface TextProcessorAfterToken{
		public TextProcessorAfterStopwords filterStopWords();
		public TextProcessorAfterStemming performsStemming();
		public TextProcessorAfterWordFreq analyseWordFrequency();
		public ScribbleDSL build();
	}
	
	public interface TextProcessorAfterStopwords{
		public TextProcessorAfterStemming performsStemming();
		public TextProcessorAfterWordFreq analyseWordFrequency();
		public ScribbleDSL build();
	}
	
	public interface TextProcessorAfterStemming{
		public TextProcessorAfterWordFreq analyseWordFrequency();
		public ScribbleDSL build();
	}
	
	public interface TextProcessorAfterWordFreq{
		public ScribbleDSL build();
	}
	
	public static class TexprocessorBeingBuilt implements TextProcessorAfterGetData, TextProcessorAfterToken, TextProcessorAfterStopwords, TextProcessorAfterStemming, TextProcessorAfterWordFreq{
		
		private ScribbleDSL scribbleBeingBuilt;
		private TextProcessor textProcessorBeingBuilt;
		private StringToInt mapForWordFreq;
		private StopWord stopWordBeingBuilt;
		private StemWords stemWordBeingBuilt;
		private Token tokenBeingBuilt;
		private Text textBeingBuilt;
		
		
		
		@Override
		public TextProcessorAfterToken tokenize(String input) {
			
			return this;
		}

		@Override
		public TextProcessorAfterStopwords filterStopWords() {
			// TODO Auto-generated method stub
			return this;
		}

		@Override
		public TextProcessorAfterStemming performsStemming() {
			// TODO Auto-generated method stub
			return this;
		}

		@Override
		public TextProcessorAfterWordFreq analyseWordFrequency() {
			// TODO Auto-generated method stub
			return this;
		}

		@Override
		public ScribbleDSL build() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
