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

public class VHDLConcurrentStatementImpl extends ASTWrapperPsiElement implements VHDLConcurrentStatement {

  public VHDLConcurrentStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitConcurrentStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLBlockStatement getBlockStatement() {
    return findChildByClass(VHDLBlockStatement.class);
  }

  @Override
  @Nullable
  public VHDLComponentInstantiationStatement getComponentInstantiationStatement() {
    return findChildByClass(VHDLComponentInstantiationStatement.class);
  }

  @Override
  @Nullable
  public VHDLConcurrentAssertionStatement getConcurrentAssertionStatement() {
    return findChildByClass(VHDLConcurrentAssertionStatement.class);
  }

  @Override
  @Nullable
  public VHDLConcurrentProcedureCallStatement getConcurrentProcedureCallStatement() {
    return findChildByClass(VHDLConcurrentProcedureCallStatement.class);
  }

  @Override
  @Nullable
  public VHDLConcurrentSignalAssignmentStatement getConcurrentSignalAssignmentStatement() {
    return findChildByClass(VHDLConcurrentSignalAssignmentStatement.class);
  }

  @Override
  @Nullable
  public VHDLGenerateStatement getGenerateStatement() {
    return findChildByClass(VHDLGenerateStatement.class);
  }

  @Override
  @Nullable
  public VHDLIPSLDirective getIPSLDirective() {
    return findChildByClass(VHDLIPSLDirective.class);
  }

  @Override
  @Nullable
  public VHDLProcessStatement getProcessStatement() {
    return findChildByClass(VHDLProcessStatement.class);
  }

}
