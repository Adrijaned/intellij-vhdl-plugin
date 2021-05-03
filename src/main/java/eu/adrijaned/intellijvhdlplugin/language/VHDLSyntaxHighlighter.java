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
        return tokenType.equals(VHDLTypes.ARCHITECTURE) ||
                tokenType.equals(VHDLTypes.END) ||
                tokenType.equals(VHDLTypes.ENTITY) ||
                tokenType.equals(VHDLTypes.GENERIC) ||
                tokenType.equals(VHDLTypes.PORT) ||
                tokenType.equals(VHDLTypes.LIBRARY) ||
                tokenType.equals(VHDLTypes.IS) ||
                tokenType.equals(VHDLTypes.USE) ||
                tokenType.equals(VHDLTypes.PACKAGE);
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
