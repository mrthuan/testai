package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.cJ.ac;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.model.EBS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IPMiBroadcastReceiver extends BroadcastReceiver {
    private static volatile IPMiBroadcastReceiver Qhi;
    private int CJ = 0;

    /* renamed from: ac  reason: collision with root package name */
    private Qhi f9350ac;
    private final LruCache<String, tP> cJ;

    private IPMiBroadcastReceiver() {
        int i10 = 10;
        int Qhi2 = com.bytedance.sdk.openadsdk.HzH.Qhi.Qhi("ip_data_config", "ip_ad_cache_count", 10);
        if (Qhi2 > 0 && Qhi2 <= 200) {
            i10 = Qhi2;
        }
        this.cJ = new LruCache<>(i10);
    }

    public static /* synthetic */ int Qhi(IPMiBroadcastReceiver iPMiBroadcastReceiver, int i10) {
        iPMiBroadcastReceiver.CJ = i10;
        return i10;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            lG.ac(new hm("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    final int i10;
                    final int i11;
                    final int i12;
                    try {
                        final int intExtra = intent.getIntExtra("errorCode", 0);
                        if (intExtra < 0) {
                            int intExtra2 = intent.getIntExtra("reason", 0);
                            if (intExtra == -4 && intExtra2 == -1) {
                                return;
                            }
                            i10 = intExtra2;
                        } else {
                            i10 = 0;
                        }
                        if (intExtra == 5) {
                            i11 = intent.getIntExtra("status", 0);
                            if (i11 == -2) {
                                i12 = intent.getIntExtra("progress", 0);
                                if (i12 < 100) {
                                    return;
                                }
                            } else {
                                i12 = 0;
                            }
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        String stringExtra = intent.getStringExtra("packageName");
                        Qhi qhi = IPMiBroadcastReceiver.this.f9350ac;
                        if (intExtra > 0 && qhi != null) {
                            qhi.Qhi(stringExtra, intExtra);
                        }
                        tP Qhi2 = IPMiBroadcastReceiver.this.Qhi(stringExtra);
                        ABk.Qhi("IPMiBroadcastReceiver", "err_code=", Integer.valueOf(intExtra), " reason=", Integer.valueOf(i10), " status=", Integer.valueOf(i11), " progress=", Integer.valueOf(i12));
                        if (Qhi2 != null) {
                            ac.Qhi(System.currentTimeMillis(), Qhi2, js.Qhi(Qhi2), "ip_listener_log", new com.bytedance.sdk.openadsdk.Gm.ac.Qhi() { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1.1
                                @Override // com.bytedance.sdk.openadsdk.Gm.ac.Qhi
                                public JSONObject Qhi() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        JSONObject jSONObject2 = new JSONObject();
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put("ip_error_code", intExtra);
                                        int i13 = intExtra;
                                        if (i13 > 0) {
                                            if (i13 == 5) {
                                                jSONObject3.put("ip_status", i11);
                                                jSONObject3.put("ip_exec_type", IPMiBroadcastReceiver.this.CJ);
                                            }
                                            if (i11 == -2) {
                                                jSONObject3.put("ip_progress", i12);
                                            }
                                        }
                                        if (intExtra < 0) {
                                            jSONObject3.put("ip_reason", i10);
                                        }
                                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                                        jSONObject.put("ad_extra_data", jSONObject2);
                                    } catch (Throwable th2) {
                                        ABk.Qhi("IPMiBroadcastReceiver", th2.getMessage());
                                    }
                                    return jSONObject;
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        ABk.Qhi("IPMiBroadcastReceiver", th2.getMessage());
                    }
                }
            });
        }
    }

    public void Qhi(String str, tP tPVar) {
        if (TextUtils.isEmpty(str) || tPVar == null || this.cJ.get(str) != null) {
            return;
        }
        this.cJ.put(str, tPVar);
    }

    public tP Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.cJ.get(str);
    }

    public void Qhi(Qhi qhi) {
        this.f9350ac = qhi;
    }

    public void Qhi() {
        this.f9350ac = null;
    }

    public static IPMiBroadcastReceiver Qhi(Context context) {
        int Qhi2 = com.bytedance.sdk.openadsdk.HzH.Qhi.Qhi("ip_data_config", "ip_link_listener", 0);
        ABk.Qhi("IPMiBroadcastReceiver", "open =", Integer.valueOf(Qhi2));
        if (Qhi2 == 0) {
            return null;
        }
        if (Qhi == null) {
            synchronized (IPMiBroadcastReceiver.class) {
                if (Qhi == null) {
                    Qhi = new IPMiBroadcastReceiver();
                    IntentFilter intentFilter = new IntentFilter("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                    if (Build.VERSION.SDK_INT >= 34 && js.WAv(context) >= 34) {
                        context.registerReceiver(Qhi, intentFilter, 2);
                    } else {
                        context.registerReceiver(Qhi, intentFilter);
                    }
                }
            }
        }
        return Qhi;
    }

    public static void Qhi(final Context context, tP tPVar) {
        EBS NLs;
        if (Qhi == null && tPVar != null && (NLs = tPVar.NLs()) != null && NLs.Qhi()) {
            iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IPMiBroadcastReceiver.Qhi(HzH.Qhi(context));
                    } catch (Throwable th2) {
                        ABk.Qhi("IPMiBroadcastReceiver", th2.getMessage());
                    }
                }
            });
        }
    }
}
