# Fantasy Football Team Manager System

## Description

This project implements a Fantasy Football Team Manager System, designed to help users manage their fantasy football teams efficiently. The system allows users to add, remove, compare players, and view detailed team statistics.

## Functionality Overview

1. **User Interaction**:
   - Users are prompted to enter their username and team name upon launching the application.

2. **Main Menu**:
   - The system presents a main menu with options to Add Player, Remove Player, Show Details, Compare Players, and Exit Application.

3. **Adding Players**:
   - Players can be added based on their position: Forward, Midfielder, Defender, or Goalkeeper. Each position has specific attributes affecting player points.

4. **Removing Players**:
   - Users can remove players from their team by selecting the player's serial number.

5. **Showing Team Details**:
   - Comprehensive details including team name, manager name, total fantasy points, and individual player details are displayed.

6. **Comparing Players**:
   - Users can compare two players based on their serial numbers to determine the better player.

7. **Exiting the Application**:
   - Users can exit the application with a farewell message displayed.

## Key Components and Classes

- **FantasyFootballTeamManager**: Main class handling user input and managing system functionality.
- **Entity**: Abstract class defining common player attributes and methods.
- **Player**: Abstract class extending Entity, implementing generic player methods.
- **Forward, Midfielder, Defender, Goalkeeper**: Concrete classes implementing specific player positions.

## Usage

To run the application:
1. Compile all Java files.
2. Run `FantasyFootballTeamManager.java`.

## Requirements

- Java Development Kit (JDK) 8 or higher

## Authors

- Mohammed Tayeb

