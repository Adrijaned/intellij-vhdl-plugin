// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLFunctionSpecification extends PsiElement {

  @NotNull
  VHDLDesignator getDesignator();

  @Nullable
  VHDLFormalParameterList getFormalParameterList();

  @Nullable
  VHDLIReturnIdentifier getIReturnIdentifier();

  @NotNull
  VHDLSubprogramHeader getSubprogramHeader();

  @NotNull
  VHDLTypeMark getTypeMark();

}
