package pdf.pdfreader.viewer.editor.free;

import androidx.appcompat.app.c;

/* compiled from: ReaderLauncherBridgeActivity.kt */
/* loaded from: classes3.dex */
public final class ReaderLauncherBridgeActivity extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f23852a = ea.a.p("K2VScDVsDG4tXwBhV2U1b1drDXAocldt", "dgO7jeiN");

    static {
        ea.a.p("K2VUcCZsXm4_XyJhBXARX1tlGV88ZQRyPDICMnFfV3IgbQ==", "nCKXc2D1");
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
        if (r6 == false) goto L37;
     */
    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lc
            u0.b r0 = new u0.b
            r0.<init>(r5)
            goto L11
        Lc:
            u0.c r0 = new u0.c
            r0.<init>(r5)
        L11:
            r0.a()
            super.onCreate(r6)
            boolean r6 = pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.f23861m
            if (r6 == 0) goto L22
            pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.o(r5)
            r5.finish()
            return
        L22:
            android.content.Intent r6 = r5.getIntent()
            int r6 = r6.getFlags()
            r0 = 4194304(0x400000, float:5.877472E-39)
            r6 = r6 & r0
            r0 = 0
            if (r6 == 0) goto L37
            r5.overridePendingTransition(r0, r0)
            r5.finish()
            return
        L37:
            androidx.activity.OnBackPressedDispatcher r6 = r5.getOnBackPressedDispatcher()
            java.lang.String r1 = "BG46YS9rHXItcxVlUEQ-c0hhJmMhZXI="
            java.lang.String r2 = "JqkxLMAg"
            java.lang.String r1 = ea.a.p(r1, r2)
            kotlin.jvm.internal.g.d(r6, r1)
            pdf.pdfreader.viewer.editor.free.ReaderLauncherBridgeActivity$onCreate$1 r1 = new cg.l<androidx.activity.n, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ReaderLauncherBridgeActivity$onCreate$1
                static {
                    /*
                        pdf.pdfreader.viewer.editor.free.ReaderLauncherBridgeActivity$onCreate$1 r0 = new pdf.pdfreader.viewer.editor.free.ReaderLauncherBridgeActivity$onCreate$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:pdf.pdfreader.viewer.editor.free.ReaderLauncherBridgeActivity$onCreate$1) pdf.pdfreader.viewer.editor.free.ReaderLauncherBridgeActivity$onCreate$1.INSTANCE pdf.pdfreader.viewer.editor.free.ReaderLauncherBridgeActivity$onCreate$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ReaderLauncherBridgeActivity$onCreate$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ReaderLauncherBridgeActivity$onCreate$1.<init>():void");
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.activity.n r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "$this$addCallback"
                        kotlin.jvm.internal.g.e(r2, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ReaderLauncherBridgeActivity$onCreate$1.invoke2(androidx.activity.n):void");
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(androidx.activity.n r1) {
                    /*
                        r0 = this;
                        androidx.activity.n r1 = (androidx.activity.n) r1
                        r0.invoke2(r1)
                        tf.d r1 = tf.d.f30009a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ReaderLauncherBridgeActivity$onCreate$1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r2 = 3
            r3 = 0
            com.google.android.play.core.assetpacks.b1.m(r6, r3, r1, r2)
            android.content.Intent r6 = r5.getIntent()     // Catch: java.lang.Throwable -> La1
            android.net.Uri r6 = r6.getData()     // Catch: java.lang.Throwable -> La1
            if (r6 == 0) goto L9a
            java.lang.String r1 = r6.getScheme()     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = r6.getHost()     // Catch: java.lang.Throwable -> La1
            java.lang.String r6 = r6.getPath()     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = "PWVQZBxy"
            java.lang.String r4 = "M36iLgj3"
            java.lang.String r3 = ea.a.p(r3, r4)     // Catch: java.lang.Throwable -> La1
            boolean r1 = kotlin.jvm.internal.g.a(r1, r3)     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L96
            java.lang.String r1 = "EW4KdRx0IGktc0hkUWUndFBvJ2chdA=="
            java.lang.String r3 = "7qxnoRGf"
            java.lang.String r1 = ea.a.p(r1, r3)     // Catch: java.lang.Throwable -> La1
            boolean r1 = kotlin.jvm.internal.g.a(r2, r1)     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L96
            r1 = 1
            if (r6 == 0) goto L92
            java.lang.String r2 = "WmwjdSZjMmVy"
            java.lang.String r3 = "GcuBHZFl"
            java.lang.String r2 = ea.a.p(r2, r3)     // Catch: java.lang.Throwable -> La1
            boolean r6 = kotlin.text.j.M(r6, r2, r0)     // Catch: java.lang.Throwable -> La1
            if (r6 != r1) goto L92
            r6 = r1
            goto L93
        L92:
            r6 = r0
        L93:
            if (r6 == 0) goto L96
            goto L97
        L96:
            r1 = r0
        L97:
            tf.d r3 = tf.d.f30009a     // Catch: java.lang.Throwable -> L9f
            goto L9b
        L9a:
            r1 = r0
        L9b:
            kotlin.Result.m13constructorimpl(r3)     // Catch: java.lang.Throwable -> L9f
            goto Laa
        L9f:
            r6 = move-exception
            goto La3
        La1:
            r6 = move-exception
            r1 = r0
        La3:
            kotlin.Result$Failure r6 = androidx.activity.s.v(r6)
            kotlin.Result.m13constructorimpl(r6)
        Laa:
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<pdf.pdfreader.viewer.editor.free.ReaderSplashActivity> r2 = pdf.pdfreader.viewer.editor.free.ReaderSplashActivity.class
            r6.<init>(r5, r2)
            java.lang.String r2 = pdf.pdfreader.viewer.editor.free.ReaderLauncherBridgeActivity.f23852a
            r6.putExtra(r2, r1)
            r5.startActivity(r6)
            r5.overridePendingTransition(r0, r0)
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ReaderLauncherBridgeActivity.onCreate(android.os.Bundle):void");
    }
}
