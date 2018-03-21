1. javac cs5530/*.java
2. In windows system: java -cp "./mysql.jar;." cs5530.TestDriver
   In Linux/Unix system: java -cp ./mysql.jar:. cs5530.TestDriver
3. Or you can use an IDE (such as Ecilipse). Remeber to add mysql.jar as an external jar to your project's Java build/library path.


You will have to specify the hostname of the server, username, password, 
and database name when prompted in order to use the program.  There is
no credential validation, so if you make an error you will have to restart.
You can test various connectivity with TestConnection (on UofU network) or
TestConnection2 (ssh into server).  Replace TestDriver above with the name
of program you wish to run.
