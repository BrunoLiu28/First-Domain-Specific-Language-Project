/**
 */
package scribble;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see scribble.ScribbleFactory
 * @model kind="package"
 * @generated
 */
public interface ScribblePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scribble";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ScribeDSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ScribleDSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScribblePackage eINSTANCE = scribble.impl.ScribblePackageImpl.init();

	/**
	 * The meta object id for the '{@link scribble.impl.ScribbleDSLImpl <em>DSL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribble.impl.ScribbleDSLImpl
	 * @see scribble.impl.ScribblePackageImpl#getScribbleDSL()
	 * @generated
	 */
	int SCRIBBLE_DSL = 0;

	/**
	 * The feature id for the '<em><b>Textprocessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIBBLE_DSL__TEXTPROCESSOR = 0;

	/**
	 * The number of structural features of the '<em>DSL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIBBLE_DSL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DSL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIBBLE_DSL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scribble.impl.TextProcessorImpl <em>Text Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribble.impl.TextProcessorImpl
	 * @see scribble.impl.ScribblePackageImpl#getTextProcessor()
	 * @generated
	 */
	int TEXT_PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Stopword</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR__STOPWORD = 0;

	/**
	 * The feature id for the '<em><b>Stemwords</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR__STEMWORDS = 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR__TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR__TEXT = 3;

	/**
	 * The feature id for the '<em><b>Stringtoint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR__STRINGTOINT = 4;

	/**
	 * The number of structural features of the '<em>Text Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Text Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scribble.impl.StopWordImpl <em>Stop Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribble.impl.StopWordImpl
	 * @see scribble.impl.ScribblePackageImpl#getStopWord()
	 * @generated
	 */
	int STOP_WORD = 2;

	/**
	 * The feature id for the '<em><b>Stop Word Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_WORD__STOP_WORD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Stop Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_WORD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stop Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_WORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scribble.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribble.impl.TextImpl
	 * @see scribble.impl.ScribblePackageImpl#getText()
	 * @generated
	 */
	int TEXT = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scribble.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribble.impl.ModelImpl
	 * @see scribble.impl.ScribblePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scribble.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribble.impl.TokenImpl
	 * @see scribble.impl.ScribblePackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 5;

	/**
	 * The feature id for the '<em><b>Token Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TOKEN_NAME = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scribble.impl.StemWordsImpl <em>Stem Words</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribble.impl.StemWordsImpl
	 * @see scribble.impl.ScribblePackageImpl#getStemWords()
	 * @generated
	 */
	int STEM_WORDS = 6;

	/**
	 * The feature id for the '<em><b>Stemed Word Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEM_WORDS__STEMED_WORD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Stem Words</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEM_WORDS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stem Words</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEM_WORDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scribble.impl.StringToIntImpl <em>String To Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribble.impl.StringToIntImpl
	 * @see scribble.impl.ScribblePackageImpl#getStringToInt()
	 * @generated
	 */
	int STRING_TO_INT = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link scribble.ScribbleDSL <em>DSL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSL</em>'.
	 * @see scribble.ScribbleDSL
	 * @generated
	 */
	EClass getScribbleDSL();

	/**
	 * Returns the meta object for the containment reference '{@link scribble.ScribbleDSL#getTextprocessor <em>Textprocessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textprocessor</em>'.
	 * @see scribble.ScribbleDSL#getTextprocessor()
	 * @see #getScribbleDSL()
	 * @generated
	 */
	EReference getScribbleDSL_Textprocessor();

	/**
	 * Returns the meta object for class '{@link scribble.TextProcessor <em>Text Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Processor</em>'.
	 * @see scribble.TextProcessor
	 * @generated
	 */
	EClass getTextProcessor();

	/**
	 * Returns the meta object for the reference list '{@link scribble.TextProcessor#getStopword <em>Stopword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stopword</em>'.
	 * @see scribble.TextProcessor#getStopword()
	 * @see #getTextProcessor()
	 * @generated
	 */
	EReference getTextProcessor_Stopword();

	/**
	 * Returns the meta object for the reference list '{@link scribble.TextProcessor#getStemwords <em>Stemwords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stemwords</em>'.
	 * @see scribble.TextProcessor#getStemwords()
	 * @see #getTextProcessor()
	 * @generated
	 */
	EReference getTextProcessor_Stemwords();

	/**
	 * Returns the meta object for the reference list '{@link scribble.TextProcessor#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Token</em>'.
	 * @see scribble.TextProcessor#getToken()
	 * @see #getTextProcessor()
	 * @generated
	 */
	EReference getTextProcessor_Token();

	/**
	 * Returns the meta object for the reference '{@link scribble.TextProcessor#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see scribble.TextProcessor#getText()
	 * @see #getTextProcessor()
	 * @generated
	 */
	EReference getTextProcessor_Text();

	/**
	 * Returns the meta object for the reference list '{@link scribble.TextProcessor#getStringtoint <em>Stringtoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stringtoint</em>'.
	 * @see scribble.TextProcessor#getStringtoint()
	 * @see #getTextProcessor()
	 * @generated
	 */
	EReference getTextProcessor_Stringtoint();

	/**
	 * Returns the meta object for class '{@link scribble.StopWord <em>Stop Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Word</em>'.
	 * @see scribble.StopWord
	 * @generated
	 */
	EClass getStopWord();

	/**
	 * Returns the meta object for the attribute '{@link scribble.StopWord#getStopWordName <em>Stop Word Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Word Name</em>'.
	 * @see scribble.StopWord#getStopWordName()
	 * @see #getStopWord()
	 * @generated
	 */
	EAttribute getStopWord_StopWordName();

	/**
	 * Returns the meta object for class '{@link scribble.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see scribble.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link scribble.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see scribble.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link scribble.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see scribble.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link scribble.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see scribble.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the attribute '{@link scribble.Token#getTokenName <em>Token Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Name</em>'.
	 * @see scribble.Token#getTokenName()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_TokenName();

	/**
	 * Returns the meta object for class '{@link scribble.StemWords <em>Stem Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stem Words</em>'.
	 * @see scribble.StemWords
	 * @generated
	 */
	EClass getStemWords();

	/**
	 * Returns the meta object for the attribute '{@link scribble.StemWords#getStemedWordName <em>Stemed Word Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stemed Word Name</em>'.
	 * @see scribble.StemWords#getStemedWordName()
	 * @see #getStemWords()
	 * @generated
	 */
	EAttribute getStemWords_StemedWordName();

	/**
	 * Returns the meta object for class '{@link scribble.StringToInt <em>String To Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Int</em>'.
	 * @see scribble.StringToInt
	 * @generated
	 */
	EClass getStringToInt();

	/**
	 * Returns the meta object for the attribute '{@link scribble.StringToInt#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see scribble.StringToInt#getKey()
	 * @see #getStringToInt()
	 * @generated
	 */
	EAttribute getStringToInt_Key();

	/**
	 * Returns the meta object for the attribute '{@link scribble.StringToInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see scribble.StringToInt#getValue()
	 * @see #getStringToInt()
	 * @generated
	 */
	EAttribute getStringToInt_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScribbleFactory getScribbleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link scribble.impl.ScribbleDSLImpl <em>DSL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribble.impl.ScribbleDSLImpl
		 * @see scribble.impl.ScribblePackageImpl#getScribbleDSL()
		 * @generated
		 */
		EClass SCRIBBLE_DSL = eINSTANCE.getScribbleDSL();

		/**
		 * The meta object literal for the '<em><b>Textprocessor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIBBLE_DSL__TEXTPROCESSOR = eINSTANCE.getScribbleDSL_Textprocessor();

		/**
		 * The meta object literal for the '{@link scribble.impl.TextProcessorImpl <em>Text Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribble.impl.TextProcessorImpl
		 * @see scribble.impl.ScribblePackageImpl#getTextProcessor()
		 * @generated
		 */
		EClass TEXT_PROCESSOR = eINSTANCE.getTextProcessor();

		/**
		 * The meta object literal for the '<em><b>Stopword</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSOR__STOPWORD = eINSTANCE.getTextProcessor_Stopword();

		/**
		 * The meta object literal for the '<em><b>Stemwords</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSOR__STEMWORDS = eINSTANCE.getTextProcessor_Stemwords();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSOR__TOKEN = eINSTANCE.getTextProcessor_Token();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSOR__TEXT = eINSTANCE.getTextProcessor_Text();

		/**
		 * The meta object literal for the '<em><b>Stringtoint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSOR__STRINGTOINT = eINSTANCE.getTextProcessor_Stringtoint();

		/**
		 * The meta object literal for the '{@link scribble.impl.StopWordImpl <em>Stop Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribble.impl.StopWordImpl
		 * @see scribble.impl.ScribblePackageImpl#getStopWord()
		 * @generated
		 */
		EClass STOP_WORD = eINSTANCE.getStopWord();

		/**
		 * The meta object literal for the '<em><b>Stop Word Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_WORD__STOP_WORD_NAME = eINSTANCE.getStopWord_StopWordName();

		/**
		 * The meta object literal for the '{@link scribble.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribble.impl.TextImpl
		 * @see scribble.impl.ScribblePackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '{@link scribble.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribble.impl.ModelImpl
		 * @see scribble.impl.ScribblePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link scribble.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribble.impl.TokenImpl
		 * @see scribble.impl.ScribblePackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Token Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__TOKEN_NAME = eINSTANCE.getToken_TokenName();

		/**
		 * The meta object literal for the '{@link scribble.impl.StemWordsImpl <em>Stem Words</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribble.impl.StemWordsImpl
		 * @see scribble.impl.ScribblePackageImpl#getStemWords()
		 * @generated
		 */
		EClass STEM_WORDS = eINSTANCE.getStemWords();

		/**
		 * The meta object literal for the '<em><b>Stemed Word Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEM_WORDS__STEMED_WORD_NAME = eINSTANCE.getStemWords_StemedWordName();

		/**
		 * The meta object literal for the '{@link scribble.impl.StringToIntImpl <em>String To Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribble.impl.StringToIntImpl
		 * @see scribble.impl.ScribblePackageImpl#getStringToInt()
		 * @generated
		 */
		EClass STRING_TO_INT = eINSTANCE.getStringToInt();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_INT__KEY = eINSTANCE.getStringToInt_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_INT__VALUE = eINSTANCE.getStringToInt_Value();

	}

} //ScribblePackage
