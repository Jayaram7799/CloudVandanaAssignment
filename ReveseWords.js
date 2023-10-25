function reverseWords(sentence) {
  let reversedSentence = "";
  let word = "";

  for (let i = 0; i < sentence.length; i++) {
    if (sentence[i] !== " ") {
      word += sentence[i];
    } else {
      for (let j = word.length - 1; j >= 0; j--) {
        reversedSentence += word[j];
      }
      reversedSentence += " ";
      word = "";
    }

    if (i === sentence.length - 1) {
      for (let j = word.length - 1; j >= 0; j--) {
        reversedSentence += word[j];
      }
    }
  }

  return reversedSentence;
}

// Example usage
let inputSentence = "Hello world";
let reversedResult = reverseWords(inputSentence);
console.log(reversedResult); // Output: "olleH dlrow"
