# CIS152-Publication Database Management System
# CIS152-Publication Database Management System
Publication Database Management System (a proposal of the final project for CIS 152: data structures)
By Xiaoyu Xing
Introduction: 
In this big data age, the amount of data generated everyday are growing rapidly. This is also true in the publication area. Thousands of books, magazines, and video products are issued every year in hundreds of countries with dozens of languages. There is a great need for an efficient management of all these information for all libraries, and all the places with large amounts of publications in possession. It will not be surprised to see the advanced and efficient management program for publications running in city libraries, like the Iowa City Public Library, not even mention The Boston Public Library or The New York Public Library. However, for any bibliophilia, it is very common for them to hold hundreds of books in their house. Probably the most painful thing for them could be looking for a book in their several wall shelves. They may want to find by author, title, publication year, purchased year, type, or location on shelves. For these people, there is no doubt friends of them would borrow books or others from time to time. Therefore, a good track of borrowing and returning could be an essential thing this bibliophilia wants to know. The huge program used in city libraries would be too much for such a job. Therefore, this Publication Database Management System will target to this group of users, which is light weight, but still offers efficient and clear management.
Solution:
For this project, two data structures and one sorting method will be used. A detailed mapping of design is showed below (Figure 1). (The design is not final, necessary modification may be carried out.) For publication database, a superclass of publications and several subclasses, which extend from the superclass, will be build. Then followed by the binary search tree, which includes node and the tree class, to store publications by ISBN as the key. Several necessary methods are included, e.g. insert, search by fields, isDelete, and isBorrow etc. The Borrow Tracking system will keep a record of who borrowed what at when, which implemented by a linked list, which is composed the link and list. Several necessary methods are included. More importantly, by insertion sort, the borrowed books can be sorted by borrowers’ name. Then the driver serves for the testing of each part and as a complete program.

![Project outline shown below.](https://github.com/xxingDMACC/CIS152-Publication-Database-Management-System/blob/Outline/Outline.png)

Timeline:
This project can be divided into four sections to finish based on workload. 
In the first section: The Publication superclass and subclass with all the methods will be build and a test for this only will be carried out with several publications inserted and all methods tested to function well.
In the second section:  The Binary Search Tree part will be built to incorporate with publication classes. Due to multiple methods in the part, test will be leaved for next section.
In the third section: Test for the whole Publication database will be carried out to make sure the function after cooperating the publication and binary search tree parts. The borrow tracking system will also be built on this time.
In the fourth section: A simple user interface will be included in the main to complete the program. The main driver will be refined for the complete test of the system. The program will be checked to ensure the function.

If there is any suggestions or advice, please let me know. Thank you.
