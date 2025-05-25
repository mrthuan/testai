package a8;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class f2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f160b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f161d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f162e;

    public f2(com.android.billingclient.api.a0 a0Var, String str, Bundle bundle) {
        this.f159a = 0;
        this.f162e = a0Var;
        this.f160b = str;
        this.c = "_err";
        this.f161d = bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
        if (r8.o(r7) == null) goto L17;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.f159a
            java.lang.Object r1 = r12.f161d
            java.lang.Object r2 = r12.c
            java.lang.Object r3 = r12.f160b
            java.lang.Object r4 = r12.f162e
            switch(r0) {
                case 0: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L43
        Le:
            com.android.billingclient.api.a0 r4 = (com.android.billingclient.api.a0) r4
            java.lang.Object r0 = r4.f6179b
            com.google.android.gms.measurement.internal.zzlg r0 = (com.google.android.gms.measurement.internal.zzlg) r0
            com.google.android.gms.measurement.internal.zzlo r5 = r0.K()
            java.lang.String r3 = (java.lang.String) r3
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.Object r0 = r4.f6179b
            com.google.android.gms.measurement.internal.zzlg r0 = (com.google.android.gms.measurement.internal.zzlg) r0
            com.google.android.gms.common.util.Clock r0 = r0.zzax()
            com.google.android.gms.common.util.DefaultClock r0 = (com.google.android.gms.common.util.DefaultClock) r0
            r0.getClass()
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = "auto"
            r11 = 0
            com.google.android.gms.measurement.internal.zzaw r0 = r5.v0(r6, r7, r8, r9, r11)
            java.lang.Object r1 = r4.f6179b
            com.google.android.gms.measurement.internal.zzlg r1 = (com.google.android.gms.measurement.internal.zzlg) r1
            com.google.android.gms.common.internal.Preconditions.j(r0)
            r1.e(r0, r3)
            return
        L43:
            com.google.android.play.core.assetpacks.m1 r3 = (com.google.android.play.core.assetpacks.m1) r3
            java.util.List r2 = (java.util.List) r2
            com.google.android.play.core.assetpacks.c0 r1 = (com.google.android.play.core.assetpacks.c0) r1
            com.google.android.gms.tasks.TaskCompletionSource r4 = (com.google.android.gms.tasks.TaskCompletionSource) r4
            r3.getClass()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
        L59:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L98
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            r8 = r1
            com.google.android.play.core.assetpacks.j2 r8 = (com.google.android.play.core.assetpacks.j2) r8
            com.google.android.play.core.assetpacks.m2 r8 = r8.f13276a
            com.google.android.play.core.assetpacks.d0 r8 = r8.f13315a
            r8.getClass()
            r9 = 1
            r10 = 0
            java.lang.String r11 = r8.o(r7)     // Catch: java.io.IOException -> L79
            if (r11 == 0) goto L79
            r11 = r9
            goto L7a
        L79:
            r11 = r10
        L7a:
            java.lang.String r8 = r8.o(r7)     // Catch: java.io.IOException -> L81
            if (r8 == 0) goto L81
            goto L82
        L81:
            r9 = r10
        L82:
            if (r9 == 0) goto L86
            r8 = 4
            goto L88
        L86:
            r8 = 8
        L88:
            com.google.android.play.core.assetpacks.i0 r8 = r3.l(r8, r7)     // Catch: com.google.android.play.core.common.LocalTestingException -> L93
            long r9 = r8.f13259e
            long r5 = r5 + r9
            r0.put(r7, r8)
            goto L59
        L93:
            r0 = move-exception
            r4.a(r0)
            goto La0
        L98:
            com.google.android.play.core.assetpacks.j0 r1 = new com.google.android.play.core.assetpacks.j0
            r1.<init>(r5, r0)
            r4.b(r1)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.f2.run():void");
    }

    public /* synthetic */ f2(com.google.android.play.core.assetpacks.m1 m1Var, List list, com.google.android.play.core.assetpacks.j2 j2Var, TaskCompletionSource taskCompletionSource) {
        this.f159a = 1;
        this.f160b = m1Var;
        this.c = list;
        this.f161d = j2Var;
        this.f162e = taskCompletionSource;
    }
}
