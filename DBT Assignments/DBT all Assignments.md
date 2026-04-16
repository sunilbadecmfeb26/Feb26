## **DBT**





#### ***Assignment no.1 :***



**Creating sample tables and inserting values.**







1. A) salespeople :-





Create table:



create table salespeople (

Snum int (4),

Sname varchar(10),

City varchar(10),

Comm float(3,2)

);





B) Insert values:



**insert into salespeople values**

**(1001, 'Peel', 'London', 0.12),**

**(1002, 'Serres', 'San Jose', 0.13),**

**(1004, 'Motika', 'London', 0.11),**

**(1007, 'Rifkin', 'Barcelona', 0.15),**

**(1003, 'Axelord', 'New York', 0.10);**











C) seeing table salespeople:

**select \* from salespeople;**







B) Customers :-

Create table:



create table salespeople (

Cnum int (4),

Cname varchar(10),

City varchar(10),

Rating int(4),

Snum int(4)

);







Insert values:



**insert into customers values**

**(2001, 'Hoffman', 'London', 100, 1001),**

**(2002, 'Giovanni', 'Rome', 200, 1003),**

**(2003, 'Liu', 'San Jose', 200, 1002),**

**(2004, 'Grass', 'Berlin', 300, 1002),**

**(2006, 'Clemens', 'London', 100, 1001),**

**(2008, 'Cisneros', 'San Jose', 300, 1007),**

**(2007, 'Pereira', 'Rome', 100, 1004);**









seeing table salespeople:



**select \* from customers;**





C) Orders :-





Create table:



create table orders (

Cnum int (4),

Amt float(7,2),

Odate date,

Rating int(4),

Snum int(4)

);





Insert values:



**insert into orders values**

**(3001, 18.69, '1990-10-03', 2008, 1007),**

**(3003, 767.19, '1990-10-03', 2001, 1001),**

**(3002, 1900.10, '1990-10-03', 2007, 1004),**

**(3005, 5160.45, '1990-10-03', 2003, 1002),**

**(3006, 1098.16, '1990-10-03', 2008, 1007),**

**(3009, 1713.23, '1990-10-04', 2002, 1003),**

**(3007, 75.75, '1990-10-04', 2004, 1002),**

**(3008, 4723.00, '1990-10-05', 2006, 1001),**

**(3010, 1309.95, '1990-10-06', 2004, 1002),**

**(3011, 9891.88, '1990-10-06', 2006, 1001);**









seeing table salespeople:



**select \* from orders;**









#### ***Assignment no.2 :***





Introducing Relational Databases.







1.Which field of the Customers table is the primary key?



ans: **Cnum** table is the primary key.







2\. What is the 4th column of the Customers table?



ans: **Rating** is the 4th column of customers table.







3\\. What is another word for row?  For column?



ans: **Row : Field** and **Column : Attribute.**







4\\. Why isn’t it possible to see the first five rows of a table?



ans: because **SQL tables do not maintain any specific order of rows.**













Assignment no.3 :





Overview of SQL.







1\) Does ANSI recognize the data type DATE?



ans : **Yes, ANSI recognizes the DATE data type.**







2\) Which subdivision of SQL is used to insert values in tables?



ans : **Data Manipulation Language is the subdivision of SQL which is used to insert values in tables.**











Assignment no.4 :





Retrieving Information from Tables.



1\) Write a select command that produces the order number, amount, and date for all rows in the Orders table.



ans : **select Onum, Amt, Odate from orders;**







2\) Write a query that produces all rows from the Customers table for which the

salesperson’s number is 1001.



ans : **select \* from customer**

&#x09;**where Snum = 1001;**







3\) Write a query that displays the Salespeople table with the columns in the

following order: city, sname, snum, comm.



ans : **select City, Sname, Snum, Comm from salespeople;**







4\) Write a select command that produces the rating followed by the name of each

customer in San Jose.



ans : **select Cname, City, Rating from customers**

