package ticTacToe;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 230;
    private static final int WINDOW_WIDTH = 350;
    private static int mode = 0;
    private static int sizeX = 3;
    private static int sizeY = 3;
    private static int winLength = 3;

    JButton btnStart = new JButton("Start new game");
    SettingsWindow(GameWindow gameWindow) {
        setLocationRelativeTo(gameWindow);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setLayout(new GridLayout(10, 1));
        add(new JLabel("Выберите режим игры"));
        ButtonGroup groupButton = new ButtonGroup();
        JRadioButton pvp = new JRadioButton("Человек против человека");
        JRadioButton pve = new JRadioButton("Человек против компьютера");
        groupButton.add(pvp);
        groupButton.add(pve);
        add(pvp);
        add(pve);

        JLabel labelField = new JLabel("Выберите размеры поля");
        add(labelField);

        JLabel labelCurrentField = new JLabel("Текущий размер поля: " + sizeX);
        add(labelCurrentField);

        JSlider sliderField = new JSlider(3, 10, sizeX);

        add(sliderField);

        JLabel labelLength = new JLabel("Выберите длину для победы");
        add(labelLength);

        JLabel labelCurrentLength = new JLabel("Текущая длина для победы: " + winLength);
        add(labelCurrentLength);

        JSlider sliderLength = new JSlider(3, 10, winLength);
        add(sliderLength);

        add(btnStart);

        sliderField.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelCurrentField.setText("Текущий размер поля: " + sliderField.getValue());
                sliderLength.setMaximum(sliderField.getValue());
                if (sliderLength.getValue() > sliderField.getValue())
                    sliderLength.setValue(sliderField.getValue());
            }
        });

        sliderLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                sliderLength.setMaximum(sliderField.getValue());
                labelCurrentLength.setText("Текущая длина для победы: " + sliderLength.getValue());
            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pvp.isSelected()) {
                    mode = 1;
                } else {
                    mode = 0;
                }
                sizeX = sliderField.getValue();
                sizeY = sliderField.getValue();
                winLength = sliderLength.getValue();
                gameWindow.startNewGame(mode, sizeX, sizeY, winLength);
                setVisible(false);
            }
        });
    }

    public static int getMode() {
        return mode;
    }

    public static int getSizeX() {
        return sizeX;
    }

    public static int getSizeY() {
        return sizeY;
    }

    public static int getWinLength() {
        return winLength;
    }
}
