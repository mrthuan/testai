package com.bytedance.sdk.component.ROR.cJ;

import android.text.TextUtils;
import com.bytedance.sdk.component.ROR.CJ.Tgh;
import com.bytedance.sdk.component.cJ.Qhi.HzH;
import com.bytedance.sdk.component.cJ.Qhi.ROR;
import com.bytedance.sdk.component.cJ.Qhi.WAv;
import com.bytedance.sdk.component.cJ.Qhi.hpZ;
import com.bytedance.sdk.component.cJ.Qhi.iMK;
import com.bytedance.sdk.component.cJ.Qhi.pA;
import com.bytedance.sdk.component.cJ.Qhi.zc;
import com.bytedance.sdk.component.utils.ABk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: PostExecutor.java */
/* loaded from: classes.dex */
public class fl extends ac {
    pA Qhi;

    public fl(zc zcVar) {
        super(zcVar);
        this.Qhi = null;
    }

    private byte[] fl(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream2.write(str.getBytes("utf-8"));
                            try {
                                gZIPOutputStream2.close();
                            } catch (IOException e10) {
                                ABk.Qhi("PostExecutor", e10.toString());
                            }
                            bArr = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (IOException e11) {
                            e = e11;
                            gZIPOutputStream = gZIPOutputStream2;
                            ABk.Qhi("PostExecutor", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e12) {
                                    ABk.Qhi("PostExecutor", e12.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                bArr = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            return bArr;
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e13) {
                                    ABk.Qhi("PostExecutor", e13.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e14) {
                                    ABk.Qhi("PostExecutor", e14.toString());
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e15) {
                    e = e15;
                }
            } catch (IOException e16) {
                e = e16;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (IOException e17) {
            ABk.Qhi("PostExecutor", e17.toString());
        }
        return bArr;
    }

    public void CJ(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        this.Qhi = pA.Qhi(WAv.Qhi("application/json; charset=utf-8"), str);
    }

    public pA ac() {
        return this.Qhi;
    }

    public void Qhi(JSONObject jSONObject) {
        this.Qhi = pA.Qhi(WAv.Qhi("application/json; charset=utf-8"), jSONObject != null ? jSONObject.toString() : "{}");
    }

    public void Qhi(String str, byte[] bArr) {
        this.Qhi = pA.Qhi(WAv.Qhi(str), bArr);
    }

    public void Qhi(final com.bytedance.sdk.component.ROR.Qhi.Qhi qhi) {
        try {
            iMK.Qhi qhi2 = new iMK.Qhi();
            if (TextUtils.isEmpty(this.Sf)) {
                qhi.Qhi(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.f8023fl)) {
                qhi2.Qhi(this.f8023fl);
            }
            int i10 = this.Tgh;
            if (i10 > 0) {
                qhi2.Qhi(i10);
            }
            qhi2.cJ(this.Sf);
            if (this.Qhi == null) {
                if (qhi != null) {
                    qhi.Qhi(this, new IOException("RequestBody is null, content type is not support!!"));
                    return;
                }
                return;
            }
            Qhi(qhi2);
            qhi2.Qhi((Object) cJ());
            this.f8022ac.Qhi(qhi2.Qhi(this.Qhi).cJ()).Qhi(new com.bytedance.sdk.component.cJ.Qhi.ac() { // from class: com.bytedance.sdk.component.ROR.cJ.fl.1
                @Override // com.bytedance.sdk.component.cJ.Qhi.ac
                public void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ cJVar, IOException iOException) {
                    com.bytedance.sdk.component.ROR.Qhi.Qhi qhi3 = qhi;
                    if (qhi3 != null) {
                        qhi3.Qhi(fl.this, iOException);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
                @Override // com.bytedance.sdk.component.cJ.Qhi.ac
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ r14, com.bytedance.sdk.component.cJ.Qhi.hpZ r15) {
                    /*
                        Method dump skipped, instructions count: 307
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ROR.cJ.fl.AnonymousClass1.Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ, com.bytedance.sdk.component.cJ.Qhi.hpZ):void");
                }
            });
        } catch (Throwable th2) {
            qhi.Qhi(this, new IOException(th2.getMessage()));
        }
    }

    public com.bytedance.sdk.component.ROR.cJ Qhi() {
        com.bytedance.sdk.component.ROR.cJ cJVar;
        try {
            iMK.Qhi qhi = new iMK.Qhi();
            if (TextUtils.isEmpty(this.Sf)) {
                return new com.bytedance.sdk.component.ROR.cJ(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            qhi.cJ(this.Sf);
            if (this.Qhi == null) {
                return new com.bytedance.sdk.component.ROR.cJ(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            Qhi(qhi);
            qhi.Qhi((Object) cJ());
            hpZ Qhi = this.f8022ac.Qhi(qhi.Qhi(this.Qhi).cJ()).Qhi();
            if (Qhi != null) {
                HashMap hashMap = new HashMap();
                ROR ROR = Qhi.ROR();
                if (ROR != null) {
                    for (int i10 = 0; i10 < ROR.Qhi(); i10++) {
                        String Qhi2 = ROR.Qhi(i10);
                        String cJ = ROR.cJ(i10);
                        hashMap.put(Qhi2, cJ);
                        if (Qhi2 != null && Qhi2.equalsIgnoreCase("content-type")) {
                            hashMap.put("content-type", cJ == null ? "" : cJ.toLowerCase());
                        }
                    }
                }
                if (Tgh.Qhi(hashMap)) {
                    byte[] CJ = Qhi.Tgh().CJ();
                    cJVar = new com.bytedance.sdk.component.ROR.cJ(Qhi.CJ(), Qhi.ac(), Qhi.fl(), hashMap, null, Qhi.cJ(), Qhi.Qhi());
                    cJVar.Qhi(CJ);
                } else if (this.f8024hm) {
                    byte[] CJ2 = Qhi.Tgh().CJ();
                    cJVar = new com.bytedance.sdk.component.ROR.cJ(Qhi.CJ(), Qhi.ac(), Qhi.fl(), hashMap, new String(CJ2, Qhi(Qhi(Qhi.Tgh()))), Qhi.cJ(), Qhi.Qhi());
                    cJVar.Qhi(CJ2);
                } else {
                    cJVar = new com.bytedance.sdk.component.ROR.cJ(Qhi.CJ(), Qhi.ac(), Qhi.fl(), hashMap, Qhi.Tgh().cJ(), Qhi.cJ(), Qhi.Qhi());
                }
                Qhi(cJVar, Qhi);
                return cJVar;
            }
            return null;
        } catch (Throwable th2) {
            return new com.bytedance.sdk.component.ROR.cJ(false, 5001, th2.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void Qhi(String str, boolean z10) {
        if (z10) {
            Qhi("application/json; charset=utf-8", fl(str));
            cJ("Content-Encoding", "gzip");
            return;
        }
        CJ(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset Qhi(WAv wAv) {
        try {
            return wAv != null ? wAv.Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi) : com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.cJ.Qhi.cJ.WAv.Qhi;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WAv Qhi(HzH hzH) {
        try {
            return hzH.fl();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(com.bytedance.sdk.component.ROR.cJ cJVar, hpZ hpz) {
        if (cJVar == null || hpz == null) {
            return;
        }
        cJVar.Qhi(hpz.hm());
    }
}
