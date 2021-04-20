package eu.adrijaned.intellijvhdlplugin.extensions;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class VHDLLanguage extends Language {
    public static final VHDLLanguage INSTANCE = new VHDLLanguage();

    private VHDLLanguage() {
        super("VHDL");
    }
}
