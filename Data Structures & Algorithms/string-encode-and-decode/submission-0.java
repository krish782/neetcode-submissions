class Solution {
    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            String word = strs.get(i);
            int length = word.length();
            result.append(length);
            result.append("#");
            result.append(word);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int stopSign = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, stopSign));
            String word = str.substring(stopSign + 1, stopSign + 1 + length);
            decoded_strs.add(word);
            i = stopSign + 1 + length;




        }
            return decoded_strs;
    }
}
