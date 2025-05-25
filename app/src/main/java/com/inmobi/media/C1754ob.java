package com.inmobi.media;

import android.os.Build;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.LinkedHashMap;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.inmobi.media.ob  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1754ob {

    /* renamed from: a  reason: collision with root package name */
    public TelemetryConfig f15364a;

    public C1754ob(TelemetryConfig telemetryConfig) {
        kotlin.jvm.internal.g.e(telemetryConfig, "telemetryConfig");
        this.f15364a = telemetryConfig;
        Ha.f().a(new int[]{ShapeTypes.FLOW_CHART_EXTRACT, ShapeTypes.FLOW_CHART_OFFLINE_STORAGE}, new C1741nb(this));
    }

    public final void a(H0 h02) {
        if (Build.VERSION.SDK_INT < 30 || h02 == null || h02.f14308g != 6) {
            return;
        }
        a("ANREvent", h02);
    }

    public final void a(String str, R4 r4) {
        if (this.f15364a.getPriorityEventsList().contains(str) && r4 != null && Vb.a(r4)) {
            C1616eb.b(str, new LinkedHashMap(), EnumC1686jb.f15238a);
        }
    }
}
