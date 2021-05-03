// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLModeViewDeclaration extends PsiElement {

  @NotNull
  VHDLIUnresolvedRecordSubtypeIndication getIUnresolvedRecordSubtypeIndication();

  @Nullable
  VHDLIiModeViewSimpleName getIiModeViewSimpleName();

  @NotNull
  List<VHDLModeViewElementDefinition> getModeViewElementDefinitionList();

}
