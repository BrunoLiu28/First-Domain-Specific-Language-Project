package scribble.dsl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import opennlp.tools.stemmer.PorterStemmer;
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
                content.append(line.toLowerCase()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        return content.toString();
    }


	public TextProcessorAfterGetData withData(String text)  {
		return new TextprocessorBeingBuilt(factory.createTextProcessor(), text.toLowerCase());
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
		
		private static enum Status {
	        USETOKEN,
	        USESTEMMING
	    }
		
		private ScribbleDSL scribbleBeingBuilt;
		private TextProcessor textProcessorBeingBuilt;
		private StringToInt mapForWordFreq;
		private StopWord stopWordBeingBuilt;
		private StemWords stemWordBeingBuilt;
		private Token tokenBeingBuilt;
		private Text textBeingBuilt;
		private Status whichListToUse;
		
		
		public TextprocessorBeingBuilt(TextProcessor textProcessorBeingBuilt, String text) {
			this.textBeingBuilt = factory.createText();
			this.textBeingBuilt.setText(text);
			this.textProcessorBeingBuilt = textProcessorBeingBuilt;
			this.textProcessorBeingBuilt.setText(textBeingBuilt);
			this.scribbleBeingBuilt = factory.createScribbleDSL();
			this.scribbleBeingBuilt.setTextprocessor(textProcessorBeingBuilt);
			this.whichListToUse = Status.USETOKEN;
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

			//GET THE STOP WORDS FROM THE FILE
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
			
			//REMOVE THE STOP WORDS
			for(int i = 0; i < textProcessorBeingBuilt.getToken().size(); i++) {
				String aux = textProcessorBeingBuilt.getToken().get(i).getTokenName();
				for (StopWord str : textProcessorBeingBuilt.getStopword()) {
		            if (aux.equals(str.getStopWordName())) {
		            	textProcessorBeingBuilt.getToken().remove(i);
		            	i--;
		            	break;
		            }
		        }
			}
			
			
			return this;
		}

		@Override
		public TextProcessorAfterStemming performsStemming() {
			PorterStemmer stemmer = new PorterStemmer();
			this.whichListToUse = Status.USESTEMMING;
			for(int i = 0; i < textProcessorBeingBuilt.getToken().size(); i++) {
				stemmer.stem(textProcessorBeingBuilt.getToken().get(i).getTokenName()); 
				stemWordBeingBuilt = factory.createStemWords();
				stemWordBeingBuilt.setStemedWordName(stemmer.toString());
				textProcessorBeingBuilt.getStemwords().add(stemWordBeingBuilt);
			}
			return this;
		}

		@Override
		public TextProcessorAfterWordFreq analyseWordFrequency() {
			switch (whichListToUse) {
			case USETOKEN: {
				for(int i = 0; i < textProcessorBeingBuilt.getToken().size(); i++) {
					String aux = textProcessorBeingBuilt.getToken().get(i).getTokenName();
					boolean contained = false;
					for(int l = 0; l < textProcessorBeingBuilt.getStringtoint().size(); l++) {
						if (aux.equals(textProcessorBeingBuilt.getStringtoint().get(l).getKey())) {
							textProcessorBeingBuilt.getStringtoint().get(l).setValue((textProcessorBeingBuilt.getStringtoint().get(l).getValue())+1);
							contained = true;
							break;
							}
						}
					if (!contained) {
						mapForWordFreq = factory.createStringToInt();
		            	mapForWordFreq.setKey(aux);
		            	mapForWordFreq.setValue(1);
	                    textProcessorBeingBuilt.getStringtoint().add(mapForWordFreq);
					}
				}
				break;
			}
			case USESTEMMING: {
				for(int i = 0; i < textProcessorBeingBuilt.getStemwords().size(); i++) {
					String aux = textProcessorBeingBuilt.getStemwords().get(i).getStemedWordName();
					boolean contained = false;
					for(int l = 0; l < textProcessorBeingBuilt.getStringtoint().size(); l++) {
						if (aux.equals(textProcessorBeingBuilt.getStringtoint().get(l).getKey())) {
							textProcessorBeingBuilt.getStringtoint().get(l).setValue((textProcessorBeingBuilt.getStringtoint().get(l).getValue())+1);
							contained = true;
							break;
							}
						}
					if (!contained) {
						mapForWordFreq = factory.createStringToInt();
		            	mapForWordFreq.setKey(aux);
		            	mapForWordFreq.setValue(1);
	                    textProcessorBeingBuilt.getStringtoint().add(mapForWordFreq);
					}
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Error");
			}

			return this;
		}

		@Override
		public ScribbleDSL build() {
			return scribbleBeingBuilt;
		}
		

		
	}
}
