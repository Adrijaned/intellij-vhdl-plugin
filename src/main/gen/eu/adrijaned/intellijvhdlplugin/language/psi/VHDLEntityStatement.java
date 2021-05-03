// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLEntityStatement extends PsiElement {

  @Nullable
  VHDLConcurrentAssertionStatement getConcurrentAssertionStatement();

  @Nullable
  VHDLIPSLDirective getIPSLDirective();

  @Nullable
  VHDLIPassiveConcurrentProcedureCallStatement getIPassiveConcurrentProcedureCallStatement();

  @Nullable
  VHDLIPassiveProcessStatement getIPassiveProcessStatement();

}
