@echo off
start cmd /s /k "cd bukkit && copy ..\target\MinecraftPlugin-0.0.1-SNAPSHOT.jar plugins\ && java -Xms1G -Xmx3G -d64 -jar .\craftbukkit-1.15.2.jar nogui"
