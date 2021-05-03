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

public class VHDLActualDesignatorImpl extends ASTWrapperPsiElement implements VHDLActualDesignator {

  public VHDLActualDesignatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitActualDesignator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLConditionalExpression getConditionalExpression() {
    return findChildByClass(VHDLConditionalExpression.class);
  }

  @Override
  @Nullable
  public VHDLIFileName getIFileName() {
    return findChildByClass(VHDLIFileName.class);
  }

  @Override
  @Nullable
  public VHDLISignalName getISignalName() {
    return findChildByClass(VHDLISignalName.class);
  }

  @Override
  @Nullable
  public VHDLISubprogramName getISubprogramName() {
    return findChildByClass(VHDLISubprogramName.class);
  }

  @Override
  @Nullable
  public VHDLIVariableName getIVariableName() {
    return findChildByClass(VHDLIVariableName.class);
  }

  @Override
  @Nullable
  public VHDLIiInstantiatedPackageName getIiInstantiatedPackageName() {
    return findChildByClass(VHDLIiInstantiatedPackageName.class);
  }

  @Override
  @Nullable
  public VHDLSubtypeIndication getSubtypeIndication() {
    return findChildByClass(VHDLSubtypeIndication.class);
  }

}
