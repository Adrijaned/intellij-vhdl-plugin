// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLSimpleExpression extends PsiElement {

  @NotNull
  List<VHDLAddingOperator> getAddingOperatorList();

  @Nullable
  VHDLSign getSign();

  @NotNull
  List<VHDLTerm> getTermList();

}
