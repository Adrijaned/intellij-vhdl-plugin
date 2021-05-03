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

public class VHDLPathnameElementImpl extends ASTWrapperPsiElement implements VHDLPathnameElement {

  public VHDLPathnameElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitPathnameElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLIBlockLabel getIBlockLabel() {
    return findChildByClass(VHDLIBlockLabel.class);
  }

  @Override
  @Nullable
  public VHDLIEntitySimpleName getIEntitySimpleName() {
    return findChildByClass(VHDLIEntitySimpleName.class);
  }

  @Override
  @Nullable
  public VHDLIPackageSimpleName getIPackageSimpleName() {
    return findChildByClass(VHDLIPackageSimpleName.class);
  }

  @Override
  @Nullable
  public VHDLIStaticExpression getIStaticExpression() {
    return findChildByClass(VHDLIStaticExpression.class);
  }

  @Override
  @Nullable
  public VHDLIiComponentInstantiationLabel getIiComponentInstantiationLabel() {
    return findChildByClass(VHDLIiComponentInstantiationLabel.class);
  }

  @Override
  @Nullable
  public VHDLIiGenerateStatementLabel getIiGenerateStatementLabel() {
    return findChildByClass(VHDLIiGenerateStatementLabel.class);
  }

}
