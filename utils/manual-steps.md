# Manual steps after remote install

## Direct access setup

For ubuntu 14.04 MATE Desktop copy eclipse desktop entry into apps:

	sudo cp /home/roboticaest/robotica/eclipse.desktop /usr/share/applications/

## Install lejos plugin into eclipse

The first 4 steps are not necesary if you copied the custom eclipse version that already contains the plugin.

- Open eclipse from Applications > Programming
- Go to Help > Eclipse Marketplace
- Search for lejos
- Install plugin
- Configure plugin from Window > Preferences > leJOS EV3
	- EV3_HOME: /home/roboticaest/leJOS_EV3_0.9.1-beta
	- Run tools in a separate JVM: Enabled
	- Use ssh and scp: Disabled
	- Connect to brick named: Enabled - Name: 10.0.1.1
	- Run program after upload: Enabled

- There is a Test project created in the src folder in this repo, use that one to test the installation.


