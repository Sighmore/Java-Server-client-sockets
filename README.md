Java Server-Client Communication

This project demonstrates a simple client-server communication using Java. The server listens for incoming connections and responds to client requests. The client connects to the server and sends messages.
Features
Server listens for incoming connections on a specified port
Server handles multiple clients concurrently using threads
Server responds to client requests with a greeting message
Client connects to the server and sends messages
Client receives responses from the server

Prerequisites
Java Development Kit (JDK) installed
IDE or text editor for editing Java files (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code)

Getting Started

Clone the repository:
bash
git clone https://github.com/your-username/java-server-client.git

Open the project in your preferred IDE or text editor.
Locate the Server.java and Client.java files in the project directory.
Run the Server class to start the server. The server will listen for incoming connections on the specified port (default is 8080).
Run the Client class to start the client. The client will connect to the server and send a message.
The server will receive the client's message and respond with a greeting message.
The client will receive the server's response and display it.

Configuration
You can modify the following configurations in the Server and Client classes:
Server port number: Change the value of SERVER_PORT in the Server class to use a different port.
Server message: Modify the GREETING_MESSAGE in the Server class to change the server's response message.
Client message: Modify the MESSAGE in the Client class to change the message sent by the client.

Code Structure
Server.java: Implements the server functionality, including listening for incoming connections, handling client requests, and sending responses.
Client.java: Implements the client functionality, including connecting to the server, sending messages, and receiving responses.
ClientHandler.java: Handles the communication with individual clients on the server side, allowing concurrent handling of multiple clients.

Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.
