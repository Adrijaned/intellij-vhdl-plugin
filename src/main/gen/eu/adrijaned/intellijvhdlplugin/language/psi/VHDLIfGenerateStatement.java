// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLIfGenerateStatement extends PsiElement {

  @NotNull
  List<VHDLCondition> getConditionList();

  @NotNull
  List<VHDLGenerateStatementBody> getGenerateStatementBodyList();

  @NotNull
  List<VHDLIAlternativeLabel> getIAlternativeLabelList();

  @NotNull
  List<VHDLIGenerateLabel> getIGenerateLabelList();

}
