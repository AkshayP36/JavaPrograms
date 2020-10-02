package com.akshaypatil;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        FileWriter myfile = new FileWriter("MyFile.txt");
        myfile.write("package com.timbuchalka;\n" +
                "\n" +
                "import java.util.regex.Matcher;\n" +
                "import java.util.regex.Pattern;\n" +
                "\n" +
                "public class Main {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        String string = \"I am a string. Yes, I am.\";\n" +
                "        System.out.println(string);\n" +
                "        String yourString = string.replaceAll(\"I\", \"You\");\n" +
                "        System.out.println(yourString);\n" +
                "\n" +
                "        String alphanumeric = \"abcDeeeF12Ghhiiiijkl99z\";\n" +
                "        System.out.println(alphanumeric.replaceAll(\".\",\"Y\"));\n" +
                "\n" +
                "        System.out.println(alphanumeric.replaceAll(\"^abcDeee\", \"YYY\"));\n" +
                "\n" +
                "        String secondString = \"abcDeeeF12GhhabcDeeeiiiijkl99z\";\n" +
                "        System.out.println(secondString.replaceAll(\"^abcDeee\", \"YYY\"));\n" +
                "\n" +
                "        System.out.println(alphanumeric.matches(\"^hello\"));\n" +
                "        System.out.println(alphanumeric.matches(\"^abcDeee\"));\n" +
                "        System.out.println(alphanumeric.matches(\"abcDeeeF12Ghhiiiijkl99z\"));\n" +
                "\n" +
                "        System.out.println(alphanumeric.replaceAll(\"ijkl99z$\", \"THE END\"));\n" +
                "        System.out.println(alphanumeric.replaceAll(\"[aei]\", \"X\"));\n" +
                "        System.out.println(alphanumeric.replaceAll(\"[aei]\", \"I replaced a letter here\"));\n" +
                "        System.out.println(alphanumeric.replaceAll(\"[aei][Fj]\", \"X\"));\n" +
                "\n" +
                "        System.out.println(\"harry\".replaceAll(\"[Hh]arry\", \"Harry\"));\n" +
                "\n" +
                "        String newAlphanumeric = \"abcDeeeF12Ghhiiiijkl99z\";\n" +
                "        System.out.println(newAlphanumeric.replaceAll(\"[^ej]\", \"X\"));\n" +
                "        System.out.println(newAlphanumeric.replaceAll(\"[abcdef345678]\", \"X\"));\n" +
                "        System.out.println(newAlphanumeric.replaceAll(\"[a-fA-F3-8]\", \"X\"));\n" +
                "        System.out.println(newAlphanumeric.replaceAll(\"(?i)[a-f3-8]\", \"X\"));\n" +
                "        System.out.println(newAlphanumeric.replaceAll(\"[0-9]\", \"X\"));\n" +
                "        System.out.println(newAlphanumeric.replaceAll(\"\\\\d\", \"X\"));\n" +
                "        System.out.println(newAlphanumeric.replaceAll(\"\\\\D\", \"X\"));\n" +
                "\n" +
                "        String hasWhitespace = \"I have blanks and\\ta tab, and also a newline\\n\";\n" +
                "        System.out.println(hasWhitespace);\n" +
                "        System.out.println(hasWhitespace.replaceAll(\"\\\\s\", \"\"));\n" +
                "        System.out.println(hasWhitespace.replaceAll(\"\\t\", \"X\"));\n" +
                "        System.out.println(hasWhitespace.replaceAll(\"\\\\S\", \"\"));\n" +
                "        System.out.println(newAlphanumeric.replaceAll(\"\\\\w\", \"X\"));\n" +
                "        System.out.println(hasWhitespace.replaceAll(\"\\\\w\", \"X\"));\n" +
                "        System.out.println(hasWhitespace.replaceAll(\"\\\\b\", \"X\"));\n" +
                "\n" +
                "        String thirdAlphanumericString = \"abcDeeeF12Ghhiiiijkl99z\";\n" +
                "        System.out.println(thirdAlphanumericString.replaceAll(\"^abcDe{3}\", \"YYY\"));\n" +
                "        System.out.println(thirdAlphanumericString.replaceAll(\"^abcDe+\", \"YYY\"));\n" +
                "        System.out.println(thirdAlphanumericString.replaceAll(\"^abcDe*\", \"YYY\"));\n" +
                "        System.out.println(thirdAlphanumericString.replaceAll(\"^abcDe{2,5}\", \"YYY\"));\n" +
                "        System.out.println(thirdAlphanumericString.replaceAll(\"h+i*j\", \"Y\"));\n" +
                "\n" +
                "        StringBuilder htmlText = new StringBuilder(\"<h1>My Heading</h1>\");\n" +
                "        htmlText.append(\"<h2>Sub-heading</h2>\");\n" +
                "        htmlText.append(\"<p>This is a paragraph about something.</p>\");\n" +
                "        htmlText.append(\"<p>This is another paragraph about something else.</p>\");\n" +
                "        htmlText.append(\"<h2>Summary</h2>\");\n" +
                "        htmlText.append(\"<p>Here is the summary.</p>\");\n" +
                "\n" +
                "        String h2Pattern = \"<h2>\";\n" +
                "        Pattern pattern = Pattern.compile(h2Pattern);\n" +
                "        Matcher matcher = pattern.matcher(htmlText);\n" +
                "        System.out.println(matcher.matches());\n" +
                "\n" +
                "        matcher.reset();\n" +
                "        int count = 0;\n" +
                "        while(matcher.find()) {\n" +
                "            count++;\n" +
                "            System.out.println(\"Occurrence \" + count + \" : \" + matcher.start() + \" to \" + matcher.end());\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        String h2GroupPattern = \"(<h2>.*?</h2>)\";\n" +
                "        Pattern groupPattern = Pattern.compile(h2GroupPattern);\n" +
                "        Matcher groupMatcher = groupPattern.matcher(htmlText);\n" +
                "        System.out.println(groupMatcher.matches());\n" +
                "        groupMatcher.reset();\n" +
                "\n" +
                "        while(groupMatcher.find()) {\n" +
                "            System.out.println(\"Occurrence: \" + groupMatcher.group(1));\n" +
                "        }\n" +
                "\n" +
                "        String h2TextGroups = \"(<h2>)(.+?)(</h2>)\";\n" +
                "        Pattern h2TextPatten = Pattern.compile(h2TextGroups);\n" +
                "        Matcher h2TextMatcher = h2TextPatten.matcher(htmlText);\n" +
                "\n" +
                "        while(h2TextMatcher.find()) {\n" +
                "            System.out.println(\"Occurrence: \" + h2TextMatcher.group(2));\n" +
                "        }\n" +
                "        // \"abc\" \"a\" and \"b\" and \"c\"\n" +
                "        // [[Hh]arry\n" +
                "        System.out.println(\"harry\".replaceAll(\"[H|h]arry\", \"Larry\"));\n" +
                "        System.out.println(\"Harry\".replaceAll(\"[H|h]arry\", \"Larry\"));\n" +
                "\n" +
                "        // [^abc]\n" +
                "        String tvTest = \"tstvtkt\";\n" +
                "//        String tNotVRegExp = \"t[^v]\";\n" +
                "        String tNotVRegExp = \"t(?!v)\";\n" +
                "        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);\n" +
                "        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);\n" +
                "\n" +
                "        count = 0;\n" +
                "        while(tNotVMatcher.find()) {\n" +
                "            count++;\n" +
                "            System.out.println(\"Occurrence \" + count + \" : \" + tNotVMatcher.start() + \" to \" + tNotVMatcher.end());\n" +
                "        }\n" +
                "        // t(?=v)\n" +
                "        // ^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$\n" +
                "        String phone1 = \"1234567890\";  // Shouldn't match\n" +
                "        String phone2 = \"(123) 456-7890\"; // match\n" +
                "        String phone3 = \"123 456-7890\"; // Shouldn't match\n" +
                "        String phone4 = \"(123)456-7890\"; // Shouldn't match\n" +
                "\n" +
                "        System.out.println(\"phone1 = \" + phone1.matches(\"^([\\\\(]{1}[0-9]{3}[\\\\)]{1}[ ]{1}[0-9]{3}[\\\\-]{1}[0-9]{4})$\"));\n" +
                "        System.out.println(\"phone2 = \" + phone2.matches(\"^([\\\\(]{1}[0-9]{3}[\\\\)]{1}[ ]{1}[0-9]{3}[\\\\-]{1}[0-9]{4})$\"));\n" +
                "        System.out.println(\"phone3 = \" + phone3.matches(\"^([\\\\(]{1}[0-9]{3}[\\\\)]{1}[ ]{1}[0-9]{3}[\\\\-]{1}[0-9]{4})$\"));\n" +
                "        System.out.println(\"phone4 = \" + phone4.matches(\"^([\\\\(]{1}[0-9]{3}[\\\\)]{1}[ ]{1}[0-9]{3}[\\\\-]{1}[0-9]{4})$\"));\n" +
                "\n" +
                "        // ^4[0-9]{12}([0-9]{3})?$\n" +
                "        String visa1 = \"4444444444444\"; // should match\n" +
                "        String visa2 = \"5444444444444\"; // shouldn't match\n" +
                "        String visa3 = \"4444444444444444\";  // should match\n" +
                "        String visa4 = \"4444\";  // shouldn't match\n" +
                "\n" +
                "        System.out.println(\"visa1 \" + visa1.matches(\"^4[0-9]{12}([0-9]{3})?$\"));\n" +
                "        System.out.println(\"visa2 \" + visa2.matches(\"^4[0-9]{12}([0-9]{3})?$\"));\n" +
                "        System.out.println(\"visa3 \" + visa3.matches(\"^4[0-9]{12}([0-9]{3})?$\"));\n" +
                "        System.out.println(\"visa4 \" + visa4.matches(\"^4[0-9]{12}([0-9]{3})?$\"));\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


        myfile.close();
    }
}
