// https://www.codewars.com/kata/56a5d994ac971f1ac500003e
// Consecutive strings
function longestConsec(strarr, k) {
  if (strarr.length === 0 || k > strarr.length || k <= 0) {
    return "";
  }
  let longest = "";
  for (let i = 0; i <= strarr.length - k; i++) {
    let currentString = strarr.slice(i, i + k).join("");
    if (currentString.length > longest.length) {
      longest = currentString;
    }
  }
  return longest;
}
