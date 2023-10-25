function bubbleSortAscending(arr) {
  const n = arr.length;

  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        // Swap elements if they are in the wrong order
        let temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }

  return arr;
}

// Example usage
let unsortedArray = [3, 2, 1, 4];
let sortedArray = bubbleSortAscending(unsortedArray);
console.log(sortedArray); // Output: [1, 2, 3, 4]
