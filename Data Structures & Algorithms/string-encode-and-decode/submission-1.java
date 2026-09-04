class Solution {
    public String encode(List<String> strs) {
        StringBuilder encodedMessage = new StringBuilder("");
        for(String str : strs){
            encodedMessage.append(str.length());
            encodedMessage.append('#');
            encodedMessage.append(str);
        }
        return encodedMessage.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedMessage = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#')
                j++;
            int length = Integer.parseInt(str.substring(i,j));
            i = j+1;
            j = i+length;
            decodedMessage.add(str.substring(i,j));
            i = j;
        }
        return decodedMessage;
    }
}
