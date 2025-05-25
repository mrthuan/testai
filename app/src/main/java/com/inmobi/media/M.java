package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class M extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N f14446a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AdQualityResult f14447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n10, AdQualityResult adQualityResult) {
        super(1);
        this.f14446a = n10;
        this.f14447b = adQualityResult;
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        M9 m92;
        M9 m93;
        D8 d82 = (D8) obj;
        if (!EnumC1849w3.f15553d.equals(d82)) {
            if (d82 == null) {
                WeakReference weakReference = (WeakReference) this.f14446a.f14503d.get(this.f14447b.getBeaconUrl());
                if (weakReference != null && (m93 = (M9) weakReference.get()) != null) {
                    m93.f14487a.b("window.mraidview.broadcastEvent('AdReportSuccess')");
                }
            } else {
                WeakReference weakReference2 = (WeakReference) this.f14446a.f14503d.get(this.f14447b.getBeaconUrl());
                if (weakReference2 != null && (m92 = (M9) weakReference2.get()) != null) {
                    m92.f14487a.b("window.mraidview.broadcastEvent('AdReportFailed')");
                }
            }
            N n10 = this.f14446a;
            AdQualityResult result = this.f14447b;
            n10.getClass();
            kotlin.jvm.internal.g.e(result, "result");
            try {
                ScheduledExecutorService scheduledExecutorService = P.f14562a;
                S s4 = (S) AbstractC1882ya.f15685a.getValue();
                s4.getClass();
                s4.a("image_location=?", new String[]{result.getImageLocation()});
                Q q5 = s4.f14621b;
                if (result.getImageLocation().length() != 0) {
                    String message = "delete file result - " + new File(result.getImageLocation()).delete();
                    kotlin.jvm.internal.g.e(message, "message");
                }
            } catch (Exception unused) {
            }
        }
        return tf.d.f30009a;
    }
}
