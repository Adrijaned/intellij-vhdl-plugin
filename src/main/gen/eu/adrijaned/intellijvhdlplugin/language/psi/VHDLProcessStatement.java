// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLProcessStatement extends PsiElement {

  @NotNull
  List<VHDLIProcessLabel> getIProcessLabelList();

  @NotNull
  VHDLProcessDeclarativePart getProcessDeclarativePart();

  @NotNull
  VHDLProcessSensitivityList getProcessSensitivityList();

  @NotNull
  VHDLProcessStatementPart getProcessStatementPart();

}
