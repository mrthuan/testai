package com.inmobi.media;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: com.inmobi.media.h3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1650h3 implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream[] f15122a;

    public C1650h3(InputStream[] inputStreamArr) {
        this.f15122a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f15122a) {
            Ub.a(inputStream);
        }
    }
}
