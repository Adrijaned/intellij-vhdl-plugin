package eu.adrijaned.intellijvhdlplugin.language;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import eu.adrijaned.intellijvhdlplugin.extensions.VHDLFileType;
import eu.adrijaned.intellijvhdlplugin.extensions.VHDLLanguage;
import org.jetbrains.annotations.NotNull;

public class VHDLFile extends PsiFileBase {
    @Override
    public String toString() {
        return "VHDL File";
    }

    protected VHDLFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, VHDLLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return VHDLFileType.INSTANCE;
    }
}
