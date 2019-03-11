#!/usr/bin/env bash

IP=$1

ssh roboticaest@$IP <<'ENDSSH'
	
	cd ~
	pwd

	

ENDSSH