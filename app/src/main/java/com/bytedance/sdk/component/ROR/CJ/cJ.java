package com.bytedance.sdk.component.ROR.cJ;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.cJ.Qhi.HzH;
import com.bytedance.sdk.component.cJ.Qhi.Qhi;
import com.bytedance.sdk.component.cJ.Qhi.ROR;
import com.bytedance.sdk.component.cJ.Qhi.Sf;
import com.bytedance.sdk.component.cJ.Qhi.hpZ;
import com.bytedance.sdk.component.cJ.Qhi.iMK;
import com.bytedance.sdk.component.cJ.Qhi.zc;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: GetExecutor.java */
/* loaded from: classes.dex */
public class cJ extends ac {
    public static final com.bytedance.sdk.component.cJ.Qhi.Qhi Qhi = new Qhi.C0093Qhi().Qhi().cJ();
    public static final com.bytedance.sdk.component.cJ.Qhi.Qhi cJ = new Qhi.C0093Qhi().cJ();
    private boolean Gm;
    private com.bytedance.sdk.component.cJ.Qhi.Qhi WAv;

    /* renamed from: zc  reason: collision with root package name */
    private Map<String, String> f8025zc;

    public cJ(zc zcVar) {
        super(zcVar);
        this.WAv = Qhi;
        this.Gm = false;
        this.f8025zc = new HashMap();
    }

    public void Qhi(String str, String str2) {
        if (str == null) {
            return;
        }
        this.f8025zc.put(str, str2);
    }

    public void Qhi(boolean z10) {
        this.Gm = z10;
    }

    public void Qhi(final com.bytedance.sdk.component.ROR.Qhi.Qhi qhi) {
        try {
            iMK.Qhi qhi2 = new iMK.Qhi();
            if (this.Gm) {
                qhi2.cJ(this.Sf);
            } else {
                Sf.Qhi qhi3 = new Sf.Qhi();
                Uri parse = Uri.parse(this.Sf);
                qhi3.Qhi(parse.getScheme());
                qhi3.cJ(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith(PackagingURIHelper.FORWARD_SLASH_STRING)) {
                        encodedPath = encodedPath.substring(1);
                    }
                    qhi3.ac(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.f8025zc.put(str, parse.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.f8025zc.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        qhi3.Qhi(encode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                qhi2.Qhi(qhi3.cJ());
            }
            Qhi(qhi2);
            qhi2.Qhi(this.WAv);
            qhi2.Qhi((Object) cJ());
            if (!TextUtils.isEmpty(this.f8023fl)) {
                qhi2.Qhi(this.f8023fl);
            }
            int i10 = this.Tgh;
            if (i10 > 0) {
                qhi2.Qhi(i10);
            }
            this.f8022ac.Qhi(qhi2.Qhi().cJ()).Qhi(new com.bytedance.sdk.component.cJ.Qhi.ac() { // from class: com.bytedance.sdk.component.ROR.cJ.cJ.1
                @Override // com.bytedance.sdk.component.cJ.Qhi.ac
                public void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ cJVar, IOException iOException) {
                    com.bytedance.sdk.component.ROR.Qhi.Qhi qhi4 = qhi;
                    if (qhi4 != null) {
                        qhi4.Qhi(cJ.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.cJ.Qhi.ac
                public void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ cJVar, hpZ hpz) {
                    if (qhi != null) {
                        HashMap hashMap = new HashMap();
                        if (hpz != null) {
                            ROR ROR = hpz.ROR();
                            if (ROR != null) {
                                for (int i11 = 0; i11 < ROR.Qhi(); i11++) {
                                    hashMap.put(ROR.Qhi(i11), ROR.cJ(i11));
                                }
                            }
                            HzH Tgh = hpz.Tgh();
                            qhi.Qhi(cJ.this, new com.bytedance.sdk.component.ROR.cJ(hpz.CJ(), hpz.ac(), hpz.fl(), hashMap, Tgh == null ? "" : Tgh.cJ(), hpz.cJ(), hpz.Qhi()));
                        }
                    }
                }
            });
        } catch (Throwable th2) {
            if (qhi != null) {
                qhi.Qhi(this, new IOException(th2.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.ROR.cJ Qhi() {
        try {
            iMK.Qhi qhi = new iMK.Qhi();
            String str = "";
            if (this.Gm) {
                qhi.cJ(this.Sf);
            } else {
                Sf.Qhi qhi2 = new Sf.Qhi();
                Uri parse = Uri.parse(this.Sf);
                qhi2.Qhi(parse.getScheme());
                qhi2.cJ(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith(PackagingURIHelper.FORWARD_SLASH_STRING)) {
                        encodedPath = encodedPath.substring(1);
                    }
                    qhi2.ac(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str2 : queryParameterNames) {
                        this.f8025zc.put(str2, parse.getQueryParameter(str2));
                    }
                }
                for (Map.Entry<String, String> entry : this.f8025zc.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        qhi2.Qhi(encode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                qhi.Qhi(qhi2.cJ());
            }
            Qhi(qhi);
            qhi.Qhi(this.WAv);
            qhi.Qhi((Object) cJ());
            hpZ Qhi2 = this.f8022ac.Qhi(qhi.Qhi().cJ()).Qhi();
            if (Qhi2 != null) {
                HashMap hashMap = new HashMap();
                ROR ROR = Qhi2.ROR();
                if (ROR != null) {
                    for (int i10 = 0; i10 < ROR.Qhi(); i10++) {
                        hashMap.put(ROR.Qhi(i10), ROR.cJ(i10));
                    }
                }
                HzH Tgh = Qhi2.Tgh();
                if (Tgh != null) {
                    str = Tgh.cJ();
                }
                return new com.bytedance.sdk.component.ROR.cJ(Qhi2.CJ(), Qhi2.ac(), Qhi2.fl(), hashMap, str, Qhi2.cJ(), Qhi2.Qhi());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
