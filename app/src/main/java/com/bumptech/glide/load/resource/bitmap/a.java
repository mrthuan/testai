package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import c4.o;
import c4.v;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import p4.j;
import t3.d;
import t3.e;

/* compiled from: Downsampler.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final d<DecodeFormat> f7052f = d.a(DecodeFormat.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g  reason: collision with root package name */
    public static final d<PreferredColorSpace> f7053g = d.a(PreferredColorSpace.SRGB, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h  reason: collision with root package name */
    public static final d<Boolean> f7054h;

    /* renamed from: i  reason: collision with root package name */
    public static final d<Boolean> f7055i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f7056j;

    /* renamed from: k  reason: collision with root package name */
    public static final C0055a f7057k;

    /* renamed from: l  reason: collision with root package name */
    public static final ArrayDeque f7058l;

    /* renamed from: a  reason: collision with root package name */
    public final w3.c f7059a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f7060b;
    public final w3.b c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f7061d;

    /* renamed from: e  reason: collision with root package name */
    public final o f7062e;

    /* compiled from: Downsampler.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(Bitmap bitmap, w3.c cVar);
    }

    static {
        DownsampleStrategy.e eVar = DownsampleStrategy.f7040a;
        Boolean bool = Boolean.FALSE;
        f7054h = d.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f7055i = d.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f7056j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f7057k = new C0055a();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = j.f23703a;
        f7058l = new ArrayDeque(0);
    }

    public a(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, w3.c cVar, w3.b bVar) {
        if (o.f5536g == null) {
            synchronized (o.class) {
                if (o.f5536g == null) {
                    o.f5536g = new o();
                }
            }
        }
        this.f7062e = o.f5536g;
        this.f7061d = list;
        com.google.android.play.core.assetpacks.c.l(displayMetrics);
        this.f7060b = displayMetrics;
        com.google.android.play.core.assetpacks.c.l(cVar);
        this.f7059a = cVar;
        com.google.android.play.core.assetpacks.c.l(bVar);
        this.c = bVar;
    }

    public static Bitmap c(com.bumptech.glide.load.resource.bitmap.b bVar, BitmapFactory.Options options, b bVar2, w3.c cVar) {
        if (!options.inJustDecodeBounds) {
            bVar2.a();
            bVar.c();
        }
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = v.f5552b;
        lock.lock();
        try {
            try {
                Bitmap b10 = bVar.b(options);
                lock.unlock();
                return b10;
            } catch (IllegalArgumentException e10) {
                IOException e11 = e(e10, i10, i11, str, options);
                Log.isLoggable("Downsampler", 3);
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        cVar.d(bitmap);
                        options.inBitmap = null;
                        Bitmap c = c(bVar, options, bVar2, cVar);
                        v.f5552b.unlock();
                        return c;
                    } catch (IOException unused) {
                        throw e11;
                    }
                }
                throw e11;
            }
        } catch (Throwable th2) {
            v.f5552b.unlock();
            throw th2;
        }
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        StringBuilder f10 = a0.d.f("Exception decoding bitmap, outWidth: ", i10, ", outHeight: ", i11, ", outMimeType: ");
        f10.append(str);
        f10.append(", inBitmap: ");
        f10.append(d(options.inBitmap));
        return new IOException(f10.toString(), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        g(options);
        ArrayDeque arrayDeque = f7058l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final c4.c a(com.bumptech.glide.load.resource.bitmap.b bVar, int i10, int i11, e eVar, b bVar2) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z10;
        byte[] bArr = (byte[]) this.c.c(65536, byte[].class);
        synchronized (a.class) {
            ArrayDeque arrayDeque = f7058l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                g(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) eVar.c(f7052f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) eVar.c(f7053g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) eVar.c(DownsampleStrategy.f7044f);
        boolean booleanValue = ((Boolean) eVar.c(f7054h)).booleanValue();
        d<Boolean> dVar = f7055i;
        if (eVar.c(dVar) != null && ((Boolean) eVar.c(dVar)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            return c4.c.b(b(bVar, options2, downsampleStrategy, decodeFormat, preferredColorSpace, z10, i10, i11, booleanValue, bVar2), this.f7059a);
        } finally {
            f(options2);
            this.c.put(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(com.bumptech.glide.load.resource.bitmap.b r26, android.graphics.BitmapFactory.Options r27, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r28, com.bumptech.glide.load.DecodeFormat r29, com.bumptech.glide.load.PreferredColorSpace r30, boolean r31, int r32, int r33, boolean r34, com.bumptech.glide.load.resource.bitmap.a.b r35) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.a.b(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.DecodeFormat, com.bumptech.glide.load.PreferredColorSpace, boolean, int, int, boolean, com.bumptech.glide.load.resource.bitmap.a$b):android.graphics.Bitmap");
    }

    /* compiled from: Downsampler.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0055a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public final void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public final void b(Bitmap bitmap, w3.c cVar) {
        }
    }
}
