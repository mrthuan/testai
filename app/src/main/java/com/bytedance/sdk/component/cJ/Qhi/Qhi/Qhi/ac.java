package com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi;

import com.bytedance.sdk.component.cJ.Qhi.hm;
import com.bytedance.sdk.component.cJ.Qhi.hpZ;
import com.bytedance.sdk.component.cJ.Qhi.iMK;
import java.util.List;

/* compiled from: NetChain.java */
/* loaded from: classes.dex */
public class ac implements hm.Qhi {
    List<com.bytedance.sdk.component.cJ.Qhi.hm> Qhi;

    /* renamed from: ac  reason: collision with root package name */
    int f8342ac = 0;
    iMK cJ;

    public ac(List<com.bytedance.sdk.component.cJ.Qhi.hm> list, iMK imk) {
        this.Qhi = list;
        this.cJ = imk;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.hm.Qhi
    public iMK Qhi() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.hm.Qhi
    public hpZ Qhi(iMK imk) {
        this.cJ = imk;
        int i10 = this.f8342ac + 1;
        this.f8342ac = i10;
        if (i10 >= this.Qhi.size()) {
            return null;
        }
        return this.Qhi.get(this.f8342ac).Qhi(this);
    }
}
