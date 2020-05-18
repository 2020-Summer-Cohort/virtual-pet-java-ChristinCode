# Virtual Pet

See the HELP.md for assignment directions and guide.

Virtual Pet Class:

First, I broke down the project into smaller chunks. 
The break down consisted of adding private variables and 
creating different methods like the constructor method.

The variables are used to store the pet’s attributes and 
tracks the user's interaction utilizing Tick. The first 
method houses the constructor. The variables have been 
initialized in this method. The name and the species have 
been initialize in order to be called in the application 
and the rest of the attributes have been initialized by 
random numbers.

The defineSelection method is based on the users input and 
decreased the selected attribute value, that was assign 
randomly at the start of the game. The "get" methods show 
the value of the private variables. The rest of the methods 
are all data manipulation using conditional operators. This 
tick method increased the virtual pets attribute after each
user interaction. 

Virtual Pet Application Class:

The application imported the scanner library in order to read 
the users keyboard. Next I created an object in order to pull from 
the Virtual Pet Class. Application prints out direction to user. 
I called my game loop into my main method. I chose to refactor my 
while loop to keep things clean. Just for fun, I included a 0 to
exit feature. 

Stretch Goal:

Added the ability to take care of it's needs by using the randomizer in tick.
Added Ascii art of cat.
Added in Test using the defineSelection method.