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

public class VHDLIncompleteTypeDefinitionImpl extends ASTWrapperPsiElement implements VHDLIncompleteTypeDefinition {

  public VHDLIncompleteTypeDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitIncompleteTypeDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLAccessIncompleteTypeDefinition getAccessIncompleteTypeDefinition() {
    return findChildByClass(VHDLAccessIncompleteTypeDefinition.class);
  }

  @Override
  @Nullable
  public VHDLArrayIncompleteTypeDefinition getArrayIncompleteTypeDefinition() {
    return findChildByClass(VHDLArrayIncompleteTypeDefinition.class);
  }

  @Override
  @Nullable
  public VHDLDiscreteIncompleteTypeDefinition getDiscreteIncompleteTypeDefinition() {
    return findChildByClass(VHDLDiscreteIncompleteTypeDefinition.class);
  }

  @Override
  @Nullable
  public VHDLFileIncompleteTypeDefinition getFileIncompleteTypeDefinition() {
    return findChildByClass(VHDLFileIncompleteTypeDefinition.class);
  }

  @Override
  @Nullable
  public VHDLFloatingIncompleteTypeDefinition getFloatingIncompleteTypeDefinition() {
    return findChildByClass(VHDLFloatingIncompleteTypeDefinition.class);
  }

  @Override
  @Nullable
  public VHDLIntegerIncompleteTypeDefinition getIntegerIncompleteTypeDefinition() {
    return findChildByClass(VHDLIntegerIncompleteTypeDefinition.class);
  }

  @Override
  @Nullable
  public VHDLPhysicalIncompleteTypeDefinition getPhysicalIncompleteTypeDefinition() {
    return findChildByClass(VHDLPhysicalIncompleteTypeDefinition.class);
  }

  @Override
  @Nullable
  public VHDLPrivateIncompleteTypeDefinition getPrivateIncompleteTypeDefinition() {
    return findChildByClass(VHDLPrivateIncompleteTypeDefinition.class);
  }

  @Override
  @Nullable
  public VHDLScalarIncompleteTypeDefinition getScalarIncompleteTypeDefinition() {
    return findChildByClass(VHDLScalarIncompleteTypeDefinition.class);
  }

}
