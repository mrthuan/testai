package com.bytedance.adsdk.Qhi.cJ.cJ.Qhi;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: MethodNode.java */
/* loaded from: classes.dex */
public class Gm implements com.bytedance.adsdk.Qhi.cJ.cJ.Qhi {
    private com.bytedance.adsdk.Qhi.cJ.cJ.Qhi[] Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.adsdk.Qhi.cJ.Qhi.Qhi f7683ac;
    private String cJ;

    public Gm(String str) {
        this.cJ = str;
    }

    public void Qhi(com.bytedance.adsdk.Qhi.cJ.cJ.Qhi[] qhiArr) {
        this.Qhi = qhiArr;
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public String cJ() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.cJ);
        sb2.append("(");
        com.bytedance.adsdk.Qhi.cJ.cJ.Qhi[] qhiArr = this.Qhi;
        if (qhiArr != null && qhiArr.length > 0) {
            int i10 = 0;
            while (true) {
                com.bytedance.adsdk.Qhi.cJ.cJ.Qhi[] qhiArr2 = this.Qhi;
                if (i10 >= qhiArr2.length) {
                    break;
                }
                sb2.append(qhiArr2[i10].cJ());
                sb2.append(",");
                i10++;
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public Object Qhi(Map<String, JSONObject> map) {
        com.bytedance.adsdk.Qhi.cJ.Qhi.Qhi qhi = new com.bytedance.adsdk.Qhi.cJ.Qhi.Qhi();
        this.f7683ac = qhi;
        qhi.Qhi(this.cJ);
        Object[] objArr = new Object[this.Qhi.length];
        int i10 = 0;
        while (true) {
            com.bytedance.adsdk.Qhi.cJ.cJ.Qhi[] qhiArr = this.Qhi;
            if (i10 < qhiArr.length) {
                com.bytedance.adsdk.Qhi.cJ.cJ.Qhi qhi2 = qhiArr[i10];
                if (qhi2 != null) {
                    objArr[i10] = qhi2.Qhi(map);
                }
                i10++;
            } else {
                this.f7683ac.Qhi(objArr);
                return this.f7683ac;
            }
        }
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public com.bytedance.adsdk.Qhi.cJ.CJ.Sf Qhi() {
        return com.bytedance.adsdk.Qhi.cJ.CJ.fl.METHOD;
    }
}