&#x09;**where City = 'San Jose';**







5\) Write a query that will produce the snum values of all salespeople

(suppress the duplicates) with orders in the Orders table.



ans : **select distinct Snum from orders;**		--------(for retrieving only **Snum col.)**



**select \* from orders**

**where Onum in (select min(Onum)**		       -------(all unique rows retrieve **by Snum)**

**from orders**

**group by Snum);**







#### ***Assignment no.5 :***



**Relational and Logical Operators.**





1\) Write a query that will give you all orders for more than Rs. 1,000.



ans : **select \* from orders**

&#x09;**where Amt > 1000.0;**

&#x20;



2\) Write a query that will give you the names and cities of all salespeople in

London with a commission above .10.



ans : **select \* from salespeople**

&#x09;**where Comm > 0.10;**





3\) Write a query on the Customers table whose output will exclude all customers

with a rating <= 100, unless they are located in Rome.



ans : **select \* from customers**

&#x09;**where Rating > 100 or City = 'Rome';**





4\) What will be the output from the following query?



ans : **select \* from Orders**

**where (amt < 1000 OR**

**NOT (odate = '1990-10-03'**

**AND cnum > 2003));**



ans :



**+-------+---------+------------+------+-----+**

**| Onum |   Amt   |   Odate    | Cnum | Snum |**

**+------+---------+------------+------+------+**

**| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |**

**| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |**

**| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |**

**| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |**

**| 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |**

**| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |**

**| 3010 | 1309.95 | 1990-10-06 | 2004 | 1002 |**

**| 3011 | 9891.88 | 1990-10-06 | 2006 | 1001 |**

**+------+---------+------------+------+------+**







5\) What will be the output of the following query?

**Select \* from Orders**

**where NOT ((odate = ‘1990-10-03’ OR snum**

**>1006) AND amt >= 1500);**



ans :



**+------+---------+------------+------+------+**

**| Onum |   Amt   |   Odate    | Cnum | Snum |**

**+------+---------+------------+------+------+**

**| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |**

**| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |**

**| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |**

**| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |**

**| 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |**

**| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |**

**| 3010 | 1309.95 | 1990-10-06 | 2004 | 1002 |**

**| 3011 | 9891.88 | 1990-10-06 | 2006 | 1001 |**

**+------+---------+------------+------+------+**











6\) What is a simpler way to write this query?

**Select snum, sname, city, comm From Salespeople**

**where (comm > .12 OR comm <.14);**





ans :



**+------+---------+-----------+------+**

**| Snum | Sname   | City      | Comm |**

**+------+---------+-----------+------+**

**| 1001 | Peel    | London    | 0.12 |**

**| 1002 | Serres  | San Jose  | 0.13 |**

**| 1004 | Motika  | London    | 0.11 |**

**| 1007 | Rifkin  | Barcelona | 0.15 |**

**| 1003 | Axelord | New York  | 0.10 |**

**+------+---------+-----------+------+**











#### ***Assignment no.6 :***





**Using Special Operators in Conditions.**





1\) Write two different queries that would produce all orders taken on October 3rd or 4th, 1990.



ans :



A-->	**select \* from orders**

&#x09;**where Odate = '1990-10-03' or Odate = '1990-10-04';**



B-->	**select \* from orders**

&#x09;**where Odate in ('1990-10-03', '1990-10-04');**







2\) Write a query that selects all of the customers serviced by Peel or Motika.

(Hint: the snum field relates the two tables to one another).



ans : **select \* from customers**

&#x20;   **-> where Snum in (select Snum**

&#x20;   **-> from salespeople**

&#x20;   **-> where Sname in ('Peel', 'Motika')**

&#x20;   **-> );**







3\) Write a query that will produce all the customers whose names begin with a letter from ‘A’ to ‘G’.

ans : **select \* from customers**

&#x20;   **-> where Cname between 'A' and 'G';**





4\) Write a query that selects all customers whose names begin with the letter ‘C’.

