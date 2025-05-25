package com.bytedance.sdk.component.fl.CJ;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.fl.ac.ac;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MemoryCacheVisitor.java */
/* loaded from: classes.dex */
public class hpZ extends ROR {
    private Bitmap ac(ac acVar) {
        return acVar.tP().Qhi(acVar.MQ()).Qhi(acVar.fl());
    }

    private Bitmap cJ(ac acVar) {
        Collection<com.bytedance.sdk.component.fl.tP> Qhi = acVar.tP().Qhi();
        Bitmap bitmap = null;
        if (Qhi == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.fl.tP> it = Qhi.iterator();
        while (it.hasNext() && (bitmap = it.next().Qhi(acVar.fl())) == null) {
        }
        return bitmap;
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public String Qhi() {
        return "memory_cache";
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public void Qhi(ac acVar) {
        Bitmap cJ;
        int zc2 = acVar.zc();
        if (zc2 != 2 && zc2 != 1) {
            cJ = null;
        } else if (!acVar.qMt() && !acVar.MQ().Tgh()) {
            cJ = ac(acVar);
        } else {
            cJ = cJ(acVar);
        }
        if (cJ == null) {
            acVar.Qhi(new kYc());
        } else {
            acVar.Qhi(new tP(cJ, null, false));
        }
    }
}
