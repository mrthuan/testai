package com.inmobi.media;

import android.database.sqlite.SQLiteException;
import com.inmobi.adquality.models.AdQualityResult;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.inmobi.media.x9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1868x9 implements X {

    /* renamed from: a  reason: collision with root package name */
    public final AdQualityResult f15656a;

    public C1868x9(AdQualityResult result) {
        kotlin.jvm.internal.g.e(result, "result");
        this.f15656a = result;
    }

    @Override // com.inmobi.media.X
    public final Object a() {
        boolean z10;
        try {
            ScheduledExecutorService scheduledExecutorService = P.f14562a;
            ((S) AbstractC1882ya.f15685a.getValue()).a(this.f15656a);
            z10 = true;
        } catch (SQLiteException unused) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
