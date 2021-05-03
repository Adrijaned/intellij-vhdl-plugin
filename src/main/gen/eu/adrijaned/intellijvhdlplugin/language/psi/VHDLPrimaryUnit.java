// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLPrimaryUnit extends PsiElement {

  @Nullable
  VHDLConfigurationDeclaration getConfigurationDeclaration();

  @Nullable
  VHDLContextDeclaration getContextDeclaration();

  @Nullable
  VHDLEntityDeclaration getEntityDeclaration();

  @Nullable
  VHDLIPSLVerificationUnit getIPSLVerificationUnit();

  @Nullable
  VHDLPackageDeclaration getPackageDeclaration();

  @Nullable
  VHDLPackageInstantiationDeclaration getPackageInstantiationDeclaration();

}
