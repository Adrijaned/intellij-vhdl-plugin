package eu.adrijaned.intellijvhdlplugin.extensions;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class VHDLFileType extends LanguageFileType {
    public static final VHDLFileType INSTANCE = new VHDLFileType();

    private VHDLFileType() {
        super(VHDLLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "VHDL Source file";
    }

    @Override
    public @NotNull @NlsContexts.Label String getDescription() {
        return "Source code files containing VHDL code";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "vhd";
    }

    @Override
    public @Nullable Icon getIcon() {
        return VHDLIcons.FILE;
    }

    @Override
    public boolean isReadOnly() {
        return false;
    }
}
