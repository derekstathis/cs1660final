FROM ubuntu
COPY . /usr/src/toolbox
WORKDIR /usr/src/toolbox
RUN apt-get update

RUN apt-get install -y openjdk-8-jre
RUN apt-get install -y openjdk-8-jdk

RUN apt-get install -y firefox

RUN apt-get install -y python3
RUN apt-get install -y python3-pip
RUN apt-get install -y xterm
RUN apt-get install -y git
RUN pip3 install tensorflow
RUN pip3 install pyspark

#COPY requirements.txt requirements.txt
#RUN pip3 install -r requirements.txt

RUN javac Toolbox.java
CMD ["java","Toolbox"]