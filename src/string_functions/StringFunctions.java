package string_functions;

public class StringFunctions {
    public static void main(String[] args) {
        String a = "abcdef";

        // charAt()
        char charOne = a.charAt(0); // qasja me indeks
        char charTwo = a.charAt(5); // qasja me indeks
        System.out.println(charOne);
        System.out.println(charTwo);

        // length()
        int stringLength = a.length();
        System.out.println(stringLength); // vlera totale (numerimi fillon prej 1, jo prej 0)
        // rangu i indeksave ne string eshte (0 - string.length()-1)
        // shembull "abc" eshte (0 - "abc".length() - 1) -> (0 - 2)


        // format()
        System.out.printf("Stringu %s %n", a); // Ketu vetem shfaqet vlera, nuk ruhet askund
        String b = String.format("Stringu %s %n", a); // Vleren e formatuar e ruajme ne nje String te ri
        System.out.println(b);

        // substring(int beginIndex)
        // substring nuk e ndryshon vleren e Stringut origjinal, vetem e kthen nje String te ri me ate qe e kemi kerkuar
        String myName = "Yll Gashi";
        String surname = myName.substring(4);
        System.out.println(myName);
        System.out.println(surname);

        // substring(int beginIndex, int lastIndex + 1)
        String myNameTwo = "Yll Gashi";
        String halfOfSurnameTwo = myName.substring(4, 6);
        System.out.println(myNameTwo);
        System.out.println(halfOfSurnameTwo);

        // contains()
        // shikon nese nje tekst ekziston ne vleren e stringut
        String studentName = "Olt Thaqi";
        boolean surnameExists = studentName.contains("Thaqi"); // true
        boolean surnameExistsLowerCase = studentName.contains("thaqi"); // false
        System.out.println(surnameExists);
        System.out.println(surnameExistsLowerCase);

        String randomString = "abcdef";
        boolean cdExists = randomString.contains("cd"); // true
        boolean ceExists = randomString.contains("ce"); // false


        // equals()
        boolean isNotEqual = "Kosova".equals("Shqiperia"); // false
        boolean isEqual = "Kosova".equals("Kosova"); // true

        // empty()
        // kthen true vetem nese gjatesia e String eshte 0
        String username = "";
        boolean isStringEmpty = username.isEmpty();
        System.out.println(isStringEmpty ? "String eshte i zbrazet" : "Username ka vlere");

        // blank()
        // kthen true nese String eshte i zbrazet ose ka hapesira
        String password = "     ";
        boolean isBlank = password.isBlank(); // true
        System.out.println(isBlank);

        String personFirstName = "Drin ";
        String personFullName = personFirstName.concat("Sadiku");
        System.out.println(personFirstName); // Drin
        System.out.println(personFullName); // Drin Sadiku

        // replace()
        String randomTextOne = "abcabcabc";
        String randomTextTwo = "ABCabcabc";
        String replacedTextOne = randomTextOne.replace("abc", "def");
        String replacedTextTwo = randomTextTwo.replace("abc", "def");
        System.out.println(replacedTextOne);
        System.out.println(replacedTextTwo);

        // equalsIgnoreCase()
        String textOneExample = "abc";
        String textTwoExample = "ABC";
        boolean isEqualAsItIs = textOneExample.equals(textTwoExample);
        boolean isEqualIgnoreCase = textOneExample.equalsIgnoreCase(textTwoExample);
        System.out.println(isEqualAsItIs);
        System.out.println(isEqualIgnoreCase);

        // indexOf(char c)
        // indeksi i char te pare ne tekst (ne String)
        String stringExample = "abcdefc";
        int firstIndex = stringExample.indexOf('c');
        System.out.println(firstIndex); // 2

        // indexOf(charc, int readFrom)
        int firstIndexFromThree = stringExample.indexOf('c', 3);
        System.out.println(firstIndexFromThree); // 6

        // lastIndexOf()
        // indeksi i char te fundit ne tekst (ne String)
        int lastIndex = stringExample.lastIndexOf('c');
        System.out.println(lastIndex); // 6

        // lastIndexOf()
        int lastIndexFromSubstring = stringExample.lastIndexOf('c', 3);
        System.out.println(lastIndexFromSubstring); // 6

        // toLowerCase()
        String facebookUsername = "yllgashi";
        String givenUsername = "yllGASHI";
        String givenUsernameLowerCase = givenUsername.toLowerCase(); // yllgashi
        if (givenUsernameLowerCase.equals(givenUsername)) {

        }

        // toUpperCase()
        String givenUsernameUpperCase = givenUsername.toUpperCase();

        // trim()
        String textWithWhiteSpaces = "   abc   ";
        String textWithoutWhiteSpaces = textWithWhiteSpaces.trim();
        System.out.println(textWithoutWhiteSpaces);

        // valueOf() - like parse of other Wrapper classes
        String valueOfIntAsString = String.valueOf(1);
        String valueOfBooleanAsString = String.valueOf(true);


        // join()
        String joinedText = String.join("->", "Master", "Beachelor", "Shkolla e mesme", "Shkolla fillore");
        System.out.println(joinedText);
    }
}





