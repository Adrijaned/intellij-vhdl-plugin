// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLConditionalExpression extends PsiElement {

  @NotNull
  List<VHDLCondition> getConditionList();

  @NotNull
  List<VHDLExpression> getExpressionList();

}
