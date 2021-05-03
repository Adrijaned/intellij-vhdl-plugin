package eu.adrijaned.intellijvhdlplugin.language;

import com.intellij.lexer.FlexAdapter;

public class VHDLLexerAdapter extends FlexAdapter {
    public VHDLLexerAdapter() {
        super(new VHDLLexer(null));
    }
}
