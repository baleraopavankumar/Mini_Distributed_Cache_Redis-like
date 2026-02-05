@Service
public class CacheService {

    private final Map<String, CacheEntry> cache = new ConcurrentHashMap<>();

    public void put(String key, String value, long ttlSeconds) {
        long expiry = System.currentTimeMillis() + ttlSeconds * 1000;
        cache.put(key, new CacheEntry(value, expiry));
    }

    public String get(String key) {
        CacheEntry entry = cache.get(key);
        if (entry == null || entry.isExpired()) {
            cache.remove(key);
            return null;
        }
        return entry.getValue();
    }

    public void delete(String key) {
        cache.remove(key);
    }
}
