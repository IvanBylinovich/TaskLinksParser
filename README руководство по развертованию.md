# TaskLinksParser
Приложение развертывается в apache-tomcat, собирается при помощи apache-maven.
Сборка через консоль командоми  mvn clean, mvn packege (предворительно необходимо зайти в деректорию проекта).
Полученный файл "TaskLinksParser.war" с деректории ...\TaskLinksParser\target перемещается в деректорию \apache-tomcat-9.0.45\webapps. 
Запускается сервер Tomcat. Через startup.bat (для ОС Windous)  находящийся в папки bin.
Приложение будет запущено по адресу http://localhost:8080/TaskLinksParser/  (при стандартных настройках)
