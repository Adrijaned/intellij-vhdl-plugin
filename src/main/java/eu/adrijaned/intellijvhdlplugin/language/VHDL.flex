package eu.adrijaned.intellijvhdlplugin.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import eu.adrijaned.intellijvhdlplugin.language.psi.VHDLTokenType;import eu.adrijaned.intellijvhdlplugin.language.psi.VHDLTypes;
import com.intellij.psi.TokenType;

%%

%class VHDLLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%caseless
%eof{  return;
%eof}

WHITE_SPACE=[\ \n\t\f\r]
IDENTIFIER=[a-zA-Z][a-zA-Z0-9_]+
DECIMAL_LITERAL=[]

%%

--[^\n\r]+[\n\r]                    { return VHDLTypes.COMMENT; }
";"                                 { return VHDLTypes.SEMICOLON; }
"abs"                               { return VHDLTypes.ABS; }
"access"                            { return VHDLTypes.ACCESS; }
"after"                             { return VHDLTypes.AFTER; }
"alias"                             { return VHDLTypes.ALIAS; }
"all"                               { return VHDLTypes.ALL; }
"and"                               { return VHDLTypes.AND; }
"architecture"                      { return VHDLTypes.ARCHITECTURE; }
"array"                             { return VHDLTypes.ARRAY; }
"assert"                            { return VHDLTypes.ASSERT; }
"attribute"                         { return VHDLTypes.ATTRIBUTE; }
"begin"                             { return VHDLTypes.BEGIN; }
"block"                             { return VHDLTypes.BLOCK; }
"body"                              { return VHDLTypes.BODY; }
"buffer"                            { return VHDLTypes.BUFFER; }
"bus"                               { return VHDLTypes.BUS; }
"case"                              { return VHDLTypes.CASE; }
"configuration"                     { return VHDLTypes.CONFIGURATION; }
"component"                         { return VHDLTypes.COMPONENT; }
"constant"                          { return VHDLTypes.CONSTANT; }
"context"                           { return VHDLTypes.CONTEXT; }
"default"                           { return VHDLTypes.DEFAULT; }
"disconnect"                        { return VHDLTypes.DISCONNECT; }
"downto"                            { return VHDLTypes.DOWNTO; }
"else"                              { return VHDLTypes.ELSE; }
"elsif"                             { return VHDLTypes.ELSIF; }
"end"                               { return VHDLTypes.END; }
"entity"                            { return VHDLTypes.ENTITY; }
"exit"                              { return VHDLTypes.EXIT; }
"file"                              { return VHDLTypes.FILE; }
"for"                               { return VHDLTypes.FOR; }
"force"                             { return VHDLTypes.FORCE; }
"function"                          { return VHDLTypes.FUNCTION; }
"generate"                          { return VHDLTypes.GENERATE; }
"generic"                           { return VHDLTypes.GENERIC; }
"group"                             { return VHDLTypes.GROUP; }
"guarded"                           { return VHDLTypes.GUARDED; }
"if"                                { return VHDLTypes.IF; }
"impure"                            { return VHDLTypes.IMPURE; }
"in"                                { return VHDLTypes.IN; }
"inertial"                          { return VHDLTypes.INERTIAL; }
"inout"                             { return VHDLTypes.INOUT; }
"is"                                { return VHDLTypes.IS; }
"label"                             { return VHDLTypes.LABEL_TOKEN; }
"library"                           { return VHDLTypes.LIBRARY; }
"linkage"                           { return VHDLTypes.LINKAGE; }
"literal"                           { return VHDLTypes.LITERAL_TOKEN; }
"loop"                              { return VHDLTypes.LOOP; }
"nand"                              { return VHDLTypes.NAND; }
"new"                               { return VHDLTypes.NEW; }
"next"                              { return VHDLTypes.NEXT; }
"nor"                               { return VHDLTypes.NOR; }
"not"                               { return VHDLTypes.NOT; }
"null"                              { return VHDLTypes.NULL; }
"map"                               { return VHDLTypes.MAP; }
"mod"                               { return VHDLTypes.MOD; }
"of"                                { return VHDLTypes.OF; }
"on"                                { return VHDLTypes.ON; }
"open"                              { return VHDLTypes.OPEN; }
"or"                                { return VHDLTypes.OR; }
"others"                            { return VHDLTypes.OTHERS; }
"out"                               { return VHDLTypes.OUT; }
"package"                           { return VHDLTypes.PACKAGE; }
"port"                              { return VHDLTypes.PORT; }
"postponed"                         { return VHDLTypes.POSTPONED; }
"private"                           { return VHDLTypes.PRIVATE_TOKEN; }
"procedure"                         { return VHDLTypes.PROCEDURE; }
"process"                           { return VHDLTypes.PROCESS; }
"property"                          { return VHDLTypes.PROPERTY; }
"protected"                         { return VHDLTypes.PROTECTED; }
"pure"                              { return VHDLTypes.PURE; }
"range"                             { return VHDLTypes.RANGE_TOKEN; }
"record"                            { return VHDLTypes.RECORD; }
"register"                          { return VHDLTypes.REGISTER; }
"reject"                            { return VHDLTypes.REJECT; }
"release"                           { return VHDLTypes.RELEASE; }
"rem"                               { return VHDLTypes.REM; }
"report"                            { return VHDLTypes.REPORT; }
"return"                            { return VHDLTypes.RETURN; }
"rol"                               { return VHDLTypes.ROL; }
"ror"                               { return VHDLTypes.ROR; }
"select"                            { return VHDLTypes.SELECT; }
"sequence"                          { return VHDLTypes.SEQUENCE; }
"severity"                          { return VHDLTypes.SEVERITY; }
"shared"                            { return VHDLTypes.SHARED; }
"signal"                            { return VHDLTypes.SIGNAL; }
"sla"                               { return VHDLTypes.SLA; }
"sll"                               { return VHDLTypes.SLL; }
"sra"                               { return VHDLTypes.SRA; }
"srl"                               { return VHDLTypes.SRL; }
"subtype"                           { return VHDLTypes.SUBTYPE; }
"then"                              { return VHDLTypes.THEN; }
"to"                                { return VHDLTypes.TO; }
"transport"                         { return VHDLTypes.TRANSPORT; }
"type"                              { return VHDLTypes.TYPE; }
"unaffected"                        { return VHDLTypes.UNAFFECTED; }
"units"                             { return VHDLTypes.UNITS; }
"until"                             { return VHDLTypes.UNTIL; }
"use"                               { return VHDLTypes.USE; }
"variable"                          { return VHDLTypes.VARIABLE; }
"view"                              { return VHDLTypes.VIEW; }
"wait"                              { return VHDLTypes.WAIT; }
"when"                              { return VHDLTypes.WHEN; }
"while"                             { return VHDLTypes.WHILE; }
"with"                              { return VHDLTypes.WITH; }
"xnor"                              { return VHDLTypes.XNOR; }
"xor"                               { return VHDLTypes.XOR; }
'.'                                 { return VHDLTypes.CHARACTER_LITERAL_TOKEN; }
"'"                                 { return VHDLTypes.SINGLE_QUOTE; }
\"([^\"]|\"\")*\"                   { return VHDLTypes.STRING_LITERAL_TOKEN; }
{IDENTIFIER}                        { return VHDLTypes.IDENTIFIER; }
[0-9][_0-9]*                        { return VHDLTypes.INTEGER; }
{WHITE_SPACE}+                      { return TokenType.WHITE_SPACE; }
[^]                                 { return TokenType.BAD_CHARACTER; }
