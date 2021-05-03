// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLEntityDeclaration extends PsiElement {

  @NotNull
  List<VHDLEntityDeclarativeItem> getEntityDeclarativeItemList();

  @NotNull
  VHDLEntityHeader getEntityHeader();

  @NotNull
  List<VHDLEntityStatement> getEntityStatementList();

  @Nullable
  VHDLIEntitySimpleName getIEntitySimpleName();

}
