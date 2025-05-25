package com.bytedance.adsdk.Qhi.cJ.cJ.Qhi;

/* compiled from: OperatorResultNode.java */
/* loaded from: classes.dex */
public abstract class kYc implements com.bytedance.adsdk.Qhi.cJ.cJ.Qhi {
    protected com.bytedance.adsdk.Qhi.cJ.cJ.Qhi Qhi;

    /* renamed from: ac  reason: collision with root package name */
    protected com.bytedance.adsdk.Qhi.cJ.CJ.Tgh f7685ac;
    protected com.bytedance.adsdk.Qhi.cJ.cJ.Qhi cJ;

    public kYc(com.bytedance.adsdk.Qhi.cJ.CJ.Tgh tgh) {
        this.f7685ac = tgh;
    }

    public void Qhi(com.bytedance.adsdk.Qhi.cJ.cJ.Qhi qhi) {
        this.Qhi = qhi;
    }

    public void cJ(com.bytedance.adsdk.Qhi.cJ.cJ.Qhi qhi) {
        this.cJ = qhi;
    }

    public String toString() {
        return cJ();
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public com.bytedance.adsdk.Qhi.cJ.CJ.Sf Qhi() {
        return com.bytedance.adsdk.Qhi.cJ.CJ.hm.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public String cJ() {
        return this.Qhi.cJ() + this.f7685ac.Qhi() + this.cJ.cJ();
    }
}
