package com.bytedance.sdk.component.adexpress.cJ;

import com.bytedance.sdk.component.adexpress.cJ.Gm;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RenderRealChain.java */
/* loaded from: classes.dex */
public class ABk implements Gm.Qhi {
    private AtomicBoolean CJ = new AtomicBoolean(false);
    hpZ Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private WAv f8137ac;
    private List<Gm> cJ;

    public ABk(List<Gm> list, WAv wAv) {
        this.cJ = list;
        this.f8137ac = wAv;
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Gm.Qhi
    public void Qhi() {
        this.f8137ac.CJ();
        Iterator<Gm> it = this.cJ.iterator();
        while (it.hasNext() && !it.next().Qhi(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Gm.Qhi
    public boolean ac() {
        return this.CJ.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Gm.Qhi
    public boolean cJ(Gm gm2) {
        int indexOf = this.cJ.indexOf(gm2);
        return indexOf < this.cJ.size() - 1 && indexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Gm.Qhi
    public hpZ cJ() {
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Gm.Qhi
    public void Qhi(Gm gm2) {
        int indexOf = this.cJ.indexOf(gm2);
        if (indexOf < 0) {
            return;
        }
        do {
            indexOf++;
            if (indexOf >= this.cJ.size()) {
                return;
            }
        } while (!this.cJ.get(indexOf).Qhi(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Gm.Qhi
    public void Qhi(hpZ hpz) {
        this.Qhi = hpz;
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Gm.Qhi
    public void Qhi(boolean z10) {
        this.CJ.getAndSet(z10);
    }
}
