# permutations-using-queue

# Program Features
**1. Queue Implementation:** <br>
   Accepts five elements from the user, enqueue them into a Queue, display the Queue, and dequeue two elements. Display the updated Queue after the dequeue operations.
   
**2. Permutations:** <br>
   Allows the user to specify the number of elements to arrange. Generate and display all possible permutations of the selected elements.
   
**3. Total Count:** <br>
   Displays the total number of permutations generated.

# Program Requirements
- Uses Java's Queue interface and LinkedList implementation.
- Uses Scanner for user input.
- Implements Queue operations such as add(), poll(), and isEmpty().
- Uses an appropriate algorithm (such as recursion or backtracking) to generate all possible arrangements.
- Displays all generated permutations and their total count.

# Expected Output Example
**Queue Implementation** <br>
`Enter five elements: A B C D E`
 
`Queue: [A, B, C, D, E]`
 
`Dequeuing two elements...`
`Updated Queue: [C, D, E]`

**Permutation Generation** <br>
`Enter number of elements to arrange: 3`
 
`Generated Permutations:` <br>
`CDE` <br>
`CED` <br>
`DCE` <br>
`DEC` <br>
`ECD` <br>
`EDC` <br>
 
`Total Permutations: 6`
