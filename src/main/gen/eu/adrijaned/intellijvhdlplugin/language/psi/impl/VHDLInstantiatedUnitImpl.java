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

public class VHDLInstantiatedUnitImpl extends ASTWrapperPsiElement implements VHDLInstantiatedUnit {

  public VHDLInstantiatedUnitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitInstantiatedUnit(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLIArchitectureIdentifier getIArchitectureIdentifier() {
    return findChildByClass(VHDLIArchitectureIdentifier.class);
  }

  @Override
  @Nullable
  public VHDLIComponentName getIComponentName() {
    return findChildByClass(VHDLIComponentName.class);
  }

  @Override
  @Nullable
  public VHDLIConfigurationName getIConfigurationName() {
    return findChildByClass(VHDLIConfigurationName.class);
  }

  @Override
  @Nullable
  public VHDLIEntityName getIEntityName() {
    return findChildByClass(VHDLIEntityName.class);
  }

}
