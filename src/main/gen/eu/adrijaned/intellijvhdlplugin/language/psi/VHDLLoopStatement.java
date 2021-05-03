// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLLoopStatement extends PsiElement {

  @NotNull
  List<VHDLILoopLabel> getILoopLabelList();

  @Nullable
  VHDLIterationScheme getIterationScheme();

  @NotNull
  VHDLSequenceOfStatements getSequenceOfStatements();

}
