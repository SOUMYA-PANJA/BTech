read -p "Enter a " a
read -p "Enter b " b
r1=$a
r2=$b
while [ $b -gt 0 ]
do
	c=`expr $a % $b`
	a=$b
	b=$c
done
res=`expr $r1 \* $r2`
res=`expr $res / $a`
echo $res
