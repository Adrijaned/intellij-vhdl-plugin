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

public class VHDLProcedureCallImpl extends ASTWrapperPsiElement implements VHDLProcedureCall {

  public VHDLProcedureCallImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitProcedureCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLGenericMapAspect getGenericMapAspect() {
    return findChildByClass(VHDLGenericMapAspect.class);
  }

  @Override
  @NotNull
  public VHDLIProcedureName getIProcedureName() {
    return findNotNullChildByClass(VHDLIProcedureName.class);
  }

  @Override
  @Nullable
  public VHDLParameterMapAspect getParameterMapAspect() {
    return findChildByClass(VHDLParameterMapAspect.class);
  }

}
