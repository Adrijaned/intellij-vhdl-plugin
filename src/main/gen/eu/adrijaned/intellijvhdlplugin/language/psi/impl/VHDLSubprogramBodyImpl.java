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

public class VHDLSubprogramBodyImpl extends ASTWrapperPsiElement implements VHDLSubprogramBody {

  public VHDLSubprogramBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitSubprogramBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLDesignator getDesignator() {
    return findChildByClass(VHDLDesignator.class);
  }

  @Override
  @NotNull
  public List<VHDLSequentialStatement> getSequentialStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLSequentialStatement.class);
  }

  @Override
  @NotNull
  public List<VHDLSubprogramDeclarativeItem> getSubprogramDeclarativeItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLSubprogramDeclarativeItem.class);
  }

  @Override
  @Nullable
  public VHDLSubprogramKind getSubprogramKind() {
    return findChildByClass(VHDLSubprogramKind.class);
  }

  @Override
  @NotNull
  public VHDLSubprogramSpecification getSubprogramSpecification() {
    return findNotNullChildByClass(VHDLSubprogramSpecification.class);
  }

}
