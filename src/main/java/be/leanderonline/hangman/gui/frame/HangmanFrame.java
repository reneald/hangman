package be.leanderonline.hangman.gui.frame;

import be.leanderonline.hangman.gui.panels.EmptyPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@Component
public class HangmanFrame extends JFrame {
    @Autowired
    private EmptyPanel emptyPanel;

    private JPanel mainPanel;

    public HangmanFrame() {

    }

    @PostConstruct
    public void createMainGui() {
        this.setBounds(100, 70, 1100, 500);
        this.setResizable(false);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(emptyPanel, BorderLayout.SOUTH);
        this.add(mainPanel);
        this.setVisible(true);
    }
}
