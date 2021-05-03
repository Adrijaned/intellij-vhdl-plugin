// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static eu.adrijaned.intellijvhdlplugin.language.psi.VHDLTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class VHDLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return vhdlFile(b, l + 1);
  }

  /* ********************************************************** */
  // '.' partial_pathname
  public static boolean absolute_pathname(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "absolute_pathname")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABSOLUTE_PATHNAME, "<absolute pathname>");
    r = consumeToken(b, ".");
    r = r && partial_pathname(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // decimal_literal
  public static boolean abstract_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_literal")) return false;
    if (!nextTokenIs(b, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decimal_literal(b, l + 1);
    exit_section_(b, m, ABSTRACT_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // ACCESS i_access_incomplete_subtype_indication
  public static boolean access_incomplete_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_incomplete_type_definition")) return false;
    if (!nextTokenIs(b, ACCESS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACCESS);
    r = r && i_access_incomplete_subtype_indication(b, l + 1);
    exit_section_(b, m, ACCESS_INCOMPLETE_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // ACCESS subtype_indication generic_map_aspect?
  public static boolean access_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_type_definition")) return false;
    if (!nextTokenIs(b, ACCESS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACCESS);
    r = r && subtype_indication(b, l + 1);
    r = r && access_type_definition_2(b, l + 1);
    exit_section_(b, m, ACCESS_TYPE_DEFINITION, r);
    return r;
  }

  // generic_map_aspect?
  private static boolean access_type_definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_type_definition_2")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (INERTIAL? conditional_expression)|i_signal_name|i_variable_name|i_file_name|subtype_indication|i_subprogram_name|ii_instantiated_package_name|OPEN
  public static boolean actual_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTUAL_DESIGNATOR, "<actual designator>");
    r = actual_designator_0(b, l + 1);
    if (!r) r = i_signal_name(b, l + 1);
    if (!r) r = i_variable_name(b, l + 1);
    if (!r) r = i_file_name(b, l + 1);
    if (!r) r = subtype_indication(b, l + 1);
    if (!r) r = i_subprogram_name(b, l + 1);
    if (!r) r = ii_instantiated_package_name(b, l + 1);
    if (!r) r = consumeToken(b, OPEN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INERTIAL? conditional_expression
  private static boolean actual_designator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_designator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = actual_designator_0_0(b, l + 1);
    r = r && conditional_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INERTIAL?
  private static boolean actual_designator_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_designator_0_0")) return false;
    consumeToken(b, INERTIAL);
    return true;
  }

  /* ********************************************************** */
  // actual_designator|(i_function_name '(' actual_designator ')')|(type_mark '(' actual_designator ')')
  public static boolean actual_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTUAL_PART, "<actual part>");
    r = actual_designator(b, l + 1);
    if (!r) r = actual_part_1(b, l + 1);
    if (!r) r = actual_part_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // i_function_name '(' actual_designator ')'
  private static boolean actual_part_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_part_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_function_name(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && actual_designator(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // type_mark '(' actual_designator ')'
  private static boolean actual_part_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_part_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && actual_designator(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '+'|'-'|'&'
  public static boolean adding_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adding_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDING_OPERATOR, "<adding operator>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "&");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' element_association ( ',' element_association )* ')'
  public static boolean aggregate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aggregate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AGGREGATE, "<aggregate>");
    r = consumeToken(b, "(");
    r = r && element_association(b, l + 1);
    r = r && aggregate_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' element_association )*
  private static boolean aggregate_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aggregate_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!aggregate_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "aggregate_2", c)) break;
    }
    return true;
  }

  // ',' element_association
  private static boolean aggregate_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aggregate_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && element_association(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ALIAS alias_designator ( ':' subtype_indication )? IS name_s signature? SEMICOLON
  public static boolean alias_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration")) return false;
    if (!nextTokenIs(b, ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALIAS);
    r = r && alias_designator(b, l + 1);
    r = r && alias_declaration_2(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && name_s(b, l + 1);
    r = r && alias_declaration_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ALIAS_DECLARATION, r);
    return r;
  }

  // ( ':' subtype_indication )?
  private static boolean alias_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_2")) return false;
    alias_declaration_2_0(b, l + 1);
    return true;
  }

  // ':' subtype_indication
  private static boolean alias_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && subtype_indication(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // signature?
  private static boolean alias_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_5")) return false;
    signature(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER|character_literal|operator_symbol
  public static boolean alias_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIAS_DESIGNATOR, "<alias designator>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = character_literal(b, l + 1);
    if (!r) r = operator_symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (NEW subtype_indication)|(NEW qualified_xpression)
  public static boolean allocator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allocator")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = allocator_0(b, l + 1);
    if (!r) r = allocator_1(b, l + 1);
    exit_section_(b, m, ALLOCATOR, r);
    return r;
  }

  // NEW subtype_indication
  private static boolean allocator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allocator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && subtype_indication(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NEW qualified_xpression
  private static boolean allocator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allocator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && qualified_xpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ARCHITECTURE IDENTIFIER OF i_entity_name IS architecture_declarative_part BEGIN architecture_statement_part END ARCHITECTURE? i_architecture_simple_name? SEMICOLON
  public static boolean architecture_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_body")) return false;
    if (!nextTokenIs(b, ARCHITECTURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ARCHITECTURE, IDENTIFIER, OF);
    r = r && i_entity_name(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && architecture_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && architecture_statement_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && architecture_body_9(b, l + 1);
    r = r && architecture_body_10(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ARCHITECTURE_BODY, r);
    return r;
  }

  // ARCHITECTURE?
  private static boolean architecture_body_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_body_9")) return false;
    consumeToken(b, ARCHITECTURE);
    return true;
  }

  // i_architecture_simple_name?
  private static boolean architecture_body_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_body_10")) return false;
    i_architecture_simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // block_declarative_item*
  static boolean architecture_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_declarative_part")) return false;
    while (true) {
      int c = current_position_(b);
      if (!block_declarative_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "architecture_declarative_part", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // concurrent_statement*
  static boolean architecture_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_statement_part")) return false;
    while (true) {
      int c = current_position_(b);
      if (!concurrent_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "architecture_statement_part", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (index_constraint array_element_constraint?)|('(' OPEN ')' array_element_constraint?)
  public static boolean array_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_CONSTRAINT, "<array constraint>");
    r = array_constraint_0(b, l + 1);
    if (!r) r = array_constraint_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // index_constraint array_element_constraint?
  private static boolean array_constraint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_constraint_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = index_constraint(b, l + 1);
    r = r && array_constraint_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // array_element_constraint?
  private static boolean array_constraint_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_constraint_0_1")) return false;
    array_element_constraint(b, l + 1);
    return true;
  }

  // '(' OPEN ')' array_element_constraint?
  private static boolean array_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_constraint_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, OPEN);
    r = r && consumeToken(b, ")");
    r = r && array_constraint_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // array_element_constraint?
  private static boolean array_constraint_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_constraint_1_3")) return false;
    array_element_constraint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // element_constraint
  public static boolean array_element_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_element_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_ELEMENT_CONSTRAINT, "<array element constraint>");
    r = element_constraint(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // resolution_indication
  public static boolean array_element_resolution(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_element_resolution")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_ELEMENT_RESOLUTION, "<array element resolution>");
    r = resolution_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ARRAY '(' array_index_incomplete_type_list ')' OF i_element_incomplete_subtype_indication
  public static boolean array_incomplete_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_incomplete_type_definition")) return false;
    if (!nextTokenIs(b, ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARRAY);
    r = r && consumeToken(b, "(");
    r = r && array_index_incomplete_type_list(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, OF);
    r = r && i_element_incomplete_subtype_indication(b, l + 1);
    exit_section_(b, m, ARRAY_INCOMPLETE_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // index_subtype_definition|index_constraint|unspecified_type_indication
  public static boolean array_index_incomplete_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_index_incomplete_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_INDEX_INCOMPLETE_TYPE, "<array index incomplete type>");
    r = index_subtype_definition(b, l + 1);
    if (!r) r = index_constraint(b, l + 1);
    if (!r) r = unspecified_type_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // array_index_incomplete_type ( ',' array_index_incomplete_type )*
  public static boolean array_index_incomplete_type_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_index_incomplete_type_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_INDEX_INCOMPLETE_TYPE_LIST, "<array index incomplete type list>");
    r = array_index_incomplete_type(b, l + 1);
    r = r && array_index_incomplete_type_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' array_index_incomplete_type )*
  private static boolean array_index_incomplete_type_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_index_incomplete_type_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_index_incomplete_type_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_index_incomplete_type_list_1", c)) break;
    }
    return true;
  }

  // ',' array_index_incomplete_type
  private static boolean array_index_incomplete_type_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_index_incomplete_type_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && array_index_incomplete_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VIEW ii_mode_view_name ( OF i_unresolved_array_subtype_indication )?
  public static boolean array_mode_view_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_mode_view_indication")) return false;
    if (!nextTokenIs(b, VIEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VIEW);
    r = r && ii_mode_view_name(b, l + 1);
    r = r && array_mode_view_indication_2(b, l + 1);
    exit_section_(b, m, ARRAY_MODE_VIEW_INDICATION, r);
    return r;
  }

  // ( OF i_unresolved_array_subtype_indication )?
  private static boolean array_mode_view_indication_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_mode_view_indication_2")) return false;
    array_mode_view_indication_2_0(b, l + 1);
    return true;
  }

  // OF i_unresolved_array_subtype_indication
  private static boolean array_mode_view_indication_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_mode_view_indication_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OF);
    r = r && i_unresolved_array_subtype_indication(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // unbounded_array_definition|constrained_array_definition
  public static boolean array_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_definition")) return false;
    if (!nextTokenIs(b, ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unbounded_array_definition(b, l + 1);
    if (!r) r = constrained_array_definition(b, l + 1);
    exit_section_(b, m, ARRAY_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // ASSERT condition (REPORT expression)? (SEVERITY expression)?
  public static boolean assertion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion")) return false;
    if (!nextTokenIs(b, ASSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSERT);
    r = r && condition(b, l + 1);
    r = r && assertion_2(b, l + 1);
    r = r && assertion_3(b, l + 1);
    exit_section_(b, m, ASSERTION, r);
    return r;
  }

  // (REPORT expression)?
  private static boolean assertion_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_2")) return false;
    assertion_2_0(b, l + 1);
    return true;
  }

  // REPORT expression
  private static boolean assertion_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REPORT);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SEVERITY expression)?
  private static boolean assertion_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_3")) return false;
    assertion_3_0(b, l + 1);
    return true;
  }

  // SEVERITY expression
  private static boolean assertion_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEVERITY);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( label ':' )? assertion SEMICOLON
  public static boolean assertion_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_statement")) return false;
    if (!nextTokenIs(b, "<assertion statement>", ASSERT, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSERTION_STATEMENT, "<assertion statement>");
    r = assertion_statement_0(b, l + 1);
    r = r && assertion(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( label ':' )?
  private static boolean assertion_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_statement_0")) return false;
    assertion_statement_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean assertion_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (formal_part '=>')? actual_part
  public static boolean association_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSOCIATION_ELEMENT, "<association element>");
    r = association_element_0(b, l + 1);
    r = r && actual_part(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (formal_part '=>')?
  private static boolean association_element_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_element_0")) return false;
    association_element_0_0(b, l + 1);
    return true;
  }

  // formal_part '=>'
  private static boolean association_element_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_element_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formal_part(b, l + 1);
    r = r && consumeToken(b, "=>");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // association_element ( ',' association_element )*
  public static boolean association_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSOCIATION_LIST, "<association list>");
    r = association_element(b, l + 1);
    r = r && association_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' association_element )*
  private static boolean association_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!association_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "association_list_1", c)) break;
    }
    return true;
  }

  // ',' association_element
  private static boolean association_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && association_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ATTRIBUTE identifier ':' type_mark SEMICOLON
  public static boolean attribute_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_declaration")) return false;
    if (!nextTokenIs(b, ATTRIBUTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ATTRIBUTE, IDENTIFIER);
    r = r && consumeToken(b, ":");
    r = r && type_mark(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ATTRIBUTE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // i_attribute_simple_name
  public static boolean attribute_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_designator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_attribute_simple_name(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_DESIGNATOR, r);
    return r;
  }

  /* ********************************************************** */
  // prefix signature? SINGLE_QUOTE attribute_designator ('(' expression ')')?
  public static boolean attribute_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_NAME, "<attribute name>");
    r = prefix(b, l + 1);
    r = r && attribute_name_1(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTE);
    r = r && attribute_designator(b, l + 1);
    r = r && attribute_name_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // signature?
  private static boolean attribute_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name_1")) return false;
    signature(b, l + 1);
    return true;
  }

  // ('(' expression ')')?
  private static boolean attribute_name_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name_4")) return false;
    attribute_name_4_0(b, l + 1);
    return true;
  }

  // '(' expression ')'
  private static boolean attribute_name_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ATTRIBUTE attribute_designator OF entity_specification IS conditional_expression SEMICOLON
  public static boolean attribute_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_specification")) return false;
    if (!nextTokenIs(b, ATTRIBUTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATTRIBUTE);
    r = r && attribute_designator(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && entity_specification(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && conditional_expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ATTRIBUTE_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // '**'
  public static boolean binary_miscellaneous_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_miscellaneous_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_MISCELLANEOUS_OPERATOR, "<binary miscellaneous operator>");
    r = consumeToken(b, "**");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( USE entity_aspect )? generic_map_aspect? port_map_aspect?
  public static boolean binding_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINDING_INDICATION, "<binding indication>");
    r = binding_indication_0(b, l + 1);
    r = r && binding_indication_1(b, l + 1);
    r = r && binding_indication_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( USE entity_aspect )?
  private static boolean binding_indication_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_indication_0")) return false;
    binding_indication_0_0(b, l + 1);
    return true;
  }

  // USE entity_aspect
  private static boolean binding_indication_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_indication_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && entity_aspect(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // generic_map_aspect?
  private static boolean binding_indication_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_indication_1")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  // port_map_aspect?
  private static boolean binding_indication_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_indication_2")) return false;
    port_map_aspect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'TODOTODOTODOTODO23435445'
  public static boolean bit_string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_string_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIT_STRING_LITERAL, "<bit string literal>");
    r = consumeToken(b, "TODOTODOTODOTODO23435445");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FOR block_specification use_clause* configuration_item* END FOR SEMICOLON
  public static boolean block_configuration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_configuration")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && block_specification(b, l + 1);
    r = r && block_configuration_2(b, l + 1);
    r = r && block_configuration_3(b, l + 1);
    r = r && consumeTokens(b, 0, END, FOR, SEMICOLON);
    exit_section_(b, m, BLOCK_CONFIGURATION, r);
    return r;
  }

  // use_clause*
  private static boolean block_configuration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_configuration_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_configuration_2", c)) break;
    }
    return true;
  }

  // configuration_item*
  private static boolean block_configuration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_configuration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!configuration_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_configuration_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // subprogram_declaration|subprogram_body|subprogram_instantiation_declaration|package_declaration|package_body|package_instantiation_declaration|type_declaration|subtype_declaration|mode_view_declaration|constant_declaration|signal_declaration|i_shared_variable_declaration|file_declaration|alias_declaration|component_declaration|attribute_declaration|attribute_specification|configuration_specification|disconnection_specification|use_clause|group_template_declaration|group_declaration|i_PSL_Property_Declaration|i_PSL_Sequence_Declaration|i_PSL_Clock_Declaration
  public static boolean block_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_DECLARATIVE_ITEM, "<block declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = subprogram_instantiation_declaration(b, l + 1);
    if (!r) r = package_declaration(b, l + 1);
    if (!r) r = package_body(b, l + 1);
    if (!r) r = package_instantiation_declaration(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = mode_view_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = i_shared_variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = component_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = configuration_specification(b, l + 1);
    if (!r) r = disconnection_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    if (!r) r = i_PSL_Property_Declaration(b, l + 1);
    if (!r) r = i_PSL_Sequence_Declaration(b, l + 1);
    if (!r) r = i_PSL_Clock_Declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // block_declarative_item*
  public static boolean block_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_declarative_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_DECLARATIVE_PART, "<block declarative part>");
    while (true) {
      int c = current_position_(b);
      if (!block_declarative_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_declarative_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // (generic_clause (generic_map_aspect SEMICOLON)?)? (port_clause (port_map_aspect SEMICOLON)?)?
  public static boolean block_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_HEADER, "<block header>");
    r = block_header_0(b, l + 1);
    r = r && block_header_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (generic_clause (generic_map_aspect SEMICOLON)?)?
  private static boolean block_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_0")) return false;
    block_header_0_0(b, l + 1);
    return true;
  }

  // generic_clause (generic_map_aspect SEMICOLON)?
  private static boolean block_header_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_clause(b, l + 1);
    r = r && block_header_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (generic_map_aspect SEMICOLON)?
  private static boolean block_header_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_0_0_1")) return false;
    block_header_0_0_1_0(b, l + 1);
    return true;
  }

  // generic_map_aspect SEMICOLON
  private static boolean block_header_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_map_aspect(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (port_clause (port_map_aspect SEMICOLON)?)?
  private static boolean block_header_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_1")) return false;
    block_header_1_0(b, l + 1);
    return true;
  }

  // port_clause (port_map_aspect SEMICOLON)?
  private static boolean block_header_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_clause(b, l + 1);
    r = r && block_header_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (port_map_aspect SEMICOLON)?
  private static boolean block_header_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_1_0_1")) return false;
    block_header_1_0_1_0(b, l + 1);
    return true;
  }

  // port_map_aspect SEMICOLON
  private static boolean block_header_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_map_aspect(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // i_architecture_name|ii_block_statement_label|generate_statement_label_specification
  public static boolean block_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_SPECIFICATION, "<block specification>");
    r = i_architecture_name(b, l + 1);
    if (!r) r = ii_block_statement_label(b, l + 1);
    if (!r) r = generate_statement_label_specification(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // i_block_label ':' BLOCK ( '(' i_guard_condition ')' )? IS? block_header block_declarative_part BEGIN block_statement_part END BLOCK i_block_label? SEMICOLON
  public static boolean block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_block_label(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, BLOCK);
    r = r && block_statement_3(b, l + 1);
    r = r && block_statement_4(b, l + 1);
    r = r && block_header(b, l + 1);
    r = r && block_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && block_statement_part(b, l + 1);
    r = r && consumeTokens(b, 0, END, BLOCK);
    r = r && block_statement_11(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, BLOCK_STATEMENT, r);
    return r;
  }

  // ( '(' i_guard_condition ')' )?
  private static boolean block_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_3")) return false;
    block_statement_3_0(b, l + 1);
    return true;
  }

  // '(' i_guard_condition ')'
  private static boolean block_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && i_guard_condition(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // IS?
  private static boolean block_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_4")) return false;
    consumeToken(b, IS);
    return true;
  }

  // i_block_label?
  private static boolean block_statement_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_11")) return false;
    i_block_label(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // concurrent_statement*
  public static boolean block_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STATEMENT_PART, "<block statement part>");
    while (true) {
      int c = current_position_(b);
      if (!concurrent_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_statement_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // WHEN (i_alternative_label ':' )? choices '=>' generate_statement_body
  public static boolean case_generate_alternative(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_generate_alternative")) return false;
    if (!nextTokenIs(b, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && case_generate_alternative_1(b, l + 1);
    r = r && choices(b, l + 1);
    r = r && consumeToken(b, "=>");
    r = r && generate_statement_body(b, l + 1);
    exit_section_(b, m, CASE_GENERATE_ALTERNATIVE, r);
    return r;
  }

  // (i_alternative_label ':' )?
  private static boolean case_generate_alternative_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_generate_alternative_1")) return false;
    case_generate_alternative_1_0(b, l + 1);
    return true;
  }

  // i_alternative_label ':'
  private static boolean case_generate_alternative_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_generate_alternative_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_alternative_label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // i_generate_label ':' CASE expression GENERATE case_generate_alternative case_generate_alternative* END GENERATE i_generate_label? SEMICOLON
  public static boolean case_generate_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_generate_statement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_generate_label(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, CASE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, GENERATE);
    r = r && case_generate_alternative(b, l + 1);
    r = r && case_generate_statement_6(b, l + 1);
    r = r && consumeTokens(b, 0, END, GENERATE);
    r = r && case_generate_statement_9(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CASE_GENERATE_STATEMENT, r);
    return r;
  }

  // case_generate_alternative*
  private static boolean case_generate_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_generate_statement_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!case_generate_alternative(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_generate_statement_6", c)) break;
    }
    return true;
  }

  // i_generate_label?
  private static boolean case_generate_statement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_generate_statement_9")) return false;
    i_generate_label(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( i_case_label ':' )? CASE '?'? expression IS case_statement_alternative case_statement_alternative* END CASE '?'? i_case_label? SEMICOLON
  public static boolean case_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement")) return false;
    if (!nextTokenIs(b, "<case statement>", CASE, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_STATEMENT, "<case statement>");
    r = case_statement_0(b, l + 1);
    r = r && consumeToken(b, CASE);
    r = r && case_statement_2(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && case_statement_alternative(b, l + 1);
    r = r && case_statement_6(b, l + 1);
    r = r && consumeTokens(b, 0, END, CASE);
    r = r && case_statement_9(b, l + 1);
    r = r && case_statement_10(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( i_case_label ':' )?
  private static boolean case_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_0")) return false;
    case_statement_0_0(b, l + 1);
    return true;
  }

  // i_case_label ':'
  private static boolean case_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_case_label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // '?'?
  private static boolean case_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_2")) return false;
    consumeToken(b, "?");
    return true;
  }

  // case_statement_alternative*
  private static boolean case_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!case_statement_alternative(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_statement_6", c)) break;
    }
    return true;
  }

  // '?'?
  private static boolean case_statement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_9")) return false;
    consumeToken(b, "?");
    return true;
  }

  // i_case_label?
  private static boolean case_statement_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_10")) return false;
    i_case_label(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // WHEN choices '=>' sequence_of_statements
  public static boolean case_statement_alternative(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_alternative")) return false;
    if (!nextTokenIs(b, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && choices(b, l + 1);
    r = r && consumeToken(b, "=>");
    r = r && sequence_of_statements(b, l + 1);
    exit_section_(b, m, CASE_STATEMENT_ALTERNATIVE, r);
    return r;
  }

  /* ********************************************************** */
  // CHARACTER_LITERAL_TOKEN
  public static boolean character_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "character_literal")) return false;
    if (!nextTokenIs(b, CHARACTER_LITERAL_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHARACTER_LITERAL_TOKEN);
    exit_section_(b, m, CHARACTER_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // simple_expression|discrete_range|i_element_simple_name|OTHERS
  public static boolean choice(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHOICE, "<choice>");
    r = simple_expression(b, l + 1);
    if (!r) r = discrete_range(b, l + 1);
    if (!r) r = i_element_simple_name(b, l + 1);
    if (!r) r = consumeToken(b, OTHERS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // choice ( '|' choice )*
  public static boolean choices(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHOICES, "<choices>");
    r = choice(b, l + 1);
    r = r && choices_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '|' choice )*
  private static boolean choices_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!choices_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "choices_1", c)) break;
    }
    return true;
  }

  // '|' choice
  private static boolean choices_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "|");
    r = r && choice(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FOR component_specification (binding_indication SEMICOLON)? (verification_unit_binding_indication SEMICOLON)* block_configuration? END FOR SEMICOLON
  public static boolean component_configuration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && component_specification(b, l + 1);
    r = r && component_configuration_2(b, l + 1);
    r = r && component_configuration_3(b, l + 1);
    r = r && component_configuration_4(b, l + 1);
    r = r && consumeTokens(b, 0, END, FOR, SEMICOLON);
    exit_section_(b, m, COMPONENT_CONFIGURATION, r);
    return r;
  }

  // (binding_indication SEMICOLON)?
  private static boolean component_configuration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration_2")) return false;
    component_configuration_2_0(b, l + 1);
    return true;
  }

  // binding_indication SEMICOLON
  private static boolean component_configuration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = binding_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (verification_unit_binding_indication SEMICOLON)*
  private static boolean component_configuration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!component_configuration_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "component_configuration_3", c)) break;
    }
    return true;
  }

  // verification_unit_binding_indication SEMICOLON
  private static boolean component_configuration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = verification_unit_binding_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // block_configuration?
  private static boolean component_configuration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration_4")) return false;
    block_configuration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // COMPONENT IDENTIFIER IS? i_local_generic_clause? i_local_port_clause? END COMPONENT? i_component_simple_name? SEMICOLON
  public static boolean component_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration")) return false;
    if (!nextTokenIs(b, COMPONENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMPONENT, IDENTIFIER);
    r = r && component_declaration_2(b, l + 1);
    r = r && component_declaration_3(b, l + 1);
    r = r && component_declaration_4(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && component_declaration_6(b, l + 1);
    r = r && component_declaration_7(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, COMPONENT_DECLARATION, r);
    return r;
  }

  // IS?
  private static boolean component_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // i_local_generic_clause?
  private static boolean component_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration_3")) return false;
    i_local_generic_clause(b, l + 1);
    return true;
  }

  // i_local_port_clause?
  private static boolean component_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration_4")) return false;
    i_local_port_clause(b, l + 1);
    return true;
  }

  // COMPONENT?
  private static boolean component_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration_6")) return false;
    consumeToken(b, COMPONENT);
    return true;
  }

  // i_component_simple_name?
  private static boolean component_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration_7")) return false;
    i_component_simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // i_instantiation_label ':' instantiated_unit generic_map_aspect? port_map_aspect? SEMICOLON
  public static boolean component_instantiation_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_instantiation_statement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_instantiation_label(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && instantiated_unit(b, l + 1);
    r = r && component_instantiation_statement_3(b, l + 1);
    r = r && component_instantiation_statement_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, COMPONENT_INSTANTIATION_STATEMENT, r);
    return r;
  }

  // generic_map_aspect?
  private static boolean component_instantiation_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_instantiation_statement_3")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  // port_map_aspect?
  private static boolean component_instantiation_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_instantiation_statement_4")) return false;
    port_map_aspect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // instantiation_list ':' i_component_name
  public static boolean component_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_SPECIFICATION, "<component specification>");
    r = instantiation_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && i_component_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // array_type_definition|record_type_definition
  public static boolean composite_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "composite_type_definition")) return false;
    if (!nextTokenIs(b, "<composite type definition>", ARRAY, RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPOSITE_TYPE_DEFINITION, "<composite type definition>");
    r = array_type_definition(b, l + 1);
    if (!r) r = record_type_definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FOR component_specification binding_indication SEMICOLON verification_unit_binding_indication SEMICOLON (verification_unit_binding_indication SEMICOLON)* END FOR SEMICOLON
  public static boolean compound_configuration_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_configuration_specification")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && component_specification(b, l + 1);
    r = r && binding_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && verification_unit_binding_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && compound_configuration_specification_6(b, l + 1);
    r = r && consumeTokens(b, 0, END, FOR, SEMICOLON);
    exit_section_(b, m, COMPOUND_CONFIGURATION_SPECIFICATION, r);
    return r;
  }

  // (verification_unit_binding_indication SEMICOLON)*
  private static boolean compound_configuration_specification_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_configuration_specification_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!compound_configuration_specification_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compound_configuration_specification_6", c)) break;
    }
    return true;
  }

  // verification_unit_binding_indication SEMICOLON
  private static boolean compound_configuration_specification_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_configuration_specification_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = verification_unit_binding_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( label ':' )? POSTPONED? assertion SEMICOLON
  public static boolean concurrent_assertion_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_assertion_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_ASSERTION_STATEMENT, "<concurrent assertion statement>");
    r = concurrent_assertion_statement_0(b, l + 1);
    r = r && concurrent_assertion_statement_1(b, l + 1);
    r = r && assertion(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( label ':' )?
  private static boolean concurrent_assertion_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_assertion_statement_0")) return false;
    concurrent_assertion_statement_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean concurrent_assertion_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_assertion_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // POSTPONED?
  private static boolean concurrent_assertion_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_assertion_statement_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  /* ********************************************************** */
  // target '<=' GUARDED? delay_mechanism? conditional_waveforms SEMICOLON
  public static boolean concurrent_conditional_signal_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_conditional_signal_assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_CONDITIONAL_SIGNAL_ASSIGNMENT, "<concurrent conditional signal assignment>");
    r = target(b, l + 1);
    r = r && consumeToken(b, "<=");
    r = r && concurrent_conditional_signal_assignment_2(b, l + 1);
    r = r && concurrent_conditional_signal_assignment_3(b, l + 1);
    r = r && conditional_waveforms(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // GUARDED?
  private static boolean concurrent_conditional_signal_assignment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_conditional_signal_assignment_2")) return false;
    consumeToken(b, GUARDED);
    return true;
  }

  // delay_mechanism?
  private static boolean concurrent_conditional_signal_assignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_conditional_signal_assignment_3")) return false;
    delay_mechanism(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( label ':' )? POSTPONED? procedure_call SEMICOLON
  public static boolean concurrent_procedure_call_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_procedure_call_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_PROCEDURE_CALL_STATEMENT, "<concurrent procedure call statement>");
    r = concurrent_procedure_call_statement_0(b, l + 1);
    r = r && concurrent_procedure_call_statement_1(b, l + 1);
    r = r && procedure_call(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( label ':' )?
  private static boolean concurrent_procedure_call_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_procedure_call_statement_0")) return false;
    concurrent_procedure_call_statement_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean concurrent_procedure_call_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_procedure_call_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // POSTPONED?
  private static boolean concurrent_procedure_call_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_procedure_call_statement_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  /* ********************************************************** */
  // WITH expression SELECT '?'? target '<=' GUARDED? delay_mechanism? selected_waveforms SEMICOLON
  public static boolean concurrent_selected_signal_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_selected_signal_assignment")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SELECT);
    r = r && concurrent_selected_signal_assignment_3(b, l + 1);
    r = r && target(b, l + 1);
    r = r && consumeToken(b, "<=");
    r = r && concurrent_selected_signal_assignment_6(b, l + 1);
    r = r && concurrent_selected_signal_assignment_7(b, l + 1);
    r = r && selected_waveforms(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONCURRENT_SELECTED_SIGNAL_ASSIGNMENT, r);
    return r;
  }

  // '?'?
  private static boolean concurrent_selected_signal_assignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_selected_signal_assignment_3")) return false;
    consumeToken(b, "?");
    return true;
  }

  // GUARDED?
  private static boolean concurrent_selected_signal_assignment_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_selected_signal_assignment_6")) return false;
    consumeToken(b, GUARDED);
    return true;
  }

  // delay_mechanism?
  private static boolean concurrent_selected_signal_assignment_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_selected_signal_assignment_7")) return false;
    delay_mechanism(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (( label ':' )? POSTPONED? concurrent_simple_signal_assignment)|(( label ':' )? POSTPONED? concurrent_conditional_signal_assignment)|(( label ':' )? POSTPONED? concurrent_selected_signal_assignment)
  public static boolean concurrent_signal_assignment_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_SIGNAL_ASSIGNMENT_STATEMENT, "<concurrent signal assignment statement>");
    r = concurrent_signal_assignment_statement_0(b, l + 1);
    if (!r) r = concurrent_signal_assignment_statement_1(b, l + 1);
    if (!r) r = concurrent_signal_assignment_statement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( label ':' )? POSTPONED? concurrent_simple_signal_assignment
  private static boolean concurrent_signal_assignment_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concurrent_signal_assignment_statement_0_0(b, l + 1);
    r = r && concurrent_signal_assignment_statement_0_1(b, l + 1);
    r = r && concurrent_simple_signal_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( label ':' )?
  private static boolean concurrent_signal_assignment_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_0_0")) return false;
    concurrent_signal_assignment_statement_0_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean concurrent_signal_assignment_statement_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // POSTPONED?
  private static boolean concurrent_signal_assignment_statement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_0_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  // ( label ':' )? POSTPONED? concurrent_conditional_signal_assignment
  private static boolean concurrent_signal_assignment_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concurrent_signal_assignment_statement_1_0(b, l + 1);
    r = r && concurrent_signal_assignment_statement_1_1(b, l + 1);
    r = r && concurrent_conditional_signal_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( label ':' )?
  private static boolean concurrent_signal_assignment_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_1_0")) return false;
    concurrent_signal_assignment_statement_1_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean concurrent_signal_assignment_statement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // POSTPONED?
  private static boolean concurrent_signal_assignment_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_1_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  // ( label ':' )? POSTPONED? concurrent_selected_signal_assignment
  private static boolean concurrent_signal_assignment_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concurrent_signal_assignment_statement_2_0(b, l + 1);
    r = r && concurrent_signal_assignment_statement_2_1(b, l + 1);
    r = r && concurrent_selected_signal_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( label ':' )?
  private static boolean concurrent_signal_assignment_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_2_0")) return false;
    concurrent_signal_assignment_statement_2_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean concurrent_signal_assignment_statement_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // POSTPONED?
  private static boolean concurrent_signal_assignment_statement_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_2_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  /* ********************************************************** */
  // target '<=' GUARDED? delay_mechanism? waveform SEMICOLON
  public static boolean concurrent_simple_signal_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_simple_signal_assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_SIMPLE_SIGNAL_ASSIGNMENT, "<concurrent simple signal assignment>");
    r = target(b, l + 1);
    r = r && consumeToken(b, "<=");
    r = r && concurrent_simple_signal_assignment_2(b, l + 1);
    r = r && concurrent_simple_signal_assignment_3(b, l + 1);
    r = r && waveform(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // GUARDED?
  private static boolean concurrent_simple_signal_assignment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_simple_signal_assignment_2")) return false;
    consumeToken(b, GUARDED);
    return true;
  }

  // delay_mechanism?
  private static boolean concurrent_simple_signal_assignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_simple_signal_assignment_3")) return false;
    delay_mechanism(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // block_statement|process_statement|concurrent_procedure_call_statement|concurrent_assertion_statement|concurrent_signal_assignment_statement|component_instantiation_statement|generate_statement|i_PSL_Directive
  public static boolean concurrent_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_STATEMENT, "<concurrent statement>");
    r = block_statement(b, l + 1);
    if (!r) r = process_statement(b, l + 1);
    if (!r) r = concurrent_procedure_call_statement(b, l + 1);
    if (!r) r = concurrent_assertion_statement(b, l + 1);
    if (!r) r = concurrent_signal_assignment_statement(b, l + 1);
    if (!r) r = component_instantiation_statement(b, l + 1);
    if (!r) r = generate_statement(b, l + 1);
    if (!r) r = i_PSL_Directive(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // UNTIL condition
  public static boolean condition_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_clause")) return false;
    if (!nextTokenIs(b, UNTIL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNTIL);
    r = r && condition(b, l + 1);
    exit_section_(b, m, CONDITION_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // '??'
  public static boolean condition_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION_OPERATOR, "<condition operator>");
    r = consumeToken(b, "??");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression ( WHEN condition ELSE expression )*
  public static boolean conditional_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_EXPRESSION, "<conditional expression>");
    r = expression(b, l + 1);
    r = r && conditional_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( WHEN condition ELSE expression )*
  private static boolean conditional_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conditional_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditional_expression_1", c)) break;
    }
    return true;
  }

  // WHEN condition ELSE expression
  private static boolean conditional_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, ELSE);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression_or_unaffected ( WHEN condition ELSE expression_or_unaffected )* (WHEN condition)?
  public static boolean conditional_or_unaffected_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_or_unaffected_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_OR_UNAFFECTED_EXPRESSION, "<conditional or unaffected expression>");
    r = expression_or_unaffected(b, l + 1);
    r = r && conditional_or_unaffected_expression_1(b, l + 1);
    r = r && conditional_or_unaffected_expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( WHEN condition ELSE expression_or_unaffected )*
  private static boolean conditional_or_unaffected_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_or_unaffected_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conditional_or_unaffected_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditional_or_unaffected_expression_1", c)) break;
    }
    return true;
  }

  // WHEN condition ELSE expression_or_unaffected
  private static boolean conditional_or_unaffected_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_or_unaffected_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, ELSE);
    r = r && expression_or_unaffected(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (WHEN condition)?
  private static boolean conditional_or_unaffected_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_or_unaffected_expression_2")) return false;
    conditional_or_unaffected_expression_2_0(b, l + 1);
    return true;
  }

  // WHEN condition
  private static boolean conditional_or_unaffected_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_or_unaffected_expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // target '<=' delay_mechanism? conditional_waveforms SEMICOLON
  public static boolean conditional_signal_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_signal_assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_SIGNAL_ASSIGNMENT, "<conditional signal assignment>");
    r = target(b, l + 1);
    r = r && consumeToken(b, "<=");
    r = r && conditional_signal_assignment_2(b, l + 1);
    r = r && conditional_waveforms(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // delay_mechanism?
  private static boolean conditional_signal_assignment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_signal_assignment_2")) return false;
    delay_mechanism(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // waveform WHEN condition ( ELSE waveform WHEN condition )* ( ELSE waveform )?
  public static boolean conditional_waveforms(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_WAVEFORMS, "<conditional waveforms>");
    r = waveform(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    r = r && conditional_waveforms_3(b, l + 1);
    r = r && conditional_waveforms_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ELSE waveform WHEN condition )*
  private static boolean conditional_waveforms_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conditional_waveforms_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditional_waveforms_3", c)) break;
    }
    return true;
  }

  // ELSE waveform WHEN condition
  private static boolean conditional_waveforms_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && waveform(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ELSE waveform )?
  private static boolean conditional_waveforms_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms_4")) return false;
    conditional_waveforms_4_0(b, l + 1);
    return true;
  }

  // ELSE waveform
  private static boolean conditional_waveforms_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && waveform(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONFIGURATION IDENTIFIER OF i_entity_name IS configuration_declarative_part (verification_unit_binding_indication SEMICOLON)* block_configuration END CONFIGURATION? i_configuration_simple_name SEMICOLON
  public static boolean configuration_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declaration")) return false;
    if (!nextTokenIs(b, CONFIGURATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONFIGURATION, IDENTIFIER, OF);
    r = r && i_entity_name(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && configuration_declarative_part(b, l + 1);
    r = r && configuration_declaration_6(b, l + 1);
    r = r && block_configuration(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && configuration_declaration_9(b, l + 1);
    r = r && i_configuration_simple_name(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONFIGURATION_DECLARATION, r);
    return r;
  }

  // (verification_unit_binding_indication SEMICOLON)*
  private static boolean configuration_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declaration_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!configuration_declaration_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "configuration_declaration_6", c)) break;
    }
    return true;
  }

  // verification_unit_binding_indication SEMICOLON
  private static boolean configuration_declaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = verification_unit_binding_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONFIGURATION?
  private static boolean configuration_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declaration_9")) return false;
    consumeToken(b, CONFIGURATION);
    return true;
  }

  /* ********************************************************** */
  // use_clause|attribute_specification|group_declaration
  public static boolean configuration_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONFIGURATION_DECLARATIVE_ITEM, "<configuration declarative item>");
    r = use_clause(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // configuration_declarative_item*
  static boolean configuration_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declarative_part")) return false;
    while (true) {
      int c = current_position_(b);
      if (!configuration_declarative_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "configuration_declarative_part", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // block_configuration|component_configuration
  public static boolean configuration_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_item")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_configuration(b, l + 1);
    if (!r) r = component_configuration(b, l + 1);
    exit_section_(b, m, CONFIGURATION_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // simple_configuration_specification|compound_configuration_specification
  public static boolean configuration_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_specification")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_configuration_specification(b, l + 1);
    if (!r) r = compound_configuration_specification(b, l + 1);
    exit_section_(b, m, CONFIGURATION_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // CONSTANT identifier_list ':' subtype_indication ( ':=' conditional_expression )? SEMICOLON
  public static boolean constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration")) return false;
    if (!nextTokenIs(b, CONSTANT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONSTANT);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && subtype_indication(b, l + 1);
    r = r && constant_declaration_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONSTANT_DECLARATION, r);
    return r;
  }

  // ( ':=' conditional_expression )?
  private static boolean constant_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_4")) return false;
    constant_declaration_4_0(b, l + 1);
    return true;
  }

  // ':=' conditional_expression
  private static boolean constant_declaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":=");
    r = r && conditional_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ARRAY index_constraint OF i_element_subtype_indication
  public static boolean constrained_array_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constrained_array_definition")) return false;
    if (!nextTokenIs(b, ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARRAY);
    r = r && index_constraint(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && i_element_subtype_indication(b, l + 1);
    exit_section_(b, m, CONSTRAINED_ARRAY_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // range_constraint|array_constraint|record_constraint
  public static boolean constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINT, "<constraint>");
    r = range_constraint(b, l + 1);
    if (!r) r = array_constraint(b, l + 1);
    if (!r) r = record_constraint(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // context_item*
  public static boolean context_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_clause")) return false;
    Marker m = enter_section_(b, l, _NONE_, CONTEXT_CLAUSE, "<context clause>");
    while (true) {
      int c = current_position_(b);
      if (!context_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "context_clause", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // CONTEXT IDENTIFIER IS context_clause END CONTEXT? i_context_simple_name? SEMICOLON
  public static boolean context_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_declaration")) return false;
    if (!nextTokenIs(b, CONTEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONTEXT, IDENTIFIER, IS);
    r = r && context_clause(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && context_declaration_5(b, l + 1);
    r = r && context_declaration_6(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONTEXT_DECLARATION, r);
    return r;
  }

  // CONTEXT?
  private static boolean context_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_declaration_5")) return false;
    consumeToken(b, CONTEXT);
    return true;
  }

  // i_context_simple_name?
  private static boolean context_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_declaration_6")) return false;
    i_context_simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // library_clause|use_clause|context_reference
  public static boolean context_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTEXT_ITEM, "<context item>");
    r = library_clause(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = context_reference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CONTEXT selected_name ( ',' selected_name )* SEMICOLON
  public static boolean context_reference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_reference")) return false;
    if (!nextTokenIs(b, CONTEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTEXT);
    r = r && selected_name(b, l + 1);
    r = r && context_reference_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONTEXT_REFERENCE, r);
    return r;
  }

  // ( ',' selected_name )*
  private static boolean context_reference_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_reference_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!context_reference_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "context_reference_2", c)) break;
    }
    return true;
  }

  // ',' selected_name
  private static boolean context_reference_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_reference_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && selected_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER ('.' INTEGER)? exponent?
  public static boolean decimal_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_literal")) return false;
    if (!nextTokenIs(b, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    r = r && decimal_literal_1(b, l + 1);
    r = r && decimal_literal_2(b, l + 1);
    exit_section_(b, m, DECIMAL_LITERAL, r);
    return r;
  }

  // ('.' INTEGER)?
  private static boolean decimal_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_literal_1")) return false;
    decimal_literal_1_0(b, l + 1);
    return true;
  }

  // '.' INTEGER
  private static boolean decimal_literal_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_literal_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && consumeToken(b, INTEGER);
    exit_section_(b, m, null, r);
    return r;
  }

  // exponent?
  private static boolean decimal_literal_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_literal_2")) return false;
    exponent(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TRANSPORT|((REJECT i_time_expression)? INERTIAL)
  public static boolean delay_mechanism(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delay_mechanism")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELAY_MECHANISM, "<delay mechanism>");
    r = consumeToken(b, TRANSPORT);
    if (!r) r = delay_mechanism_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (REJECT i_time_expression)? INERTIAL
  private static boolean delay_mechanism_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delay_mechanism_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = delay_mechanism_1_0(b, l + 1);
    r = r && consumeToken(b, INERTIAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // (REJECT i_time_expression)?
  private static boolean delay_mechanism_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delay_mechanism_1_0")) return false;
    delay_mechanism_1_0_0(b, l + 1);
    return true;
  }

  // REJECT i_time_expression
  private static boolean delay_mechanism_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delay_mechanism_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REJECT);
    r = r && i_time_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // context_clause library_unit
  public static boolean design_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "design_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DESIGN_UNIT, "<design unit>");
    r = context_clause(b, l + 1);
    r = r && library_unit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | operator_symbol
  public static boolean designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "designator")) return false;
    if (!nextTokenIs(b, "<designator>", IDENTIFIER, STRING_LITERAL_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DESIGNATOR, "<designator>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = operator_symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TO|DOWNTO
  public static boolean direction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direction")) return false;
    if (!nextTokenIs(b, "<direction>", DOWNTO, TO)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRECTION, "<direction>");
    r = consumeToken(b, TO);
    if (!r) r = consumeToken(b, DOWNTO);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DISCONNECT guarded_signal_specification AFTER i_time_expression SEMICOLON
  public static boolean disconnection_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disconnection_specification")) return false;
    if (!nextTokenIs(b, DISCONNECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISCONNECT);
    r = r && guarded_signal_specification(b, l + 1);
    r = r && consumeToken(b, AFTER);
    r = r && i_time_expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, DISCONNECTION_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // '(' '<>' ')'
  public static boolean discrete_incomplete_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discrete_incomplete_type_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISCRETE_INCOMPLETE_TYPE_DEFINITION, "<discrete incomplete type definition>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "<>");
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // i_discrete_subtype_indication|range
  public static boolean discrete_range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discrete_range")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISCRETE_RANGE, "<discrete range>");
    r = i_discrete_subtype_indication(b, l + 1);
    if (!r) r = range(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VIEW '(' ii_mode_view_name ')'
  public static boolean element_array_mode_view_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_array_mode_view_indication")) return false;
    if (!nextTokenIs(b, VIEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VIEW);
    r = r && consumeToken(b, "(");
    r = r && ii_mode_view_name(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, ELEMENT_ARRAY_MODE_VIEW_INDICATION, r);
    return r;
  }

  /* ********************************************************** */
  // (choices '=>')? expression
  public static boolean element_association(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_association")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_ASSOCIATION, "<element association>");
    r = element_association_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (choices '=>')?
  private static boolean element_association_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_association_0")) return false;
    element_association_0_0(b, l + 1);
    return true;
  }

  // choices '=>'
  private static boolean element_association_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_association_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = choices(b, l + 1);
    r = r && consumeToken(b, "=>");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // array_constraint|record_constraint
  public static boolean element_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_CONSTRAINT, "<element constraint>");
    r = array_constraint(b, l + 1);
    if (!r) r = record_constraint(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier_list ':' element_subtype_definition SEMICOLON
  public static boolean element_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_declaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && element_subtype_definition(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ELEMENT_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // mode|element_mode_view_indication
  public static boolean element_mode_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_mode_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_MODE_INDICATION, "<element mode indication>");
    r = mode(b, l + 1);
    if (!r) r = element_mode_view_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // element_record_mode_view_indication|element_array_mode_view_indication
  public static boolean element_mode_view_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_mode_view_indication")) return false;
    if (!nextTokenIs(b, VIEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = element_record_mode_view_indication(b, l + 1);
    if (!r) r = element_array_mode_view_indication(b, l + 1);
    exit_section_(b, m, ELEMENT_MODE_VIEW_INDICATION, r);
    return r;
  }

  /* ********************************************************** */
  // VIEW ii_mode_view_name
  public static boolean element_record_mode_view_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_record_mode_view_indication")) return false;
    if (!nextTokenIs(b, VIEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VIEW);
    r = r && ii_mode_view_name(b, l + 1);
    exit_section_(b, m, ELEMENT_RECORD_MODE_VIEW_INDICATION, r);
    return r;
  }

  /* ********************************************************** */
  // array_element_resolution|record_resolution
  public static boolean element_resolution(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_resolution")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_RESOLUTION, "<element resolution>");
    r = array_element_resolution(b, l + 1);
    if (!r) r = record_resolution(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // subtype_indication
  public static boolean element_subtype_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_subtype_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_SUBTYPE_DEFINITION, "<element subtype definition>");
    r = subtype_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (ENTITY i_entity_name ( '(' i_architecture_identifier ')' )?)|(CONFIGURATION i_configuration_name)|OPEN
  public static boolean entity_aspect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_aspect")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_ASPECT, "<entity aspect>");
    r = entity_aspect_0(b, l + 1);
    if (!r) r = entity_aspect_1(b, l + 1);
    if (!r) r = consumeToken(b, OPEN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ENTITY i_entity_name ( '(' i_architecture_identifier ')' )?
  private static boolean entity_aspect_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_aspect_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENTITY);
    r = r && i_entity_name(b, l + 1);
    r = r && entity_aspect_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( '(' i_architecture_identifier ')' )?
  private static boolean entity_aspect_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_aspect_0_2")) return false;
    entity_aspect_0_2_0(b, l + 1);
    return true;
  }

  // '(' i_architecture_identifier ')'
  private static boolean entity_aspect_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_aspect_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && i_architecture_identifier(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // CONFIGURATION i_configuration_name
  private static boolean entity_aspect_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_aspect_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONFIGURATION);
    r = r && i_configuration_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ENTITY|ARCHITECTURE|CONFIGURATION|PROCEDURE|FUNCTION|PACKAGE|TYPE|SUBTYPE|CONSTANT|SIGNAL|VARIABLE|COMPONENT|LABEL_TOKEN|LITERAL_TOKEN|UNITS|GROUP|FILE|PROPERTY|SEQUENCE|VIEW
  public static boolean entity_class(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_CLASS, "<entity class>");
    r = consumeToken(b, ENTITY);
    if (!r) r = consumeToken(b, ARCHITECTURE);
    if (!r) r = consumeToken(b, CONFIGURATION);
    if (!r) r = consumeToken(b, PROCEDURE);
    if (!r) r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, PACKAGE);
    if (!r) r = consumeToken(b, TYPE);
    if (!r) r = consumeToken(b, SUBTYPE);
    if (!r) r = consumeToken(b, CONSTANT);
    if (!r) r = consumeToken(b, SIGNAL);
    if (!r) r = consumeToken(b, VARIABLE);
    if (!r) r = consumeToken(b, COMPONENT);
    if (!r) r = consumeToken(b, LABEL_TOKEN);
    if (!r) r = consumeToken(b, LITERAL_TOKEN);
    if (!r) r = consumeToken(b, UNITS);
    if (!r) r = consumeToken(b, GROUP);
    if (!r) r = consumeToken(b, FILE);
    if (!r) r = consumeToken(b, PROPERTY);
    if (!r) r = consumeToken(b, SEQUENCE);
    if (!r) r = consumeToken(b, VIEW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // entity_class ('<>')?
  public static boolean entity_class_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_CLASS_ENTRY, "<entity class entry>");
    r = entity_class(b, l + 1);
    r = r && entity_class_entry_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('<>')?
  private static boolean entity_class_entry_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry_1")) return false;
    entity_class_entry_1_0(b, l + 1);
    return true;
  }

  // ('<>')
  private static boolean entity_class_entry_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<>");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // entity_class_entry ( ',' entity_class_entry )*
  public static boolean entity_class_entry_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_CLASS_ENTRY_LIST, "<entity class entry list>");
    r = entity_class_entry(b, l + 1);
    r = r && entity_class_entry_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' entity_class_entry )*
  private static boolean entity_class_entry_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!entity_class_entry_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity_class_entry_list_1", c)) break;
    }
    return true;
  }

  // ',' entity_class_entry
  private static boolean entity_class_entry_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && entity_class_entry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ENTITY IDENTIFIER IS entity_header entity_declarative_part entity_declaration_statement_part? END ENTITY? i_entity_simple_name? SEMICOLON
  public static boolean entity_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration")) return false;
    if (!nextTokenIs(b, ENTITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENTITY, IDENTIFIER, IS);
    r = r && entity_header(b, l + 1);
    r = r && entity_declarative_part(b, l + 1);
    r = r && entity_declaration_5(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && entity_declaration_7(b, l + 1);
    r = r && entity_declaration_8(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ENTITY_DECLARATION, r);
    return r;
  }

  // entity_declaration_statement_part?
  private static boolean entity_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_5")) return false;
    entity_declaration_statement_part(b, l + 1);
    return true;
  }

  // ENTITY?
  private static boolean entity_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_7")) return false;
    consumeToken(b, ENTITY);
    return true;
  }

  // i_entity_simple_name?
  private static boolean entity_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_8")) return false;
    i_entity_simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BEGIN entity_statement_part
  static boolean entity_declaration_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_statement_part")) return false;
    if (!nextTokenIs(b, BEGIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BEGIN);
    r = r && entity_statement_part(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // subprogram_declaration|subprogram_body|subprogram_instantiation_declaration|package_declaration|package_body|package_instantiation_declaration|type_declaration|subtype_declaration|mode_view_declaration|constant_declaration|signal_declaration|i_shared_variable_declaration|file_declaration|alias_declaration|attribute_declaration|attribute_specification|disconnection_specification|use_clause|group_template_declaration|group_declaration|i_PSL_Property_Declaration|i_PSL_Sequence_Declaration|i_PSL_Clock_Declaration
  public static boolean entity_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_DECLARATIVE_ITEM, "<entity declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = subprogram_instantiation_declaration(b, l + 1);
    if (!r) r = package_declaration(b, l + 1);
    if (!r) r = package_body(b, l + 1);
    if (!r) r = package_instantiation_declaration(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = mode_view_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = i_shared_variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = disconnection_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    if (!r) r = i_PSL_Property_Declaration(b, l + 1);
    if (!r) r = i_PSL_Sequence_Declaration(b, l + 1);
    if (!r) r = i_PSL_Clock_Declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // entity_declarative_item*
  static boolean entity_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declarative_part")) return false;
    while (true) {
      int c = current_position_(b);
      if (!entity_declarative_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity_declarative_part", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // entity_tag signature?
  public static boolean entity_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_DESIGNATOR, "<entity designator>");
    r = entity_tag(b, l + 1);
    r = r && entity_designator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // signature?
  private static boolean entity_designator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_designator_1")) return false;
    signature(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // i_formal_generic_clause? i_formal_port_clause?
  public static boolean entity_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_HEADER, "<entity header>");
    r = entity_header_0(b, l + 1);
    r = r && entity_header_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // i_formal_generic_clause?
  private static boolean entity_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_header_0")) return false;
    i_formal_generic_clause(b, l + 1);
    return true;
  }

  // i_formal_port_clause?
  private static boolean entity_header_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_header_1")) return false;
    i_formal_port_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (entity_designator ( ',' entity_designator )* )|OTHERS|ALL
  public static boolean entity_name_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_name_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_NAME_LIST, "<entity name list>");
    r = entity_name_list_0(b, l + 1);
    if (!r) r = consumeToken(b, OTHERS);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // entity_designator ( ',' entity_designator )*
  private static boolean entity_name_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_name_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_designator(b, l + 1);
    r = r && entity_name_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' entity_designator )*
  private static boolean entity_name_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_name_list_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!entity_name_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity_name_list_0_1", c)) break;
    }
    return true;
  }

  // ',' entity_designator
  private static boolean entity_name_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_name_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && entity_designator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // entity_name_list ':' entity_class
  public static boolean entity_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_SPECIFICATION, "<entity specification>");
    r = entity_name_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && entity_class(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // concurrent_assertion_statement|i_passive_concurrent_procedure_call_statement|i_passive_process_statement|i_PSL_Directive
  public static boolean entity_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_STATEMENT, "<entity statement>");
    r = concurrent_assertion_statement(b, l + 1);
    if (!r) r = i_passive_concurrent_procedure_call_statement(b, l + 1);
    if (!r) r = i_passive_process_statement(b, l + 1);
    if (!r) r = i_PSL_Directive(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // entity_statement*
  static boolean entity_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_statement_part")) return false;
    while (true) {
      int c = current_position_(b);
      if (!entity_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity_statement_part", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // simple_name|character_literal|operator_symbol
  public static boolean entity_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_tag")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_TAG, "<entity tag>");
    r = simple_name(b, l + 1);
    if (!r) r = character_literal(b, l + 1);
    if (!r) r = operator_symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER|character_literal
  public static boolean enumeration_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumeration_literal")) return false;
    if (!nextTokenIs(b, "<enumeration literal>", CHARACTER_LITERAL_TOKEN, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUMERATION_LITERAL, "<enumeration literal>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = character_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' enumeration_literal (',' enumeration_literal)* ')'
  public static boolean enumeration_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumeration_type_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUMERATION_TYPE_DEFINITION, "<enumeration type definition>");
    r = consumeToken(b, "(");
    r = r && enumeration_literal(b, l + 1);
    r = r && enumeration_type_definition_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' enumeration_literal)*
  private static boolean enumeration_type_definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumeration_type_definition_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enumeration_type_definition_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enumeration_type_definition_2", c)) break;
    }
    return true;
  }

  // ',' enumeration_literal
  private static boolean enumeration_type_definition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumeration_type_definition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && enumeration_literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( label ':' )? EXIT i_loop_label? (WHEN condition)? SEMICOLON
  public static boolean exit_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement")) return false;
    if (!nextTokenIs(b, "<exit statement>", EXIT, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXIT_STATEMENT, "<exit statement>");
    r = exit_statement_0(b, l + 1);
    r = r && consumeToken(b, EXIT);
    r = r && exit_statement_2(b, l + 1);
    r = r && exit_statement_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( label ':' )?
  private static boolean exit_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_0")) return false;
    exit_statement_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean exit_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // i_loop_label?
  private static boolean exit_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_2")) return false;
    i_loop_label(b, l + 1);
    return true;
  }

  // (WHEN condition)?
  private static boolean exit_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_3")) return false;
    exit_statement_3_0(b, l + 1);
    return true;
  }

  // WHEN condition
  private static boolean exit_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (('E'|'e') '+'? INTEGER)|(('E'|'e')'-' INTEGER)
  public static boolean exponent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPONENT, "<exponent>");
    r = exponent_0(b, l + 1);
    if (!r) r = exponent_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('E'|'e') '+'? INTEGER
  private static boolean exponent_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exponent_0_0(b, l + 1);
    r = r && exponent_0_1(b, l + 1);
    r = r && consumeToken(b, INTEGER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'E'|'e'
  private static boolean exponent_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_0_0")) return false;
    boolean r;
    r = consumeToken(b, "E");
    if (!r) r = consumeToken(b, "e");
    return r;
  }

  // '+'?
  private static boolean exponent_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_0_1")) return false;
    consumeToken(b, "+");
    return true;
  }

  // ('E'|'e')'-' INTEGER
  private static boolean exponent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exponent_1_0(b, l + 1);
    r = r && consumeToken(b, "-");
    r = r && consumeToken(b, INTEGER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'E'|'e'
  private static boolean exponent_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_1_0")) return false;
    boolean r;
    r = consumeToken(b, "E");
    if (!r) r = consumeToken(b, "e");
    return r;
  }

  /* ********************************************************** */
  // (condition_operator primary)|logical_expression
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    if (!r) r = logical_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // condition_operator primary
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = condition_operator(b, l + 1);
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression|UNAFFECTED
  public static boolean expression_or_unaffected(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_or_unaffected")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_OR_UNAFFECTED, "<expression or unaffected>");
    r = expression(b, l + 1);
    if (!r) r = consumeToken(b, UNAFFECTED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<<' CONSTANT external_pathname ':' interface_type_indication '>>'
  public static boolean external_constant_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_constant_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTERNAL_CONSTANT_NAME, "<external constant name>");
    r = consumeToken(b, "<<");
    r = r && consumeToken(b, CONSTANT);
    r = r && external_pathname(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && interface_type_indication(b, l + 1);
    r = r && consumeToken(b, ">>");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // external_constant_name|external_signal_name|external_variable_name
  public static boolean external_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTERNAL_NAME, "<external name>");
    r = external_constant_name(b, l + 1);
    if (!r) r = external_signal_name(b, l + 1);
    if (!r) r = external_variable_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // package_pathname|absolute_pathname|relative_pathname
  public static boolean external_pathname(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_pathname")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTERNAL_PATHNAME, "<external pathname>");
    r = package_pathname(b, l + 1);
    if (!r) r = absolute_pathname(b, l + 1);
    if (!r) r = relative_pathname(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<<' SIGNAL external_pathname ':' interface_type_indication '>>'
  public static boolean external_signal_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_signal_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTERNAL_SIGNAL_NAME, "<external signal name>");
    r = consumeToken(b, "<<");
    r = r && consumeToken(b, SIGNAL);
    r = r && external_pathname(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && interface_type_indication(b, l + 1);
    r = r && consumeToken(b, ">>");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<<' VARIABLE external_pathname ':' interface_type_indication '>>'
  public static boolean external_variable_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_variable_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTERNAL_VARIABLE_NAME, "<external variable name>");
    r = consumeToken(b, "<<");
    r = r && consumeToken(b, VARIABLE);
    r = r && external_pathname(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && interface_type_indication(b, l + 1);
    r = r && consumeToken(b, ">>");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // unary_expression ('**' unary_expression)?
  public static boolean factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FACTOR, "<factor>");
    r = unary_expression(b, l + 1);
    r = r && factor_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('**' unary_expression)?
  private static boolean factor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_1")) return false;
    factor_1_0(b, l + 1);
    return true;
  }

  // '**' unary_expression
  private static boolean factor_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FILE identifier_list ':' subtype_indication file_open_information? SEMICOLON
  public static boolean file_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_declaration")) return false;
    if (!nextTokenIs(b, FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILE);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && subtype_indication(b, l + 1);
    r = r && file_declaration_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, FILE_DECLARATION, r);
    return r;
  }

  // file_open_information?
  private static boolean file_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_declaration_4")) return false;
    file_open_information(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FILE OF i_file_incomplete_type_mark
  public static boolean file_incomplete_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_incomplete_type_definition")) return false;
    if (!nextTokenIs(b, FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FILE, OF);
    r = r && i_file_incomplete_type_mark(b, l + 1);
    exit_section_(b, m, FILE_INCOMPLETE_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // i_string_expression
  public static boolean file_logical_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_logical_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_LOGICAL_NAME, "<file logical name>");
    r = i_string_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( OPEN iii_file_open_kind_expression )? IS file_logical_name
  public static boolean file_open_information(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_open_information")) return false;
    if (!nextTokenIs(b, "<file open information>", IS, OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_OPEN_INFORMATION, "<file open information>");
    r = file_open_information_0(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && file_logical_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( OPEN iii_file_open_kind_expression )?
  private static boolean file_open_information_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_open_information_0")) return false;
    file_open_information_0_0(b, l + 1);
    return true;
  }

  // OPEN iii_file_open_kind_expression
  private static boolean file_open_information_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_open_information_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN);
    r = r && iii_file_open_kind_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FILE OF type_mark
  public static boolean file_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_type_definition")) return false;
    if (!nextTokenIs(b, FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FILE, OF);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, FILE_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // RANGE_TOKEN '<>.<>'
  public static boolean floating_incomplete_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_incomplete_type_definition")) return false;
    if (!nextTokenIs(b, RANGE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RANGE_TOKEN);
    r = r && consumeToken(b, "<>.<>");
    exit_section_(b, m, FLOATING_INCOMPLETE_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // range_constraint
  public static boolean floating_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_type_definition")) return false;
    if (!nextTokenIs(b, RANGE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = range_constraint(b, l + 1);
    exit_section_(b, m, FLOATING_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // i_generate_label ':' FOR i_generate_parameter_specification GENERATE generate_statement_body END GENERATE i_generate_label? SEMICOLON
  public static boolean for_generate_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_generate_statement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_generate_label(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, FOR);
    r = r && i_generate_parameter_specification(b, l + 1);
    r = r && consumeToken(b, GENERATE);
    r = r && generate_statement_body(b, l + 1);
    r = r && consumeTokens(b, 0, END, GENERATE);
    r = r && for_generate_statement_8(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, FOR_GENERATE_STATEMENT, r);
    return r;
  }

  // i_generate_label?
  private static boolean for_generate_statement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_generate_statement_8")) return false;
    i_generate_label(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IN|OUT
  public static boolean force_mode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "force_mode")) return false;
    if (!nextTokenIs(b, "<force mode>", IN, OUT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORCE_MODE, "<force mode>");
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OUT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (i_generic_name signature?)|i_port_name|i_parameter_name
  public static boolean formal_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_DESIGNATOR, "<formal designator>");
    r = formal_designator_0(b, l + 1);
    if (!r) r = i_port_name(b, l + 1);
    if (!r) r = i_parameter_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // i_generic_name signature?
  private static boolean formal_designator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_designator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_generic_name(b, l + 1);
    r = r && formal_designator_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // signature?
  private static boolean formal_designator_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_designator_0_1")) return false;
    signature(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // i_parameter_interface_list
  public static boolean formal_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETER_LIST, "<formal parameter list>");
    r = i_parameter_interface_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // formal_designator|(i_function_name '(' formal_designator ')')|(type_mark '(' formal_designator ')')
  public static boolean formal_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PART, "<formal part>");
    r = formal_designator(b, l + 1);
    if (!r) r = formal_part_1(b, l + 1);
    if (!r) r = formal_part_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // i_function_name '(' formal_designator ')'
  private static boolean formal_part_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_part_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_function_name(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && formal_designator(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // type_mark '(' formal_designator ')'
  private static boolean formal_part_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_part_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && formal_designator(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE IDENTIFIER IS type_definition SEMICOLON
  public static boolean full_type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "full_type_declaration")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, IDENTIFIER, IS);
    r = r && type_definition(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, FULL_TYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // i_function_name generic_map_aspect? parameter_map_aspect?
  public static boolean function_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL, "<function call>");
    r = i_function_name(b, l + 1);
    r = r && function_call_1(b, l + 1);
    r = r && function_call_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // generic_map_aspect?
  private static boolean function_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_1")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  // parameter_map_aspect?
  private static boolean function_call_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_2")) return false;
    parameter_map_aspect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (PURE|IMPURE)? FUNCTION designator subprogram_header (PARAMETER? '(' formal_parameter_list ')' )? RETURN (i_return_identifier OF)? type_mark
  public static boolean function_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_SPECIFICATION, "<function specification>");
    r = function_specification_0(b, l + 1);
    r = r && consumeToken(b, FUNCTION);
    r = r && designator(b, l + 1);
    r = r && subprogram_header(b, l + 1);
    r = r && function_specification_4(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && function_specification_6(b, l + 1);
    r = r && type_mark(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (PURE|IMPURE)?
  private static boolean function_specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification_0")) return false;
    function_specification_0_0(b, l + 1);
    return true;
  }

  // PURE|IMPURE
  private static boolean function_specification_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification_0_0")) return false;
    boolean r;
    r = consumeToken(b, PURE);
    if (!r) r = consumeToken(b, IMPURE);
    return r;
  }

  // (PARAMETER? '(' formal_parameter_list ')' )?
  private static boolean function_specification_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification_4")) return false;
    function_specification_4_0(b, l + 1);
    return true;
  }

  // PARAMETER? '(' formal_parameter_list ')'
  private static boolean function_specification_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_specification_4_0_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && formal_parameter_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // PARAMETER?
  private static boolean function_specification_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification_4_0_0")) return false;
    consumeToken(b, PARAMETER);
    return true;
  }

  // (i_return_identifier OF)?
  private static boolean function_specification_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification_6")) return false;
    function_specification_6_0(b, l + 1);
    return true;
  }

  // i_return_identifier OF
  private static boolean function_specification_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_return_identifier(b, l + 1);
    r = r && consumeToken(b, OF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // i_static_discrete_range|i_static_expression|i_alternative_label
  public static boolean generate_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERATE_SPECIFICATION, "<generate specification>");
    r = i_static_discrete_range(b, l + 1);
    if (!r) r = i_static_expression(b, l + 1);
    if (!r) r = i_alternative_label(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // for_generate_statement|if_generate_statement|case_generate_statement
  public static boolean generate_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = for_generate_statement(b, l + 1);
    if (!r) r = if_generate_statement(b, l + 1);
    if (!r) r = case_generate_statement(b, l + 1);
    exit_section_(b, m, GENERATE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // (block_declarative_part BEGIN)? concurrent_statement* (END ( i_alternative_label ':' )? SEMICOLON)?
  public static boolean generate_statement_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERATE_STATEMENT_BODY, "<generate statement body>");
    r = generate_statement_body_0(b, l + 1);
    r = r && generate_statement_body_1(b, l + 1);
    r = r && generate_statement_body_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (block_declarative_part BEGIN)?
  private static boolean generate_statement_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_body_0")) return false;
    generate_statement_body_0_0(b, l + 1);
    return true;
  }

  // block_declarative_part BEGIN
  private static boolean generate_statement_body_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_body_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    exit_section_(b, m, null, r);
    return r;
  }

  // concurrent_statement*
  private static boolean generate_statement_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_body_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!concurrent_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generate_statement_body_1", c)) break;
    }
    return true;
  }

  // (END ( i_alternative_label ':' )? SEMICOLON)?
  private static boolean generate_statement_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_body_2")) return false;
    generate_statement_body_2_0(b, l + 1);
    return true;
  }

  // END ( i_alternative_label ':' )? SEMICOLON
  private static boolean generate_statement_body_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_body_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, END);
    r = r && generate_statement_body_2_0_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( i_alternative_label ':' )?
  private static boolean generate_statement_body_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_body_2_0_1")) return false;
    generate_statement_body_2_0_1_0(b, l + 1);
    return true;
  }

  // i_alternative_label ':'
  private static boolean generate_statement_body_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_body_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_alternative_label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ii_generate_statement_label ( '(' generate_specification ')' )?
  public static boolean generate_statement_label_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_label_specification")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ii_generate_statement_label(b, l + 1);
    r = r && generate_statement_label_specification_1(b, l + 1);
    exit_section_(b, m, GENERATE_STATEMENT_LABEL_SPECIFICATION, r);
    return r;
  }

  // ( '(' generate_specification ')' )?
  private static boolean generate_statement_label_specification_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_label_specification_1")) return false;
    generate_statement_label_specification_1_0(b, l + 1);
    return true;
  }

  // '(' generate_specification ')'
  private static boolean generate_statement_label_specification_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_label_specification_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && generate_specification(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GENERIC '(' generic_list ')' SEMICOLON
  public static boolean generic_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_clause")) return false;
    if (!nextTokenIs(b, GENERIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GENERIC);
    r = r && consumeToken(b, "(");
    r = r && generic_list(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, GENERIC_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // i_generic_interface_list
  public static boolean generic_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_LIST, "<generic list>");
    r = i_generic_interface_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // GENERIC MAP '(' i_generic_association_list ')'
  public static boolean generic_map_aspect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_map_aspect")) return false;
    if (!nextTokenIs(b, GENERIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GENERIC, MAP);
    r = r && consumeToken(b, "(");
    r = r && i_generic_association_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, GENERIC_MAP_ASPECT, r);
    return r;
  }

  /* ********************************************************** */
  // name_s|character_literal
  public static boolean group_constituent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_constituent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_CONSTITUENT, "<group constituent>");
    r = name_s(b, l + 1);
    if (!r) r = character_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // group_constituent ( ',' group_constituent )*
  public static boolean group_constituent_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_constituent_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_CONSTITUENT_LIST, "<group constituent list>");
    r = group_constituent(b, l + 1);
    r = r && group_constituent_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' group_constituent )*
  private static boolean group_constituent_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_constituent_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!group_constituent_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "group_constituent_list_1", c)) break;
    }
    return true;
  }

  // ',' group_constituent
  private static boolean group_constituent_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_constituent_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && group_constituent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GROUP IDENTIFIER ':' ii_group_template_name '(' group_constituent_list ')' SEMICOLON
  public static boolean group_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_declaration")) return false;
    if (!nextTokenIs(b, GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GROUP, IDENTIFIER);
    r = r && consumeToken(b, ":");
    r = r && ii_group_template_name(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && group_constituent_list(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, GROUP_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // GROUP IDENTIFIER IS '(' entity_class_entry_list ')' SEMICOLON
  public static boolean group_template_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_template_declaration")) return false;
    if (!nextTokenIs(b, GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GROUP, IDENTIFIER, IS);
    r = r && consumeToken(b, "(");
    r = r && entity_class_entry_list(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, GROUP_TEMPLATE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // i_guarded_signal_list ':' type_mark
  public static boolean guarded_signal_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "guarded_signal_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GUARDED_SIGNAL_SPECIFICATION, "<guarded signal specification>");
    r = i_guarded_signal_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && type_mark(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "TODOTODOTODOTODO545424"
  public static boolean i_PSL_Clock_Declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_PSL_Clock_Declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PSL_CLOCK_DECLARATION, "<i psl clock declaration>");
    r = consumeToken(b, "TODOTODOTODOTODO545424");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "TODOTODOTODOTODO545424"
  public static boolean i_PSL_Directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_PSL_Directive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PSL_DIRECTIVE, "<i psl directive>");
    r = consumeToken(b, "TODOTODOTODOTODO545424");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "TODOTODOTODOTODO545424"
  public static boolean i_PSL_Property_Declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_PSL_Property_Declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PSL_PROPERTY_DECLARATION, "<i psl property declaration>");
    r = consumeToken(b, "TODOTODOTODOTODO545424");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "TODOTODOTODOTODO545424"
  public static boolean i_PSL_Sequence_Declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_PSL_Sequence_Declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PSL_SEQUENCE_DECLARATION, "<i psl sequence declaration>");
    r = consumeToken(b, "TODOTODOTODOTODO545424");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "TODOTODOTODOTODO545424"
  public static boolean i_PSL_verification_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_PSL_verification_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PSL_VERIFICATION_UNIT, "<i psl verification unit>");
    r = consumeToken(b, "TODOTODOTODOTODO545424");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // incomplete_subtype_indication
  public static boolean i_access_incomplete_subtype_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_access_incomplete_subtype_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_ACCESS_INCOMPLETE_SUBTYPE_INDICATION, "<i access incomplete subtype indication>");
    r = incomplete_subtype_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // label
  public static boolean i_alternative_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_alternative_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    exit_section_(b, m, I_ALTERNATIVE_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean i_architecture_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_architecture_identifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, I_ARCHITECTURE_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_architecture_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_architecture_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_ARCHITECTURE_NAME, "<i architecture name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean i_architecture_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_architecture_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, I_ARCHITECTURE_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean i_attribute_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_attribute_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, I_ATTRIBUTE_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // label
  public static boolean i_block_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_block_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    exit_section_(b, m, I_BLOCK_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // label
  public static boolean i_case_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_case_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    exit_section_(b, m, I_CASE_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_component_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_component_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_COMPONENT_NAME, "<i component name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean i_component_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_component_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, I_COMPONENT_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_configuration_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_configuration_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_CONFIGURATION_NAME, "<i configuration name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean i_configuration_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_configuration_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, I_CONFIGURATION_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean i_context_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_context_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, I_CONTEXT_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // subtype_indication
  public static boolean i_discrete_subtype_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_discrete_subtype_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_DISCRETE_SUBTYPE_INDICATION, "<i discrete subtype indication>");
    r = subtype_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // incomplete_subtype_indication
  public static boolean i_element_incomplete_subtype_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_element_incomplete_subtype_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_ELEMENT_INCOMPLETE_SUBTYPE_INDICATION, "<i element incomplete subtype indication>");
    r = incomplete_subtype_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean i_element_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_element_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, I_ELEMENT_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // subtype_indication
  public static boolean i_element_subtype_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_element_subtype_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_ELEMENT_SUBTYPE_INDICATION, "<i element subtype indication>");
    r = subtype_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_entity_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_entity_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_ENTITY_NAME, "<i entity name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean i_entity_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_entity_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, I_ENTITY_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // incomplete_type_mark
  public static boolean i_file_incomplete_type_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_file_incomplete_type_mark")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_FILE_INCOMPLETE_TYPE_MARK, "<i file incomplete type mark>");
    r = incomplete_type_mark(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_file_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_file_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_FILE_NAME, "<i file name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // generic_clause
  public static boolean i_formal_generic_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_formal_generic_clause")) return false;
    if (!nextTokenIs(b, GENERIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_clause(b, l + 1);
    exit_section_(b, m, I_FORMAL_GENERIC_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // port_clause
  public static boolean i_formal_port_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_formal_port_clause")) return false;
    if (!nextTokenIs(b, PORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_clause(b, l + 1);
    exit_section_(b, m, I_FORMAL_PORT_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_function_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_function_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_FUNCTION_NAME, "<i function name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // label
  public static boolean i_generate_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_generate_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    exit_section_(b, m, I_GENERATE_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // parameter_specification
  public static boolean i_generate_parameter_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_generate_parameter_specification")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_specification(b, l + 1);
    exit_section_(b, m, I_GENERATE_PARAMETER_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // association_list
  public static boolean i_generic_association_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_generic_association_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_GENERIC_ASSOCIATION_LIST, "<i generic association list>");
    r = association_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // interface_list
  public static boolean i_generic_interface_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_generic_interface_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_GENERIC_INTERFACE_LIST, "<i generic interface list>");
    r = interface_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_generic_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_generic_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_GENERIC_NAME, "<i generic name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // condition
  public static boolean i_guard_condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_guard_condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_GUARD_CONDITION, "<i guard condition>");
    r = condition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // signal_list
  public static boolean i_guarded_signal_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_guarded_signal_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_GUARDED_SIGNAL_LIST, "<i guarded signal list>");
    r = signal_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // label
  public static boolean i_if_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_if_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    exit_section_(b, m, I_IF_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // label
  public static boolean i_instantiation_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_instantiation_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    exit_section_(b, m, I_INSTANTIATION_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // logical_name
  public static boolean i_library_logical_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_library_logical_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = logical_name(b, l + 1);
    exit_section_(b, m, I_LIBRARY_LOGICAL_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // generic_clause
  public static boolean i_local_generic_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_local_generic_clause")) return false;
    if (!nextTokenIs(b, GENERIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_clause(b, l + 1);
    exit_section_(b, m, I_LOCAL_GENERIC_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // port_clause
  public static boolean i_local_port_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_local_port_clause")) return false;
    if (!nextTokenIs(b, PORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_clause(b, l + 1);
    exit_section_(b, m, I_LOCAL_PORT_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // label
  public static boolean i_loop_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_loop_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    exit_section_(b, m, I_LOOP_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // parameter_specification
  public static boolean i_loop_parameter_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_loop_parameter_specification")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_specification(b, l + 1);
    exit_section_(b, m, I_LOOP_PARAMETER_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean i_object_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_object_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, I_OBJECT_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean i_package_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_package_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, I_PACKAGE_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // association_list
  public static boolean i_parameter_association_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_parameter_association_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PARAMETER_ASSOCIATION_LIST, "<i parameter association list>");
    r = association_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // interface_list
  public static boolean i_parameter_interface_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_parameter_interface_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PARAMETER_INTERFACE_LIST, "<i parameter interface list>");
    r = interface_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_parameter_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_parameter_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PARAMETER_NAME, "<i parameter name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // concurrent_procedure_call_statement
  public static boolean i_passive_concurrent_procedure_call_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_passive_concurrent_procedure_call_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PASSIVE_CONCURRENT_PROCEDURE_CALL_STATEMENT, "<i passive concurrent procedure call statement>");
    r = concurrent_procedure_call_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // process_statement
  public static boolean i_passive_process_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_passive_process_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PASSIVE_PROCESS_STATEMENT, "<i passive process statement>");
    r = process_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // association_list
  public static boolean i_port_association_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_port_association_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PORT_ASSOCIATION_LIST, "<i port association list>");
    r = association_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // interface_list
  public static boolean i_port_interface_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_port_interface_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PORT_INTERFACE_LIST, "<i port interface list>");
    r = interface_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_port_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_port_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PORT_NAME, "<i port name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_procedure_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_procedure_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_PROCEDURE_NAME, "<i procedure name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // label
  public static boolean i_process_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_process_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    exit_section_(b, m, I_PROCESS_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // attribute_name
  public static boolean i_range_attribute_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_range_attribute_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_RANGE_ATTRIBUTE_NAME, "<i range attribute name>");
    r = attribute_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean i_range_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_range_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_RANGE_EXPRESSION, "<i range expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean i_return_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_return_identifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, I_RETURN_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // SHARED nonshared_variable_declaration
  public static boolean i_shared_variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_shared_variable_declaration")) return false;
    if (!nextTokenIs(b, SHARED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SHARED);
    r = r && nonshared_variable_declaration(b, l + 1);
    exit_section_(b, m, I_SHARED_VARIABLE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // mode_indication
  public static boolean i_signal_mode_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_signal_mode_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_SIGNAL_MODE_INDICATION, "<i signal mode indication>");
    r = mode_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_signal_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_signal_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_SIGNAL_NAME, "<i signal name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // conditional_expression
  public static boolean i_static_conditional_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_static_conditional_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_STATIC_CONDITIONAL_EXPRESSION, "<i static conditional expression>");
    r = conditional_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // discrete_range
  public static boolean i_static_discrete_range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_static_discrete_range")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_STATIC_DISCRETE_RANGE, "<i static discrete range>");
    r = discrete_range(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean i_static_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_static_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_STATIC_EXPRESSION, "<i static expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean i_string_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_string_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_STRING_EXPRESSION, "<i string expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_subprogram_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_subprogram_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_SUBPROGRAM_NAME, "<i subprogram name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_subtype_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_subtype_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_SUBTYPE_NAME, "<i subtype name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean i_time_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_time_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_TIME_EXPRESSION, "<i time expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_type_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_type_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_TYPE_NAME, "<i type name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // logical_operator
  public static boolean i_unary_logical_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_unary_logical_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_UNARY_LOGICAL_OPERATOR, "<i unary logical operator>");
    r = logical_operator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_unit_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_unit_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_UNIT_NAME, "<i unit name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // subtype_indication
  public static boolean i_unresolved_array_subtype_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_unresolved_array_subtype_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_UNRESOLVED_ARRAY_SUBTYPE_INDICATION, "<i unresolved array subtype indication>");
    r = subtype_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // subtype_indication
  public static boolean i_unresolved_record_subtype_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_unresolved_record_subtype_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_UNRESOLVED_RECORD_SUBTYPE_INDICATION, "<i unresolved record subtype indication>");
    r = subtype_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean i_value_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_value_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_VALUE_EXPRESSION, "<i value expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean i_variable_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "i_variable_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, I_VARIABLE_NAME, "<i variable name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ( ',' IDENTIFIER )*
  public static boolean identifier_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && identifier_list_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER_LIST, r);
    return r;
  }

  // ( ',' IDENTIFIER )*
  private static boolean identifier_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identifier_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifier_list_1", c)) break;
    }
    return true;
  }

  // ',' IDENTIFIER
  private static boolean identifier_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // i_generate_label ':' if ( i_alternative_label ':' )? condition GENERATE generate_statement_body ( ELSIF ( i_alternative_label ':' ) condition GENERATE generate_statement_body )* ( ELSE ( i_alternative_label ':' )? GENERATE generate_statement_body)? END GENERATE i_generate_label? SEMICOLON
  public static boolean if_generate_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_generate_statement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_generate_label(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, IF);
    r = r && if_generate_statement_3(b, l + 1);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, GENERATE);
    r = r && generate_statement_body(b, l + 1);
    r = r && if_generate_statement_7(b, l + 1);
    r = r && if_generate_statement_8(b, l + 1);
    r = r && consumeTokens(b, 0, END, GENERATE);
    r = r && if_generate_statement_11(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, IF_GENERATE_STATEMENT, r);
    return r;
  }

  // ( i_alternative_label ':' )?
  private static boolean if_generate_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_generate_statement_3")) return false;
    if_generate_statement_3_0(b, l + 1);
    return true;
  }

  // i_alternative_label ':'
  private static boolean if_generate_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_generate_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_alternative_label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ELSIF ( i_alternative_label ':' ) condition GENERATE generate_statement_body )*
  private static boolean if_generate_statement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_generate_statement_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!if_generate_statement_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_generate_statement_7", c)) break;
    }
    return true;
  }

  // ELSIF ( i_alternative_label ':' ) condition GENERATE generate_statement_body
  private static boolean if_generate_statement_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_generate_statement_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSIF);
    r = r && if_generate_statement_7_0_1(b, l + 1);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, GENERATE);
    r = r && generate_statement_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // i_alternative_label ':'
  private static boolean if_generate_statement_7_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_generate_statement_7_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_alternative_label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ELSE ( i_alternative_label ':' )? GENERATE generate_statement_body)?
  private static boolean if_generate_statement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_generate_statement_8")) return false;
    if_generate_statement_8_0(b, l + 1);
    return true;
  }

  // ELSE ( i_alternative_label ':' )? GENERATE generate_statement_body
  private static boolean if_generate_statement_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_generate_statement_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && if_generate_statement_8_0_1(b, l + 1);
    r = r && consumeToken(b, GENERATE);
    r = r && generate_statement_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( i_alternative_label ':' )?
  private static boolean if_generate_statement_8_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_generate_statement_8_0_1")) return false;
    if_generate_statement_8_0_1_0(b, l + 1);
    return true;
  }

  // i_alternative_label ':'
  private static boolean if_generate_statement_8_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_generate_statement_8_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_alternative_label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // i_generate_label?
  private static boolean if_generate_statement_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_generate_statement_11")) return false;
    i_generate_label(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( i_if_label ':' )? IF condition THEN sequence_of_statements ( ELSIF condition THEN sequence_of_statements )* ( ELSE sequence_of_statements )? END IF i_if_label SEMICOLON
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, "<if statement>", IDENTIFIER, IF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, "<if statement>");
    r = if_statement_0(b, l + 1);
    r = r && consumeToken(b, IF);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && sequence_of_statements(b, l + 1);
    r = r && if_statement_5(b, l + 1);
    r = r && if_statement_6(b, l + 1);
    r = r && consumeTokens(b, 0, END, IF);
    r = r && i_if_label(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( i_if_label ':' )?
  private static boolean if_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_0")) return false;
    if_statement_0_0(b, l + 1);
    return true;
  }

  // i_if_label ':'
  private static boolean if_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_if_label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ELSIF condition THEN sequence_of_statements )*
  private static boolean if_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!if_statement_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_5", c)) break;
    }
    return true;
  }

  // ELSIF condition THEN sequence_of_statements
  private static boolean if_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSIF);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && sequence_of_statements(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ELSE sequence_of_statements )?
  private static boolean if_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_6")) return false;
    if_statement_6_0(b, l + 1);
    return true;
  }

  // ELSE sequence_of_statements
  private static boolean if_statement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && sequence_of_statements(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // label
  public static boolean ii_block_statement_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_block_statement_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    exit_section_(b, m, II_BLOCK_STATEMENT_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // label
  public static boolean ii_component_instantiation_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_component_instantiation_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    exit_section_(b, m, II_COMPONENT_INSTANTIATION_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // label
  public static boolean ii_generate_statement_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_generate_statement_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    exit_section_(b, m, II_GENERATE_STATEMENT_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean ii_group_template_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_group_template_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, II_GROUP_TEMPLATE_NAME, "<ii group template name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean ii_instantiated_package_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_instantiated_package_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, II_INSTANTIATED_PACKAGE_NAME, "<ii instantiated package name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean ii_mode_view_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_mode_view_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, II_MODE_VIEW_NAME, "<ii mode view name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean ii_mode_view_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_mode_view_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, II_MODE_VIEW_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean ii_physical_type_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_physical_type_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, II_PHYSICAL_TYPE_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean ii_protected_type_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_protected_type_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, II_PROTECTED_TYPE_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean ii_record_element_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_record_element_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, II_RECORD_ELEMENT_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  public static boolean ii_record_type_simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_record_type_simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name(b, l + 1);
    exit_section_(b, m, II_RECORD_TYPE_SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean ii_resolution_function_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_resolution_function_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, II_RESOLUTION_FUNCTION_NAME, "<ii resolution function name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // label
  public static boolean ii_sequential_block_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_sequential_block_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    exit_section_(b, m, II_SEQUENTIAL_BLOCK_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean ii_uninstantiated_package_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_uninstantiated_package_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, II_UNINSTANTIATED_PACKAGE_NAME, "<ii uninstantiated package name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean ii_uninstantiated_subprogram_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_uninstantiated_subprogram_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, II_UNINSTANTIATED_SUBPROGRAM_NAME, "<ii uninstantiated subprogram name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s
  public static boolean ii_verification_unit_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ii_verification_unit_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, II_VERIFICATION_UNIT_NAME, "<ii verification unit name>");
    r = name_s(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean iii_file_open_kind_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iii_file_open_kind_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, III_FILE_OPEN_KIND_EXPRESSION, "<iii file open kind expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // subtype_indication|unspecified_type_indication
  public static boolean incomplete_subtype_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "incomplete_subtype_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCOMPLETE_SUBTYPE_INDICATION, "<incomplete subtype indication>");
    r = subtype_indication(b, l + 1);
    if (!r) r = unspecified_type_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TYPE IDENTIFIER SEMICOLON
  public static boolean incomplete_type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "incomplete_type_declaration")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, IDENTIFIER, SEMICOLON);
    exit_section_(b, m, INCOMPLETE_TYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // private_incomplete_type_definition|scalar_incomplete_type_definition|discrete_incomplete_type_definition|integer_incomplete_type_definition|physical_incomplete_type_definition|floating_incomplete_type_definition|array_incomplete_type_definition|access_incomplete_type_definition|file_incomplete_type_definition
  public static boolean incomplete_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "incomplete_type_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCOMPLETE_TYPE_DEFINITION, "<incomplete type definition>");
    r = private_incomplete_type_definition(b, l + 1);
    if (!r) r = scalar_incomplete_type_definition(b, l + 1);
    if (!r) r = discrete_incomplete_type_definition(b, l + 1);
    if (!r) r = integer_incomplete_type_definition(b, l + 1);
    if (!r) r = physical_incomplete_type_definition(b, l + 1);
    if (!r) r = floating_incomplete_type_definition(b, l + 1);
    if (!r) r = array_incomplete_type_definition(b, l + 1);
    if (!r) r = access_incomplete_type_definition(b, l + 1);
    if (!r) r = file_incomplete_type_definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type_mark|unspecified_type_indication
  public static boolean incomplete_type_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "incomplete_type_mark")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCOMPLETE_TYPE_MARK, "<incomplete type mark>");
    r = type_mark(b, l + 1);
    if (!r) r = unspecified_type_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' discrete_range ( ',' discrete_range )* ')'
  public static boolean index_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INDEX_CONSTRAINT, "<index constraint>");
    r = consumeToken(b, "(");
    r = r && discrete_range(b, l + 1);
    r = r && index_constraint_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' discrete_range )*
  private static boolean index_constraint_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_constraint_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!index_constraint_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "index_constraint_2", c)) break;
    }
    return true;
  }

  // ',' discrete_range
  private static boolean index_constraint_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_constraint_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && discrete_range(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type_mark RANGE_TOKEN '<>'
  public static boolean index_subtype_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_subtype_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INDEX_SUBTYPE_DEFINITION, "<index subtype definition>");
    r = type_mark(b, l + 1);
    r = r && consumeToken(b, RANGE_TOKEN);
    r = r && consumeToken(b, "<>");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // prefix '(' expression ( ',' expression )* ')'
  public static boolean indexed_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INDEXED_NAME, "<indexed name>");
    r = prefix(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && indexed_name_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' expression )*
  private static boolean indexed_name_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_name_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!indexed_name_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "indexed_name_3", c)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean indexed_name_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_name_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (COMPONENT? i_component_name)|(ENTITY i_entity_name ( '(' i_architecture_identifier ')' )?)|(CONFIGURATION i_configuration_name)
  public static boolean instantiated_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTANTIATED_UNIT, "<instantiated unit>");
    r = instantiated_unit_0(b, l + 1);
    if (!r) r = instantiated_unit_1(b, l + 1);
    if (!r) r = instantiated_unit_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMPONENT? i_component_name
  private static boolean instantiated_unit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = instantiated_unit_0_0(b, l + 1);
    r = r && i_component_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMPONENT?
  private static boolean instantiated_unit_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_0_0")) return false;
    consumeToken(b, COMPONENT);
    return true;
  }

  // ENTITY i_entity_name ( '(' i_architecture_identifier ')' )?
  private static boolean instantiated_unit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENTITY);
    r = r && i_entity_name(b, l + 1);
    r = r && instantiated_unit_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( '(' i_architecture_identifier ')' )?
  private static boolean instantiated_unit_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_1_2")) return false;
    instantiated_unit_1_2_0(b, l + 1);
    return true;
  }

  // '(' i_architecture_identifier ')'
  private static boolean instantiated_unit_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && i_architecture_identifier(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // CONFIGURATION i_configuration_name
  private static boolean instantiated_unit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONFIGURATION);
    r = r && i_configuration_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (i_instantiation_label ( ',' i_instantiation_label )*)|OTHERS|ALL
  public static boolean instantiation_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiation_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTANTIATION_LIST, "<instantiation list>");
    r = instantiation_list_0(b, l + 1);
    if (!r) r = consumeToken(b, OTHERS);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // i_instantiation_label ( ',' i_instantiation_label )*
  private static boolean instantiation_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiation_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_instantiation_label(b, l + 1);
    r = r && instantiation_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' i_instantiation_label )*
  private static boolean instantiation_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiation_list_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instantiation_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "instantiation_list_0_1", c)) break;
    }
    return true;
  }

  // ',' i_instantiation_label
  private static boolean instantiation_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiation_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && i_instantiation_label(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RANGE_TOKEN '<>'
  public static boolean integer_incomplete_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_incomplete_type_definition")) return false;
    if (!nextTokenIs(b, RANGE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RANGE_TOKEN);
    r = r && consumeToken(b, "<>");
    exit_section_(b, m, INTEGER_INCOMPLETE_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // range_constraint
  public static boolean integer_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_type_definition")) return false;
    if (!nextTokenIs(b, RANGE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = range_constraint(b, l + 1);
    exit_section_(b, m, INTEGER_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // CONSTANT? identifier_list ':' IN? interface_type_indication ( ':=' i_static_conditional_expression )?
  public static boolean interface_constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration")) return false;
    if (!nextTokenIs(b, "<interface constant declaration>", CONSTANT, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_CONSTANT_DECLARATION, "<interface constant declaration>");
    r = interface_constant_declaration_0(b, l + 1);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && interface_constant_declaration_3(b, l + 1);
    r = r && interface_type_indication(b, l + 1);
    r = r && interface_constant_declaration_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CONSTANT?
  private static boolean interface_constant_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration_0")) return false;
    consumeToken(b, CONSTANT);
    return true;
  }

  // IN?
  private static boolean interface_constant_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration_3")) return false;
    consumeToken(b, IN);
    return true;
  }

  // ( ':=' i_static_conditional_expression )?
  private static boolean interface_constant_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration_5")) return false;
    interface_constant_declaration_5_0(b, l + 1);
    return true;
  }

  // ':=' i_static_conditional_expression
  private static boolean interface_constant_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":=");
    r = r && i_static_conditional_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // interface_object_declaration|interface_type_declaration|interface_subprogram_declaration|interface_package_declaration
  public static boolean interface_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_DECLARATION, "<interface declaration>");
    r = interface_object_declaration(b, l + 1);
    if (!r) r = interface_type_declaration(b, l + 1);
    if (!r) r = interface_subprogram_declaration(b, l + 1);
    if (!r) r = interface_package_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // interface_declaration
  public static boolean interface_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_ELEMENT, "<interface element>");
    r = interface_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FILE identifier_list ':' subtype_indication
  public static boolean interface_file_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_file_declaration")) return false;
    if (!nextTokenIs(b, FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILE);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && subtype_indication(b, l + 1);
    exit_section_(b, m, INTERFACE_FILE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // (PURE|IMPURE)? FUNCTION designator ( PARAMETER? '(' formal_parameter_list ')' )? RETURN type_mark
  public static boolean interface_function_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_function_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_FUNCTION_SPECIFICATION, "<interface function specification>");
    r = interface_function_specification_0(b, l + 1);
    r = r && consumeToken(b, FUNCTION);
    r = r && designator(b, l + 1);
    r = r && interface_function_specification_3(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && type_mark(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (PURE|IMPURE)?
  private static boolean interface_function_specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_function_specification_0")) return false;
    interface_function_specification_0_0(b, l + 1);
    return true;
  }

  // PURE|IMPURE
  private static boolean interface_function_specification_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_function_specification_0_0")) return false;
    boolean r;
    r = consumeToken(b, PURE);
    if (!r) r = consumeToken(b, IMPURE);
    return r;
  }

  // ( PARAMETER? '(' formal_parameter_list ')' )?
  private static boolean interface_function_specification_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_function_specification_3")) return false;
    interface_function_specification_3_0(b, l + 1);
    return true;
  }

  // PARAMETER? '(' formal_parameter_list ')'
  private static boolean interface_function_specification_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_function_specification_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_function_specification_3_0_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && formal_parameter_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // PARAMETER?
  private static boolean interface_function_specification_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_function_specification_3_0_0")) return false;
    consumeToken(b, PARAMETER);
    return true;
  }

  /* ********************************************************** */
  // interface_element ( SEMICOLON interface_element )* SEMICOLON?
  public static boolean interface_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_LIST, "<interface list>");
    r = interface_element(b, l + 1);
    r = r && interface_list_1(b, l + 1);
    r = r && interface_list_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( SEMICOLON interface_element )*
  private static boolean interface_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_list_1", c)) break;
    }
    return true;
  }

  // SEMICOLON interface_element
  private static boolean interface_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    r = r && interface_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON?
  private static boolean interface_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list_2")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // interface_constant_declaration|interface_signal_declaration|interface_variable_declaration|interface_file_declaration
  public static boolean interface_object_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_object_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_OBJECT_DECLARATION, "<interface object declaration>");
    r = interface_constant_declaration(b, l + 1);
    if (!r) r = interface_signal_declaration(b, l + 1);
    if (!r) r = interface_variable_declaration(b, l + 1);
    if (!r) r = interface_file_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PACKAGE IDENTIFIER IS NEW ii_uninstantiated_package_name interface_package_generic_map_aspect
  public static boolean interface_package_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_package_declaration")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PACKAGE, IDENTIFIER, IS, NEW);
    r = r && ii_uninstantiated_package_name(b, l + 1);
    r = r && interface_package_generic_map_aspect(b, l + 1);
    exit_section_(b, m, INTERFACE_PACKAGE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // generic_map_aspect|(GENERIC MAP '(' '<>' ')')|(GENERIC MAP '(' DEFAULT ')')
  public static boolean interface_package_generic_map_aspect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_package_generic_map_aspect")) return false;
    if (!nextTokenIs(b, GENERIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_map_aspect(b, l + 1);
    if (!r) r = interface_package_generic_map_aspect_1(b, l + 1);
    if (!r) r = interface_package_generic_map_aspect_2(b, l + 1);
    exit_section_(b, m, INTERFACE_PACKAGE_GENERIC_MAP_ASPECT, r);
    return r;
  }

  // GENERIC MAP '(' '<>' ')'
  private static boolean interface_package_generic_map_aspect_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_package_generic_map_aspect_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GENERIC, MAP);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, "<>");
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // GENERIC MAP '(' DEFAULT ')'
  private static boolean interface_package_generic_map_aspect_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_package_generic_map_aspect_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GENERIC, MAP);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, DEFAULT);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PROCEDURE designator ( PARAMETER? '(' formal_parameter_list ')' )?
  public static boolean interface_procedure_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_procedure_specification")) return false;
    if (!nextTokenIs(b, PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROCEDURE);
    r = r && designator(b, l + 1);
    r = r && interface_procedure_specification_2(b, l + 1);
    exit_section_(b, m, INTERFACE_PROCEDURE_SPECIFICATION, r);
    return r;
  }

  // ( PARAMETER? '(' formal_parameter_list ')' )?
  private static boolean interface_procedure_specification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_procedure_specification_2")) return false;
    interface_procedure_specification_2_0(b, l + 1);
    return true;
  }

  // PARAMETER? '(' formal_parameter_list ')'
  private static boolean interface_procedure_specification_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_procedure_specification_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_procedure_specification_2_0_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && formal_parameter_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // PARAMETER?
  private static boolean interface_procedure_specification_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_procedure_specification_2_0_0")) return false;
    consumeToken(b, PARAMETER);
    return true;
  }

  /* ********************************************************** */
  // SIGNAL? identifier_list ':' i_signal_mode_indication
  public static boolean interface_signal_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_signal_declaration")) return false;
    if (!nextTokenIs(b, "<interface signal declaration>", IDENTIFIER, SIGNAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_SIGNAL_DECLARATION, "<interface signal declaration>");
    r = interface_signal_declaration_0(b, l + 1);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && i_signal_mode_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SIGNAL?
  private static boolean interface_signal_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_signal_declaration_0")) return false;
    consumeToken(b, SIGNAL);
    return true;
  }

  /* ********************************************************** */
  // interface_subprogram_specification ( IS interface_subprogram_default )?
  public static boolean interface_subprogram_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_subprogram_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_SUBPROGRAM_DECLARATION, "<interface subprogram declaration>");
    r = interface_subprogram_specification(b, l + 1);
    r = r && interface_subprogram_declaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( IS interface_subprogram_default )?
  private static boolean interface_subprogram_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_subprogram_declaration_1")) return false;
    interface_subprogram_declaration_1_0(b, l + 1);
    return true;
  }

  // IS interface_subprogram_default
  private static boolean interface_subprogram_declaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_subprogram_declaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IS);
    r = r && interface_subprogram_default(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // i_subprogram_name|'<>'
  public static boolean interface_subprogram_default(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_subprogram_default")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_SUBPROGRAM_DEFAULT, "<interface subprogram default>");
    r = i_subprogram_name(b, l + 1);
    if (!r) r = consumeToken(b, "<>");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // interface_procedure_specification|interface_function_specification
  public static boolean interface_subprogram_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_subprogram_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_SUBPROGRAM_SPECIFICATION, "<interface subprogram specification>");
    r = interface_procedure_specification(b, l + 1);
    if (!r) r = interface_function_specification(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TYPE IDENTIFIER ( IS incomplete_type_definition )?
  public static boolean interface_type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_declaration")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, IDENTIFIER);
    r = r && interface_type_declaration_2(b, l + 1);
    exit_section_(b, m, INTERFACE_TYPE_DECLARATION, r);
    return r;
  }

  // ( IS incomplete_type_definition )?
  private static boolean interface_type_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_declaration_2")) return false;
    interface_type_declaration_2_0(b, l + 1);
    return true;
  }

  // IS incomplete_type_definition
  private static boolean interface_type_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IS);
    r = r && incomplete_type_definition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // subtype_indication|unspecified_type_indication
  public static boolean interface_type_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_TYPE_INDICATION, "<interface type indication>");
    r = subtype_indication(b, l + 1);
    if (!r) r = unspecified_type_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VARIABLE? identifier_list ':' mode? interface_type_indication ( ':=' i_static_conditional_expression )?
  public static boolean interface_variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration")) return false;
    if (!nextTokenIs(b, "<interface variable declaration>", IDENTIFIER, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_VARIABLE_DECLARATION, "<interface variable declaration>");
    r = interface_variable_declaration_0(b, l + 1);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && interface_variable_declaration_3(b, l + 1);
    r = r && interface_type_indication(b, l + 1);
    r = r && interface_variable_declaration_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VARIABLE?
  private static boolean interface_variable_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration_0")) return false;
    consumeToken(b, VARIABLE);
    return true;
  }

  // mode?
  private static boolean interface_variable_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration_3")) return false;
    mode(b, l + 1);
    return true;
  }

  // ( ':=' i_static_conditional_expression )?
  private static boolean interface_variable_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration_5")) return false;
    interface_variable_declaration_5_0(b, l + 1);
    return true;
  }

  // ':=' i_static_conditional_expression
  private static boolean interface_variable_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":=");
    r = r && i_static_conditional_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (WHILE condition)|(FOR i_loop_parameter_specification)
  public static boolean iteration_scheme(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_scheme")) return false;
    if (!nextTokenIs(b, "<iteration scheme>", FOR, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITERATION_SCHEME, "<iteration scheme>");
    r = iteration_scheme_0(b, l + 1);
    if (!r) r = iteration_scheme_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WHILE condition
  private static boolean iteration_scheme_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_scheme_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FOR i_loop_parameter_specification
  private static boolean iteration_scheme_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_scheme_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && i_loop_parameter_specification(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // LIBRARY logical_name_list SEMICOLON
  public static boolean library_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "library_clause")) return false;
    if (!nextTokenIs(b, LIBRARY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIBRARY);
    r = r && logical_name_list(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, LIBRARY_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // primary_unit|secondary_unit
  public static boolean library_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "library_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIBRARY_UNIT, "<library unit>");
    r = primary_unit(b, l + 1);
    if (!r) r = secondary_unit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // numeric_literal|enumeration_literal|string_literal|bit_string_literal|NULL
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = numeric_literal(b, l + 1);
    if (!r) r = enumeration_literal(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    if (!r) r = bit_string_literal(b, l + 1);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (relation (AND relation)*)|(relation (OR relation)*)|(relation (XOR relation)*)|(relation (NAND relation)*)|(relation (NOR relation)*)|(relation (XNOR relation)*)
  public static boolean logical_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_EXPRESSION, "<logical expression>");
    r = logical_expression_0(b, l + 1);
    if (!r) r = logical_expression_1(b, l + 1);
    if (!r) r = logical_expression_2(b, l + 1);
    if (!r) r = logical_expression_3(b, l + 1);
    if (!r) r = logical_expression_4(b, l + 1);
    if (!r) r = logical_expression_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // relation (AND relation)*
  private static boolean logical_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation(b, l + 1);
    r = r && logical_expression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AND relation)*
  private static boolean logical_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!logical_expression_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logical_expression_0_1", c)) break;
    }
    return true;
  }

  // AND relation
  private static boolean logical_expression_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relation (OR relation)*
  private static boolean logical_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation(b, l + 1);
    r = r && logical_expression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OR relation)*
  private static boolean logical_expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!logical_expression_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logical_expression_1_1", c)) break;
    }
    return true;
  }

  // OR relation
  private static boolean logical_expression_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relation (XOR relation)*
  private static boolean logical_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation(b, l + 1);
    r = r && logical_expression_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (XOR relation)*
  private static boolean logical_expression_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!logical_expression_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logical_expression_2_1", c)) break;
    }
    return true;
  }

  // XOR relation
  private static boolean logical_expression_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XOR);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relation (NAND relation)*
  private static boolean logical_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation(b, l + 1);
    r = r && logical_expression_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NAND relation)*
  private static boolean logical_expression_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!logical_expression_3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logical_expression_3_1", c)) break;
    }
    return true;
  }

  // NAND relation
  private static boolean logical_expression_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAND);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relation (NOR relation)*
  private static boolean logical_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation(b, l + 1);
    r = r && logical_expression_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NOR relation)*
  private static boolean logical_expression_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_4_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!logical_expression_4_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logical_expression_4_1", c)) break;
    }
    return true;
  }

  // NOR relation
  private static boolean logical_expression_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_4_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOR);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relation (XNOR relation)*
  private static boolean logical_expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation(b, l + 1);
    r = r && logical_expression_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (XNOR relation)*
  private static boolean logical_expression_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_5_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!logical_expression_5_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logical_expression_5_1", c)) break;
    }
    return true;
  }

  // XNOR relation
  private static boolean logical_expression_5_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_5_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XNOR);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean logical_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, LOGICAL_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // logical_name ( ',' logical_name )*
  public static boolean logical_name_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_name_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = logical_name(b, l + 1);
    r = r && logical_name_list_1(b, l + 1);
    exit_section_(b, m, LOGICAL_NAME_LIST, r);
    return r;
  }

  // ( ',' logical_name )*
  private static boolean logical_name_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_name_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!logical_name_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logical_name_list_1", c)) break;
    }
    return true;
  }

  // ',' logical_name
  private static boolean logical_name_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_name_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && logical_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AND|OR|NAND|NOR|XOR|XNOR
  public static boolean logical_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_OPERATOR, "<logical operator>");
    r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, NAND);
    if (!r) r = consumeToken(b, NOR);
    if (!r) r = consumeToken(b, XOR);
    if (!r) r = consumeToken(b, XNOR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( i_loop_label ':' )? iteration_scheme? LOOP sequence_of_statements END LOOP i_loop_label? SEMICOLON
  public static boolean loop_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOOP_STATEMENT, "<loop statement>");
    r = loop_statement_0(b, l + 1);
    r = r && loop_statement_1(b, l + 1);
    r = r && consumeToken(b, LOOP);
    r = r && sequence_of_statements(b, l + 1);
    r = r && consumeTokens(b, 0, END, LOOP);
    r = r && loop_statement_6(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( i_loop_label ':' )?
  private static boolean loop_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement_0")) return false;
    loop_statement_0_0(b, l + 1);
    return true;
  }

  // i_loop_label ':'
  private static boolean loop_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_loop_label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // iteration_scheme?
  private static boolean loop_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement_1")) return false;
    iteration_scheme(b, l + 1);
    return true;
  }

  // i_loop_label?
  private static boolean loop_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement_6")) return false;
    i_loop_label(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IN|OUT|INOUT|BUFFER|LINKAGE
  public static boolean mode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mode")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODE, "<mode>");
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OUT);
    if (!r) r = consumeToken(b, INOUT);
    if (!r) r = consumeToken(b, BUFFER);
    if (!r) r = consumeToken(b, LINKAGE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_mode_indication|mode_view_indication
  public static boolean mode_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mode_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODE_INDICATION, "<mode indication>");
    r = simple_mode_indication(b, l + 1);
    if (!r) r = mode_view_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VIEW IDENTIFIER OF i_unresolved_record_subtype_indication IS mode_view_element_definition* END VIEW ii_mode_view_simple_name? SEMICOLON
  public static boolean mode_view_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mode_view_declaration")) return false;
    if (!nextTokenIs(b, VIEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VIEW, IDENTIFIER, OF);
    r = r && i_unresolved_record_subtype_indication(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && mode_view_declaration_5(b, l + 1);
    r = r && consumeTokens(b, 0, END, VIEW);
    r = r && mode_view_declaration_8(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, MODE_VIEW_DECLARATION, r);
    return r;
  }

  // mode_view_element_definition*
  private static boolean mode_view_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mode_view_declaration_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mode_view_element_definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mode_view_declaration_5", c)) break;
    }
    return true;
  }

  // ii_mode_view_simple_name?
  private static boolean mode_view_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mode_view_declaration_8")) return false;
    ii_mode_view_simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // record_element_list ':' element_mode_indication SEMICOLON
  public static boolean mode_view_element_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mode_view_element_definition")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = record_element_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && element_mode_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, MODE_VIEW_ELEMENT_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // record_mode_view_indication|array_mode_view_indication
  public static boolean mode_view_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mode_view_indication")) return false;
    if (!nextTokenIs(b, VIEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = record_mode_view_indication(b, l + 1);
    if (!r) r = array_mode_view_indication(b, l + 1);
    exit_section_(b, m, MODE_VIEW_INDICATION, r);
    return r;
  }

  /* ********************************************************** */
  // '*'|'/'|MOD|REM
  public static boolean multiplying_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplying_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLYING_OPERATOR, "<multiplying operator>");
    r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, MOD);
    if (!r) r = consumeToken(b, REM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_name|operator_symbol|character_literal|selected_name|indexed_name|slice_name|attribute_name|external_name
  public static boolean name_s(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_s")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAME_S, "<name s>");
    r = simple_name(b, l + 1);
    if (!r) r = operator_symbol(b, l + 1);
    if (!r) r = character_literal(b, l + 1);
    if (!r) r = selected_name(b, l + 1);
    if (!r) r = indexed_name(b, l + 1);
    if (!r) r = slice_name(b, l + 1);
    if (!r) r = attribute_name(b, l + 1);
    if (!r) r = external_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( label ':' )? NEXT i_loop_label? (WHEN condition)? SEMICOLON
  public static boolean next_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement")) return false;
    if (!nextTokenIs(b, "<next statement>", IDENTIFIER, NEXT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEXT_STATEMENT, "<next statement>");
    r = next_statement_0(b, l + 1);
    r = r && consumeToken(b, NEXT);
    r = r && next_statement_2(b, l + 1);
    r = r && next_statement_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( label ':' )?
  private static boolean next_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_0")) return false;
    next_statement_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean next_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // i_loop_label?
  private static boolean next_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_2")) return false;
    i_loop_label(b, l + 1);
    return true;
  }

  // (WHEN condition)?
  private static boolean next_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_3")) return false;
    next_statement_3_0(b, l + 1);
    return true;
  }

  // WHEN condition
  private static boolean next_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VARIABLE identifier_list ':' subtype_indication generic_map_aspect? ( ':=' conditional_expression )? SEMICOLON
  static boolean nonshared_variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonshared_variable_declaration")) return false;
    if (!nextTokenIs(b, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARIABLE);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && subtype_indication(b, l + 1);
    r = r && nonshared_variable_declaration_4(b, l + 1);
    r = r && nonshared_variable_declaration_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // generic_map_aspect?
  private static boolean nonshared_variable_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonshared_variable_declaration_4")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  // ( ':=' conditional_expression )?
  private static boolean nonshared_variable_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonshared_variable_declaration_5")) return false;
    nonshared_variable_declaration_5_0(b, l + 1);
    return true;
  }

  // ':=' conditional_expression
  private static boolean nonshared_variable_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonshared_variable_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":=");
    r = r && conditional_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( label ':' )? NULL SEMICOLON
  public static boolean null_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_statement")) return false;
    if (!nextTokenIs(b, "<null statement>", IDENTIFIER, NULL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NULL_STATEMENT, "<null statement>");
    r = null_statement_0(b, l + 1);
    r = r && consumeTokens(b, 0, NULL, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( label ':' )?
  private static boolean null_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_statement_0")) return false;
    null_statement_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean null_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // abstract_literal|physical_literal
  public static boolean numeric_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERIC_LITERAL, "<numeric literal>");
    r = abstract_literal(b, l + 1);
    if (!r) r = physical_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // constant_declaration|signal_declaration|variable_declaration|file_declaration
  public static boolean object_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_DECLARATION, "<object declaration>");
    r = constant_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // string_literal
  public static boolean operator_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_symbol")) return false;
    if (!nextTokenIs(b, STRING_LITERAL_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_literal(b, l + 1);
    exit_section_(b, m, OPERATOR_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // PACKAGE BODY i_package_simple_name IS package_body_declarative_part END PACKAGE? i_package_simple_name? SEMICOLON
  public static boolean package_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PACKAGE, BODY);
    r = r && i_package_simple_name(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && package_body_declarative_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && package_body_6(b, l + 1);
    r = r && package_body_7(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PACKAGE_BODY, r);
    return r;
  }

  // PACKAGE?
  private static boolean package_body_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body_6")) return false;
    consumeToken(b, PACKAGE);
    return true;
  }

  // i_package_simple_name?
  private static boolean package_body_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body_7")) return false;
    i_package_simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // subprogram_declaration|subprogram_body|subprogram_instantiation_declaration|package_declaration|package_body|package_instantiation_declaration|type_declaration|subtype_declaration|constant_declaration|shared_variable_declaration|file_declaration|alias_declaration|attribute_declaration|attribute_specification|use_clause|group_template_declaration|group_declaration
  public static boolean package_body_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_BODY_DECLARATIVE_ITEM, "<package body declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = subprogram_instantiation_declaration(b, l + 1);
    if (!r) r = package_declaration(b, l + 1);
    if (!r) r = package_body(b, l + 1);
    if (!r) r = package_instantiation_declaration(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = shared_variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // package_body_declarative_item*
  static boolean package_body_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body_declarative_part")) return false;
    while (true) {
      int c = current_position_(b);
      if (!package_body_declarative_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "package_body_declarative_part", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PACKAGE IDENTIFIER IS package_header package_declarative_part END PACKAGE? i_package_simple_name? SEMICOLON
  public static boolean package_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declaration")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PACKAGE, IDENTIFIER, IS);
    r = r && package_header(b, l + 1);
    r = r && package_declarative_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && package_declaration_6(b, l + 1);
    r = r && package_declaration_7(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PACKAGE_DECLARATION, r);
    return r;
  }

  // PACKAGE?
  private static boolean package_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declaration_6")) return false;
    consumeToken(b, PACKAGE);
    return true;
  }

  // i_package_simple_name?
  private static boolean package_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declaration_7")) return false;
    i_package_simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // subprogram_declaration|subprogram_instantiation_declaration|package_declaration|package_instantiation_declaration|type_declaration|subtype_declaration|mode_view_declaration|constant_declaration|signal_declaration|shared_variable_declaration|file_declaration|alias_declaration|component_declaration|attribute_declaration|attribute_specification|disconnection_specification|use_clause|group_template_declaration|group_declaration|i_PSL_Property_Declaration|i_PSL_Sequence_Declaration
  public static boolean package_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATIVE_ITEM, "<package declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_instantiation_declaration(b, l + 1);
    if (!r) r = package_declaration(b, l + 1);
    if (!r) r = package_instantiation_declaration(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = mode_view_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = shared_variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = component_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = disconnection_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    if (!r) r = i_PSL_Property_Declaration(b, l + 1);
    if (!r) r = i_PSL_Sequence_Declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // package_declarative_item
  static boolean package_declarative_part(PsiBuilder b, int l) {
    return package_declarative_item(b, l + 1);
  }

  /* ********************************************************** */
  // ( generic_clause ( generic_map_aspect SEMICOLON )? )?
  public static boolean package_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_header")) return false;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_HEADER, "<package header>");
    package_header_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // generic_clause ( generic_map_aspect SEMICOLON )?
  private static boolean package_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_header_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_clause(b, l + 1);
    r = r && package_header_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( generic_map_aspect SEMICOLON )?
  private static boolean package_header_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_header_0_1")) return false;
    package_header_0_1_0(b, l + 1);
    return true;
  }

  // generic_map_aspect SEMICOLON
  private static boolean package_header_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_header_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_map_aspect(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PACKAGE IDENTIFIER IS NEW ii_uninstantiated_package_name generic_map_aspect? SEMICOLON
  public static boolean package_instantiation_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_instantiation_declaration")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PACKAGE, IDENTIFIER, IS, NEW);
    r = r && ii_uninstantiated_package_name(b, l + 1);
    r = r && package_instantiation_declaration_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PACKAGE_INSTANTIATION_DECLARATION, r);
    return r;
  }

  // generic_map_aspect?
  private static boolean package_instantiation_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_instantiation_declaration_5")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '@' i_library_logical_name '.' i_package_simple_name '.' ( i_package_simple_name '.' )* i_object_simple_name
  public static boolean package_pathname(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_pathname")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_PATHNAME, "<package pathname>");
    r = consumeToken(b, "@");
    r = r && i_library_logical_name(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && i_package_simple_name(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && package_pathname_5(b, l + 1);
    r = r && i_object_simple_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( i_package_simple_name '.' )*
  private static boolean package_pathname_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_pathname_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!package_pathname_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "package_pathname_5", c)) break;
    }
    return true;
  }

  // i_package_simple_name '.'
  private static boolean package_pathname_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_pathname_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_package_simple_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (PARAMETER MAP)? '(' i_parameter_association_list ')'
  public static boolean parameter_map_aspect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_map_aspect")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_MAP_ASPECT, "<parameter map aspect>");
    r = parameter_map_aspect_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && i_parameter_association_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (PARAMETER MAP)?
  private static boolean parameter_map_aspect_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_map_aspect_0")) return false;
    parameter_map_aspect_0_0(b, l + 1);
    return true;
  }

  // PARAMETER MAP
  private static boolean parameter_map_aspect_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_map_aspect_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PARAMETER, MAP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER IN discrete_range
  public static boolean parameter_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_specification")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, IN);
    r = r && discrete_range(b, l + 1);
    exit_section_(b, m, PARAMETER_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // (pathname_element '.')* i_object_simple_name
  public static boolean partial_pathname(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partial_pathname")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = partial_pathname_0(b, l + 1);
    r = r && i_object_simple_name(b, l + 1);
    exit_section_(b, m, PARTIAL_PATHNAME, r);
    return r;
  }

  // (pathname_element '.')*
  private static boolean partial_pathname_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partial_pathname_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!partial_pathname_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "partial_pathname_0", c)) break;
    }
    return true;
  }

  // pathname_element '.'
  private static boolean partial_pathname_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partial_pathname_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pathname_element(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // i_entity_simple_name|ii_component_instantiation_label|i_block_label|(ii_generate_statement_label ( '(' i_static_expression ')' )?)|i_package_simple_name
  public static boolean pathname_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pathname_element")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_entity_simple_name(b, l + 1);
    if (!r) r = ii_component_instantiation_label(b, l + 1);
    if (!r) r = i_block_label(b, l + 1);
    if (!r) r = pathname_element_3(b, l + 1);
    if (!r) r = i_package_simple_name(b, l + 1);
    exit_section_(b, m, PATHNAME_ELEMENT, r);
    return r;
  }

  // ii_generate_statement_label ( '(' i_static_expression ')' )?
  private static boolean pathname_element_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pathname_element_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ii_generate_statement_label(b, l + 1);
    r = r && pathname_element_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( '(' i_static_expression ')' )?
  private static boolean pathname_element_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pathname_element_3_1")) return false;
    pathname_element_3_1_0(b, l + 1);
    return true;
  }

  // '(' i_static_expression ')'
  private static boolean pathname_element_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pathname_element_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && i_static_expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UNITS '<>'
  public static boolean physical_incomplete_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_incomplete_type_definition")) return false;
    if (!nextTokenIs(b, UNITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNITS);
    r = r && consumeToken(b, "<>");
    exit_section_(b, m, PHYSICAL_INCOMPLETE_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // abstract_literal? i_unit_name
  public static boolean physical_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PHYSICAL_LITERAL, "<physical literal>");
    r = physical_literal_0(b, l + 1);
    r = r && i_unit_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // abstract_literal?
  private static boolean physical_literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_literal_0")) return false;
    abstract_literal(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // range_constraint UNITS primary_unit_declaration secondary_unit_declaration* END UNITS ii_physical_type_simple_name?
  public static boolean physical_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_type_definition")) return false;
    if (!nextTokenIs(b, RANGE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = range_constraint(b, l + 1);
    r = r && consumeToken(b, UNITS);
    r = r && primary_unit_declaration(b, l + 1);
    r = r && physical_type_definition_3(b, l + 1);
    r = r && consumeTokens(b, 0, END, UNITS);
    r = r && physical_type_definition_6(b, l + 1);
    exit_section_(b, m, PHYSICAL_TYPE_DEFINITION, r);
    return r;
  }

  // secondary_unit_declaration*
  private static boolean physical_type_definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_type_definition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!secondary_unit_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "physical_type_definition_3", c)) break;
    }
    return true;
  }

  // ii_physical_type_simple_name?
  private static boolean physical_type_definition_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_type_definition_6")) return false;
    ii_physical_type_simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( label ':' )? RETURN (WHEN condition)? SEMICOLON
  public static boolean plain_return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_return_statement")) return false;
    if (!nextTokenIs(b, "<plain return statement>", IDENTIFIER, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLAIN_RETURN_STATEMENT, "<plain return statement>");
    r = plain_return_statement_0(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && plain_return_statement_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( label ':' )?
  private static boolean plain_return_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_return_statement_0")) return false;
    plain_return_statement_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean plain_return_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_return_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // (WHEN condition)?
  private static boolean plain_return_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_return_statement_2")) return false;
    plain_return_statement_2_0(b, l + 1);
    return true;
  }

  // WHEN condition
  private static boolean plain_return_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_return_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PORT '(' port_list ')' SEMICOLON
  public static boolean port_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_clause")) return false;
    if (!nextTokenIs(b, PORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PORT);
    r = r && consumeToken(b, "(");
    r = r && port_list(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PORT_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // i_port_interface_list
  public static boolean port_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PORT_LIST, "<port list>");
    r = i_port_interface_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PORT MAP '(' i_port_association_list ')'
  public static boolean port_map_aspect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_map_aspect")) return false;
    if (!nextTokenIs(b, PORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PORT, MAP);
    r = r && consumeToken(b, "(");
    r = r && i_port_association_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, PORT_MAP_ASPECT, r);
    return r;
  }

  /* ********************************************************** */
  // name_s|function_call
  public static boolean prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX, "<prefix>");
    r = name_s(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s|literal|agregate|function_call|qualified_xpression|type_conversion|allocator|( '(' conditional_expression ')' )
  public static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY, "<primary>");
    r = name_s(b, l + 1);
    if (!r) r = literal(b, l + 1);
    if (!r) r = consumeToken(b, AGREGATE);
    if (!r) r = function_call(b, l + 1);
    if (!r) r = qualified_xpression(b, l + 1);
    if (!r) r = type_conversion(b, l + 1);
    if (!r) r = allocator(b, l + 1);
    if (!r) r = primary_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' conditional_expression ')'
  private static boolean primary_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && conditional_expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // entity_declaration|configuration_declaration|package_declaration|package_instantiation_declaration|context_declaration|i_PSL_verification_unit
  public static boolean primary_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_UNIT, "<primary unit>");
    r = entity_declaration(b, l + 1);
    if (!r) r = configuration_declaration(b, l + 1);
    if (!r) r = package_declaration(b, l + 1);
    if (!r) r = package_instantiation_declaration(b, l + 1);
    if (!r) r = context_declaration(b, l + 1);
    if (!r) r = i_PSL_verification_unit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER SEMICOLON
  public static boolean primary_unit_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_unit_declaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, SEMICOLON);
    exit_section_(b, m, PRIMARY_UNIT_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // PRIVATE_TOKEN
  public static boolean private_incomplete_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "private_incomplete_type_definition")) return false;
    if (!nextTokenIs(b, PRIVATE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PRIVATE_TOKEN);
    exit_section_(b, m, PRIVATE_INCOMPLETE_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // PRIVATE variable_declaration
  public static boolean private_variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "private_variable_declaration")) return false;
    if (!nextTokenIs(b, PRIVATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PRIVATE);
    r = r && variable_declaration(b, l + 1);
    exit_section_(b, m, PRIVATE_VARIABLE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // i_procedure_name generic_map_aspect? parameter_map_aspect?
  public static boolean procedure_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCEDURE_CALL, "<procedure call>");
    r = i_procedure_name(b, l + 1);
    r = r && procedure_call_1(b, l + 1);
    r = r && procedure_call_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // generic_map_aspect?
  private static boolean procedure_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_1")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  // parameter_map_aspect?
  private static boolean procedure_call_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_2")) return false;
    parameter_map_aspect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( label ';' )? procedure_call SEMICOLON
  public static boolean procedure_call_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCEDURE_CALL_STATEMENT, "<procedure call statement>");
    r = procedure_call_statement_0(b, l + 1);
    r = r && procedure_call(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( label ';' )?
  private static boolean procedure_call_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_statement_0")) return false;
    procedure_call_statement_0_0(b, l + 1);
    return true;
  }

  // label ';'
  private static boolean procedure_call_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PROCEDURE designator subprogram_header (PARAMETER? '(' formal_parameter_list ')')?
  public static boolean procedure_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_specification")) return false;
    if (!nextTokenIs(b, PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROCEDURE);
    r = r && designator(b, l + 1);
    r = r && subprogram_header(b, l + 1);
    r = r && procedure_specification_3(b, l + 1);
    exit_section_(b, m, PROCEDURE_SPECIFICATION, r);
    return r;
  }

  // (PARAMETER? '(' formal_parameter_list ')')?
  private static boolean procedure_specification_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_specification_3")) return false;
    procedure_specification_3_0(b, l + 1);
    return true;
  }

  // PARAMETER? '(' formal_parameter_list ')'
  private static boolean procedure_specification_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_specification_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = procedure_specification_3_0_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && formal_parameter_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // PARAMETER?
  private static boolean procedure_specification_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_specification_3_0_0")) return false;
    consumeToken(b, PARAMETER);
    return true;
  }

  /* ********************************************************** */
  // subprogram_declaration|subprogram_body|subprogram_instantiation_declaration|package_declaration|package_body|package_instantiation_declaration|type_declaration|subtype_declaration|constant_declaration|variable_declaration|file_declaration|alias_declaration|attribute_declaration|attribute_specification|use_clause|group_template_declaration|group_declaration
  public static boolean process_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCESS_DECLARATIVE_ITEM, "<process declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = subprogram_instantiation_declaration(b, l + 1);
    if (!r) r = package_declaration(b, l + 1);
    if (!r) r = package_body(b, l + 1);
    if (!r) r = package_instantiation_declaration(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // process_declarative_item*
  public static boolean process_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_declarative_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROCESS_DECLARATIVE_PART, "<process declarative part>");
    while (true) {
      int c = current_position_(b);
      if (!process_declarative_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "process_declarative_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // ALL|sensitivity_list
  public static boolean process_sensitivity_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_sensitivity_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCESS_SENSITIVITY_LIST, "<process sensitivity list>");
    r = consumeToken(b, ALL);
    if (!r) r = sensitivity_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( i_process_label ':' )? POSTPONED? PROCESS '(' process_sensitivity_list ')' IS? process_declarative_part BEGIN process_statement_part END POSTPONED? PROCESS i_process_label? SEMICOLON
  public static boolean process_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCESS_STATEMENT, "<process statement>");
    r = process_statement_0(b, l + 1);
    r = r && process_statement_1(b, l + 1);
    r = r && consumeToken(b, PROCESS);
    r = r && consumeToken(b, "(");
    r = r && process_sensitivity_list(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && process_statement_6(b, l + 1);
    r = r && process_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && process_statement_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && process_statement_11(b, l + 1);
    r = r && consumeToken(b, PROCESS);
    r = r && process_statement_13(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( i_process_label ':' )?
  private static boolean process_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_0")) return false;
    process_statement_0_0(b, l + 1);
    return true;
  }

  // i_process_label ':'
  private static boolean process_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_process_label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // POSTPONED?
  private static boolean process_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  // IS?
  private static boolean process_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_6")) return false;
    consumeToken(b, IS);
    return true;
  }

  // POSTPONED?
  private static boolean process_statement_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_11")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  // i_process_label?
  private static boolean process_statement_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_13")) return false;
    i_process_label(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // sequential_statement*
  public static boolean process_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROCESS_STATEMENT_PART, "<process statement part>");
    while (true) {
      int c = current_position_(b);
      if (!sequential_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "process_statement_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // PROTECTED BODY protected_type_body_declarative_part END PROTECTED BODY ii_protected_type_simple_name
  public static boolean protected_type_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_body")) return false;
    if (!nextTokenIs(b, PROTECTED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROTECTED, BODY);
    r = r && protected_type_body_declarative_part(b, l + 1);
    r = r && consumeTokens(b, 0, END, PROTECTED, BODY);
    r = r && ii_protected_type_simple_name(b, l + 1);
    exit_section_(b, m, PROTECTED_TYPE_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // subprogram_declaration|subprogram_body|subprogram_instantiation_declaration|package_declaration|package_body|package_instantiation_declaration|type_declaration|subtype_declaration|constant_declaration|variable_declaration|file_declaration|alias_declaration|attribute_declaration|attribute_specification|use_clause|group_template_declaration|group_declaration
  public static boolean protected_type_body_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_body_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTECTED_TYPE_BODY_DECLARATIVE_ITEM, "<protected type body declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = subprogram_instantiation_declaration(b, l + 1);
    if (!r) r = package_declaration(b, l + 1);
    if (!r) r = package_body(b, l + 1);
    if (!r) r = package_instantiation_declaration(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // protected_type_body_declarative_item*
  static boolean protected_type_body_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_body_declarative_part")) return false;
    while (true) {
      int c = current_position_(b);
      if (!protected_type_body_declarative_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "protected_type_body_declarative_part", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PROTECTED protected_type_header protected_type_declarative_part END PROTECTED ii_protected_type_simple_name?
  public static boolean protected_type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_declaration")) return false;
    if (!nextTokenIs(b, PROTECTED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROTECTED);
    r = r && protected_type_header(b, l + 1);
    r = r && protected_type_declarative_part(b, l + 1);
    r = r && consumeTokens(b, 0, END, PROTECTED);
    r = r && protected_type_declaration_5(b, l + 1);
    exit_section_(b, m, PROTECTED_TYPE_DECLARATION, r);
    return r;
  }

  // ii_protected_type_simple_name?
  private static boolean protected_type_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_declaration_5")) return false;
    ii_protected_type_simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // subprogram_declaration|subprogram_instantiation_declaration|attribute_specification|use_clause|private_variable_declaration|alias_declaration
  public static boolean protected_type_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTECTED_TYPE_DECLARATIVE_ITEM, "<protected type declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_instantiation_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = private_variable_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // protected_type_declarative_item*
  static boolean protected_type_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_declarative_part")) return false;
    while (true) {
      int c = current_position_(b);
      if (!protected_type_declarative_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "protected_type_declarative_part", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // protected_type_declaration|protected_type_body
  public static boolean protected_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_definition")) return false;
    if (!nextTokenIs(b, PROTECTED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = protected_type_declaration(b, l + 1);
    if (!r) r = protected_type_body(b, l + 1);
    exit_section_(b, m, PROTECTED_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // ( generic_clause ( generic_map_aspect SEMICOLON )? )?
  public static boolean protected_type_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_header")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROTECTED_TYPE_HEADER, "<protected type header>");
    protected_type_header_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // generic_clause ( generic_map_aspect SEMICOLON )?
  private static boolean protected_type_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_header_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_clause(b, l + 1);
    r = r && protected_type_header_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( generic_map_aspect SEMICOLON )?
  private static boolean protected_type_header_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_header_0_1")) return false;
    protected_type_header_0_1_0(b, l + 1);
    return true;
  }

  // generic_map_aspect SEMICOLON
  private static boolean protected_type_header_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_header_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_map_aspect(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NEW subtype_indication generic_map_aspect?
  public static boolean protected_type_instantiation_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_instantiation_definition")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && subtype_indication(b, l + 1);
    r = r && protected_type_instantiation_definition_2(b, l + 1);
    exit_section_(b, m, PROTECTED_TYPE_INSTANTIATION_DEFINITION, r);
    return r;
  }

  // generic_map_aspect?
  private static boolean protected_type_instantiation_definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protected_type_instantiation_definition_2")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (type_mark SINGLE_QUOTE '(' expression ')' )|(type_mark SINGLE_QUOTE aggregate)|(type_mark SINGLE_QUOTE '(' ')')
  public static boolean qualified_xpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_xpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFIED_XPRESSION, "<qualified xpression>");
    r = qualified_xpression_0(b, l + 1);
    if (!r) r = qualified_xpression_1(b, l + 1);
    if (!r) r = qualified_xpression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_mark SINGLE_QUOTE '(' expression ')'
  private static boolean qualified_xpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_xpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTE);
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // type_mark SINGLE_QUOTE aggregate
  private static boolean qualified_xpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_xpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTE);
    r = r && aggregate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_mark SINGLE_QUOTE '(' ')'
  private static boolean qualified_xpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_xpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTE);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // i_range_attribute_name|simple_range|i_range_expression
  public static boolean range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE, "<range>");
    r = i_range_attribute_name(b, l + 1);
    if (!r) r = simple_range(b, l + 1);
    if (!r) r = i_range_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RANGE_TOKEN range
  public static boolean range_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_constraint")) return false;
    if (!nextTokenIs(b, RANGE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RANGE_TOKEN);
    r = r && range(b, l + 1);
    exit_section_(b, m, RANGE_CONSTRAINT, r);
    return r;
  }

  /* ********************************************************** */
  // '(' record_element_constraint ( ',' record_element_constraint )* ')'
  public static boolean record_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RECORD_CONSTRAINT, "<record constraint>");
    r = consumeToken(b, "(");
    r = r && record_element_constraint(b, l + 1);
    r = r && record_constraint_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' record_element_constraint )*
  private static boolean record_constraint_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_constraint_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!record_constraint_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "record_constraint_2", c)) break;
    }
    return true;
  }

  // ',' record_element_constraint
  private static boolean record_constraint_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_constraint_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && record_element_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ii_record_element_simple_name element_constraint
  public static boolean record_element_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_element_constraint")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ii_record_element_simple_name(b, l + 1);
    r = r && element_constraint(b, l + 1);
    exit_section_(b, m, RECORD_ELEMENT_CONSTRAINT, r);
    return r;
  }

  /* ********************************************************** */
  // ii_record_element_simple_name ( ',' ii_record_element_simple_name )*
  public static boolean record_element_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_element_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ii_record_element_simple_name(b, l + 1);
    r = r && record_element_list_1(b, l + 1);
    exit_section_(b, m, RECORD_ELEMENT_LIST, r);
    return r;
  }

  // ( ',' ii_record_element_simple_name )*
  private static boolean record_element_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_element_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!record_element_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "record_element_list_1", c)) break;
    }
    return true;
  }

  // ',' ii_record_element_simple_name
  private static boolean record_element_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_element_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && ii_record_element_simple_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ii_record_element_simple_name resolution_indication
  public static boolean record_element_resolution(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_element_resolution")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ii_record_element_simple_name(b, l + 1);
    r = r && resolution_indication(b, l + 1);
    exit_section_(b, m, RECORD_ELEMENT_RESOLUTION, r);
    return r;
  }

  /* ********************************************************** */
  // VIEW ii_mode_view_name ( OF i_unresolved_record_subtype_indication )?
  public static boolean record_mode_view_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_mode_view_indication")) return false;
    if (!nextTokenIs(b, VIEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VIEW);
    r = r && ii_mode_view_name(b, l + 1);
    r = r && record_mode_view_indication_2(b, l + 1);
    exit_section_(b, m, RECORD_MODE_VIEW_INDICATION, r);
    return r;
  }

  // ( OF i_unresolved_record_subtype_indication )?
  private static boolean record_mode_view_indication_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_mode_view_indication_2")) return false;
    record_mode_view_indication_2_0(b, l + 1);
    return true;
  }

  // OF i_unresolved_record_subtype_indication
  private static boolean record_mode_view_indication_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_mode_view_indication_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OF);
    r = r && i_unresolved_record_subtype_indication(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // record_element_resolution ( ',' record_element_resolution )*
  public static boolean record_resolution(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_resolution")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = record_element_resolution(b, l + 1);
    r = r && record_resolution_1(b, l + 1);
    exit_section_(b, m, RECORD_RESOLUTION, r);
    return r;
  }

  // ( ',' record_element_resolution )*
  private static boolean record_resolution_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_resolution_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!record_resolution_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "record_resolution_1", c)) break;
    }
    return true;
  }

  // ',' record_element_resolution
  private static boolean record_resolution_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_resolution_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && record_element_resolution(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RECORD element_declaration* END RECORD ii_record_type_simple_name?
  public static boolean record_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type_definition")) return false;
    if (!nextTokenIs(b, RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECORD);
    r = r && record_type_definition_1(b, l + 1);
    r = r && consumeTokens(b, 0, END, RECORD);
    r = r && record_type_definition_4(b, l + 1);
    exit_section_(b, m, RECORD_TYPE_DEFINITION, r);
    return r;
  }

  // element_declaration*
  private static boolean record_type_definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type_definition_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!element_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "record_type_definition_1", c)) break;
    }
    return true;
  }

  // ii_record_type_simple_name?
  private static boolean record_type_definition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type_definition_4")) return false;
    ii_record_type_simple_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // shift_expression (relational_operator shift_expression)?
  public static boolean relation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATION, "<relation>");
    r = shift_expression(b, l + 1);
    r = r && relation_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (relational_operator shift_expression)?
  private static boolean relation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_1")) return false;
    relation_1_0(b, l + 1);
    return true;
  }

  // relational_operator shift_expression
  private static boolean relation_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_operator(b, l + 1);
    r = r && shift_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '='|'/='|'<'|'<='|'>'|'>='|'?='|'?/='|'?<'|'?<='|'?>'|'?>='
  public static boolean relational_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_OPERATOR, "<relational operator>");
    r = consumeToken(b, "=");
    if (!r) r = consumeToken(b, "/=");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, ">=");
    if (!r) r = consumeToken(b, "?=");
    if (!r) r = consumeToken(b, "?/=");
    if (!r) r = consumeToken(b, "?<");
    if (!r) r = consumeToken(b, "?<=");
    if (!r) r = consumeToken(b, "?>");
    if (!r) r = consumeToken(b, "?>=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( '^' '.' )* partial_pathname
  public static boolean relative_pathname(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relative_pathname")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIVE_PATHNAME, "<relative pathname>");
    r = relative_pathname_0(b, l + 1);
    r = r && partial_pathname(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '^' '.' )*
  private static boolean relative_pathname_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relative_pathname_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!relative_pathname_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "relative_pathname_0", c)) break;
    }
    return true;
  }

  // '^' '.'
  private static boolean relative_pathname_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relative_pathname_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "^");
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( label ':' )? REPORT expression (SEVERITY expression)? SEMICOLON
  public static boolean report_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement")) return false;
    if (!nextTokenIs(b, "<report statement>", IDENTIFIER, REPORT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REPORT_STATEMENT, "<report statement>");
    r = report_statement_0(b, l + 1);
    r = r && consumeToken(b, REPORT);
    r = r && expression(b, l + 1);
    r = r && report_statement_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( label ':' )?
  private static boolean report_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement_0")) return false;
    report_statement_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean report_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // (SEVERITY expression)?
  private static boolean report_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement_3")) return false;
    report_statement_3_0(b, l + 1);
    return true;
  }

  // SEVERITY expression
  private static boolean report_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEVERITY);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ii_resolution_function_name|( '(' element_resolution ')' )
  public static boolean resolution_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resolution_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RESOLUTION_INDICATION, "<resolution indication>");
    r = ii_resolution_function_name(b, l + 1);
    if (!r) r = resolution_indication_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' element_resolution ')'
  private static boolean resolution_indication_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resolution_indication_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && element_resolution(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // plain_return_statement|value_return_statement
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    if (!nextTokenIs(b, "<return statement>", IDENTIFIER, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STATEMENT, "<return statement>");
    r = plain_return_statement(b, l + 1);
    if (!r) r = value_return_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<>'
  public static boolean scalar_incomplete_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar_incomplete_type_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCALAR_INCOMPLETE_TYPE_DEFINITION, "<scalar incomplete type definition>");
    r = consumeToken(b, "<>");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // enumeration_type_definition|integer_type_definition|floating_type_definition|physical_type_definition
  public static boolean scalar_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar_type_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCALAR_TYPE_DEFINITION, "<scalar type definition>");
    r = enumeration_type_definition(b, l + 1);
    if (!r) r = integer_type_definition(b, l + 1);
    if (!r) r = floating_type_definition(b, l + 1);
    if (!r) r = physical_type_definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // architecture_body|package_body
  public static boolean secondary_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_unit")) return false;
    if (!nextTokenIs(b, "<secondary unit>", ARCHITECTURE, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SECONDARY_UNIT, "<secondary unit>");
    r = architecture_body(b, l + 1);
    if (!r) r = package_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER '=' physical_literal SEMICOLON
  public static boolean secondary_unit_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_unit_declaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && physical_literal(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SECONDARY_UNIT_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // (expression WHEN choices ',')* expression WHEN choices
  public static boolean selected_expressions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_expressions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTED_EXPRESSIONS, "<selected expressions>");
    r = selected_expressions_0(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && choices(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expression WHEN choices ',')*
  private static boolean selected_expressions_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_expressions_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!selected_expressions_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "selected_expressions_0", c)) break;
    }
    return true;
  }

  // expression WHEN choices ','
  private static boolean selected_expressions_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_expressions_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && choices(b, l + 1);
    r = r && consumeToken(b, ",");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WITH expression SELECT '?'? target '<=' FORCE force_mode? selected_expressions SEMICOLON
  public static boolean selected_force_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_force_assignment")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SELECT);
    r = r && selected_force_assignment_3(b, l + 1);
    r = r && target(b, l + 1);
    r = r && consumeToken(b, "<=");
    r = r && consumeToken(b, FORCE);
    r = r && selected_force_assignment_7(b, l + 1);
    r = r && selected_expressions(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SELECTED_FORCE_ASSIGNMENT, r);
    return r;
  }

  // '?'?
  private static boolean selected_force_assignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_force_assignment_3")) return false;
    consumeToken(b, "?");
    return true;
  }

  // force_mode?
  private static boolean selected_force_assignment_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_force_assignment_7")) return false;
    force_mode(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // prefix '.' suffix
  public static boolean selected_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTED_NAME, "<selected name>");
    r = prefix(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && suffix(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // selected_waveform_assignment|selected_force_assignment
  public static boolean selected_signal_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_signal_assignment")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selected_waveform_assignment(b, l + 1);
    if (!r) r = selected_force_assignment(b, l + 1);
    exit_section_(b, m, SELECTED_SIGNAL_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // WITH expression SELECT '?'? target ':=' selected_expressions SEMICOLON
  public static boolean selected_variable_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_variable_assignment")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SELECT);
    r = r && selected_variable_assignment_3(b, l + 1);
    r = r && target(b, l + 1);
    r = r && consumeToken(b, ":=");
    r = r && selected_expressions(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SELECTED_VARIABLE_ASSIGNMENT, r);
    return r;
  }

  // '?'?
  private static boolean selected_variable_assignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_variable_assignment_3")) return false;
    consumeToken(b, "?");
    return true;
  }

  /* ********************************************************** */
  // WITH expression SELECT '?'? target '<=' delay_mechanism? selected_waveforms SEMICOLON
  public static boolean selected_waveform_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_waveform_assignment")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SELECT);
    r = r && selected_waveform_assignment_3(b, l + 1);
    r = r && target(b, l + 1);
    r = r && consumeToken(b, "<=");
    r = r && selected_waveform_assignment_6(b, l + 1);
    r = r && selected_waveforms(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SELECTED_WAVEFORM_ASSIGNMENT, r);
    return r;
  }

  // '?'?
  private static boolean selected_waveform_assignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_waveform_assignment_3")) return false;
    consumeToken(b, "?");
    return true;
  }

  // delay_mechanism?
  private static boolean selected_waveform_assignment_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_waveform_assignment_6")) return false;
    delay_mechanism(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (waveform WHEN choices ',')* waveform WHEN choices
  public static boolean selected_waveforms(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_waveforms")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTED_WAVEFORMS, "<selected waveforms>");
    r = selected_waveforms_0(b, l + 1);
    r = r && waveform(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && choices(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (waveform WHEN choices ',')*
  private static boolean selected_waveforms_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_waveforms_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!selected_waveforms_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "selected_waveforms_0", c)) break;
    }
    return true;
  }

  // waveform WHEN choices ','
  private static boolean selected_waveforms_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_waveforms_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = waveform(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && choices(b, l + 1);
    r = r && consumeToken(b, ",");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ON sensitivity_list
  public static boolean sensitivity_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sensitivity_clause")) return false;
    if (!nextTokenIs(b, ON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && sensitivity_list(b, l + 1);
    exit_section_(b, m, SENSITIVITY_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // i_signal_name ( ',' i_signal_name )*
  public static boolean sensitivity_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sensitivity_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SENSITIVITY_LIST, "<sensitivity list>");
    r = i_signal_name(b, l + 1);
    r = r && sensitivity_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' i_signal_name )*
  private static boolean sensitivity_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sensitivity_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sensitivity_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sensitivity_list_1", c)) break;
    }
    return true;
  }

  // ',' i_signal_name
  private static boolean sensitivity_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sensitivity_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && i_signal_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // sequential_statement*
  public static boolean sequence_of_statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequence_of_statements")) return false;
    Marker m = enter_section_(b, l, _NONE_, SEQUENCE_OF_STATEMENTS, "<sequence of statements>");
    while (true) {
      int c = current_position_(b);
      if (!sequential_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sequence_of_statements", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // process_declarative_item*
  public static boolean sequential_block_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_block_declarative_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, SEQUENTIAL_BLOCK_DECLARATIVE_PART, "<sequential block declarative part>");
    while (true) {
      int c = current_position_(b);
      if (!process_declarative_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sequential_block_declarative_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // ( ii_sequential_block_label ':' )? BLOCK IS? sequential_block_declarative_part BEGIN sequential_block_statement_part END BLOCK? ii_sequential_block_label? SEMICOLON
  public static boolean sequential_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_block_statement")) return false;
    if (!nextTokenIs(b, "<sequential block statement>", BLOCK, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEQUENTIAL_BLOCK_STATEMENT, "<sequential block statement>");
    r = sequential_block_statement_0(b, l + 1);
    r = r && consumeToken(b, BLOCK);
    r = r && sequential_block_statement_2(b, l + 1);
    r = r && sequential_block_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && sequential_block_statement_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && sequential_block_statement_7(b, l + 1);
    r = r && sequential_block_statement_8(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ii_sequential_block_label ':' )?
  private static boolean sequential_block_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_block_statement_0")) return false;
    sequential_block_statement_0_0(b, l + 1);
    return true;
  }

  // ii_sequential_block_label ':'
  private static boolean sequential_block_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_block_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ii_sequential_block_label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // IS?
  private static boolean sequential_block_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_block_statement_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // BLOCK?
  private static boolean sequential_block_statement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_block_statement_7")) return false;
    consumeToken(b, BLOCK);
    return true;
  }

  // ii_sequential_block_label?
  private static boolean sequential_block_statement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_block_statement_8")) return false;
    ii_sequential_block_label(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // sequential_statement*
  public static boolean sequential_block_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_block_statement_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, SEQUENTIAL_BLOCK_STATEMENT_PART, "<sequential block statement part>");
    while (true) {
      int c = current_position_(b);
      if (!sequential_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sequential_block_statement_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // wait_statement|assertion_statement|report_statement|signal_assignment_statement|variable_assignment_statement|procedure_call_statement|if_statement|case_statement|loop_statement|next_statement|exit_statement|return_statement|null_statement|sequential_block_statement
  public static boolean sequential_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEQUENTIAL_STATEMENT, "<sequential statement>");
    r = wait_statement(b, l + 1);
    if (!r) r = assertion_statement(b, l + 1);
    if (!r) r = report_statement(b, l + 1);
    if (!r) r = signal_assignment_statement(b, l + 1);
    if (!r) r = variable_assignment_statement(b, l + 1);
    if (!r) r = procedure_call_statement(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = case_statement(b, l + 1);
    if (!r) r = loop_statement(b, l + 1);
    if (!r) r = next_statement(b, l + 1);
    if (!r) r = exit_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = null_statement(b, l + 1);
    if (!r) r = sequential_block_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (sequential_statement_declarative_part BEGIN)? sequence_of_statements
  public static boolean sequential_statement_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_statement_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEQUENTIAL_STATEMENT_BODY, "<sequential statement body>");
    r = sequential_statement_body_0(b, l + 1);
    r = r && sequence_of_statements(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (sequential_statement_declarative_part BEGIN)?
  private static boolean sequential_statement_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_statement_body_0")) return false;
    sequential_statement_body_0_0(b, l + 1);
    return true;
  }

  // sequential_statement_declarative_part BEGIN
  private static boolean sequential_statement_body_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_statement_body_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sequential_statement_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // process_declarative_item*
  public static boolean sequential_statement_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_statement_declarative_part")) return false;
    Marker m = enter_section_(b, l, _NONE_, SEQUENTIAL_STATEMENT_DECLARATIVE_PART, "<sequential statement declarative part>");
    while (true) {
      int c = current_position_(b);
      if (!process_declarative_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sequential_statement_declarative_part", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // SHARED nonshared_variable_declaration
  public static boolean shared_variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shared_variable_declaration")) return false;
    if (!nextTokenIs(b, SHARED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SHARED);
    r = r && nonshared_variable_declaration(b, l + 1);
    exit_section_(b, m, SHARED_VARIABLE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  public static boolean shift_expression(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, SHIFT_EXPRESSION, true);
    return true;
  }

  /* ********************************************************** */
  // SLL|SRL|SLA|SRA|ROL|ROR
  public static boolean shift_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_OPERATOR, "<shift operator>");
    r = consumeToken(b, SLL);
    if (!r) r = consumeToken(b, SRL);
    if (!r) r = consumeToken(b, SLA);
    if (!r) r = consumeToken(b, SRA);
    if (!r) r = consumeToken(b, ROL);
    if (!r) r = consumeToken(b, ROR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '+'|'-'
  public static boolean sign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sign")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGN, "<sign>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ((label ':')? simple_signal_assignment)|((label ':')? conditional_signal_assignment)|((label ':')? selected_signal_assignment)
  public static boolean signal_assignment_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNAL_ASSIGNMENT_STATEMENT, "<signal assignment statement>");
    r = signal_assignment_statement_0(b, l + 1);
    if (!r) r = signal_assignment_statement_1(b, l + 1);
    if (!r) r = signal_assignment_statement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (label ':')? simple_signal_assignment
  private static boolean signal_assignment_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = signal_assignment_statement_0_0(b, l + 1);
    r = r && simple_signal_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (label ':')?
  private static boolean signal_assignment_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_0_0")) return false;
    signal_assignment_statement_0_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean signal_assignment_statement_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // (label ':')? conditional_signal_assignment
  private static boolean signal_assignment_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = signal_assignment_statement_1_0(b, l + 1);
    r = r && conditional_signal_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (label ':')?
  private static boolean signal_assignment_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_1_0")) return false;
    signal_assignment_statement_1_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean signal_assignment_statement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // (label ':')? selected_signal_assignment
  private static boolean signal_assignment_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = signal_assignment_statement_2_0(b, l + 1);
    r = r && selected_signal_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (label ':')?
  private static boolean signal_assignment_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_2_0")) return false;
    signal_assignment_statement_2_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean signal_assignment_statement_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SIGNAL identifier_list ':' subtype_indication signal_kind? ( ':=' conditional_expression )? SEMICOLON
  public static boolean signal_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration")) return false;
    if (!nextTokenIs(b, SIGNAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIGNAL);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && subtype_indication(b, l + 1);
    r = r && signal_declaration_4(b, l + 1);
    r = r && signal_declaration_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SIGNAL_DECLARATION, r);
    return r;
  }

  // signal_kind?
  private static boolean signal_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_4")) return false;
    signal_kind(b, l + 1);
    return true;
  }

  // ( ':=' conditional_expression )?
  private static boolean signal_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_5")) return false;
    signal_declaration_5_0(b, l + 1);
    return true;
  }

  // ':=' conditional_expression
  private static boolean signal_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":=");
    r = r && conditional_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REGISTER|BUS
  public static boolean signal_kind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_kind")) return false;
    if (!nextTokenIs(b, "<signal kind>", BUS, REGISTER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNAL_KIND, "<signal kind>");
    r = consumeToken(b, REGISTER);
    if (!r) r = consumeToken(b, BUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (i_signal_name ( ',' i_signal_name )* )|OTHERS|ALL
  public static boolean signal_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNAL_LIST, "<signal list>");
    r = signal_list_0(b, l + 1);
    if (!r) r = consumeToken(b, OTHERS);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // i_signal_name ( ',' i_signal_name )*
  private static boolean signal_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_signal_name(b, l + 1);
    r = r && signal_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' i_signal_name )*
  private static boolean signal_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_list_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!signal_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "signal_list_0_1", c)) break;
    }
    return true;
  }

  // ',' i_signal_name
  private static boolean signal_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && i_signal_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' ( type_mark ( ',' type_mark )* )? ( RETURN type_mark )? ']'
  public static boolean signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNATURE, "<signature>");
    r = consumeToken(b, "[");
    r = r && signature_1(b, l + 1);
    r = r && signature_2(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( type_mark ( ',' type_mark )* )?
  private static boolean signature_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_1")) return false;
    signature_1_0(b, l + 1);
    return true;
  }

  // type_mark ( ',' type_mark )*
  private static boolean signature_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && signature_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' type_mark )*
  private static boolean signature_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!signature_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "signature_1_0_1", c)) break;
    }
    return true;
  }

  // ',' type_mark
  private static boolean signature_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( RETURN type_mark )?
  private static boolean signature_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_2")) return false;
    signature_2_0(b, l + 1);
    return true;
  }

  // RETURN type_mark
  private static boolean signature_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FOR component_specification binding_indication SEMICOLON (END FOR SEMICOLON)?
  public static boolean simple_configuration_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_configuration_specification")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && component_specification(b, l + 1);
    r = r && binding_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && simple_configuration_specification_4(b, l + 1);
    exit_section_(b, m, SIMPLE_CONFIGURATION_SPECIFICATION, r);
    return r;
  }

  // (END FOR SEMICOLON)?
  private static boolean simple_configuration_specification_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_configuration_specification_4")) return false;
    simple_configuration_specification_4_0(b, l + 1);
    return true;
  }

  // END FOR SEMICOLON
  private static boolean simple_configuration_specification_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_configuration_specification_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, END, FOR, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // sign? term (adding_operator term)*
  public static boolean simple_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_EXPRESSION, "<simple expression>");
    r = simple_expression_0(b, l + 1);
    r = r && term(b, l + 1);
    r = r && simple_expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // sign?
  private static boolean simple_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_0")) return false;
    sign(b, l + 1);
    return true;
  }

  // (adding_operator term)*
  private static boolean simple_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simple_expression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simple_expression_2", c)) break;
    }
    return true;
  }

  // adding_operator term
  private static boolean simple_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = adding_operator(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // target '<=' FORCE force_mode? conditional_or_unaffected_expression SEMICOLON
  public static boolean simple_force_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_force_assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_FORCE_ASSIGNMENT, "<simple force assignment>");
    r = target(b, l + 1);
    r = r && consumeToken(b, "<=");
    r = r && consumeToken(b, FORCE);
    r = r && simple_force_assignment_3(b, l + 1);
    r = r && conditional_or_unaffected_expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // force_mode?
  private static boolean simple_force_assignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_force_assignment_3")) return false;
    force_mode(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // mode? interface_type_indication BUS? ( ':=' i_static_conditional_expression )?
  public static boolean simple_mode_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_mode_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_MODE_INDICATION, "<simple mode indication>");
    r = simple_mode_indication_0(b, l + 1);
    r = r && interface_type_indication(b, l + 1);
    r = r && simple_mode_indication_2(b, l + 1);
    r = r && simple_mode_indication_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // mode?
  private static boolean simple_mode_indication_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_mode_indication_0")) return false;
    mode(b, l + 1);
    return true;
  }

  // BUS?
  private static boolean simple_mode_indication_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_mode_indication_2")) return false;
    consumeToken(b, BUS);
    return true;
  }

  // ( ':=' i_static_conditional_expression )?
  private static boolean simple_mode_indication_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_mode_indication_3")) return false;
    simple_mode_indication_3_0(b, l + 1);
    return true;
  }

  // ':=' i_static_conditional_expression
  private static boolean simple_mode_indication_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_mode_indication_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":=");
    r = r && i_static_conditional_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, SIMPLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // simple_expression direction simple_expression
  public static boolean simple_range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_range")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_RANGE, "<simple range>");
    r = simple_expression(b, l + 1);
    r = r && direction(b, l + 1);
    r = r && simple_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // target '<=' RELEASE force_mode? SEMICOLON
  public static boolean simple_release_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_release_assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_RELEASE_ASSIGNMENT, "<simple release assignment>");
    r = target(b, l + 1);
    r = r && consumeToken(b, "<=");
    r = r && consumeToken(b, RELEASE);
    r = r && simple_release_assignment_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // force_mode?
  private static boolean simple_release_assignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_release_assignment_3")) return false;
    force_mode(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // simple_waveform_assignment|simple_force_assignment|simple_release_assignment
  public static boolean simple_signal_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_signal_assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_SIGNAL_ASSIGNMENT, "<simple signal assignment>");
    r = simple_waveform_assignment(b, l + 1);
    if (!r) r = simple_force_assignment(b, l + 1);
    if (!r) r = simple_release_assignment(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // target ':=' conditional_or_unaffected_expression SEMICOLON
  public static boolean simple_variable_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_variable_assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_VARIABLE_ASSIGNMENT, "<simple variable assignment>");
    r = target(b, l + 1);
    r = r && consumeToken(b, ":=");
    r = r && conditional_or_unaffected_expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // target '<=' delay_mechanism? waveform SEMICOLON
  public static boolean simple_waveform_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_waveform_assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_WAVEFORM_ASSIGNMENT, "<simple waveform assignment>");
    r = target(b, l + 1);
    r = r && consumeToken(b, "<=");
    r = r && simple_waveform_assignment_2(b, l + 1);
    r = r && waveform(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // delay_mechanism?
  private static boolean simple_waveform_assignment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_waveform_assignment_2")) return false;
    delay_mechanism(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // COMMENT
  public static boolean single_line_comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_line_comment")) return false;
    if (!nextTokenIs(b, COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    exit_section_(b, m, SINGLE_LINE_COMMENT, r);
    return r;
  }

  /* ********************************************************** */
  // prefix '(' discrete_range ')'
  public static boolean slice_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slice_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SLICE_NAME, "<slice name>");
    r = prefix(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && discrete_range(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL_TOKEN
  public static boolean string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal")) return false;
    if (!nextTokenIs(b, STRING_LITERAL_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL_TOKEN);
    exit_section_(b, m, STRING_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // subprogram_specification IS subprogram_declarative_part BEGIN subprogram_statement_part END subprogram_kind? designator? SEMICOLON
  public static boolean subprogram_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_BODY, "<subprogram body>");
    r = subprogram_specification(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && subprogram_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && subprogram_statement_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && subprogram_body_6(b, l + 1);
    r = r && subprogram_body_7(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // subprogram_kind?
  private static boolean subprogram_body_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_body_6")) return false;
    subprogram_kind(b, l + 1);
    return true;
  }

  // designator?
  private static boolean subprogram_body_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_body_7")) return false;
    designator(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // subprogram_specification SEMICOLON
  public static boolean subprogram_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_DECLARATION, "<subprogram declaration>");
    r = subprogram_specification(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // subprogram_declaration|subprogram_body|subprogram_instantiation_declaration|package_declaration|package_body|package_instantiation_declaration|type_declaration|subtype_declaration|constant_declaration|variable_declaration|file_declaration|alias_declaration|attribute_declaration|attribute_specification|use_clause|group_template_declaration|group_declaration
  public static boolean subprogram_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_DECLARATIVE_ITEM, "<subprogram declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = subprogram_instantiation_declaration(b, l + 1);
    if (!r) r = package_declaration(b, l + 1);
    if (!r) r = package_body(b, l + 1);
    if (!r) r = package_instantiation_declaration(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // subprogram_declarative_item*
  static boolean subprogram_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_declarative_part")) return false;
    while (true) {
      int c = current_position_(b);
      if (!subprogram_declarative_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "subprogram_declarative_part", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ( GENERIC '(' generic_list ')' generic_map_aspect?)?
  public static boolean subprogram_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_header")) return false;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_HEADER, "<subprogram header>");
    subprogram_header_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // GENERIC '(' generic_list ')' generic_map_aspect?
  private static boolean subprogram_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_header_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GENERIC);
    r = r && consumeToken(b, "(");
    r = r && generic_list(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && subprogram_header_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // generic_map_aspect?
  private static boolean subprogram_header_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_header_0_4")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // subprogram_kind designator IS NEW ii_uninstantiated_subprogram_name signature? generic_map_aspect? SEMICOLON
  public static boolean subprogram_instantiation_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_instantiation_declaration")) return false;
    if (!nextTokenIs(b, "<subprogram instantiation declaration>", FUNCTION, PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_INSTANTIATION_DECLARATION, "<subprogram instantiation declaration>");
    r = subprogram_kind(b, l + 1);
    r = r && designator(b, l + 1);
    r = r && consumeTokens(b, 0, IS, NEW);
    r = r && ii_uninstantiated_subprogram_name(b, l + 1);
    r = r && subprogram_instantiation_declaration_5(b, l + 1);
    r = r && subprogram_instantiation_declaration_6(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // signature?
  private static boolean subprogram_instantiation_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_instantiation_declaration_5")) return false;
    signature(b, l + 1);
    return true;
  }

  // generic_map_aspect?
  private static boolean subprogram_instantiation_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_instantiation_declaration_6")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PROCEDURE|FUNCTION
  public static boolean subprogram_kind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_kind")) return false;
    if (!nextTokenIs(b, "<subprogram kind>", FUNCTION, PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_KIND, "<subprogram kind>");
    r = consumeToken(b, PROCEDURE);
    if (!r) r = consumeToken(b, FUNCTION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // procedure_specification|function_specification
  public static boolean subprogram_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_SPECIFICATION, "<subprogram specification>");
    r = procedure_specification(b, l + 1);
    if (!r) r = function_specification(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // sequential_statement*
  static boolean subprogram_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_statement_part")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sequential_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "subprogram_statement_part", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SUBTYPE IDENTIFIER IS subtype_indication SEMICOLON
  public static boolean subtype_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_declaration")) return false;
    if (!nextTokenIs(b, SUBTYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SUBTYPE, IDENTIFIER, IS);
    r = r && subtype_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SUBTYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // resolution_indication? type_mark constraint?
  public static boolean subtype_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBTYPE_INDICATION, "<subtype indication>");
    r = subtype_indication_0(b, l + 1);
    r = r && type_mark(b, l + 1);
    r = r && subtype_indication_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // resolution_indication?
  private static boolean subtype_indication_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_indication_0")) return false;
    resolution_indication(b, l + 1);
    return true;
  }

  // constraint?
  private static boolean subtype_indication_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_indication_2")) return false;
    constraint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // simple_name|character_literal|operator_symbol|all
  public static boolean suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUFFIX, "<suffix>");
    r = simple_name(b, l + 1);
    if (!r) r = character_literal(b, l + 1);
    if (!r) r = operator_symbol(b, l + 1);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_s|aggregate
  public static boolean target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "target")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TARGET, "<target>");
    r = name_s(b, l + 1);
    if (!r) r = aggregate(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // factor (multiplying_operator factor)*
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = factor(b, l + 1);
    r = r && term_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (multiplying_operator factor)*
  private static boolean term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!term_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_1", c)) break;
    }
    return true;
  }

  // multiplying_operator factor
  private static boolean term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplying_operator(b, l + 1);
    r = r && factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FOR i_time_expression
  public static boolean timeout_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "timeout_clause")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && i_time_expression(b, l + 1);
    exit_section_(b, m, TIMEOUT_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // type_mark '(' expression ')'
  public static boolean type_conversion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_conversion")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_CONVERSION, "<type conversion>");
    r = type_mark(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // full_type_declaration|incomplete_type_declaration
  public static boolean type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = full_type_declaration(b, l + 1);
    if (!r) r = incomplete_type_declaration(b, l + 1);
    exit_section_(b, m, TYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // scalar_type_definition|composite_type_definition|access_type_definition|file_type_definition|protected_type_definition|protected_type_instantiation_definition
  public static boolean type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEFINITION, "<type definition>");
    r = scalar_type_definition(b, l + 1);
    if (!r) r = composite_type_definition(b, l + 1);
    if (!r) r = access_type_definition(b, l + 1);
    if (!r) r = file_type_definition(b, l + 1);
    if (!r) r = protected_type_definition(b, l + 1);
    if (!r) r = protected_type_instantiation_definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // i_type_name|i_subtype_name
  public static boolean type_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_mark")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_MARK, "<type mark>");
    r = i_type_name(b, l + 1);
    if (!r) r = i_subtype_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // primary|(ABS primary)|(NOT primary)|(i_unary_logical_operator primary)
  public static boolean unary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_EXPRESSION, "<unary expression>");
    r = primary(b, l + 1);
    if (!r) r = unary_expression_1(b, l + 1);
    if (!r) r = unary_expression_2(b, l + 1);
    if (!r) r = unary_expression_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ABS primary
  private static boolean unary_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ABS);
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT primary
  private static boolean unary_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // i_unary_logical_operator primary
  private static boolean unary_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_unary_logical_operator(b, l + 1);
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ABS|NOT|i_unary_logical_operator
  public static boolean unary_miscellaneous_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_miscellaneous_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_MISCELLANEOUS_OPERATOR, "<unary miscellaneous operator>");
    r = consumeToken(b, ABS);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = i_unary_logical_operator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ARRAY '(' index_subtype_definition ( ',' index_subtype_definition )* ')' OF i_element_subtype_indication
  public static boolean unbounded_array_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unbounded_array_definition")) return false;
    if (!nextTokenIs(b, ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARRAY);
    r = r && consumeToken(b, "(");
    r = r && index_subtype_definition(b, l + 1);
    r = r && unbounded_array_definition_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, OF);
    r = r && i_element_subtype_indication(b, l + 1);
    exit_section_(b, m, UNBOUNDED_ARRAY_DEFINITION, r);
    return r;
  }

  // ( ',' index_subtype_definition )*
  private static boolean unbounded_array_definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unbounded_array_definition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!unbounded_array_definition_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "unbounded_array_definition_3", c)) break;
    }
    return true;
  }

  // ',' index_subtype_definition
  private static boolean unbounded_array_definition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unbounded_array_definition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && index_subtype_definition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE IS incomplete_type_definition
  public static boolean unspecified_type_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unspecified_type_indication")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, IS);
    r = r && incomplete_type_definition(b, l + 1);
    exit_section_(b, m, UNSPECIFIED_TYPE_INDICATION, r);
    return r;
  }

  /* ********************************************************** */
  // USE selected_name ( ',' selected_name)* SEMICOLON
  public static boolean use_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_clause")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && selected_name(b, l + 1);
    r = r && use_clause_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, USE_CLAUSE, r);
    return r;
  }

  // ( ',' selected_name)*
  private static boolean use_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_clause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_clause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_clause_2", c)) break;
    }
    return true;
  }

  // ',' selected_name
  private static boolean use_clause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_clause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && selected_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( label ':' )? RETURN conditional_or_unaffected_expression SEMICOLON
  public static boolean value_return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_return_statement")) return false;
    if (!nextTokenIs(b, "<value return statement>", IDENTIFIER, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_RETURN_STATEMENT, "<value return statement>");
    r = value_return_statement_0(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && conditional_or_unaffected_expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( label ':' )?
  private static boolean value_return_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_return_statement_0")) return false;
    value_return_statement_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean value_return_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_return_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (( label ':' )? simple_variable_assignment)|(( label ';' )? selected_variable_assignment)
  public static boolean variable_assignment_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_assignment_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_ASSIGNMENT_STATEMENT, "<variable assignment statement>");
    r = variable_assignment_statement_0(b, l + 1);
    if (!r) r = variable_assignment_statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( label ':' )? simple_variable_assignment
  private static boolean variable_assignment_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_assignment_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_assignment_statement_0_0(b, l + 1);
    r = r && simple_variable_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( label ':' )?
  private static boolean variable_assignment_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_assignment_statement_0_0")) return false;
    variable_assignment_statement_0_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean variable_assignment_statement_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_assignment_statement_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( label ';' )? selected_variable_assignment
  private static boolean variable_assignment_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_assignment_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_assignment_statement_1_0(b, l + 1);
    r = r && selected_variable_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( label ';' )?
  private static boolean variable_assignment_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_assignment_statement_1_0")) return false;
    variable_assignment_statement_1_0_0(b, l + 1);
    return true;
  }

  // label ';'
  private static boolean variable_assignment_statement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_assignment_statement_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SHARED? nonshared_variable_declaration
  public static boolean variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration")) return false;
    if (!nextTokenIs(b, "<variable declaration>", SHARED, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = variable_declaration_0(b, l + 1);
    r = r && nonshared_variable_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SHARED?
  private static boolean variable_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_0")) return false;
    consumeToken(b, SHARED);
    return true;
  }

  /* ********************************************************** */
  // USE VUNIT verification_unit_list
  public static boolean verification_unit_binding_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "verification_unit_binding_indication")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, USE, VUNIT);
    r = r && verification_unit_list(b, l + 1);
    exit_section_(b, m, VERIFICATION_UNIT_BINDING_INDICATION, r);
    return r;
  }

  /* ********************************************************** */
  // ii_verification_unit_name ( ',' ii_verification_unit_name )*
  public static boolean verification_unit_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "verification_unit_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VERIFICATION_UNIT_LIST, "<verification unit list>");
    r = ii_verification_unit_name(b, l + 1);
    r = r && verification_unit_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' ii_verification_unit_name )*
  private static boolean verification_unit_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "verification_unit_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!verification_unit_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "verification_unit_list_1", c)) break;
    }
    return true;
  }

  // ',' ii_verification_unit_name
  private static boolean verification_unit_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "verification_unit_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && ii_verification_unit_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // design_unit design_unit*
  static boolean vhdlFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vhdlFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = design_unit(b, l + 1);
    r = r && vhdlFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // design_unit*
  private static boolean vhdlFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vhdlFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!design_unit(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "vhdlFile_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (label ':')? WAIT sensitivity_clause? condition_clause? timeout_clause? SEMICOLON
  public static boolean wait_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement")) return false;
    if (!nextTokenIs(b, "<wait statement>", IDENTIFIER, WAIT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WAIT_STATEMENT, "<wait statement>");
    r = wait_statement_0(b, l + 1);
    r = r && consumeToken(b, WAIT);
    r = r && wait_statement_2(b, l + 1);
    r = r && wait_statement_3(b, l + 1);
    r = r && wait_statement_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (label ':')?
  private static boolean wait_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_0")) return false;
    wait_statement_0_0(b, l + 1);
    return true;
  }

  // label ':'
  private static boolean wait_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // sensitivity_clause?
  private static boolean wait_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_2")) return false;
    sensitivity_clause(b, l + 1);
    return true;
  }

  // condition_clause?
  private static boolean wait_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_3")) return false;
    condition_clause(b, l + 1);
    return true;
  }

  // timeout_clause?
  private static boolean wait_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_4")) return false;
    timeout_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (waveform_element ( ',' waveform_element )*)|UNAFFECTED
  public static boolean waveform(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WAVEFORM, "<waveform>");
    r = waveform_0(b, l + 1);
    if (!r) r = consumeToken(b, UNAFFECTED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // waveform_element ( ',' waveform_element )*
  private static boolean waveform_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = waveform_element(b, l + 1);
    r = r && waveform_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' waveform_element )*
  private static boolean waveform_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!waveform_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "waveform_0_1", c)) break;
    }
    return true;
  }

  // ',' waveform_element
  private static boolean waveform_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && waveform_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (i_value_expression (AFTER i_time_expression)?)|(NULL (AFTER i_time_expression)?)
  public static boolean waveform_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WAVEFORM_ELEMENT, "<waveform element>");
    r = waveform_element_0(b, l + 1);
    if (!r) r = waveform_element_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // i_value_expression (AFTER i_time_expression)?
  private static boolean waveform_element_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = i_value_expression(b, l + 1);
    r = r && waveform_element_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AFTER i_time_expression)?
  private static boolean waveform_element_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_0_1")) return false;
    waveform_element_0_1_0(b, l + 1);
    return true;
  }

  // AFTER i_time_expression
  private static boolean waveform_element_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AFTER);
    r = r && i_time_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NULL (AFTER i_time_expression)?
  private static boolean waveform_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NULL);
    r = r && waveform_element_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AFTER i_time_expression)?
  private static boolean waveform_element_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_1_1")) return false;
    waveform_element_1_1_0(b, l + 1);
    return true;
  }

  // AFTER i_time_expression
  private static boolean waveform_element_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AFTER);
    r = r && i_time_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
