echo "Enter a number:"
read x
sum=0
while [ $x -gt 0 ]
do
	m=`expr $x % 10`
	sum=`expr $sum + $m`
	x=`expr $x / 10`
done
echo $sum
