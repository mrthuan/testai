package lib.zj.office.fc.dom4j.tree;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.Map;
import lib.zj.office.fc.dom4j.Namespace;

/* loaded from: classes3.dex */
public class NamespaceCache {
    private static final String CONCURRENTREADERHASHMAP_CLASS = "EDU.oswego.cs.dl.util.concurrent.ConcurrentReaderHashMap";
    protected static Map cache;
    protected static Map noPrefixCache;

    static {
        try {
            try {
                Class<?> cls = Class.forName("java.util.concurrent.ConcurrentHashMap");
                Class<?> cls2 = Integer.TYPE;
                Constructor<?> constructor = cls.getConstructor(cls2, Float.TYPE, cls2);
                cache = (Map) constructor.newInstance(new Integer(11), new Float(0.75f), new Integer(1));
                noPrefixCache = (Map) constructor.newInstance(new Integer(11), new Float(0.75f), new Integer(1));
            } catch (Throwable unused) {
                Class<?> cls3 = Class.forName(CONCURRENTREADERHASHMAP_CLASS);
                cache = (Map) cls3.newInstance();
                noPrefixCache = (Map) cls3.newInstance();
            }
        } catch (Throwable unused2) {
            cache = new ConcurrentReaderHashMap();
            noPrefixCache = new ConcurrentReaderHashMap();
        }
    }

    public Namespace createNamespace(String str, String str2) {
        return new Namespace(str, str2);
    }

    public Namespace get(String str, String str2) {
        Map uRICache = getURICache(str2);
        WeakReference weakReference = (WeakReference) uRICache.get(str);
        Namespace namespace = weakReference != null ? (Namespace) weakReference.get() : null;
        if (namespace == null) {
            synchronized (uRICache) {
                WeakReference weakReference2 = (WeakReference) uRICache.get(str);
                if (weakReference2 != null) {
                    namespace = (Namespace) weakReference2.get();
                }
                if (namespace == null) {
                    Namespace createNamespace = createNamespace(str, str2);
                    uRICache.put(str, new WeakReference(createNamespace));
                    namespace = createNamespace;
                }
            }
        }
        return namespace;
    }

    public Map getURICache(String str) {
        Map map = (Map) cache.get(str);
        if (map == null) {
            synchronized (cache) {
                map = (Map) cache.get(str);
                if (map == null) {
                    map = new ConcurrentReaderHashMap();
                    cache.put(str, map);
                }
            }
        }
        return map;
    }

    public Namespace get(String str) {
        WeakReference weakReference = (WeakReference) noPrefixCache.get(str);
        Namespace namespace = weakReference != null ? (Namespace) weakReference.get() : null;
        if (namespace == null) {
            synchronized (noPrefixCache) {
                WeakReference weakReference2 = (WeakReference) noPrefixCache.get(str);
                if (weakReference2 != null) {
                    namespace = (Namespace) weakReference2.get();
                }
                if (namespace == null) {
                    namespace = createNamespace("", str);
                    noPrefixCache.put(str, new WeakReference(namespace));
                }
            }
        }
        return namespace;
    }
}
