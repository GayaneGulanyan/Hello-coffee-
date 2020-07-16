# Hello-coffee-
Task 1
Machine Have Needs!
Solution: Class MachineHaveNeeds

Coffee machine instruction
Description
Now let's consider a case where you need a lot of coffee. Maybe, for example, you're hosting a party with a lot of guests. The program should calculate how much water, coffee, and milk are necessary to make the specified amount of coffee. One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.
The user should input the amount of coffee he needs, in cups, for all the guests.
Of course, all this coffee is not needed right now, so at this stage, the coffee machine doesn't actually make any coffee.

Instruction
Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.
Please note in this case we already have repository for coffee machine we should just create separate flow for this task , don't forget about ignoring unnecessary files , adding description in the readme , adding comments , making names meaningful . Also all your methods should be small (should have singe responsibility which mean only one logic) , and parameters list shouldn't be more then 3-4 . 

Task 2 Action!
Solution: Class Action, Main code
Description
Let's simulate an actual coffee machine. It has a limited supply of water, milk, coffee beans, and disposable cups. Also, it counts how much money it gets for selling coffee. The coffee machine has several options: first, it needs to be able to sell coffee. It can make different varieties of coffee: espresso, latte, and cappuccino. Of course, each variety requires a different amount of supplies, except that all of them requires only one disposable cup. Second, the coffee machine should be able to get replenished by a special worker. Third, another special worker should be able to take money from the coffee machine.
Write the program that can do one of these actions at a time. It reads one line from standard input, which can be "buy", "fill", "take". If you want to buy some coffee, input "buy". If you are a special worker and you think that it is time to fill out all the supplies for the coffee machine, input "fill". If you are another special worker and it is time to take the money from the coffee machine, input "take".
If the user writes "buy" then he must choose one of three varieties of coffee that the coffee machine can make: espresso, latte, or cappuccino.
For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
If the user writes "fill", the program should ask him how much water, milk, coffee and how many disposable cups he wants to add into the coffee machine.
If the user writes "take" the program should give him all the money that it earned from selling coffee.
At the moment, the coffee machine has $550, 400 ml of water, 540 ml of milk, 120 g of coffee beans, and 9 disposable cups.

Write the program that prints the coffee machine's state, processes one query from the user, and also prints the coffee machine's state after that. Try to use methods to implement every action that the coffee machine can do.
Instruction
Write a program that offers to buy one cup of coffee or to fill the ingredients or to take it's money. At the same time, the program should calculate how many ingredients it has left. And also display the number of ingredients before and after purchase.

Task 3 Enough coffee for everyone
Solution: Class Action, not meeted awailable coffee cups 

Description

A real coffee machine never has an infinite supply of water, milk, or coffee beans. And if you input a really big number, it's almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.
In this stage, you need to improve the previous program. Now you need to input amounts of water, milk, and coffee beans that your coffee machine has at the moment.
If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes, I can make that amount of coffee". If the coffee machine can make more than that, the program should output "Yes, I can make that amount of coffee (and even N more than that)", where N is the number of additional cups of coffee that the coffee machine can make. If the amount of resources is not enough to make the specified amount of coffee, the program should output "No, I can make only N cup(s) of coffee".
Like in the previous stage, the coffee machine needs 200 ml of water, 50 ml of milk, and 15 g of coffee beans to make one cup of coffee.
Instruction

Write a program that calculates whether it will be able to make the required amount of coffee from the specified amount of ingredients.
