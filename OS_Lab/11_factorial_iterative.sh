echo "Enter a number:"
read x
fact=1
while [ $x -gt 0 ]
do
	fact=`expr $x \* $fact`
	x=`expr $x - 1`
done
echo "The factorial is:"
echo $fact
