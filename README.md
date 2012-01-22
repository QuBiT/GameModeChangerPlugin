GameModeChangerPlugin
=====================
GameModeChangerPlugin is a plugin for CanaryMod to allow the player to toggle between CREATIVE and SURVIVAL mode with a simple command.
CanaryMod is a server mod for the Minecraft server software.

History
-------
Read the history.txt file.

Download
--------
Go to the download section and download the version you want to use.

Generating the jar from source
------------------------------
In Eclipse select this project and choose File -> Export... -> Jar File

Installing the plugin
---------------------
1. Copy the jar file into the plugins folder of the CanaryMod Server directory.
2. Edit the server.properties file and add 'GameModeChangerPlugin' to 'plugins' (e.g. plugins=GameModeChangerPlugin,... ) to load this plugin on startup.


Setting up GameModeChangerPlugin Project
----------------------------------------
1. use 'git clone git://github.com/QuBiT/GameModeChangerPlugin' to download the source files.
2. in Eclipse: File -> New -> Java Project use 'GameModeChangerPlugin' as name and check if Eclipse will automatically import this project into your workspace. 

Development Dependencies
------------------------
This project depends on the CanaryMod Project.

Setting up CanaryMod Project
----------------------------

1. Install Java
2. Download Eclipse
3. Install Git
4. checkout CanaryMod
4.1 use 'git clone git://github.com/shadow386/CanaryMod' to download the source files.
4.2 use 'cd CanaryMod/jarjar' to change into that directory.
4.3 use 'wget http://www.minecraft.net/download/minecraft_server.jar' to download the latest minecraft server jar and store it in the same directory.
4.4 use './jarjar.sh' to create minecraft_servero.jar
4.5 use 'cd ..' to go back to the CanaryMod directory

5 Open Eclipse and Import the source as java project.
	Eclipse -> File -> New -> Java Project ... use CanaryMod as Project Name to import it into your Workspace.

6 right click build.xml and select run as -> ant build
	alternatively use 'ant jar' on your command line to build the minecraft_servero.jar

If you get:
BUILD FAILED
CanaryMod/build.xml:34: Unable to find a javac compiler;
com.sun.tools.javac.Main is not on the classpath.
Perhaps JAVA_HOME does not point to the JDK.
It is currently set to "..."

you can:
a. go to Window -> Preferences -> Ant -> Runtime -> Classpath -> Global Entries and add tools.jar from your Java JDK lib directory.
or
b. go to Window -> Preferences -> Java -> Installed JREs and add and select your JDK as standard vm. (preferred) 

7 Add CanaryMod Project to the Java Build Path of the Plugin Project.

8 Done.