ans : **select \* from customers
where Cname like 'C%';**









5\) Write a query that selects all orders except those with zeroes or NULLs in the amt field.

ans :	**select \* from orders**

&#x09;**where Amt is not null
and Amt <> 0;**









#### ***Assignment no.7 :***



***Summarizing Data with Aggregate Functions.***



1\) Write a query that counts all orders for October 3.

ans : **select count(\*)**

&#x09;**from orders**

&#x09;**where Odate = '1990-10-03';**





2\) Write a query that counts the number of different non-NULL city values in the

Customers table.

ans : **select count(distinct city)**

&#x09;**from customers**

&#x09;**where city is not null;**



3\) Write a query that selects each customer’s smallest order.

ans : **select cnum, min(amt)**

&#x09;**from Orders**

&#x09;**group by cnum;**





4\) Write a query that selects the first customer, in alphabetical order, whose name begins with G.

ans : **select \* from Customers**

&#x09;**where cname like 'G%'**

&#x09;**order by cname**

&#x09;**LIMIT 1;**





5\) Write a query that selects the highest rating in each city.

ans : **select city, MAX(rating)**

&#x09;**from customers**

&#x09;**group by city;**





6\) Write a query that counts the number of salespeople registering orders for each day. (If a salesperson has more than one order on a given day, he or she should be counted only once.).

ans : **select Odate, COUNT(DISTINCT snum)**

&#x09;**from Orders**

&#x09;**group by Odate;**









#### ***Assignment no.8 :***



***Formatting Query output.***



1\) Assume each salesperson has a 12% commission. Write a query on the orders

table that will produce the order number, the salesperson number, and the amount

of the salesperson’s commission for that order.

ans : **SELECT onum, snum, amt \* 0.12 AS commission**

&#x09;**FROM Orders;**

&#x20;

2\) Write a query on the Customers table that will find the highest rating in each city.

ans : **SELECT city, MAX(rating)**

&#x09;**FROM Customers**

&#x09;**GROUP BY city;**



Put the output in this form:

For the city (city), the highest rating is : (rating).

ans : **SELECT rating, cname, cnum**

&#x09;**FROM Customers**

&#x09;**ORDER BY rating DESC;**



3\) Write a query that lists customers in descending order of rating. Output the rating field first, followed by the customer’s name and number.

ans : **SELECT odate, SUM(amt) AS total\_amount**

&#x09;**FROM Orders**

&#x09;**GROUP BY odate**

&#x09;**ORDER BY total\_amount DESC;**



4\) Write a query that totals the orders for each day and places the results in

descending order.

ans : **SELECT odate, SUM(amt) AS total\_amount**

&#x09;**FROM Orders**

&#x09;**GROUP BY odate**

&#x09;**ORDER BY total\_amount DESC;**









#### ***Assignment no.9 :***



***Querying Multiple Tables at Once.***

1\) Write a query that lists each order number followed by the name of the customer who made the order.

ans : **SELECT o.onum, c.cname**

&#x09;**FROM Orders o**

&#x09;**JOIN Customers c**

&#x09;**ON o.cnum = c.cnum;**





2\) Write a query that gives the names of both the salesperson and the customer for each order along with the order number.

ans : **SELECT o.onum, s.sname, c.cname**

&#x09;**FROM Orders o**

&#x09;**JOIN Salespeople s ON o.snum = s.snum**

&#x09;**JOIN Customers c ON o.cnum = c.cnum;**





3\) Write a query that produces all customers serviced by salespeople with a

commission above 12%. Output the customer’s name, the salesperson’s name,

and the salesperson’s rate of commission.

ans : **SELECT c.cname, s.sname, s.comm**

&#x09;**FROM Customers c**

&#x09;**JOIN Salespeople s ON c.snum = s.snum**

&#x09;**WHERE s.comm > 0.12;**



&#x20;

4\) Write a query that calculates the amount of the salesperson’s commission on each order by a customer with a rating above 100.

