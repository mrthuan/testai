package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.List;

/* loaded from: classes2.dex */
public final class M5 extends AbstractC1753oa {

    /* renamed from: b  reason: collision with root package name */
    public final Class f14459b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M5(Constructor<List<Object>> constructor, Class<Object> valueClass) {
        super(constructor);
        kotlin.jvm.internal.g.e(constructor, "constructor");
        kotlin.jvm.internal.g.e(valueClass, "valueClass");
        this.f14459b = valueClass;
    }

    public final List<Object> b() {
        return (List) a().construct();
    }

    public final Class<Object> c() {
        return this.f14459b;
    }
}
