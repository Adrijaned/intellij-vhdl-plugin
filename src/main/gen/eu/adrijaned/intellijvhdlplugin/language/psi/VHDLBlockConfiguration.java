// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLBlockConfiguration extends PsiElement {

  @NotNull
  VHDLBlockSpecification getBlockSpecification();

  @NotNull
  List<VHDLConfigurationItem> getConfigurationItemList();

  @NotNull
  List<VHDLUseClause> getUseClauseList();

}
