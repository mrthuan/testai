package com.bytedance.sdk.openadsdk.core.CJ;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.settings.ROR;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: FrequentCallController.java */
/* loaded from: classes.dex */
public class hm {
    private static volatile hm Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private static volatile long f8902ac;
    private static volatile boolean cJ;
    private final Queue<Qhi> CJ = new LinkedList();
    private final ROR Tgh = HzH.CJ();

    /* renamed from: fl  reason: collision with root package name */
    private Handler f8903fl;

    /* compiled from: FrequentCallController.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private final long Qhi;
        private final String cJ;

        private Qhi(long j10, String str) {
            this.Qhi = j10;
            this.cJ = str;
        }
    }

    private hm() {
    }

    private synchronized boolean cJ(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int CQU = this.Tgh.CQU();
        long Dww = this.Tgh.Dww();
        if (this.CJ.size() > 0 && this.CJ.size() >= CQU) {
            long abs = Math.abs(currentTimeMillis - this.CJ.peek().Qhi);
            if (abs <= Dww) {
                cJ(Dww - abs);
                return true;
            }
            this.CJ.poll();
            this.CJ.offer(new Qhi(currentTimeMillis, str));
        } else {
            this.CJ.offer(new Qhi(currentTimeMillis, str));
        }
        return false;
    }

    public synchronized String ac() {
        String str;
        HashMap hashMap = new HashMap();
        for (Qhi qhi : this.CJ) {
            if (hashMap.containsKey(qhi.cJ)) {
                hashMap.put(qhi.cJ, Integer.valueOf(((Integer) hashMap.get(qhi.cJ)).intValue() + 1));
            } else {
                hashMap.put(qhi.cJ, 1);
            }
        }
        str = "";
        int i10 = SlideAtom.USES_MASTER_SLIDE_ID;
        for (String str2 : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(str2)).intValue();
            if (i10 < intValue) {
                str = str2;
                i10 = intValue;
            }
        }
        return str;
    }

    public static hm Qhi() {
        if (Qhi == null) {
            synchronized (hm.class) {
                if (Qhi == null) {
                    Qhi = new hm();
                }
            }
        }
        return Qhi;
    }

    public synchronized boolean Qhi(String str) {
        if (cJ(str)) {
            Qhi(true);
            Qhi(f8902ac);
        } else {
            Qhi(false);
        }
        return cJ;
    }

    private synchronized void Qhi(long j10) {
        if (this.f8903fl == null) {
            this.f8903fl = new Handler(Looper.getMainLooper());
        }
        this.f8903fl.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.CJ.hm.1
            @Override // java.lang.Runnable
            public void run() {
                hm.this.Qhi(false);
            }
        }, j10);
    }

    public synchronized boolean cJ() {
        return cJ;
    }

    private synchronized void cJ(long j10) {
        f8902ac = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Qhi(boolean z10) {
        cJ = z10;
    }
}
