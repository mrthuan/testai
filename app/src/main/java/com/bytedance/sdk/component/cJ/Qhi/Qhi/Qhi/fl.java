package com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi;

import android.text.TextUtils;
import com.bytedance.sdk.component.cJ.Qhi.iMK;
import com.bytedance.sdk.component.cJ.Qhi.zc;

/* compiled from: NetClient.java */
/* loaded from: classes.dex */
public class fl extends zc {
    public Tgh Sf;

    /* renamed from: hm  reason: collision with root package name */
    public Qhi f8344hm;

    public fl(zc.Qhi qhi) {
        super(qhi);
        Tgh tgh = new Tgh();
        this.Sf = tgh;
        this.f8344hm = new Qhi(tgh.cJ());
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.zc
    public com.bytedance.sdk.component.cJ.Qhi.fl Qhi() {
        return this.Sf;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.zc
    public com.bytedance.sdk.component.cJ.Qhi.cJ Qhi(iMK imk) {
        imk.Qhi(this);
        if (imk.cJ() == null || imk.cJ().Qhi() == null || TextUtils.isEmpty(imk.cJ().Qhi().toString())) {
            return null;
        }
        if (Qhi.Qhi != null && Qhi.Qhi.cJ() && this.f8344hm.fl() && !"setting".equals(imk.Tgh())) {
            cJ cJVar = new cJ(imk, this.f8344hm);
            this.f8344hm.ac().add(cJVar);
            return cJVar;
        }
        cJ cJVar2 = new cJ(imk, this.Sf);
        this.Sf.ac().add(cJVar2);
        return cJVar2;
    }
}
