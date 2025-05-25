package com.bykv.vk.openvk.preload.a.b.b;

import com.bykv.vk.openvk.preload.a.b.e;
import java.lang.reflect.AccessibleObject;

/* compiled from: ReflectionAccessor.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final b f7286a;

    static {
        b cVar;
        if (e.a() < 9) {
            cVar = new a();
        } else {
            cVar = new c();
        }
        f7286a = cVar;
    }

    public static b a() {
        return f7286a;
    }

    public abstract void a(AccessibleObject accessibleObject);
}
