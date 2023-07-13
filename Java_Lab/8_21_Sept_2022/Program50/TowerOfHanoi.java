public class TowerOfHanoi {
    public static void tower(int first, char disk1, char temp, char disk2){
        if (first == 1){
            System.out.println("Disk 1 from "+disk1+" to "+disk2);
        }
        else{
            tower(first - 1, disk1, disk2, temp);
            System.out.println("Disk "+first+" from "+disk1+" to "+disk2);
            tower(first - 1, temp, disk1, disk2);
        }
    }

    public static void main(String[] args) {
        int count = 3;
        tower(count, 'A', 'B', 'C');
    }

}
