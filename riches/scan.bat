@echo off
echo We assume that cxsast is in your local path
echo If it is not, update your path to include SCA.
echo
echo Cleaning up...
cxsast -b riches -clean
ant clean

echo Translating and Scanning...
ant all
cxsast -findbugs -cp "jsplibs/**/*.jar;lib/**/*.jar;WEB-INF/lib/**/*.jar" -source 1.5 -java-build-dir "WEB-INF/classes" WEB-INF/ js/ jsplibs/ login/ pages/ config/ -f scanResults.fpr
