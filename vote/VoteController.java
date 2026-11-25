import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VoteController {
    private VoteView theView;
    private VoteModel theModel;

    public VoteController(VoteView theView, VoteModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCatListener(new CatListener());
        this.theView.addDogListener(new DogListener());
    }

    // Inner class for the "Vote Cat" button
    class CatListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            theModel.voteForCat();
            theView.setCatLabel(theModel.getCatVotes());
        }
    }

    // Inner class for the "Vote Dog" button
    class DogListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            theModel.voteForDog();
            theView.setDogLabel(theModel.getDogVotes());
        }
    }

    public static void main(String[] args) {
        VoteView theView = new VoteView();
        VoteModel theModel = new VoteModel();

        VoteController theController = new VoteController(theView, theModel);
    }
}
