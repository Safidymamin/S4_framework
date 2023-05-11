javac -d . *.java
jar -cf framework.jar ./etu002003
xcopy framework.jar "../Test framework/web/WEB-INF/lib"