package com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi;

import android.text.TextUtils;
import com.bytedance.sdk.component.cJ.Qhi.ABk;
import com.bytedance.sdk.component.cJ.Qhi.Gm;
import com.bytedance.sdk.component.cJ.Qhi.HzH;
import com.bytedance.sdk.component.cJ.Qhi.hpZ;
import com.bytedance.sdk.component.cJ.Qhi.iMK;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: NetResponse.java */
/* loaded from: classes.dex */
public class Sf extends hpZ {
    public static int Qhi = -1;
    int CJ;

    /* renamed from: ac  reason: collision with root package name */
    iMK f8339ac;
    HttpURLConnection cJ;

    /* renamed from: fl  reason: collision with root package name */
    String f8340fl;

    public Sf(HttpURLConnection httpURLConnection, iMK imk) {
        this.CJ = Qhi;
        this.cJ = httpURLConnection;
        this.f8339ac = imk;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.hpZ
    public boolean CJ() {
        if (ac() >= 200 && ac() < 300) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.hpZ
    public long Qhi() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.hpZ
    public com.bytedance.sdk.component.cJ.Qhi.ROR ROR() {
        if (this.cJ == null) {
            return new com.bytedance.sdk.component.cJ.Qhi.ROR(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.cJ.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || ac() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.cJ.Qhi.ROR((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.hpZ
    public ABk Sf() {
        return ABk.HTTP_1_1;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.hpZ
    public HzH Tgh() {
        hm hmVar;
        com.bytedance.sdk.component.ac.Qhi.Qhi qhi;
        com.bytedance.sdk.component.ac.Qhi.Qhi qhi2;
        iMK imk = this.f8339ac;
        if (imk != null && (qhi2 = imk.cJ) != null) {
            qhi2.Gm();
        }
        try {
            try {
                hmVar = new hm(this.cJ);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.cJ(th2.getMessage());
                hmVar = null;
            }
        } catch (Exception unused) {
            HttpURLConnection httpURLConnection = this.cJ;
            hmVar = new hm(httpURLConnection, httpURLConnection.getErrorStream());
        }
        iMK imk2 = this.f8339ac;
        if (imk2 != null && (qhi = imk2.cJ) != null) {
            qhi.ABk();
        }
        return hmVar;
    }

    public iMK WAv() {
        return this.f8339ac;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.hpZ
    public int ac() {
        try {
            return this.cJ.getResponseCode();
        } catch (Exception unused) {
            return this.CJ;
        }
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.hpZ
    public long cJ() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.hpZ, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            Tgh().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.hpZ
    public String fl() {
        if (!TextUtils.isEmpty(this.f8340fl)) {
            return this.f8340fl;
        }
        return this.cJ.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.hpZ
    public Gm hm() {
        if (WAv() != null && WAv().cJ != null) {
            return new Gm(WAv().cJ);
        }
        return null;
    }

    public String toString() {
        return "";
    }

    public String Qhi(String str) {
        HttpURLConnection httpURLConnection = this.cJ;
        return httpURLConnection == null ? "" : httpURLConnection.getHeaderField(str);
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.hpZ
    public String Qhi(String str, String str2) {
        return !TextUtils.isEmpty(Qhi(str)) ? Qhi(str) : str2;
    }

    public Sf(int i10, String str, iMK imk) {
        this.f8340fl = str;
        this.f8339ac = imk;
        this.CJ = i10;
    }
}
