#!/usr/bin/env bash

IP=$1

ssh roboticaest@$IP <<'ENDSSH'
	pwd
	cd ~/robotica-1-2019
	git pull
	./utils/git-setup.sh
ENDSSH