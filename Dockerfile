FROM tomcat:8.5.27-jre8-alpine

ADD build/libs/yes-another-spring-boot-mvc.war /usr/local/tomcat/webapps/

CMD ["catalina.sh", "run"]