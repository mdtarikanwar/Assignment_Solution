// Taking the input from standar input source.
const readLine = require("readline");

const r = readLine.createInterface({
    input: process.stdin,
    output: process.stdout,
});

r.question("Enter your sentance: ", function(sentance) {
    var arraySentance = sentance.split(" ");
    arraySentance.forEach(function(word) {
        for(var i=word.length-1; i>=0; i--) {
            process.stdout.write(word[i]);
        }
        process.stdout.write(" ");
    })
    r.close();
});