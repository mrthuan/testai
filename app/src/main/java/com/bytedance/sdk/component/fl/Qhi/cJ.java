package com.bytedance.sdk.component.fl.Qhi;

import com.bytedance.sdk.component.fl.ABk;
import com.bytedance.sdk.component.fl.WAv;
import java.util.WeakHashMap;

/* compiled from: KeyGeneratorFactory.java */
/* loaded from: classes.dex */
public class cJ {
    public static ABk Qhi() {
        return new ABk() { // from class: com.bytedance.sdk.component.fl.Qhi.cJ.1
            private WeakHashMap<String, String> Qhi = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.fl.ABk
            public String Qhi(WAv wAv) {
                return Qhi(wAv.Qhi() + "#width=" + wAv.cJ() + "#height=" + wAv.ac() + "#scaletype=" + wAv.CJ() + "#bitmapConfig=" + wAv.Tgh());
            }

            @Override // com.bytedance.sdk.component.fl.ABk
            public String cJ(WAv wAv) {
                return Qhi(wAv.Qhi());
            }

            private String Qhi(String str) {
                String str2 = this.Qhi.get(str);
                if (str2 == null) {
                    String Qhi = com.bytedance.sdk.component.fl.ac.ac.ac.Qhi(str);
                    this.Qhi.put(str, Qhi);
                    return Qhi;
                }
                return str2;
            }
        };
    }
}
