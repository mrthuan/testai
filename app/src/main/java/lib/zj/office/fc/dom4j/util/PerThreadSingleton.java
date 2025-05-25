package lib.zj.office.fc.dom4j.util;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class PerThreadSingleton implements SingletonStrategy {
    private String singletonClassName = null;
    private ThreadLocal perThreadCache = new ThreadLocal();

    @Override // lib.zj.office.fc.dom4j.util.SingletonStrategy
    public Object instance() {
        Object obj;
        WeakReference weakReference = (WeakReference) this.perThreadCache.get();
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        try {
            try {
                obj = Thread.currentThread().getContextClassLoader().loadClass(this.singletonClassName).newInstance();
            } catch (Exception unused) {
                obj = null;
            }
        } catch (Exception unused2) {
            obj = Class.forName(this.singletonClassName).newInstance();
        }
        this.perThreadCache.set(new WeakReference(obj));
        return obj;
    }

    @Override // lib.zj.office.fc.dom4j.util.SingletonStrategy
    public void reset() {
        this.perThreadCache = new ThreadLocal();
    }

    @Override // lib.zj.office.fc.dom4j.util.SingletonStrategy
    public void setSingletonClassName(String str) {
        this.singletonClassName = str;
    }
}
