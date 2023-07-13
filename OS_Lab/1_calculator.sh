#echo enter two numbers
a=$1
b=$2
#read a
#read b
c=`expr $a + $b`
d=`expr $a - $b`
e=`expr $a \* $b`
f=`expr $a / $b`
g=`expr $a % $b`
#h=`expr $a = $b`
#echo $a
echo $a + $b: $c
echo $a - $b: $d
echo $a "*" $b: $e
echo $a / $b: $f
echo $a mod $b: $g
z=`expr "scale=5; $a/$b"|bc`
echo $a / $b: $z
p=`expr "scale=5; $a+$b"|bc`
echo $a + $b: $p

