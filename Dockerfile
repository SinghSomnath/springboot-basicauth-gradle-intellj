FROM ubuntu
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk openjdk-8-jre
RUN export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
ENV JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
ENV PATH "${JAVA_HOME}/bin:${PATH}"
RUN apt-get install -y wget
RUN apt-get install -y p7zip-full
RUN cd /
RUN cd home/
RUN mkdir softwares
RUN mkdir softwares/springboot-basicauth-gradle-intellj
RUN cd softwares
RUN wget https://services.gradle.org/distributions/gradle-6.4.1-bin.zip -P .
RUN 7z x -y gradle-6.4.1-bin.zip  -o./home/softwares/
ENV GRADLE_HOME=/home/softwares/gradle-6.4.1
#COPY springboot-basicauth-gradle-intellj  /softwares/springboot-basicauth-gradle-intellj/
ENV PATH="${GRADLE_HOME}/bin:${PATH}"
COPY springboot-basicauth-gradle-intellj  /softwares/springboot-basicauth-gradle-intellj/