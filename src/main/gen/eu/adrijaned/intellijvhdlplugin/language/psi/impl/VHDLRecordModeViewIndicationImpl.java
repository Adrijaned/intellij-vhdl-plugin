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

public class VHDLRecordModeViewIndicationImpl extends ASTWrapperPsiElement implements VHDLRecordModeViewIndication {

  public VHDLRecordModeViewIndicationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitRecordModeViewIndication(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLIUnresolvedRecordSubtypeIndication getIUnresolvedRecordSubtypeIndication() {
    return findChildByClass(VHDLIUnresolvedRecordSubtypeIndication.class);
  }

  @Override
  @NotNull
  public VHDLIiModeViewName getIiModeViewName() {
    return findNotNullChildByClass(VHDLIiModeViewName.class);
  }

}
