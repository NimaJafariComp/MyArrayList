# MyArrayList Java Project

Welcome to the MyArrayList Java Project, a dynamic and user-friendly array list implementation in Java that simplifies list management and manipulation. This project provides an intuitive interface for handling arrays with enhanced functionality, making it an excellent addition to your Java projects.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Methods](#methods)
- [Contributing](#contributing)
- [License](#license)


## Usage

You can use the MyArrayList class in your Java projects by including it in your codebase. Here's a simple example:

```java


public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();

        // Add items to the list
        myList.add(1);
        myList.add(2);
        myList.add(3);

        // Check if the list contains an item
        System.out.println("Contains 2: " + myList.contains(2));

        // Remove an item from the list
        myList.remove(1);

        // Get the size of the list
        System.out.println("Size of the list: " + myList.size());
    }
}
```

## Methods

- `clear()`: Clears the list.
- `isEmpty()`: Checks if the list is empty.
- `size()`: Returns the size of the list.
- `add(E item)`: Adds an item to the list.
- `contains(E key)`: Checks if the list contains a specified item.
- `get(int index)`: Returns the item at the specified index.
- `remove(int index)`: Removes the item at the specified index.
- `remove(Object obj)`: Removes the specified object from the list.

## Contributing

If you have any ideas for improvements or new features, feel free to contribute! Fork the repository, make your changes, and submit a pull request. Your input is highly appreciated.

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute it as needed.
