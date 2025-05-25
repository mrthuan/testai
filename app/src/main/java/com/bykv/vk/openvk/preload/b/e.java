package com.bykv.vk.openvk.preload.b;

/* compiled from: InterceptorFactory.java */
/* loaded from: classes.dex */
public interface e {

    /* compiled from: InterceptorFactory.java */
    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // com.bykv.vk.openvk.preload.b.e
        public final <T> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    <T> T a(Class<T> cls);
}
