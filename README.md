This is my solution to a mars rover challenge. It requires Java 7 to run properly.

The code is organized around two main classes: the MarsRover class and its UtilityHelper class. There is a Plateau class that is not used except to preserve some data that is later deleted. It is included to account for possible changes in the specs in the future - for example, it would be useful to check for bad rover input if necessary.

The movement methods belong to the MarsRover class, as does its final position. I felt that to be appopriate and solidly object-oriented. The UtilityHelper class is responsible for parsing the .txt file and then organizing the data as either a starting position or movement instructions. All of those methods are fairly abstract so I felt a helper class was the appropriate class to organize them under.

The code assumes that the input will be in a .txt file and will be valid (ie. not send the rover beyond the paramaters of the plateau). Currently, the Plateau class is not being utilized - it simply returns the dimensions of the plateau to be used later if necessary. The code also assumes that no two rovers will crash into each other.

In order to run the program, compile the program with javac *.java from the directory in which it is stored and then call Java MarsRover (.txt file name). Currrently, the command is "java MarsRover mars_rover_input.txt".

I would like to add that less than 2 weeks ago I did not know how to print out "Hello, World" in Java. It's been great learning so much in such a short period of time.
