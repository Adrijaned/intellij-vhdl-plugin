// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLAliasDeclaration extends PsiElement {

  @NotNull
  VHDLAliasDesignator getAliasDesignator();

  @NotNull
  VHDLNameS getNameS();

  @Nullable
  VHDLSignature getSignature();

  @Nullable
  VHDLSubtypeIndication getSubtypeIndication();

}
