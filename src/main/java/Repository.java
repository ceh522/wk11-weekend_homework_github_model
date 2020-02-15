import java.util.ArrayList;

public class Repository {

    private ArrayList<Commit> commits;

    public Repository() {
        this.commits = new ArrayList<Commit>();
    }

    public void addCommit(Commit commit) {
        this.commits.add(commit);
    }

    public int getCommitsArrayLength() {
        return this.commits.size();
    }

    public Commit getCommitFromCommitsArrayByIndex(Commit commit) {
        return this.commits.get(0);
    }
}
