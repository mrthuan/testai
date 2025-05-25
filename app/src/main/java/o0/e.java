package o0;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import n0.f;

/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final l f22645a;

    /* renamed from: b  reason: collision with root package name */
    public static final y.g<String, Typeface> f22646b;

    /* compiled from: TypefaceCompat.java */
    /* loaded from: classes.dex */
    public static class a extends aj.b {

        /* renamed from: w  reason: collision with root package name */
        public final f.e f22647w;

        public a(f.e eVar) {
            this.f22647w = eVar;
        }
    }

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f22645a = new j();
        } else if (i10 >= 28) {
            f22645a = new i();
        } else if (i10 >= 26) {
            f22645a = new h();
        } else {
            if (i10 >= 24) {
                if (g.c != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f22645a = new g();
                }
            }
            f22645a = new f();
        }
        f22646b = new y.g<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0.equals(r4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r7, n0.d.b r8, android.content.res.Resources r9, int r10, java.lang.String r11, int r12, int r13, n0.f.e r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.e.a(android.content.Context, n0.d$b, android.content.res.Resources, int, java.lang.String, int, int, n0.f$e, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
