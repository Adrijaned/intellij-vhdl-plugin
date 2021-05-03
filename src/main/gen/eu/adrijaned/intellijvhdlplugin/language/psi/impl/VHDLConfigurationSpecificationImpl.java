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

public class VHDLConfigurationSpecificationImpl extends ASTWrapperPsiElement implements VHDLConfigurationSpecification {

  public VHDLConfigurationSpecificationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitConfigurationSpecification(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLCompoundConfigurationSpecification getCompoundConfigurationSpecification() {
    return findChildByClass(VHDLCompoundConfigurationSpecification.class);
  }

  @Override
  @Nullable
  public VHDLSimpleConfigurationSpecification getSimpleConfigurationSpecification() {
    return findChildByClass(VHDLSimpleConfigurationSpecification.class);
  }

}
