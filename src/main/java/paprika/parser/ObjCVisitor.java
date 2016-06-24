// Generated from C:\Users\Sarra\IdeaProjects\artid2\src\main\antlr\ObjC.g4 by ANTLR 4.2.2
package paprika.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ObjCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ObjCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ObjCParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(@NotNull ObjCParser.Compound_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#category_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategory_name(@NotNull ObjCParser.Category_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#block_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_type(@NotNull ObjCParser.Block_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#array_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expression(@NotNull ObjCParser.Array_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#direct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_declarator(@NotNull ObjCParser.Direct_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expression(@NotNull ObjCParser.Postfix_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_synthesize_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_synthesize_item(@NotNull ObjCParser.Property_synthesize_itemContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_implementation(@NotNull ObjCParser.Class_implementationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#synchronized_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronized_statement(@NotNull ObjCParser.Synchronized_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expression(@NotNull ObjCParser.Logical_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(@NotNull ObjCParser.Iteration_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_reference_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_reference_list(@NotNull ObjCParser.Protocol_reference_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#abstract_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_declarator(@NotNull ObjCParser.Abstract_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull ObjCParser.While_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_attributes_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_attributes_declaration(@NotNull ObjCParser.Property_attributes_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(@NotNull ObjCParser.Assignment_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(@NotNull ObjCParser.Primary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#autorelease_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutorelease_statement(@NotNull ObjCParser.Autorelease_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull ObjCParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(@NotNull ObjCParser.PointerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(@NotNull ObjCParser.ReceiverContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_declaration(@NotNull ObjCParser.Protocol_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#enumerator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator_list(@NotNull ObjCParser.Enumerator_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#keyword_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_argument(@NotNull ObjCParser.Keyword_argumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#instance_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_variables(@NotNull ObjCParser.Instance_variablesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#instance_method_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_method_definition(@NotNull ObjCParser.Instance_method_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(@NotNull ObjCParser.Exclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#type_variable_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_variable_declarator(@NotNull ObjCParser.Type_variable_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifiers(@NotNull ObjCParser.Declaration_specifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#for_in_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in_statement(@NotNull ObjCParser.For_in_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#category_implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategory_implementation(@NotNull ObjCParser.Category_implementationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#instance_method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_method_declaration(@NotNull ObjCParser.Instance_method_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#message_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_expression(@NotNull ObjCParser.Message_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_declaration_list(@NotNull ObjCParser.Protocol_declaration_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_statement(@NotNull ObjCParser.Catch_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#do_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(@NotNull ObjCParser.Do_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#dictionary_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_pair(@NotNull ObjCParser.Dictionary_pairContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declarator_list(@NotNull ObjCParser.Struct_declarator_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(@NotNull ObjCParser.Inclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(@NotNull ObjCParser.Conditional_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifier_qualifier_list(@NotNull ObjCParser.Specifier_qualifier_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#box_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBox_expression(@NotNull ObjCParser.Box_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#selector_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_name(@NotNull ObjCParser.Selector_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_expression(@NotNull ObjCParser.Protocol_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(@NotNull ObjCParser.Shift_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(@NotNull ObjCParser.Class_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#declarator_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator_suffix(@NotNull ObjCParser.Declarator_suffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(@NotNull ObjCParser.Statement_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#external_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_declaration(@NotNull ObjCParser.External_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_implementation(@NotNull ObjCParser.Property_implementationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#try_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_statement(@NotNull ObjCParser.Try_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ObjCParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#visibility_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility_specification(@NotNull ObjCParser.Visibility_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#dictionary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_expression(@NotNull ObjCParser.Dictionary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(@NotNull ObjCParser.Type_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#method_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_type(@NotNull ObjCParser.Method_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(@NotNull ObjCParser.Parameter_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull ObjCParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#block_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_parameters(@NotNull ObjCParser.Block_parametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(@NotNull ObjCParser.InitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull ObjCParser.For_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#superclass_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_name(@NotNull ObjCParser.Superclass_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#method_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_definition(@NotNull ObjCParser.Method_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_class_specifier(@NotNull ObjCParser.Storage_class_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(@NotNull ObjCParser.Throw_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(@NotNull ObjCParser.Relational_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(@NotNull ObjCParser.Argument_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(@NotNull ObjCParser.Cast_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#arc_behaviour_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArc_behaviour_specifier(@NotNull ObjCParser.Arc_behaviour_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull ObjCParser.Type_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration_list(@NotNull ObjCParser.Parameter_declaration_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull ObjCParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator(@NotNull ObjCParser.Init_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(@NotNull ObjCParser.Unary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#instance_struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_struct_declaration(@NotNull ObjCParser.Instance_struct_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(@NotNull ObjCParser.And_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#selector_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_expression(@NotNull ObjCParser.Selector_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(@NotNull ObjCParser.Additive_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_qualifier(@NotNull ObjCParser.Protocol_qualifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_method_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_method_definition(@NotNull ObjCParser.Class_method_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_attribute(@NotNull ObjCParser.Property_attributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#enum_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_specifier(@NotNull ObjCParser.Enum_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(@NotNull ObjCParser.Multiplicative_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#generics_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerics_specifier(@NotNull ObjCParser.Generics_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#implementation_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementation_definition_list(@NotNull ObjCParser.Implementation_definition_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(@NotNull ObjCParser.Unary_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(@NotNull ObjCParser.Method_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_or_union_specifier(@NotNull ObjCParser.Struct_or_union_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_list(@NotNull ObjCParser.Class_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#finally_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_statement(@NotNull ObjCParser.Finally_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#encode_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncode_expression(@NotNull ObjCParser.Encode_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration_list(@NotNull ObjCParser.Class_declaration_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#struct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declarator(@NotNull ObjCParser.Struct_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_synthesize_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_synthesize_list(@NotNull ObjCParser.Property_synthesize_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(@NotNull ObjCParser.Equality_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#method_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_selector(@NotNull ObjCParser.Method_selectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#try_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_block(@NotNull ObjCParser.Try_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_list(@NotNull ObjCParser.Protocol_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_unit(@NotNull ObjCParser.Translation_unitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#init_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator_list(@NotNull ObjCParser.Init_declarator_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_method_declaration(@NotNull ObjCParser.Class_method_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#keyword_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_declarator(@NotNull ObjCParser.Keyword_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#interface_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_declaration_list(@NotNull ObjCParser.Interface_declaration_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(@NotNull ObjCParser.Selection_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(@NotNull ObjCParser.Constant_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ObjCParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(@NotNull ObjCParser.SelectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#type_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_qualifier(@NotNull ObjCParser.Type_qualifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(@NotNull ObjCParser.EnumeratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(@NotNull ObjCParser.Labeled_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_attributes_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_attributes_list(@NotNull ObjCParser.Property_attributes_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#block_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_expression(@NotNull ObjCParser.Block_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#category_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategory_interface(@NotNull ObjCParser.Category_interfaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_interface(@NotNull ObjCParser.Class_interfaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_declaration(@NotNull ObjCParser.Property_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#argument_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_expression_list(@NotNull ObjCParser.Argument_expression_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(@NotNull ObjCParser.Assignment_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(@NotNull ObjCParser.DeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#message_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_selector(@NotNull ObjCParser.Message_selectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(@NotNull ObjCParser.Struct_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#abstract_declarator_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_declarator_suffix(@NotNull ObjCParser.Abstract_declarator_suffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#preprocessor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor_declaration(@NotNull ObjCParser.Preprocessor_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(@NotNull ObjCParser.Logical_and_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(@NotNull ObjCParser.Parameter_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_name(@NotNull ObjCParser.Protocol_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(@NotNull ObjCParser.Function_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ObjCParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(@NotNull ObjCParser.Jump_statementContext ctx);
}