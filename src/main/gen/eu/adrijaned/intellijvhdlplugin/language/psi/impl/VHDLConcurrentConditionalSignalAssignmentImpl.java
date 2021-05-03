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

public class VHDLConcurrentConditionalSignalAssignmentImpl extends ASTWrapperPsiElement implements VHDLConcurrentConditionalSignalAssignment {

  public VHDLConcurrentConditionalSignalAssignmentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitConcurrentConditionalSignalAssignment(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLConditionalWaveforms getConditionalWaveforms() {
    return findNotNullChildByClass(VHDLConditionalWaveforms.class);
  }

  @Override
  @Nullable
  public VHDLDelayMechanism getDelayMechanism() {
    return findChildByClass(VHDLDelayMechanism.class);
  }

  @Override
  @NotNull
  public VHDLTarget getTarget() {
    return findNotNullChildByClass(VHDLTarget.class);
  }

}
