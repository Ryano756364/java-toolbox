# Collections Notes

- No third party API required when working with collections
- No need to create API from handling collection objects
- Collections framework is tested and optimized

List Types
- ArrayList (speed efficient)
  - Fast and easy to access any element from any location
  - Operations are slow and tends to use more memory 
  - Java needs to create new ArrayList if an element is removed
- LinkedList (memory efficient)
  - Starts with address of first node
  - then goes to address of second node
  - each node contains address of next node
  - if node #2 is broken, 
    - node #1 will need address of node #3
  - if new node is inserted
    - need to add address of this new node to the previous...
    - and need address of next node of where to point to, unless last node is being inserted
      - then it points to NULL and this is known as the tail
- Stack
  - Think of stack of books
  - LIFO list
  - operations are performed on the top first
  - empty, peek, pop, push, search (returns position)
  - extends vector class
- Vector (very rarely used)
  - synchronized where ArrayList is not
