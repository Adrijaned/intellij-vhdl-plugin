// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLSubprogramInstantiationDeclaration extends PsiElement {

  @NotNull
  VHDLDesignator getDesignator();

  @Nullable
  VHDLGenericMapAspect getGenericMapAspect();

  @NotNull
  VHDLIiUninstantiatedSubprogramName getIiUninstantiatedSubprogramName();

  @Nullable
  VHDLSignature getSignature();

  @NotNull
  VHDLSubprogramKind getSubprogramKind();

}
