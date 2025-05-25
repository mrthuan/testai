package com.bytedance.sdk.component.ROR.ac;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TNCConfigHandler.java */
/* loaded from: classes.dex */
public class Tgh {
    private static final Object CJ = new Object();
    private Context Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8011ac;
    private fl cJ = new fl();

    /* renamed from: fl  reason: collision with root package name */
    private int f8012fl;

    public Tgh(Context context, boolean z10, int i10) {
        this.Qhi = context;
        this.f8011ac = z10;
        this.f8012fl = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00af A[Catch: all -> 0x0133, TryCatch #1 {all -> 0x0133, blocks: (B:6:0x0016, B:10:0x0021, B:14:0x003b, B:15:0x0041, B:17:0x0047, B:19:0x0063, B:20:0x006c, B:21:0x006f, B:23:0x0075, B:24:0x007e, B:26:0x0084, B:27:0x008e, B:29:0x0094, B:31:0x00a3, B:38:0x00c1, B:51:0x00fd, B:41:0x00c8, B:35:0x00af, B:37:0x00bc), top: B:80:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8 A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:6:0x0016, B:10:0x0021, B:14:0x003b, B:15:0x0041, B:17:0x0047, B:19:0x0063, B:20:0x006c, B:21:0x006f, B:23:0x0075, B:24:0x007e, B:26:0x0084, B:27:0x008e, B:29:0x0094, B:31:0x00a3, B:38:0x00c1, B:51:0x00fd, B:41:0x00c8, B:35:0x00af, B:37:0x00bc), top: B:80:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd A[Catch: all -> 0x0133, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:6:0x0016, B:10:0x0021, B:14:0x003b, B:15:0x0041, B:17:0x0047, B:19:0x0063, B:20:0x006c, B:21:0x006f, B:23:0x0075, B:24:0x007e, B:26:0x0084, B:27:0x008e, B:29:0x0094, B:31:0x00a3, B:38:0x00c1, B:51:0x00fd, B:41:0x00c8, B:35:0x00af, B:37:0x00bc), top: B:80:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi(org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ROR.ac.Tgh.Qhi(org.json.JSONObject):void");
    }

    public fl ac() {
        return this.cJ;
    }

    public void cJ() {
        try {
            String Qhi = com.bytedance.sdk.component.ROR.CJ.hm.Qhi(this.Qhi, 1, this.f8012fl);
            if (TextUtils.isEmpty(Qhi)) {
                return;
            }
            fl cJ = cJ(new JSONObject(Qhi));
            if (cJ != null) {
                cJ.toString();
            }
            if (cJ != null) {
                this.cJ = cJ;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private fl cJ(JSONObject jSONObject) {
        try {
            fl flVar = new fl();
            if (jSONObject.has("local_enable")) {
                flVar.Qhi = jSONObject.getInt("local_enable") != 0;
            }
            if (jSONObject.has("probe_enable")) {
                flVar.cJ = jSONObject.getInt("probe_enable") != 0;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        String string = jSONArray.getString(i10);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                flVar.f8013ac = hashMap;
            } else {
                flVar.f8013ac = null;
            }
            if (jSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                HashMap hashMap2 = new HashMap();
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            hashMap2.put(next, string2);
                        }
                    }
                }
                flVar.CJ = hashMap2;
            } else {
                flVar.CJ = null;
            }
            flVar.f8014fl = jSONObject.optInt("req_to_cnt", flVar.f8014fl);
            flVar.Tgh = jSONObject.optInt("req_to_api_cnt", flVar.Tgh);
            flVar.ROR = jSONObject.optInt("req_to_ip_cnt", flVar.ROR);
            flVar.Sf = jSONObject.optInt("req_err_cnt", flVar.Sf);
            flVar.f8015hm = jSONObject.optInt("req_err_api_cnt", flVar.f8015hm);
            flVar.WAv = jSONObject.optInt("req_err_ip_cnt", flVar.WAv);
            flVar.Gm = jSONObject.optInt("update_interval", flVar.Gm);
            flVar.f8016zc = jSONObject.optInt("update_random_range", flVar.f8016zc);
            flVar.ABk = jSONObject.optString("http_code_black", flVar.ABk);
            return flVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void Qhi() {
        if (this.f8011ac) {
            String string = this.Qhi.getSharedPreferences(hm.Qhi().Qhi(this.f8012fl).Qhi(), 0).getString("tnc_config_str", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                fl cJ = cJ(new JSONObject(string));
                if (cJ != null) {
                    this.cJ = cJ;
                }
                if (cJ == null) {
                    return;
                }
                cJ.toString();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }
}
