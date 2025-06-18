import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PuzzleGame extends JFrame implements ActionListener {
    JButton[] buttons = new JButton[9];
    int[] numbers = new int[9];

    JLabel moveLabel, timerLabel;
    JButton shuffleButton;
    int moveCount = 0;
    Timer gameTimer;
    int seconds = 0;

    public PuzzleGame() {
        setTitle("Puzzle Game");
        setSize(350, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Top panel: moves + timer + shuffle
        JPanel topPanel = new JPanel(new GridLayout(1, 3));
        moveLabel = new JLabel("Moves: 0", JLabel.CENTER);
        timerLabel = new JLabel("Time: 0s", JLabel.CENTER);
        shuffleButton = new JButton("Shuffle");
        shuffleButton.addActionListener(e -> restartGame());
        topPanel.add(moveLabel);
        topPanel.add(timerLabel);
        topPanel.add(shuffleButton);
        add(topPanel, BorderLayout.NORTH);

        // Grid panel
        JPanel grid = new JPanel(new GridLayout(3, 3));
        add(grid, BorderLayout.CENTER);

        shuffle();

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton(numbers[i] == 0 ? "" : String.valueOf(numbers[i]));
            buttons[i].setFont(new Font("Arial", Font.BOLD, 24));
            buttons[i].addActionListener(this);
            grid.add(buttons[i]);
        }

        // Timer
        gameTimer = new Timer(1000, e -> {
            seconds++;
            timerLabel.setText("Time: " + seconds + "s");
        });
        gameTimer.start();

        setVisible(true);
    }

    void shuffle() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 9; i++) nums.add(i);
        Collections.shuffle(nums);
        for (int i = 0; i < 9; i++) numbers[i] = nums.get(i);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        int i;
        for (i = 0; i < 9; i++) if (buttons[i] == clicked) break;

        int emptyIndex = -1;
        for (int j = 0; j < 9; j++) {
            if (buttons[j].getText().equals("")) {
                emptyIndex = j;
                break;
            }
        }

        if (isAdjacent(i, emptyIndex)) {
            buttons[emptyIndex].setText(clicked.getText());
            clicked.setText("");
            moveCount++;
            moveLabel.setText("Moves: " + moveCount);
        }

        if (isSolved()) {
            gameTimer.stop();
            JOptionPane.showMessageDialog(this,
                "🎉 You solved it in " + moveCount + " moves and " + seconds + " seconds!");
            System.exit(0);
        }
    }

    boolean isAdjacent(int i, int j) {
        return (Math.abs(i - j) == 1 && i / 3 == j / 3) || (Math.abs(i - j) == 3);
    }

    boolean isSolved() {
        for (int i = 0; i < 8; i++) {
            if (!buttons[i].getText().equals(String.valueOf(i + 1))) return false;
        }
        return buttons[8].getText().equals("");
    }

    void restartGame() {
        moveCount = 0;
        seconds = 0;
        moveLabel.setText("Moves: 0");
        timerLabel.setText("Time: 0s");
        gameTimer.restart();

        shuffle();
        for (int i = 0; i < 9; i++) {
            buttons[i].setText(numbers[i] == 0 ? "" : String.valueOf(numbers[i]));
        }
    }

    public static void main(String[] args) {
        new PuzzleGame();
    }
}
