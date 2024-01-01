/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    var count = n;
    return function() {
        return count++;
    };
};