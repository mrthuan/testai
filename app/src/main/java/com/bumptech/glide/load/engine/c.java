package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;

/* compiled from: DataFetcherGenerator.java */
/* loaded from: classes.dex */
public interface c {

    /* compiled from: DataFetcherGenerator.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(t3.b bVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource);

        void c(t3.b bVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, t3.b bVar2);

        void d();
    }

    boolean b();

    void cancel();
}
