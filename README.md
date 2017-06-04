## Charlie's Make Change Project
This is my week 1 homework project.

After prompting the user for how much the item cost and the amount tendered, I set a variable called "difference" which is the amount of change owed to the customer. I then rounded that double to the 100th decimal place so as to avoid any wisecrackers trying to get clever and break my code (although it appears strings will still do that).

The code then jumps into a while loop, ensuring each time it runs that the difference (remainder) value is greater than 0. 

Following that, the code checks if each value can fit into it at least once. If it can, it checks how many times the value can fit into the remainder, then subtracts those times from the remainder.

The code then checks if the value fit into the remainder 1 time, or more than 1 time, and uses the appropriate plural/singular for each instance.

I initially had written all of that as repetitive code, but decided to instead re-write it as a method so things look nice and clean (and they are!). At the end of the method, it returns a double to the original value difference, updating the remainder. 

Finally, I decided to add the option for 50s and 100s to be used if necessary. Having written a method to check if the remaining change owed was divisible by X made this substantially easier! YAY METHODS!

Charlie
