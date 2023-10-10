package chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 400;
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_POSX = 700;
    private static final int WINDOW_POSY = 200;
    private final ChatServer chatServer;
    private final SocketThreadListener socketThreadListener;


    ServerWindow(ChatServer chatServer, SocketThreadListener socketThreadListener) {
        this.chatServer = chatServer;
        this.socketThreadListener = socketThreadListener;

        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");
        JTextArea field = new JTextArea();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Chat Server");
        setResizable(false);
        JPanel panBottom = new JPanel(new GridLayout(1, 1));
        panBottom.add(btnStart);
        panBottom.add(btnStop);
        add(panBottom, BorderLayout.SOUTH);
        setVisible(true);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                socketThreadListener.prsBtnStart();
                chatServer.start();
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                socketThreadListener.prsBtnStop();
                chatServer.stop();
            }
        });
    }
}