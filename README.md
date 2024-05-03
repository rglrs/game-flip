# Flip Flop Memory Game

## Objective
The Flip Flop Memory Game is a desktop application developed in Java, designed to test and improve players' memory skills by finding matching pairs of cards. This project utilizes Java Swing for the graphical user interface (GUI) and incorporates multi-threading, file handling, and database functionality.

## Features
- **Graphical User Interface (GUI)**: The game presents a grid of cards/tiles, initially facedown, with distinct designs or images on their faces. It includes a score or timer display to track the player's progress.
- **Game Logic**: 
  - The game consists of a set of cards/tiles with matching pairs, which are randomly shuffled before the game starts.
  - Players can flip cards/tiles to reveal their faces.
  - The game logic checks if the two flipped cards/tiles match and keeps them face up if they do, allowing the player to continue their turn.
  - If the cards/tiles do not match, they are flipped back face down after a short delay.
  - The game tracks the player's score or time taken to complete the game.
- **Multi-Threading**: Multi-threading is implemented in a suitable module to enhance performance.
- **File Handling**: 
  - scores.txt file maintains scores of all users using file handling.
- **Database Integration**: 
  - The application supports login/signup functionality using MS Access database.
- **Error Handling**: The application handles unexpected errors or exceptions gracefully.

## Getting Started
1. Clone the repository: `git clone https://github.com/your-username/flip-flop-memory-game.git`
2. Open the project in your preferred Java IDE (e.g., NetBeans, IntelliJ IDEA).
3. Set up the required database (e.g., MySQL) and configure database connection details.
4. Ensure necessary dependencies are installed.
5. Compile and run the project.

## Usage
1. Launch the application.
2. Sign up or login to start playing the game.
3. Click on cards/tiles to flip them and find matching pairs.
4. Track your progress with the score or timer display.
5. Try to complete the game in the shortest time or with the highest score.


## Author
Nouman Yousaf
