
# Mini-Project
Putting into practice the programming knowledge acquired through the first module of the Fundamentals of Programming II course.

This is a sample readme file for describing our application's code. 

## Features

- Convert Morse Code to English;
- Convert English to Morse Code;

## What were used

To deploy this project run, were used:

```bash
  Arrays ( char[] letters; String[] morseletters);

  for and if statements(for translating the text to morse code and vice versa)
```

## What methods were used?

The methods used for conducting this code are:

```bash
    nextLine() - to insert a sentence;
    toLowerCases() - every String variable is in lower cases;
    charAt() - returns the character at the specified index in a string;
    split() - breaks a given string around matches of the given regular expression;
    equals() - compares the two given strings;
```
## Explanation of the codes

1- Converting English to Morse Code

```javascript
for (int i = 0; i < textToChange.length(); i++) {
			for (short j = 0; j < letters.length; j++) {
				if (textToChange.charAt(i) == letters[j]) {
					newText += morseLetters[j];
					if (letters[j] != ' ')
						newText += " ";
					break;
```

* if the value at i index of the text that we want to change is equal with the value at j index,
    the text will be incremented by the value of morse letters at j index;
* if the value of letters in letters[] array at index j is different form " ",
    the text will be incremented by "   ";



2- Converting Morse Code to English

```javascript
for (int i = 0; i < codeToChange.length(); i++) {
			for (short j = 0; j < morseLetters.length; j++) {
				if (codeToChange.compareTo(morseLetters[j]) == 0) {
					newCode += letters[i];
					newCode += ' ';
				    break;
```
* if the code that we are inserting is the same as the value at index j from morseLetters array,
    the code will be incremented by the values at i index from letters array;
    
* if value of code at i index equals "", the decoded text will increment by " ";

## Worked By

* Flavio Xhelili
* Timela Vogli
* Keiti Cela
