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

public class VHDLNameSImpl extends ASTWrapperPsiElement implements VHDLNameS {

  public VHDLNameSImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitNameS(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLAttributeName getAttributeName() {
    return findChildByClass(VHDLAttributeName.class);
  }

  @Override
  @Nullable
  public VHDLCharacterLiteral getCharacterLiteral() {
    return findChildByClass(VHDLCharacterLiteral.class);
  }

  @Override
  @Nullable
  public VHDLExternalName getExternalName() {
    return findChildByClass(VHDLExternalName.class);
  }

  @Override
  @Nullable
  public VHDLIndexedName getIndexedName() {
    return findChildByClass(VHDLIndexedName.class);
  }

  @Override
  @Nullable
  public VHDLOperatorSymbol getOperatorSymbol() {
    return findChildByClass(VHDLOperatorSymbol.class);
  }

  @Override
  @Nullable
  public VHDLSelectedName getSelectedName() {
    return findChildByClass(VHDLSelectedName.class);
  }

  @Override
  @Nullable
  public VHDLSimpleName getSimpleName() {
    return findChildByClass(VHDLSimpleName.class);
  }

  @Override
  @Nullable
  public VHDLSliceName getSliceName() {
    return findChildByClass(VHDLSliceName.class);
  }

}
