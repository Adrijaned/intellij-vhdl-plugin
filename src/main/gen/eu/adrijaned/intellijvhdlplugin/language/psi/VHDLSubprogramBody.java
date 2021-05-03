// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLSubprogramBody extends PsiElement {

  @Nullable
  VHDLDesignator getDesignator();

  @NotNull
  List<VHDLSequentialStatement> getSequentialStatementList();

  @NotNull
  List<VHDLSubprogramDeclarativeItem> getSubprogramDeclarativeItemList();

  @Nullable
  VHDLSubprogramKind getSubprogramKind();

  @NotNull
  VHDLSubprogramSpecification getSubprogramSpecification();

}
