class SqueakyClean {
    static String removeSpecialChar(String s){
        return s.replaceAll("[^a-zA-Z0-9\\_]","");
    }
    static String leetspeak(String s){
        // replacing 4, 3, 0, 1 and 7 with a, e, o, l, and t,
        return s.replace("3","e").replace("4","a").replace("0","o").replace("1","l").replace("7","t");
    }
    static String replaceSpacesWithUnderscore(String s){
        return s.replaceAll("\\s","_");
    }
     static String kebabToCamelCase(String s){
        int idx = s.indexOf("-");
        if(idx == -1) return s;
        return s.replaceAll("-[a-zA-Z]", (s.charAt(idx+1) + "").toUpperCase());
    }
    static String clean(String identifier) {
        String s = SqueakyClean.replaceSpacesWithUnderscore(identifier);
        s = SqueakyClean.kebabToCamelCase(s);
        s = SqueakyClean.leetspeak(s);
         s = SqueakyClean.removeSpecialChar(s);
        return s;
    }
}
