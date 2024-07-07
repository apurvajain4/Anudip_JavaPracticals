document.addEventListener('DOMContentLoaded', () => {
    // JSON object containing user information
    const user = {
        name: "John Doe",
        age: 25,
        email: "john.doe@example.com"
    };

    // Function to create and append user details to the HTML
    function displayUserInfo(user) {
        const userDetailsDiv = document.getElementById('user-details');
        
        const nameElement = document.createElement('p');
        nameElement.textContent = `Name: ${user.name}`;
        userDetailsDiv.appendChild(nameElement);
        
        const ageElement = document.createElement('p');
        ageElement.textContent = `Age: ${user.age}`;
        userDetailsDiv.appendChild(ageElement);
        
        const emailElement = document.createElement('p');
        emailElement.textContent = `Email: ${user.email}`;
        userDetailsDiv.appendChild(emailElement);
    }

    // Call the function to display user info
    displayUserInfo(user);
});
