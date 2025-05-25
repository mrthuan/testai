package com.bytedance.sdk.component.Sf;

import android.os.SystemClock;
import android.support.v4.media.session.h;
import com.bytedance.sdk.component.utils.ABk;
import com.inmobi.commons.core.configs.TelemetryConfig;

/* compiled from: DelegateRunnable.java */
/* loaded from: classes.dex */
class cJ implements Comparable, Runnable {
    private Thread CJ = null;
    private hm Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private long f8046ac;
    private Qhi cJ;

    public cJ(hm hmVar, Qhi qhi) {
        this.f8046ac = 0L;
        this.Qhi = hmVar;
        this.cJ = qhi;
        this.f8046ac = SystemClock.uptimeMillis();
    }

    private void Qhi(String str, String str2, long j10) {
        StringBuilder f10 = h.f("pool is ", str, "  name is ", str2, "is timeout,cost ");
        f10.append(j10);
        ABk.Qhi("DelegateRunnable", f10.toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof cJ) {
            return this.Qhi.compareTo(((cJ) obj).Qhi());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        hm hmVar;
        if ((obj instanceof cJ) && (hmVar = this.Qhi) != null && hmVar.equals(((cJ) obj).Qhi())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.Qhi.hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String str2;
        String str3;
        String str4;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.CJ = Thread.currentThread();
        hm hmVar = this.Qhi;
        if (hmVar != null) {
            hmVar.run();
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (this.cJ != null) {
            fl.Qhi();
        }
        if (ABk.Qhi()) {
            Qhi qhi = this.cJ;
            if (qhi != null) {
                qhi.Qhi();
            }
            hm hmVar2 = this.Qhi;
            if (hmVar2 != null) {
                hmVar2.getName();
            }
            String Qhi = this.cJ.Qhi();
            Qhi.getClass();
            char c = 65535;
            switch (Qhi.hashCode()) {
                case 3107:
                    if (Qhi.equals("ad")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3366:
                    if (Qhi.equals("io")) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (Qhi.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3237136:
                    if (Qhi.equals("init")) {
                        c = 3;
                        break;
                    }
                    break;
                case 212371911:
                    if (Qhi.equals("computation")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            String str5 = "null";
            switch (c) {
                case 0:
                case 3:
                    if (uptimeMillis2 > 2000) {
                        Qhi qhi2 = this.cJ;
                        if (qhi2 == null) {
                            str = "null";
                        } else {
                            str = qhi2.Qhi();
                        }
                        hm hmVar3 = this.Qhi;
                        if (hmVar3 != null) {
                            str5 = hmVar3.getName();
                        }
                        Qhi(str, str5, uptimeMillis2);
                        return;
                    }
                    return;
                case 1:
                    if (uptimeMillis2 > TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL) {
                        Qhi qhi3 = this.cJ;
                        if (qhi3 == null) {
                            str2 = "null";
                        } else {
                            str2 = qhi3.Qhi();
                        }
                        hm hmVar4 = this.Qhi;
                        if (hmVar4 != null) {
                            str5 = hmVar4.getName();
                        }
                        Qhi(str2, str5, uptimeMillis2);
                        return;
                    }
                    return;
                case 2:
                    if (uptimeMillis2 > 3000) {
                        Qhi qhi4 = this.cJ;
                        if (qhi4 == null) {
                            str3 = "null";
                        } else {
                            str3 = qhi4.Qhi();
                        }
                        hm hmVar5 = this.Qhi;
                        if (hmVar5 != null) {
                            str5 = hmVar5.getName();
                        }
                        Qhi(str3, str5, uptimeMillis2);
                        return;
                    }
                    return;
                case 4:
                    if (uptimeMillis2 > 1000) {
                        Qhi qhi5 = this.cJ;
                        if (qhi5 == null) {
                            str4 = "null";
                        } else {
                            str4 = qhi5.Qhi();
                        }
                        hm hmVar6 = this.Qhi;
                        if (hmVar6 != null) {
                            str5 = hmVar6.getName();
                        }
                        Qhi(str4, str5, uptimeMillis2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public hm Qhi() {
        return this.Qhi;
    }
}
