FROM quay.io/kiegroup/kie-server-showcase:7.73.0.Final

MAINTAINER "Emilio García de la Calera" "e.garciacaleramolina@um.es"

## ENVIRONMENT ##

ENV KIE_SERVER_LOCATION http://192.168.7.3:8080/kie-server/services/rest/server
ENV KIE_SERVER_USER kieserver
ENV KIE_SERVER_PWD kieserver1!

ENV KIE_SERVER_CONTROLLER http://192.168.7.2:8080/business-central/rest/controller
ENV KIE_SERVER_CONTROLLER_USER admin
ENV KIE_SERVER_CONTROLLER_PWD admin

ENV KIE_MAVEN_REPO http://192.168.7.2:8080/business-central/maven2
ENV KIE_MAVEN_REPO_USER admin
ENV KIE_MAVEN_REPO_PASSWORD admin
ENV JAVA_OPTS -Xms256m -Xmx1024m -Djava.net.preferIPv4Stack=true -Dfile.encoding=UTF-8 -Dorg.jbpm.server.ext.disabled=true -Dorg.jbpm.ui.server.ext.disabled=true -Dorg.optaplanner.server.ext.disabled=true -Dorg.kie.executor.disabled=true

## CUSTOM CONFIGURATION ##

RUN mkdir -p $HOME/.m2
ADD etc/standalone-full-kie-server.xml $JBOSS_HOME/standalone/configuration/standalone-full-kie-server.xml
ADD etc/kie-server-users.properties $JBOSS_HOME/standalone/configuration/kie-server-users.properties
ADD etc/kie-server-roles.properties $JBOSS_HOME/standalone/configuration/kie-server-roles.properties
ADD etc/start_kie-server.sh $JBOSS_HOME/bin/start_kie-server.sh
ADD etc/settings.xml $JBOSS_HOME/../.m2/settings.xml

## PERMISSIONS ## 

USER root
RUN chown jboss:jboss $JBOSS_HOME/standalone/configuration/standalone-full-kie-server.xml && \
chown jboss:jboss $JBOSS_HOME/standalone/configuration/kie-server-users.properties && \
chown jboss:jboss $JBOSS_HOME/standalone/configuration/kie-server-roles.properties && \
chown jboss:jboss $JBOSS_HOME/bin/start_kie-server.sh && \
chown jboss:jboss $JBOSS_HOME/../.m2/settings.xml

## RUNNING KIE-SERVER

USER jboss

WORKDIR $JBOSS_HOME/bin/
CMD ["./start_kie-server.sh"]
