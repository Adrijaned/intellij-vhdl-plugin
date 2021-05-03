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

public class VHDLConfigurationDeclarationImpl extends ASTWrapperPsiElement implements VHDLConfigurationDeclaration {

  public VHDLConfigurationDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitConfigurationDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLBlockConfiguration getBlockConfiguration() {
    return findNotNullChildByClass(VHDLBlockConfiguration.class);
  }

  @Override
  @NotNull
  public List<VHDLConfigurationDeclarativeItem> getConfigurationDeclarativeItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLConfigurationDeclarativeItem.class);
  }

  @Override
  @NotNull
  public VHDLIConfigurationSimpleName getIConfigurationSimpleName() {
    return findNotNullChildByClass(VHDLIConfigurationSimpleName.class);
  }

  @Override
  @NotNull
  public VHDLIEntityName getIEntityName() {
    return findNotNullChildByClass(VHDLIEntityName.class);
  }

  @Override
  @NotNull
  public List<VHDLVerificationUnitBindingIndication> getVerificationUnitBindingIndicationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLVerificationUnitBindingIndication.class);
  }

}
