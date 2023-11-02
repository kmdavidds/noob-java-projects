import java.util.Scanner;

public class konversiBilangan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char pilihan = ' ';
        char cur = ' ';
        String masukan;
        String keluaran;
        int length;
        int total;    
        boolean masihBerjalan = true;
        do {
            System.out.println();
            System.out.println("Program ini mmengubah bilangan berdasarkan basisnya.");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Hexa");
            System.out.println("4. Hexa ke Biner");
            System.out.println("5. Desimal ke Hexa");
            System.out.println("6. Hexa ke Desimal");
            System.out.println("9. Exit");
            System.out.print("Pilihan Anda? ");
            pilihan = in.nextLine().charAt(0);
            if (pilihan == '9') {
                masihBerjalan = false;
                continue;
            }
            keluaran = "";
            total = 0;
            System.out.print("Masukkan bilangan: ");
            masukan = in.nextLine();
            length = masukan.length();
            if (pilihan == '1') {
                for (int i = length-1, digit = 1; i >= 0; i--, digit*=2) {
                    cur = masukan.charAt(i);
                    if (cur == '1') {
                        total += digit;
                    }
                }
                System.out.println(total);
            } else if (pilihan == '2') {
                keluaran = Integer.toBinaryString(Integer.parseInt(masukan));
                System.out.println(keluaran);
            } else if (pilihan == '3') {
                for (int i = length-1, digit = 1; i >= 0; i--, digit*=2) {
                    cur = masukan.charAt(i);
                    if (cur == '1') {
                        total += digit;
                    }
                }
                keluaran = Integer.toHexString(total);
                System.out.println(keluaran);
            } else if (pilihan == '4') {
                for (int i = length-1, digit = 1; i >= 0; i--, digit*=16) {
                    cur = masukan.charAt(i);
                    switch (cur) {
                        case '1':
                            total += 1*digit;
                            break;
                        case '2':
                            total += 2*digit;
                            break;
                        case '3':
                            total += 3*digit;
                            break;
                        case '4':
                            total += 4*digit;
                            break;
                        case '5':
                            total += 5*digit;
                            break;
                        case '6':
                            total += 6*digit;
                            break;
                        case '7':
                            total += 7*digit;
                            break;
                        case '8':
                            total += 8*digit;
                            break;
                        case '9':
                            total += 9*digit;
                            break;
                        case 'A':
                            total += 10*digit;
                            break;
                        case 'B':
                            total += 11*digit;
                            break;
                        case 'C':
                            total += 12*digit;
                            break;
                        case 'D':
                            total += 13*digit;
                            break;
                        case 'E':
                            total += 14*digit;
                            break;
                        case 'F':
                            total += 15*digit;
                            break;
                        default:
                            break;
                    }
                }
                keluaran = Integer.toBinaryString(Integer.parseInt(masukan));
                System.out.println(keluaran);
            } else if (pilihan == '5') {
                keluaran = Integer.toHexString(Integer.parseInt(masukan));
                System.out.println(keluaran);
            } else if (pilihan == '6') {
                for (int i = length-1, digit = 1; i >= 0; i--, digit*=16) {
                    cur = masukan.charAt(i);
                    switch (cur) {
                        case '1':
                            total += 1*digit;
                            break;
                        case '2':
                            total += 2*digit;
                            break;
                        case '3':
                            total += 3*digit;
                            break;
                        case '4':
                            total += 4*digit;
                            break;
                        case '5':
                            total += 5*digit;
                            break;
                        case '6':
                            total += 6*digit;
                            break;
                        case '7':
                            total += 7*digit;
                            break;
                        case '8':
                            total += 8*digit;
                            break;
                        case '9':
                            total += 9*digit;
                            break;
                        case 'A':
                            total += 10*digit;
                            break;
                        case 'B':
                            total += 11*digit;
                            break;
                        case 'C':
                            total += 12*digit;
                            break;
                        case 'D':
                            total += 13*digit;
                            break;
                        case 'E':
                            total += 14*digit;
                            break;
                        case 'F':
                            total += 15*digit;
                            break;
                        default:
                            break;
                    }
                }
                System.out.println(total);
            } else {
                continue;
            }
        } while (masihBerjalan);
        in.close();
    }
}
