package com.bytedance.sdk.openadsdk.core.ROR.Qhi;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.ROR.cJ.ac;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.List;
import org.json.JSONObject;

/* compiled from: VastXmlParser.java */
/* loaded from: classes.dex */
public abstract class cJ {
    protected double CJ;
    public int Qhi;
    public Qhi Tgh;

    /* renamed from: ac  reason: collision with root package name */
    protected int f8950ac;
    protected final Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    public int f8951fl;

    /* compiled from: VastXmlParser.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        public int Qhi;

        /* renamed from: ac  reason: collision with root package name */
        public boolean f8952ac;
        public int cJ;
    }

    public cJ(Context context, int i10, int i11) {
        this.f8950ac = 0;
        this.CJ = 0.0d;
        if (i11 > 0 && i10 > 0) {
            this.CJ = i10 / i11;
        }
        float fl2 = zn.fl(context);
        if (fl2 != 0.0f && i10 > 0) {
            this.f8950ac = (int) (i10 / fl2);
        }
        this.cJ = context.getApplicationContext();
    }

    public abstract com.bytedance.sdk.openadsdk.core.ROR.Qhi Qhi(String str, List<ac> list);

    public void Qhi(Exception exc, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i10);
            com.bytedance.sdk.openadsdk.Gm.ac.Qhi().Qhi("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    public String cJ(String str, List<ac> list) {
        String str2;
        int i10 = this.Qhi;
        if (i10 >= 5) {
            return null;
        }
        this.Qhi = i10 + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.ROR.cJ.cJ ac2 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().ac();
            ac2.cJ(str);
            com.bytedance.sdk.component.ROR.cJ Qhi2 = ac2.Qhi();
            str2 = Qhi2.CJ();
            try {
                Qhi2.Qhi();
            } catch (Exception e10) {
                e = e10;
                Qhi(e, 0);
                if (!list.isEmpty()) {
                    ac.cJ(list, com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.WRAPPER_TIMEOUT, -1L, null);
                }
                return str2;
            }
        } catch (Exception e11) {
            e = e11;
            str2 = null;
        }
        return str2;
    }

    public boolean Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }
}
