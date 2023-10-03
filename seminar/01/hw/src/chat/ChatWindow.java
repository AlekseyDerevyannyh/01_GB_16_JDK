package chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

public class ChatWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;
    private static final String LOG_FILE = "chat.log";

    JButton btnConnect = new JButton("Connect");
    JButton btnSend = new JButton("Send");

    ChatWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Messenger");
        setResizable(false);

        JPanel panSet = new JPanel(new GridLayout(5, 1));
        JTextField loginField = new JTextField("login");
        JTextField passField = new JTextField("pass");
        JTextField ipField = new JTextField("ip");
        JTextField portField = new JTextField("port");
        panSet.add(loginField);
        panSet.add(passField);
        panSet.add(ipField);
        panSet.add(portField);
        panSet.add(btnConnect);

        add(panSet, BorderLayout.NORTH);

        JPanel panMid = new JPanel(new GridLayout(1, 2));
        JTextArea fieldChat = new JTextArea();
        fieldChat.setEditable(false);
        JList<String> listUsers = new JList<>();
        String[] users = {"Aleksey", "Aleksandr", "Katya"};
        listUsers.setListData(users);
        panMid.add(fieldChat);
        panMid.add(listUsers);
        add(panMid);

        JPanel panChat = new JPanel(new GridLayout(2, 1));
        JTextField fieldMessage = new JTextField("");
        panChat.add(fieldMessage);
        panChat.add(btnSend);

        add(panChat, BorderLayout.SOUTH);

        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(fieldChat, fieldMessage);
            }
        });

        btnConnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldChat.setText("");
                FileOperation fileOperation = new FileOperation(LOG_FILE);
                List<String> lines = fileOperation.readAllLines();
                for (String line : lines) {
                    fieldChat.append(line);
                    fieldChat.append("\n");
                }
            }
        });

        fieldMessage.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    sendMessage(fieldChat, fieldMessage);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        setVisible(true);
    }

    private void sendMessage(JTextArea fieldChat, JTextField fieldMessage) {
        FileOperation fileOperation = new FileOperation(LOG_FILE);
        fieldChat.append(fieldMessage.getText() + "\n");
        fileOperation.saveLine(fieldMessage.getText());
        fieldMessage.setText("");
    }
}
