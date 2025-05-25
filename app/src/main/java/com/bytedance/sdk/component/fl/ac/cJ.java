package com.bytedance.sdk.component.fl.ac;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.fl.Gm;
import com.bytedance.sdk.component.fl.MQ;
import com.bytedance.sdk.component.fl.ac.ac;
import com.bytedance.sdk.component.fl.hpZ;
import com.bytedance.sdk.component.fl.iMK;
import com.bytedance.sdk.openadsdk.ats.ATS;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;

/* compiled from: ImageLoader.java */
@ATS(single = true, value = {"img_service"})
/* loaded from: classes.dex */
public class cJ implements hpZ {
    private volatile ROR Qhi;

    private cJ() {
    }

    public static hpZ Qhi(Context context, iMK imk) {
        cJ cJVar = new cJ();
        cJVar.cJ(context, imk);
        return cJVar;
    }

    private void cJ(Context context, iMK imk) {
        if (imk == null) {
            imk = Tgh.Qhi(context);
        }
        this.Qhi = new ROR(context, imk);
    }

    @Override // com.bytedance.sdk.component.fl.hpZ
    public Gm Qhi(String str) {
        return new ac.cJ(this.Qhi).ac(str);
    }

    @Override // com.bytedance.sdk.component.fl.hpZ
    public InputStream Qhi(String str, String str2) {
        if (this.Qhi != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = com.bytedance.sdk.component.fl.ac.ac.ac.Qhi(str);
            }
            Collection<MQ> cJ = this.Qhi.cJ();
            if (cJ != null) {
                for (MQ mq : cJ) {
                    byte[] Qhi = mq.Qhi(str2);
                    if (Qhi != null) {
                        return new ByteArrayInputStream(Qhi);
                    }
                }
            }
            Collection<com.bytedance.sdk.component.fl.ac> ac2 = this.Qhi.ac();
            if (ac2 != null) {
                for (com.bytedance.sdk.component.fl.ac acVar : ac2) {
                    InputStream Qhi2 = acVar.Qhi(str2);
                    if (Qhi2 != null) {
                        return Qhi2;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.fl.hpZ
    public boolean Qhi(String str, String str2, String str3) {
        if (this.Qhi == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = com.bytedance.sdk.component.fl.ac.ac.ac.Qhi(str);
        }
        com.bytedance.sdk.component.fl.ac Qhi = this.Qhi.Qhi(str3);
        if (Qhi != null) {
            return Qhi.cJ(str2);
        }
        return false;
    }
}
