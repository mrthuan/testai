package t0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final y.g<String, Typeface> f29889a = new y.g<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f29890b;
    public static final Object c;

    /* renamed from: d  reason: collision with root package name */
    public static final y.i<String, ArrayList<w0.a<a>>> f29891d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) Constants.CP_MAC_ROMAN, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f29890b = threadPoolExecutor;
        c = new Object();
        f29891d = new y.i<>();
    }

    public static a a(String str, Context context, f fVar, int i10) {
        int i11;
        y.g<String, Typeface> gVar = f29889a;
        Typeface typeface = gVar.get(str);
        if (typeface != null) {
            return new a(typeface);
        }
        try {
            l a10 = e.a(context, fVar);
            int i12 = 1;
            m[] mVarArr = a10.f29895b;
            int i13 = a10.f29894a;
            if (i13 != 0) {
                if (i13 == 1) {
                    i11 = -2;
                }
                i11 = -3;
            } else {
                if (mVarArr != null && mVarArr.length != 0) {
                    i12 = 0;
                    for (m mVar : mVarArr) {
                        int i14 = mVar.f29899e;
                        if (i14 != 0) {
                            if (i14 >= 0) {
                                i11 = i14;
                            }
                            i11 = -3;
                        }
                    }
                }
                i11 = i12;
            }
            if (i11 != 0) {
                return new a(i11);
            }
            Typeface b10 = o0.e.f22645a.b(context, mVarArr, i10);
            if (b10 != null) {
                gVar.put(str, b10);
                return new a(b10);
            }
            return new a(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f29892a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29893b;

        public a(int i10) {
            this.f29892a = null;
            this.f29893b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f29892a = typeface;
            this.f29893b = 0;
        }
    }
}
