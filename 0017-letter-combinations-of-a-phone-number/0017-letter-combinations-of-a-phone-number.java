class Solution {
    public List<String> letterCombinations(String digits) {
       List<String> res=new ArrayList<>();
       if (digits == null || digits.length() == 0) {
            return res;
        }
       HashMap<Character,String> hash=new HashMap<>();
       hash.put('2',"abc");
       hash.put('3',"def");
       hash.put('4',"ghi");
       hash.put('5',"jkl");
       hash.put('6',"mno");
       hash.put('7',"pqrs");
       hash.put('8',"tuv");
       hash.put('9',"wxyz");

       res.add("");
       for(int i=0;i<digits.length();i++){
        char dig=digits.charAt(i);
        String let=hash.get(dig);

        List<String> temp=new ArrayList<>();

        for(String com:res){
            for(int j=0;j<let.length();j++){
               temp.add(com+let.charAt(j));
            }
        }
        res=temp;
       }
       return res ;
    }
}