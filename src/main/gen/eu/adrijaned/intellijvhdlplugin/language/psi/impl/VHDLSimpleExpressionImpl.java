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

public class VHDLSimpleExpressionImpl extends ASTWrapperPsiElement implements VHDLSimpleExpression {

  public VHDLSimpleExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitSimpleExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<VHDLAddingOperator> getAddingOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLAddingOperator.class);
  }

  @Override
  @Nullable
  public VHDLSign getSign() {
    return findChildByClass(VHDLSign.class);
  }

  @Override
  @NotNull
  public List<VHDLTerm> getTermList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLTerm.class);
  }

}
