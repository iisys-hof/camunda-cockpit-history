# camunda-cockpit-history
Plugin for Camunda Cockpit displaying historic process instances

Requires: https://github.com/iisys-hof/camunda-rest-extension

Basis:

https://github.com/camunda/camunda-bpm-examples/tree/master/cockpit/cockpit-sample-plugin

https://docs.camunda.org/manual/7.4/webapps/cockpit/extend/plugins/

https://docs.camunda.org/manual/7.4/examples/tutorials/develop-cockpit-plugin/


Building:

* Import into an Eclipse with Maven support
* Execute maven build with package goal

Configuration and Installation:

* edit the URLs in /src/main/resources/plugin-webapp/cockpit-history-plugin/app/history.html to match the system
* copy the generated jar file into $CAMUNDA_DIR/server/apache-tomcat-$VERSION/webapps/camunda/WEB-INF/lib/
* Restart Camunda
* There will now be an extra tab below process definitions

Structure:

* /src/main/resources/plugin-webapp/cockpit-history-plugin/app/history.html HTML template for the "Process History" tab
* /src/main/resources/plugin-webapp/cockpit-history-plugin/app/plugin.js Plugin Angular configuration
* /src/main/java/de/hofuniversity/iisys/camunda/cockpithistory/HistoryPlugin.java Plugin base class
* /src/main/java/de/hofuniversity/iisys/camunda/cockpithistory/resource/HistoryPluginRootResource.java Resource serving base class

Language files can be found in: /src/main/resources/plugin-webapp/cockpit-history-plugin

only lowercase 2-letter language designations are used based on the browser's language