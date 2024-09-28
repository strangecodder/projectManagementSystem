FROM maven:3.8-openjdk-17-slim

ENV HOME=/home/app
RUN mkdir -p $HOME

ADD ./settings.xml /usr/share/maven/ref/
ENV MVN_SETTINGS=/usr/share/maven/ref/settings.xml

RUN mkdir -p $HOME/backend_service
ADD ./backend_service/pom.xml $HOME/backend_service
ADD ./backend_service/src $HOME/backend_service/src
RUN mvn -f $HOME/backend_service/pom.xml -s $MVN_SETTINGS clean package --debug

CMD java -jar $HOME/backend_service/target/backend_service-0.0.1.jar