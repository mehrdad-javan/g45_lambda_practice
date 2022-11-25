# Lambda Practice



### Java.util.function instructions:
First you create implementations inside DataStorageImpl. I “forgot” to remove one
implementation this might help you get started .  
After implementations are done you can do the following exercises from the Exercises class.  
You need to define the lambda expressions cleverly to succeed.  
1. -[ ] Find everyone that has firstName: “Erik” using findMany().
2. -[ ] Find all females in the collection using findMany().
3. -[ ] Find all who are born after (and including) 2000-01-01 using findMany().
4. -[ ] Find the Person that has an id of 123 using findOne().
5. -[ ] Find the Person that has an id of 456 and convert to String with following content:
   “Name: Nisse Nilsson born 1999-09-09”. Use findOneAndMapToString().
6. -[ ] Find all male people whose names start with “E” and convert each to a String using
   findManyAndMapEachToString().
7. -[ ] Find all people who are below age of 10 and convert them to a String like this:
   “Olle Svensson 9 years”. Use findManyAndMapEachToString() method.
8. -[ ] Using findAndDo() print out all people with firstName “Ulf”.
9. -[ ] Using findAndDo() print out everyone who have their lastName contain their firstName.
10. -[ ] Using findAndDo() print out the firstName and lastName of everyone whose firstName is a
    palindrome.
11. -[ ] Using findAndSort() find everyone whose firstName starts with A sorted by birthdate.
12. -[ ] Using findAndSort() find everyone born before 1950 sorted reversed by lastest to earliest.
13. -[ ] Using findAndSort() find everyone sorted in following order: lastName > firstName >
    birthdate.