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

public class VHDLFunctionSpecificationImpl extends ASTWrapperPsiElement implements VHDLFunctionSpecification {

  public VHDLFunctionSpecificationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitFunctionSpecification(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLDesignator getDesignator() {
    return findNotNullChildByClass(VHDLDesignator.class);
  }

  @Override
  @Nullable
  public VHDLFormalParameterList getFormalParameterList() {
    return findChildByClass(VHDLFormalParameterList.class);
  }

  @Override
  @Nullable
  public VHDLIReturnIdentifier getIReturnIdentifier() {
    return findChildByClass(VHDLIReturnIdentifier.class);
  }

  @Override
  @NotNull
  public VHDLSubprogramHeader getSubprogramHeader() {
    return findNotNullChildByClass(VHDLSubprogramHeader.class);
  }

  @Override
  @NotNull
  public VHDLTypeMark getTypeMark() {
    return findNotNullChildByClass(VHDLTypeMark.class);
  }

}
