package chat;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperation {
    private final String fileName;

    public FileOperation(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException e) {
            fileOperationErrorNotification();
        }
    }

    public void saveLine(String line) {
        try (FileWriter writer = new FileWriter(this.fileName, true)) {
            writer.write(line);
            writer.append('\n');
            writer.flush();
        } catch (IOException e) {
            fileOperationErrorNotification();
        }
    }

    public List<String> readAllLines() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(this.fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fileReader.close();
        } catch (IOException e) {
            fileOperationErrorNotification();
        }
        return lines;
    }

    public void fileOperationErrorNotification() {
        JLabel label = new JLabel();
        label.setVisible(false);

        JFrame frameError = new JFrame();
        frameError.setLayout(new FlowLayout());
        frameError.setBounds(500, 300, 300, 100);
        frameError.add(label, BorderLayout.CENTER);
        frameError.setVisible(true);
    }
}
