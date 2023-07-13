public class MegaBytesConverter {

  public static void main(String[] args) {
    printMegaBytesAndKiloBytes(5000);
    printMegaBytesAndKiloBytes(2500);
    printMegaBytesAndKiloBytes(1124);
    printMegaBytesAndKiloBytes(0);
  }

  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0)
      System.out.println("Invalid Value");
    else if (
      kiloBytes >= 0
    ) {
      long result = (long) ((long) kiloBytes / (long) 1024.0);
      int rem = kiloBytes % 1024;
      System.out.println(
        kiloBytes + " KB = " + result + " MB and
" + rem + " KB \n"
      );
    } else if (kiloBytes == 0) {
      System.out.println(0 + " KB = " + 0 + " MB and " + 0 + " KB
\n");
    }
  }
}
