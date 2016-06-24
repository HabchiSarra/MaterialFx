// Generated from C:\Users\Sarra\IdeaProjects\artid2\src\main\antlr\ObjC.g4 by ANTLR 4.2.2
package paprika.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjCParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, AUTORELEASEPOOL=4, CATCH=5, CLASS=6, DYNAMIC=7, 
		ENCODE=8, END=9, FINALLY=10, IMPLEMENTATION=11, INTERFACE=12, PACKAGE=13, 
		PROTOCOL=14, OPTIONAL=15, PRIVATE=16, PROPERTY=17, PROTECTED=18, PUBLIC=19, 
		SELECTOR=20, SYNCHRONIZED=21, SYNTHESIZE=22, THROW=23, TRY=24, SUPER=25, 
		SELF=26, ABSTRACT=27, AUTO=28, BOOLEAN=29, BREAK=30, BYCOPY=31, BYREF=32, 
		CASE=33, CHAR=34, CONST=35, CONTINUE=36, DEFAULT=37, DO=38, DOUBLE=39, 
		ELSE=40, ENUM=41, EXTERN=42, FLOAT=43, FOR=44, ID=45, IF=46, IN=47, INOUT=48, 
		INSTANCETYPE=49, GOTO=50, INT=51, LONG=52, ONEWAY=53, OUT=54, REGISTER=55, 
		RETURN=56, SHORT=57, SIGNED=58, SIZEOF=59, STATIC=60, STRUCT=61, SWITCH=62, 
		TYPEDEF=63, UNION=64, UNSIGNED=65, VOID=66, VOLATILE=67, WHILE=68, NS_OPTIONS=69, 
		NS_ENUM=70, WWEAK=71, WUNSAFE_UNRETAINED=72, LPAREN=73, RPAREN=74, LBRACE=75, 
		RBRACE=76, LBRACK=77, RBRACK=78, SEMI=79, COMMA=80, DOT=81, STRUCTACCESS=82, 
		AT=83, ASSIGN=84, GT=85, LT=86, BANG=87, TILDE=88, QUESTION=89, COLON=90, 
		EQUAL=91, LE=92, GE=93, NOTEQUAL=94, AND=95, OR=96, INC=97, DEC=98, ADD=99, 
		SUB=100, MUL=101, DIV=102, BITAND=103, BITOR=104, CARET=105, MOD=106, 
		SHIFT_R=107, SHIFT_L=108, ADD_ASSIGN=109, SUB_ASSIGN=110, MUL_ASSIGN=111, 
		DIV_ASSIGN=112, AND_ASSIGN=113, OR_ASSIGN=114, XOR_ASSIGN=115, MOD_ASSIGN=116, 
		LSHIFT_ASSIGN=117, RSHIFT_ASSIGN=118, ELIPSIS=119, ASSIGNPA=120, GETTER=121, 
		NONATOMIC=122, SETTER=123, STRONG=124, RETAIN=125, READONLY=126, READWRITE=127, 
		WEAK=128, IDENTIFIER=129, CHARACTER_LITERAL=130, STRING_LITERAL=131, HEX_LITERAL=132, 
		DECIMAL_LITERAL=133, OCTAL_LITERAL=134, FLOATING_POINT_LITERAL=135, IMPORT=136, 
		INCLUDE=137, PRAGMA=138, WS=139, COMMENT=140, LINE_COMMENT=141, HDEFINE=142, 
		HIF=143, HELIF=144, HELSE=145, HUNDEF=146, HIFNDEF=147, HENDIF=148;
	public static final String[] tokenNames = {
		"<INVALID>", "'@NO'", "'@YES'", "'@required'", "'@autoreleasepool'", "'@catch'", 
		"'@class'", "'@dynamic'", "'@encode'", "'@end'", "'@finally'", "'@implementation'", 
		"'@interface'", "'@package'", "'@protocol'", "'@optional'", "'@private'", 
		"'@property'", "'@protected'", "'@public'", "'@selector'", "'@synchronized'", 
		"'@synthesize'", "'@throw'", "'@try'", "'super'", "'self'", "'abstract'", 
		"'auto'", "'boolean'", "'break'", "'bycopy'", "'byref'", "'case'", "'char'", 
		"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
		"'extern'", "'float'", "'for'", "'id'", "'if'", "'in'", "'inout'", "'instancetype'", 
		"'goto'", "'int'", "'long'", "'oneway'", "'out'", "'register'", "'return'", 
		"'short'", "'signed'", "'sizeof'", "'static'", "'struct'", "'switch'", 
		"'typedef'", "'union'", "'unsigned'", "'void'", "'volatile'", "'while'", 
		"'NS_OPTIONS'", "'NS_ENUM'", "'__weak'", "'__unsafe_unretained'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'@'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'>>'", "'<<'", "'+='", "'-='", "'*='", "'/='", "'&='", 
		"'|='", "'^='", "'%='", "'<<='", "'>>='", "'...'", "'assign'", "'getter'", 
		"'nonatomic'", "'setter'", "'strong'", "'retain'", "'readonly'", "'readwrite'", 
		"'weak'", "IDENTIFIER", "CHARACTER_LITERAL", "STRING_LITERAL", "HEX_LITERAL", 
		"DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL", "IMPORT", 
		"INCLUDE", "PRAGMA", "WS", "COMMENT", "LINE_COMMENT", "HDEFINE", "HIF", 
		"HELIF", "HELSE", "HUNDEF", "HIFNDEF", "HENDIF"
	};
	public static final int
		RULE_translation_unit = 0, RULE_external_declaration = 1, RULE_preprocessor_declaration = 2, 
		RULE_class_interface = 3, RULE_category_interface = 4, RULE_class_implementation = 5, 
		RULE_category_implementation = 6, RULE_protocol_declaration = 7, RULE_protocol_declaration_list = 8, 
		RULE_class_declaration_list = 9, RULE_class_list = 10, RULE_protocol_reference_list = 11, 
		RULE_protocol_list = 12, RULE_property_declaration = 13, RULE_property_attributes_declaration = 14, 
		RULE_property_attributes_list = 15, RULE_property_attribute = 16, RULE_class_name = 17, 
		RULE_superclass_name = 18, RULE_category_name = 19, RULE_protocol_name = 20, 
		RULE_instance_variables = 21, RULE_instance_struct_declaration = 22, RULE_visibility_specification = 23, 
		RULE_interface_declaration_list = 24, RULE_class_method_declaration = 25, 
		RULE_instance_method_declaration = 26, RULE_method_declaration = 27, RULE_implementation_definition_list = 28, 
		RULE_class_method_definition = 29, RULE_instance_method_definition = 30, 
		RULE_method_definition = 31, RULE_method_selector = 32, RULE_keyword_declarator = 33, 
		RULE_selector = 34, RULE_method_type = 35, RULE_property_implementation = 36, 
		RULE_property_synthesize_list = 37, RULE_property_synthesize_item = 38, 
		RULE_block_type = 39, RULE_generics_specifier = 40, RULE_type_specifier = 41, 
		RULE_type_qualifier = 42, RULE_protocol_qualifier = 43, RULE_primary_expression = 44, 
		RULE_dictionary_pair = 45, RULE_dictionary_expression = 46, RULE_array_expression = 47, 
		RULE_box_expression = 48, RULE_block_parameters = 49, RULE_block_expression = 50, 
		RULE_message_expression = 51, RULE_receiver = 52, RULE_message_selector = 53, 
		RULE_keyword_argument = 54, RULE_selector_expression = 55, RULE_selector_name = 56, 
		RULE_protocol_expression = 57, RULE_encode_expression = 58, RULE_type_variable_declarator = 59, 
		RULE_try_statement = 60, RULE_catch_statement = 61, RULE_finally_statement = 62, 
		RULE_throw_statement = 63, RULE_try_block = 64, RULE_synchronized_statement = 65, 
		RULE_autorelease_statement = 66, RULE_function_definition = 67, RULE_declaration = 68, 
		RULE_declaration_specifiers = 69, RULE_arc_behaviour_specifier = 70, RULE_storage_class_specifier = 71, 
		RULE_init_declarator_list = 72, RULE_init_declarator = 73, RULE_struct_or_union_specifier = 74, 
		RULE_struct_declaration = 75, RULE_specifier_qualifier_list = 76, RULE_struct_declarator_list = 77, 
		RULE_struct_declarator = 78, RULE_enum_specifier = 79, RULE_enumerator_list = 80, 
		RULE_enumerator = 81, RULE_pointer = 82, RULE_declarator = 83, RULE_direct_declarator = 84, 
		RULE_declarator_suffix = 85, RULE_parameter_list = 86, RULE_parameter_declaration = 87, 
		RULE_initializer = 88, RULE_type_name = 89, RULE_abstract_declarator = 90, 
		RULE_abstract_declarator_suffix = 91, RULE_parameter_declaration_list = 92, 
		RULE_statement_list = 93, RULE_statement = 94, RULE_labeled_statement = 95, 
		RULE_compound_statement = 96, RULE_selection_statement = 97, RULE_for_in_statement = 98, 
		RULE_for_statement = 99, RULE_while_statement = 100, RULE_do_statement = 101, 
		RULE_iteration_statement = 102, RULE_jump_statement = 103, RULE_expression = 104, 
		RULE_assignment_expression = 105, RULE_assignment_operator = 106, RULE_conditional_expression = 107, 
		RULE_constant_expression = 108, RULE_logical_or_expression = 109, RULE_logical_and_expression = 110, 
		RULE_inclusive_or_expression = 111, RULE_exclusive_or_expression = 112, 
		RULE_and_expression = 113, RULE_equality_expression = 114, RULE_relational_expression = 115, 
		RULE_shift_expression = 116, RULE_additive_expression = 117, RULE_multiplicative_expression = 118, 
		RULE_cast_expression = 119, RULE_unary_expression = 120, RULE_unary_operator = 121, 
		RULE_postfix_expression = 122, RULE_argument_list = 123, RULE_argument_expression_list = 124, 
		RULE_identifier = 125, RULE_constant = 126;
	public static final String[] ruleNames = {
		"translation_unit", "external_declaration", "preprocessor_declaration", 
		"class_interface", "category_interface", "class_implementation", "category_implementation", 
		"protocol_declaration", "protocol_declaration_list", "class_declaration_list", 
		"class_list", "protocol_reference_list", "protocol_list", "property_declaration", 
		"property_attributes_declaration", "property_attributes_list", "property_attribute", 
		"class_name", "superclass_name", "category_name", "protocol_name", "instance_variables", 
		"instance_struct_declaration", "visibility_specification", "interface_declaration_list", 
		"class_method_declaration", "instance_method_declaration", "method_declaration", 
		"implementation_definition_list", "class_method_definition", "instance_method_definition", 
		"method_definition", "method_selector", "keyword_declarator", "selector", 
		"method_type", "property_implementation", "property_synthesize_list", 
		"property_synthesize_item", "block_type", "generics_specifier", "type_specifier", 
		"type_qualifier", "protocol_qualifier", "primary_expression", "dictionary_pair", 
		"dictionary_expression", "array_expression", "box_expression", "block_parameters", 
		"block_expression", "message_expression", "receiver", "message_selector", 
		"keyword_argument", "selector_expression", "selector_name", "protocol_expression", 
		"encode_expression", "type_variable_declarator", "try_statement", "catch_statement", 
		"finally_statement", "throw_statement", "try_block", "synchronized_statement", 
		"autorelease_statement", "function_definition", "declaration", "declaration_specifiers", 
		"arc_behaviour_specifier", "storage_class_specifier", "init_declarator_list", 
		"init_declarator", "struct_or_union_specifier", "struct_declaration", 
		"specifier_qualifier_list", "struct_declarator_list", "struct_declarator", 
		"enum_specifier", "enumerator_list", "enumerator", "pointer", "declarator", 
		"direct_declarator", "declarator_suffix", "parameter_list", "parameter_declaration", 
		"initializer", "type_name", "abstract_declarator", "abstract_declarator_suffix", 
		"parameter_declaration_list", "statement_list", "statement", "labeled_statement", 
		"compound_statement", "selection_statement", "for_in_statement", "for_statement", 
		"while_statement", "do_statement", "iteration_statement", "jump_statement", 
		"expression", "assignment_expression", "assignment_operator", "conditional_expression", 
		"constant_expression", "logical_or_expression", "logical_and_expression", 
		"inclusive_or_expression", "exclusive_or_expression", "and_expression", 
		"equality_expression", "relational_expression", "shift_expression", "additive_expression", 
		"multiplicative_expression", "cast_expression", "unary_expression", "unary_operator", 
		"postfix_expression", "argument_list", "argument_expression_list", "identifier", 
		"constant"
	};

	@Override
	public String getGrammarFileName() { return "ObjC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Translation_unitContext extends ParserRuleContext {
		public External_declarationContext external_declaration(int i) {
			return getRuleContext(External_declarationContext.class,i);
		}
		public List<External_declarationContext> external_declaration() {
			return getRuleContexts(External_declarationContext.class);
		}
		public TerminalNode EOF() { return getToken(ObjCParser.EOF, 0); }
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterTranslation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitTranslation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitTranslation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254); external_declaration();
				}
				}
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << IMPLEMENTATION) | (1L << INTERFACE) | (1L << PROTOCOL) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (UNION - 64)) | (1L << (UNSIGNED - 64)) | (1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (MUL - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (IDENTIFIER - 129)) | (1L << (IMPORT - 129)) | (1L << (INCLUDE - 129)) | (1L << (COMMENT - 129)) | (1L << (LINE_COMMENT - 129)))) != 0) );
			setState(259); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class External_declarationContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ObjCParser.COMMENT, 0); }
		public Class_implementationContext class_implementation() {
			return getRuleContext(Class_implementationContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Protocol_declaration_listContext protocol_declaration_list() {
			return getRuleContext(Protocol_declaration_listContext.class,0);
		}
		public Class_interfaceContext class_interface() {
			return getRuleContext(Class_interfaceContext.class,0);
		}
		public TerminalNode LINE_COMMENT() { return getToken(ObjCParser.LINE_COMMENT, 0); }
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public Class_declaration_listContext class_declaration_list() {
			return getRuleContext(Class_declaration_listContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Category_interfaceContext category_interface() {
			return getRuleContext(Category_interfaceContext.class,0);
		}
		public Preprocessor_declarationContext preprocessor_declaration() {
			return getRuleContext(Preprocessor_declarationContext.class,0);
		}
		public Category_implementationContext category_implementation() {
			return getRuleContext(Category_implementationContext.class,0);
		}
		public External_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterExternal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitExternal_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitExternal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_declarationContext external_declaration() throws RecognitionException {
		External_declarationContext _localctx = new External_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_external_declaration);
		try {
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261); match(COMMENT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262); match(LINE_COMMENT);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263); preprocessor_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264); function_definition();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265); declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(266); class_interface();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(267); class_implementation();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(268); category_interface();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(269); category_implementation();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(270); protocol_declaration();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(271); protocol_declaration_list();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(272); class_declaration_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Preprocessor_declarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ObjCParser.IMPORT, 0); }
		public TerminalNode INCLUDE() { return getToken(ObjCParser.INCLUDE, 0); }
		public Preprocessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPreprocessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPreprocessor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitPreprocessor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Preprocessor_declarationContext preprocessor_declaration() throws RecognitionException {
		Preprocessor_declarationContext _localctx = new Preprocessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_preprocessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==IMPORT || _la==INCLUDE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_interfaceContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Interface_declaration_listContext interface_declaration_list() {
			return getRuleContext(Interface_declaration_listContext.class,0);
		}
		public Superclass_nameContext superclass_name() {
			return getRuleContext(Superclass_nameContext.class,0);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Class_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_interface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_interface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_interfaceContext class_interface() throws RecognitionException {
		Class_interfaceContext _localctx = new Class_interfaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(INTERFACE);
			setState(278); class_name();
			setState(281);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(279); match(COLON);
				setState(280); superclass_name();
				}
			}

			setState(284);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(283); protocol_reference_list();
				}
			}

			setState(287);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(286); instance_variables();
				}
			}

			setState(290);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (PROPERTY - 17)) | (1L << (AUTO - 17)) | (1L << (BYCOPY - 17)) | (1L << (BYREF - 17)) | (1L << (CHAR - 17)) | (1L << (CONST - 17)) | (1L << (DOUBLE - 17)) | (1L << (ENUM - 17)) | (1L << (EXTERN - 17)) | (1L << (FLOAT - 17)) | (1L << (ID - 17)) | (1L << (IN - 17)) | (1L << (INOUT - 17)) | (1L << (INSTANCETYPE - 17)) | (1L << (INT - 17)) | (1L << (LONG - 17)) | (1L << (ONEWAY - 17)) | (1L << (OUT - 17)) | (1L << (REGISTER - 17)) | (1L << (SHORT - 17)) | (1L << (SIGNED - 17)) | (1L << (STATIC - 17)) | (1L << (STRUCT - 17)) | (1L << (TYPEDEF - 17)) | (1L << (UNION - 17)) | (1L << (UNSIGNED - 17)) | (1L << (VOID - 17)) | (1L << (VOLATILE - 17)) | (1L << (NS_OPTIONS - 17)) | (1L << (NS_ENUM - 17)) | (1L << (WWEAK - 17)) | (1L << (WUNSAFE_UNRETAINED - 17)))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (ADD - 99)) | (1L << (SUB - 99)) | (1L << (IDENTIFIER - 99)))) != 0)) {
				{
				setState(289); interface_declaration_list();
				}
			}

			setState(292); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_interfaceContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Interface_declaration_listContext interface_declaration_list() {
			return getRuleContext(Interface_declaration_listContext.class,0);
		}
		public Category_nameContext category_name() {
			return getRuleContext(Category_nameContext.class,0);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Category_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCategory_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCategory_interface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitCategory_interface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Category_interfaceContext category_interface() throws RecognitionException {
		Category_interfaceContext _localctx = new Category_interfaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_category_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(INTERFACE);
			setState(295); class_name();
			setState(296); match(LPAREN);
			setState(298);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(297); category_name();
				}
			}

			setState(300); match(RPAREN);
			setState(302);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(301); protocol_reference_list();
				}
			}

			setState(305);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(304); instance_variables();
				}
			}

			setState(308);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (PROPERTY - 17)) | (1L << (AUTO - 17)) | (1L << (BYCOPY - 17)) | (1L << (BYREF - 17)) | (1L << (CHAR - 17)) | (1L << (CONST - 17)) | (1L << (DOUBLE - 17)) | (1L << (ENUM - 17)) | (1L << (EXTERN - 17)) | (1L << (FLOAT - 17)) | (1L << (ID - 17)) | (1L << (IN - 17)) | (1L << (INOUT - 17)) | (1L << (INSTANCETYPE - 17)) | (1L << (INT - 17)) | (1L << (LONG - 17)) | (1L << (ONEWAY - 17)) | (1L << (OUT - 17)) | (1L << (REGISTER - 17)) | (1L << (SHORT - 17)) | (1L << (SIGNED - 17)) | (1L << (STATIC - 17)) | (1L << (STRUCT - 17)) | (1L << (TYPEDEF - 17)) | (1L << (UNION - 17)) | (1L << (UNSIGNED - 17)) | (1L << (VOID - 17)) | (1L << (VOLATILE - 17)) | (1L << (NS_OPTIONS - 17)) | (1L << (NS_ENUM - 17)) | (1L << (WWEAK - 17)) | (1L << (WUNSAFE_UNRETAINED - 17)))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (ADD - 99)) | (1L << (SUB - 99)) | (1L << (IDENTIFIER - 99)))) != 0)) {
				{
				setState(307); interface_declaration_list();
				}
			}

			setState(310); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_implementationContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Implementation_definition_listContext implementation_definition_list() {
			return getRuleContext(Implementation_definition_listContext.class,0);
		}
		public Superclass_nameContext superclass_name() {
			return getRuleContext(Superclass_nameContext.class,0);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Class_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_implementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_implementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_implementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_implementationContext class_implementation() throws RecognitionException {
		Class_implementationContext _localctx = new Class_implementationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); match(IMPLEMENTATION);
			{
			setState(313); class_name();
			setState(316);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(314); match(COLON);
				setState(315); superclass_name();
				}
			}

			setState(319);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(318); instance_variables();
				}
			}

			setState(322);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (DYNAMIC - 7)) | (1L << (SYNTHESIZE - 7)) | (1L << (AUTO - 7)) | (1L << (BYCOPY - 7)) | (1L << (BYREF - 7)) | (1L << (CHAR - 7)) | (1L << (CONST - 7)) | (1L << (DOUBLE - 7)) | (1L << (ENUM - 7)) | (1L << (EXTERN - 7)) | (1L << (FLOAT - 7)) | (1L << (ID - 7)) | (1L << (IN - 7)) | (1L << (INOUT - 7)) | (1L << (INSTANCETYPE - 7)) | (1L << (INT - 7)) | (1L << (LONG - 7)) | (1L << (ONEWAY - 7)) | (1L << (OUT - 7)) | (1L << (REGISTER - 7)) | (1L << (SHORT - 7)) | (1L << (SIGNED - 7)) | (1L << (STATIC - 7)) | (1L << (STRUCT - 7)) | (1L << (TYPEDEF - 7)) | (1L << (UNION - 7)) | (1L << (UNSIGNED - 7)) | (1L << (VOID - 7)) | (1L << (VOLATILE - 7)) | (1L << (NS_OPTIONS - 7)) | (1L << (NS_ENUM - 7)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (WWEAK - 71)) | (1L << (WUNSAFE_UNRETAINED - 71)) | (1L << (LPAREN - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (MUL - 71)) | (1L << (IDENTIFIER - 71)))) != 0)) {
				{
				setState(321); implementation_definition_list();
				}
			}

			}
			setState(324); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_implementationContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Implementation_definition_listContext implementation_definition_list() {
			return getRuleContext(Implementation_definition_listContext.class,0);
		}
		public Category_nameContext category_name() {
			return getRuleContext(Category_nameContext.class,0);
		}
		public Category_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCategory_implementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCategory_implementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitCategory_implementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Category_implementationContext category_implementation() throws RecognitionException {
		Category_implementationContext _localctx = new Category_implementationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_category_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(IMPLEMENTATION);
			{
			setState(327); class_name();
			setState(328); match(LPAREN);
			setState(329); category_name();
			setState(330); match(RPAREN);
			setState(332);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (DYNAMIC - 7)) | (1L << (SYNTHESIZE - 7)) | (1L << (AUTO - 7)) | (1L << (BYCOPY - 7)) | (1L << (BYREF - 7)) | (1L << (CHAR - 7)) | (1L << (CONST - 7)) | (1L << (DOUBLE - 7)) | (1L << (ENUM - 7)) | (1L << (EXTERN - 7)) | (1L << (FLOAT - 7)) | (1L << (ID - 7)) | (1L << (IN - 7)) | (1L << (INOUT - 7)) | (1L << (INSTANCETYPE - 7)) | (1L << (INT - 7)) | (1L << (LONG - 7)) | (1L << (ONEWAY - 7)) | (1L << (OUT - 7)) | (1L << (REGISTER - 7)) | (1L << (SHORT - 7)) | (1L << (SIGNED - 7)) | (1L << (STATIC - 7)) | (1L << (STRUCT - 7)) | (1L << (TYPEDEF - 7)) | (1L << (UNION - 7)) | (1L << (UNSIGNED - 7)) | (1L << (VOID - 7)) | (1L << (VOLATILE - 7)) | (1L << (NS_OPTIONS - 7)) | (1L << (NS_ENUM - 7)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (WWEAK - 71)) | (1L << (WUNSAFE_UNRETAINED - 71)) | (1L << (LPAREN - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (MUL - 71)) | (1L << (IDENTIFIER - 71)))) != 0)) {
				{
				setState(331); implementation_definition_list();
				}
			}

			}
			setState(334); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_declarationContext extends ParserRuleContext {
		public Interface_declaration_listContext interface_declaration_list(int i) {
			return getRuleContext(Interface_declaration_listContext.class,i);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public List<Interface_declaration_listContext> interface_declaration_list() {
			return getRuleContexts(Interface_declaration_listContext.class);
		}
		public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); match(PROTOCOL);
			{
			setState(337); protocol_name();
			setState(339);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(338); protocol_reference_list();
				}
			}

			setState(342);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(341); match(3);
				}
			}

			setState(345);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(344); interface_declaration_list();
				}
				break;
			}
			setState(348);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(347); match(OPTIONAL);
				}
			}

			setState(351);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (PROPERTY - 17)) | (1L << (AUTO - 17)) | (1L << (BYCOPY - 17)) | (1L << (BYREF - 17)) | (1L << (CHAR - 17)) | (1L << (CONST - 17)) | (1L << (DOUBLE - 17)) | (1L << (ENUM - 17)) | (1L << (EXTERN - 17)) | (1L << (FLOAT - 17)) | (1L << (ID - 17)) | (1L << (IN - 17)) | (1L << (INOUT - 17)) | (1L << (INSTANCETYPE - 17)) | (1L << (INT - 17)) | (1L << (LONG - 17)) | (1L << (ONEWAY - 17)) | (1L << (OUT - 17)) | (1L << (REGISTER - 17)) | (1L << (SHORT - 17)) | (1L << (SIGNED - 17)) | (1L << (STATIC - 17)) | (1L << (STRUCT - 17)) | (1L << (TYPEDEF - 17)) | (1L << (UNION - 17)) | (1L << (UNSIGNED - 17)) | (1L << (VOID - 17)) | (1L << (VOLATILE - 17)) | (1L << (NS_OPTIONS - 17)) | (1L << (NS_ENUM - 17)) | (1L << (WWEAK - 17)) | (1L << (WUNSAFE_UNRETAINED - 17)))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (ADD - 99)) | (1L << (SUB - 99)) | (1L << (IDENTIFIER - 99)))) != 0)) {
				{
				setState(350); interface_declaration_list();
				}
			}

			}
			setState(353); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_declaration_listContext extends ParserRuleContext {
		public Protocol_listContext protocol_list() {
			return getRuleContext(Protocol_listContext.class,0);
		}
		public Protocol_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_declaration_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_declaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_declaration_listContext protocol_declaration_list() throws RecognitionException {
		Protocol_declaration_listContext _localctx = new Protocol_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_protocol_declaration_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(355); match(PROTOCOL);
			setState(356); protocol_list();
			setState(357); match(SEMI);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_declaration_listContext extends ParserRuleContext {
		public Class_listContext class_list() {
			return getRuleContext(Class_listContext.class,0);
		}
		public Class_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_declaration_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_declaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declaration_listContext class_declaration_list() throws RecognitionException {
		Class_declaration_listContext _localctx = new Class_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_class_declaration_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(359); match(CLASS);
			setState(360); class_list();
			setState(361); match(SEMI);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_listContext extends ParserRuleContext {
		public List<Class_nameContext> class_name() {
			return getRuleContexts(Class_nameContext.class);
		}
		public Class_nameContext class_name(int i) {
			return getRuleContext(Class_nameContext.class,i);
		}
		public Class_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_listContext class_list() throws RecognitionException {
		Class_listContext _localctx = new Class_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); class_name();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(364); match(COMMA);
				setState(365); class_name();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_reference_listContext extends ParserRuleContext {
		public Protocol_listContext protocol_list() {
			return getRuleContext(Protocol_listContext.class,0);
		}
		public Protocol_reference_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_reference_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_reference_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_reference_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_reference_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_reference_listContext protocol_reference_list() throws RecognitionException {
		Protocol_reference_listContext _localctx = new Protocol_reference_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_protocol_reference_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(371); match(LT);
			setState(372); protocol_list();
			setState(373); match(GT);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_listContext extends ParserRuleContext {
		public List<Protocol_nameContext> protocol_name() {
			return getRuleContexts(Protocol_nameContext.class);
		}
		public Protocol_nameContext protocol_name(int i) {
			return getRuleContext(Protocol_nameContext.class,i);
		}
		public Protocol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_listContext protocol_list() throws RecognitionException {
		Protocol_listContext _localctx = new Protocol_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_protocol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); protocol_name();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(376); match(COMMA);
				setState(377); protocol_name();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_declarationContext extends ParserRuleContext {
		public Property_attributes_declarationContext property_attributes_declaration() {
			return getRuleContext(Property_attributes_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_property_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); match(PROPERTY);
			setState(385);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(384); property_attributes_declaration();
				}
			}

			setState(387); struct_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_attributes_declarationContext extends ParserRuleContext {
		public Property_attributes_listContext property_attributes_list() {
			return getRuleContext(Property_attributes_listContext.class,0);
		}
		public Property_attributes_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attributes_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_attributes_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_attributes_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_attributes_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_attributes_declarationContext property_attributes_declaration() throws RecognitionException {
		Property_attributes_declarationContext _localctx = new Property_attributes_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_property_attributes_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); match(LPAREN);
			setState(390); property_attributes_list();
			setState(391); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_attributes_listContext extends ParserRuleContext {
		public List<Property_attributeContext> property_attribute() {
			return getRuleContexts(Property_attributeContext.class);
		}
		public Property_attributeContext property_attribute(int i) {
			return getRuleContext(Property_attributeContext.class,i);
		}
		public Property_attributes_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attributes_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_attributes_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_attributes_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_attributes_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_attributes_listContext property_attributes_list() throws RecognitionException {
		Property_attributes_listContext _localctx = new Property_attributes_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_property_attributes_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); property_attribute();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(394); match(COMMA);
				setState(395); property_attribute();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_attributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Property_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_attributeContext property_attribute() throws RecognitionException {
		Property_attributeContext _localctx = new Property_attributeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_property_attribute);
		try {
			setState(417);
			switch (_input.LA(1)) {
			case NONATOMIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(401); match(NONATOMIC);
				}
				break;
			case ASSIGNPA:
				enterOuterAlt(_localctx, 2);
				{
				setState(402); match(ASSIGNPA);
				}
				break;
			case WEAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(403); match(WEAK);
				}
				break;
			case STRONG:
				enterOuterAlt(_localctx, 4);
				{
				setState(404); match(STRONG);
				}
				break;
			case RETAIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(405); match(RETAIN);
				}
				break;
			case READONLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(406); match(READONLY);
				}
				break;
			case READWRITE:
				enterOuterAlt(_localctx, 7);
				{
				setState(407); match(READWRITE);
				}
				break;
			case RPAREN:
			case COMMA:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
			case GETTER:
				enterOuterAlt(_localctx, 9);
				{
				setState(409); match(GETTER);
				setState(410); match(ASSIGN);
				setState(411); match(IDENTIFIER);
				}
				break;
			case SETTER:
				enterOuterAlt(_localctx, 10);
				{
				setState(412); match(SETTER);
				setState(413); match(ASSIGN);
				setState(414); match(IDENTIFIER);
				setState(415); match(COLON);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 11);
				{
				setState(416); match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Superclass_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSuperclass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSuperclass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSuperclass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_nameContext superclass_name() throws RecognitionException {
		Superclass_nameContext _localctx = new Superclass_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_superclass_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Category_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCategory_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCategory_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitCategory_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Category_nameContext category_name() throws RecognitionException {
		Category_nameContext _localctx = new Category_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_category_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_nameContext protocol_name() throws RecognitionException {
		Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instance_variablesContext extends ParserRuleContext {
		public Instance_struct_declarationContext instance_struct_declaration(int i) {
			return getRuleContext(Instance_struct_declarationContext.class,i);
		}
		public List<Instance_struct_declarationContext> instance_struct_declaration() {
			return getRuleContexts(Instance_struct_declarationContext.class);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Instance_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInstance_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instance_variablesContext instance_variables() throws RecognitionException {
		Instance_variablesContext _localctx = new Instance_variablesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_instance_variables);
		int _la;
		try {
			setState(444);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427); match(LBRACE);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (PACKAGE - 13)) | (1L << (PRIVATE - 13)) | (1L << (PROTECTED - 13)) | (1L << (PUBLIC - 13)) | (1L << (BYCOPY - 13)) | (1L << (BYREF - 13)) | (1L << (CHAR - 13)) | (1L << (CONST - 13)) | (1L << (DOUBLE - 13)) | (1L << (ENUM - 13)) | (1L << (FLOAT - 13)) | (1L << (ID - 13)) | (1L << (IN - 13)) | (1L << (INOUT - 13)) | (1L << (INSTANCETYPE - 13)) | (1L << (INT - 13)) | (1L << (LONG - 13)) | (1L << (ONEWAY - 13)) | (1L << (OUT - 13)) | (1L << (SHORT - 13)) | (1L << (SIGNED - 13)) | (1L << (STRUCT - 13)) | (1L << (UNION - 13)) | (1L << (UNSIGNED - 13)) | (1L << (VOID - 13)) | (1L << (VOLATILE - 13)) | (1L << (NS_OPTIONS - 13)) | (1L << (NS_ENUM - 13)) | (1L << (WWEAK - 13)) | (1L << (WUNSAFE_UNRETAINED - 13)))) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(428); instance_struct_declaration();
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(434); match(RBRACE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435); match(LBRACE);
				setState(437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(436); instance_struct_declaration();
					}
					}
					setState(439); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (PACKAGE - 13)) | (1L << (PRIVATE - 13)) | (1L << (PROTECTED - 13)) | (1L << (PUBLIC - 13)) | (1L << (BYCOPY - 13)) | (1L << (BYREF - 13)) | (1L << (CHAR - 13)) | (1L << (CONST - 13)) | (1L << (DOUBLE - 13)) | (1L << (ENUM - 13)) | (1L << (FLOAT - 13)) | (1L << (ID - 13)) | (1L << (IN - 13)) | (1L << (INOUT - 13)) | (1L << (INSTANCETYPE - 13)) | (1L << (INT - 13)) | (1L << (LONG - 13)) | (1L << (ONEWAY - 13)) | (1L << (OUT - 13)) | (1L << (SHORT - 13)) | (1L << (SIGNED - 13)) | (1L << (STRUCT - 13)) | (1L << (UNION - 13)) | (1L << (UNSIGNED - 13)) | (1L << (VOID - 13)) | (1L << (VOLATILE - 13)) | (1L << (NS_OPTIONS - 13)) | (1L << (NS_ENUM - 13)) | (1L << (WWEAK - 13)) | (1L << (WUNSAFE_UNRETAINED - 13)))) != 0) || _la==IDENTIFIER );
				setState(441); instance_variables();
				setState(442); match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instance_struct_declarationContext extends ParserRuleContext {
		public Visibility_specificationContext visibility_specification() {
			return getRuleContext(Visibility_specificationContext.class,0);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Instance_struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_struct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_struct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInstance_struct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instance_struct_declarationContext instance_struct_declaration() throws RecognitionException {
		Instance_struct_declarationContext _localctx = new Instance_struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_instance_struct_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(446); visibility_specification();
				}
			}

			setState(450); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(449); struct_declaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(452); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Visibility_specificationContext extends ParserRuleContext {
		public Visibility_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterVisibility_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitVisibility_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitVisibility_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Visibility_specificationContext visibility_specification() throws RecognitionException {
		Visibility_specificationContext _localctx = new Visibility_specificationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_visibility_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_declaration_listContext extends ParserRuleContext {
		public Instance_method_declarationContext instance_method_declaration(int i) {
			return getRuleContext(Instance_method_declarationContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public Class_method_declarationContext class_method_declaration(int i) {
			return getRuleContext(Class_method_declarationContext.class,i);
		}
		public Property_declarationContext property_declaration(int i) {
			return getRuleContext(Property_declarationContext.class,i);
		}
		public List<Instance_method_declarationContext> instance_method_declaration() {
			return getRuleContexts(Instance_method_declarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Property_declarationContext> property_declaration() {
			return getRuleContexts(Property_declarationContext.class);
		}
		public List<Class_method_declarationContext> class_method_declaration() {
			return getRuleContexts(Class_method_declarationContext.class);
		}
		public Interface_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInterface_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInterface_declaration_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInterface_declaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_declaration_listContext interface_declaration_list() throws RecognitionException {
		Interface_declaration_listContext _localctx = new Interface_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interface_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(460);
					switch (_input.LA(1)) {
					case AUTO:
					case BYCOPY:
					case BYREF:
					case CHAR:
					case CONST:
					case DOUBLE:
					case ENUM:
					case EXTERN:
					case FLOAT:
					case ID:
					case IN:
					case INOUT:
					case INSTANCETYPE:
					case INT:
					case LONG:
					case ONEWAY:
					case OUT:
					case REGISTER:
					case SHORT:
					case SIGNED:
					case STATIC:
					case STRUCT:
					case TYPEDEF:
					case UNION:
					case UNSIGNED:
					case VOID:
					case VOLATILE:
					case NS_OPTIONS:
					case NS_ENUM:
					case WWEAK:
					case WUNSAFE_UNRETAINED:
					case IDENTIFIER:
						{
						setState(456); declaration();
						}
						break;
					case ADD:
						{
						setState(457); class_method_declaration();
						}
						break;
					case SUB:
						{
						setState(458); instance_method_declaration();
						}
						break;
					case PROPERTY:
						{
						setState(459); property_declaration();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(462); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_method_declarationContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Class_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_method_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_method_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_method_declarationContext class_method_declaration() throws RecognitionException {
		Class_method_declarationContext _localctx = new Class_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_class_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(464); match(ADD);
			setState(465); method_declaration();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instance_method_declarationContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Instance_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_method_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInstance_method_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instance_method_declarationContext instance_method_declaration() throws RecognitionException {
		Instance_method_declarationContext _localctx = new Instance_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_instance_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(467); match(SUB);
			setState(468); method_declaration();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public Method_typeContext method_type() {
			return getRuleContext(Method_typeContext.class,0);
		}
		public Method_selectorContext method_selector() {
			return getRuleContext(Method_selectorContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(470); method_type();
				}
			}

			setState(473); method_selector();
			setState(474); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implementation_definition_listContext extends ParserRuleContext {
		public List<Class_method_definitionContext> class_method_definition() {
			return getRuleContexts(Class_method_definitionContext.class);
		}
		public Instance_method_definitionContext instance_method_definition(int i) {
			return getRuleContext(Instance_method_definitionContext.class,i);
		}
		public Class_method_definitionContext class_method_definition(int i) {
			return getRuleContext(Class_method_definitionContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Property_implementationContext property_implementation(int i) {
			return getRuleContext(Property_implementationContext.class,i);
		}
		public List<Property_implementationContext> property_implementation() {
			return getRuleContexts(Property_implementationContext.class);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Instance_method_definitionContext> instance_method_definition() {
			return getRuleContexts(Instance_method_definitionContext.class);
		}
		public Implementation_definition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_definition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterImplementation_definition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitImplementation_definition_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitImplementation_definition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implementation_definition_listContext implementation_definition_list() throws RecognitionException {
		Implementation_definition_listContext _localctx = new Implementation_definition_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_implementation_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(481);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(476); function_definition();
					}
					break;

				case 2:
					{
					setState(477); declaration();
					}
					break;

				case 3:
					{
					setState(478); class_method_definition();
					}
					break;

				case 4:
					{
					setState(479); instance_method_definition();
					}
					break;

				case 5:
					{
					setState(480); property_implementation();
					}
					break;
				}
				}
				setState(483); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (DYNAMIC - 7)) | (1L << (SYNTHESIZE - 7)) | (1L << (AUTO - 7)) | (1L << (BYCOPY - 7)) | (1L << (BYREF - 7)) | (1L << (CHAR - 7)) | (1L << (CONST - 7)) | (1L << (DOUBLE - 7)) | (1L << (ENUM - 7)) | (1L << (EXTERN - 7)) | (1L << (FLOAT - 7)) | (1L << (ID - 7)) | (1L << (IN - 7)) | (1L << (INOUT - 7)) | (1L << (INSTANCETYPE - 7)) | (1L << (INT - 7)) | (1L << (LONG - 7)) | (1L << (ONEWAY - 7)) | (1L << (OUT - 7)) | (1L << (REGISTER - 7)) | (1L << (SHORT - 7)) | (1L << (SIGNED - 7)) | (1L << (STATIC - 7)) | (1L << (STRUCT - 7)) | (1L << (TYPEDEF - 7)) | (1L << (UNION - 7)) | (1L << (UNSIGNED - 7)) | (1L << (VOID - 7)) | (1L << (VOLATILE - 7)) | (1L << (NS_OPTIONS - 7)) | (1L << (NS_ENUM - 7)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (WWEAK - 71)) | (1L << (WUNSAFE_UNRETAINED - 71)) | (1L << (LPAREN - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (MUL - 71)) | (1L << (IDENTIFIER - 71)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_method_definitionContext extends ParserRuleContext {
		public Method_definitionContext method_definition() {
			return getRuleContext(Method_definitionContext.class,0);
		}
		public Class_method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_method_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_method_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_method_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_method_definitionContext class_method_definition() throws RecognitionException {
		Class_method_definitionContext _localctx = new Class_method_definitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_class_method_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(485); match(ADD);
			setState(486); method_definition();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instance_method_definitionContext extends ParserRuleContext {
		public Method_definitionContext method_definition() {
			return getRuleContext(Method_definitionContext.class,0);
		}
		public Instance_method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_method_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_method_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_method_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInstance_method_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instance_method_definitionContext instance_method_definition() throws RecognitionException {
		Instance_method_definitionContext _localctx = new Instance_method_definitionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_instance_method_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(488); match(SUB);
			setState(489); method_definition();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_definitionContext extends ParserRuleContext {
		public Method_typeContext method_type() {
			return getRuleContext(Method_typeContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Method_selectorContext method_selector() {
			return getRuleContext(Method_selectorContext.class,0);
		}
		public Method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMethod_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_definitionContext method_definition() throws RecognitionException {
		Method_definitionContext _localctx = new Method_definitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_method_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(491); method_type();
				}
			}

			setState(494); method_selector();
			setState(496);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LPAREN - 73)) | (1L << (MUL - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
				{
				setState(495); init_declarator_list();
				}
			}

			setState(499);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(498); match(SEMI);
				}
			}

			setState(501); compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_selectorContext extends ParserRuleContext {
		public List<Keyword_declaratorContext> keyword_declarator() {
			return getRuleContexts(Keyword_declaratorContext.class);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public Keyword_declaratorContext keyword_declarator(int i) {
			return getRuleContext(Keyword_declaratorContext.class,i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Method_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMethod_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_selectorContext method_selector() throws RecognitionException {
		Method_selectorContext _localctx = new Method_selectorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_method_selector);
		try {
			int _alt;
			setState(512);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503); selector();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(505); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(504); keyword_declarator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(507); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				setState(510);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(509); parameter_list();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Keyword_declaratorContext extends ParserRuleContext {
		public List<Method_typeContext> method_type() {
			return getRuleContexts(Method_typeContext.class);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public Method_typeContext method_type(int i) {
			return getRuleContext(Method_typeContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Keyword_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterKeyword_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitKeyword_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitKeyword_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_declaratorContext keyword_declarator() throws RecognitionException {
		Keyword_declaratorContext _localctx = new Keyword_declaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_keyword_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(514); selector();
				}
			}

			setState(517); match(COLON);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(518); method_type();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_typeContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Method_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMethod_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_typeContext method_type() throws RecognitionException {
		Method_typeContext _localctx = new Method_typeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_method_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528); match(LPAREN);
			setState(529); type_name();
			setState(530); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_implementationContext extends ParserRuleContext {
		public Property_synthesize_listContext property_synthesize_list() {
			return getRuleContext(Property_synthesize_listContext.class,0);
		}
		public Property_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_implementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_implementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_implementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_implementationContext property_implementation() throws RecognitionException {
		Property_implementationContext _localctx = new Property_implementationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_property_implementation);
		try {
			setState(540);
			switch (_input.LA(1)) {
			case SYNTHESIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(532); match(SYNTHESIZE);
				setState(533); property_synthesize_list();
				setState(534); match(SEMI);
				}
				break;
			case DYNAMIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(536); match(DYNAMIC);
				setState(537); property_synthesize_list();
				setState(538); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_synthesize_listContext extends ParserRuleContext {
		public List<Property_synthesize_itemContext> property_synthesize_item() {
			return getRuleContexts(Property_synthesize_itemContext.class);
		}
		public Property_synthesize_itemContext property_synthesize_item(int i) {
			return getRuleContext(Property_synthesize_itemContext.class,i);
		}
		public Property_synthesize_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_synthesize_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_synthesize_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_synthesize_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_synthesize_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_synthesize_listContext property_synthesize_list() throws RecognitionException {
		Property_synthesize_listContext _localctx = new Property_synthesize_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_property_synthesize_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542); property_synthesize_item();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(543); match(COMMA);
				setState(544); property_synthesize_item();
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_synthesize_itemContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ObjCParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ObjCParser.IDENTIFIER); }
		public Property_synthesize_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_synthesize_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_synthesize_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_synthesize_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_synthesize_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_synthesize_itemContext property_synthesize_item() throws RecognitionException {
		Property_synthesize_itemContext _localctx = new Property_synthesize_itemContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_property_synthesize_item);
		try {
			setState(554);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551); match(IDENTIFIER);
				setState(552); match(ASSIGN);
				setState(553); match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_typeContext extends ParserRuleContext {
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public Block_parametersContext block_parameters() {
			return getRuleContext(Block_parametersContext.class,0);
		}
		public Block_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterBlock_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitBlock_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitBlock_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_typeContext block_type() throws RecognitionException {
		Block_typeContext _localctx = new Block_typeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_block_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); type_specifier();
			setState(557); match(LPAREN);
			setState(558); match(CARET);
			setState(560);
			_la = _input.LA(1);
			if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (CHAR - 34)) | (1L << (DOUBLE - 34)) | (1L << (ENUM - 34)) | (1L << (FLOAT - 34)) | (1L << (ID - 34)) | (1L << (INSTANCETYPE - 34)) | (1L << (INT - 34)) | (1L << (LONG - 34)) | (1L << (SHORT - 34)) | (1L << (SIGNED - 34)) | (1L << (STRUCT - 34)) | (1L << (UNION - 34)) | (1L << (UNSIGNED - 34)) | (1L << (VOID - 34)) | (1L << (NS_OPTIONS - 34)) | (1L << (NS_ENUM - 34)))) != 0) || _la==IDENTIFIER) {
				{
				setState(559); type_specifier();
				}
			}

			setState(562); match(RPAREN);
			setState(564);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(563); block_parameters();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generics_specifierContext extends ParserRuleContext {
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public Generics_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generics_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterGenerics_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitGenerics_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitGenerics_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generics_specifierContext generics_specifier() throws RecognitionException {
		Generics_specifierContext _localctx = new Generics_specifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_generics_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566); match(LT);
			setState(568);
			_la = _input.LA(1);
			if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (CHAR - 34)) | (1L << (DOUBLE - 34)) | (1L << (ENUM - 34)) | (1L << (FLOAT - 34)) | (1L << (ID - 34)) | (1L << (INSTANCETYPE - 34)) | (1L << (INT - 34)) | (1L << (LONG - 34)) | (1L << (SHORT - 34)) | (1L << (SIGNED - 34)) | (1L << (STRUCT - 34)) | (1L << (UNION - 34)) | (1L << (UNSIGNED - 34)) | (1L << (VOID - 34)) | (1L << (NS_OPTIONS - 34)) | (1L << (NS_ENUM - 34)))) != 0) || _la==IDENTIFIER) {
				{
				setState(567); type_specifier();
				}
			}

			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(570); match(COMMA);
				setState(571); type_specifier();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specifierContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Struct_or_union_specifierContext struct_or_union_specifier() {
			return getRuleContext(Struct_or_union_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Generics_specifierContext generics_specifier() {
			return getRuleContext(Generics_specifierContext.class,0);
		}
		public Enum_specifierContext enum_specifier() {
			return getRuleContext(Enum_specifierContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitType_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type_specifier);
		int _la;
		try {
			setState(603);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579); match(VOID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580); match(CHAR);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581); match(SHORT);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(582); match(INT);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(583); match(LONG);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(584); match(FLOAT);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(585); match(DOUBLE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(586); match(SIGNED);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(587); match(UNSIGNED);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(588); match(INSTANCETYPE);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(589); match(ID);
				setState(591);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(590); protocol_reference_list();
					}
				}

				}
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(593); class_name();
				setState(596);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(594); protocol_reference_list();
					}
					break;

				case 2:
					{
					setState(595); generics_specifier();
					}
					break;
				}
				}
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(598); struct_or_union_specifier();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(599); enum_specifier();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(600); match(IDENTIFIER);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(601); match(IDENTIFIER);
				setState(602); pointer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_qualifierContext extends ParserRuleContext {
		public Protocol_qualifierContext protocol_qualifier() {
			return getRuleContext(Protocol_qualifierContext.class,0);
		}
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitType_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_type_qualifier);
		try {
			setState(608);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(605); match(CONST);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(606); match(VOLATILE);
				}
				break;
			case BYCOPY:
			case BYREF:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(607); protocol_qualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_qualifierContext extends ParserRuleContext {
		public Protocol_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_qualifierContext protocol_qualifier() throws RecognitionException {
		Protocol_qualifierContext _localctx = new Protocol_qualifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_protocol_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << IN) | (1L << INOUT) | (1L << ONEWAY) | (1L << OUT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Dictionary_expressionContext dictionary_expression() {
			return getRuleContext(Dictionary_expressionContext.class,0);
		}
		public Box_expressionContext box_expression() {
			return getRuleContext(Box_expressionContext.class,0);
		}
		public Block_expressionContext block_expression() {
			return getRuleContext(Block_expressionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
		}
		public Encode_expressionContext encode_expression() {
			return getRuleContext(Encode_expressionContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ObjCParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_expressionContext array_expression() {
			return getRuleContext(Array_expressionContext.class,0);
		}
		public Message_expressionContext message_expression() {
			return getRuleContext(Message_expressionContext.class,0);
		}
		public Protocol_expressionContext protocol_expression() {
			return getRuleContext(Protocol_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_primary_expression);
		try {
			setState(631);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613); constant();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(614); match(STRING_LITERAL);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(615); match(LPAREN);
				setState(616); expression();
				setState(617); match(RPAREN);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(619); match(SELF);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(620); match(SUPER);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(621); message_expression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(622); selector_expression();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(623); protocol_expression();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(624); encode_expression();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(625); dictionary_expression();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(626); array_expression();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(627); box_expression();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(628); block_expression();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(629); match(2);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(630); match(1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_pairContext extends ParserRuleContext {
		public List<Postfix_expressionContext> postfix_expression() {
			return getRuleContexts(Postfix_expressionContext.class);
		}
		public Postfix_expressionContext postfix_expression(int i) {
			return getRuleContext(Postfix_expressionContext.class,i);
		}
		public Dictionary_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDictionary_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDictionary_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDictionary_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_pairContext dictionary_pair() throws RecognitionException {
		Dictionary_pairContext _localctx = new Dictionary_pairContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dictionary_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633); postfix_expression();
			setState(634); match(COLON);
			setState(635); postfix_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_expressionContext extends ParserRuleContext {
		public List<Dictionary_pairContext> dictionary_pair() {
			return getRuleContexts(Dictionary_pairContext.class);
		}
		public Dictionary_pairContext dictionary_pair(int i) {
			return getRuleContext(Dictionary_pairContext.class,i);
		}
		public Dictionary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDictionary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDictionary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDictionary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_expressionContext dictionary_expression() throws RecognitionException {
		Dictionary_expressionContext _localctx = new Dictionary_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dictionary_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(637); match(AT);
			setState(638); match(LBRACE);
			setState(640);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LPAREN - 73)) | (1L << (LBRACK - 73)) | (1L << (AT - 73)) | (1L << (CARET - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (CHARACTER_LITERAL - 73)) | (1L << (STRING_LITERAL - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)))) != 0)) {
				{
				setState(639); dictionary_pair();
				}
			}

			setState(646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(642); match(COMMA);
					setState(643); dictionary_pair();
					}
					} 
				}
				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(650);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(649); match(COMMA);
				}
			}

			setState(652); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_expressionContext extends ParserRuleContext {
		public List<Postfix_expressionContext> postfix_expression() {
			return getRuleContexts(Postfix_expressionContext.class);
		}
		public Postfix_expressionContext postfix_expression(int i) {
			return getRuleContext(Postfix_expressionContext.class,i);
		}
		public Array_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterArray_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitArray_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitArray_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_expressionContext array_expression() throws RecognitionException {
		Array_expressionContext _localctx = new Array_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_array_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(654); match(AT);
			setState(655); match(LBRACK);
			setState(657);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LPAREN - 73)) | (1L << (LBRACK - 73)) | (1L << (AT - 73)) | (1L << (CARET - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (CHARACTER_LITERAL - 73)) | (1L << (STRING_LITERAL - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)))) != 0)) {
				{
				setState(656); postfix_expression();
				}
			}

			setState(663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(659); match(COMMA);
					setState(660); postfix_expression();
					}
					} 
				}
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(667);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(666); match(COMMA);
				}
			}

			setState(669); match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Box_expressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Box_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_box_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterBox_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitBox_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitBox_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Box_expressionContext box_expression() throws RecognitionException {
		Box_expressionContext _localctx = new Box_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_box_expression);
		try {
			setState(678);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671); match(AT);
				setState(672); match(LPAREN);
				setState(673); conditional_expression();
				setState(674); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676); match(AT);
				setState(677); constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_parametersContext extends ParserRuleContext {
		public Type_variable_declaratorContext type_variable_declarator(int i) {
			return getRuleContext(Type_variable_declaratorContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public List<Type_variable_declaratorContext> type_variable_declarator() {
			return getRuleContexts(Type_variable_declaratorContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Block_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterBlock_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitBlock_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitBlock_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_parametersContext block_parameters() throws RecognitionException {
		Block_parametersContext _localctx = new Block_parametersContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_block_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680); match(LPAREN);
			setState(684);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(681); type_variable_declarator();
				}
				break;

			case 2:
				{
				setState(682); type_name();
				}
				break;

			case 3:
				{
				setState(683); match(VOID);
				}
				break;
			}
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(686); match(COMMA);
				setState(689);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(687); type_variable_declarator();
					}
					break;

				case 2:
					{
					setState(688); type_name();
					}
					break;
				}
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_expressionContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Block_parametersContext block_parameters() {
			return getRuleContext(Block_parametersContext.class,0);
		}
		public Block_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterBlock_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitBlock_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitBlock_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_expressionContext block_expression() throws RecognitionException {
		Block_expressionContext _localctx = new Block_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_block_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698); match(CARET);
			setState(700);
			_la = _input.LA(1);
			if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (CHAR - 34)) | (1L << (DOUBLE - 34)) | (1L << (ENUM - 34)) | (1L << (FLOAT - 34)) | (1L << (ID - 34)) | (1L << (INSTANCETYPE - 34)) | (1L << (INT - 34)) | (1L << (LONG - 34)) | (1L << (SHORT - 34)) | (1L << (SIGNED - 34)) | (1L << (STRUCT - 34)) | (1L << (UNION - 34)) | (1L << (UNSIGNED - 34)) | (1L << (VOID - 34)) | (1L << (NS_OPTIONS - 34)) | (1L << (NS_ENUM - 34)))) != 0) || _la==IDENTIFIER) {
				{
				setState(699); type_specifier();
				}
			}

			setState(703);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(702); block_parameters();
				}
			}

			setState(705); compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Message_expressionContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public Message_selectorContext message_selector() {
			return getRuleContext(Message_selectorContext.class,0);
		}
		public Message_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMessage_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMessage_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMessage_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Message_expressionContext message_expression() throws RecognitionException {
		Message_expressionContext _localctx = new Message_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_message_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707); match(LBRACK);
			setState(708); receiver();
			setState(709); message_selector();
			setState(710); match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_receiver);
		try {
			setState(715);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712); expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713); class_name();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(714); match(SUPER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Message_selectorContext extends ParserRuleContext {
		public List<Keyword_argumentContext> keyword_argument() {
			return getRuleContexts(Keyword_argumentContext.class);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public Keyword_argumentContext keyword_argument(int i) {
			return getRuleContext(Keyword_argumentContext.class,i);
		}
		public Message_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMessage_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMessage_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMessage_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Message_selectorContext message_selector() throws RecognitionException {
		Message_selectorContext _localctx = new Message_selectorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_message_selector);
		int _la;
		try {
			setState(723);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717); selector();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(718); keyword_argument();
					}
					}
					setState(721); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLON || _la==IDENTIFIER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Keyword_argumentContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Keyword_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterKeyword_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitKeyword_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitKeyword_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_argumentContext keyword_argument() throws RecognitionException {
		Keyword_argumentContext _localctx = new Keyword_argumentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_keyword_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(725); selector();
				}
			}

			setState(728); match(COLON);
			setState(729); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selector_expressionContext extends ParserRuleContext {
		public Selector_nameContext selector_name() {
			return getRuleContext(Selector_nameContext.class,0);
		}
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelector_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelector_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSelector_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_selector_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731); match(SELECTOR);
			setState(732); match(LPAREN);
			setState(733); selector_name();
			setState(734); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selector_nameContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public Selector_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelector_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelector_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSelector_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_nameContext selector_name() throws RecognitionException {
		Selector_nameContext _localctx = new Selector_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_selector_name);
		int _la;
		try {
			setState(745);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736); selector();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(738);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(737); selector();
						}
					}

					setState(740); match(COLON);
					}
					}
					setState(743); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLON || _la==IDENTIFIER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_expressionContext extends ParserRuleContext {
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public Protocol_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_expressionContext protocol_expression() throws RecognitionException {
		Protocol_expressionContext _localctx = new Protocol_expressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_protocol_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747); match(PROTOCOL);
			setState(748); match(LPAREN);
			setState(749); protocol_name();
			setState(750); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Encode_expressionContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Encode_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encode_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEncode_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEncode_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitEncode_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Encode_expressionContext encode_expression() throws RecognitionException {
		Encode_expressionContext _localctx = new Encode_expressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_encode_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752); match(ENCODE);
			setState(753); match(LPAREN);
			setState(754); type_name();
			setState(755); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_variable_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Type_variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_variable_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_variable_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_variable_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitType_variable_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_variable_declaratorContext type_variable_declarator() throws RecognitionException {
		Type_variable_declaratorContext _localctx = new Type_variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_type_variable_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757); declaration_specifiers();
			setState(758); declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitTry_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitTry_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_try_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760); match(TRY);
			setState(761); compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Type_variable_declaratorContext type_variable_declarator() {
			return getRuleContext(Type_variable_declaratorContext.class,0);
		}
		public Catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCatch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitCatch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_catch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763); match(CATCH);
			setState(764); match(LPAREN);
			setState(765); type_variable_declarator();
			setState(766); match(RPAREN);
			setState(767); compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Finally_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFinally_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFinally_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitFinally_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_statementContext finally_statement() throws RecognitionException {
		Finally_statementContext _localctx = new Finally_statementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_finally_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769); match(FINALLY);
			setState(770); compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throw_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Throw_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterThrow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitThrow_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitThrow_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throw_statementContext throw_statement() throws RecognitionException {
		Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_throw_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772); match(THROW);
			setState(773); match(LPAREN);
			setState(774); match(IDENTIFIER);
			setState(775); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_blockContext extends ParserRuleContext {
		public Catch_statementContext catch_statement(int i) {
			return getRuleContext(Catch_statementContext.class,i);
		}
		public List<Catch_statementContext> catch_statement() {
			return getRuleContexts(Catch_statementContext.class);
		}
		public Finally_statementContext finally_statement() {
			return getRuleContext(Finally_statementContext.class,0);
		}
		public Try_statementContext try_statement() {
			return getRuleContext(Try_statementContext.class,0);
		}
		public Try_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterTry_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitTry_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitTry_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_blockContext try_block() throws RecognitionException {
		Try_blockContext _localctx = new Try_blockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_try_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777); try_statement();
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(778); catch_statement();
				}
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(785);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(784); finally_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Synchronized_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Synchronized_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronized_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSynchronized_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSynchronized_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSynchronized_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Synchronized_statementContext synchronized_statement() throws RecognitionException {
		Synchronized_statementContext _localctx = new Synchronized_statementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_synchronized_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787); match(SYNCHRONIZED);
			setState(788); match(LPAREN);
			setState(789); primary_expression();
			setState(790); match(RPAREN);
			setState(791); compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Autorelease_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Autorelease_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autorelease_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAutorelease_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAutorelease_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAutorelease_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Autorelease_statementContext autorelease_statement() throws RecognitionException {
		Autorelease_statementContext _localctx = new Autorelease_statementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_autorelease_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793); match(AUTORELEASEPOOL);
			setState(794); compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(796); declaration_specifiers();
				}
				break;
			}
			setState(799); declarator();
			setState(800); compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802); declaration_specifiers();
			setState(803); init_declarator_list();
			setState(804); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_specifiersContext extends ParserRuleContext {
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public List<Storage_class_specifierContext> storage_class_specifier() {
			return getRuleContexts(Storage_class_specifierContext.class);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public List<Arc_behaviour_specifierContext> arc_behaviour_specifier() {
			return getRuleContexts(Arc_behaviour_specifierContext.class);
		}
		public Arc_behaviour_specifierContext arc_behaviour_specifier(int i) {
			return getRuleContext(Arc_behaviour_specifierContext.class,i);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public Storage_class_specifierContext storage_class_specifier(int i) {
			return getRuleContext(Storage_class_specifierContext.class,i);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Declaration_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclaration_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclaration_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDeclaration_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_specifiersContext declaration_specifiers() throws RecognitionException {
		Declaration_specifiersContext _localctx = new Declaration_specifiersContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declaration_specifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(810); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(810);
					switch (_input.LA(1)) {
					case WWEAK:
					case WUNSAFE_UNRETAINED:
						{
						setState(806); arc_behaviour_specifier();
						}
						break;
					case AUTO:
					case EXTERN:
					case REGISTER:
					case STATIC:
					case TYPEDEF:
						{
						setState(807); storage_class_specifier();
						}
						break;
					case CHAR:
					case DOUBLE:
					case ENUM:
					case FLOAT:
					case ID:
					case INSTANCETYPE:
					case INT:
					case LONG:
					case SHORT:
					case SIGNED:
					case STRUCT:
					case UNION:
					case UNSIGNED:
					case VOID:
					case NS_OPTIONS:
					case NS_ENUM:
					case IDENTIFIER:
						{
						setState(808); type_specifier();
						}
						break;
					case BYCOPY:
					case BYREF:
					case CONST:
					case IN:
					case INOUT:
					case ONEWAY:
					case OUT:
					case VOLATILE:
						{
						setState(809); type_qualifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(812); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arc_behaviour_specifierContext extends ParserRuleContext {
		public Arc_behaviour_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arc_behaviour_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterArc_behaviour_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitArc_behaviour_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitArc_behaviour_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arc_behaviour_specifierContext arc_behaviour_specifier() throws RecognitionException {
		Arc_behaviour_specifierContext _localctx = new Arc_behaviour_specifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_arc_behaviour_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_la = _input.LA(1);
			if ( !(_la==WWEAK || _la==WUNSAFE_UNRETAINED) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Storage_class_specifierContext extends ParserRuleContext {
		public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStorage_class_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStorage_class_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStorage_class_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
		Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_storage_class_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << EXTERN) | (1L << REGISTER) | (1L << STATIC) | (1L << TYPEDEF))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declarator_listContext extends ParserRuleContext {
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInit_declarator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInit_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818); init_declarator();
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(819); match(COMMA);
				setState(820); init_declarator();
				}
				}
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInit_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInit_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826); declarator();
			setState(829);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(827); match(ASSIGN);
				setState(828); initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_or_union_specifierContext extends ParserRuleContext {
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Struct_or_union_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_or_union_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_or_union_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_or_union_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStruct_or_union_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_or_union_specifierContext struct_or_union_specifier() throws RecognitionException {
		Struct_or_union_specifierContext _localctx = new Struct_or_union_specifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_struct_or_union_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			_la = _input.LA(1);
			if ( !(_la==STRUCT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(844);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(832); match(IDENTIFIER);
				}
				break;

			case 2:
				{
				setState(834);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(833); match(IDENTIFIER);
					}
				}

				setState(836); match(LBRACE);
				setState(838); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(837); struct_declaration();
					}
					}
					setState(840); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (BYCOPY - 31)) | (1L << (BYREF - 31)) | (1L << (CHAR - 31)) | (1L << (CONST - 31)) | (1L << (DOUBLE - 31)) | (1L << (ENUM - 31)) | (1L << (FLOAT - 31)) | (1L << (ID - 31)) | (1L << (IN - 31)) | (1L << (INOUT - 31)) | (1L << (INSTANCETYPE - 31)) | (1L << (INT - 31)) | (1L << (LONG - 31)) | (1L << (ONEWAY - 31)) | (1L << (OUT - 31)) | (1L << (SHORT - 31)) | (1L << (SIGNED - 31)) | (1L << (STRUCT - 31)) | (1L << (UNION - 31)) | (1L << (UNSIGNED - 31)) | (1L << (VOID - 31)) | (1L << (VOLATILE - 31)) | (1L << (NS_OPTIONS - 31)) | (1L << (NS_ENUM - 31)) | (1L << (WWEAK - 31)) | (1L << (WUNSAFE_UNRETAINED - 31)))) != 0) || _la==IDENTIFIER );
				setState(842); match(RBRACE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declarationContext extends ParserRuleContext {
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_struct_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846); specifier_qualifier_list();
			setState(847); struct_declarator_list();
			setState(848); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Specifier_qualifier_listContext extends ParserRuleContext {
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public List<Arc_behaviour_specifierContext> arc_behaviour_specifier() {
			return getRuleContexts(Arc_behaviour_specifierContext.class);
		}
		public Arc_behaviour_specifierContext arc_behaviour_specifier(int i) {
			return getRuleContext(Arc_behaviour_specifierContext.class,i);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Specifier_qualifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifier_qualifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSpecifier_qualifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSpecifier_qualifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSpecifier_qualifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Specifier_qualifier_listContext specifier_qualifier_list() throws RecognitionException {
		Specifier_qualifier_listContext _localctx = new Specifier_qualifier_listContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_specifier_qualifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(853); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(853);
					switch (_input.LA(1)) {
					case WWEAK:
					case WUNSAFE_UNRETAINED:
						{
						setState(850); arc_behaviour_specifier();
						}
						break;
					case CHAR:
					case DOUBLE:
					case ENUM:
					case FLOAT:
					case ID:
					case INSTANCETYPE:
					case INT:
					case LONG:
					case SHORT:
					case SIGNED:
					case STRUCT:
					case UNION:
					case UNSIGNED:
					case VOID:
					case NS_OPTIONS:
					case NS_ENUM:
					case IDENTIFIER:
						{
						setState(851); type_specifier();
						}
						break;
					case BYCOPY:
					case BYREF:
					case CONST:
					case IN:
					case INOUT:
					case ONEWAY:
					case OUT:
					case VOLATILE:
						{
						setState(852); type_qualifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(855); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declarator_listContext extends ParserRuleContext {
		public List<Struct_declaratorContext> struct_declarator() {
			return getRuleContexts(Struct_declaratorContext.class);
		}
		public Struct_declaratorContext struct_declarator(int i) {
			return getRuleContext(Struct_declaratorContext.class,i);
		}
		public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_declarator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStruct_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
		Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_struct_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857); struct_declarator();
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(858); match(COMMA);
				setState(859); struct_declarator();
				}
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStruct_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declaratorContext struct_declarator() throws RecognitionException {
		Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_struct_declarator);
		int _la;
		try {
			setState(871);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(865); declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				_la = _input.LA(1);
				if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LPAREN - 73)) | (1L << (MUL - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
					{
					setState(866); declarator();
					}
				}

				setState(869); match(COLON);
				setState(870); constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_specifierContext extends ParserRuleContext {
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEnum_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEnum_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitEnum_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_specifierContext enum_specifier() throws RecognitionException {
		Enum_specifierContext _localctx = new Enum_specifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_enum_specifier);
		int _la;
		try {
			setState(911);
			switch (_input.LA(1)) {
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(873); match(ENUM);
				setState(876);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(874); match(COLON);
					setState(875); type_name();
					}
				}

				setState(889);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(878); identifier();
					setState(883);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(879); match(LBRACE);
						setState(880); enumerator_list();
						setState(881); match(RBRACE);
						}
						break;
					}
					}
					break;
				case LBRACE:
					{
					setState(885); match(LBRACE);
					setState(886); enumerator_list();
					setState(887); match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NS_OPTIONS:
				enterOuterAlt(_localctx, 2);
				{
				setState(891); match(NS_OPTIONS);
				setState(892); match(LPAREN);
				setState(893); type_name();
				setState(894); match(COMMA);
				setState(895); identifier();
				setState(896); match(RPAREN);
				setState(897); match(LBRACE);
				setState(898); enumerator_list();
				setState(899); match(RBRACE);
				}
				break;
			case NS_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(901); match(NS_ENUM);
				setState(902); match(LPAREN);
				setState(903); type_name();
				setState(904); match(COMMA);
				setState(905); identifier();
				setState(906); match(RPAREN);
				setState(907); match(LBRACE);
				setState(908); enumerator_list();
				setState(909); match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerator_listContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public Enumerator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEnumerator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEnumerator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitEnumerator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enumerator_listContext enumerator_list() throws RecognitionException {
		Enumerator_listContext _localctx = new Enumerator_listContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_enumerator_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(913); enumerator();
			setState(918);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(914); match(COMMA);
					setState(915); enumerator();
					}
					} 
				}
				setState(920);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(922);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(921); match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924); identifier();
			setState(927);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(925); match(ASSIGN);
				setState(926); constant_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_pointer);
		int _la;
		try {
			setState(938);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(929); match(MUL);
				setState(931);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(930); declaration_specifiers();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(933); match(MUL);
				setState(935);
				_la = _input.LA(1);
				if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (AUTO - 28)) | (1L << (BYCOPY - 28)) | (1L << (BYREF - 28)) | (1L << (CHAR - 28)) | (1L << (CONST - 28)) | (1L << (DOUBLE - 28)) | (1L << (ENUM - 28)) | (1L << (EXTERN - 28)) | (1L << (FLOAT - 28)) | (1L << (ID - 28)) | (1L << (IN - 28)) | (1L << (INOUT - 28)) | (1L << (INSTANCETYPE - 28)) | (1L << (INT - 28)) | (1L << (LONG - 28)) | (1L << (ONEWAY - 28)) | (1L << (OUT - 28)) | (1L << (REGISTER - 28)) | (1L << (SHORT - 28)) | (1L << (SIGNED - 28)) | (1L << (STATIC - 28)) | (1L << (STRUCT - 28)) | (1L << (TYPEDEF - 28)) | (1L << (UNION - 28)) | (1L << (UNSIGNED - 28)) | (1L << (VOID - 28)) | (1L << (VOLATILE - 28)) | (1L << (NS_OPTIONS - 28)) | (1L << (NS_ENUM - 28)) | (1L << (WWEAK - 28)) | (1L << (WUNSAFE_UNRETAINED - 28)))) != 0) || _la==IDENTIFIER) {
					{
					setState(934); declaration_specifiers();
					}
				}

				setState(937); pointer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public Direct_declaratorContext direct_declarator() {
			return getRuleContext(Direct_declaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(940); pointer();
				}
			}

			setState(943); direct_declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Direct_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Block_parametersContext block_parameters() {
			return getRuleContext(Block_parametersContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Declarator_suffixContext> declarator_suffix() {
			return getRuleContexts(Declarator_suffixContext.class);
		}
		public Declarator_suffixContext declarator_suffix(int i) {
			return getRuleContext(Declarator_suffixContext.class,i);
		}
		public Direct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDirect_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDirect_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDirect_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Direct_declaratorContext direct_declarator() throws RecognitionException {
		Direct_declaratorContext _localctx = new Direct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_direct_declarator);
		int _la;
		try {
			int _alt;
			setState(964);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(945); identifier();
				setState(949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(946); declarator_suffix();
						}
						} 
					}
					setState(951);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952); match(LPAREN);
				setState(953); declarator();
				setState(954); match(RPAREN);
				setState(955); declarator_suffix();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(957); match(LPAREN);
				setState(958); match(CARET);
				setState(960);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(959); identifier();
					}
				}

				setState(962); match(RPAREN);
				setState(963); block_parameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarator_suffixContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclarator_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclarator_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDeclarator_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarator_suffixContext declarator_suffix() throws RecognitionException {
		Declarator_suffixContext _localctx = new Declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_declarator_suffix);
		int _la;
		try {
			setState(976);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(966); match(LBRACK);
				setState(968);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LPAREN - 73)) | (1L << (LBRACK - 73)) | (1L << (AT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (SUB - 73)) | (1L << (MUL - 73)) | (1L << (BITAND - 73)) | (1L << (CARET - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (CHARACTER_LITERAL - 73)) | (1L << (STRING_LITERAL - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)))) != 0)) {
					{
					setState(967); constant_expression();
					}
				}

				setState(970); match(RBRACK);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(971); match(LPAREN);
				setState(973);
				_la = _input.LA(1);
				if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (AUTO - 28)) | (1L << (BYCOPY - 28)) | (1L << (BYREF - 28)) | (1L << (CHAR - 28)) | (1L << (CONST - 28)) | (1L << (DOUBLE - 28)) | (1L << (ENUM - 28)) | (1L << (EXTERN - 28)) | (1L << (FLOAT - 28)) | (1L << (ID - 28)) | (1L << (IN - 28)) | (1L << (INOUT - 28)) | (1L << (INSTANCETYPE - 28)) | (1L << (INT - 28)) | (1L << (LONG - 28)) | (1L << (ONEWAY - 28)) | (1L << (OUT - 28)) | (1L << (REGISTER - 28)) | (1L << (SHORT - 28)) | (1L << (SIGNED - 28)) | (1L << (STATIC - 28)) | (1L << (STRUCT - 28)) | (1L << (TYPEDEF - 28)) | (1L << (UNION - 28)) | (1L << (UNSIGNED - 28)) | (1L << (VOID - 28)) | (1L << (VOLATILE - 28)) | (1L << (NS_OPTIONS - 28)) | (1L << (NS_ENUM - 28)) | (1L << (WWEAK - 28)) | (1L << (WUNSAFE_UNRETAINED - 28)))) != 0) || _la==IDENTIFIER) {
					{
					setState(972); parameter_list();
					}
				}

				setState(975); match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978); parameter_declaration_list();
			setState(981);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(979); match(COMMA);
				setState(980); match(ELIPSIS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declarationContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitParameter_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitParameter_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983); declaration_specifiers();
			{
			setState(984); declarator();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_initializer);
		int _la;
		try {
			int _alt;
			setState(1001);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case ENCODE:
			case PROTOCOL:
			case SELECTOR:
			case SUPER:
			case SELF:
			case SIZEOF:
			case LPAREN:
			case LBRACK:
			case AT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case SUB:
			case MUL:
			case BITAND:
			case CARET:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(986); assignment_expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(987); match(LBRACE);
				setState(988); initializer();
				setState(993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(989); match(COMMA);
						setState(990); initializer();
						}
						} 
					}
					setState(995);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				setState(997);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(996); match(COMMA);
					}
				}

				setState(999); match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Block_typeContext block_type() {
			return getRuleContext(Block_typeContext.class,0);
		}
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_type_name);
		try {
			setState(1007);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003); specifier_qualifier_list();
				setState(1004); abstract_declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006); block_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abstract_declaratorContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Abstract_declarator_suffixContext abstract_declarator_suffix(int i) {
			return getRuleContext(Abstract_declarator_suffixContext.class,i);
		}
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public List<Abstract_declarator_suffixContext> abstract_declarator_suffix() {
			return getRuleContexts(Abstract_declarator_suffixContext.class);
		}
		public Abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAbstract_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAbstract_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAbstract_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abstract_declaratorContext abstract_declarator() throws RecognitionException {
		Abstract_declaratorContext _localctx = new Abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_abstract_declarator);
		int _la;
		try {
			setState(1030);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009); pointer();
				setState(1010); abstract_declarator();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012); match(LPAREN);
				setState(1013); abstract_declarator();
				setState(1014); match(RPAREN);
				setState(1016); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1015); abstract_declarator_suffix();
					}
					}
					setState(1018); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN || _la==LBRACK );
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1025); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1020); match(LBRACK);
					setState(1022);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LPAREN - 73)) | (1L << (LBRACK - 73)) | (1L << (AT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (SUB - 73)) | (1L << (MUL - 73)) | (1L << (BITAND - 73)) | (1L << (CARET - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (CHARACTER_LITERAL - 73)) | (1L << (STRING_LITERAL - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)))) != 0)) {
						{
						setState(1021); constant_expression();
						}
					}

					setState(1024); match(RBRACK);
					}
					}
					setState(1027); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				}
				break;
			case RPAREN:
			case LBRACE:
			case COMMA:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abstract_declarator_suffixContext extends ParserRuleContext {
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Abstract_declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAbstract_declarator_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAbstract_declarator_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAbstract_declarator_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abstract_declarator_suffixContext abstract_declarator_suffix() throws RecognitionException {
		Abstract_declarator_suffixContext _localctx = new Abstract_declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_abstract_declarator_suffix);
		int _la;
		try {
			setState(1042);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032); match(LBRACK);
				setState(1034);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LPAREN - 73)) | (1L << (LBRACK - 73)) | (1L << (AT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (SUB - 73)) | (1L << (MUL - 73)) | (1L << (BITAND - 73)) | (1L << (CARET - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (CHARACTER_LITERAL - 73)) | (1L << (STRING_LITERAL - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)))) != 0)) {
					{
					setState(1033); constant_expression();
					}
				}

				setState(1036); match(RBRACK);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037); match(LPAREN);
				setState(1039);
				_la = _input.LA(1);
				if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (AUTO - 28)) | (1L << (BYCOPY - 28)) | (1L << (BYREF - 28)) | (1L << (CHAR - 28)) | (1L << (CONST - 28)) | (1L << (DOUBLE - 28)) | (1L << (ENUM - 28)) | (1L << (EXTERN - 28)) | (1L << (FLOAT - 28)) | (1L << (ID - 28)) | (1L << (IN - 28)) | (1L << (INOUT - 28)) | (1L << (INSTANCETYPE - 28)) | (1L << (INT - 28)) | (1L << (LONG - 28)) | (1L << (ONEWAY - 28)) | (1L << (OUT - 28)) | (1L << (REGISTER - 28)) | (1L << (SHORT - 28)) | (1L << (SIGNED - 28)) | (1L << (STATIC - 28)) | (1L << (STRUCT - 28)) | (1L << (TYPEDEF - 28)) | (1L << (UNION - 28)) | (1L << (UNSIGNED - 28)) | (1L << (VOID - 28)) | (1L << (VOLATILE - 28)) | (1L << (NS_OPTIONS - 28)) | (1L << (NS_ENUM - 28)) | (1L << (WWEAK - 28)) | (1L << (WUNSAFE_UNRETAINED - 28)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1038); parameter_declaration_list();
					}
				}

				setState(1041); match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declaration_listContext extends ParserRuleContext {
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public Parameter_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterParameter_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitParameter_declaration_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitParameter_declaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declaration_listContext parameter_declaration_list() throws RecognitionException {
		Parameter_declaration_listContext _localctx = new Parameter_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_parameter_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1044); parameter_declaration();
			setState(1049);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1045); match(COMMA);
					setState(1046); parameter_declaration();
					}
					} 
				}
				setState(1051);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1053); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1052); statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1055); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Autorelease_statementContext autorelease_statement() {
			return getRuleContext(Autorelease_statementContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Try_blockContext try_block() {
			return getRuleContext(Try_blockContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Synchronized_statementContext synchronized_statement() {
			return getRuleContext(Synchronized_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_statement);
		try {
			setState(1069);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057); labeled_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058); expression();
				setState(1059); match(SEMI);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1061); compound_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1062); selection_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1063); iteration_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1064); jump_statement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1065); synchronized_statement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1066); autorelease_statement();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1067); try_block();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1068); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_statementContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitLabeled_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitLabeled_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_labeled_statement);
		try {
			setState(1083);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071); identifier();
				setState(1072); match(COLON);
				setState(1073); statement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1075); match(CASE);
				setState(1076); constant_expression();
				setState(1077); match(COLON);
				setState(1078); statement();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1080); match(DEFAULT);
				setState(1081); match(COLON);
				setState(1082); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public Statement_listContext statement_list(int i) {
			return getRuleContext(Statement_listContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Statement_listContext> statement_list() {
			return getRuleContexts(Statement_listContext.class);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCompound_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085); match(LBRACE);
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << AUTORELEASEPOOL) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SYNCHRONIZED) | (1L << TRY) | (1L << SUPER) | (1L << SELF) | (1L << AUTO) | (1L << BREAK) | (1L << BYCOPY) | (1L << BYREF) | (1L << CASE) | (1L << CHAR) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << FOR) | (1L << ID) | (1L << IF) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << GOTO) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << RETURN) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << SWITCH) | (1L << TYPEDEF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (UNION - 64)) | (1L << (UNSIGNED - 64)) | (1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (BITAND - 64)) | (1L << (CARET - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (IDENTIFIER - 129)) | (1L << (CHARACTER_LITERAL - 129)) | (1L << (STRING_LITERAL - 129)) | (1L << (HEX_LITERAL - 129)) | (1L << (DECIMAL_LITERAL - 129)) | (1L << (OCTAL_LITERAL - 129)) | (1L << (FLOATING_POINT_LITERAL - 129)))) != 0)) {
				{
				setState(1088);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1086); declaration();
					}
					break;

				case 2:
					{
					setState(1087); statement_list();
					}
					break;
				}
				}
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1093); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_statementContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelection_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSelection_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_selection_statement);
		try {
			setState(1110);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1095); match(IF);
				setState(1096); match(LPAREN);
				setState(1097); expression();
				setState(1098); match(RPAREN);
				setState(1099); statement();
				setState(1102);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1100); match(ELSE);
					setState(1101); statement();
					}
					break;
				}
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104); match(SWITCH);
				setState(1105); match(LPAREN);
				setState(1106); expression();
				setState(1107); match(RPAREN);
				setState(1108); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_in_statementContext extends ParserRuleContext {
		public Type_variable_declaratorContext type_variable_declarator() {
			return getRuleContext(Type_variable_declaratorContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_in_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFor_in_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFor_in_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitFor_in_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_in_statementContext for_in_statement() throws RecognitionException {
		For_in_statementContext _localctx = new For_in_statementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_for_in_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112); match(FOR);
			setState(1113); match(LPAREN);
			setState(1114); type_variable_declarator();
			setState(1115); match(IN);
			setState(1117);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LPAREN - 73)) | (1L << (LBRACK - 73)) | (1L << (AT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (SUB - 73)) | (1L << (MUL - 73)) | (1L << (BITAND - 73)) | (1L << (CARET - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (CHARACTER_LITERAL - 73)) | (1L << (STRING_LITERAL - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)))) != 0)) {
				{
				setState(1116); expression();
				}
			}

			setState(1119); match(RPAREN);
			setState(1120); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122); match(FOR);
			setState(1123); match(LPAREN);
			setState(1128);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				{
				setState(1124); declaration_specifiers();
				setState(1125); init_declarator_list();
				}
				}
				break;

			case 2:
				{
				setState(1127); expression();
				}
				break;
			}
			setState(1130); match(SEMI);
			setState(1132);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LPAREN - 73)) | (1L << (LBRACK - 73)) | (1L << (AT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (SUB - 73)) | (1L << (MUL - 73)) | (1L << (BITAND - 73)) | (1L << (CARET - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (CHARACTER_LITERAL - 73)) | (1L << (STRING_LITERAL - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)))) != 0)) {
				{
				setState(1131); expression();
				}
			}

			setState(1134); match(SEMI);
			setState(1136);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LPAREN - 73)) | (1L << (LBRACK - 73)) | (1L << (AT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (SUB - 73)) | (1L << (MUL - 73)) | (1L << (BITAND - 73)) | (1L << (CARET - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (CHARACTER_LITERAL - 73)) | (1L << (STRING_LITERAL - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)))) != 0)) {
				{
				setState(1135); expression();
				}
			}

			setState(1138); match(RPAREN);
			setState(1139); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141); match(WHILE);
			setState(1142); match(LPAREN);
			setState(1143); expression();
			setState(1144); match(RPAREN);
			setState(1145); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147); match(DO);
			setState(1148); statement();
			setState(1149); match(WHILE);
			setState(1150); match(LPAREN);
			setState(1151); expression();
			setState(1152); match(RPAREN);
			setState(1153); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iteration_statementContext extends ParserRuleContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public For_in_statementContext for_in_statement() {
			return getRuleContext(For_in_statementContext.class,0);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitIteration_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitIteration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_iteration_statement);
		try {
			setState(1159);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155); while_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156); do_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1157); for_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1158); for_in_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jump_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitJump_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitJump_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_jump_statement);
		int _la;
		try {
			setState(1174);
			switch (_input.LA(1)) {
			case GOTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161); match(GOTO);
				setState(1162); identifier();
				setState(1163); match(SEMI);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1165); match(CONTINUE);
				setState(1166); match(SEMI);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1167); match(BREAK);
				setState(1168); match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1169); match(RETURN);
				setState(1171);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LPAREN - 73)) | (1L << (LBRACK - 73)) | (1L << (AT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (SUB - 73)) | (1L << (MUL - 73)) | (1L << (BITAND - 73)) | (1L << (CARET - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (CHARACTER_LITERAL - 73)) | (1L << (STRING_LITERAL - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)))) != 0)) {
					{
					setState(1170); expression();
					}
				}

				setState(1173); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176); assignment_expression();
			setState(1181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1177); match(COMMA);
				setState(1178); assignment_expression();
				}
				}
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAssignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAssignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_assignment_expression);
		try {
			setState(1189);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1184); conditional_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185); unary_expression();
				setState(1186); assignment_operator();
				setState(1187); assignment_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (ASSIGN - 84)) | (1L << (ADD_ASSIGN - 84)) | (1L << (SUB_ASSIGN - 84)) | (1L << (MUL_ASSIGN - 84)) | (1L << (DIV_ASSIGN - 84)) | (1L << (AND_ASSIGN - 84)) | (1L << (OR_ASSIGN - 84)) | (1L << (XOR_ASSIGN - 84)) | (1L << (MOD_ASSIGN - 84)) | (1L << (LSHIFT_ASSIGN - 84)) | (1L << (RSHIFT_ASSIGN - 84)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public List<Conditional_expressionContext> conditional_expression() {
			return getRuleContexts(Conditional_expressionContext.class);
		}
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression(int i) {
			return getRuleContext(Conditional_expressionContext.class,i);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193); logical_or_expression();
			setState(1199);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1194); match(QUESTION);
				setState(1195); conditional_expression();
				setState(1196); match(COLON);
				setState(1197); conditional_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitConstant_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitConstant_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201); conditional_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitLogical_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitLogical_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203); logical_and_expression();
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1204); match(OR);
				setState(1205); logical_and_expression();
				}
				}
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitLogical_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitLogical_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211); inclusive_or_expression();
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1212); match(AND);
				setState(1213); inclusive_or_expression();
				}
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219); exclusive_or_expression();
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1220); match(BITOR);
				setState(1221); exclusive_or_expression();
				}
				}
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227); and_expression();
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1228); match(CARET);
				setState(1229); and_expression();
				}
				}
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235); equality_expression();
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1236); match(BITAND);
				setState(1237); equality_expression();
				}
				}
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243); relational_expression();
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(1244);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1245); relational_expression();
				}
				}
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251); shift_expression();
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (GT - 85)) | (1L << (LT - 85)) | (1L << (LE - 85)) | (1L << (GE - 85)))) != 0)) {
				{
				{
				setState(1252);
				_la = _input.LA(1);
				if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (GT - 85)) | (1L << (LT - 85)) | (1L << (LE - 85)) | (1L << (GE - 85)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1253); shift_expression();
				}
				}
				setState(1258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259); additive_expression();
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHIFT_R || _la==SHIFT_L) {
				{
				{
				setState(1260);
				_la = _input.LA(1);
				if ( !(_la==SHIFT_R || _la==SHIFT_L) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1261); additive_expression();
				}
				}
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267); multiplicative_expression();
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(1268);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1269); multiplicative_expression();
				}
				}
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression(int i) {
			return getRuleContext(Cast_expressionContext.class,i);
		}
		public List<Cast_expressionContext> cast_expression() {
			return getRuleContexts(Cast_expressionContext.class);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275); cast_expression();
			setState(1280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (MUL - 101)) | (1L << (DIV - 101)) | (1L << (MOD - 101)))) != 0)) {
				{
				{
				setState(1276);
				_la = _input.LA(1);
				if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (MUL - 101)) | (1L << (DIV - 101)) | (1L << (MOD - 101)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1277); cast_expression();
				}
				}
				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCast_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitCast_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_cast_expression);
		try {
			setState(1289);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1283); match(LPAREN);
				setState(1284); type_name();
				setState(1285); match(RPAREN);
				setState(1286); cast_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1288); unary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_unary_expression);
		try {
			setState(1307);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case ENCODE:
			case PROTOCOL:
			case SELECTOR:
			case SUPER:
			case SELF:
			case LPAREN:
			case LBRACK:
			case AT:
			case CARET:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1291); postfix_expression();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1292); match(INC);
				setState(1293); unary_expression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1294); match(DEC);
				setState(1295); unary_expression();
				}
				break;
			case BANG:
			case TILDE:
			case SUB:
			case MUL:
			case BITAND:
				enterOuterAlt(_localctx, 4);
				{
				setState(1296); unary_operator();
				setState(1297); cast_expression();
				}
				break;
			case SIZEOF:
				enterOuterAlt(_localctx, 5);
				{
				setState(1299); match(SIZEOF);
				setState(1305);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1300); match(LPAREN);
					setState(1301); type_name();
					setState(1302); match(RPAREN);
					}
					break;

				case 2:
					{
					setState(1304); unary_expression();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (BANG - 87)) | (1L << (TILDE - 87)) | (1L << (SUB - 87)) | (1L << (MUL - 87)) | (1L << (BITAND - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Argument_listContext argument_list(int i) {
			return getRuleContext(Argument_listContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<Argument_listContext> argument_list() {
			return getRuleContexts(Argument_listContext.class);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPostfix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitPostfix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_postfix_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311); primary_expression();
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LPAREN - 73)) | (1L << (LBRACK - 73)) | (1L << (DOT - 73)) | (1L << (STRUCTACCESS - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)))) != 0)) {
				{
				setState(1326);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1312); match(LBRACK);
					setState(1313); expression();
					setState(1314); match(RBRACK);
					}
					break;
				case LPAREN:
					{
					setState(1316); match(LPAREN);
					setState(1317); argument_list();
					setState(1318); match(RPAREN);
					}
					break;
				case DOT:
					{
					setState(1320); match(DOT);
					setState(1321); identifier();
					}
					break;
				case STRUCTACCESS:
					{
					setState(1322); match(STRUCTACCESS);
					setState(1323); identifier();
					}
					break;
				case INC:
					{
					setState(1324); match(INC);
					}
					break;
				case DEC:
					{
					setState(1325); match(DEC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public Argument_expression_listContext argument_expression_list() {
			return getRuleContext(Argument_expression_listContext.class,0);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LPAREN - 73)) | (1L << (LBRACK - 73)) | (1L << (AT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (SUB - 73)) | (1L << (MUL - 73)) | (1L << (BITAND - 73)) | (1L << (CARET - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (CHARACTER_LITERAL - 73)) | (1L << (STRING_LITERAL - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)))) != 0)) {
				{
				setState(1331); argument_expression_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_expression_listContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public Argument_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterArgument_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitArgument_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitArgument_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_expression_listContext argument_expression_list() throws RecognitionException {
		Argument_expression_listContext _localctx = new Argument_expression_listContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_argument_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334); assignment_expression();
			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1335); match(COMMA);
				setState(1336); assignment_expression();
				}
				}
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(ObjCParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ObjCParser.OCTAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(ObjCParser.HEX_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(ObjCParser.CHARACTER_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(ObjCParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			_la = _input.LA(1);
			if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (CHARACTER_LITERAL - 130)) | (1L << (HEX_LITERAL - 130)) | (1L << (DECIMAL_LITERAL - 130)) | (1L << (OCTAL_LITERAL - 130)) | (1L << (FLOATING_POINT_LITERAL - 130)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0096\u0545\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\3\2\6\2\u0102\n\2\r\2\16\2\u0103\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\u0114\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u011c\n"+
		"\5\3\5\5\5\u011f\n\5\3\5\5\5\u0122\n\5\3\5\5\5\u0125\n\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\5\6\u012d\n\6\3\6\3\6\5\6\u0131\n\6\3\6\5\6\u0134\n\6\3\6\5"+
		"\6\u0137\n\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u013f\n\7\3\7\5\7\u0142\n\7\3"+
		"\7\5\7\u0145\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u014f\n\b\3\b\3\b"+
		"\3\t\3\t\3\t\5\t\u0156\n\t\3\t\5\t\u0159\n\t\3\t\5\t\u015c\n\t\3\t\5\t"+
		"\u015f\n\t\3\t\5\t\u0162\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\7\f\u0171\n\f\f\f\16\f\u0174\13\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\7\16\u017d\n\16\f\16\16\16\u0180\13\16\3\17\3\17\5\17\u0184"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u018f\n\21\f\21"+
		"\16\21\u0192\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u01a4\n\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\7\27\u01b0\n\27\f\27\16\27\u01b3\13\27\3\27"+
		"\3\27\3\27\6\27\u01b8\n\27\r\27\16\27\u01b9\3\27\3\27\3\27\5\27\u01bf"+
		"\n\27\3\30\5\30\u01c2\n\30\3\30\6\30\u01c5\n\30\r\30\16\30\u01c6\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\6\32\u01cf\n\32\r\32\16\32\u01d0\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\5\35\u01da\n\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\6\36\u01e4\n\36\r\36\16\36\u01e5\3\37\3\37\3\37\3 \3 \3 \3"+
		"!\5!\u01ef\n!\3!\3!\5!\u01f3\n!\3!\5!\u01f6\n!\3!\3!\3\"\3\"\6\"\u01fc"+
		"\n\"\r\"\16\"\u01fd\3\"\5\"\u0201\n\"\5\"\u0203\n\"\3#\5#\u0206\n#\3#"+
		"\3#\7#\u020a\n#\f#\16#\u020d\13#\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\5&\u021f\n&\3\'\3\'\3\'\7\'\u0224\n\'\f\'\16\'\u0227\13\'\3"+
		"(\3(\3(\3(\5(\u022d\n(\3)\3)\3)\3)\5)\u0233\n)\3)\3)\5)\u0237\n)\3*\3"+
		"*\5*\u023b\n*\3*\3*\7*\u023f\n*\f*\16*\u0242\13*\3*\3*\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\5+\u0252\n+\3+\3+\3+\5+\u0257\n+\3+\3+\3+\3+\3+"+
		"\5+\u025e\n+\3,\3,\3,\5,\u0263\n,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u027a\n.\3/\3/\3/\3/\3\60\3\60\3\60\5\60"+
		"\u0283\n\60\3\60\3\60\7\60\u0287\n\60\f\60\16\60\u028a\13\60\3\60\5\60"+
		"\u028d\n\60\3\60\3\60\3\61\3\61\3\61\5\61\u0294\n\61\3\61\3\61\7\61\u0298"+
		"\n\61\f\61\16\61\u029b\13\61\3\61\5\61\u029e\n\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u02a9\n\62\3\63\3\63\3\63\3\63\5\63\u02af"+
		"\n\63\3\63\3\63\3\63\5\63\u02b4\n\63\7\63\u02b6\n\63\f\63\16\63\u02b9"+
		"\13\63\3\63\3\63\3\64\3\64\5\64\u02bf\n\64\3\64\5\64\u02c2\n\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\5\66\u02ce\n\66\3\67\3\67"+
		"\6\67\u02d2\n\67\r\67\16\67\u02d3\5\67\u02d6\n\67\38\58\u02d9\n8\38\3"+
		"8\38\39\39\39\39\39\3:\3:\5:\u02e5\n:\3:\6:\u02e8\n:\r:\16:\u02e9\5:\u02ec"+
		"\n:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\3?"+
		"\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\7B\u030e\nB\fB\16B\u0311\13B\3B\5B\u0314"+
		"\nB\3C\3C\3C\3C\3C\3C\3D\3D\3D\3E\5E\u0320\nE\3E\3E\3E\3F\3F\3F\3F\3G"+
		"\3G\3G\3G\6G\u032d\nG\rG\16G\u032e\3H\3H\3I\3I\3J\3J\3J\7J\u0338\nJ\f"+
		"J\16J\u033b\13J\3K\3K\3K\5K\u0340\nK\3L\3L\3L\5L\u0345\nL\3L\3L\6L\u0349"+
		"\nL\rL\16L\u034a\3L\3L\5L\u034f\nL\3M\3M\3M\3M\3N\3N\3N\6N\u0358\nN\r"+
		"N\16N\u0359\3O\3O\3O\7O\u035f\nO\fO\16O\u0362\13O\3P\3P\5P\u0366\nP\3"+
		"P\3P\5P\u036a\nP\3Q\3Q\3Q\5Q\u036f\nQ\3Q\3Q\3Q\3Q\3Q\5Q\u0376\nQ\3Q\3"+
		"Q\3Q\3Q\5Q\u037c\nQ\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\5Q\u0392\nQ\3R\3R\3R\7R\u0397\nR\fR\16R\u039a\13R\3R\5R\u039d"+
		"\nR\3S\3S\3S\5S\u03a2\nS\3T\3T\5T\u03a6\nT\3T\3T\5T\u03aa\nT\3T\5T\u03ad"+
		"\nT\3U\5U\u03b0\nU\3U\3U\3V\3V\7V\u03b6\nV\fV\16V\u03b9\13V\3V\3V\3V\3"+
		"V\3V\3V\3V\3V\5V\u03c3\nV\3V\3V\5V\u03c7\nV\3W\3W\5W\u03cb\nW\3W\3W\3"+
		"W\5W\u03d0\nW\3W\5W\u03d3\nW\3X\3X\3X\5X\u03d8\nX\3Y\3Y\3Y\3Z\3Z\3Z\3"+
		"Z\3Z\7Z\u03e2\nZ\fZ\16Z\u03e5\13Z\3Z\5Z\u03e8\nZ\3Z\3Z\5Z\u03ec\nZ\3["+
		"\3[\3[\3[\5[\u03f2\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\6\\\u03fb\n\\\r\\\16"+
		"\\\u03fc\3\\\3\\\5\\\u0401\n\\\3\\\6\\\u0404\n\\\r\\\16\\\u0405\3\\\5"+
		"\\\u0409\n\\\3]\3]\5]\u040d\n]\3]\3]\3]\5]\u0412\n]\3]\5]\u0415\n]\3^"+
		"\3^\3^\7^\u041a\n^\f^\16^\u041d\13^\3_\6_\u0420\n_\r_\16_\u0421\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0430\n`\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\5a\u043e\na\3b\3b\3b\7b\u0443\nb\fb\16b\u0446\13b\3b\3b\3c\3"+
		"c\3c\3c\3c\3c\3c\5c\u0451\nc\3c\3c\3c\3c\3c\3c\5c\u0459\nc\3d\3d\3d\3"+
		"d\3d\5d\u0460\nd\3d\3d\3d\3e\3e\3e\3e\3e\3e\5e\u046b\ne\3e\3e\5e\u046f"+
		"\ne\3e\3e\5e\u0473\ne\3e\3e\3e\3f\3f\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g"+
		"\3g\3h\3h\3h\3h\5h\u048a\nh\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u0496\ni"+
		"\3i\5i\u0499\ni\3j\3j\3j\7j\u049e\nj\fj\16j\u04a1\13j\3k\3k\3k\3k\3k\5"+
		"k\u04a8\nk\3l\3l\3m\3m\3m\3m\3m\3m\5m\u04b2\nm\3n\3n\3o\3o\3o\7o\u04b9"+
		"\no\fo\16o\u04bc\13o\3p\3p\3p\7p\u04c1\np\fp\16p\u04c4\13p\3q\3q\3q\7"+
		"q\u04c9\nq\fq\16q\u04cc\13q\3r\3r\3r\7r\u04d1\nr\fr\16r\u04d4\13r\3s\3"+
		"s\3s\7s\u04d9\ns\fs\16s\u04dc\13s\3t\3t\3t\7t\u04e1\nt\ft\16t\u04e4\13"+
		"t\3u\3u\3u\7u\u04e9\nu\fu\16u\u04ec\13u\3v\3v\3v\7v\u04f1\nv\fv\16v\u04f4"+
		"\13v\3w\3w\3w\7w\u04f9\nw\fw\16w\u04fc\13w\3x\3x\3x\7x\u0501\nx\fx\16"+
		"x\u0504\13x\3y\3y\3y\3y\3y\3y\5y\u050c\ny\3z\3z\3z\3z\3z\3z\3z\3z\3z\3"+
		"z\3z\3z\3z\3z\5z\u051c\nz\5z\u051e\nz\3{\3{\3|\3|\3|\3|\3|\3|\3|\3|\3"+
		"|\3|\3|\3|\3|\3|\3|\7|\u0531\n|\f|\16|\u0534\13|\3}\5}\u0537\n}\3~\3~"+
		"\3~\7~\u053c\n~\f~\16~\u053f\13~\3\177\3\177\3\u0080\3\u0080\3\u0080\2"+
		"\2\u0081\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\2\20\3\2"+
		"\u008a\u008b\5\2\17\17\22\22\24\25\5\2!\"\61\62\678\3\2IJ\7\2\36\36,,"+
		"99>>AA\4\2??BB\4\2VVox\4\2]]``\4\2WX^_\3\2mn\3\2ef\4\2ghll\5\2YZfgii\4"+
		"\2\u0084\u0084\u0086\u0089\u05b2\2\u0101\3\2\2\2\4\u0113\3\2\2\2\6\u0115"+
		"\3\2\2\2\b\u0117\3\2\2\2\n\u0128\3\2\2\2\f\u013a\3\2\2\2\16\u0148\3\2"+
		"\2\2\20\u0152\3\2\2\2\22\u0165\3\2\2\2\24\u0169\3\2\2\2\26\u016d\3\2\2"+
		"\2\30\u0175\3\2\2\2\32\u0179\3\2\2\2\34\u0181\3\2\2\2\36\u0187\3\2\2\2"+
		" \u018b\3\2\2\2\"\u01a3\3\2\2\2$\u01a5\3\2\2\2&\u01a7\3\2\2\2(\u01a9\3"+
		"\2\2\2*\u01ab\3\2\2\2,\u01be\3\2\2\2.\u01c1\3\2\2\2\60\u01c8\3\2\2\2\62"+
		"\u01ce\3\2\2\2\64\u01d2\3\2\2\2\66\u01d5\3\2\2\28\u01d9\3\2\2\2:\u01e3"+
		"\3\2\2\2<\u01e7\3\2\2\2>\u01ea\3\2\2\2@\u01ee\3\2\2\2B\u0202\3\2\2\2D"+
		"\u0205\3\2\2\2F\u0210\3\2\2\2H\u0212\3\2\2\2J\u021e\3\2\2\2L\u0220\3\2"+
		"\2\2N\u022c\3\2\2\2P\u022e\3\2\2\2R\u0238\3\2\2\2T\u025d\3\2\2\2V\u0262"+
		"\3\2\2\2X\u0264\3\2\2\2Z\u0279\3\2\2\2\\\u027b\3\2\2\2^\u027f\3\2\2\2"+
		"`\u0290\3\2\2\2b\u02a8\3\2\2\2d\u02aa\3\2\2\2f\u02bc\3\2\2\2h\u02c5\3"+
		"\2\2\2j\u02cd\3\2\2\2l\u02d5\3\2\2\2n\u02d8\3\2\2\2p\u02dd\3\2\2\2r\u02eb"+
		"\3\2\2\2t\u02ed\3\2\2\2v\u02f2\3\2\2\2x\u02f7\3\2\2\2z\u02fa\3\2\2\2|"+
		"\u02fd\3\2\2\2~\u0303\3\2\2\2\u0080\u0306\3\2\2\2\u0082\u030b\3\2\2\2"+
		"\u0084\u0315\3\2\2\2\u0086\u031b\3\2\2\2\u0088\u031f\3\2\2\2\u008a\u0324"+
		"\3\2\2\2\u008c\u032c\3\2\2\2\u008e\u0330\3\2\2\2\u0090\u0332\3\2\2\2\u0092"+
		"\u0334\3\2\2\2\u0094\u033c\3\2\2\2\u0096\u0341\3\2\2\2\u0098\u0350\3\2"+
		"\2\2\u009a\u0357\3\2\2\2\u009c\u035b\3\2\2\2\u009e\u0369\3\2\2\2\u00a0"+
		"\u0391\3\2\2\2\u00a2\u0393\3\2\2\2\u00a4\u039e\3\2\2\2\u00a6\u03ac\3\2"+
		"\2\2\u00a8\u03af\3\2\2\2\u00aa\u03c6\3\2\2\2\u00ac\u03d2\3\2\2\2\u00ae"+
		"\u03d4\3\2\2\2\u00b0\u03d9\3\2\2\2\u00b2\u03eb\3\2\2\2\u00b4\u03f1\3\2"+
		"\2\2\u00b6\u0408\3\2\2\2\u00b8\u0414\3\2\2\2\u00ba\u0416\3\2\2\2\u00bc"+
		"\u041f\3\2\2\2\u00be\u042f\3\2\2\2\u00c0\u043d\3\2\2\2\u00c2\u043f\3\2"+
		"\2\2\u00c4\u0458\3\2\2\2\u00c6\u045a\3\2\2\2\u00c8\u0464\3\2\2\2\u00ca"+
		"\u0477\3\2\2\2\u00cc\u047d\3\2\2\2\u00ce\u0489\3\2\2\2\u00d0\u0498\3\2"+
		"\2\2\u00d2\u049a\3\2\2\2\u00d4\u04a7\3\2\2\2\u00d6\u04a9\3\2\2\2\u00d8"+
		"\u04ab\3\2\2\2\u00da\u04b3\3\2\2\2\u00dc\u04b5\3\2\2\2\u00de\u04bd\3\2"+
		"\2\2\u00e0\u04c5\3\2\2\2\u00e2\u04cd\3\2\2\2\u00e4\u04d5\3\2\2\2\u00e6"+
		"\u04dd\3\2\2\2\u00e8\u04e5\3\2\2\2\u00ea\u04ed\3\2\2\2\u00ec\u04f5\3\2"+
		"\2\2\u00ee\u04fd\3\2\2\2\u00f0\u050b\3\2\2\2\u00f2\u051d\3\2\2\2\u00f4"+
		"\u051f\3\2\2\2\u00f6\u0521\3\2\2\2\u00f8\u0536\3\2\2\2\u00fa\u0538\3\2"+
		"\2\2\u00fc\u0540\3\2\2\2\u00fe\u0542\3\2\2\2\u0100\u0102\5\4\3\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\2\2\3\u0106\3\3\2\2\2\u0107\u0114"+
		"\7\u008e\2\2\u0108\u0114\7\u008f\2\2\u0109\u0114\5\6\4\2\u010a\u0114\5"+
		"\u0088E\2\u010b\u0114\5\u008aF\2\u010c\u0114\5\b\5\2\u010d\u0114\5\f\7"+
		"\2\u010e\u0114\5\n\6\2\u010f\u0114\5\16\b\2\u0110\u0114\5\20\t\2\u0111"+
		"\u0114\5\22\n\2\u0112\u0114\5\24\13\2\u0113\u0107\3\2\2\2\u0113\u0108"+
		"\3\2\2\2\u0113\u0109\3\2\2\2\u0113\u010a\3\2\2\2\u0113\u010b\3\2\2\2\u0113"+
		"\u010c\3\2\2\2\u0113\u010d\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u010f\3\2"+
		"\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\5\3\2\2\2\u0115\u0116\t\2\2\2\u0116\7\3\2\2\2\u0117\u0118\7\16\2\2\u0118"+
		"\u011b\5$\23\2\u0119\u011a\7\\\2\2\u011a\u011c\5&\24\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011f\5\30\r\2\u011e"+
		"\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u0122\5,"+
		"\27\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u0125\5\62\32\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3"+
		"\2\2\2\u0126\u0127\7\13\2\2\u0127\t\3\2\2\2\u0128\u0129\7\16\2\2\u0129"+
		"\u012a\5$\23\2\u012a\u012c\7K\2\2\u012b\u012d\5(\25\2\u012c\u012b\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\7L\2\2\u012f"+
		"\u0131\5\30\r\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3"+
		"\2\2\2\u0132\u0134\5,\27\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0137\5\62\32\2\u0136\u0135\3\2\2\2\u0136\u0137\3"+
		"\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7\13\2\2\u0139\13\3\2\2\2\u013a"+
		"\u013b\7\r\2\2\u013b\u013e\5$\23\2\u013c\u013d\7\\\2\2\u013d\u013f\5&"+
		"\24\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140"+
		"\u0142\5,\27\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2"+
		"\2\2\u0143\u0145\5:\36\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0147\7\13\2\2\u0147\r\3\2\2\2\u0148\u0149\7\r\2"+
		"\2\u0149\u014a\5$\23\2\u014a\u014b\7K\2\2\u014b\u014c\5(\25\2\u014c\u014e"+
		"\7L\2\2\u014d\u014f\5:\36\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\7\13\2\2\u0151\17\3\2\2\2\u0152\u0153\7\20"+
		"\2\2\u0153\u0155\5*\26\2\u0154\u0156\5\30\r\2\u0155\u0154\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\7\5\2\2\u0158\u0157\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u015c\5\62\32\2\u015b"+
		"\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015f\7\21"+
		"\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160"+
		"\u0162\5\62\32\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3"+
		"\2\2\2\u0163\u0164\7\13\2\2\u0164\21\3\2\2\2\u0165\u0166\7\20\2\2\u0166"+
		"\u0167\5\32\16\2\u0167\u0168\7Q\2\2\u0168\23\3\2\2\2\u0169\u016a\7\b\2"+
		"\2\u016a\u016b\5\26\f\2\u016b\u016c\7Q\2\2\u016c\25\3\2\2\2\u016d\u0172"+
		"\5$\23\2\u016e\u016f\7R\2\2\u016f\u0171\5$\23\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\27\3\2\2"+
		"\2\u0174\u0172\3\2\2\2\u0175\u0176\7X\2\2\u0176\u0177\5\32\16\2\u0177"+
		"\u0178\7W\2\2\u0178\31\3\2\2\2\u0179\u017e\5*\26\2\u017a\u017b\7R\2\2"+
		"\u017b\u017d\5*\26\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\33\3\2\2\2\u0180\u017e\3\2\2\2\u0181"+
		"\u0183\7\23\2\2\u0182\u0184\5\36\20\2\u0183\u0182\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\5\u0098M\2\u0186\35\3\2\2\2\u0187"+
		"\u0188\7K\2\2\u0188\u0189\5 \21\2\u0189\u018a\7L\2\2\u018a\37\3\2\2\2"+
		"\u018b\u0190\5\"\22\2\u018c\u018d\7R\2\2\u018d\u018f\5\"\22\2\u018e\u018c"+
		"\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"!\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u01a4\7|\2\2\u0194\u01a4\7z\2\2\u0195"+
		"\u01a4\7\u0082\2\2\u0196\u01a4\7~\2\2\u0197\u01a4\7\177\2\2\u0198\u01a4"+
		"\7\u0080\2\2\u0199\u01a4\7\u0081\2\2\u019a\u01a4\3\2\2\2\u019b\u019c\7"+
		"{\2\2\u019c\u019d\7V\2\2\u019d\u01a4\7\u0083\2\2\u019e\u019f\7}\2\2\u019f"+
		"\u01a0\7V\2\2\u01a0\u01a1\7\u0083\2\2\u01a1\u01a4\7\\\2\2\u01a2\u01a4"+
		"\7\u0083\2\2\u01a3\u0193\3\2\2\2\u01a3\u0194\3\2\2\2\u01a3\u0195\3\2\2"+
		"\2\u01a3\u0196\3\2\2\2\u01a3\u0197\3\2\2\2\u01a3\u0198\3\2\2\2\u01a3\u0199"+
		"\3\2\2\2\u01a3\u019a\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019e\3\2\2\2\u01a3"+
		"\u01a2\3\2\2\2\u01a4#\3\2\2\2\u01a5\u01a6\7\u0083\2\2\u01a6%\3\2\2\2\u01a7"+
		"\u01a8\7\u0083\2\2\u01a8\'\3\2\2\2\u01a9\u01aa\7\u0083\2\2\u01aa)\3\2"+
		"\2\2\u01ab\u01ac\7\u0083\2\2\u01ac+\3\2\2\2\u01ad\u01b1\7M\2\2\u01ae\u01b0"+
		"\5.\30\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01bf\7N"+
		"\2\2\u01b5\u01b7\7M\2\2\u01b6\u01b8\5.\30\2\u01b7\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bc\5,\27\2\u01bc\u01bd\7N\2\2\u01bd\u01bf\3\2\2\2\u01be"+
		"\u01ad\3\2\2\2\u01be\u01b5\3\2\2\2\u01bf-\3\2\2\2\u01c0\u01c2\5\60\31"+
		"\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c5"+
		"\5\u0098M\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c4\3\2\2"+
		"\2\u01c6\u01c7\3\2\2\2\u01c7/\3\2\2\2\u01c8\u01c9\t\3\2\2\u01c9\61\3\2"+
		"\2\2\u01ca\u01cf\5\u008aF\2\u01cb\u01cf\5\64\33\2\u01cc\u01cf\5\66\34"+
		"\2\u01cd\u01cf\5\34\17\2\u01ce\u01ca\3\2\2\2\u01ce\u01cb\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\63\3\2\2\2\u01d2\u01d3\7e\2\2\u01d3\u01d4"+
		"\58\35\2\u01d4\65\3\2\2\2\u01d5\u01d6\7f\2\2\u01d6\u01d7\58\35\2\u01d7"+
		"\67\3\2\2\2\u01d8\u01da\5H%\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2"+
		"\u01da\u01db\3\2\2\2\u01db\u01dc\5B\"\2\u01dc\u01dd\7Q\2\2\u01dd9\3\2"+
		"\2\2\u01de\u01e4\5\u0088E\2\u01df\u01e4\5\u008aF\2\u01e0\u01e4\5<\37\2"+
		"\u01e1\u01e4\5> \2\u01e2\u01e4\5J&\2\u01e3\u01de\3\2\2\2\u01e3\u01df\3"+
		"\2\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6;\3\2\2\2"+
		"\u01e7\u01e8\7e\2\2\u01e8\u01e9\5@!\2\u01e9=\3\2\2\2\u01ea\u01eb\7f\2"+
		"\2\u01eb\u01ec\5@!\2\u01ec?\3\2\2\2\u01ed\u01ef\5H%\2\u01ee\u01ed\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\5B\"\2\u01f1"+
		"\u01f3\5\u0092J\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5"+
		"\3\2\2\2\u01f4\u01f6\7Q\2\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01f8\5\u00c2b\2\u01f8A\3\2\2\2\u01f9\u0203\5F$\2"+
		"\u01fa\u01fc\5D#\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb"+
		"\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u0201\5\u00aeX"+
		"\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u01f9"+
		"\3\2\2\2\u0202\u01fb\3\2\2\2\u0203C\3\2\2\2\u0204\u0206\5F$\2\u0205\u0204"+
		"\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020b\7\\\2\2\u0208"+
		"\u020a\5H%\2\u0209\u0208\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2"+
		"\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f"+
		"\7\u0083\2\2\u020fE\3\2\2\2\u0210\u0211\7\u0083\2\2\u0211G\3\2\2\2\u0212"+
		"\u0213\7K\2\2\u0213\u0214\5\u00b4[\2\u0214\u0215\7L\2\2\u0215I\3\2\2\2"+
		"\u0216\u0217\7\30\2\2\u0217\u0218\5L\'\2\u0218\u0219\7Q\2\2\u0219\u021f"+
		"\3\2\2\2\u021a\u021b\7\t\2\2\u021b\u021c\5L\'\2\u021c\u021d\7Q\2\2\u021d"+
		"\u021f\3\2\2\2\u021e\u0216\3\2\2\2\u021e\u021a\3\2\2\2\u021fK\3\2\2\2"+
		"\u0220\u0225\5N(\2\u0221\u0222\7R\2\2\u0222\u0224\5N(\2\u0223\u0221\3"+
		"\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"M\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u022d\7\u0083\2\2\u0229\u022a\7\u0083"+
		"\2\2\u022a\u022b\7V\2\2\u022b\u022d\7\u0083\2\2\u022c\u0228\3\2\2\2\u022c"+
		"\u0229\3\2\2\2\u022dO\3\2\2\2\u022e\u022f\5T+\2\u022f\u0230\7K\2\2\u0230"+
		"\u0232\7k\2\2\u0231\u0233\5T+\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2"+
		"\2\u0233\u0234\3\2\2\2\u0234\u0236\7L\2\2\u0235\u0237\5d\63\2\u0236\u0235"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237Q\3\2\2\2\u0238\u023a\7X\2\2\u0239\u023b"+
		"\5T+\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0240\3\2\2\2\u023c"+
		"\u023d\7R\2\2\u023d\u023f\5T+\2\u023e\u023c\3\2\2\2\u023f\u0242\3\2\2"+
		"\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0240"+
		"\3\2\2\2\u0243\u0244\7W\2\2\u0244S\3\2\2\2\u0245\u025e\7D\2\2\u0246\u025e"+
		"\7$\2\2\u0247\u025e\7;\2\2\u0248\u025e\7\65\2\2\u0249\u025e\7\66\2\2\u024a"+
		"\u025e\7-\2\2\u024b\u025e\7)\2\2\u024c\u025e\7<\2\2\u024d\u025e\7C\2\2"+
		"\u024e\u025e\7\63\2\2\u024f\u0251\7/\2\2\u0250\u0252\5\30\r\2\u0251\u0250"+
		"\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u025e\3\2\2\2\u0253\u0256\5$\23\2\u0254"+
		"\u0257\5\30\r\2\u0255\u0257\5R*\2\u0256\u0254\3\2\2\2\u0256\u0255\3\2"+
		"\2\2\u0256\u0257\3\2\2\2\u0257\u025e\3\2\2\2\u0258\u025e\5\u0096L\2\u0259"+
		"\u025e\5\u00a0Q\2\u025a\u025e\7\u0083\2\2\u025b\u025c\7\u0083\2\2\u025c"+
		"\u025e\5\u00a6T\2\u025d\u0245\3\2\2\2\u025d\u0246\3\2\2\2\u025d\u0247"+
		"\3\2\2\2\u025d\u0248\3\2\2\2\u025d\u0249\3\2\2\2\u025d\u024a\3\2\2\2\u025d"+
		"\u024b\3\2\2\2\u025d\u024c\3\2\2\2\u025d\u024d\3\2\2\2\u025d\u024e\3\2"+
		"\2\2\u025d\u024f\3\2\2\2\u025d\u0253\3\2\2\2\u025d\u0258\3\2\2\2\u025d"+
		"\u0259\3\2\2\2\u025d\u025a\3\2\2\2\u025d\u025b\3\2\2\2\u025eU\3\2\2\2"+
		"\u025f\u0263\7%\2\2\u0260\u0263\7E\2\2\u0261\u0263\5X-\2\u0262\u025f\3"+
		"\2\2\2\u0262\u0260\3\2\2\2\u0262\u0261\3\2\2\2\u0263W\3\2\2\2\u0264\u0265"+
		"\t\4\2\2\u0265Y\3\2\2\2\u0266\u027a\7\u0083\2\2\u0267\u027a\5\u00fe\u0080"+
		"\2\u0268\u027a\7\u0085\2\2\u0269\u026a\7K\2\2\u026a\u026b\5\u00d2j\2\u026b"+
		"\u026c\7L\2\2\u026c\u027a\3\2\2\2\u026d\u027a\7\34\2\2\u026e\u027a\7\33"+
		"\2\2\u026f\u027a\5h\65\2\u0270\u027a\5p9\2\u0271\u027a\5t;\2\u0272\u027a"+
		"\5v<\2\u0273\u027a\5^\60\2\u0274\u027a\5`\61\2\u0275\u027a\5b\62\2\u0276"+
		"\u027a\5f\64\2\u0277\u027a\7\4\2\2\u0278\u027a\7\3\2\2\u0279\u0266\3\2"+
		"\2\2\u0279\u0267\3\2\2\2\u0279\u0268\3\2\2\2\u0279\u0269\3\2\2\2\u0279"+
		"\u026d\3\2\2\2\u0279\u026e\3\2\2\2\u0279\u026f\3\2\2\2\u0279\u0270\3\2"+
		"\2\2\u0279\u0271\3\2\2\2\u0279\u0272\3\2\2\2\u0279\u0273\3\2\2\2\u0279"+
		"\u0274\3\2\2\2\u0279\u0275\3\2\2\2\u0279\u0276\3\2\2\2\u0279\u0277\3\2"+
		"\2\2\u0279\u0278\3\2\2\2\u027a[\3\2\2\2\u027b\u027c\5\u00f6|\2\u027c\u027d"+
		"\7\\\2\2\u027d\u027e\5\u00f6|\2\u027e]\3\2\2\2\u027f\u0280\7U\2\2\u0280"+
		"\u0282\7M\2\2\u0281\u0283\5\\/\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2"+
		"\2\u0283\u0288\3\2\2\2\u0284\u0285\7R\2\2\u0285\u0287\5\\/\2\u0286\u0284"+
		"\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028d\7R\2\2\u028c\u028b\3\2"+
		"\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\7N\2\2\u028f"+
		"_\3\2\2\2\u0290\u0291\7U\2\2\u0291\u0293\7O\2\2\u0292\u0294\5\u00f6|\2"+
		"\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0299\3\2\2\2\u0295\u0296"+
		"\7R\2\2\u0296\u0298\5\u00f6|\2\u0297\u0295\3\2\2\2\u0298\u029b\3\2\2\2"+
		"\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299"+
		"\3\2\2\2\u029c\u029e\7R\2\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u02a0\7P\2\2\u02a0a\3\2\2\2\u02a1\u02a2\7U\2\2\u02a2"+
		"\u02a3\7K\2\2\u02a3\u02a4\5\u00d8m\2\u02a4\u02a5\7L\2\2\u02a5\u02a9\3"+
		"\2\2\2\u02a6\u02a7\7U\2\2\u02a7\u02a9\5\u00fe\u0080\2\u02a8\u02a1\3\2"+
		"\2\2\u02a8\u02a6\3\2\2\2\u02a9c\3\2\2\2\u02aa\u02ae\7K\2\2\u02ab\u02af"+
		"\5x=\2\u02ac\u02af\5\u00b4[\2\u02ad\u02af\7D\2\2\u02ae\u02ab\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b7\3\2"+
		"\2\2\u02b0\u02b3\7R\2\2\u02b1\u02b4\5x=\2\u02b2\u02b4\5\u00b4[\2\u02b3"+
		"\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b0\3\2"+
		"\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u02ba\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\7L\2\2\u02bbe\3\2\2\2\u02bc"+
		"\u02be\7k\2\2\u02bd\u02bf\5T+\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2"+
		"\2\u02bf\u02c1\3\2\2\2\u02c0\u02c2\5d\63\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2"+
		"\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\5\u00c2b\2\u02c4g\3\2\2\2\u02c5"+
		"\u02c6\7O\2\2\u02c6\u02c7\5j\66\2\u02c7\u02c8\5l\67\2\u02c8\u02c9\7P\2"+
		"\2\u02c9i\3\2\2\2\u02ca\u02ce\5\u00d2j\2\u02cb\u02ce\5$\23\2\u02cc\u02ce"+
		"\7\33\2\2\u02cd\u02ca\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02cc\3\2\2\2"+
		"\u02cek\3\2\2\2\u02cf\u02d6\5F$\2\u02d0\u02d2\5n8\2\u02d1\u02d0\3\2\2"+
		"\2\u02d2\u02d3\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6"+
		"\3\2\2\2\u02d5\u02cf\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d6m\3\2\2\2\u02d7"+
		"\u02d9\5F$\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2"+
		"\2\u02da\u02db\7\\\2\2\u02db\u02dc\5\u00d2j\2\u02dco\3\2\2\2\u02dd\u02de"+
		"\7\26\2\2\u02de\u02df\7K\2\2\u02df\u02e0\5r:\2\u02e0\u02e1\7L\2\2\u02e1"+
		"q\3\2\2\2\u02e2\u02ec\5F$\2\u02e3\u02e5\5F$\2\u02e4\u02e3\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\7\\\2\2\u02e7\u02e4\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02ec\3\2\2\2\u02eb\u02e2\3\2\2\2\u02eb\u02e7\3\2\2\2\u02ecs\3\2\2\2"+
		"\u02ed\u02ee\7\20\2\2\u02ee\u02ef\7K\2\2\u02ef\u02f0\5*\26\2\u02f0\u02f1"+
		"\7L\2\2\u02f1u\3\2\2\2\u02f2\u02f3\7\n\2\2\u02f3\u02f4\7K\2\2\u02f4\u02f5"+
		"\5\u00b4[\2\u02f5\u02f6\7L\2\2\u02f6w\3\2\2\2\u02f7\u02f8\5\u008cG\2\u02f8"+
		"\u02f9\5\u00a8U\2\u02f9y\3\2\2\2\u02fa\u02fb\7\32\2\2\u02fb\u02fc\5\u00c2"+
		"b\2\u02fc{\3\2\2\2\u02fd\u02fe\7\7\2\2\u02fe\u02ff\7K\2\2\u02ff\u0300"+
		"\5x=\2\u0300\u0301\7L\2\2\u0301\u0302\5\u00c2b\2\u0302}\3\2\2\2\u0303"+
		"\u0304\7\f\2\2\u0304\u0305\5\u00c2b\2\u0305\177\3\2\2\2\u0306\u0307\7"+
		"\31\2\2\u0307\u0308\7K\2\2\u0308\u0309\7\u0083\2\2\u0309\u030a\7L\2\2"+
		"\u030a\u0081\3\2\2\2\u030b\u030f\5z>\2\u030c\u030e\5|?\2\u030d\u030c\3"+
		"\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0314\5~@\2\u0313\u0312\3\2\2"+
		"\2\u0313\u0314\3\2\2\2\u0314\u0083\3\2\2\2\u0315\u0316\7\27\2\2\u0316"+
		"\u0317\7K\2\2\u0317\u0318\5Z.\2\u0318\u0319\7L\2\2\u0319\u031a\5\u00c2"+
		"b\2\u031a\u0085\3\2\2\2\u031b\u031c\7\6\2\2\u031c\u031d\5\u00c2b\2\u031d"+
		"\u0087\3\2\2\2\u031e\u0320\5\u008cG\2\u031f\u031e\3\2\2\2\u031f\u0320"+
		"\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\5\u00a8U\2\u0322\u0323\5\u00c2"+
		"b\2\u0323\u0089\3\2\2\2\u0324\u0325\5\u008cG\2\u0325\u0326\5\u0092J\2"+
		"\u0326\u0327\7Q\2\2\u0327\u008b\3\2\2\2\u0328\u032d\5\u008eH\2\u0329\u032d"+
		"\5\u0090I\2\u032a\u032d\5T+\2\u032b\u032d\5V,\2\u032c\u0328\3\2\2\2\u032c"+
		"\u0329\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032b\3\2\2\2\u032d\u032e\3\2"+
		"\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u008d\3\2\2\2\u0330"+
		"\u0331\t\5\2\2\u0331\u008f\3\2\2\2\u0332\u0333\t\6\2\2\u0333\u0091\3\2"+
		"\2\2\u0334\u0339\5\u0094K\2\u0335\u0336\7R\2\2\u0336\u0338\5\u0094K\2"+
		"\u0337\u0335\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a"+
		"\3\2\2\2\u033a\u0093\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u033f\5\u00a8U"+
		"\2\u033d\u033e\7V\2\2\u033e\u0340\5\u00b2Z\2\u033f\u033d\3\2\2\2\u033f"+
		"\u0340\3\2\2\2\u0340\u0095\3\2\2\2\u0341\u034e\t\7\2\2\u0342\u034f\7\u0083"+
		"\2\2\u0343\u0345\7\u0083\2\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345"+
		"\u0346\3\2\2\2\u0346\u0348\7M\2\2\u0347\u0349\5\u0098M\2\u0348\u0347\3"+
		"\2\2\2\u0349\u034a\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034d\7N\2\2\u034d\u034f\3\2\2\2\u034e\u0342\3\2"+
		"\2\2\u034e\u0344\3\2\2\2\u034f\u0097\3\2\2\2\u0350\u0351\5\u009aN\2\u0351"+
		"\u0352\5\u009cO\2\u0352\u0353\7Q\2\2\u0353\u0099\3\2\2\2\u0354\u0358\5"+
		"\u008eH\2\u0355\u0358\5T+\2\u0356\u0358\5V,\2\u0357\u0354\3\2\2\2\u0357"+
		"\u0355\3\2\2\2\u0357\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u0357\3\2"+
		"\2\2\u0359\u035a\3\2\2\2\u035a\u009b\3\2\2\2\u035b\u0360\5\u009eP\2\u035c"+
		"\u035d\7R\2\2\u035d\u035f\5\u009eP\2\u035e\u035c\3\2\2\2\u035f\u0362\3"+
		"\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u009d\3\2\2\2\u0362"+
		"\u0360\3\2\2\2\u0363\u036a\5\u00a8U\2\u0364\u0366\5\u00a8U\2\u0365\u0364"+
		"\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\7\\\2\2\u0368"+
		"\u036a\5\u00fe\u0080\2\u0369\u0363\3\2\2\2\u0369\u0365\3\2\2\2\u036a\u009f"+
		"\3\2\2\2\u036b\u036e\7+\2\2\u036c\u036d\7\\\2\2\u036d\u036f\5\u00b4[\2"+
		"\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u037b\3\2\2\2\u0370\u0375"+
		"\5\u00fc\177\2\u0371\u0372\7M\2\2\u0372\u0373\5\u00a2R\2\u0373\u0374\7"+
		"N\2\2\u0374\u0376\3\2\2\2\u0375\u0371\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u037c\3\2\2\2\u0377\u0378\7M\2\2\u0378\u0379\5\u00a2R\2\u0379\u037a\7"+
		"N\2\2\u037a\u037c\3\2\2\2\u037b\u0370\3\2\2\2\u037b\u0377\3\2\2\2\u037c"+
		"\u0392\3\2\2\2\u037d\u037e\7G\2\2\u037e\u037f\7K\2\2\u037f\u0380\5\u00b4"+
		"[\2\u0380\u0381\7R\2\2\u0381\u0382\5\u00fc\177\2\u0382\u0383\7L\2\2\u0383"+
		"\u0384\7M\2\2\u0384\u0385\5\u00a2R\2\u0385\u0386\7N\2\2\u0386\u0392\3"+
		"\2\2\2\u0387\u0388\7H\2\2\u0388\u0389\7K\2\2\u0389\u038a\5\u00b4[\2\u038a"+
		"\u038b\7R\2\2\u038b\u038c\5\u00fc\177\2\u038c\u038d\7L\2\2\u038d\u038e"+
		"\7M\2\2\u038e\u038f\5\u00a2R\2\u038f\u0390\7N\2\2\u0390\u0392\3\2\2\2"+
		"\u0391\u036b\3\2\2\2\u0391\u037d\3\2\2\2\u0391\u0387\3\2\2\2\u0392\u00a1"+
		"\3\2\2\2\u0393\u0398\5\u00a4S\2\u0394\u0395\7R\2\2\u0395\u0397\5\u00a4"+
		"S\2\u0396\u0394\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u0396\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039b\u039d\7R"+
		"\2\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u00a3\3\2\2\2\u039e"+
		"\u03a1\5\u00fc\177\2\u039f\u03a0\7V\2\2\u03a0\u03a2\5\u00dan\2\u03a1\u039f"+
		"\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u00a5\3\2\2\2\u03a3\u03a5\7g\2\2\u03a4"+
		"\u03a6\5\u008cG\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03ad"+
		"\3\2\2\2\u03a7\u03a9\7g\2\2\u03a8\u03aa\5\u008cG\2\u03a9\u03a8\3\2\2\2"+
		"\u03a9\u03aa\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ad\5\u00a6T\2\u03ac"+
		"\u03a3\3\2\2\2\u03ac\u03a7\3\2\2\2\u03ad\u00a7\3\2\2\2\u03ae\u03b0\5\u00a6"+
		"T\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1"+
		"\u03b2\5\u00aaV\2\u03b2\u00a9\3\2\2\2\u03b3\u03b7\5\u00fc\177\2\u03b4"+
		"\u03b6\5\u00acW\2\u03b5\u03b4\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5"+
		"\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03c7\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba"+
		"\u03bb\7K\2\2\u03bb\u03bc\5\u00a8U\2\u03bc\u03bd\7L\2\2\u03bd\u03be\5"+
		"\u00acW\2\u03be\u03c7\3\2\2\2\u03bf\u03c0\7K\2\2\u03c0\u03c2\7k\2\2\u03c1"+
		"\u03c3\5\u00fc\177\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4"+
		"\3\2\2\2\u03c4\u03c5\7L\2\2\u03c5\u03c7\5d\63\2\u03c6\u03b3\3\2\2\2\u03c6"+
		"\u03ba\3\2\2\2\u03c6\u03bf\3\2\2\2\u03c7\u00ab\3\2\2\2\u03c8\u03ca\7O"+
		"\2\2\u03c9\u03cb\5\u00dan\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03d3\7P\2\2\u03cd\u03cf\7K\2\2\u03ce\u03d0\5\u00ae"+
		"X\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d3\7L\2\2\u03d2\u03c8\3\2\2\2\u03d2\u03cd\3\2\2\2\u03d3\u00ad\3\2"+
		"\2\2\u03d4\u03d7\5\u00ba^\2\u03d5\u03d6\7R\2\2\u03d6\u03d8\7y\2\2\u03d7"+
		"\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u00af\3\2\2\2\u03d9\u03da\5\u008c"+
		"G\2\u03da\u03db\5\u00a8U\2\u03db\u00b1\3\2\2\2\u03dc\u03ec\5\u00d4k\2"+
		"\u03dd\u03de\7M\2\2\u03de\u03e3\5\u00b2Z\2\u03df\u03e0\7R\2\2\u03e0\u03e2"+
		"\5\u00b2Z\2\u03e1\u03df\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2"+
		"\2\u03e3\u03e4\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03e8"+
		"\7R\2\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9"+
		"\u03ea\7N\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03dc\3\2\2\2\u03eb\u03dd\3\2"+
		"\2\2\u03ec\u00b3\3\2\2\2\u03ed\u03ee\5\u009aN\2\u03ee\u03ef\5\u00b6\\"+
		"\2\u03ef\u03f2\3\2\2\2\u03f0\u03f2\5P)\2\u03f1\u03ed\3\2\2\2\u03f1\u03f0"+
		"\3\2\2\2\u03f2\u00b5\3\2\2\2\u03f3\u03f4\5\u00a6T\2\u03f4\u03f5\5\u00b6"+
		"\\\2\u03f5\u0409\3\2\2\2\u03f6\u03f7\7K\2\2\u03f7\u03f8\5\u00b6\\\2\u03f8"+
		"\u03fa\7L\2\2\u03f9\u03fb\5\u00b8]\2\u03fa\u03f9\3\2\2\2\u03fb\u03fc\3"+
		"\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0409\3\2\2\2\u03fe"+
		"\u0400\7O\2\2\u03ff\u0401\5\u00dan\2\u0400\u03ff\3\2\2\2\u0400\u0401\3"+
		"\2\2\2\u0401\u0402\3\2\2\2\u0402\u0404\7P\2\2\u0403\u03fe\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0409\3\2"+
		"\2\2\u0407\u0409\3\2\2\2\u0408\u03f3\3\2\2\2\u0408\u03f6\3\2\2\2\u0408"+
		"\u0403\3\2\2\2\u0408\u0407\3\2\2\2\u0409\u00b7\3\2\2\2\u040a\u040c\7O"+
		"\2\2\u040b\u040d\5\u00dan\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d"+
		"\u040e\3\2\2\2\u040e\u0415\7P\2\2\u040f\u0411\7K\2\2\u0410\u0412\5\u00ba"+
		"^\2\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\3\2\2\2\u0413"+
		"\u0415\7L\2\2\u0414\u040a\3\2\2\2\u0414\u040f\3\2\2\2\u0415\u00b9\3\2"+
		"\2\2\u0416\u041b\5\u00b0Y\2\u0417\u0418\7R\2\2\u0418\u041a\5\u00b0Y\2"+
		"\u0419\u0417\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c"+
		"\3\2\2\2\u041c\u00bb\3\2\2\2\u041d\u041b\3\2\2\2\u041e\u0420\5\u00be`"+
		"\2\u041f\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422"+
		"\3\2\2\2\u0422\u00bd\3\2\2\2\u0423\u0430\5\u00c0a\2\u0424\u0425\5\u00d2"+
		"j\2\u0425\u0426\7Q\2\2\u0426\u0430\3\2\2\2\u0427\u0430\5\u00c2b\2\u0428"+
		"\u0430\5\u00c4c\2\u0429\u0430\5\u00ceh\2\u042a\u0430\5\u00d0i\2\u042b"+
		"\u0430\5\u0084C\2\u042c\u0430\5\u0086D\2\u042d\u0430\5\u0082B\2\u042e"+
		"\u0430\7Q\2\2\u042f\u0423\3\2\2\2\u042f\u0424\3\2\2\2\u042f\u0427\3\2"+
		"\2\2\u042f\u0428\3\2\2\2\u042f\u0429\3\2\2\2\u042f\u042a\3\2\2\2\u042f"+
		"\u042b\3\2\2\2\u042f\u042c\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u042e\3\2"+
		"\2\2\u0430\u00bf\3\2\2\2\u0431\u0432\5\u00fc\177\2\u0432\u0433\7\\\2\2"+
		"\u0433\u0434\5\u00be`\2\u0434\u043e\3\2\2\2\u0435\u0436\7#\2\2\u0436\u0437"+
		"\5\u00dan\2\u0437\u0438\7\\\2\2\u0438\u0439\5\u00be`\2\u0439\u043e\3\2"+
		"\2\2\u043a\u043b\7\'\2\2\u043b\u043c\7\\\2\2\u043c\u043e\5\u00be`\2\u043d"+
		"\u0431\3\2\2\2\u043d\u0435\3\2\2\2\u043d\u043a\3\2\2\2\u043e\u00c1\3\2"+
		"\2\2\u043f\u0444\7M\2\2\u0440\u0443\5\u008aF\2\u0441\u0443\5\u00bc_\2"+
		"\u0442\u0440\3\2\2\2\u0442\u0441\3\2\2\2\u0443\u0446\3\2\2\2\u0444\u0442"+
		"\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0447\3\2\2\2\u0446\u0444\3\2\2\2\u0447"+
		"\u0448\7N\2\2\u0448\u00c3\3\2\2\2\u0449\u044a\7\60\2\2\u044a\u044b\7K"+
		"\2\2\u044b\u044c\5\u00d2j\2\u044c\u044d\7L\2\2\u044d\u0450\5\u00be`\2"+
		"\u044e\u044f\7*\2\2\u044f\u0451\5\u00be`\2\u0450\u044e\3\2\2\2\u0450\u0451"+
		"\3\2\2\2\u0451\u0459\3\2\2\2\u0452\u0453\7@\2\2\u0453\u0454\7K\2\2\u0454"+
		"\u0455\5\u00d2j\2\u0455\u0456\7L\2\2\u0456\u0457\5\u00be`\2\u0457\u0459"+
		"\3\2\2\2\u0458\u0449\3\2\2\2\u0458\u0452\3\2\2\2\u0459\u00c5\3\2\2\2\u045a"+
		"\u045b\7.\2\2\u045b\u045c\7K\2\2\u045c\u045d\5x=\2\u045d\u045f\7\61\2"+
		"\2\u045e\u0460\5\u00d2j\2\u045f\u045e\3\2\2\2\u045f\u0460\3\2\2\2\u0460"+
		"\u0461\3\2\2\2\u0461\u0462\7L\2\2\u0462\u0463\5\u00be`\2\u0463\u00c7\3"+
		"\2\2\2\u0464\u0465\7.\2\2\u0465\u046a\7K\2\2\u0466\u0467\5\u008cG\2\u0467"+
		"\u0468\5\u0092J\2\u0468\u046b\3\2\2\2\u0469\u046b\5\u00d2j\2\u046a\u0466"+
		"\3\2\2\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\3\2\2\2\u046c"+
		"\u046e\7Q\2\2\u046d\u046f\5\u00d2j\2\u046e\u046d\3\2\2\2\u046e\u046f\3"+
		"\2\2\2\u046f\u0470\3\2\2\2\u0470\u0472\7Q\2\2\u0471\u0473\5\u00d2j\2\u0472"+
		"\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\7L"+
		"\2\2\u0475\u0476\5\u00be`\2\u0476\u00c9\3\2\2\2\u0477\u0478\7F\2\2\u0478"+
		"\u0479\7K\2\2\u0479\u047a\5\u00d2j\2\u047a\u047b\7L\2\2\u047b\u047c\5"+
		"\u00be`\2\u047c\u00cb\3\2\2\2\u047d\u047e\7(\2\2\u047e\u047f\5\u00be`"+
		"\2\u047f\u0480\7F\2\2\u0480\u0481\7K\2\2\u0481\u0482\5\u00d2j\2\u0482"+
		"\u0483\7L\2\2\u0483\u0484\7Q\2\2\u0484\u00cd\3\2\2\2\u0485\u048a\5\u00ca"+
		"f\2\u0486\u048a\5\u00ccg\2\u0487\u048a\5\u00c8e\2\u0488\u048a\5\u00c6"+
		"d\2\u0489\u0485\3\2\2\2\u0489\u0486\3\2\2\2\u0489\u0487\3\2\2\2\u0489"+
		"\u0488\3\2\2\2\u048a\u00cf\3\2\2\2\u048b\u048c\7\64\2\2\u048c\u048d\5"+
		"\u00fc\177\2\u048d\u048e\7Q\2\2\u048e\u0499\3\2\2\2\u048f\u0490\7&\2\2"+
		"\u0490\u0499\7Q\2\2\u0491\u0492\7 \2\2\u0492\u0499\7Q\2\2\u0493\u0495"+
		"\7:\2\2\u0494\u0496\5\u00d2j\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2\2"+
		"\u0496\u0497\3\2\2\2\u0497\u0499\7Q\2\2\u0498\u048b\3\2\2\2\u0498\u048f"+
		"\3\2\2\2\u0498\u0491\3\2\2\2\u0498\u0493\3\2\2\2\u0499\u00d1\3\2\2\2\u049a"+
		"\u049f\5\u00d4k\2\u049b\u049c\7R\2\2\u049c\u049e\5\u00d4k\2\u049d\u049b"+
		"\3\2\2\2\u049e\u04a1\3\2\2\2\u049f\u049d\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0"+
		"\u00d3\3\2\2\2\u04a1\u049f\3\2\2\2\u04a2\u04a8\5\u00d8m\2\u04a3\u04a4"+
		"\5\u00f2z\2\u04a4\u04a5\5\u00d6l\2\u04a5\u04a6\5\u00d4k\2\u04a6\u04a8"+
		"\3\2\2\2\u04a7\u04a2\3\2\2\2\u04a7\u04a3\3\2\2\2\u04a8\u00d5\3\2\2\2\u04a9"+
		"\u04aa\t\b\2\2\u04aa\u00d7\3\2\2\2\u04ab\u04b1\5\u00dco\2\u04ac\u04ad"+
		"\7[\2\2\u04ad\u04ae\5\u00d8m\2\u04ae\u04af\7\\\2\2\u04af\u04b0\5\u00d8"+
		"m\2\u04b0\u04b2\3\2\2\2\u04b1\u04ac\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2"+
		"\u00d9\3\2\2\2\u04b3\u04b4\5\u00d8m\2\u04b4\u00db\3\2\2\2\u04b5\u04ba"+
		"\5\u00dep\2\u04b6\u04b7\7b\2\2\u04b7\u04b9\5\u00dep\2\u04b8\u04b6\3\2"+
		"\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04b8\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb"+
		"\u00dd\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bd\u04c2\5\u00e0q\2\u04be\u04bf"+
		"\7a\2\2\u04bf\u04c1\5\u00e0q\2\u04c0\u04be\3\2\2\2\u04c1\u04c4\3\2\2\2"+
		"\u04c2\u04c0\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u00df\3\2\2\2\u04c4\u04c2"+
		"\3\2\2\2\u04c5\u04ca\5\u00e2r\2\u04c6\u04c7\7j\2\2\u04c7\u04c9\5\u00e2"+
		"r\2\u04c8\u04c6\3\2\2\2\u04c9\u04cc\3\2\2\2\u04ca\u04c8\3\2\2\2\u04ca"+
		"\u04cb\3\2\2\2\u04cb\u00e1\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cd\u04d2\5\u00e4"+
		"s\2\u04ce\u04cf\7k\2\2\u04cf\u04d1\5\u00e4s\2\u04d0\u04ce\3\2\2\2\u04d1"+
		"\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u00e3\3\2"+
		"\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04da\5\u00e6t\2\u04d6\u04d7\7i\2\2\u04d7"+
		"\u04d9\5\u00e6t\2\u04d8\u04d6\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da\u04d8"+
		"\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u00e5\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd"+
		"\u04e2\5\u00e8u\2\u04de\u04df\t\t\2\2\u04df\u04e1\5\u00e8u\2\u04e0\u04de"+
		"\3\2\2\2\u04e1\u04e4\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u00e7\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e5\u04ea\5\u00eav\2\u04e6\u04e7"+
		"\t\n\2\2\u04e7\u04e9\5\u00eav\2\u04e8\u04e6\3\2\2\2\u04e9\u04ec\3\2\2"+
		"\2\u04ea\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u00e9\3\2\2\2\u04ec\u04ea"+
		"\3\2\2\2\u04ed\u04f2\5\u00ecw\2\u04ee\u04ef\t\13\2\2\u04ef\u04f1\5\u00ec"+
		"w\2\u04f0\u04ee\3\2\2\2\u04f1\u04f4\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2"+
		"\u04f3\3\2\2\2\u04f3\u00eb\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f5\u04fa\5\u00ee"+
		"x\2\u04f6\u04f7\t\f\2\2\u04f7\u04f9\5\u00eex\2\u04f8\u04f6\3\2\2\2\u04f9"+
		"\u04fc\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u00ed\3\2"+
		"\2\2\u04fc\u04fa\3\2\2\2\u04fd\u0502\5\u00f0y\2\u04fe\u04ff\t\r\2\2\u04ff"+
		"\u0501\5\u00f0y\2\u0500\u04fe\3\2\2\2\u0501\u0504\3\2\2\2\u0502\u0500"+
		"\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u00ef\3\2\2\2\u0504\u0502\3\2\2\2\u0505"+
		"\u0506\7K\2\2\u0506\u0507\5\u00b4[\2\u0507\u0508\7L\2\2\u0508\u0509\5"+
		"\u00f0y\2\u0509\u050c\3\2\2\2\u050a\u050c\5\u00f2z\2\u050b\u0505\3\2\2"+
		"\2\u050b\u050a\3\2\2\2\u050c\u00f1\3\2\2\2\u050d\u051e\5\u00f6|\2\u050e"+
		"\u050f\7c\2\2\u050f\u051e\5\u00f2z\2\u0510\u0511\7d\2\2\u0511\u051e\5"+
		"\u00f2z\2\u0512\u0513\5\u00f4{\2\u0513\u0514\5\u00f0y\2\u0514\u051e\3"+
		"\2\2\2\u0515\u051b\7=\2\2\u0516\u0517\7K\2\2\u0517\u0518\5\u00b4[\2\u0518"+
		"\u0519\7L\2\2\u0519\u051c\3\2\2\2\u051a\u051c\5\u00f2z\2\u051b\u0516\3"+
		"\2\2\2\u051b\u051a\3\2\2\2\u051c\u051e\3\2\2\2\u051d\u050d\3\2\2\2\u051d"+
		"\u050e\3\2\2\2\u051d\u0510\3\2\2\2\u051d\u0512\3\2\2\2\u051d\u0515\3\2"+
		"\2\2\u051e\u00f3\3\2\2\2\u051f\u0520\t\16\2\2\u0520\u00f5\3\2\2\2\u0521"+
		"\u0532\5Z.\2\u0522\u0523\7O\2\2\u0523\u0524\5\u00d2j\2\u0524\u0525\7P"+
		"\2\2\u0525\u0531\3\2\2\2\u0526\u0527\7K\2\2\u0527\u0528\5\u00f8}\2\u0528"+
		"\u0529\7L\2\2\u0529\u0531\3\2\2\2\u052a\u052b\7S\2\2\u052b\u0531\5\u00fc"+
		"\177\2\u052c\u052d\7T\2\2\u052d\u0531\5\u00fc\177\2\u052e\u0531\7c\2\2"+
		"\u052f\u0531\7d\2\2\u0530\u0522\3\2\2\2\u0530\u0526\3\2\2\2\u0530\u052a"+
		"\3\2\2\2\u0530\u052c\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u052f\3\2\2\2\u0531"+
		"\u0534\3\2\2\2\u0532\u0530\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u00f7\3\2"+
		"\2\2\u0534\u0532\3\2\2\2\u0535\u0537\5\u00fa~\2\u0536\u0535\3\2\2\2\u0536"+
		"\u0537\3\2\2\2\u0537\u00f9\3\2\2\2\u0538\u053d\5\u00d4k\2\u0539\u053a"+
		"\7R\2\2\u053a\u053c\5\u00d4k\2\u053b\u0539\3\2\2\2\u053c\u053f\3\2\2\2"+
		"\u053d\u053b\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u00fb\3\2\2\2\u053f\u053d"+
		"\3\2\2\2\u0540\u0541\7\u0083\2\2\u0541\u00fd\3\2\2\2\u0542\u0543\t\17"+
		"\2\2\u0543\u00ff\3\2\2\2\u009a\u0103\u0113\u011b\u011e\u0121\u0124\u012c"+
		"\u0130\u0133\u0136\u013e\u0141\u0144\u014e\u0155\u0158\u015b\u015e\u0161"+
		"\u0172\u017e\u0183\u0190\u01a3\u01b1\u01b9\u01be\u01c1\u01c6\u01ce\u01d0"+
		"\u01d9\u01e3\u01e5\u01ee\u01f2\u01f5\u01fd\u0200\u0202\u0205\u020b\u021e"+
		"\u0225\u022c\u0232\u0236\u023a\u0240\u0251\u0256\u025d\u0262\u0279\u0282"+
		"\u0288\u028c\u0293\u0299\u029d\u02a8\u02ae\u02b3\u02b7\u02be\u02c1\u02cd"+
		"\u02d3\u02d5\u02d8\u02e4\u02e9\u02eb\u030f\u0313\u031f\u032c\u032e\u0339"+
		"\u033f\u0344\u034a\u034e\u0357\u0359\u0360\u0365\u0369\u036e\u0375\u037b"+
		"\u0391\u0398\u039c\u03a1\u03a5\u03a9\u03ac\u03af\u03b7\u03c2\u03c6\u03ca"+
		"\u03cf\u03d2\u03d7\u03e3\u03e7\u03eb\u03f1\u03fc\u0400\u0405\u0408\u040c"+
		"\u0411\u0414\u041b\u0421\u042f\u043d\u0442\u0444\u0450\u0458\u045f\u046a"+
		"\u046e\u0472\u0489\u0495\u0498\u049f\u04a7\u04b1\u04ba\u04c2\u04ca\u04d2"+
		"\u04da\u04e2\u04ea\u04f2\u04fa\u0502\u050b\u051b\u051d\u0530\u0532\u0536"+
		"\u053d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}