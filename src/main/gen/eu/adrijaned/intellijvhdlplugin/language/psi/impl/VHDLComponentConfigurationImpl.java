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

public class VHDLComponentConfigurationImpl extends ASTWrapperPsiElement implements VHDLComponentConfiguration {

  public VHDLComponentConfigurationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitComponentConfiguration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLBindingIndication getBindingIndication() {
    return findChildByClass(VHDLBindingIndication.class);
  }

  @Override
  @Nullable
  public VHDLBlockConfiguration getBlockConfiguration() {
    return findChildByClass(VHDLBlockConfiguration.class);
  }

  @Override
  @NotNull
  public VHDLComponentSpecification getComponentSpecification() {
    return findNotNullChildByClass(VHDLComponentSpecification.class);
  }

  @Override
  @NotNull
  public List<VHDLVerificationUnitBindingIndication> getVerificationUnitBindingIndicationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLVerificationUnitBindingIndication.class);
  }

}
