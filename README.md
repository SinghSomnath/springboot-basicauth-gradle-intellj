# springboot-basicauth-gradle-intellj
 sample sprint boot basic auth with intellj and gradle
 
 made with gradle version 6.5.1 .
 
 To run the application :
 1> Install gradle in your local machine
 2> Open command line and go to the project folder 
 3> Type ```gradle bootRun```
 
 
 Note: Please import the https://github.com/SinghSomnath/springboot-basicauth-gradle-intellj/blob/main/postman_collection.json in your Postman app to **run** the sample  GET and POST(creating new employees) calls .
 
 **Want to run in GIT LAB CI** -  browse here https://gitlab.com/SinghSomnath/springboot-basicauth-gradle-intellj
 
 Git-lab CI uses my **AWS** vm as the the agent machine where **gitlabe runner** runs and makes it a slave machine connecting to the gitlab server .
 
On How to configure the gitlab runner on AWS unix machine follow below links :
---------------------------------------------------------------------------------
 
 https://www.youtube.com/watch?v=IyZOr_ubEaU&t=388s
 https://docs.gitlab.com/runner/install/linux-repository.html
 https://stackoverflow.com/questions/53370840/this-job-is-stuck-because-the-project-doesnt-have-any-runners-online-assigned
 
 
**Want to run as docker image** is hosted here https://hub.docker.com/r/soms/som-docker-webapp
 
 to run the docker image execute below commands in any unix vm:
 -------------------------------------------------------------- 

1>docker pull soms/som-docker-webapp
After that clone this sprint boot app  code repo ( **git clone https://github.com/SinghSomnath/springboot-basicauth-gradle-intellj.git** ) and place it in the same folder from where you are running the below 2nd command .
2>docker run -p 8080:8080 -it soms/som-docker-webapp bash
3>cd /softwares/springboot-basicauth-gradle-intellj
4>gradle bootRun

 

 
