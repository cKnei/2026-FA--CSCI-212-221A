import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VoteView {
    private JFrame frame;
    private JButton catButton;
    private JButton dogButton;
    private JLabel catLabel;
    private JLabel dogLabel;

    public VoteView() {
        frame = new JFrame("Cats vs Dogs");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));

        // Top row: the buttons
        catButton = new JButton("Vote Cat");
        dogButton = new JButton("Vote Dog");

        // Bottom row: the counts
        catLabel = new JLabel("0", SwingConstants.CENTER);
        dogLabel = new JLabel("0", SwingConstants.CENTER);

        frame.add(catButton);
        frame.add(dogButton);
        frame.add(catLabel);
        frame.add(dogLabel);

        frame.setVisible(true);
    }

    public void setCatLabel(int votes) {
        catLabel.setText(String.valueOf(votes));
    }

    public void setDogLabel(int votes) {
        dogLabel.setText(String.valueOf(votes));
    }

    public void addCatListener(ActionListener listenForCat) {
        catButton.addActionListener(listenForCat);
    }

    public void addDogListener(ActionListener listenForDog) {
        dogButton.addActionListener(listenForDog);
    }
}
