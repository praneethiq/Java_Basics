Enhancement of adding consonants to a given string and checking if the string is valid:

Working principle :

1) The input string is taken and converted to a character array.
2) Next a consonant is added one by one in between each character using a nested "for loop" to loop through all the consonants and the whole string.
3) Each string combination is passed to a checkDictionary method which will check if the string is valid or not.
4) Only if all the words in a string are found in the given dictionary file, the string is printed out. 


Variation to actual program :

1) The actual program also takes the input string and converts it into a character array.
2) But in the actual program, we remove each consonant by consonant and check if the string is valid or not.
3) Here, we add consonants at each position and check if string is valid or not.
4) The checkDictionary method is the same and is reused from the original program as in both cases it checks if an input string is valid or not.

Compiling :

For compiling the program : go into CS5001-p1-lostconsonants/src directory and execute " javac AddConsonants.java " command.

Running :

For running the program after compiling just execute " java AddConsonants words "<input string>" ". Replace <input string> with choice of your input string.
For example : java AddConsonants words "baring dogs".


