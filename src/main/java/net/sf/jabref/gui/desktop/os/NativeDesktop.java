package net.sf.jabref.gui.desktop.os;

import java.io.IOException;
import java.util.List;

public interface NativeDesktop {
    void openFile(String filePath, String fileType) throws IOException;

    /**
     * Opens a file on an Operating System, using the given application.
     *
     * @param filePath The filename.
     * @param application Link to the app that opens the file.
     * @throws IOException
     */
    void openFileWithApplication(String filePath, String application) throws IOException;

    void openFolderAndSelectFile(String filePath) throws IOException;

    void openConsole(String absolutePath) throws IOException;

    void openPdfWithParameters(String filePath, List<String> parameters) throws  IOException;

    String detectProgramPath(String programName, String directoryName);
}
