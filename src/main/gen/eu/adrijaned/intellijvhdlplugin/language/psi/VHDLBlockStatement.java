// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLBlockStatement extends PsiElement {

  @NotNull
  VHDLBlockDeclarativePart getBlockDeclarativePart();

  @NotNull
  VHDLBlockHeader getBlockHeader();

  @NotNull
  VHDLBlockStatementPart getBlockStatementPart();

  @NotNull
  List<VHDLIBlockLabel> getIBlockLabelList();

  @Nullable
  VHDLIGuardCondition getIGuardCondition();

}
