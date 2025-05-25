package com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi;

import android.text.TextUtils;
import com.bytedance.sdk.component.cJ.Qhi.hm;
import com.bytedance.sdk.component.cJ.Qhi.hpZ;
import com.bytedance.sdk.component.cJ.Qhi.iMK;
import com.bytedance.sdk.component.cJ.Qhi.pA;
import com.bytedance.sdk.component.cJ.Qhi.zc;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NetCall.java */
/* loaded from: classes.dex */
public class cJ implements com.bytedance.sdk.component.cJ.Qhi.cJ {
    iMK Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private AtomicBoolean f8343ac = new AtomicBoolean(false);
    com.bytedance.sdk.component.cJ.Qhi.fl cJ;

    public cJ(iMK imk, com.bytedance.sdk.component.cJ.Qhi.fl flVar) {
        this.Qhi = imk;
        this.cJ = flVar;
    }

    private boolean ac() {
        if (this.Qhi.CJ() == null) {
            return false;
        }
        return this.Qhi.CJ().containsKey("Content-Type");
    }

    private boolean cJ(pA pAVar) {
        iMK imk;
        return (pAVar == null || (imk = this.Qhi) == null || !"POST".equalsIgnoreCase(imk.ac()) || pAVar.Tgh != pA.Qhi.STRING_TYPE || TextUtils.isEmpty(pAVar.CJ)) ? false : true;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.cJ
    public hpZ Qhi() {
        List<com.bytedance.sdk.component.cJ.Qhi.hm> list;
        com.bytedance.sdk.component.ac.Qhi.Qhi qhi;
        iMK imk = this.Qhi;
        if (imk != null && (qhi = imk.cJ) != null) {
            if (qhi.iMK() == 0) {
                this.Qhi.cJ.pA();
            }
            this.Qhi.cJ.Qhi();
        }
        this.cJ.ac().remove(this);
        this.cJ.CJ().add(this);
        com.bytedance.sdk.component.cJ.Qhi.fl flVar = this.cJ;
        if (flVar instanceof Tgh) {
            if (this.cJ.CJ().size() + flVar.ac().size() > this.cJ.Qhi() || this.f8343ac.get()) {
                this.cJ.CJ().remove(this);
                return new Sf(Sf.Qhi, "Maximum number of requests exceeded", this.Qhi);
            }
        }
        try {
            zc zcVar = this.Qhi.Qhi;
            if (zcVar != null && (list = zcVar.Qhi) != null && list.size() > 0) {
                ArrayList arrayList = new ArrayList(this.Qhi.Qhi.Qhi);
                arrayList.add(new com.bytedance.sdk.component.cJ.Qhi.hm() { // from class: com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi.cJ.1
                    @Override // com.bytedance.sdk.component.cJ.Qhi.hm
                    public hpZ Qhi(hm.Qhi qhi2) {
                        return cJ.this.Qhi(qhi2.Qhi());
                    }
                });
                return ((com.bytedance.sdk.component.cJ.Qhi.hm) arrayList.get(0)).Qhi(new ac(arrayList, this.Qhi));
            }
            return Qhi(this.Qhi);
        } catch (Throwable th2) {
            throw new IOException(th2.getMessage());
        }
    }

    /* renamed from: cJ */
    public com.bytedance.sdk.component.cJ.Qhi.cJ clone() {
        return new cJ(this.Qhi, this.cJ);
    }

    private boolean Qhi(pA pAVar) {
        iMK imk;
        byte[] bArr;
        return pAVar != null && (imk = this.Qhi) != null && "POST".equalsIgnoreCase(imk.ac()) && pAVar.Tgh == pA.Qhi.BYTE_ARRAY_TYPE && (bArr = pAVar.f8361fl) != null && bArr.length > 0;
    }

    public hpZ Qhi(iMK imk) {
        HttpURLConnection httpURLConnection;
        String obj;
        int i10 = Sf.Qhi;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(imk.cJ().Qhi().toString()).openConnection();
            } finally {
                this.cJ.CJ().remove(this);
            }
        } catch (Exception e10) {
            httpURLConnection = null;
        }
        try {
            if (imk.CJ() != null && imk.CJ().size() > 0) {
                for (Map.Entry<String, List<String>> entry : imk.CJ().entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if ("_disable_retry".equals(key) && "1".equals(str)) {
                            Qhi(httpURLConnection);
                        } else {
                            httpURLConnection.addRequestProperty(key, str);
                        }
                    }
                }
            }
            zc zcVar = imk.Qhi;
            if (zcVar != null) {
                TimeUnit timeUnit = zcVar.f8363ac;
                if (timeUnit != null) {
                    httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(zcVar.cJ));
                }
                zc zcVar2 = imk.Qhi;
                if (zcVar2.f8363ac != null) {
                    httpURLConnection.setReadTimeout((int) zcVar2.f8364fl.toMillis(zcVar2.CJ));
                }
            }
            if (imk.Sf() == null) {
                httpURLConnection.setRequestMethod("GET");
            } else {
                if (!ac() && imk.Sf().f8360ac != null) {
                    httpURLConnection.addRequestProperty("Content-Type", imk.Sf().f8360ac.Qhi());
                }
                httpURLConnection.setRequestMethod(imk.ac());
                if ("POST".equalsIgnoreCase(imk.ac())) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    if (Qhi(imk.Sf())) {
                        outputStream.write(imk.Sf().f8361fl);
                    } else if (cJ(imk.Sf())) {
                        outputStream.write(imk.Sf().CJ.getBytes());
                    }
                    outputStream.flush();
                    outputStream.close();
                }
            }
            com.bytedance.sdk.component.ac.Qhi.Qhi qhi = imk.cJ;
            if (qhi != null) {
                qhi.cJ();
            }
            httpURLConnection.connect();
            com.bytedance.sdk.component.ac.Qhi.Qhi qhi2 = imk.cJ;
            if (qhi2 != null) {
                qhi2.ac();
            }
            i10 = httpURLConnection.getResponseCode();
            com.bytedance.sdk.component.ac.Qhi.Qhi qhi3 = imk.cJ;
            if (qhi3 != null) {
                qhi3.fl();
            }
        } catch (Exception e11) {
            obj = httpURLConnection.getErrorStream().toString();
            return new Sf(i10, obj, imk);
        }
        if (this.f8343ac.get()) {
            httpURLConnection.disconnect();
            this.cJ.CJ().remove(this);
            obj = "internal error";
            return new Sf(i10, obj, imk);
        }
        return new Sf(httpURLConnection, imk);
    }

    private static void Qhi(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.cJ
    public void Qhi(final com.bytedance.sdk.component.cJ.Qhi.ac acVar) {
        com.bytedance.sdk.component.ac.Qhi.Qhi qhi;
        iMK imk = this.Qhi;
        if (imk != null && (qhi = imk.cJ) != null) {
            qhi.pA();
        }
        this.cJ.cJ().submit(new com.bytedance.sdk.component.Sf.ac.cJ(this.Qhi.ROR(), this.Qhi.Tgh()) { // from class: com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi.cJ.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    hpZ Qhi = cJ.this.Qhi();
                    if (Qhi == null) {
                        acVar.Qhi(cJ.this, new IOException("response is null"));
                    } else {
                        acVar.Qhi(cJ.this, Qhi);
                    }
                } catch (IOException e10) {
                    acVar.Qhi(cJ.this, e10);
                }
            }
        });
    }
}
