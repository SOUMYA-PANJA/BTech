echo "Enter string"
read n
len=${#n}
s=""
for (( i=len-1 ; i>=0 ; i-- ))
do
        s=$s${n:i:1}
done
echo $s
