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

public class VHDLRangeImpl extends ASTWrapperPsiElement implements VHDLRange {

  public VHDLRangeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitRange(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLIRangeAttributeName getIRangeAttributeName() {
    return findChildByClass(VHDLIRangeAttributeName.class);
  }

  @Override
  @Nullable
  public VHDLIRangeExpression getIRangeExpression() {
    return findChildByClass(VHDLIRangeExpression.class);
  }

  @Override
  @Nullable
  public VHDLSimpleRange getSimpleRange() {
    return findChildByClass(VHDLSimpleRange.class);
  }

}
