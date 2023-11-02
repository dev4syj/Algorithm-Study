class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        //Stringbuilder 선언
        StringBuilder sb = new StringBuilder();
        
        //문자열에서 문자 하나씩 빼서 대소문자인지 비교
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }else{
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        
        //answer로 변환
        answer = sb.toString();
        
        return answer;
    }
}
