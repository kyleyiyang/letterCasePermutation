class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> lst=new ArrayList<String>();
        backtrack(lst,0,s.toCharArray());
        return lst;
    }
    public void backtrack(List<String> lst,int i,char[] chars) {
        if (i==chars.length) {lst.add(new String(chars));return;}
        if (Character.isLetter(chars[i])) {
            chars[i]=Character.toUpperCase(chars[i]);
            backtrack(lst,i+1,chars);
            chars[i]=Character.toLowerCase(chars[i]);
            //backtrack(lst,i+1,chars);
        } 
        backtrack(lst,i+1,chars);
    }
}
