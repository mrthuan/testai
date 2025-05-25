package com.facebook;

import android.os.Handler;
import com.facebook.h;
import com.facebook.internal.q;
import java.io.FilterOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l.r;

/* compiled from: ProgressOutputStream.kt */
/* loaded from: classes.dex */
public final class l extends FilterOutputStream implements t5.m {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f9835h = 0;

    /* renamed from: a  reason: collision with root package name */
    public final h f9836a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<e, m> f9837b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9838d;

    /* renamed from: e  reason: collision with root package name */
    public long f9839e;

    /* renamed from: f  reason: collision with root package name */
    public long f9840f;

    /* renamed from: g  reason: collision with root package name */
    public m f9841g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(FilterOutputStream filterOutputStream, h hVar, HashMap progressMap, long j10) {
        super(filterOutputStream);
        kotlin.jvm.internal.g.e(progressMap, "progressMap");
        this.f9836a = hVar;
        this.f9837b = progressMap;
        this.c = j10;
        d dVar = d.f9685a;
        q.e();
        this.f9838d = d.f9692i.get();
    }

    @Override // t5.m
    public final void a(e eVar) {
        m mVar;
        if (eVar != null) {
            mVar = this.f9837b.get(eVar);
        } else {
            mVar = null;
        }
        this.f9841g = mVar;
    }

    public final void b(long j10) {
        m mVar = this.f9841g;
        if (mVar != null) {
            long j11 = mVar.f9844d + j10;
            mVar.f9844d = j11;
            if (j11 >= mVar.f9845e + mVar.c || j11 >= mVar.f9846f) {
                mVar.a();
            }
        }
        long j12 = this.f9839e + j10;
        this.f9839e = j12;
        if (j12 >= this.f9840f + this.f9838d || j12 >= this.c) {
            c();
        }
    }

    public final void c() {
        if (this.f9839e > this.f9840f) {
            h hVar = this.f9836a;
            Iterator it = hVar.f9725d.iterator();
            while (it.hasNext()) {
                h.a aVar = (h.a) it.next();
                if (aVar instanceof h.b) {
                    Handler handler = hVar.f9723a;
                    if (handler != null) {
                        handler.post(new r(1, aVar, this));
                    } else {
                        ((h.b) aVar).a();
                    }
                }
            }
            this.f9840f = this.f9839e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        for (m mVar : this.f9837b.values()) {
            mVar.a();
        }
        c();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] buffer) {
        kotlin.jvm.internal.g.e(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        b(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] buffer, int i10, int i11) {
        kotlin.jvm.internal.g.e(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i10, i11);
        b(i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) {
        ((FilterOutputStream) this).out.write(i10);
        b(1L);
    }
}
