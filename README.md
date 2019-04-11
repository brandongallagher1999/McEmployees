![](https://github.com/brandongallagher1999/McEmployees/blob/master/src/2345.gif) 

                                                                                Version: Release v1.0

## Github project URL
https://github.com/brandongallagher1999/McEmployees


## Contributors
1. **John Nemec**
  - Roles: GUI, EmployeeIntegration, Project Planning
  - Email: john.nemec@uoit.net
  - [Github Profile](https://github.com/ZanCal)

2. **Brandon Gallagher**
  - Roles: Back-End and Database
  - Email: brandon.gallagher@uoit.net
  - [Github Profile](https://github.com/brandongallagher1999)

3. **Minh Huynh** 
  - Roles: GUI and Calendar Integration
  - Email: huynh.minh@uoit.net
  - [Github Profile](https://github.com/QuangMinhHuynh)

## Description
- Uses database and GUI to create an employee/buisiness management software.


## How to run
- No extra libraries or programs required
- Use gradle file to compile classes
- Go to root directory and do: **gradle compile**
- The login credentials are 'admin' and 'password'


### Side Notes
- The program connects to a remote PostgreSQL database that runs 24/7 so that can be used for database entry.
- Change the String URL line in database.java to connect to a seperate database.

PostgreSQL is used to create the database and hold employee records

Due to the nature of the database, having the github repository be public lends itself to **security issues for 
both the database and the computer that the database is running on**. UPDATE: These security issues have been fixed and is available for cloning and integration.

Several features of the initial version of the software are paritally implemented. While they aren't at full functionality,
enough time was put into them that they are worth including. These include the following
- the Import Employee button on the employee managment main screen
- Selecting staff members to place on shifts from the Selected Staff Per day popup from the Calendar Menu
- the Forgot Password option on the login screen

There are several known bugs or issues with the current build of the software that are currently known about. They will be fixed
at a later date.
- Adding, editing, and deleting employees require the user to go to the main menu and then back to the employee managment menu for changes to appear
- Editing two employees without returning to the main menu will cause an index out of range error 
- the Login button on the login screen requires a mouse click 
- the window title does not always change with the current window
