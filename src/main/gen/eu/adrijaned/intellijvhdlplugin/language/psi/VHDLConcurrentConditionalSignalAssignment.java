// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLConcurrentConditionalSignalAssignment extends PsiElement {

  @NotNull
  VHDLConditionalWaveforms getConditionalWaveforms();

  @Nullable
  VHDLDelayMechanism getDelayMechanism();

  @NotNull
  VHDLTarget getTarget();

}