ans : **SELECT o.onum, o.amt, s.comm, (o.amt \* s.comm) AS commission**

&#x09;**FROM Orders o**

&#x09;**JOIN Customers c ON o.cnum = c.cnum**

&#x09;**JOIN Salespeople s ON o.snum = s.snum**

&#x09;**WHERE c.rating > 100;**









#### ***Assignment no.10 :***



***Joining a Table to Itself.***



1\) Write a query that produces all pairs of salespeople who are living in the same city.  Exclude combinations of salespeople with themselves as well as duplicate rows with the order reversed.

ans : **SELECT s1.sname, s2.sname, s1.city**

&#x09;**FROM Salespeople s1**

&#x09;**JOIN Salespeople s2**

&#x09;**ON s1.city = s2.city**

&#x09;**AND s1.snum < s2.snum;**





2\) Write a query that produces the names and cities of all customers with the same rating as Hoffman.

ans : **SELECT cname, city**

&#x09;**FROM Customers**

&#x09;**WHERE rating = (**

&#x09;**SELECT rating**

&#x09;**FROM Customers**

&#x09;**WHERE cname = 'Hoffman'**

&#x09;**);**











#### ***Assignment no.11 :***



Subqueries.



1\) Write a query that uses a subquery to obtain all orders for the customer named Cisneros. Assume you do not know his customer number (cnum).

ans: **SELECT \*** **FROM Orders**

&#x09;**WHERE cnum = (**

&#x09;**SELECT cnum**

&#x09;**FROM Customers**

&#x09;**WHERE cname = 'Cisneros');**



2\) Write a query that produces the names and ratings of all customers who have

above-average orders.

ans: **SELECT cname, rating**

&#x09;**FROM Customers**

&#x09;**WHERE cnum IN (SELECT cnum**

&#x09;**FROM Orders**

&#x09;**WHERE amt > (SELECT AVG(amt) FROM Orders));**



3\) Write a query that selects the total amount in orders for each salesperson for whom this total is greater than the amount of the largest order in the table.

ans: **SELECT snum, SUM(amt)**

&#x09;**FROM Orders**

&#x09;**GROUP BY snum**

&#x09;**HAVING SUM(amt) > (SELECT MAX(amt) FROM Orders);**









#### ***Assignment no.12 :***



Using the operators IN, ANY, and ALL.



1\) Write a query that selects all customers whose ratings are equal to or greater than ANY of Serres’.

ans: **SELECT \*FROM Customers**

&#x09;**WHERE rating >= ANY (**

&#x09;**SELECT rating FROM Customers**

&#x09;**WHERE cname = 'Serres');**



2\) Write a query using ANY or ALL that will find all salespeople who have no

customers located in their city.

ans: **SELECT \* FROM Salespeople s**

&#x09;**WHERE city <> ALL (**

&#x09;**SELECT city FROM**

&#x09;**Customers c WHERE s.snum = c.snum);**



3\) Write a query that selects all orders for amounts greater than any for the

customers in London.

ans: **SELECT \* FROM Orders**

&#x09;**WHERE amt > ANY (**

&#x09;**SELECT amt FROM Orders**

&#x09;**WHERE cnum IN (**

&#x09;**SELECT cnum FROM Customers**

&#x09;**WHERE city = 'London'));**



4\) Write the above query using MIN or MAX.

ans: **SELECT \*FROM Orders**

&#x09;**WHERE amt > (SELECT MIN(amt)**

&#x09;**FROM Orders**

&#x09;**WHERE cnum IN**

&#x20;       **(SELECT cnum FROM Customers**

&#x09;**WHERE city = 'London'));**









#### ***Assignment no.13 :***



Using the UNION clause.





1\) Create a union of two queries that shows the names, cities, and ratings of all customers. Those with rating of 200 or greater will also have the words “High Rating”, while the others will have the words “Low Rating”.

ans: **SELECT cname, city, rating, 'High Rating' AS status**

&#x09;**FROM Customers**

