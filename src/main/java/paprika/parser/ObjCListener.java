// Generated from C:\Users\Sarra\IdeaProjects\artid2\src\main\antlr\ObjC.g4 by ANTLR 4.2.2
package paprika.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ObjCParser}.
 */
public interface ObjCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ObjCParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(@NotNull ObjCParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(@NotNull ObjCParser.Compound_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#category_name}.
	 * @param ctx the parse tree
	 */
	void enterCategory_name(@NotNull ObjCParser.Category_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#category_name}.
	 * @param ctx the parse tree
	 */
	void exitCategory_name(@NotNull ObjCParser.Category_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#block_type}.
	 * @param ctx the parse tree
	 */
	void enterBlock_type(@NotNull ObjCParser.Block_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#block_type}.
	 * @param ctx the parse tree
	 */
	void exitBlock_type(@NotNull ObjCParser.Block_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_expression(@NotNull ObjCParser.Array_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_expression(@NotNull ObjCParser.Array_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterDirect_declarator(@NotNull ObjCParser.Direct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitDirect_declarator(@NotNull ObjCParser.Direct_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(@NotNull ObjCParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(@NotNull ObjCParser.Postfix_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_synthesize_item}.
	 * @param ctx the parse tree
	 */
	void enterProperty_synthesize_item(@NotNull ObjCParser.Property_synthesize_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_synthesize_item}.
	 * @param ctx the parse tree
	 */
	void exitProperty_synthesize_item(@NotNull ObjCParser.Property_synthesize_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_implementation}.
	 * @param ctx the parse tree
	 */
	void enterClass_implementation(@NotNull ObjCParser.Class_implementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_implementation}.
	 * @param ctx the parse tree
	 */
	void exitClass_implementation(@NotNull ObjCParser.Class_implementationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#synchronized_statement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronized_statement(@NotNull ObjCParser.Synchronized_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#synchronized_statement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronized_statement(@NotNull ObjCParser.Synchronized_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(@NotNull ObjCParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(@NotNull ObjCParser.Logical_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(@NotNull ObjCParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(@NotNull ObjCParser.Iteration_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_reference_list}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_reference_list(@NotNull ObjCParser.Protocol_reference_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_reference_list}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_reference_list(@NotNull ObjCParser.Protocol_reference_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_declarator(@NotNull ObjCParser.Abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_declarator(@NotNull ObjCParser.Abstract_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull ObjCParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull ObjCParser.While_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_attributes_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_attributes_declaration(@NotNull ObjCParser.Property_attributes_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_attributes_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_attributes_declaration(@NotNull ObjCParser.Property_attributes_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(@NotNull ObjCParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(@NotNull ObjCParser.Assignment_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(@NotNull ObjCParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(@NotNull ObjCParser.Primary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#autorelease_statement}.
	 * @param ctx the parse tree
	 */
	void enterAutorelease_statement(@NotNull ObjCParser.Autorelease_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#autorelease_statement}.
	 * @param ctx the parse tree
	 */
	void exitAutorelease_statement(@NotNull ObjCParser.Autorelease_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull ObjCParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull ObjCParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(@NotNull ObjCParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(@NotNull ObjCParser.PointerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(@NotNull ObjCParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(@NotNull ObjCParser.ReceiverContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_declaration(@NotNull ObjCParser.Protocol_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_declaration(@NotNull ObjCParser.Protocol_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_list(@NotNull ObjCParser.Enumerator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_list(@NotNull ObjCParser.Enumerator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#keyword_argument}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_argument(@NotNull ObjCParser.Keyword_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#keyword_argument}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_argument(@NotNull ObjCParser.Keyword_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#instance_variables}.
	 * @param ctx the parse tree
	 */
	void enterInstance_variables(@NotNull ObjCParser.Instance_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#instance_variables}.
	 * @param ctx the parse tree
	 */
	void exitInstance_variables(@NotNull ObjCParser.Instance_variablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#instance_method_definition}.
	 * @param ctx the parse tree
	 */
	void enterInstance_method_definition(@NotNull ObjCParser.Instance_method_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#instance_method_definition}.
	 * @param ctx the parse tree
	 */
	void exitInstance_method_definition(@NotNull ObjCParser.Instance_method_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(@NotNull ObjCParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(@NotNull ObjCParser.Exclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#type_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterType_variable_declarator(@NotNull ObjCParser.Type_variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#type_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitType_variable_declarator(@NotNull ObjCParser.Type_variable_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifiers(@NotNull ObjCParser.Declaration_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifiers(@NotNull ObjCParser.Declaration_specifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_in_statement(@NotNull ObjCParser.For_in_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_in_statement(@NotNull ObjCParser.For_in_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#category_implementation}.
	 * @param ctx the parse tree
	 */
	void enterCategory_implementation(@NotNull ObjCParser.Category_implementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#category_implementation}.
	 * @param ctx the parse tree
	 */
	void exitCategory_implementation(@NotNull ObjCParser.Category_implementationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#instance_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInstance_method_declaration(@NotNull ObjCParser.Instance_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#instance_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInstance_method_declaration(@NotNull ObjCParser.Instance_method_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#message_expression}.
	 * @param ctx the parse tree
	 */
	void enterMessage_expression(@NotNull ObjCParser.Message_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#message_expression}.
	 * @param ctx the parse tree
	 */
	void exitMessage_expression(@NotNull ObjCParser.Message_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_declaration_list(@NotNull ObjCParser.Protocol_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_declaration_list(@NotNull ObjCParser.Protocol_declaration_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatch_statement(@NotNull ObjCParser.Catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatch_statement(@NotNull ObjCParser.Catch_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(@NotNull ObjCParser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(@NotNull ObjCParser.Do_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#dictionary_pair}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_pair(@NotNull ObjCParser.Dictionary_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#dictionary_pair}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_pair(@NotNull ObjCParser.Dictionary_pairContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator_list(@NotNull ObjCParser.Struct_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator_list(@NotNull ObjCParser.Struct_declarator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(@NotNull ObjCParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(@NotNull ObjCParser.Inclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(@NotNull ObjCParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(@NotNull ObjCParser.Conditional_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void enterSpecifier_qualifier_list(@NotNull ObjCParser.Specifier_qualifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void exitSpecifier_qualifier_list(@NotNull ObjCParser.Specifier_qualifier_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#box_expression}.
	 * @param ctx the parse tree
	 */
	void enterBox_expression(@NotNull ObjCParser.Box_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#box_expression}.
	 * @param ctx the parse tree
	 */
	void exitBox_expression(@NotNull ObjCParser.Box_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#selector_name}.
	 * @param ctx the parse tree
	 */
	void enterSelector_name(@NotNull ObjCParser.Selector_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#selector_name}.
	 * @param ctx the parse tree
	 */
	void exitSelector_name(@NotNull ObjCParser.Selector_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_expression}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_expression(@NotNull ObjCParser.Protocol_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_expression}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_expression(@NotNull ObjCParser.Protocol_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(@NotNull ObjCParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(@NotNull ObjCParser.Shift_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(@NotNull ObjCParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(@NotNull ObjCParser.Class_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator_suffix(@NotNull ObjCParser.Declarator_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator_suffix(@NotNull ObjCParser.Declarator_suffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(@NotNull ObjCParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(@NotNull ObjCParser.Statement_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExternal_declaration(@NotNull ObjCParser.External_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExternal_declaration(@NotNull ObjCParser.External_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_implementation}.
	 * @param ctx the parse tree
	 */
	void enterProperty_implementation(@NotNull ObjCParser.Property_implementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_implementation}.
	 * @param ctx the parse tree
	 */
	void exitProperty_implementation(@NotNull ObjCParser.Property_implementationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(@NotNull ObjCParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(@NotNull ObjCParser.Try_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ObjCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ObjCParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#visibility_specification}.
	 * @param ctx the parse tree
	 */
	void enterVisibility_specification(@NotNull ObjCParser.Visibility_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#visibility_specification}.
	 * @param ctx the parse tree
	 */
	void exitVisibility_specification(@NotNull ObjCParser.Visibility_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#dictionary_expression}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_expression(@NotNull ObjCParser.Dictionary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#dictionary_expression}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_expression(@NotNull ObjCParser.Dictionary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(@NotNull ObjCParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(@NotNull ObjCParser.Type_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#method_type}.
	 * @param ctx the parse tree
	 */
	void enterMethod_type(@NotNull ObjCParser.Method_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#method_type}.
	 * @param ctx the parse tree
	 */
	void exitMethod_type(@NotNull ObjCParser.Method_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(@NotNull ObjCParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(@NotNull ObjCParser.Parameter_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull ObjCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull ObjCParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#block_parameters}.
	 * @param ctx the parse tree
	 */
	void enterBlock_parameters(@NotNull ObjCParser.Block_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#block_parameters}.
	 * @param ctx the parse tree
	 */
	void exitBlock_parameters(@NotNull ObjCParser.Block_parametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull ObjCParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull ObjCParser.InitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull ObjCParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull ObjCParser.For_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#superclass_name}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_name(@NotNull ObjCParser.Superclass_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#superclass_name}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_name(@NotNull ObjCParser.Superclass_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#method_definition}.
	 * @param ctx the parse tree
	 */
	void enterMethod_definition(@NotNull ObjCParser.Method_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#method_definition}.
	 * @param ctx the parse tree
	 */
	void exitMethod_definition(@NotNull ObjCParser.Method_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_class_specifier(@NotNull ObjCParser.Storage_class_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_class_specifier(@NotNull ObjCParser.Storage_class_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(@NotNull ObjCParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(@NotNull ObjCParser.Throw_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(@NotNull ObjCParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(@NotNull ObjCParser.Relational_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(@NotNull ObjCParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(@NotNull ObjCParser.Argument_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(@NotNull ObjCParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(@NotNull ObjCParser.Cast_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#arc_behaviour_specifier}.
	 * @param ctx the parse tree
	 */
	void enterArc_behaviour_specifier(@NotNull ObjCParser.Arc_behaviour_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#arc_behaviour_specifier}.
	 * @param ctx the parse tree
	 */
	void exitArc_behaviour_specifier(@NotNull ObjCParser.Arc_behaviour_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull ObjCParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull ObjCParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration_list(@NotNull ObjCParser.Parameter_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration_list(@NotNull ObjCParser.Parameter_declaration_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull ObjCParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull ObjCParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator(@NotNull ObjCParser.Init_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator(@NotNull ObjCParser.Init_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(@NotNull ObjCParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(@NotNull ObjCParser.Unary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#instance_struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInstance_struct_declaration(@NotNull ObjCParser.Instance_struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#instance_struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInstance_struct_declaration(@NotNull ObjCParser.Instance_struct_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull ObjCParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull ObjCParser.And_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelector_expression(@NotNull ObjCParser.Selector_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelector_expression(@NotNull ObjCParser.Selector_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(@NotNull ObjCParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(@NotNull ObjCParser.Additive_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_qualifier(@NotNull ObjCParser.Protocol_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_qualifier(@NotNull ObjCParser.Protocol_qualifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_method_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_method_definition(@NotNull ObjCParser.Class_method_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_method_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_method_definition(@NotNull ObjCParser.Class_method_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_attribute}.
	 * @param ctx the parse tree
	 */
	void enterProperty_attribute(@NotNull ObjCParser.Property_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_attribute}.
	 * @param ctx the parse tree
	 */
	void exitProperty_attribute(@NotNull ObjCParser.Property_attributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum_specifier(@NotNull ObjCParser.Enum_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum_specifier(@NotNull ObjCParser.Enum_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(@NotNull ObjCParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(@NotNull ObjCParser.Multiplicative_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#generics_specifier}.
	 * @param ctx the parse tree
	 */
	void enterGenerics_specifier(@NotNull ObjCParser.Generics_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#generics_specifier}.
	 * @param ctx the parse tree
	 */
	void exitGenerics_specifier(@NotNull ObjCParser.Generics_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#implementation_definition_list}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_definition_list(@NotNull ObjCParser.Implementation_definition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#implementation_definition_list}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_definition_list(@NotNull ObjCParser.Implementation_definition_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull ObjCParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull ObjCParser.Unary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(@NotNull ObjCParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(@NotNull ObjCParser.Method_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_or_union_specifier(@NotNull ObjCParser.Struct_or_union_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_or_union_specifier(@NotNull ObjCParser.Struct_or_union_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_list}.
	 * @param ctx the parse tree
	 */
	void enterClass_list(@NotNull ObjCParser.Class_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_list}.
	 * @param ctx the parse tree
	 */
	void exitClass_list(@NotNull ObjCParser.Class_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#finally_statement}.
	 * @param ctx the parse tree
	 */
	void enterFinally_statement(@NotNull ObjCParser.Finally_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#finally_statement}.
	 * @param ctx the parse tree
	 */
	void exitFinally_statement(@NotNull ObjCParser.Finally_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#encode_expression}.
	 * @param ctx the parse tree
	 */
	void enterEncode_expression(@NotNull ObjCParser.Encode_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#encode_expression}.
	 * @param ctx the parse tree
	 */
	void exitEncode_expression(@NotNull ObjCParser.Encode_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration_list(@NotNull ObjCParser.Class_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration_list(@NotNull ObjCParser.Class_declaration_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator(@NotNull ObjCParser.Struct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator(@NotNull ObjCParser.Struct_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_synthesize_list}.
	 * @param ctx the parse tree
	 */
	void enterProperty_synthesize_list(@NotNull ObjCParser.Property_synthesize_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_synthesize_list}.
	 * @param ctx the parse tree
	 */
	void exitProperty_synthesize_list(@NotNull ObjCParser.Property_synthesize_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(@NotNull ObjCParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(@NotNull ObjCParser.Equality_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void enterMethod_selector(@NotNull ObjCParser.Method_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void exitMethod_selector(@NotNull ObjCParser.Method_selectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#try_block}.
	 * @param ctx the parse tree
	 */
	void enterTry_block(@NotNull ObjCParser.Try_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#try_block}.
	 * @param ctx the parse tree
	 */
	void exitTry_block(@NotNull ObjCParser.Try_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_list}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_list(@NotNull ObjCParser.Protocol_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_list}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_list(@NotNull ObjCParser.Protocol_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(@NotNull ObjCParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(@NotNull ObjCParser.Translation_unitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(@NotNull ObjCParser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(@NotNull ObjCParser.Init_declarator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_method_declaration(@NotNull ObjCParser.Class_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_method_declaration(@NotNull ObjCParser.Class_method_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#keyword_declarator}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_declarator(@NotNull ObjCParser.Keyword_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#keyword_declarator}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_declarator(@NotNull ObjCParser.Keyword_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#interface_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_declaration_list(@NotNull ObjCParser.Interface_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#interface_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_declaration_list(@NotNull ObjCParser.Interface_declaration_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(@NotNull ObjCParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(@NotNull ObjCParser.Selection_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(@NotNull ObjCParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(@NotNull ObjCParser.Constant_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ObjCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ObjCParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(@NotNull ObjCParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(@NotNull ObjCParser.SelectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(@NotNull ObjCParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(@NotNull ObjCParser.Type_qualifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(@NotNull ObjCParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(@NotNull ObjCParser.EnumeratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(@NotNull ObjCParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(@NotNull ObjCParser.Labeled_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_attributes_list}.
	 * @param ctx the parse tree
	 */
	void enterProperty_attributes_list(@NotNull ObjCParser.Property_attributes_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_attributes_list}.
	 * @param ctx the parse tree
	 */
	void exitProperty_attributes_list(@NotNull ObjCParser.Property_attributes_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#block_expression}.
	 * @param ctx the parse tree
	 */
	void enterBlock_expression(@NotNull ObjCParser.Block_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#block_expression}.
	 * @param ctx the parse tree
	 */
	void exitBlock_expression(@NotNull ObjCParser.Block_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#category_interface}.
	 * @param ctx the parse tree
	 */
	void enterCategory_interface(@NotNull ObjCParser.Category_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#category_interface}.
	 * @param ctx the parse tree
	 */
	void exitCategory_interface(@NotNull ObjCParser.Category_interfaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_interface}.
	 * @param ctx the parse tree
	 */
	void enterClass_interface(@NotNull ObjCParser.Class_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_interface}.
	 * @param ctx the parse tree
	 */
	void exitClass_interface(@NotNull ObjCParser.Class_interfaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration(@NotNull ObjCParser.Property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration(@NotNull ObjCParser.Property_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_expression_list(@NotNull ObjCParser.Argument_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_expression_list(@NotNull ObjCParser.Argument_expression_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(@NotNull ObjCParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(@NotNull ObjCParser.Assignment_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull ObjCParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull ObjCParser.DeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#message_selector}.
	 * @param ctx the parse tree
	 */
	void enterMessage_selector(@NotNull ObjCParser.Message_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#message_selector}.
	 * @param ctx the parse tree
	 */
	void exitMessage_selector(@NotNull ObjCParser.Message_selectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(@NotNull ObjCParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(@NotNull ObjCParser.Struct_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#abstract_declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_declarator_suffix(@NotNull ObjCParser.Abstract_declarator_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#abstract_declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_declarator_suffix(@NotNull ObjCParser.Abstract_declarator_suffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#preprocessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor_declaration(@NotNull ObjCParser.Preprocessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#preprocessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor_declaration(@NotNull ObjCParser.Preprocessor_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(@NotNull ObjCParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(@NotNull ObjCParser.Logical_and_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(@NotNull ObjCParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(@NotNull ObjCParser.Parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_name(@NotNull ObjCParser.Protocol_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_name(@NotNull ObjCParser.Protocol_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(@NotNull ObjCParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(@NotNull ObjCParser.Function_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ObjCParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(@NotNull ObjCParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(@NotNull ObjCParser.Jump_statementContext ctx);
}