// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLSelectedForceAssignment extends PsiElement {

  @NotNull
  VHDLExpression getExpression();

  @Nullable
  VHDLForceMode getForceMode();

  @NotNull
  VHDLSelectedExpressions getSelectedExpressions();

  @NotNull
  VHDLTarget getTarget();

}
