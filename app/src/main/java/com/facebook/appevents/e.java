package com.facebook.appevents;

import com.facebook.appevents.l;
import com.facebook.appevents.ml.ModelManager;
import com.inmobi.media.C1566b3;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9516a;

    public /* synthetic */ e(int i10) {
        this.f9516a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9516a) {
            case 0:
                if (!k6.a.b(i.class)) {
                    try {
                        i.f9529e = null;
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = l.c;
                        if (l.a.c() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY) {
                            i.d(FlushReason.TIMER);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(i.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                ModelManager modelManager = ModelManager.f9619a;
                if (!k6.a.b(ModelManager.class)) {
                    try {
                        f6.d.a();
                        return;
                    } catch (Throwable th3) {
                        k6.a.a(ModelManager.class, th3);
                        return;
                    }
                }
                return;
            case 2:
                C1566b3.I();
                return;
            default:
                pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
                if (aVar != null) {
                    aVar.startWatching();
                    return;
                }
                return;
        }
    }
}