&#x09;**WHERE rating >= 200**

&#x09;**UNION**

&#x09;**SELECT cname, city, rating, 'Low Rating'**

&#x09;**FROM Customers**

&#x09;**WHERE rating < 200;**



2\) Write a command that produces the name and number of each salesperson and

each customer with more than one current order. Put the results in alphabetical

order.

ans: **SELECT sname AS name, snum AS number**

&#x09;**FROM Salespeople**

&#x09;**WHERE snum IN (SELECT snum**

&#x09;**FROM Orders**

&#x09;**GROUP BY snum HAVING COUNT(\*) > 1)**

&#x09;**UNION**

&#x09;**SELECT cname, cnum**

&#x09;**FROM Customers**

&#x09;**WHERE cnum IN (**

&#x09;**SELECT cnum FROM Orders**

&#x09;**GROUP BY cnum HAVING COUNT(\*) > 1)**

&#x09;**ORDER BY name;**



3\) Form a union of three queries. Have the first select the snums of all salespeople in San Jose; the second, the cnums of all customers in San Jose; and the third the onums of all orders on October 3. Retain duplicates between the last two queries but eliminate any redundancies between either of them and the first.

(Note: in the sample tables as given, there would be no such redundancy. This is

besides the point.)

ans: **SELECT snum FROM Salespeople**

&#x09;**WHERE city = 'San Jose'**

&#x09;**UNION**

&#x09;**SELECT cnum FROM Customers**

&#x09;**WHERE city = 'San Jose'**

&#x09;**UNION ALL**

&#x09;**SELECT onum FROM Orders**

&#x09;**WHERE odate = '03-OCT-1990';**









#### ***Assignment no.14 :***



Entering, Deleting, and Changing Field Values.





1\) Write a command that puts the following values, in their given order, into the salespeople table: city – San Jose, name – Blanco, comm – NULL, cnum – 1100.

ans: **INSERT INTO Salespeople**

&#x09;**(city, sname, comm, snum)**

&#x09;**VALUES ('San Jose', 'Blanco', NULL, 1100);**



2\) Write a command that removes all orders from customer Clemens from the

Orders table.

ans: **DELETE FROM Orders**

&#x09;**WHERE cnum = (SELECT cnum**

&#x09;**FROM Customers WHERE cname = 'Clemens');**



3\) Write a command that increases the rating of all customers in Rome by 100.

ans: **UPDATE Customers**

&#x09;**SET rating = rating + 100**

&#x09;**WHERE city = 'Rome';**



4\) Salesperson Serres has left the company. Assign her customers to Motika.

ans: **UPDATE Customers**

&#x09;**SET snum = (SELECT snum**

&#x09;**FROM Salespeople WHERE sname = 'Motika')**

&#x09;**WHERE snum = (SELECT snum**

&#x09;**FROM Salespeople WHERE sname = 'Serres');**









#### ***Assignment no.15 :***



Using Subqueries with DML Commands.



1\) Assume there is a table called Multicust, with all of the same column definitions as Salespeople. Write a command that inserts all salespeople with more than one customer into this table.

ans: **INSERT INTO Multicust**

&#x09;**SELECT \* FROM Salespeople**

&#x09;**WHERE snum IN (SELECT snum**

&#x09;**FROM Customers**

&#x09;**GROUP BY snum HAVING COUNT(\*) > 1);**



2\) Write a command that deletes all customers with no current orders.

ans: **DELETE FROM Customers**

&#x09;**WHERE cnum**

&#x09;**NOT IN (SELECT cnum FROM Orders);**



3\) Write a command that increases by twenty percent the commissions of all

salespeople with total orders above Rs. 3,000.

ans: **UPDATE Salespeople**

&#x09;**SET comm = comm \* 1.2**

&#x09;**WHERE snum IN (**

&#x09;**SELECT snum FROM Orders**

&#x09;**GROUP BY snum**

&#x09;**HAVING SUM(amt) > 3000);**









