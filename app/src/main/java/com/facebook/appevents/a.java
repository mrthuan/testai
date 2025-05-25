package com.facebook.appevents;

import android.content.Context;
import android.os.Environment;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.k;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.inmobi.media.C1566b3;
import com.inmobi.media.C1732n2;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.data.RecentAddRepository;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9469a;

    public /* synthetic */ a(int i10) {
        this.f9469a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set<AccessTokenAppIdPair> set = null;
        set = null;
        r2 = null;
        ArrayList<String> a10 = null;
        switch (this.f9469a) {
            case 0:
                b.f9470a.getClass();
                b.a();
                return;
            case 1:
                HashSet hashSet = new HashSet();
                String str = i.f9526a;
                if (!k6.a.b(i.class)) {
                    try {
                        set = i.c.e();
                    } catch (Throwable th2) {
                        k6.a.a(i.class, th2);
                    }
                }
                for (AccessTokenAppIdPair accessTokenAppIdPair : set) {
                    hashSet.add(accessTokenAppIdPair.getApplicationId());
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    FetchedAppSettingsManager.k((String) it.next(), true);
                }
                return;
            case 2:
                Context a11 = com.facebook.d.a();
                com.facebook.appevents.iap.a.a(com.facebook.appevents.iap.a.f9534a, a11, a6.j.f(a11, com.facebook.appevents.iap.a.f9540h), false);
                Object obj = com.facebook.appevents.iap.a.f9540h;
                if (!k6.a.b(a6.j.class)) {
                    try {
                        a6.j jVar = a6.j.f80a;
                        a10 = jVar.a(jVar.e(a11, obj, "subs"));
                    } catch (Throwable th3) {
                        k6.a.a(a6.j.class, th3);
                    }
                }
                com.facebook.appevents.iap.a.a(com.facebook.appevents.iap.a.f9534a, a11, a10, true);
                return;
            case 3:
                AtomicBoolean atomicBoolean = com.facebook.internal.k.c;
                if (!k6.a.b(com.facebook.internal.k.class)) {
                    try {
                        for (k.d dVar : com.facebook.internal.k.f9808b) {
                            dVar.a();
                        }
                        atomicBoolean.set(false);
                        return;
                    } catch (Throwable th4) {
                        k6.a.a(com.facebook.internal.k.class, th4);
                        return;
                    }
                }
                return;
            case 4:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f9923a;
                return;
            case 5:
                C1566b3.K();
                return;
            case 6:
                C1732n2.a();
                return;
            case 7:
                InMobiUnifiedIdService.a();
                return;
            case 8:
                FileRepository fileRepository = FileRepository.f24155a;
                if (!RecentAddRepository.f24181a) {
                    FileRepository.f24155a.getClass();
                    RecentAddRepository.q(kotlin.collections.m.E0(FileRepository.n()));
                    return;
                }
                return;
            default:
                pdf.pdfreader.viewer.editor.free.utils.init.b bVar = pdf.pdfreader.viewer.editor.free.utils.init.b.f28709a;
                Context m10 = ReaderPdfApplication.m();
                if (m10 != null) {
                    v.l(m10, null);
                    v.l(m10, Environment.DIRECTORY_DOCUMENTS);
                    v.l(m10, Environment.DIRECTORY_PICTURES);
                    return;
                }
                ConcurrentHashMap<String, File> concurrentHashMap = v.f28781a;
                return;
        }
    }
}
