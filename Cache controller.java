@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private CacheService cacheService;

    @PostMapping("/put")
    public ResponseEntity<?> put(@RequestParam String key,
                                 @RequestParam String value,
                                 @RequestParam long ttl) {
        cacheService.put(key, value, ttl);
        return ResponseEntity.ok("Stored");
    }

    @GetMapping("/get/{key}")
    public ResponseEntity<?> get(@PathVariable String key) {
        return ResponseEntity.ok(cacheService.get(key));
    }
}
