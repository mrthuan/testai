package com.bytedance.sdk.openadsdk.core.ROR.cJ;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.bxS;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.ROR.cJ.Qhi;
import com.bytedance.sdk.openadsdk.core.ROR.cJ.cJ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.js;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VastTracker.java */
/* loaded from: classes.dex */
public class ac {
    private boolean CJ;
    private final String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8971ac;
    private EnumC0115ac cJ;

    /* renamed from: fl  reason: collision with root package name */
    private static final Map<String, cJ> f8970fl = new ConcurrentHashMap();
    private static final AtomicBoolean Tgh = new AtomicBoolean(false);

    /* compiled from: VastTracker.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private final String Qhi;
        private EnumC0115ac cJ = EnumC0115ac.TRACKING_URL;

        /* renamed from: ac  reason: collision with root package name */
        private boolean f8975ac = false;

        public Qhi(String str) {
            this.Qhi = str;
        }

        public Qhi Qhi(boolean z10) {
            this.f8975ac = z10;
            return this;
        }

        public ac Qhi() {
            return new ac(this.Qhi, this.cJ, Boolean.valueOf(this.f8975ac));
        }
    }

    /* compiled from: VastTracker.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ROR.cJ.ac$ac  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0115ac {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    /* compiled from: VastTracker.java */
    /* loaded from: classes.dex */
    public static class cJ {
        String Qhi;

        /* renamed from: ac  reason: collision with root package name */
        float f8977ac;
        tP cJ;

        public cJ(String str, tP tPVar) {
            this(str, tPVar, -1.0f);
        }

        public cJ(String str, tP tPVar, float f10) {
            this.Qhi = str;
            this.cJ = tPVar;
            this.f8977ac = f10;
        }
    }

    static {
        bxS.Qhi(new bxS.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.ROR.cJ.ac.1
            @Override // com.bytedance.sdk.component.utils.bxS.Qhi
            public void Qhi(Context context, Intent intent, boolean z10, int i10) {
                if (i10 != 0 && ac.f8970fl.size() > 0) {
                    ac.cJ();
                }
            }
        }, HzH.Qhi());
    }

    public ac(String str, EnumC0115ac enumC0115ac, Boolean bool) {
        this.Qhi = str;
        this.cJ = enumC0115ac;
        this.f8971ac = bool.booleanValue();
    }

    public static void cJ(List<ac> list, com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi qhi, long j10, String str) {
        Qhi(list, qhi, j10, str, null);
    }

    public boolean CJ() {
        return this.f8971ac;
    }

    public String ac() {
        return this.Qhi;
    }

    public boolean fl() {
        return this.CJ;
    }

    public void k_() {
        this.CJ = true;
    }

    public static List<String> Qhi(List<ac> list, com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi qhi, long j10, String str) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ac acVar : list) {
            if (acVar != null && (!acVar.fl() || acVar.CJ())) {
                arrayList.add(acVar.ac());
                acVar.k_();
            }
        }
        return new com.bytedance.sdk.openadsdk.core.ROR.ac.ac(arrayList).Qhi(qhi).Qhi(j10).Qhi(str).Qhi();
    }

    public static List<com.bytedance.sdk.openadsdk.core.ROR.cJ.Qhi> ac(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new Qhi.C0114Qhi(optJSONObject.optString("content"), optJSONObject.optLong("trackingMilliseconds", 0L)).Qhi());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cJ() {
        if (Tgh.compareAndSet(false, true)) {
            Map<String, cJ> map = f8970fl;
            HashSet hashSet = new HashSet(map.entrySet());
            map.clear();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry != null) {
                    Qhi((String) entry.getKey(), (cJ) entry.getValue(), true);
                }
            }
            Tgh.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cJ(final boolean z10, final String str, final String str2, final cJ cJVar, final String str3, final boolean z11) {
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(new hm("dsp_track_link_result") { // from class: com.bytedance.sdk.openadsdk.core.ROR.cJ.ac.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", cJVar.Qhi);
                    jSONObject.put("success", z10);
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put(InMobiNetworkValues.DESCRIPTION, str);
                    }
                    jSONObject.put(InMobiNetworkValues.URL, str3);
                    float f10 = cJVar.f8977ac;
                    if (f10 >= 0.0f) {
                        jSONObject.put("progress", Math.round(f10 * 100.0f) / 100.0d);
                    }
                    if (z11) {
                        jSONObject.put("retry", true);
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.cJ.ac.cJ(cJVar.cJ, str2, "dsp_track_link_result", jSONObject);
            }
        });
    }

    public static List<com.bytedance.sdk.openadsdk.core.ROR.cJ.cJ> cJ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new cJ.Qhi(optJSONObject.optString("content"), (float) optJSONObject.optDouble("trackingFraction", 0.0d)).Qhi());
                }
            }
        }
        return arrayList;
    }

    public static void Qhi(List<ac> list, com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi qhi, long j10, String str, cJ cJVar) {
        Qhi(Qhi(list, qhi, j10, str), cJVar);
    }

    public static void Qhi(List<String> list, cJ cJVar) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (!TextUtils.isEmpty(str)) {
                Qhi(str, cJVar, false);
            }
        }
    }

    private static void Qhi(final String str, final cJ cJVar, final boolean z10) {
        com.bytedance.sdk.component.ROR.cJ.cJ ac2 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().ac();
        if (ac2 == null) {
            return;
        }
        ac2.Qhi(true);
        ac2.cJ(str);
        ac2.Qhi(new com.bytedance.sdk.component.ROR.Qhi.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.ROR.cJ.ac.2
            @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
            public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, com.bytedance.sdk.component.ROR.cJ cJVar2) {
                boolean z11;
                cJ cJVar3 = cJ.this;
                if (cJVar3 == null || cJVar3.cJ == null) {
                    return;
                }
                String str2 = null;
                if (cJVar2 == null || !cJVar2.Tgh()) {
                    z11 = false;
                    if (cJVar2 != null) {
                        str2 = cJVar2.Qhi() + ":" + cJVar2.cJ();
                        if (!z10 && (cJVar2.Qhi() <= 300 || cJVar2.Qhi() >= 400)) {
                            ac.f8970fl.put(str, cJ.this);
                        }
                    }
                } else {
                    z11 = true;
                }
                ac.cJ(z11, str2, js.ac(cJ.this.cJ.sqa()), cJ.this, str, z10);
                if (cJVar2 == null || cJVar2.Qhi() != 200 || ac.f8970fl.size() <= 0) {
                    return;
                }
                ac.cJ();
            }

            @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
            public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException) {
                tP tPVar;
                cJ cJVar2 = cJ.this;
                if (cJVar2 != null && (tPVar = cJVar2.cJ) != null) {
                    ac.cJ(false, iOException != null ? iOException.getMessage() : null, js.ac(tPVar.sqa()), cJ.this, str, z10);
                }
                if (z10 || cJ.this == null) {
                    return;
                }
                ac.f8970fl.put(str, cJ.this);
            }
        });
    }

    public static JSONArray Qhi(List<ac> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            jSONArray.put(list.get(i10).ac());
        }
        return jSONArray;
    }

    public static List<ac> Qhi(JSONArray jSONArray) {
        return Qhi(jSONArray, false);
    }

    public static List<ac> Qhi(JSONArray jSONArray, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String optString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new Qhi(optString).Qhi(z10).Qhi());
                }
            }
        }
        return arrayList;
    }
}
