read -p "Enter a " a
read -p "Enter b " b
while [ $b -gt 0 ]
do
	c=`expr $a % $b`
	a=$b
	b=$c
done
echo $a