#### ***Assignment no.16 :***



Creating Tables and Indexes.



1\) Write a command that will enable a user to pull orders grouped by date out of the Orders table quickly.

ans: **CREATE INDEX idx\_odate**

&#x09;**ON Orders(odate);**



2\) If the Orders table has already been created, how can you force the onum field to be unique (assume all current values are unique)?

ans: **ALTER TABLE Orders**

&#x09;**ADD CONSTRAINT**

&#x09;**unique\_onum UNIQUE(onum);**



3\) Create an index that would permit each salesperson to retrieve his or her orders grouped by date quickly.

ans: **CREATE INDEX idx\_snum\_odate**

&#x09;**ON Orders(snum, odate);**



4\) Let us assume that each salesperson is to have only one customer of a given

rating, and that this is currently the case. Enter a command that enforces it.

ans: **ALTER TABLE Customers**

&#x09;**ADD CONSTRAINT unique\_snum\_rating**

&#x09;**UNIQUE(snum, rating);**









#### ***Assignment no.17 :***



Constraining the Values of your data.



1\) Create the Orders table so that all onum values as well as all combinations of cnum and snum are different from one another, and so that NULL values are

excluded from the date field.

ans: **CREATE TABLE Orders (**

&#x20;   **onum INT PRIMARY KEY,**

&#x20;   **amt DECIMAL,**

&#x20;   **odate DATE NOT NULL,**

&#x20;   **cnum INT,**

&#x20;   **snum INT,**

&#x20;   **UNIQUE(cnum, snum));**



2\) Create the Salespeople table so that the default commission is 10% with no

NULLS permitted, snum is the primary key, and all names fall alphabetically

between A and M, inclusive (assume all names will be uppercase).

ans: **CREATE TABLE Salespeople (**

&#x20;   **snum INT PRIMARY KEY,**

&#x20;   **sname VARCHAR(50) CHECK (sname BETWEEN 'A' AND 'M'),**

&#x20;   **city VARCHAR(50),**

&#x20;   **comm DECIMAL DEFAULT 0.10 NOT NULL);**



3\) Create the Orders table, making sure that the onum is greater than the cnum, and the cnum is greater that the snum. Allow no NULLS in any of these three fields. **CREATE TABLE Orders (**

&#x20;   **onum INT NOT NULL,**

&#x20;   **cnum INT NOT NULL,**

&#x20;   **snum INT NOT NULL,**

&#x20;   **CHECK (onum > cnum AND cnum > snum));**











#### ***Assignment no.18 :***



Maintaining the Integrity of your Data.



1\) Create a table called Cityorders. This will contain the same onum, amt and snum fields as the Orders table, and the same cnum and city fields as the Customers table, so that each customer’s order will be entered into this table along with his or her city. Onum will be the primary key of Cityorders. All of the fields in Cityorders will be constrained to match the Customers and Orders tables. Assume the parent keys in these tables already have the proper constraints.

ans: **CREATE TABLE Cityorders (**

&#x20;   **onum INT PRIMARY KEY,**

&#x20;   **amt DECIMAL,**

&#x20;   **snum INT,**

&#x20;   **cnum INT,**

&#x20;   **city VARCHAR(50),**

&#x20;   **FOREIGN KEY (onum) REFERENCES Orders(onum),**

&#x20;   **FOREIGN KEY (cnum) REFERENCES Customers(cnum));**



2\) Redefine the Orders table as follows:- add a new column called prev, which will identify, for each order, the onum of the previous order for that current customer. Implement this with a foreign key referring to the Orders table itself. The foreign key should refer as well to the cnum of the customer, providing a definite enforced link between the current order and the one referenced.

ans: **ALTER TABLE Orders**

&#x09;**ADD prev INT,**

&#x09;**ADD FOREIGN KEY (prev) REFERENCES Orders(onum);**







#### ***Assignment no.19 :***



Views.

1\) Create a view that shows all of the customers who have the highest ratings.

