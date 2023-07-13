echo "1. Contents of the file"
echo "2. System data"
echo "3. Current working directory and file in that directory"
echo "4. Exit"
echo " Enter your choice:"

read x

case $x in

1) echo Enter filename
read y
echo contents of your file
head $y;;
2) date;;
3) pwd &&ls;;
4)exit;;
*) echo you have entered wrong choice
esac
