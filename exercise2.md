# basic git commands

### git config

This command can be used to configure the user-specific and global settings, for example your username and email adress. To set the level of configuration one can use

```bash
git config <level> <key> <value>
```

which can be _--system_, _--global_, or _--local_, for example to change the standard texteditor

```bash
git config --local core.editor vim
```

With git config --list it is possible to show the available settings that can be changed. The changes are stored in the .git file.

### git init

When using git init you can initialize a new git repository in the current working directory. A successful git init can be seen by the newly created .git folder inside of the current directory. To start with an empty commit history one could also use _git init --initial-commit_.

### git commit

The _git commit_ command is used to save changes of the files in the staging area (the ones you added with _git add_). A commit can be described via a commit message (_git commit -m_) that should include what you added/changed in the commited files.

```bash
git commit -m "i did nothing useful"
```

This command changes the metadata of the repository, it takes a snapshot of the files that where added to the staging area and adds them to the commit history. The changes are local and do not effect the remote repository.

### git status

The basic _git status_ command shows which files have been modified and if they are already staged or not, it shows the status of files in the working directory and staging area: in detail which files are staged, which were modified and not staged and which are not tracked.

The command _git status_ is read only and does not affect the working directory or the repository. 


### git add

Stages the chosen files to be commited later, which means git now tracks the changes you made to that file/folder and will save a snapshot of them once commited. 

```bash
git add <filename>
```
to add made changes on that file to staging area
```bash
git add --all
```
to add all changes in working directory to staging area

The command _git add_ does not change files in the working directory or repository! First you need to commit the changes with _git commit_ to save a snapshot to the local repository. It changes the metadata of the index (temporary staging area).

### git log

The _git log_ shows you a list of all your commits, with the newest being on top. The information includes the commit message, the author, the date as well as the commit id.

- _git --oneline_ shows each commit in a single line showing only the message and commit id(hash value)

- _git --author_ shows the commits of one specific author

- _git --since_ shows the commits from a specific date onwards

- _git --grpah_ draws a graph between the commits in the command line

This command only reads data and only changes metadata.


### git diff

Allows to see the changes between different areas of your Git repository. For example the changes between your working directory and the files added via git add. To see the difference between the staging area and the last commit use _git diff --cached_. 

There are several options to display the differences like _git --color_ that highlights the difference in another color, _git --word-diff_ that shows the differences on a word-by-word basis, and _git --stat_ that shows only information about the number of changed files as well as the number of changed lines. 

It is also a command that only reads information and doesnt change files.

### git pull

Git pull command is used to fetch data from the remote repository and merge the changes with your branch. For example to your main branch, however if there are any conflicts you first have to solve them manually.

```bash
git pull origin main
```

The _git pull --rebase_ command also allows to integrate changes from the remote repository, however it doesnt merge the two branches but applies the changes on top of the local branch. 

```bash
git pull --no-commit
```
does not automatically commit the merge/rebase and lets you review the changes manually. This command can change data in the local repository, as well as metadata.

### git push 

While _git commit_ saves changes in the local repository, the command _git push_ allows to upload the changes to the remote repository. To avoid conflicts one should always download the current state of the remote repository via _git pull_ before pushing the local changes.
