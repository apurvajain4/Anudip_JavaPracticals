function checkNumber() {
    let number = prompt("Enter a number:");
    number = parseInt(number);

    if (isNaN(number)) {
        alert("Please enter a valid number.");
    } else if (number > 0) {
        alert("Positive number.");
    } else if (number < 0) {
        alert("Negative number.");
    } else {
        alert("Zero.");
    }
}
