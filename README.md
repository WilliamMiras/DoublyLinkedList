This program is associated with CSC 130 - Data Structures and Algorithms Analysis at CSU - Sacramento.

🧑‍🎓 The program reads a list of students (first names only) from a .txt file.

If the names in the file are unsorted, the program first sorts all the names.

The sorted names are then placed in sorted order within a Doubly Linked List. 
Iff the line "delete [name]" is detected in the .txt file. The name is removed from the linked list, considering all conditions (student to be deleted is at the head, middle, or tail of the list).

At the end, the program traverses the list and displays the names in ascending and descending order. 

🪧Here is an example of the program when **input.txt** includes the following: 

Will

Jaclyn

Jonathan

Dennis

delete Will

Kathy

Andrew

🟰 The output looks like the following with all names sent .toLowerCase(): 

andrew

dennis

jaclyn

jonathan

kathy

/===============================\

kathy

jonathan

jaclyn

dennis

andrew
