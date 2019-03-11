#!/usr/bin/env bash

# Computer IP where the instalation will be
IP=$1

# Install java manually if it's not installed by default
# sudo apt-get -y install openjdk-7-jdk

# Also the robotica.tar.gz should be available at the home folder of the current user
# Get the robotica.tar.gz from the repo: 

scp ~/robotica.tar.gz roboticaest@$IP:/home/roboticaest
ssh roboticaest@$IP <<'ENDSSH'
	
	cd ~
	pwd

	tar -xzf robotica.tar.gz
	cd robotica
	tar -xzf eclipse.tar.gz
	tar -xzf lejos-lib.tar.gz
	mv leJOS_EV3_0.9.1-beta ~
	mv eclipse ~

	if [ ! -d "$DIRECTORY" ]; then
    	mkdir ~/.ssh
	fi
	chmod 700 ~/.ssh
	cp robotica_rsa ~/.ssh/
	cp robotica_rsa.pub ~/.ssh/
	cp config ~/.ssh/
	eval "$(ssh-agent -s)"
	ssh-add ~/.ssh/robotica_rsa

	cd ~
	ssh-keyscan github.com >> ~/.ssh/known_hosts
	git clone git@github.com:dmeneses/robotica-1-2019.git

ENDSSH

# Follow the manual steps in the computer ip where this got installed.