# Quaternary Calculator Group 9

## Project Overview
This project is a calculator designed to perform arithmetic operations on quaternary (base-4) numbers. The calculator supports addition, subtraction, multiplication, and division of quaternary numbers. It also allows users to toggle the display between quaternary and decimal (base-10) number systems.

## Features
- **Basic Arithmetic Operations:** Supports addition, subtraction, multiplication, and division of quaternary numbers.
- **Dual Display:** Toggle between quaternary and decimal representations of numbers.
- **User-Friendly Interface:** Designed to resemble a traditional calculator with only four number buttons (0, 1, 2, 3).
- **Separate UI and Logic:** Clean separation between the user interface and the business logic, allowing for maintenance and testing.

## Installation
### Prerequisites
- **Java Development Kit (JDK) 21 or higher**
- **IntelliJ IDEA**

### Setup Instructions
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/quaternary-calculator.git
   cd quaternary-calculator
   ```

2. **Open in IntelliJ:**
    - Open IntelliJ.
    - Select **Open** and navigate to the cloned repository.
    - IntelliJ will automatically detect and import the project.

3. **Build the Project:**
    - Ensure that the correct JDK (21) is configured.
    - Build the project using the Build menu or by pressing `Ctrl+F9`.

4. **Run the Application:**
    - Use the `Run` option in IntelliJ IDEA to start the calculator.

## Usage
### Basic Operations
1. **Enter a Quaternary Number:** Click on the digits (0, 1, 2, 3) to form a quaternary number.
2. **Select an Operation:** Click on one of the operation buttons (+, -, *, /).
3. **Enter the Second Number:** Enter another quaternary number.
4. **View the Result:** Press the `=` button to display the result.
5. **Toggle Display Mode:** Use the toggle button to switch between quaternary and decimal views.

### Example
- **Operation:** 12 (quaternary) + 21 (quaternary)
- **Result:** The result in quaternary is `33`, which equals `15` in decimal.

## Project Structure
- `.gitignore`: Specifies files and directories to be ignored by Git.
- `README.md`: This documentation file.
<!-- add additional information such as 
src/test/operationTests: Contains unit tests for the project. 
once structure is determined continue to update-->

## Team Members and Contributions
- **Jake King**: Set up the project structure and handled Git integration.
- **Tia Self**: Developed UI.
- **Dennis Vo**: Developed Logic and Testing for Square Root/Square.
- **Spencer Smith**: Developed Logic and Testing for Multiplication/Division.
- **Solomon Siang**: Developed Logic and Testing for Addition/Subtraction.

## Meetings and Discussions
## Meeting 1: 8/30/2024 5:00 PM
- **Medium:** Slack Call
- **Attendees:** Spencer Smith, Solomon Siang, Dennis Vo, Jake King
- **Discussion:** Initial project setup and task distribution
## Meeting 2: 9/3/2024 12:00 PM
- **Medium:** In-person 
- **Attendees:** Spencer Smith, Solomon Siang, Dennis Vo
- **Discussion:** Discussed the Calculator Class and what was needed before starting the UI. 
<!-- Format for adding meetings below:

## Meeting 1: [Date and Time]
- **Attendees:** [Names of attendees]
- **Medium:** [e.g., Zoom, Slack, in-person]
- **Discussion:** Initial project setup, task distribution, and timelines.

-->

## Testing
- The project includes unit tests for the QuaternaryOperations.
- Run the tests using the built-in testing tools in IntelliJ IDEA.
- Ensure all tests pass before committing to the repository.

## Dependencies
- The project uses standard Java libraries. 
- JUnit5.8.1, opentest4j-1.2.0.jar, apiguardian-api-1.1.2.jar for testing
<!-- update this with other dependencies if needed-->

## Screenshots
<!-- add screenshots here --> 


