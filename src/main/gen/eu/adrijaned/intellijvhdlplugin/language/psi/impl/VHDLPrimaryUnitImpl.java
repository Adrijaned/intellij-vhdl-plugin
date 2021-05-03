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

public class VHDLPrimaryUnitImpl extends ASTWrapperPsiElement implements VHDLPrimaryUnit {

  public VHDLPrimaryUnitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitPrimaryUnit(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLConfigurationDeclaration getConfigurationDeclaration() {
    return findChildByClass(VHDLConfigurationDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLContextDeclaration getContextDeclaration() {
    return findChildByClass(VHDLContextDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLEntityDeclaration getEntityDeclaration() {
    return findChildByClass(VHDLEntityDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLIPSLVerificationUnit getIPSLVerificationUnit() {
    return findChildByClass(VHDLIPSLVerificationUnit.class);
  }

  @Override
  @Nullable
  public VHDLPackageDeclaration getPackageDeclaration() {
    return findChildByClass(VHDLPackageDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLPackageInstantiationDeclaration getPackageInstantiationDeclaration() {
    return findChildByClass(VHDLPackageInstantiationDeclaration.class);
  }

}
