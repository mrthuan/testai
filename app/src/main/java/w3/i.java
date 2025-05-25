package w3;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: LruBitmapPool.java */
/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config f30955f = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final j f30956a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f30957b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public final long f30958d;

    /* renamed from: e  reason: collision with root package name */
    public long f30959e;

    /* compiled from: LruBitmapPool.java */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public i(long j10) {
        Bitmap.Config config;
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f30958d = j10;
        this.f30956a = lVar;
        this.f30957b = unmodifiableSet;
        this.c = new a();
    }

    @Override // w3.c
    @SuppressLint({"InlinedApi"})
    public final void a(int i10) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i10 < 40 && i10 < 20) {
            if (i10 >= 20 || i10 == 15) {
                g(this.f30958d / 2);
                return;
            }
            return;
        }
        b();
    }

    @Override // w3.c
    public final void b() {
        Log.isLoggable("LruBitmapPool", 3);
        g(0L);
    }

    @Override // w3.c
    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        Bitmap f10 = f(i10, i11, config);
        if (f10 == null) {
            if (config == null) {
                config = f30955f;
            }
            return Bitmap.createBitmap(i10, i11, config);
        }
        return f10;
    }

    @Override // w3.c
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((l) this.f30956a).getClass();
                        if (p4.j.c(bitmap) <= this.f30958d && this.f30957b.contains(bitmap.getConfig())) {
                            ((l) this.f30956a).getClass();
                            int c = p4.j.c(bitmap);
                            ((l) this.f30956a).f(bitmap);
                            this.c.getClass();
                            this.f30959e += c;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                ((l) this.f30956a).e(bitmap);
                            }
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Objects.toString(this.f30956a);
                            }
                            g(this.f30958d);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        ((l) this.f30956a).e(bitmap);
                        bitmap.isMutable();
                        this.f30957b.contains(bitmap.getConfig());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // w3.c
    public final Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap f10 = f(i10, i11, config);
        if (f10 != null) {
            f10.eraseColor(0);
            return f10;
        }
        if (config == null) {
            config = f30955f;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final synchronized Bitmap f(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap b10;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            j jVar = this.f30956a;
            if (config != null) {
                config3 = config;
            } else {
                config3 = f30955f;
            }
            b10 = ((l) jVar).b(i10, i11, config3);
            if (b10 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    ((l) this.f30956a).getClass();
                    l.c(p4.j.b(i10, i11, config), config);
                }
            } else {
                long j10 = this.f30959e;
                ((l) this.f30956a).getClass();
                this.f30959e = j10 - p4.j.c(b10);
                this.c.getClass();
                b10.setHasAlpha(true);
                b10.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                ((l) this.f30956a).getClass();
                l.c(p4.j.b(i10, i11, config), config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f30956a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b10;
    }

    public final synchronized void g(long j10) {
        while (this.f30959e > j10) {
            l lVar = (l) this.f30956a;
            Bitmap c = lVar.f30966b.c();
            if (c != null) {
                lVar.a(Integer.valueOf(p4.j.c(c)), c);
            }
            if (c == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.f30956a);
                }
                this.f30959e = 0L;
                return;
            }
            this.c.getClass();
            long j11 = this.f30959e;
            ((l) this.f30956a).getClass();
            this.f30959e = j11 - p4.j.c(c);
            if (Log.isLoggable("LruBitmapPool", 3)) {
                ((l) this.f30956a).e(c);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f30956a);
            }
            c.recycle();
        }
    }
}
