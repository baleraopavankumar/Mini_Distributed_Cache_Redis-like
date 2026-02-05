public class CacheEntry {
    private String value;
    private long expiryTime;

    public boolean isExpired() {
        return System.currentTimeMillis() > expiryTime;
    }
}
