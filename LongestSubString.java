// 1. WAP to find the longest consecutive alphabetical substring from a given string

class LongestSubString{
    public static void main(String[] args){
        String str="abcdghijklopqrstxyz";
        String longest="";
        String current=""+str.charAt(0);
        
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)+1){
                current=current+str.charAt(i);
            }else{
                if(current.length()>longest.length()){
                    longest=current;
                }
                current=""+str.charAt(i);
            }
            if(current.length()>longest.length()){
                longest=current;
            }
        }
        System.out.println(longest);
    }
}