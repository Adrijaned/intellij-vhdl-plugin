// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLPrimary extends PsiElement {

  @Nullable
  VHDLAllocator getAllocator();

  @Nullable
  VHDLConditionalExpression getConditionalExpression();

  @Nullable
  VHDLFunctionCall getFunctionCall();

  @Nullable
  VHDLLiteral getLiteral();

  @Nullable
  VHDLNameS getNameS();

  @Nullable
  VHDLQualifiedXpression getQualifiedXpression();

  @Nullable
  VHDLTypeConversion getTypeConversion();

}
