echo enter numbers:
a=$1
b=$2
#read a
#read b
if [ $a -gt $b ]
then
	echo $a is greater.
else
	echo $b is greater.
fi
if [ $a -lt $b ]
then
	echo $a is smaller.
else
	echo $b is smaller.
fi
