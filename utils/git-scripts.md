# GIT ROBOTICS REPOSITORY SETUP

Git repository is already configured with RSA keys to push changes into the official repository. All the machines share the same rsa keys with the same permissions.

Also eclipse workspace is already configured to point this repository.

Git repository location: /home/roboticaest/robotica-1-2019/src

Git aliases created that should be run inside the repository location:
```bash
# Create a new branch and push it to the main repository
git iniciar STUDENT_NAME
# Commit all the changes that are in the repo skipping what .gitignore has and pushes it to the repo
git guardarCambios "Some commit message"
```

There is more aliases that were added after computers got configured. To obtain those do a `git pull` before creating another branch. These git commands are added in the file: *./utils/git-setup.sh*, to update the aliases to the latest just do:

```bash
./git-setup.sh
```

## Troubleshooting

### permission denied
```
Permission denied (publickey)
...
```
Execute:
``` bash
eval "$(ssh-agent -s)"
ssh-add ~/.ssh/robotica_rsa
```



