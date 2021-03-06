package edu.jsu.mcis;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToe {

    public static final int DEFAULT_WIDTH = 3;

    public static void main(String[] args) {

        /* Set initial size of game board (default is 3x3) */

        int width = DEFAULT_WIDTH;

        /* If a different size is provided as an argument, use it instead */

        if(args.length >= 1) {

            try {
                width = Integer.parseInt(args[0]);
            }
            catch(NumberFormatException e) {}

        }
        int startWidth = width;

        /* Create Controller and Start Main Loop */
        EventQueue.invokeLater(() -> {
          TicTacToeController controller = new TicTacToeController(startWidth);

          /* Start Main Loop */
          JFrame window = new JFrame("Tic-Tac-Toe");
          window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window.add(controller.getView());
          window.pack();
          window.setVisible(true);
        });

    }

}
