echo "Enter a number:"
read x

case $x in

[0-9]) echo Single Digit Number;;
[0-9][0-9]) echo Double Digit Number;;
[0-9][0-9][0-9]) echo Triple Digit Number;;
*) echo Out of Range;;
esac
