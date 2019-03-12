# GIT ROBOTICS REPOSITORY SETUP

Git repository is already configured with RSA keys to push changes into the official repository. All the machines share the same rsa keys with the same permissions.

Also eclipse workspace is already configured to point this repository.

Git repository location: /home/roboticaest/robotica-1-2019/src

Git aliases created that should be run inside the repository location:
```bash
# Create a new branch and push it to the main repository
git iniciar STUDENT_NAME
# Commit all the changes that are in the repo skipping what .gitignore has and pushes it to the repo
git subirCambios "Some commit message"
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



