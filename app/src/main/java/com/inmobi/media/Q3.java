package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes2.dex */
public final class Q3 implements P3 {

    /* renamed from: a  reason: collision with root package name */
    public final Movie f14586a;

    /* renamed from: b  reason: collision with root package name */
    public int f14587b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f14588d;

    /* renamed from: e  reason: collision with root package name */
    public O3 f14589e;

    public Q3(String filePath) {
        kotlin.jvm.internal.g.e(filePath, "filePath");
        File file = new File(filePath);
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read(bArr);
            K8.a((Closeable) fileInputStream);
            Movie decodeByteArray = Movie.decodeByteArray(bArr, 0, read);
            this.f14586a = decodeByteArray;
            if (decodeByteArray != null) {
                return;
            }
            throw new IllegalStateException("Cannot decode gif byte array".toString());
        } catch (Throwable th2) {
            K8.a((Closeable) fileInputStream);
            throw th2;
        }
    }

    @Override // com.inmobi.media.P3
    public final void a(boolean z10) {
        this.f14588d = z10;
        if (!this.f14588d) {
            this.c = SystemClock.uptimeMillis() - this.f14587b;
        }
        O3 o32 = this.f14589e;
        if (o32 != null) {
            ((R3) o32).invalidate();
        }
    }

    @Override // com.inmobi.media.P3
    public final void b() {
        int i10;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.c == 0) {
            this.c = uptimeMillis;
        }
        Movie movie = this.f14586a;
        if (movie != null) {
            i10 = movie.duration();
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            i10 = 1000;
        }
        int i11 = (int) ((uptimeMillis - this.c) % i10);
        this.f14587b = i11;
        Movie movie2 = this.f14586a;
        if (movie2 != null) {
            movie2.setTime(i11);
        }
    }

    @Override // com.inmobi.media.P3
    public final boolean c() {
        return !this.f14588d;
    }

    @Override // com.inmobi.media.P3
    public final int d() {
        Movie movie = this.f14586a;
        if (movie != null) {
            return movie.width();
        }
        return 0;
    }

    public final void e() {
        new Handler(Looper.getMainLooper()).post(new androidx.activity.b(this, 11));
    }

    @Override // com.inmobi.media.P3
    public final int a() {
        Movie movie = this.f14586a;
        if (movie != null) {
            return movie.height();
        }
        return 0;
    }

    @Override // com.inmobi.media.P3
    public final void a(Canvas canvas, float f10, float f11) {
        Movie movie = this.f14586a;
        if (movie != null) {
            movie.draw(canvas, f10, f11);
        }
        Movie movie2 = this.f14586a;
        if (this.f14587b + 20 >= (movie2 != null ? movie2.duration() : 0)) {
            e();
        }
    }

    public static final void a(Q3 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.f14587b = 0;
        this$0.a(false);
    }

    @Override // com.inmobi.media.P3
    public final void a(O3 o32) {
        this.f14589e = o32;
    }

    @Override // com.inmobi.media.P3
    public final void start() {
    }
}
