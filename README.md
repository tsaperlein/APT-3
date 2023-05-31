# Advanced Programming Techniques ex3
## Small program where someone via an HTTP POST message sends a small text and it is published via MQTT

To see the result of the program do the following:
- Run the application (from Eclipse).
- Run this command from VSCode in the folder of the repo (sudo docker build -t examplerest .).
- Run (sudo docker images) to see that you added successfully the image to the docker.
- Then open Docker Desktop and search for running containers.
- Run this command (sudo docker run -d -p 9090:8880 examplerest).
- Type in your browser (http://localhost:8880/swagger-ui/) and (http://localhost:9090/swagger-ui/) and psot a message
- See the results in Eclipse and Docker respectively.
