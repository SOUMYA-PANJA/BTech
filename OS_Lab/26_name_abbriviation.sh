echo "Enter name:"
read n
ab=${n:0:1}
len=${#n}
e="."
for (( i=2 ; i<len ; i++ ))
do
        c=`echo $n | cut -c $i`
        d=" "
        if [ "$c" = "$d" ]
        then
                ab=$ab$e${n:i:1}
        fi
done
echo $ab