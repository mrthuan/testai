package com.bykv.vk.openvk.component.video.Qhi.cJ.fl;

import com.bykv.vk.openvk.component.video.Qhi.cJ.WAv;
import com.bytedance.sdk.component.cJ.Qhi.hpZ;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VolleyResponseWrapper.java */
/* loaded from: classes.dex */
public class ROR extends Qhi {

    /* renamed from: ac  reason: collision with root package name */
    private hpZ f7169ac;

    public ROR(hpZ hpz, Tgh tgh) {
        com.bytedance.sdk.component.cJ.Qhi.ROR ROR;
        this.f7169ac = hpz;
        this.Qhi = new ArrayList();
        if (hpz != null && (ROR = hpz.ROR()) != null) {
            for (int i10 = 0; i10 < ROR.Qhi(); i10++) {
                this.Qhi.add(new WAv.cJ(ROR.Qhi(i10), ROR.cJ(i10)));
            }
        }
        this.cJ = tgh;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi
    public InputStream CJ() {
        return this.f7169ac.Tgh().ac();
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi
    public int Qhi() {
        return this.f7169ac.ac();
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi
    public String Tgh() {
        return Qhi(this.f7169ac.ac());
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi
    public List<WAv.cJ> ac() {
        return this.Qhi;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi
    public boolean cJ() {
        if (this.f7169ac.ac() >= 200 && this.f7169ac.ac() < 300) {
            return true;
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi
    public String fl() {
        hpZ hpz = this.f7169ac;
        if (hpz != null && hpz.Sf() != null) {
            return this.f7169ac.Sf().toString();
        }
        return "http/1.1";
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi
    public String Qhi(String str, String str2) {
        return Qhi(str) != null ? Qhi(str).cJ : str2;
    }
}
