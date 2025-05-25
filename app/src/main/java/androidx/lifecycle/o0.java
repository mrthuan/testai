package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: ViewModelStore.kt */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f4069a = new LinkedHashMap();

    public final void a() {
        for (j0 j0Var : this.f4069a.values()) {
            j0Var.c = true;
            HashMap hashMap = j0Var.f4056a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object obj : j0Var.f4056a.values()) {
                        j0.a(obj);
                    }
                }
            }
            LinkedHashSet linkedHashSet = j0Var.f4057b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable closeable : j0Var.f4057b) {
                        j0.a(closeable);
                    }
                }
            }
            j0Var.b();
        }
        this.f4069a.clear();
    }
}
