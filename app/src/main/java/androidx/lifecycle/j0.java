package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: ViewModel.java */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4056a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f4057b = new LinkedHashSet();
    public volatile boolean c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final Object c(Object obj, String str) {
        Object obj2;
        synchronized (this.f4056a) {
            obj2 = this.f4056a.get(str);
            if (obj2 == null) {
                this.f4056a.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.c) {
            a(obj);
        }
        return obj;
    }

    public void b() {
    }
}
