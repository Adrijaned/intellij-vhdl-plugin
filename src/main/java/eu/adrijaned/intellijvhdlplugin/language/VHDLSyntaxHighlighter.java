package eu.adrijaned.intellijvhdlplugin.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import eu.adrijaned.intellijvhdlplugin.language.psi.VHDLTypes;
import org.jetbrains.annotations.NotNull;

public class VHDLSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMENT = TextAttributesKey.createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new VHDLLexerAdapter();
    }

    private boolean isKeyword(IElementType tokenType) {
        return
                tokenType.equals(VHDLTypes.ABS) ||
                tokenType.equals(VHDLTypes.ACCESS) ||
                tokenType.equals(VHDLTypes.AFTER) ||
                tokenType.equals(VHDLTypes.ALIAS) ||
                tokenType.equals(VHDLTypes.ALL) ||
                tokenType.equals(VHDLTypes.AND) ||
                tokenType.equals(VHDLTypes.ARCHITECTURE) ||
                tokenType.equals(VHDLTypes.ARRAY) ||
                tokenType.equals(VHDLTypes.ASSERT) ||
                tokenType.equals(VHDLTypes.ATTRIBUTE) ||
                tokenType.equals(VHDLTypes.BEGIN) ||
                tokenType.equals(VHDLTypes.BLOCK) ||
                tokenType.equals(VHDLTypes.BODY) ||
                tokenType.equals(VHDLTypes.BUFFER) ||
                tokenType.equals(VHDLTypes.BUS) ||
                tokenType.equals(VHDLTypes.CASE) ||
                tokenType.equals(VHDLTypes.CONFIGURATION) ||
                tokenType.equals(VHDLTypes.COMPONENT) ||
                tokenType.equals(VHDLTypes.CONSTANT) ||
                tokenType.equals(VHDLTypes.CONTEXT) ||
                tokenType.equals(VHDLTypes.DEFAULT) ||
                tokenType.equals(VHDLTypes.DISCONNECT) ||
                tokenType.equals(VHDLTypes.DOWNTO) ||
                tokenType.equals(VHDLTypes.ELSE) ||
                tokenType.equals(VHDLTypes.ELSIF) ||
                tokenType.equals(VHDLTypes.END) ||
                tokenType.equals(VHDLTypes.ENTITY) ||
                tokenType.equals(VHDLTypes.EXIT) ||
                tokenType.equals(VHDLTypes.FILE) ||
                tokenType.equals(VHDLTypes.FOR) ||
                tokenType.equals(VHDLTypes.FORCE) ||
                tokenType.equals(VHDLTypes.FUNCTION) ||
                tokenType.equals(VHDLTypes.GENERATE) ||
                tokenType.equals(VHDLTypes.GENERIC) ||
                tokenType.equals(VHDLTypes.GROUP) ||
                tokenType.equals(VHDLTypes.GUARDED) ||
                tokenType.equals(VHDLTypes.IF) ||
                tokenType.equals(VHDLTypes.IMPURE) ||
                tokenType.equals(VHDLTypes.IN) ||
                tokenType.equals(VHDLTypes.INERTIAL) ||
                tokenType.equals(VHDLTypes.INOUT) ||
                tokenType.equals(VHDLTypes.IS) ||
                tokenType.equals(VHDLTypes.LABEL_TOKEN) ||
                tokenType.equals(VHDLTypes.LIBRARY) ||
                tokenType.equals(VHDLTypes.LINKAGE) ||
                tokenType.equals(VHDLTypes.LITERAL_TOKEN) ||
                tokenType.equals(VHDLTypes.LOOP) ||
                tokenType.equals(VHDLTypes.NAND) ||
                tokenType.equals(VHDLTypes.NEW) ||
                tokenType.equals(VHDLTypes.NEXT) ||
                tokenType.equals(VHDLTypes.NOR) ||
                tokenType.equals(VHDLTypes.NOT) ||
                tokenType.equals(VHDLTypes.NULL) ||
                tokenType.equals(VHDLTypes.MAP) ||
                tokenType.equals(VHDLTypes.MOD) ||
                tokenType.equals(VHDLTypes.OF) ||
                tokenType.equals(VHDLTypes.ON) ||
                tokenType.equals(VHDLTypes.OPEN) ||
                tokenType.equals(VHDLTypes.OR) ||
                tokenType.equals(VHDLTypes.OTHERS) ||
                tokenType.equals(VHDLTypes.OUT) ||
                tokenType.equals(VHDLTypes.PACKAGE) ||
                tokenType.equals(VHDLTypes.PORT) ||
                tokenType.equals(VHDLTypes.POSTPONED) ||
                tokenType.equals(VHDLTypes.PRIVATE_TOKEN) ||
                tokenType.equals(VHDLTypes.PROCEDURE) ||
                tokenType.equals(VHDLTypes.PROCESS) ||
                tokenType.equals(VHDLTypes.PROPERTY) ||
                tokenType.equals(VHDLTypes.PROTECTED) ||
                tokenType.equals(VHDLTypes.PURE) ||
                tokenType.equals(VHDLTypes.RANGE_TOKEN) ||
                tokenType.equals(VHDLTypes.RECORD) ||
                tokenType.equals(VHDLTypes.REGISTER) ||
                tokenType.equals(VHDLTypes.REJECT) ||
                tokenType.equals(VHDLTypes.RELEASE) ||
                tokenType.equals(VHDLTypes.REM) ||
                tokenType.equals(VHDLTypes.REPORT) ||
                tokenType.equals(VHDLTypes.RETURN) ||
                tokenType.equals(VHDLTypes.ROL) ||
                tokenType.equals(VHDLTypes.ROR) ||
                tokenType.equals(VHDLTypes.SELECT) ||
                tokenType.equals(VHDLTypes.SEQUENCE) ||
                tokenType.equals(VHDLTypes.SEVERITY) ||
                tokenType.equals(VHDLTypes.SHARED) ||
                tokenType.equals(VHDLTypes.SIGNAL) ||
                tokenType.equals(VHDLTypes.SLA) ||
                tokenType.equals(VHDLTypes.SLL) ||
                tokenType.equals(VHDLTypes.SRA) ||
                tokenType.equals(VHDLTypes.SRL) ||
                tokenType.equals(VHDLTypes.SUBTYPE) ||
                tokenType.equals(VHDLTypes.THEN) ||
                tokenType.equals(VHDLTypes.TO) ||
                tokenType.equals(VHDLTypes.TRANSPORT) ||
                tokenType.equals(VHDLTypes.TYPE) ||
                tokenType.equals(VHDLTypes.UNAFFECTED) ||
                tokenType.equals(VHDLTypes.UNITS) ||
                tokenType.equals(VHDLTypes.UNTIL) ||
                tokenType.equals(VHDLTypes.USE) ||
                tokenType.equals(VHDLTypes.VARIABLE) ||
                tokenType.equals(VHDLTypes.VIEW) ||
                tokenType.equals(VHDLTypes.WAIT) ||
                tokenType.equals(VHDLTypes.WHEN) ||
                tokenType.equals(VHDLTypes.WHILE) ||
                tokenType.equals(VHDLTypes.WITH) ||
                tokenType.equals(VHDLTypes.XNOR) ||
                tokenType.equals(VHDLTypes.XOR);
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(VHDLTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (isKeyword(tokenType)) {
            return KEYWORD_KEYS;
        }
        return EMPTY_KEYS;
    }
}
