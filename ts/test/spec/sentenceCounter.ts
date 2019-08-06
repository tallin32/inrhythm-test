import { SentenceStats, stats } from "../../src/sentenceCounter";
import { expect } from "chai";
// Import the test data
const cases = require('../data/sentences.json');
describe("Expected positive test cases", () => {
    cases.normalSentences.forEach(sentence => {
        it(`should return "${sentence.longestWord}", length ${sentence.length}, for sentence "${sentence.sentence}"`, () => {
            let actual = stats(sentence.sentence);
            expect(actual.length).to.equal(sentence.length);
            expect(actual.longestWord).to.equal(sentence.longestWord);
        })
    })
});
describe("Corner cases", () => {
    cases.cornerCases.forEach(cornerCase => {
        it(cornerCase.title, () => {
            const actual = stats(cornerCase.sentence);
            expect(actual.longestWord).to.equal(cornerCase.longestWord);
            expect(actual.length).to.equal(cornerCase.length);
        })
    })
})