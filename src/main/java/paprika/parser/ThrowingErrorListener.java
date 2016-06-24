package paprika.parser;
import paprika.analyzer.Analyzer;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;


/**
 * Created by Sarra on 27/04/2016.
 */
public class ThrowingErrorListener extends BaseErrorListener {

    public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener() ;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        //e.printStackTrace();
        //throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
        System.out.println("file: "+ Analyzer.fileName+" line " + line + ":" + charPositionInLine + " " + msg);
    }
}
