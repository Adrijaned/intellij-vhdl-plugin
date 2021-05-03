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

public class VHDLGenerateStatementBodyImpl extends ASTWrapperPsiElement implements VHDLGenerateStatementBody {

  public VHDLGenerateStatementBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitGenerateStatementBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLBlockDeclarativePart getBlockDeclarativePart() {
    return findChildByClass(VHDLBlockDeclarativePart.class);
  }

  @Override
  @NotNull
  public List<VHDLConcurrentStatement> getConcurrentStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLConcurrentStatement.class);
  }

  @Override
  @Nullable
  public VHDLIAlternativeLabel getIAlternativeLabel() {
    return findChildByClass(VHDLIAlternativeLabel.class);
  }

}
