import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AccessControlService {
    private static AccessControlService service;
    private static HashMap<String, Set<Integer>> registry;

    private AccessControlService() {
        registry = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        if (service == null) {
            service = new AccessControlService();
        }
        return service;
    }

    public void allowAccess(String username, int id) {
        registry.putIfAbsent(username, new HashSet<>());
        registry.get(username).add(id);
    }

    public static boolean isAllowed(String username, int id) {
        if (!registry.containsKey(username)) {
            return false;
        }
        return registry.get(username).contains(id);
    }
}
