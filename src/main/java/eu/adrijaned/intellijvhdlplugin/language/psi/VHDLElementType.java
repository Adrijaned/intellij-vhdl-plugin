package eu.adrijaned.intellijvhdlplugin.language.psi;

import com.intellij.psi.tree.IElementType;
import eu.adrijaned.intellijvhdlplugin.extensions.VHDLLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class VHDLElementType extends IElementType {
    public VHDLElementType(@NotNull @NonNls String debugName) {
        super(debugName, VHDLLanguage.INSTANCE);
    }
}
