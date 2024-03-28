


document.addEventListener('DOMContentLoaded', function () {
    const chatbox = document.getElementById('chatbox');
    const userInput = document.getElementById('userInput');
    const sendBtn = document.getElementById('sendBtn');

    // Replace with your WebSocket server URL
    const ws = new WebSocket("ws://" + window.location.host + "/chatbot");

    ws.onopen = function () {
        console.log('Connected to the chat server');
    };

    ws.onmessage = function (event) {
        const message = JSON.parse(event.data);
        displayMessage('Strabone', message.text);
    };

    sendBtn.addEventListener('click', function () {
        const message = userInput.value.trim();
        if (message) {
            displayMessage('Adso', message);
            ws.send(JSON.stringify({ text: message }));
            userInput.value = ''; // Clear input field
        }
    });

    function displayMessage(sender, message) {
        const messageElement = document.createElement('div');
        messageElement.innerHTML = `<b>${sender}:</b> ${message}`;
        chatbox.appendChild(messageElement);
        chatbox.scrollTop = chatbox.scrollHeight; // Scroll to the bottom
    }
});