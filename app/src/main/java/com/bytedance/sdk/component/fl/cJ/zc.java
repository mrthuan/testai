package com.bytedance.sdk.component.fl.CJ;

import com.bytedance.sdk.component.fl.ac.ac;
import java.util.Collection;

/* compiled from: DiskCacheVisitor.java */
/* loaded from: classes.dex */
public class zc extends ROR {
    private byte[] cJ(ac acVar, String str) {
        com.bytedance.sdk.component.fl.ac ac2 = acVar.tP().ac(acVar.MQ());
        if (ac2 == null) {
            return null;
        }
        return ac2.Qhi((com.bytedance.sdk.component.fl.ac) str);
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public String Qhi() {
        return "disk_cache";
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public void Qhi(ac acVar) {
        byte[] Qhi;
        String WAv = acVar.WAv();
        if (!acVar.qMt() && !acVar.MQ().Tgh()) {
            Qhi = cJ(acVar, WAv);
        } else {
            Qhi = Qhi(acVar, WAv);
        }
        if (Qhi == null) {
            acVar.Qhi(new HzH());
            return;
        }
        acVar.Qhi(new Sf(Qhi, null));
        acVar.tP().cJ(acVar.MQ()).Qhi(WAv, Qhi);
    }

    private byte[] Qhi(ac acVar, String str) {
        acVar.tP().ac(acVar.MQ());
        Collection<com.bytedance.sdk.component.fl.ac> ac2 = acVar.tP().ac();
        if (ac2 == null) {
            return null;
        }
        for (com.bytedance.sdk.component.fl.ac acVar2 : ac2) {
            byte[] Qhi = acVar2.Qhi((com.bytedance.sdk.component.fl.ac) str);
            if (Qhi != null) {
                return Qhi;
            }
        }
        return null;
    }
}
