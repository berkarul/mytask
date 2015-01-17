	***** NUMBER PRINTER *****

What is Number Printer ?
    Number Printer is a simple Java Application. 
    Its used to convert number to words and number to roman letters.
---------------------------------------

Scope: 
    1. Convert Numbers to Words
    2. Convert Numbers to Roman Letters
    3. Numbers Range 1-3999

Requirement:
    1. Get two inputs from user
       - First Parameter is a ordinary number between 1-3999
       - Second Parameter is Format[WORDS or ROMAN]
    2. Validate the inputs
    3. Convert number to words or roman based on inputs
    4. User can continue to convert numbers 'n' no of times and exit from system if they want.
    5. Needs to create JUNIT class for chacking each functionalities.

Design:
    1. NumberToRoman.java util class is for converting Number to Roman Letters
    2. NumberToWords.java util class is for converting Number to English Words   
    3. NumberPrinter.java class is used to get two inputs and validate them. Then it will call either NumberToRoman or 
       NumberToWords class methods based on input format
    4. Converted Words or Roman Letter display to user.
    5. TestNUmberPrinter.java, TestNumberToRoman.java and TestNumberToWords.java JUNIT classes are used to 
       test all scenarios in requirement.
    
Advantages and Techniques:
    - Crated Utility classes for convertion code reusablity and avoid duplication.
    - Creted JUNIT classes for all classes. Its very easy to test the functionalities.
    - Followed code standard throughout application.
    - Proper comments and namespase followed, so other developers can easily understand the code and modify.

================================
How to Test this Application ?
   - Run the JUNIT classes to test. Scenarios covered in JUNIT classes.
   - Run the NumberPrinter.java class and follow the test steps

Note: <=== denotes user inputs
In Eclipse - Console

*** Welcome to Number Printer ***
Please follow the instructions
Enter a number between 1 and 3999 & Enter Format WORDS or ROMAN
Please Enter 'EXIT' to Exit 
Please Enter Number (1-3999)
9 <===
Please Enter Format (WORDS or ROMAN)
Roman <===
9's Roman Letter is  "IX"
Please Enter Number (1-3999)
3500 <===
Please Enter Format (WORDS or ROMAN)
words <===
3500's English Word is  "Three Thousand Five Hundred "
Please Enter Number (1-3999)
exit
Thank You...


   
   