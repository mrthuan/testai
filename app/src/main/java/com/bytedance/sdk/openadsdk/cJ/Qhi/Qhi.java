package com.bytedance.sdk.openadsdk.cJ.Qhi;

/* compiled from: ADEventMonitor.java */
/* loaded from: classes.dex */
public class Qhi {
    public static final cJ Qhi = new cJ(0);
    public static final cJ cJ = new cJ(1);

    /* renamed from: ac  reason: collision with root package name */
    public static final cJ f8647ac = new cJ(2);
    public static final cJ CJ = new cJ(0);

    /* renamed from: fl  reason: collision with root package name */
    public static final cJ f8648fl = new cJ(1);
    public static final cJ Tgh = new cJ(2);

    public static void Qhi(cJ cJVar, boolean z10, int i10, long j10) {
        try {
            cJVar.ROR.getAndSet(true);
            if (z10) {
                cJVar.Qhi.incrementAndGet();
                cJVar.f8654ac.addAndGet(j10);
                return;
            }
            cJVar.cJ.incrementAndGet();
            Integer num = cJVar.Tgh.get(Integer.valueOf(i10));
            if (num != null) {
                cJVar.Tgh.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
            } else {
                cJVar.Tgh.put(Integer.valueOf(i10), 1);
            }
        } catch (Throwable unused) {
        }
    }

    public static void cJ() {
        try {
            com.bytedance.sdk.openadsdk.Gm.ac.cJ("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.CJ.cJ.cJ("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("tt_sdk_event_net_ad");
            com.bytedance.sdk.openadsdk.Gm.ac.cJ("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.CJ.cJ.cJ("tt_sdk_event_net_state", "tt_sdk_event_net_state", ""));
            com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("tt_sdk_event_net_state");
            com.bytedance.sdk.openadsdk.Gm.ac.cJ("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.CJ.cJ.cJ("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("tt_sdk_event_net_trail");
            com.bytedance.sdk.openadsdk.Gm.ac.cJ("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.CJ.cJ.cJ("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("tt_sdk_event_db_ad");
            com.bytedance.sdk.openadsdk.Gm.ac.cJ("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.CJ.cJ.cJ("tt_sdk_event_db_state", "tt_sdk_event_db_state", ""));
            com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("tt_sdk_event_db_state");
            com.bytedance.sdk.openadsdk.Gm.ac.cJ("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.CJ.cJ.cJ("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("tt_sdk_event_db_trail");
        } catch (Throwable unused) {
        }
    }

    public static void Qhi(cJ cJVar, boolean z10) {
        try {
            cJVar.ROR.getAndSet(true);
            if (z10) {
                cJVar.Qhi.incrementAndGet();
            } else {
                cJVar.cJ.incrementAndGet();
            }
        } catch (Throwable unused) {
        }
    }

    public static void Qhi(cJ cJVar) {
        try {
            cJVar.ROR.getAndSet(true);
            cJVar.f8655fl.incrementAndGet();
        } catch (Throwable unused) {
        }
    }

    public static void Qhi() {
        try {
            cJ cJVar = Qhi;
            if (cJVar.ROR.get()) {
                com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", cJVar.Qhi().toString());
            }
            cJ cJVar2 = cJ;
            if (cJVar2.ROR.get()) {
                com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("tt_sdk_event_net_state", "tt_sdk_event_net_state", cJVar2.Qhi().toString());
            }
            cJ cJVar3 = f8647ac;
            if (cJVar3.ROR.get()) {
                com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", cJVar3.Qhi().toString());
            }
            cJ cJVar4 = CJ;
            if (cJVar4.ROR.get()) {
                com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", cJVar4.cJ().toString());
            }
            cJ cJVar5 = f8648fl;
            if (cJVar5.ROR.get()) {
                com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("tt_sdk_event_db_state", "tt_sdk_event_db_state", cJVar5.cJ().toString());
            }
            cJ cJVar6 = Tgh;
            if (cJVar6.ROR.get()) {
                com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", cJVar6.cJ().toString());
            }
        } catch (Throwable unused) {
        }
    }
}
