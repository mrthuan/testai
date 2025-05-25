package com.inmobi.media;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class Fb {

    /* renamed from: a  reason: collision with root package name */
    public final byte f14255a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap f14256b = new LinkedHashMap();

    public Fb(byte b10) {
        this.f14255a = b10;
    }

    public final Object a(String key, Class classType) {
        kotlin.jvm.internal.g.e(key, "key");
        kotlin.jvm.internal.g.e(classType, "classType");
        Object obj = this.f14256b.get(key);
        if (classType.isInstance(obj)) {
            return classType.cast(obj);
        }
        return null;
    }
}
