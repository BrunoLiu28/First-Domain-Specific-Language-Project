package scribble.dsl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import scribble.ScribbleDSL;
import scribble.ScribbleFactory;
import scribble.StemWords;
import scribble.StopWord;
import scribble.StringToInt;
import scribble.Text;
import scribble.TextProcessor;
import scribble.Token;

public class TextProcessing {
	private static ScribbleFactory factory = ScribbleFactory.eINSTANCE;
	

	private static String readFile(String filePath) {
		StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        return content.toString();
    }


	public TextProcessorAfterGetData withData(String text)  {
		return new TextprocessorBeingBuilt(factory.createTextProcessor(), text);
	}
	
	public TextProcessorAfterGetData fromFile(String filepath)  {
		String textFromFile = readFile(filepath);
		return new TextprocessorBeingBuilt(factory.createTextProcessor(), textFromFile);
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
	
	public static class TextprocessorBeingBuilt implements TextProcessorAfterGetData, TextProcessorAfterToken, TextProcessorAfterStopwords, TextProcessorAfterStemming, TextProcessorAfterWordFreq{
		
		private ScribbleDSL scribbleBeingBuilt;
		private TextProcessor textProcessorBeingBuilt;
		private StringToInt mapForWordFreq;
		private StopWord stopWordBeingBuilt;
		private StemWords stemWordBeingBuilt;
		private Token tokenBeingBuilt;
		private Text textBeingBuilt;
		
		public TextprocessorBeingBuilt(TextProcessor textProcessorBeingBuilt, String text) {
			this.textBeingBuilt = factory.createText();
			this.textBeingBuilt.setText(text);
			this.textProcessorBeingBuilt = textProcessorBeingBuilt;
			this.textProcessorBeingBuilt.setText(textBeingBuilt);
			this.scribbleBeingBuilt = factory.createScribbleDSL();
			this.scribbleBeingBuilt.setTextprocessor(textProcessorBeingBuilt);
		}
		
		
		@Override
		public TextProcessorAfterToken tokenize(String input) {
			String[] aux = textBeingBuilt.getText().split(input);
			for(int i = 0; i < aux.length; i++) {
				tokenBeingBuilt = factory.createToken();
				tokenBeingBuilt.setTokenName(aux[i]);
				textProcessorBeingBuilt.getToken().add(tokenBeingBuilt);
			}
			return this;
		}

		@Override
		public TextProcessorAfterStopwords filterStopWords() {

			try (BufferedReader reader = new BufferedReader(new FileReader("StopWordList.txt"))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	            	stopWordBeingBuilt = factory.createStopWord();
                    stopWordBeingBuilt.setStopWordName(line.trim());
                    textProcessorBeingBuilt.getStopword().add(stopWordBeingBuilt);
	            }
	        } catch (IOException e) {
	            e.printStackTrace(); 
	        }
			
			for(int i = 0; i < textProcessorBeingBuilt.getStopword().size(); i++) {
				String aux = textProcessorBeingBuilt.getStopword().get(i).getStopWordName();
				for (StopWord str : textProcessorBeingBuilt.getStopword()) {
		            if (aux.equals(str.getStopWordName())) {
		            	textProcessorBeingBuilt.getStopword().remove(i);
		            	break;
		            }
		        }
			}

			
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
