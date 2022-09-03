echo enter number of elements
read n
for (( i=1 ; i<=n ; i++))
do
        echo enter element $i:
        read a[i]
done
echo enter key:
read key
for ((i=1 ; i<=n ; i++))
do
        if [ $key -eq ${a[i]} ]
        then
                echo "$key is found at position $i"
                exit 0
        fi
done
echo "$key is not found"
