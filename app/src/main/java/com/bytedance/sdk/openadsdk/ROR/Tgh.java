package com.bytedance.sdk.openadsdk.ROR;

import com.bytedance.sdk.component.fl.WAv;
import com.bytedance.sdk.component.fl.qMt;

/* compiled from: StepTrackImpl.java */
/* loaded from: classes.dex */
public class Tgh implements qMt {
    private static int Qhi;
    private boolean CJ;

    /* renamed from: ac  reason: collision with root package name */
    private long f8505ac;
    private long cJ = 0;

    /* renamed from: fl  reason: collision with root package name */
    private final String f8506fl;

    public Tgh() {
        Qhi++;
        this.f8506fl = "image_request_" + Qhi;
    }

    private String ac(String str, WAv wAv) {
        com.bytedance.sdk.component.fl.ac.Qhi kYc;
        String str2;
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1867169789:
                    if (str.equals("success")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1584526165:
                    if (str.equals("raw_cache")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1442758754:
                    if (str.equals("image_type")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1428113824:
                    if (str.equals("disk_cache")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1335717394:
                    if (str.equals("decode")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1281977283:
                    if (str.equals("failed")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1076854124:
                    if (str.equals("check_duplicate")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1017400004:
                    if (str.equals("memory_cache")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1478448621:
                    if (str.equals("net_request")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1718821013:
                    if (str.equals("generate_key")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 2067979407:
                    if (str.equals("cache_policy")) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return "success";
                case 1:
                    return "raw cache";
                case 2:
                    return "image type：";
                case 3:
                    return "disk cache";
                case 4:
                    return "decode";
                case 5:
                    if ((wAv instanceof com.bytedance.sdk.component.fl.ac.ac) && (kYc = ((com.bytedance.sdk.component.fl.ac.ac) wAv).kYc()) != null) {
                        Throwable ac2 = kYc.ac();
                        StringBuilder sb2 = new StringBuilder("fail：code:");
                        sb2.append(kYc.Qhi());
                        sb2.append(", msg:");
                        sb2.append(kYc.cJ());
                        sb2.append(", exception:");
                        if (ac2 != null) {
                            str2 = ac2.getMessage();
                        } else {
                            str2 = "null \r\n";
                        }
                        sb2.append(str2);
                        return sb2.toString();
                    }
                    return "fail";
                case 6:
                    return "duplicate request";
                case 7:
                    return "memory cache";
                case '\b':
                    return "net request";
                case '\t':
                    return "generate key:" + wAv.fl();
                case '\n':
                    return "cache policy";
            }
        }
        return str;
    }

    @Override // com.bytedance.sdk.component.fl.qMt
    public void Qhi(String str, WAv wAv) {
        if (!this.CJ) {
            wAv.Qhi();
            wAv.cJ();
            wAv.ac();
            this.CJ = true;
        }
        this.cJ = System.currentTimeMillis();
        ac(str, wAv);
    }

    @Override // com.bytedance.sdk.component.fl.qMt
    public void cJ(String str, WAv wAv) {
        this.f8505ac += System.currentTimeMillis() - this.cJ;
        ac(str, wAv);
    }
}
