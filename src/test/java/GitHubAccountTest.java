import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    GitHubAccount gitHubAccount1;
    Repository account1repository1;
    Commit repository1commit1;
    Commit repository1commit2;
    Commit repository1commit3;


    Commit repository1commit4;
    Repository account1repository2;
    Commit repository2commit1;
    Commit repository2commit2;

    @Before
    public void before() {
        gitHubAccount1 = new GitHubAccount("ceh522", "projects_by_catherine", AccountType.FREE);
        account1repository1 = new Repository();
        repository1commit1 = new Commit("Set up test files", 1);
        repository1commit2 = new Commit("Create classes", 2);
        repository1commit3 = new Commit("Create getters", 3);
        repository1commit4 = new Commit("Create setters", 4);
        account1repository1.addCommit(repository1commit1);
        account1repository1.addCommit(repository1commit2);
        account1repository1.addCommit(repository1commit3);
        account1repository1.addCommit(repository1commit4);
        account1repository2 = new Repository();
        repository2commit1 = new Commit("Created initial files", 1);
        repository2commit2 = new Commit("Created test files", 2);
        account1repository2.addCommit(repository2commit1);
        account1repository2.addCommit(repository2commit2);
        gitHubAccount1.addRepoToGitAccount("house_plant_app", account1repository1);
        gitHubAccount1.addRepoToGitAccount("knitting_app", account1repository2);

    }

        @Test
        public void canGetUsername () {
            assertEquals("ceh522", gitHubAccount1.getUsername());
        }

        @Test
        public void canGetName() {
        assertEquals("projects_by_catherine", gitHubAccount1.getName());
        }

        @Test
        public void canAddRepoToGitAccount() {
        gitHubAccount1.addRepoToGitAccount("house_plant_app", account1repository1);
        assertEquals(2, gitHubAccount1.countNumberOfReposInAccount());
        }

        @Test
        public void canGetAccountType() {
        assertEquals(AccountType.FREE, gitHubAccount1.getAccountType());
        }

        @Test
        public void canUpgradeAccountFromFreeToPro() {
        gitHubAccount1.upgradeAccountToPro();
        assertEquals(AccountType.PRO, gitHubAccount1.getAccountType());
        }

        @Test
        public void canDownGradeAccountFromProToFree() {
        gitHubAccount1.upgradeAccountToPro();
        gitHubAccount1.downgradeAccountToFree();
        assertEquals(AccountType.FREE, gitHubAccount1.getAccountType());
        }
    }
