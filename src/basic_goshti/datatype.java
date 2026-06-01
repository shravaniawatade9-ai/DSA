package basic_goshti;

public class datatype {
    static void main() {
        // typecasting ek data types madhun dusrya data type madhe convert karne
        // EXAMPLE getting character A's integer value i.e using ascii code
        // write A within** ''** this sign
        // in ascii A = 65  therefor the o/p will be 65 when u run this code
        char ch= 'A';  // jivanat kadhich A with '' this symbol wont be stored as charecter A
        // it will always get stored as 65 integer and not as char  it is just for signeture of variable
        int x = ch ; // implicit typecasting i.e jabardasti eka dtype la dusrya madhe ghusvane
        System.out.println(x);

        char shravani = '$';
        int y = (int)shravani;         
        System.out.println(y); // value of my name in ascii i.e in integer is 36

        char viraj = '3';
        System.out.println((int)viraj);
    }
}
