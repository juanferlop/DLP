import parser.*;

import org.antlr.v4.runtime.*;

public class Main {

	public static void main(String... args) throws Exception {
		if (args.length < 1) {
			System.err.println("Please, pass me the input file name.");
			return;
		}

		// creates a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);

		// creates a buffer of tokens pulled from the lexer
		TSmmLexer lexer = new TSmmLexer(input);

		// shows the info of tokens read
		Token token;
		while ((token = lexer.nextToken()).getType() != TSmmLexer.EOF) {
			// We get the semantic value of the token
			Object semanticValue = null;
			switch (token.getType()) {			
			// TODO: Implement the lexemeToChar and lexemeToReal methods in LexerHelper
		/*	case TSmmLexer.CHAR_CONSTANT:
				semanticValue = LexerHelper.lexemeToChar(token.getText());
				break;
			case TSmmLexer.REAL_CONSTANT:
				semanticValue = LexerHelper.lexemeToReal(token.getText());
				break;*/

			case TSmmLexer.INT_CONSTANT:
				semanticValue = LexerHelper.lexemeToInt(token.getText()); // Lo casteé a Object
				break;
			default:
				semanticValue = token.getText();
			}
			// We show the token information
			System.out.printf("Line: %d, column: %d, lexeme: '%s', token: %s, semantic value: %s.\n",
							token.getLine(), token.getCharPositionInLine() + 1,
							token.getText(), lexer.getVocabulary()
									.getDisplayName(token.getType()),
							semanticValue);
		}
	}

}
