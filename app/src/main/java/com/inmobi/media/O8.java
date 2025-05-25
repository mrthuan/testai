package com.inmobi.media;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

/* loaded from: classes2.dex */
public final class O8 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14555a;

    /* renamed from: b  reason: collision with root package name */
    public final A4 f14556b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14557d;

    /* renamed from: e  reason: collision with root package name */
    public final SignalsConfig.NovatiqConfig f14558e;

    public O8(Context context, A4 a42) {
        TelephonyManager telephonyManager;
        String string;
        kotlin.jvm.internal.g.e(context, "context");
        this.f14555a = context;
        this.f14556b = a42;
        this.c = "";
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        SignalsConfig.NovatiqConfig novatiqConfig = ((SignalsConfig) AbstractC1773q4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getNovatiqConfig();
        this.f14558e = novatiqConfig;
        if (novatiqConfig.isNovatiqEnabled()) {
            Object systemService = context.getSystemService("phone");
            if (systemService instanceof TelephonyManager) {
                telephonyManager = (TelephonyManager) systemService;
            } else {
                telephonyManager = null;
            }
            String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
            String str = networkOperatorName != null ? networkOperatorName : "";
            List<String> carrierNames = novatiqConfig.getCarrierNames();
            if (!(carrierNames instanceof Collection) || !carrierNames.isEmpty()) {
                for (String str2 : carrierNames) {
                    if (kotlin.text.k.O(str, str2, true)) {
                        this.f14557d = true;
                        StringBuilder sb2 = new StringBuilder();
                        Random random = new Random();
                        for (int i10 = 0; i10 < 40; i10++) {
                            char charAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i10);
                            if (charAt == 'x') {
                                sb2.append(Character.forDigit(random.nextInt(16), 16));
                            } else {
                                sb2.append(charAt);
                            }
                        }
                        String sb3 = sb2.toString();
                        kotlin.jvm.internal.g.d(sb3, "toString(...)");
                        this.c = sb3;
                        Context context2 = this.f14555a;
                        kotlin.jvm.internal.g.e(context2, "context");
                        int i11 = context2.getApplicationInfo().labelRes;
                        if (i11 == 0) {
                            string = context2.getApplicationInfo().nonLocalizedLabel.toString();
                        } else {
                            string = context2.getString(i11);
                            kotlin.jvm.internal.g.b(string);
                        }
                        new Q8(new P8(sb3, kotlin.text.j.J(string, '_').concat("_app"), this.f14558e), this.f14556b).a(new N8(this));
                        return;
                    }
                }
            }
        }
        A4 a43 = this.f14556b;
        if (a43 != null) {
            ((B4) a43).a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }
}
