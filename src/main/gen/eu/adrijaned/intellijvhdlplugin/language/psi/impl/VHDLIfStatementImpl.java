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

public class VHDLIfStatementImpl extends ASTWrapperPsiElement implements VHDLIfStatement {

  public VHDLIfStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitIfStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<VHDLCondition> getConditionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLCondition.class);
  }

  @Override
  @NotNull
  public List<VHDLIIfLabel> getIIfLabelList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLIIfLabel.class);
  }

  @Override
  @NotNull
  public List<VHDLSequenceOfStatements> getSequenceOfStatementsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLSequenceOfStatements.class);
  }

}
