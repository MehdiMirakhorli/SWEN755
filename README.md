# SWEN755
==============================================================

Running the code
-----------------
To run the project, Download the files and extract them or clone the project "https://github.com/SilvaMatti/SWEN755.git". 
Got to the folder "SWEN755-master\ParkingSensor"
Run the command from command line 
1. start rmiregistry
2. start java -Djava.rmi.server.codebase=file:ParkingSensor/ ObstacleDetector
3. start java -Djava.rmi.server.codebase=file:ParkingSensor/ RedundantObstacleDetector
4. java DecisionMakingProcessor

The program will start running.

Note: After running the command "2" and "3" it will pop up two seperate windows. Please arrange them in such a way that both the interfaces are visible. That way it will be easy to observe that both the active node and redundant node are up.

Fault Injection
--------------
In order to detect the fault, we injected the fault in the system with the help of random number generator.
The system works fine as long as it does not encounter a fault (which is number 0 from the random number generator).
If it detects 0, it will switch to the redundant node which is already up.




