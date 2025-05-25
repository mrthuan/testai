package jf;

import java.util.HashMap;
import java.util.Map;
import qk.r;

/* compiled from: MarkwonSpansFactoryImpl.java */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends r>, p> f19190a;

    /* compiled from: MarkwonSpansFactoryImpl.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f19191a = new HashMap(3);

        public final a a(Class cls, p pVar) {
            this.f19191a.put(cls, pVar);
            return this;
        }
    }

    public i(Map<Class<? extends r>, p> map) {
        this.f19190a = map;
    }
}
