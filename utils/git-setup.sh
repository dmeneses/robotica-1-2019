# Add step to configure aliases for pull, push the code
git config --global alias.crearCuenta "!sh -c 'git checkout -b \$1 && git branch --track \$1' -"
git config --global alias.guardarCambios "!f() { git add -A; git commit -m \$1; git push; }; f"
