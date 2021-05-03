// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLCaseGenerateStatement extends PsiElement {

  @NotNull
  List<VHDLCaseGenerateAlternative> getCaseGenerateAlternativeList();

  @NotNull
  VHDLExpression getExpression();

  @NotNull
  List<VHDLIGenerateLabel> getIGenerateLabelList();

}
