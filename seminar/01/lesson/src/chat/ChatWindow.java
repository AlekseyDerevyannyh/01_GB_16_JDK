package chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;

    JButton btnConnect = new JButton("Connect");
    JButton btnSend = new JButton("Send");

    ChatWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Messenger");
        setResizable(false);

        btnConnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

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
        JTextField fieldMessage = new JTextField("Message");
        panChat.add(fieldMessage);
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldChat.append(fieldMessage.getText() + "\n");
            }
        });

        panChat.add(btnSend);

        add(panChat, BorderLayout.SOUTH);

        setVisible(true);
    }
}