ans: **CREATE VIEW HighRating AS**

&#x09;**SELECT \* FROM Customers**

&#x09;**WHERE rating = (SELECT MAX(rating)**

&#x09;**FROM Customers);**



2\) Create a view that shows the number of salespeople in each city.

ans: **CREATE VIEW CitySalespeople AS**

&#x09;**SELECT city, COUNT(\*)**

&#x09;**FROM Salespeople GROUP BY city;**



3\) Create a view that shows the average and total orders for each salesperson after his or her name. Assume all names are unique.

ans: **CREATE VIEW SalesStats AS**

&#x09;**SELECT sname, AVG(amt), SUM(amt)**

&#x09;**FROM Orders JOIN Salespeople USING(snum)**

&#x09;**GROUP BY sname;**



4\) Create a view that shows each salesperson with multiple customers.

ans: **CREATE VIEW MultiCust AS**

&#x09;**SELECT snum**

&#x09;**FROM Customers**

&#x09;**GROUP BY snum**

&#x09;**HAVING COUNT(\*) > 1;**









#### ***Assignment no.20 :***



Changing Values through Views.

1\) Which of these views are updateable (will allow DML operations)?

\#1. Create View Dailyorders

as Select Distinct cnum, snum, onum, odate from Orders;

\#2. Create View Custotals

as Select cname, Sum (amt) Sum\_Amt from Orders, Customers

where Orders.cnum=Customers.cnum

Group by cname;

\#3. Create view Thirdorders

as Select \* from Dailyorders  where

odate=’1990-10-03’;

\#4. Create view Nullcities

as Select snum, sname, city

from Salespeople

where city is NULL

OR sname BETWEEN ‘A’ and ‘MZ’;

ans: **SELECT snum, sname, city**

&#x09;**FROM Salespeople;**



2\) Create a view of the Salespeople table called Commissions. This view will include only the snum and comm fields. Through this view, someone could enter or change commissions, but only to values between .10 and .20.

ans: **CREATE VIEW Commissions AS**

&#x09;**SELECT snum, comm**

&#x09;**FROM Salespeople**

&#x09;**WHERE comm BETWEEN 0.10 AND 0.20**

&#x09;**WITH CHECK OPTION;**



3\) Some SQL implementations have a built-in constant representing the current date, sometimes called “CURDATE” or “SYSDATE”.  The word SYSDATE can

therefore be used in a SQL statement, and be replaced by the current date when the value is accessed by commands such as Select or Insert. We will use a view of the Orders table called Entryorders to insert rows into the Orders table. Create the Orders table, so that SYSDATE is automatically inserted for odate if no value is given. Then create the Entryorders view so that no values can be given.

ans: Create Orders table with SYSDATE

&#x09;**CREATE TABLE Orders (**

&#x09;**onum INT PRIMARY KEY,**

&#x09;**amt DECIMAL,**

&#x09;**odate DATE DEFAULT SYSDATE,**

&#x09;**cnum INT,snum INT);**



Create Entryorders view











#### ***Assignment no.21 :***



**Grant and Revoke.**

1\) Give Amit the right to change the ratings of the customers.

ans: **GRANT UPDATE (rating) ON Customers TO Amit;**



2\) Give Manoj the right to give other users the right to query the Orders table.

ans: **GRANT SELECT ON Orders TO Manoj WITH GRANT OPTION;**



3\) Take the INSERT privilege on Salespeople away from Ajita.

ans: **REVOKE INSERT ON Salespeople FROM Ajita;**



4\) Grant Abhijeet the right to insert or update the Customers table while keeping her possible rating values in the range of 100 to 500.

ans: **GRANT INSERT, UPDATE ON Customers TO Abhijeet;**



5\) Allow Vikram to query the Customers table, but restrict his access to those

customers whose rating is the lowest.

ans: **GRANT SELECT ON Customers TO Vikram**

&#x09;**WHERE rating = (SELECT MIN(rating)**

&#x09;**FROM Customers);**

