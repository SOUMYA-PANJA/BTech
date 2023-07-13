echo "Enter number of elements: "
read n
for (( i=1 ; i<=n ; i++))
do
        echo enter elements:
        read a[i]
done
echo ${a[*]}
for ((i=1 ; i<=n ; i++))
do
        z=`expr $n - $i`
        for ((j=1 ; j<=z ; j++))
        do
                k=`expr $j + 1`
                if [ ${a[j]} -gt ${a[k]} ]
                then
                        temp=${a[j]}
                        a[j]=${a[k]}
                        a[k]=$temp
                fi
        done
done
echo ${a[*]}
