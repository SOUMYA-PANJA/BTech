echo enter number of elements
read n
for (( i=1 ; i<=n ; i++))
do
        echo enter elements:
        read a[i]
done
echo "Array elements are:"
echo ${a[*]}
