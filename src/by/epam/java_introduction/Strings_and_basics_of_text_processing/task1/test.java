package by.epam.java_introduction.Strings_and_basics_of_text_processing.task1;

public class test {
    public static void main(String[] args) {
        String s1 = "Java16";
        String s2 = "Ja" + "va" + 16;
        String s3 = new String("Java16");
        String s4 = new String(s1);
        String s5 = new String();
        System.out.println(s5.length());
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2 == s3);
        s3 = s1.intern();
        System.out.println(s2 == s3);

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
        stringBuilder.append("hello hello hel");
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
        stringBuilder.insert(2, " sabf");
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.delete(5,15));
        System.out.println(stringBuilder.reverse());

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        builder1.append("java");
        builder2.append(builder1);

        System.out.println((builder1.equals(builder2 ) + " " + (builder1.hashCode() == builder2.hashCode())));
        System.out.println(builder1.toString().contentEquals(builder2));




    }
}
