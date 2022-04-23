public class Codec {
    Map<String, String> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    
    public String encode(String longUrl) {
        sb.append((char)Math.floor(Math.random() * 100));
        while(map.containsKey(sb.toString())){
            sb.append((char)Math.floor(Math.random() * 100));
        }
        map.put(sb.toString(), longUrl);
        return sb.toString();
    }

    
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));