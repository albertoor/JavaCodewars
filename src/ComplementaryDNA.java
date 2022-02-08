/*
    Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the
    "instructions" for the development and functioning of living organisms.
    If you want to know more: http://en.wikipedia.org/wiki/DNA

    In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You
    function receives one side of the DNA (string, except for Haskell); you need to return
    the other complementary side. DNA strand is never empty or there is no DNA at all
    (again, except for Haskell).

    More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

    Example: (input --> output)
        "ATTGC" --> "TAACG"
        "GTAT" --> "CATA"
 */
public class ComplementaryDNA {
    public static void main(String[] args) {
        String dna = "ATTGC";
        char [] dna_arr = dna.toCharArray();
        for (int i = 0; i < dna_arr.length ; i++) {
            if (String.valueOf(dna_arr[i]).equals("A")) dna_arr[i] = 'T';
            else if (String.valueOf(dna_arr[i]).equals("T")) dna_arr[i] = 'A';
            else if (String.valueOf(dna_arr[i]).equals("C")) dna_arr[i] = 'G';
            else if (String.valueOf(dna_arr[i]).equals("G")) dna_arr[i] = 'C';
        }
        System.out.println(String.valueOf(dna_arr));
    }
}
