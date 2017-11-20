Task 1: Due 11/12
1) Modify the Firm program such that it expands its use of polymorphism by using an interface called Payable.  You will move pay method from StaffMember into Payable.

Task 2: DUE 11/17 KL Done! Please look over in kedit branch and merge to master if specifications are met.
2) Modify Firm such that all employees can be given different vacation options depending on their classification. Provide an abstract method in StaffMember called vacation that returns the number of vacation days a person has.  Give all Employees a standard number of vacation days (14) using a constant STANDARD_VACATION. 

a) Then override the vacation method in the various Employee classes as follows:
- Employee: STANDARD_VACATION
- Hourly: STANDARD_VACATION - 7 
- Executive: STANDARD_VACATION + extraVacation
    NOTE: You will need to add extraVacation as instance variable to Executive and pass
    it in as an argument to the constructor.
- Volunteer (who are not Employees): 0
b)  Call vacation method inside the loop already used by payday method so we see each StaffMembers vacation days.

Task 3: DUE 11/22 LZ DONE!
3) Rewrite the Sorting class so that both sorting algorithms put the values in descending order.  

4)  Sort the array of StaffMembers based on name using the updated selection OR insertion sort from Sorting.java. Put the sort method in the class that has direct access to the array. Then call the sort in main before calling payday           

Testing: DUE 11/25
Zipped and submitted 11/27
