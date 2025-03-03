import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class SudokuButton extends JButton {
    public SudokuButton() {
        this(" ");
    }

    public SudokuButton(String label) {
        super(label);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                // To interact with the current SudokuButton, use: this
                // For instance, if we wanted to get the text of the
                // current button, we'd say: this.getText()
            }

            // Leave this blank
            @Override
            public void keyReleased(KeyEvent e) {}

            // Leave this blank
            @Override
            public void keyTyped(KeyEvent e) {}
        });
    }

    // Don't worry about this, this just changes the minimum size of a button
    @Override
    public Dimension getPreferredSize() {
        Dimension size = new Dimension();
        size.width = 50;
        size.height = 50;
        return size;
    }
}
