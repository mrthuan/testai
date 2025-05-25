package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;

/* compiled from: DataRewinderRegistry.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f6878b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6879a = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    /* loaded from: classes.dex */
    public class a implements e.a<Object> {
        @Override // com.bumptech.glide.load.data.e.a
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry.java */
    /* loaded from: classes.dex */
    public static final class b implements e<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f6880a;

        public b(Object obj) {
            this.f6880a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public final Object a() {
            return this.f6880a;
        }

        @Override // com.bumptech.glide.load.data.e
        public final void b() {
        }
    }
}
