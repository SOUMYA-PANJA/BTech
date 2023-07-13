echo "Enter your date of birth (dd/mm/yyyy):"
read dob
IFS="/"
set $dob
d=$1
m=$2
y=$3
dnow=`date +%d`
mnow=`date +%m`
ynow=`date +%Y`
aged=`expr $dnow - $d`
agem=`expr $mnow - $m`
agey=`expr $ynow - $y`
if [ $aged -lt 0 ]
then
	agem=`expr $agem - 1`
	aged=`expr $aged + 30`
fi
if [ $agem -lt 0 ]
then
	agem=`expr $agem + 12`
	agey=`expr $agey - 1`
fi
echo "age is $agey years and $agem months and $aged days old"
