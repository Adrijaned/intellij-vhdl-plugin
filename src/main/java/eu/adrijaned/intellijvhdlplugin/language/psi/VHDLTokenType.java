package eu.adrijaned.intellijvhdlplugin.language.psi;

import com.intellij.psi.tree.IElementType;
import eu.adrijaned.intellijvhdlplugin.extensions.VHDLLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class VHDLTokenType extends IElementType {
    public VHDLTokenType(@NotNull @NonNls String debugName) {
        super(debugName, VHDLLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "VHDLTokenType." + super.toString();
    }
}
