fact(){
	n=$1
	if [ $n -lt 2 ]
	then
		echo  $n
	else
		echo $(( $n * `fact $(( $n - 1 ))` ))
	fi
}
res(){
	temp=$(echo "scale=0;  `fact $n` / (`fact $r ` * `fact $(($n - $r))` )" |bc)
	echo $temp
}

read -p "Enter n " n
read -p "Enter r " r
res $n $r
