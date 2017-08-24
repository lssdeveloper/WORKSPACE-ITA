package com.lssdeveloper.main;

public class TesteCamelCase {
	public static String join (String[] parts, String separator) {
        StringBuilder sb = new StringBuilder();
        if (parts.length > 0) {
            sb.append(parts[0]);
            for (int i = 1; i < parts.length; ++i) {
                sb.append (separator).append (parts[i]);
            }
        }
        return sb.toString();
    }
    public static String join (String[] parts) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; ++i) {
            sb.append (parts[i]);
        }
        return sb.toString();
    }
    public static String toCamelCase (String strData, boolean keepBlanks) {
        String[] parts = strData.split("\\s+");
        for (int i = 0; i < parts.length; ++i) {
            if (parts[i].length() > 1)
                parts [i] = Character.toUpperCase(parts[i].charAt(0)) + parts[i].substring(1).toLowerCase();
            else
                parts [i] = parts[i].toUpperCase();
        }
        if (keepBlanks)
            return join (parts, " ");
        else
            return join (parts);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println (toCamelCase ("O TESTE DE FUNCIONAMENTO de CAMEL CASE", false));
        System.out.println (toCamelCase ("TestaNdo o CamEl cASE", true));
    }

}
