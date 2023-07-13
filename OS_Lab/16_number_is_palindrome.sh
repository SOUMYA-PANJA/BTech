read num
num1=$num
rev=0
while [ $num -ne 0 ]
do
	rem=`expr $num % 10`
	rev=`expr $rev \* 10 + $rem`
	num=`expr $num / 10`
done

if [ $rev -eq $num1 ]
then
	echo "Palindrome"
else
	echo "Not Palindrome"
fi
