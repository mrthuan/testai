package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes2.dex */
public final class X2 implements V2 {

    /* renamed from: a  reason: collision with root package name */
    public volatile CrashConfig f14827a;

    /* renamed from: b  reason: collision with root package name */
    public final B6 f14828b;
    public final List c;

    public X2(Context context, CrashConfig crashConfig, B6 eventBus) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(crashConfig, "crashConfig");
        kotlin.jvm.internal.g.e(eventBus, "eventBus");
        this.f14827a = crashConfig;
        this.f14828b = eventBus;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        kotlin.jvm.internal.g.d(synchronizedList, "synchronizedList(...)");
        this.c = synchronizedList;
        if (this.f14827a.getCrashConfig().getEnabled()) {
            synchronizedList.add(new H2(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.f14827a.getANRConfig().getAppExitReason().getEnabled() && C1566b3.f14952a.E()) {
            synchronizedList.add(new G0(context, this, this.f14827a.getANRConfig().getAppExitReason().getIncidentWaitInterval(), this.f14827a.getANRConfig().getAppExitReason().getMaxNumberOfLines()));
        }
        if (this.f14827a.getANRConfig().getWatchdog().getEnabled()) {
            synchronizedList.add(new C1562b(this.f14827a.getANRConfig().getWatchdog().getInterval(), this));
        }
    }

    public final void a(R4 incidentEvent) {
        int i10;
        kotlin.jvm.internal.g.e(incidentEvent, "incidentEvent");
        if ((incidentEvent instanceof H0) && this.f14827a.getANRConfig().getAppExitReason().getEnabled()) {
            i10 = ShapeTypes.FLOW_CHART_OFFLINE_STORAGE;
        } else if ((incidentEvent instanceof I2) && this.f14827a.getCrashConfig().getEnabled()) {
            i10 = ShapeTypes.FLOW_CHART_EXTRACT;
        } else if ((incidentEvent instanceof xc) && this.f14827a.getANRConfig().getWatchdog().getEnabled()) {
            i10 = ShapeTypes.FLOW_CHART_MERGE;
        } else {
            return;
        }
        this.f14828b.b(new H1(i10, incidentEvent.f15672a, pdf.pdfreader.viewer.editor.free.utils.t0.h0(new Pair("data", incidentEvent))));
    }
}
