// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLConcurrentSelectedSignalAssignment extends PsiElement {

  @Nullable
  VHDLDelayMechanism getDelayMechanism();

  @NotNull
  VHDLExpression getExpression();

  @NotNull
  VHDLSelectedWaveforms getSelectedWaveforms();

  @NotNull
  VHDLTarget getTarget();

}
