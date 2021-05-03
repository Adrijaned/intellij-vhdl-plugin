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

public class VHDLInterfaceDeclarationImpl extends ASTWrapperPsiElement implements VHDLInterfaceDeclaration {

  public VHDLInterfaceDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitInterfaceDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLInterfaceObjectDeclaration getInterfaceObjectDeclaration() {
    return findChildByClass(VHDLInterfaceObjectDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLInterfacePackageDeclaration getInterfacePackageDeclaration() {
    return findChildByClass(VHDLInterfacePackageDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLInterfaceSubprogramDeclaration getInterfaceSubprogramDeclaration() {
    return findChildByClass(VHDLInterfaceSubprogramDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLInterfaceTypeDeclaration getInterfaceTypeDeclaration() {
    return findChildByClass(VHDLInterfaceTypeDeclaration.class);
  }

}
