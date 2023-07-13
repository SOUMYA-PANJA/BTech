str="helloworld"
echo $str
echo ${#str}
str4="sourav"
str5="ganguly"
str6=$str4$str5
echo $str6
echo ${str6:7}
a=${str6:7:2}
echo $a
if [ -z $a ]
then
        echo "string length is zero"
else
        echo "string length is not zero"
fi
if [ -n $a ]
then
        echo "string length is not zero"
else
        echo "string length is zero"
fi
s="hiiiii"
echo $s | rev
