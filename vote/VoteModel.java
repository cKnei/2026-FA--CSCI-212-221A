public class VoteModel {
    private int catVotes = 0;
    private int dogVotes = 0;

    // Action methods
    public void voteForCat() {
        catVotes++;
    }

    public void voteForDog() {
        dogVotes++;
    }

    // Getters
    public int getCatVotes() {
        return catVotes;
    }

    public int getDogVotes() {
        return dogVotes;
    }
}
