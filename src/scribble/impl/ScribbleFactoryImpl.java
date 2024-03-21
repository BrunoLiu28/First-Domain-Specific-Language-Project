/**
 */
package scribble.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import scribble.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScribbleFactoryImpl extends EFactoryImpl implements ScribbleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScribbleFactory init() {
		try {
			ScribbleFactory theScribbleFactory = (ScribbleFactory)EPackage.Registry.INSTANCE.getEFactory(ScribblePackage.eNS_URI);
			if (theScribbleFactory != null) {
				return theScribbleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScribbleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScribbleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScribblePackage.SCRIBBLE_DSL: return createScribbleDSL();
			case ScribblePackage.TEXT_PROCESSOR: return createTextProcessor();
			case ScribblePackage.STOP_WORD: return createStopWord();
			case ScribblePackage.TEXT: return createText();
			case ScribblePackage.MODEL: return createModel();
			case ScribblePackage.TOKEN: return createToken();
			case ScribblePackage.STEM_WORDS: return createStemWords();
			case ScribblePackage.STRING_TO_INT: return createStringToInt();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScribbleDSL createScribbleDSL() {
		ScribbleDSLImpl scribbleDSL = new ScribbleDSLImpl();
		return scribbleDSL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextProcessor createTextProcessor() {
		TextProcessorImpl textProcessor = new TextProcessorImpl();
		return textProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopWord createStopWord() {
		StopWordImpl stopWord = new StopWordImpl();
		return stopWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StemWords createStemWords() {
		StemWordsImpl stemWords = new StemWordsImpl();
		return stemWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringToInt createStringToInt() {
		StringToIntImpl stringToInt = new StringToIntImpl();
		return stringToInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScribblePackage getScribblePackage() {
		return (ScribblePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScribblePackage getPackage() {
		return ScribblePackage.eINSTANCE;
	}

} //ScribbleFactoryImpl
