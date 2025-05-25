package e3;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public final class g implements Callable<p<e>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f16359a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f16360b;
    public final /* synthetic */ String c;

    public g(Context context, String str, String str2) {
        this.f16359a = context;
        this.f16360b = str;
        this.c = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e3.p<e3.e> call() {
        /*
            r9 = this;
            n3.a r0 = new n3.a
            java.lang.String r1 = r9.c
            android.content.Context r2 = r9.f16359a
            java.lang.String r3 = r9.f16360b
            r0.<init>(r2, r3, r1)
            java.lang.Object r1 = r0.c
            androidx.core.content.e r1 = (androidx.core.content.e) r1
            r2 = 0
            if (r1 != 0) goto L14
            goto L95
        L14:
            java.lang.Object r3 = r0.f22332b
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r4 = new java.io.File     // Catch: java.io.FileNotFoundException -> L68
            java.io.File r5 = r1.i()     // Catch: java.io.FileNotFoundException -> L68
            com.airbnb.lottie.network.FileExtension r6 = com.airbnb.lottie.network.FileExtension.JSON     // Catch: java.io.FileNotFoundException -> L68
            r7 = 0
            java.lang.String r8 = androidx.core.content.e.g(r3, r6, r7)     // Catch: java.io.FileNotFoundException -> L68
            r4.<init>(r5, r8)     // Catch: java.io.FileNotFoundException -> L68
            boolean r5 = r4.exists()     // Catch: java.io.FileNotFoundException -> L68
            if (r5 == 0) goto L2f
            goto L46
        L2f:
            java.io.File r4 = new java.io.File     // Catch: java.io.FileNotFoundException -> L68
            java.io.File r1 = r1.i()     // Catch: java.io.FileNotFoundException -> L68
            com.airbnb.lottie.network.FileExtension r5 = com.airbnb.lottie.network.FileExtension.ZIP     // Catch: java.io.FileNotFoundException -> L68
            java.lang.String r3 = androidx.core.content.e.g(r3, r5, r7)     // Catch: java.io.FileNotFoundException -> L68
            r4.<init>(r1, r3)     // Catch: java.io.FileNotFoundException -> L68
            boolean r1 = r4.exists()     // Catch: java.io.FileNotFoundException -> L68
            if (r1 == 0) goto L45
            goto L46
        L45:
            r4 = r2
        L46:
            if (r4 != 0) goto L49
            goto L68
        L49:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L68
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> L68
            java.lang.String r3 = r4.getAbsolutePath()
            java.lang.String r5 = ".zip"
            boolean r3 = r3.endsWith(r5)
            if (r3 == 0) goto L5c
            com.airbnb.lottie.network.FileExtension r6 = com.airbnb.lottie.network.FileExtension.ZIP
        L5c:
            r4.getAbsolutePath()
            p3.c.a()
            w0.c r3 = new w0.c
            r3.<init>(r6, r1)
            goto L69
        L68:
            r3 = r2
        L69:
            if (r3 != 0) goto L6c
            goto L95
        L6c:
            F r1 = r3.f30902a
            com.airbnb.lottie.network.FileExtension r1 = (com.airbnb.lottie.network.FileExtension) r1
            S r3 = r3.f30903b
            java.io.InputStream r3 = (java.io.InputStream) r3
            com.airbnb.lottie.network.FileExtension r4 = com.airbnb.lottie.network.FileExtension.ZIP
            if (r1 != r4) goto L86
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream
            r1.<init>(r3)
            java.lang.Object r3 = r0.f22332b
            java.lang.String r3 = (java.lang.String) r3
            e3.p r1 = e3.f.f(r1, r3)
            goto L8e
        L86:
            java.lang.Object r1 = r0.f22332b
            java.lang.String r1 = (java.lang.String) r1
            e3.p r1 = e3.f.c(r3, r1)
        L8e:
            V r1 = r1.f16439a
            if (r1 == 0) goto L95
            r2 = r1
            e3.e r2 = (e3.e) r2
        L95:
            if (r2 == 0) goto L9d
            e3.p r0 = new e3.p
            r0.<init>(r2)
            goto Lac
        L9d:
            p3.c.a()
            e3.p r0 = r0.b()     // Catch: java.io.IOException -> La5
            goto Lac
        La5:
            r0 = move-exception
            e3.p r1 = new e3.p
            r1.<init>(r0)
            r0 = r1
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.g.call():java.lang.Object");
    }
}
