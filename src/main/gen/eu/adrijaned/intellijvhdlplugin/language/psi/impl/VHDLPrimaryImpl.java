// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static eu.adrijaned.intellijvhdlplugin.language.psi.VHDLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import eu.adrijaned.intellijvhdlplugin.language.psi.*;

public class VHDLPrimaryImpl extends ASTWrapperPsiElement implements VHDLPrimary {

  public VHDLPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitPrimary(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLAllocator getAllocator() {
    return findChildByClass(VHDLAllocator.class);
  }

  @Override
  @Nullable
  public VHDLConditionalExpression getConditionalExpression() {
    return findChildByClass(VHDLConditionalExpression.class);
  }

  @Override
  @Nullable
  public VHDLFunctionCall getFunctionCall() {
    return findChildByClass(VHDLFunctionCall.class);
  }

  @Override
  @Nullable
  public VHDLLiteral getLiteral() {
    return findChildByClass(VHDLLiteral.class);
  }

  @Override
  @Nullable
  public VHDLNameS getNameS() {
    return findChildByClass(VHDLNameS.class);
  }

  @Override
  @Nullable
  public VHDLQualifiedXpression getQualifiedXpression() {
    return findChildByClass(VHDLQualifiedXpression.class);
  }

  @Override
  @Nullable
  public VHDLTypeConversion getTypeConversion() {
    return findChildByClass(VHDLTypeConversion.class);
  }

}
