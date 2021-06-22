# MCA_JavaProgrammig
**READ INSTRUCTIONS CAREFULLY**
1- Your Program folder should be your_name-universityroll number for example:- arjunsharma-1234567
2- You have to upload only your program folder. Separate files will not be considered and will be marked absent.
3- Your program-folder should contain three files for each question 
                                                  a- PDF file of hand written program
                                                  b- .java file
                                                  c- screen shot (of whole screen).
                                                  
 Q1. Write a java program to, create three files one.txt, two.txt and three.txt  (FileWriter class)
    1. Write 5 lines in one.txt using PrintWriter class
    2. Write 5 lines in two.txt using PrintWriter class
    3. Write the content into three.txt in the following manner.
       Read one line from one.txt and write into three.txt
       Read one line from two.txt and write into three.txt 
       Repeat the above steps till the content is available in both files
    4. Print the contents of all three files.
    
    
Q2. Create an abstract class called "Person" with a member varaible person_name (String), id(int).
    abstract void setDetails(String name, int id,double salary, int joining_year).
    Define parameterized constructor to initialize the instance variable of Person.

    Create a subclass "Employee" that will inherit "Person" class. The other members of the
    Employee class are salary(double), joining_year(int).
    parameterized constructor to initialize the instance variable of Employee.
   
    Define following methods in Employee class.
   
    void setDetails(String name, int id,double salary, int joining_year):-
                - This method will take the values from main() method.
                - Initialize the instance variable with these values before checking following condition
                          1. id should be greater then zero if user entered 0 for id then throw user define exception "invalid id".
                          2. salary shpuld be greater then 1000 and less then 4000 otherwise throw user define exception "Invalid salary"
                          3. joining year should be "four digit value" and should be greater then 1994 and less then 2021 otherwise
                             throw user define exception "Invalid year of joining"
     void updateSalary(int years):-
                  - This method will calculate the updated salary.
                  - if number of years are greater then 3 update salart by incrementing with 5% of previous salary.
                  - if number of years are greater then 5 update salart by incrementing with 9% of previous salary.
                  - if number of years are greater then 10 update salart by incrementing with 15% of previous salary .
                                          
      Create EmployeeMain containg a main method and fully test your class definations. 
      
      Note:-In this program you have to create three more classes "InvlaidID", "InvalidSalary", "InvalidJoin", 
    all three classes will inherit Exception class. (For user define Exceptions) 

