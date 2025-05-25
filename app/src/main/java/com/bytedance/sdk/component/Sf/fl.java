package com.bytedance.sdk.component.Sf;

import a0.d;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.r;
import com.bytedance.sdk.component.utils.ABk;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PoolTaskStatistics.java */
/* loaded from: classes.dex */
public class fl {

    /* renamed from: ac  reason: collision with root package name */
    private static AtomicInteger f8048ac = new AtomicInteger(0);
    public static final String[] Qhi = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final String[] cJ = {"tt_pangle", "bd_tracker"};
    private static int CJ = 0;

    /* renamed from: fl  reason: collision with root package name */
    private static int f8049fl = 0;

    /* compiled from: PoolTaskStatistics.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        public String CJ;
        public int Qhi;

        /* renamed from: ac  reason: collision with root package name */
        public String f8050ac;
        public String cJ;

        public Qhi(String str, int i10, String str2, String str3) {
            this.f8050ac = str;
            this.Qhi = i10;
            this.CJ = str2;
            this.cJ = str3;
        }

        public void Qhi(int i10) {
            this.Qhi = i10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ThreadModel{times=");
            sb2.append(this.Qhi);
            sb2.append(", name='");
            sb2.append(this.cJ);
            sb2.append("', lastStackStack='");
            return r.g(sb2, this.f8050ac, "'}");
        }

        public int Qhi() {
            return this.Qhi;
        }
    }

    public static void Qhi() {
        try {
            cJ();
        } catch (Throwable unused) {
        }
    }

    private static void cJ() {
        ac hm2 = ROR.hm();
        if (hm2 == null) {
            return;
        }
        int addAndGet = f8048ac.addAndGet(1);
        int i10 = ROR.f8030ac;
        if (i10 >= 0 && addAndGet % i10 == 0 && Looper.getMainLooper() != Looper.myLooper()) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            HashMap hashMap = new HashMap();
            if (allStackTraces == null) {
                return;
            }
            boolean Qhi2 = ABk.Qhi();
            int size = allStackTraces.size();
            if (size > f8049fl) {
                f8049fl = size;
            }
            int i11 = 0;
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                Thread key = entry.getKey();
                StackTraceElement[] value = entry.getValue();
                StringBuilder sb2 = new StringBuilder("\n");
                if (Qhi2) {
                    sb2.append("Thread Name is : " + key.getName());
                    sb2.append("\n");
                }
                String str = null;
                for (StackTraceElement stackTraceElement : value) {
                    String stackTraceElement2 = stackTraceElement.toString();
                    if (Qhi2) {
                        sb2.append(stackTraceElement2 + "\n");
                    }
                    if (TextUtils.isEmpty(str) && (Qhi(stackTraceElement2, Qhi) || Qhi(key.getName(), cJ))) {
                        i11++;
                        str = stackTraceElement2;
                    }
                }
                if (Qhi2) {
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder g10 = d.g(str, "&");
                        g10.append(key.getName());
                        String sb3 = g10.toString();
                        Qhi qhi = (Qhi) hashMap.get(sb3);
                        if (qhi != null) {
                            qhi.Qhi(qhi.Qhi() + 1);
                        } else {
                            qhi = new Qhi(sb3, 1, sb2.toString(), key.getName());
                        }
                        hashMap.put(sb3, qhi);
                    }
                    TextUtils.isEmpty(sb2.toString());
                }
            }
            if (i11 > CJ) {
                CJ = i11;
            }
            if (Qhi2) {
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    ((Qhi) entry2.getValue()).toString();
                }
            }
            hm2.Qhi(new com.bytedance.sdk.component.Sf.cJ.Qhi(i11, CJ, size, f8049fl));
        }
    }

    private static boolean Qhi(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
