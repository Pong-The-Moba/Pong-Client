./gradlew executable-jar
mv Client/build/libs/Client-execjar-1.0.jar jars/client.jar
cp natives jars/natives
cd jars
git pull origin master
git add -A
git commit -m "Update jars"
git push origin master
cd ..
echo "1" | nc 192.168.1.72 1337