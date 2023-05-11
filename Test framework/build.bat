javac -cp "./web/WEB-INF/lib/framework.jar" -d "./web/WEB-INF/classes" ./test/*.java
cd ./web
jar -cf Framework.war . 