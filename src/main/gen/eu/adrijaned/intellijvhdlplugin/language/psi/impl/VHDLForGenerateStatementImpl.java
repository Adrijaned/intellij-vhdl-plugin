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

public class VHDLForGenerateStatementImpl extends ASTWrapperPsiElement implements VHDLForGenerateStatement {

  public VHDLForGenerateStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitForGenerateStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLGenerateStatementBody getGenerateStatementBody() {
    return findNotNullChildByClass(VHDLGenerateStatementBody.class);
  }

  @Override
  @NotNull
  public List<VHDLIGenerateLabel> getIGenerateLabelList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLIGenerateLabel.class);
  }

  @Override
  @NotNull
  public VHDLIGenerateParameterSpecification getIGenerateParameterSpecification() {
    return findNotNullChildByClass(VHDLIGenerateParameterSpecification.class);
  }

}
