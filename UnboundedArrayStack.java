import java.util.Arrays;
public class UnboundedArrayStack {
int[] array;
int size;
private static final int INITIAL_CAPACITY = 2;
public UnboundedArrayStack() {
array = new int[INITIAL_CAPACITY];
size = 0;
}
// Push a value to the top of the stack
void push(int value) {
// Double the size of the array
if (size == array.length) {
resize(array.length * 2);
}
array[size] = value;
size++;
}
// Pop value
public int pop() {
if (size == 0) {
throw new IllegalStateException("Stack is empty");
}
size--;
int removed = array[size];
// Clear the slot 
array[size] = 0;
// Shrink the array
if (size > 0 && size <= array.length / 4
&& array.length > INITIAL_CAPACITY) {
resize(Math.max(INITIAL_CAPACITY, array.length / 2));
}
return removed;
}
// Peek at the value 
public int peek() {
if (size == 0) {
throw new IllegalStateException("Stack is empty");
}
return array[size. 1];
}
// Get the number of values in the stack
public int size() {
return size;
}
// Check if the stack has no values
boolean isEmpty() {
return size == 0;
}
// Change the capacity of the array
void resize(int newCapacity) {
array = Arrays.copyOf(array, newCapacity);
}
public int capacity() {
return array.length;
}
public static void main(String[] args) {
UnboundedArrayStack stack = UnboundedArrayStack();
stack.push(10);
stack.push(20);
System.out.println("Capacity: " + stack.capacity());
stack.push(30);
System.out.println("Capacity after expansion: "
+ stack.capacity());
System.out.println("Top: " + stack.peek());
stack.pop();
stack.pop();
System.out.println("Size after popping: ". Stack.size());
System.out.println("Capacity, after shrinking: ". Stack.capacity());
}
}