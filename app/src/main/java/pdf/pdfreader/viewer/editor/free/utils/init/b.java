package pdf.pdfreader.viewer.editor.free.utils.init;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzj;
import h5.c;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.x;
import pdf.pdfreader.viewer.editor.free.data.RecentAddRepository;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.l;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import u1.d;
import x9.c;

/* compiled from: AppInitHelper.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f28709a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f28710b;

    static {
        ea.a.p("cnBESVdpBkgtbBZlcg==", "Xs349rw1");
        f28709a = new b();
    }

    public static void a(Activity activity) {
        g.e(activity, "activity");
        if (!aj.b.f569q) {
            aj.b.f569q = true;
            ce.g a10 = ce.g.a();
            b.b bVar = new b.b();
            a10.getClass();
            Context applicationContext = activity.getApplicationContext();
            a10.c = bVar;
            try {
                fe.a.a().b("ConsentManager init...");
                c.a aVar = new c.a();
                aVar.f31631a = false;
                zzj zzb = zza.zza(applicationContext).zzb();
                a10.f5686a = zzb;
                zzb.requestConsentInfoUpdate(activity, new c(aVar), new ce.b(a10, applicationContext, bVar), new ce.c(applicationContext, bVar));
            } catch (Throwable th2) {
                fe.a.a().c(th2);
                th2.getMessage();
                bVar.c();
            }
        }
        if (!EventCenter.a.f28669a) {
            c5.a.b().getClass();
            Context context = activity.getApplicationContext();
            g.e(context, "context");
            c.a aVar2 = h5.c.f18014h;
            if (aVar2.a(context).c() != 0) {
                aVar2.a(context).g(aVar2.a(context).c() + 1);
            }
            EventCenter.a.f28669a = true;
        }
        l.f28721a.getClass();
        w0.a().c.execute(new d(activity, 2));
        w0.a().c.execute(new com.facebook.appevents.a(9));
        boolean f10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.f(activity);
        if (f10) {
            EventCenter.f28662i = true;
        }
        EventCenter.f28655a = f10;
        String h10 = a0.a.h("countryCode ", com.google.android.play.core.assetpacks.c.x(activity));
        int i10 = zk.a.f32399a;
        t1.b(h10);
        c1.b(activity);
        w0.c cVar = w0.a().f28791b;
        cVar.f28792a.postDelayed(new a6.c(7), 1500L);
        if (!RecentAddRepository.f24181a) {
            lg.b bVar2 = j0.f20206a;
            t0.d0(x.a(kotlinx.coroutines.internal.l.f20194a), null, null, new AppInitHelper$watchRecentAdd$1(null), 3);
        }
    }
}
