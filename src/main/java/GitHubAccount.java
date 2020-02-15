import java.util.HashMap;

public class GitHubAccount {

   private String username;
   private String name;
   private HashMap<String, Repository> repositories;
   private AccountType accountType;

public GitHubAccount(String username, String name, AccountType accountType) {

    this.username = username;
    this.name = name;
    this.repositories = new HashMap<String, Repository>();
    this.accountType = accountType.FREE;
}


    public String getUsername() {
    return this.username;
    }

    public String getName() {
    return this.name;
    }

    public int countNumberOfReposInAccount() {
    return this.repositories.size();
    }

    public void addRepoToGitAccount(String repoName, Repository repository) {
    this.repositories.put(repoName, repository);
    }

    public Object getRepositories() {
    return this.repositories;
    }

    public AccountType getAccountType() {
    return this.accountType;
    }

    public void upgradeAccountToPro() {
    this.accountType = accountType.PRO;
    }

    public void downgradeAccountToFree() {
    this.accountType = accountType.FREE;
    }
}
