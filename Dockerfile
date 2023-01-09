FROM openjdk:8-jdk
LABEL org.opencontainers.image.authors="ibello@ibello.eu"
RUN apt-get update && \
    apt-get install -yq tzdata
RUN apt-get install -y \
	openssh-client \
	git \
	curl \
	unzip \
	wget
RUN echo ${maven.version}
# Download and install Maven
RUN \
    cd /usr/local && \
    curl -L https://dlcdn.apache.org/maven/maven-3/${maven.version}/binaries/apache-maven-${maven.version}-bin.zip -o apache-maven-${maven.version}-bin.zip && \
    unzip apache-maven-${maven.version}-bin.zip && \
    rm apache-maven-${maven.version}-bin.zip
ENV M2_HOME=/usr/local/apache-maven-${maven.version}
# Install ibello
WORKDIR /opt/ibello
RUN cd /var/opt/ibello && \
    curl -L https://ibello.hu/downloads/ibello-installer-${ibello.version}.jar
RUN java -jar /var/opt/ibello/ibello-installer-${ibello.version}.jar --auto --install-path /opt/ibello
# Change system path
ENV PATH=/usr/local/openjdk-8/bin:/usr/local/apache-maven-${maven.version}/bin:/usr/local/gradle-${gradle.version}/bin:/opt/ibello:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin
CMD tail -f /dev/null
