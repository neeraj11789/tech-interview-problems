# NOTES - GIT: The Missing Semester

##  GIT Data Model
Git uses blob, commit and tree objects for saving the things - 
```shell script
    type blob : array <byte>
    type tree : map<string, tree|blob >
    type commit : struct{
        parents : array <commit>
        author : string
        message : string
        snapshot : tree
    }


    type object : blob | tree | commit
    objects : map<string, object>

    def store(o)
      id = sha1(o)
      objects[id] = o;

    def load(id)
      return objects[id];

    references : map<string, string>
```

Git uses references for mapping the commit ids to human readable texts. Master, Head, OtherBranchNames are all examples of references.

Git fast-forwards the commits which needs only pointer updates, meaning no new-commit objects need to be created for same.

### Useful Commands

```shell script
    # shows the contents of the commit
    git cat-file -p <commit-id>

    # log
    git log --all --graph --decorate
    
    # one-liner log
    git log --all --graph --decorate --online
    
    # list all remote
    git remote 

    git push origin master:master

    git branch --set-upstream-to <branch>

    git branch --vv

    # updates the graph but references are not updated
    git fetch 

    # can be updated using vim ~/.gitconfig
    git config 

    # get the latest copy without the whole version history
    git clone --shallow 

    # it will add for specific changes to be included in staged araa 
    git add -p

    git diff --cached 

    git diff 
    
    git blame <file>

    git show <commit>

    git stash pop

    git stash

    git bisect
```

## References 
    https://missing.csail.mit.edu/2020/version-control/