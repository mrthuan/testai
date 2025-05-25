package com.bytedance.sdk.component.ROR.cJ;

import android.text.TextUtils;
import com.bytedance.sdk.component.cJ.Qhi.iMK;
import com.bytedance.sdk.component.cJ.Qhi.zc;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: NetExecutor.java */
/* loaded from: classes.dex */
public abstract class ac {
    int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    protected zc f8022ac;

    /* renamed from: fl  reason: collision with root package name */
    String f8023fl;
    protected String CJ = null;
    protected final Map<String, String> ROR = new HashMap();
    protected String Sf = null;

    /* renamed from: hm  reason: collision with root package name */
    protected boolean f8024hm = false;

    public ac(zc zcVar) {
        this.f8022ac = zcVar;
        ac(UUID.randomUUID().toString());
    }

    public void CJ(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.ROR.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void Qhi(String str) {
        this.f8023fl = str;
    }

    public void ac(String str) {
        this.CJ = str;
    }

    public void cJ(String str) {
        this.Sf = str;
    }

    public void Qhi(int i10) {
        this.Tgh = i10;
    }

    public void cJ(String str, String str2) {
        this.ROR.put(str, str2);
    }

    public void Qhi(iMK.Qhi qhi) {
        if (qhi != null && this.ROR.size() > 0) {
            for (Map.Entry<String, String> entry : this.ROR.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    qhi.cJ(key, value);
                }
            }
        }
    }

    public String cJ() {
        return this.CJ;
    }
}
