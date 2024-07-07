function calculateTax() {
    var income = document.getElementById('income').value;
    var tax = 0;

    if (income <= 300000) {
        tax = 0;
    } else if (income <= 600000) {
        tax = (income - 300000) * 0.05;
    } else if (income <= 900000) {
        tax = (300000 * 0.05) + (income - 600000) * 0.10;
    } else if (income <= 1200000) {
        tax = (300000 * 0.05) + (300000 * 0.10) + (income - 900000) * 0.15;
    } else if (income <= 1500000) {
        tax = (300000 * 0.05) + (300000 * 0.10) + (300000 * 0.15) + (income - 1200000) * 0.20;
    } else {
        tax = (300000 * 0.05) + (300000 * 0.10) + (300000 * 0.15) + (300000 * 0.20) + (income - 1500000) * 0.30;
    }

    alert(`The income tax of an income of ${income} is: ${tax}`);
}