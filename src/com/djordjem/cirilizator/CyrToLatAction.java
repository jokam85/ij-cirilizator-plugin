package com.djordjem.cirilizator;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.project.Project;

public class CyrToLatAction extends AnAction {

  private CyrToLat transliterator = new CyrToLat();

  @Override
  public void update(AnActionEvent e) {
    setVisibilityCondition(e);
  }

  @Override
  public void actionPerformed(final AnActionEvent e) {
    final Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
    final Project project = e.getProject();
    final Document document = editor.getDocument();
    final SelectionModel selectionModel = editor.getSelectionModel();

    final int start = selectionModel.getSelectionStart();
    final int end = selectionModel.getSelectionEnd();

    //Making the replacement
    WriteCommandAction.runWriteCommandAction(project, () ->
            document.replaceString(start, end, transliterator.toLat(selectionModel.getSelectedText()))
    );
    selectionModel.removeSelection();
  }

  /**
   * Set visibility only in case of existing project and editor and if some text in the editor is selected
   */
  private void setVisibilityCondition(AnActionEvent e) {
    final Project project = e.getProject();
    final Editor editor = e.getData(CommonDataKeys.EDITOR);

    boolean isVisible = project != null && editor != null && editor.getSelectionModel().hasSelection();
    e.getPresentation().setVisible(isVisible);
  }
}