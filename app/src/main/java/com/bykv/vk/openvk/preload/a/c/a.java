package com.bykv.vk.openvk.preload.a.c;

import com.bykv.vk.openvk.preload.a.b.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: TypeToken.java */
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: b  reason: collision with root package name */
    public final Class<? super T> f7360b;
    public final Type c;

    /* renamed from: d  reason: collision with root package name */
    final int f7361d;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a10 = b.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.c = a10;
            this.f7360b = (Class<? super T>) b.b(a10);
            this.f7361d = a10.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public static a<?> a(Type type) {
        return new a<>(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && b.a(this.c, ((a) obj).c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7361d;
    }

    public final String toString() {
        return b.c(this.c);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    private a(Type type) {
        Type a10 = b.a((Type) com.bykv.vk.openvk.preload.a.b.a.a(type));
        this.c = a10;
        this.f7360b = (Class<? super T>) b.b(a10);
        this.f7361d = a10.hashCode();
    }
}
