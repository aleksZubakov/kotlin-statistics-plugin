import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class StatisticsToolWindow implements ToolWindowFactory {

    private JLabel ktSourcePercentLabel;
    private JLabel ktTestPercentLabel;
    private JTextPane ktTestFilesText;
    private JTextPane ktSourceFilesText;


    private JPanel windowContent;
    private ToolWindow ktStatToolWindow;

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ktStatToolWindow = toolWindow;
        this.updateStatistics();

        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(windowContent, "", false);

        toolWindow.getContentManager().addContent(content);
    }

    private void updateStatistics() {


        ktSourcePercentLabel.setText(
                Double.toString(10.4) + "%"
        );

        ktTestPercentLabel.setText(
                Double.toString(10.4) + "%"
        );

    }
}
