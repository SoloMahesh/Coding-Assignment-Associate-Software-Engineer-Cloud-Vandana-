function reverseWordsInString(s) {

    const words = s.split(" ");
    const rW = words.map(word => { return word.split("").reverse().join("");});
    const revSen = rW.join(" ");
    
    return revSen;
  }
  
  const s = "This is a sunny day";
  const revSen = reverseWordsInString(s);
  console.log(revSen);