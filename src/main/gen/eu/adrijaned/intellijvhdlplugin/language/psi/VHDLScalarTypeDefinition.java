// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLScalarTypeDefinition extends PsiElement {

  @Nullable
  VHDLEnumerationTypeDefinition getEnumerationTypeDefinition();

  @Nullable
  VHDLFloatingTypeDefinition getFloatingTypeDefinition();

  @Nullable
  VHDLIntegerTypeDefinition getIntegerTypeDefinition();

  @Nullable
  VHDLPhysicalTypeDefinition getPhysicalTypeDefinition();

}
