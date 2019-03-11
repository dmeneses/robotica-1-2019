# Add step to configure aliases for pull, push the code
git config --global alias.iniciar "!sh -c 'git checkout -b \$1 && git push -u origin \$1' -"
git config --global alias.guardarCambios "!sh -c 'git add -A && git commit -m \"\$1\" && git push' -"
