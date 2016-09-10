# SWEN755
==============================================================

Implementing Fault detection Heartbeat tactic
--------------
To run the project, Download the files and extract them or clone the project "https://github.com/SilvaMatti/SWEN755.git". 
Got to the folder "SWEN755-master\ParkingSensor"
Run the command from command line - java Main
The program will start running.


Fault Injection
--------------
In order to detect the fault, we injected the fault in the system with the help of random number generator.
The system works fine as long as it does not encounter a fault (which is number 0 from the random number generator).


Quality Attributes 
--------------
1.
Source: random event. 
Stimulus: causes a sensor to stop.
Artifact: Sensor processing unit.
Environment: while car is parking.
Response: detect sensor blackout, stop the car, and warn driver (audio, dashboard) to switch to manual mode
Response measure: car brakes completely after 3 seconds of not receiving heartbeat.

2.
Source: random event.
Stimulus: VisualDisplay --> visual warning doesn't work.
Artifact: Visual Display unit.
Environment: Car moving (including parking).
Response: detect visual warning problem, and warn driver (audio warning).
Response measure: car switches to other warning modes (if off) in 3 seconds.

