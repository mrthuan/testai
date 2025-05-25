package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class Kc extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object obj;
        boolean z10;
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(intent, "intent");
        Context context2 = Lc.f14440b;
        if (context2 != null) {
            obj = context2.getSystemService("wifi");
        } else {
            obj = null;
        }
        kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        Lc.f14439a.a();
        List<ScanResult> scanResults = ((WifiManager) obj).getScanResults();
        if ((Na.a().getWifiFlag() & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = !z10;
        ArrayList arrayList = new ArrayList();
        if (scanResults != null) {
            for (ScanResult scanResult : scanResults) {
                String str = scanResult.SSID;
                if (!z11 || str == null || !kotlin.text.j.F(str, "_nomap", false)) {
                    Ic ic2 = new Ic();
                    String BSSID = scanResult.BSSID;
                    kotlin.jvm.internal.g.d(BSSID, "BSSID");
                    ic2.f14351a = Jc.a(BSSID);
                    arrayList.add(ic2);
                }
            }
        }
        Lc.f14443f = arrayList;
    }
}
