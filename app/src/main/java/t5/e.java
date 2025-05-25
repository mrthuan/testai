package t5;

import android.animation.ValueAnimator;
import android.database.Cursor;
import android.util.JsonReader;
import android.view.MotionEvent;
import android.view.View;
import c7.p;
import com.facebook.internal.FeatureManager;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.firebase.components.ComponentRegistrar;
import com.lib.flutter.encrypt.NativeSplashApi;
import gf.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import pa.a;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g2;
import w8.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements FeatureManager.a, p.a, g.a, ga.f, a.InterfaceC0328a, b.c, ro.d, g2.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29935a;

    public /* synthetic */ e(int i10) {
        this.f29935a = i10;
    }

    @Override // ga.f
    public final List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // c7.p.a
    public final Object apply(Object obj) {
        switch (this.f29935a) {
            case 3:
                s6.b bVar = p.f5653f;
                throw new SynchronizationException("Timed out while trying to open db.", (Throwable) obj);
            case 4:
                Cursor cursor = (Cursor) obj;
                s6.b bVar2 = p.f5653f;
                if (!cursor.moveToNext()) {
                    return null;
                }
                return Long.valueOf(cursor.getLong(0));
            default:
                Cursor cursor2 = (Cursor) obj;
                s6.b bVar3 = p.f5653f;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (cursor2.moveToNext()) {
                    byte[] blob = cursor2.getBlob(0);
                    arrayList.add(blob);
                    i10 += blob.length;
                }
                byte[] bArr = new byte[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    byte[] bArr2 = (byte[]) arrayList.get(i12);
                    System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                    i11 += bArr2.length;
                }
                return bArr;
        }
    }

    @Override // w8.g.a
    public final void b(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.g2.f
    public final void c(boolean z10) {
        int i10 = BaseOperatePDFActivity.Z;
    }

    @Override // pa.a.InterfaceC0328a
    public final Object d(JsonReader jsonReader) {
        return pa.a.a(jsonReader);
    }

    @Override // ro.d
    public final void g(MotionEvent motionEvent) {
        ExecutorService executorService = ReaderAIPreviewActivity.f24476z1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[Catch: all -> 0x005c, TryCatch #4 {all -> 0x005c, blocks: (B:9:0x0014, B:11:0x0022, B:12:0x0025, B:14:0x0027, B:19:0x0040, B:21:0x0044, B:22:0x0056, B:23:0x005b, B:16:0x0030, B:18:0x0039), top: B:45:0x0014, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[Catch: all -> 0x005c, TryCatch #4 {all -> 0x005c, blocks: (B:9:0x0014, B:11:0x0022, B:12:0x0025, B:14:0x0027, B:19:0x0040, B:21:0x0044, B:22:0x0056, B:23:0x005b, B:16:0x0030, B:18:0x0039), top: B:45:0x0014, inners: #4 }] */
    @Override // com.facebook.internal.FeatureManager.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(boolean r6) {
        /*
            r5 = this;
            int r0 = r5.f29935a
            switch(r0) {
                case 0: goto L61;
                case 1: goto L7;
                default: goto L5;
            }
        L5:
            goto L8c
        L7:
            if (r6 == 0) goto L60
            z5.a r6 = z5.a.f32295a
            java.lang.Class<z5.a> r6 = z5.a.class
            boolean r0 = k6.a.b(r6)
            if (r0 == 0) goto L14
            goto L60
        L14:
            android.content.Context r0 = com.facebook.d.a()     // Catch: java.lang.Throwable -> L5c
            y5.a r1 = new y5.a     // Catch: java.lang.Throwable -> L5c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            z5.a.f32296b = r1     // Catch: java.lang.Throwable -> L5c
            com.facebook.d r0 = com.facebook.d.f9685a     // Catch: java.lang.Throwable -> L5c
            r0 = 0
            pdf.pdfreader.viewer.editor.free.utils.t0.G()     // Catch: java.lang.NoSuchMethodError -> L26 java.lang.NoClassDefFoundError -> L2f java.lang.Exception -> L38 java.lang.Throwable -> L5c
            throw r0     // Catch: java.lang.NoSuchMethodError -> L26 java.lang.NoClassDefFoundError -> L2f java.lang.Exception -> L38 java.lang.Throwable -> L5c
        L26:
            r1 = move-exception
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L5c
            r1.toString()     // Catch: java.lang.Throwable -> L5c
            goto L40
        L2f:
            r1 = move-exception
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L5c
            r1.toString()     // Catch: java.lang.Throwable -> L5c
            goto L40
        L38:
            r1 = move-exception
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L5c
            r1.toString()     // Catch: java.lang.Throwable -> L5c
        L40:
            y5.a r1 = z5.a.f32296b     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L56
            java.lang.String r0 = "gps_pa_failed"
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> L5c
            r3.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "gps_pa_failed_reason"
            r3.putString(r4, r2)     // Catch: java.lang.Throwable -> L5c
            tf.d r2 = tf.d.f30009a     // Catch: java.lang.Throwable -> L5c
            r1.a(r3, r0)     // Catch: java.lang.Throwable -> L5c
            goto L60
        L56:
            java.lang.String r1 = "gpsDebugLogger"
            kotlin.jvm.internal.g.i(r1)     // Catch: java.lang.Throwable -> L5c
            throw r0     // Catch: java.lang.Throwable -> L5c
        L5c:
            r0 = move-exception
            k6.a.a(r6, r0)
        L60:
            return
        L61:
            if (r6 == 0) goto L8b
            boolean r6 = com.facebook.n.c()
            if (r6 != 0) goto L6a
            goto L8b
        L6a:
            com.facebook.internal.FeatureManager$Feature r6 = com.facebook.internal.FeatureManager.Feature.CrashReport
            u0.a r0 = new u0.a
            r1 = 4
            r0.<init>(r1)
            com.facebook.internal.FeatureManager.a(r0, r6)
            com.facebook.internal.FeatureManager$Feature r6 = com.facebook.internal.FeatureManager.Feature.ErrorReport
            com.facebook.appevents.m r0 = new com.facebook.appevents.m
            r1 = 2
            r0.<init>(r1)
            com.facebook.internal.FeatureManager.a(r0, r6)
            com.facebook.internal.FeatureManager$Feature r6 = com.facebook.internal.FeatureManager.Feature.AnrReport
            t5.i r0 = new t5.i
            r1 = 3
            r0.<init>(r1)
            com.facebook.internal.FeatureManager.a(r0, r6)
        L8b:
            return
        L8c:
            if (r6 == 0) goto La6
            com.facebook.appevents.integrity.ProtectedModeManager r6 = com.facebook.appevents.integrity.ProtectedModeManager.f9605a
            java.lang.Class<com.facebook.appevents.integrity.ProtectedModeManager> r6 = com.facebook.appevents.integrity.ProtectedModeManager.class
            boolean r0 = k6.a.b(r6)
            if (r0 == 0) goto L99
            goto La6
        L99:
            r0 = 1
            com.facebook.appevents.integrity.ProtectedModeManager.f9606b = r0     // Catch: java.lang.Throwable -> La2
            com.facebook.appevents.integrity.ProtectedModeManager r0 = com.facebook.appevents.integrity.ProtectedModeManager.f9605a     // Catch: java.lang.Throwable -> La2
            r0.a()     // Catch: java.lang.Throwable -> La2
            goto La6
        La2:
            r0 = move-exception
            k6.a.a(r6, r0)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.e.k(boolean):void");
    }

    @Override // gf.b.c
    public final void n(Object obj, gf.a aVar) {
        List h10;
        NativeSplashApi.Companion companion = NativeSplashApi.Companion.f15741a;
        ea.a.p("PWVBbHk=", "CMpLlLTJ");
        try {
            NativeSplashApi nativeSplashApi = NativeSplashApi.Companion.c;
            if (nativeSplashApi != null) {
                nativeSplashApi.c0();
            }
            h10 = ge.a.H(null);
        } catch (Throwable th2) {
            h10 = b.b.h(th2);
        }
        aVar.i(h10);
    }
}
