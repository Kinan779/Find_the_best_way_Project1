# Find_the_best_way_Project
 A student's journey home 

A student's return home I came out after you attended my practical lecture intelligent search algorithms, a Dear student of the college,
happy To your house, and since the lecture ended at half past two a I went to the door of your main concern, I was going It was rush hour,
the traffic was heavy, it seemed a Too long to wait for a ride The bus will be long,
on the bus the trip will be tiring because you are probably a And even if I could find you a place . 
a You will ride the bus standing You wanted to take a taxi from the bus a Instead, 
since you longed to go home and eat a plate The molokhia left over from the previous day's lunch before your brother gets home and beats you to it,
I stopped Tex And I started negotiating with the driver, but he didn't take pity on you and asked for XXX pounds.
You put your hand into your pocket and he didn't You find in it nothing but X, and then you gave up the idea and the world became black in your eyes,
as the dream of eating a dish Molokhia started to fade...

Here, dear student, a wonderful idea came to your mind, which is to take advantage of the wonderful skills that you learned in the university 
Smart search algorithms draw back a plan and map a And a pen a To the house, I took out a sheet For the route, 
I divided the road into several M stations and drew a graph in which I connected the traffic stations different, 
since you can cross from station m𝑖 to station m𝑗 by one of the following means W:
- bus ride / service, taxi ride, - - By foot. 
a I defined the descriptors for each route connecting two stations m𝑖 and m𝑗 as follows: The distance between them in kilometers. 
The possibility of a bus / service or taxi passing between the two stations (as some roads are designated for pedestrians). 
Just(. - The name of the bus line / between them a Service, if available. - The speed of the bus / service to cross the distance between the two
stations estimated in kilometers per hour. - The speed of the taxi to cross the distance between the two stations estimated in kilometers per hour. 
For each station m𝑖: a well developed - The expected time to wait for the bus / service in case you want to ride it. This time is not a )
supposedly It varies according to the type of bus line. - The expected time to wait for a taxi if you want to take it. Developedundefined Dear student,
there are three criteria for the cost of the road when moving from station m𝑖 to station m𝑗 using the means 𝑤𝑘, namely: - the time it takes, 
this time is the sum of the waiting time to board the means of transportation 𝑤𝑘 Which only counts if you rode that ride from station m𝑖 , 
plus the time It takes time to travel between the two stations, which is calculated according to the type of means of transportation on the
figure the next: o If you ride a bus / bus speed on this road. x Service: time is distance o The speed of the vehicle on this road.
If you ride a taxi: time is distance o If on foot: a Estimated walking speed x distance walked Time is the distance At about 5.5 km / h. 
The amount of money that will cost you, which is calculated according to the type of means of transportation as follows: 
 - If you ride a bus / service: the cost is 400 pounds, calculated at the moment you board the bus, 
When the bus can pass more than one stop without being on the designated route without being stopped You calculate a new cost.
 - If you ride a taxi: the cost is 1000 the distance traveled between the two stations. 
Lira or on foot a If the distance is covered by walking, the cost is 0. 
the amount of effort undefined The physical effort involved when switching between the two stations, 
 -which you figured as if you were playing your game Favorite on the mobile, where you gave yourself energy (health) 100 at the beginning of the road,
 and got up By decreasing energy according to the type of means of transmission as follows: o If you ride a bus / service: 
 your energy decreases by 5 for every kilometer you travel. o If you ride a taxi: your energy does not decrease,
 but increases by 5 for every kilometer you travel. o at least a If you walk the distance or decrease your energy by 10 for every kilometer 
 you cut it off Then, dear student, you set the goal of the trip, which is to reach your home as quickly as possible, so as not to exceed The cost of 
 the road is the amount in your pocket, so that your energy does not reach 0 at the end of the road. Required: 
 1 - Represent the problem as a state space search, what is represented in your problem state? What is a transition function? What is a cost?
 What is a starting state? What is an ending state? using the appropriate structure a Achieve it programmatically in any programming language you prefer. 
 2 - Solve the problem using A* algorithm, define a heuristic function For a case (remember that empirical is the minimum estimate). 
 undefined For the cost between the current state The goal (. l b a To find the solution with the lowest cost, print the output represented by 
 the stations crossed by and a means Transfer between stations, in addition to the time, amount of money and effort spent on each arrival terminal to 
 the target station. Additionally print the execution time and the number of nodes processed (take it out from the queue search) for
 the solution you arrived at. - Getting to your home at the lowest possible cost, so that your energy does not reach 0 at the end of the road.
 - Reaching your home with the highest possible energy, so that the cost of the road does not exceed the amount in your pocket. 
 - Reaching your home as quickly as possible, at the lowest possible cost and with the highest possible energy. 
 - Resolve the previous order using these cost functions and compare the output undefined
