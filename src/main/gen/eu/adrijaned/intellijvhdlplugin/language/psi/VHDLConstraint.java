// This is a generated file. Not intended for manual editing.
package eu.adrijaned.intellijvhdlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLConstraint extends PsiElement {

  @Nullable
  VHDLArrayConstraint getArrayConstraint();

  @Nullable
  VHDLRangeConstraint getRangeConstraint();

  @Nullable
  VHDLRecordConstraint getRecordConstraint();

}
