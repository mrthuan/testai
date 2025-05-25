package com.bytedance.sdk.openadsdk.pA.Qhi.Qhi;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.lB;
import com.bytedance.sdk.openadsdk.core.model.EBS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: GPDownLoader.java */
/* loaded from: classes.dex */
public class ac implements fl {

    /* renamed from: fl  reason: collision with root package name */
    protected static Boolean f9353fl;
    protected com.bytedance.sdk.openadsdk.core.model.ac Qhi;
    protected int ROR;
    private final WeakReference<Context> Sf;

    /* renamed from: ac  reason: collision with root package name */
    protected String f9354ac;
    protected tP cJ;
    protected boolean CJ = false;
    protected final AtomicBoolean Tgh = new AtomicBoolean(false);

    /* renamed from: hm  reason: collision with root package name */
    private boolean f9355hm = false;

    public ac(Context context, tP tPVar, String str) {
        this.Sf = new WeakReference<>(context);
        this.cJ = tPVar;
        this.Qhi = tPVar.pv();
        this.f9354ac = str;
        "====tag===".concat(String.valueOf(str));
        if (HzH.Qhi() == null) {
            HzH.cJ(context);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl
    public void CJ() {
        if (ac() == null) {
            return;
        }
        if (cJ()) {
            this.Tgh.set(true);
            this.cJ.ac(true);
        } else if (Qhi()) {
            this.cJ.ac(true);
        } else if (Tgh()) {
        } else {
            if (fl()) {
                this.cJ.ac(true);
            } else if (this.cJ.pv() == null && this.cJ.YB() != null) {
                lB.Qhi(ac(), this.cJ.YB(), this.cJ, js.Qhi(this.f9354ac), this.f9354ac, true);
                this.cJ.ac(true);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl
    public void Qhi(boolean z10) {
        this.f9355hm = z10;
    }

    public boolean Tgh() {
        EBS NLs;
        IPMiBroadcastReceiver Qhi;
        try {
            tP tPVar = this.cJ;
            if (tPVar == null || (NLs = tPVar.NLs()) == null || TextUtils.isEmpty(NLs.cJ())) {
                return false;
            }
            if (NLs.Qhi() && this.cJ.pv() != null && !TextUtils.isEmpty(this.cJ.pv().ac()) && (Qhi = IPMiBroadcastReceiver.Qhi(ac())) != null) {
                Qhi.Qhi(this.cJ.pv().ac(), this.cJ);
            }
            final boolean Qhi2 = cJ.Qhi(ac(), NLs.cJ(), this.cJ);
            lG.cJ(new hm("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.ac.1
                @Override // java.lang.Runnable
                public void run() {
                    if (Qhi2) {
                        com.bytedance.sdk.openadsdk.core.hm.Qhi("oem_store", "1");
                    } else {
                        com.bytedance.sdk.openadsdk.core.hm.Qhi("oem_store", "-2");
                    }
                }
            });
            return Qhi2;
        } catch (Throwable th2) {
            ABk.Qhi("GPDownLoader", th2.getMessage());
            return false;
        }
    }

    public Context ac() {
        WeakReference<Context> weakReference = this.Sf;
        if (weakReference != null && weakReference.get() != null) {
            return this.Sf.get();
        }
        return HzH.Qhi();
    }

    public boolean cJ() {
        com.bytedance.sdk.openadsdk.core.fl.Qhi(this.cJ, this.f9354ac, 1, null);
        if (this.cJ.ReL() != null) {
            String Qhi = this.cJ.ReL().Qhi();
            if (!TextUtils.isEmpty(Qhi)) {
                Uri parse = Uri.parse(Qhi);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                js.cJ cJ = js.cJ(ac(), intent);
                if (cJ.cJ > 0) {
                    if (!(ac() instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    try {
                        HashMap hashMap = new HashMap();
                        Qhi(hashMap);
                        hashMap.put("matched_count", Integer.valueOf(cJ.cJ));
                        hashMap.put(InMobiNetworkValues.URL, Qhi);
                        ComponentName componentName = cJ.Qhi;
                        if (componentName != null) {
                            intent.setComponent(componentName);
                        }
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.cJ, this.f9354ac, "open_url_app", hashMap);
                        ac().startActivity(intent);
                        com.bytedance.sdk.openadsdk.cJ.ABk.Qhi().Qhi(hashMap).Qhi(this.cJ, this.f9354ac);
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi("dp_start_act_success", this.cJ, this.f9354ac, hashMap);
                        return true;
                    } catch (Throwable th2) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("exception", th2.getMessage());
                            jSONObject.put("intent", intent.toString());
                            jSONObject.put("can_query_install", 1);
                        } catch (Exception unused) {
                        }
                        com.bytedance.sdk.openadsdk.core.fl.Qhi(this.cJ, this.f9354ac, -4, jSONObject);
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("intent", intent.toString());
                        jSONObject2.put("can_query_install", 1);
                    } catch (Exception unused2) {
                    }
                    com.bytedance.sdk.openadsdk.core.fl.Qhi(this.cJ, this.f9354ac, -3, jSONObject2);
                }
            } else {
                tP tPVar = this.cJ;
                com.bytedance.sdk.openadsdk.core.fl.Qhi(tPVar, this.f9354ac, -2, tPVar.ReL().CJ());
            }
            if (!this.CJ || this.Tgh.get()) {
                this.CJ = true;
                Map<String, Object> hashMap2 = new HashMap<>();
                Qhi(hashMap2);
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.cJ, this.f9354ac, "open_fallback_url", hashMap2);
                return false;
            }
            return false;
        }
        com.bytedance.sdk.openadsdk.core.fl.Qhi(this.cJ, this.f9354ac, -1, null);
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl
    public boolean fl() {
        this.Tgh.set(true);
        if (this.Qhi != null && Qhi(ac(), this.Qhi.Qhi(), this.Qhi.ac())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl
    public void Qhi(int i10) {
        this.ROR = i10;
    }

    public boolean Qhi(Context context, String str, String str2) {
        return Qhi(context, str, str2, this.f9354ac, this.cJ);
    }

    public static boolean Qhi(Context context, String str, String str2, String str3, tP tPVar) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, str3, "store_open", (JSONObject) null);
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri parse = Uri.parse("market://details?id=".concat(str2));
                intent2.setData(parse);
                for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent2, 65536)) {
                    if (resolveInfo.activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(parse);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, str3, "store_open", (JSONObject) null);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th2);
            }
        }
        return false;
    }

