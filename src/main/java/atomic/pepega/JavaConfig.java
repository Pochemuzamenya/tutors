package atomic.pepega;

import lombok.Getter;
import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;

public class JavaConfig implements Config {

    @Getter
    private Reflections scanner;
    private Map<Class,Class> ifcImplClass;

    public JavaConfig(String packageToScan, Map<Class,Class> ifcImplClass){
        this.ifcImplClass = ifcImplClass;
        this.scanner = new Reflections(packageToScan);
    }
    @Override
    public <T> Class<? extends T> getImplClass(Class<T> type) {
        return ifcImplClass.computeIfAbsent(type, aClass -> {
            Set<Class<? extends T>> classes = scanner.getSubTypesOf(type);
            if (classes.size() != 1) {
                throw new RuntimeException(type + " has 0 or more then one impl");
            }
            return classes.iterator().next();
        });
    }
}
