package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.inmobi.media.Db;
import com.inmobi.media.Y1;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9525a;

    public /* synthetic */ h(int i10) {
        this.f9525a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9525a) {
            case 0:
                if (!k6.a.b(i.class)) {
                    try {
                        j.b(i.c);
                        i.c = new c();
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(i.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                if (c6.e.f5600h == null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.d.a());
                    long j10 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
                    long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
                    c6.k kVar = null;
                    c6.m mVar = null;
                    kVar = null;
                    kVar = null;
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                    if (j10 != 0 && j11 != 0 && string != null) {
                        c6.k kVar2 = new c6.k(Long.valueOf(j10), Long.valueOf(j11));
                        kVar2.f5622d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(com.facebook.d.a());
                        if (defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                            mVar = new c6.m(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
                        }
                        kVar2.f5624f = mVar;
                        kVar2.f5623e = Long.valueOf(System.currentTimeMillis());
                        UUID fromString = UUID.fromString(string);
                        kotlin.jvm.internal.g.d(fromString, "fromString(sessionIDStr)");
                        kVar2.c = fromString;
                        kVar = kVar2;
                    }
                    c6.e.f5600h = kVar;
                    return;
                }
                return;
            case 2:
                Db.b();
                return;
            case 3:
                Y1.a();
                return;
            case 4:
                FileRepository.f24155a.getClass();
                FileRepository.H();
                return;
            default:
                String str = BasePdf2ImageActivity.f25476k0;
                ConcurrentHashMap<String, File> concurrentHashMap = v.f28781a;
                bg.b.z0(new File(v.D(ReaderPdfApplication.m())));
                return;
        }
    }
}