    private void Qhi(Map<String, Object> map) {
        tP tPVar = this.cJ;
        if (tPVar != null && tPVar.nR() == 0) {
            tP tPVar2 = this.cJ;
            map.put("auto_click", Boolean.valueOf((tPVar2 == null || tPVar2.CJ()) ? false : true));
        }
        tP tPVar3 = this.cJ;
        if (tPVar3 != null && tPVar3.nR() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.ROR >= 11));
        }
        map.put("can_query_install", 1);
    }

    @Override // com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl
    public boolean Qhi() {
        Intent Qhi;
        if (this.Qhi == null) {
            return false;
        }
        tP tPVar = this.cJ;
        if (tPVar == null || tPVar.XH() != 0) {
            String ac2 = this.Qhi.ac();
            if (TextUtils.isEmpty(ac2) || !js.cJ(ac(), ac2) || (Qhi = js.Qhi(ac(), ac2)) == null) {
                return false;
            }
            Qhi.putExtra("START_ONLY_FOR_ANDROID", true);
            try {
                ac().startActivity(Qhi);
                HashMap hashMap = new HashMap();
                Qhi(hashMap);
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.cJ, this.f9354ac, "click_open", hashMap);
                return true;
            } catch (Throwable th2) {
                ABk.Qhi("GPDownLoader", th2.getMessage());
                return false;
            }
        }
        return false;
    }
}
