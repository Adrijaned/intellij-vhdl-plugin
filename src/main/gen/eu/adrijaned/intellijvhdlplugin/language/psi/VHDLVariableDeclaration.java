// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLVariableDeclaration extends PsiElement {

  @Nullable
  VHDLConditionalExpression getConditionalExpression();

  @Nullable
  VHDLGenericMapAspect getGenericMapAspect();

  @NotNull
  VHDLIdentifierList getIdentifierList();

  @NotNull
  VHDLSubtypeIndication getSubtypeIndication();

}
