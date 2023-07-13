a=$1
b=$2
c=$3
if [ $a -gt $b -a $a -gt $c ]
then
	echo $a is greater then $b and $c
elif [ $b -gt $a -a $b -gt $c ]
then
	echo $b is greater then $a and $c
else
	echo $c is greater then $a and $b
fi
