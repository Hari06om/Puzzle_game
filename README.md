# 🧩 Puzzle Game

A classic 8-puzzle sliding game implemented in Java using Swing. Test your problem-solving skills by arranging numbered tiles in order!

## 📋 Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Requirements](#requirements)
- [Installation](#installation)
- [How to Play](#how-to-play)
- [Game Rules](#game-rules)
- [Code Structure](#code-structure)
- [Screenshots](#screenshots)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)

## 🎯 Overview

This is a Java implementation of the classic 8-puzzle game, also known as the sliding puzzle. The objective is to arrange numbered tiles (1-8) in sequential order by sliding them into the empty space. The game tracks your moves and time, challenging you to solve the puzzle as efficiently as possible.

## ✨ Features

- **Interactive GUI**: Clean and intuitive Swing-based interface
- **Move Counter**: Tracks the number of moves made
- **Timer**: Records how long it takes to solve the puzzle
- **Shuffle Function**: Randomizes the puzzle for a new challenge
- **Win Condition**: Celebrates completion with move and time statistics
- **Responsive Design**: Easy-to-click buttons with clear numbering

## 🔧 Requirements

- **Java Development Kit (JDK)**: Version 8 or higher
- **Operating System**: Windows, macOS, or Linux
- **Memory**: Minimal system requirements (< 50MB RAM)

## 🚀 Installation

1. **Clone or Download**: Save the `PuzzleGame.java` file to your local machine

2. **Compile the Game**:
   ```bash
   javac PuzzleGame.java
   ```

3. **Run the Game**:
   ```bash
   java PuzzleGame
   ```

Alternatively, you can use an IDE like IntelliJ IDEA, Eclipse, or NetBeans:
- Import the Java file into your IDE
- Compile and run the `PuzzleGame` class

## 🎮 How to Play

1. **Launch the Game**: Run the compiled Java program
2. **Observe the Puzzle**: You'll see a 3×3 grid with numbers 1-8 and one empty space
3. **Make Moves**: Click on tiles adjacent to the empty space to slide them
4. **Track Progress**: Monitor your moves and time in the top panel
5. **Shuffle**: Click the "Shuffle" button to start a new random puzzle
6. **Win**: Arrange tiles in order (1-8) with the empty space in the bottom-right

## 📖 Game Rules

- **Valid Moves**: Only tiles directly adjacent (up, down, left, right) to the empty space can be moved
- **No Diagonal Moves**: Tiles cannot move diagonally
- **Winning Configuration**: 
  ```
  1 2 3
  4 5 6
  7 8 [ ]
  ```
- **Automatic Detection**: The game automatically detects when you've won

## 🏗️ Code Structure

### Main Components

- **`PuzzleGame` Class**: Main game class extending JFrame
- **GUI Components**:
  - `JButton[] buttons`: 9 buttons representing the puzzle grid
  - `JLabel moveLabel`: Displays move count
  - `JLabel timerLabel`: Shows elapsed time
  - `JButton shuffleButton`: Restarts the game

### Key Methods

- **`shuffle()`**: Randomizes the puzzle layout
- **`actionPerformed()`**: Handles tile clicks and moves
- **`isAdjacent()`**: Checks if two positions are adjacent
- **`isSolved()`**: Determines if the puzzle is completed
- **`restartGame()`**: Resets the game state

### Game Logic Flow

1. Initialize 3×3 grid with shuffled numbers
2. Listen for button clicks
3. Validate moves (adjacent to empty space)
4. Update display and counters
5. Check for win condition
6. Display victory message

## 🖼️ Screenshots

The game features:
- A clean 3×3 grid layout
- Large, bold numbers for easy visibility
- Real-time move and timer tracking
- One-click shuffle functionality

## 🔮 Future Enhancements

Potential improvements for the game:

- **Difficulty Levels**: Different grid sizes (4×4, 5×5)
- **High Score System**: Save best times and move counts
- **Hint System**: Suggest optimal moves
- **Animation**: Smooth tile sliding transitions
- **Themes**: Different visual themes and colors
- **Sound Effects**: Audio feedback for moves and wins
- **Solvability Check**: Ensure puzzles are always solvable
- **Step Counter**: Show solution in minimum steps
- **Pause/Resume**: Ability to pause the timer

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork the Repository**: Create your own copy
2. **Make Improvements**: Add features or fix bugs
3. **Test Thoroughly**: Ensure your changes work correctly
4. **Submit Changes**: Create a pull request with your improvements

### Contribution Ideas
- Add new features from the enhancement list
- Improve code documentation
- Optimize performance
- Enhance user interface
- Add unit tests

## 📄 License

This project is open source and available under the MIT License. Feel free to use, modify, and distribute as needed.

---

## 🎯 Quick Start Guide

**Want to play immediately?**

```bash
# Copy the Java file
# Open terminal/command prompt
javac PuzzleGame.java
java PuzzleGame
# Start sliding those tiles! 🧩
```

**Enjoy the puzzle and challenge yourself to solve it in the fewest moves possible!** 🏆
