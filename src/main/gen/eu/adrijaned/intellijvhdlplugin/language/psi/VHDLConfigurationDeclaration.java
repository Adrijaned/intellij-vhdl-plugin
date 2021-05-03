// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLConfigurationDeclaration extends PsiElement {

  @NotNull
  VHDLBlockConfiguration getBlockConfiguration();

  @NotNull
  List<VHDLConfigurationDeclarativeItem> getConfigurationDeclarativeItemList();

  @NotNull
  VHDLIConfigurationSimpleName getIConfigurationSimpleName();

  @NotNull
  VHDLIEntityName getIEntityName();

  @NotNull
  List<VHDLVerificationUnitBindingIndication> getVerificationUnitBindingIndicationList();

}
