# Visual Studio Code Git integration 

## Needs 

- GitHub account
- Visual Studio Code
- Git installed on your local machine
- Git Bash installed on your local machine
- Node.js and NPM installed on your local machine

## unnecessary tools 

- [degit (NPM package)](https://www.npmjs.com/package/degit)  
Useful for copying down a repository to your local machine without the .git file.  
    - assumes the developer is using git   
    - can clone specific branches 
    - can be useed from other hosts  
        > Not really necessary from my own perspective since I have a GitHub account and can just clone the repository down to my local machine.

- [hyper terminal](https://hyper.is/)  
    can be used to open a terminal window in Visual Studio Code
    > using git bash makes this unnecessary


## VS Code Terminal Commands 

### Open terminal in Visual Studio Code   
`Ctrl + ~`  
Opens a terminal window in Visual Studio Code.  
> This command is used to open a terminal window in Visual Studio Code.

### Split terminal in Visual Studio Code  
`Ctrl + Shift + 5`  
Splits the terminal window in Visual Studio Code.  
> This command is used to split the terminal window in Visual Studio Code.
> This is useful for running multiple commands at the same time.
> Terminals are synced with the same directory.

### Move terminal to Editor area  
`Ctrl + Shift + 3`  
Moves the terminal window to the editor area.  
> This command is used to move the terminal window to the editor area.
> This is useful for running commands and viewing the output at the same time.

### Move terminal to Panel area  
`Ctrl + Shift + 1`  
Moves the terminal window to the panel area.  
> This command is used to move the terminal window to the panel area.
> This is useful for running commands and viewing the output at the same time.

### Change terminal collor   
`Ctrl + Shift + P`  
`Terminal: Select Default Shell`  
Select the default shell for the terminal window.  
> This command is used to change the color of the terminal window.
> This is useful for distinguishing between different terminal windows.

### Name terminal window  
`Ctrl + Shift + P`  
`Terminal: Rename`  
Rename the terminal window.  
Hit enter to save the terminal window
> This command is used to rename the terminal window.
> This is useful for distinguishing between different terminal windows.

### Delete terminal window  
`Ctrl + Shift + P`  
`Terminal: Kill Terminal`  
Delete the terminal window.  
> This command is used to delete the terminal window.
> This is useful for closing terminal windows that are no longer needed.


## Command Pallete and Git Commands 

### Open Command Pallete  
`Ctrl + Shift + P`  
Opens the command pallete.  
> This command is used to open the command pallete.
> This is useful for running commands that are not available in the menu.

### Typing Git into the Command Pallete
`Ctrl + Shift + P`
> Typing Git into the command pallete will bring up a list of git commands that can be run from the command pallete.
> This is useful for running git commands without having to type them out in the terminal or if the specific command is unknown.

### Create a new branch
`Ctrl + Shift + P`  
`Git: Create Branch`
> This command is used to create a new branch in the repositor  y.  
> Alternative method in terminal: `git checkout -b branch-name`    
> This is useful for working on new features or bug fixes without affecting the main branch.

### Rename Branch 
`Ctrl + Shift + P`
`Git: Rename Branch`  
> This command is used to rename the current branch.    
> Alternative method in terminal: `git branch -m new-branch-name`    
> This is useful for keeping track of the purpose of the branch.

### Delete Branch
`Ctrl + Shift + P`
`Git: Delete Branch`  
> This command is used to delete the current branch.  
> Alternative method in terminal: `git branch -d branch-name`  
> This is useful for cleaning up branches that are no longer needed.

### Stage Changes
`Ctrl + Shift + P`
`Git: Stage Changes`  
> This command is used to stage changes to the repository.  
> Alternative method in terminal: `git add .` or `git add -A` or `git add file-name`  
> This is useful for preparing changes to be committed.

### Commit Changes
`Ctrl + Shift + P`
`Git: Commit`  
> This command is used to commit changes to the repository.  
> Alternative method in terminal: `git commit -m "commit message"`  
> This is useful for saving changes to the repository.

### Change Branches 
`Ctrl + Shift + P`
`Git: Checkout to...`  
> This command is used to change branches in the repository.  
> Alternative method in terminal: `git checkout branch-name`  
> This is useful for switching between branches to work on different features or bug fixes.

### Publish Branch
`Ctrl + Shift + P`
`Git: Publish Branch`  
> This command is used to publish the current branch to the remote repository.  
> Alternative method in terminal: `git push origin branch-name`  
> This is useful for sharing changes with other developers.

### Publish Repository
`Ctrl + Shift + P`
`Git: Publish Repository`  
> This command is used to publish the repository to the remote repository.  
> Alternative method in terminal: `git push origin master`  
> This allows developers to publish a repository as either a public or private repository.


## Letters associated with File Status in VS Code 

>M - Modified - This file has been modified since the last commit.

>A - Added - This file is new and has not been committed.

>D - Deleted - This file has been deleted and has not been committed.

>R - Renamed - This file has been renamed and has not been committed.

>C - Copied - This file has been copied and has not been committed.

>U - Unmerged - This file has conflicts that need to be resolved.

>? - Untracked - This file is not being tracked by Git.

>! - Ignored - This file is being ignored by Git.

>S - Submodule - This file is a submodule.

>I - Ignored - This file is being ignored by Git.

>X - Unknown - This file is unknown to Git.

>B - Broken - This file has conflicts that need to be resolved.

>U - Untracked - This file is not being tracked by Git.

>Colored dots - These dots represent the status of the file in the repository. Green means the file is staged, red means the file is modified, and blue means the file is untracked.


## Creating Keybindings in Visual Studio Code

### Open Keybindings
`Ctrl + K, Ctrl + S`
> This command is used to open the keybindings settings in Visual Studio Code.
> This is useful for customizing keybindings to suit your workflow.

### Create Keybinding
`Ctrl + K, Ctrl + S`
`Click on the keybindings.json link`
`Add a new keybinding`
> This command is used to create a new keybinding in Visual Studio Code.

### Edit Keybinding
`Ctrl + K, Ctrl + S`
`Click on the keybindings.json link`
`Edit an existing keybinding`
> This command is used to edit an existing keybinding in Visual Studio Code.

### Remove Keybinding
`Ctrl + K, Ctrl + S`
`Click on the keybindings.json link`
`Remove an existing keybinding`
> This command is used to remove an existing keybinding in Visual Studio Code.


## Diffs in Visual Studio Code

### Open Diff View
`Ctrl + Shift + G`
> This command is used to open the diff view in Visual Studio Code.
> This is useful for comparing changes between files.

### Navigate Diff View
`F7` - Move to the next change.
`Shift + F7` - Move to the previous change.
> These commands are used to navigate the diff view in Visual Studio Code.

### Copy Changes from Diff View
`Ctrl + C` - Copy the selected change.
> This command is used to copy changes from the diff view in Visual Studio Code.

### Copy All Changes from Diff View
`Ctrl + A` - Select all changes.
`Ctrl + C` - Copy all changes.
> These commands are used to copy all changes from the diff view in Visual Studio Code.

### Close Diff View
`Ctrl + W`
> This command is used to close the diff view in Visual Studio Code.

### Side by Side Diff View
`Ctrl + =`
> This command is used to view changes side by side in the diff view in Visual Studio Code.

### Using the Diff Editor Bar
`Click on the arrows in the diff editor bar`
> This command is used to navigate changes in the diff view using the diff editor bar.


## Source Control in Visual Studio Code

### Open Source Control View
`Ctrl + Shift + G`
> This command is used to open the source control view in Visual Studio Code.

### Stage Changes
`Click on the + icon next to the file`
> This command is used to stage changes in the source control view in Visual Studio Code.

### Unstage Changes
`Click on the - icon next to the file`
> This command is used to unstage changes in the source control view in Visual Studio Code.

### Commit Changes
`Click on the checkmark icon`
> This command is used to commit changes in the source control view in Visual Studio Code.

### Push Changes
`Click on the ellipsis icon`
`Click on Push`
> This command is used to push changes to the remote repository in the source control view in Visual Studio Code.

### Pull Changes
`Click on the ellipsis icon`
`Click on Pull`
> This command is used to pull changes from the remote repository in the source control view in Visual Studio Code.

### Sync Changes
`Click on the ellipsis icon`
`Click on Sync`
> This command is used to sync changes with the remote repository in the source control view in Visual Studio Code.

### Discard Changes
`Click on the trash icon`
> This command is used to discard changes in the source control view in Visual Studio Code.

### Compare Files
`Click on the ellipsis icon`
`Click on Compare Changes`
> This command is used to compare changes between files in the source control view in Visual Studio Code.

### Time Travel
`Click on the ellipsis icon`
`Click on Time Travel`
> This command is used to view changes over time in the source control view in Visual Studio Code.

### Blame
`Click on the ellipsis icon`
`Click on Blame`
> This command is used to view the commit history of a file in the source control view in Visual Studio Code.


## Logs in Visual Studio Code

### Open Git Log
`Ctrl + Shift + G`
`Click on the ellipsis icon`
`Click on Log`
> This command is used to open the git log in Visual Studio Code.

### View Commit Details
`Click on a commit in the log`
> This command is used to view the details of a commit in the git log in Visual Studio Code.

### Copy Commit Hash
`Right-click on a commit in the log`
`Click on Copy Commit Hash`


## GitHub Pull Requests and Issues Extension in Visual Studio Code

### Open Pull Requests
`Ctrl + Shift + P`
`GitHub: Pull Requests`
> This command is used to open the pull requests view in Visual Studio Code.
> Git Bash Commands: `git pull-request` or `git pr`


### Open Issues
`Ctrl + Shift + P`
`GitHub: Issues`
> This command is used to open the issues view in Visual Studio Code.
> Git Bash Commands: `git issue` or `git issues`

### Create Pull Request
`Ctrl + Shift + P`
`GitHub: Create Pull Request`
> This command is used to create a pull request in Visual Studio Code.
> Git Bash Commands: `git pull-request create` or `git pr create`

### Create Issue
`Ctrl + Shift + P`
`GitHub: Create Issue`
> This command is used to create an issue in Visual Studio Code.
> Git Bash Commands: `git issue create` or `git issues create`