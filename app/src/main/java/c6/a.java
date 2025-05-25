package c6;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.n;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIDataBase;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5587a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f5588b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(long j10, cg.l lVar) {
        this.c = lVar;
        this.f5588b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        int i10;
        switch (this.f5587a) {
            case 0:
                long j11 = this.f5588b;
                String activityName = (String) this.c;
                kotlin.jvm.internal.g.e(activityName, "$activityName");
                if (e.f5600h == null) {
                    e.f5600h = new k(Long.valueOf(j11), null);
                }
                k kVar = e.f5600h;
                if (kVar != null) {
                    kVar.f5621b = Long.valueOf(j11);
                }
                if (e.f5599g.get() <= 0) {
                    d dVar = new d(0, j11, activityName);
                    synchronized (e.f5598f) {
                        ScheduledExecutorService scheduledExecutorService = e.c;
                        e.f5594a.getClass();
                        com.facebook.internal.f b10 = FetchedAppSettingsManager.b(com.facebook.d.b());
                        if (b10 == null) {
                            i10 = 60;
                        } else {
                            i10 = b10.f9767b;
                        }
                        e.f5597e = scheduledExecutorService.schedule(dVar, i10, TimeUnit.SECONDS);
                        tf.d dVar2 = tf.d.f30009a;
                    }
                }
                long j12 = e.f5603k;
                if (j12 > 0) {
                    j10 = (j11 - j12) / 1000;
                } else {
                    j10 = 0;
                }
                g gVar = g.f5608a;
                Context a10 = com.facebook.d.a();
                com.facebook.internal.f k10 = FetchedAppSettingsManager.k(com.facebook.d.b(), false);
                if (k10 != null && k10.c && j10 > 0) {
                    com.facebook.appevents.l lVar = new com.facebook.appevents.l(a10, (String) null);
                    Bundle bundle = new Bundle(1);
                    bundle.putCharSequence("fb_aa_time_spent_view_name", activityName);
                    double d10 = j10;
                    if (n.c()) {
                        lVar.e("fb_aa_time_spent_on_view", d10, bundle);
                    }
                }
                k kVar2 = e.f5600h;
                if (kVar2 != null) {
                    kVar2.a();
                    return;
                }
                return;
            default:
                cg.l lVar2 = (cg.l) this.c;
                AIDataBase aIDataBase = km.e.f19907a;
                if (lVar2 != null) {
                    lVar2.invoke(Long.valueOf(this.f5588b));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ a(long j10, String str) {
        this.f5588b = j10;
        this.c = str;
    }
}
