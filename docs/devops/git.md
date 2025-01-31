---
title: "GIT top 30 Interview Questions"
---

## 1. What is Git? How is it different from other VCS?

Git is a distributed version control system that helps manage code changes. Unlike centralized systems, it allows you to work offline and keep a local copy of the repository.

## 2. What is the command to check the Git version installed on your system?

```bash
git --version
```

Displays the installed version of Git.

## 3. How do you initialize a Git repository?

```bash
git init
```

Creates a new local Git repository.

## 4. How do you add a file to the staging area?

```bash
git add <filename>
```

Moves changes in a file to the staging area for the next commit.

## 5. How do you commit changes with a message?

```bash
git commit -m "Your commit message"
```

Saves changes in the repository with a descriptive message.

## 6. How do you check the status of your repository?

```bash
git status
```

Shows the state of the working directory and staging area.

## 7. How do you view the commit history?

```bash
git log
```

Displays the list of commits in the repository.

## 8. How can you clone a repository?

```bash
git clone <repository_url>
```

Copies an existing repository to your local machine.

## 9. How do you create a new branch?

```bash
git branch <branch_name>
```

Creates a new branch for parallel development.

## 10. How do you switch to a specific branch?

```bash
git checkout <branch_name>
```

Moves you to a different branch.

## 11. How do you merge branches?

```bash
git merge <branch_name>
```

Combines changes from one branch into another.

## 12. How do you delete a branch?

```bash
git branch -d <branch_name>
```

Deletes a branch after merging it.

## 13. What is the difference between `git pull` and `git fetch`?

- **`git fetch`**: Downloads changes from a remote repository without merging.
- **`git pull`**: Downloads and merges changes from a remote repository into your current branch.

## 14. How do you push changes to a remote repository?

```bash
git push <remote_name> <branch_name>
```

Uploads your commits to the remote repository.

## 15. How do you undo the last commit?

```bash
git reset --soft HEAD~1
```

Moves the last commit back to the staging area.

## 16. How do you remove a file from the staging area?

```bash
git reset <filename>
```

Removes a file from the staging area without deleting it.

## 17. What is the command to remove a file from Git but keep it in the working directory?

```bash
git rm --cached <filename>
```

Stops tracking the file but keeps it locally.

## 18. How do you set up a global username and email in Git?

```bash
git config --global user.name "Your Name"
git config --global user.email "youremail@example.com"
```

Sets a global username and email for all repositories.

## 19. How do you view the differences between two commits?

```bash
git diff <commit_id1> <commit_id2>
```

Shows line-by-line changes between two commits.

## 20. How do you stash changes in Git?

```bash
git stash
```

Temporarily saves changes for later use.

## 21. How do you apply stashed changes?

```bash
git stash apply
```

Restores the stashed changes to the working directory.

## 22. How do you view a list of stashes?

```bash
git stash list
```

Displays all stashed changes.

## 23. How do you create a new tag in Git?

```bash
git tag <tag_name>
```

Adds a tag to a specific commit.

## 24. How do you push a tag to a remote repository?

```bash
git push origin <tag_name>
```

Uploads a tag to the remote repository.

## 25. How do you remove a remote branch?

```bash
git push origin --delete <branch_name>
```

Deletes a branch from the remote repository.

## 26. How do you rebase a branch onto another?

```bash
git rebase <branch_name>
```

Moves your branch to a new base commit.

## 27. How do you resolve merge conflicts in Git?

- Open conflicting files and resolve manually.
- Mark as resolved:
  ```bash
  git add <resolved_file>
  ```
- Commit the resolution:
  ```bash
  git commit
  ```
  Fixes conflicts caused by merging branches.

## 28. How do you rename a branch?

```bash
git branch -m <new_branch_name>
```

Renames the current branch.

## 29. What is the difference between `git reset`, `git revert`, and `git checkout`?

- **`git reset`**: Moves the HEAD pointer backward and modifies commit history.
- **`git revert`**: Creates a new commit to undo changes from a previous commit.
- **`git checkout`**: Switches branches or restores specific files.

## 30. How do you see a summary of the repository?

```bash
git log --oneline --graph --all
```

Shows a compact view of the commit history.
