## How to execute:

### Clone the repository in a workspace: git clone https://github.com/apatrickrs/kaffa.git
### Open with the editor of your choice, wait for him to download the maven's dependencies and run the KaffaMainFrame.java class.

### * Rest API returns a JSON
	 * How it works:
	 * localhost:8080/users - To return all clients - GET
	 * localhost:8080/users/{id} - To return an specific user - GET
	 * localhost:8080/users/Object JSON - To save an user in database - POST
	 * localhost:8080/user/{id} - To delete an user - DELETE
	 * localhost:8080/user/{id}/Object JSON - To update an user in database - PUT
	 * 
	 * Access H2 DATABASE:
	 * localhost:8080/h2-console
	 * username = kaffa
	 * password =
	 
   
### To change access to the database in memory, access the file APPLICATION-TEST.PROPERTIES
