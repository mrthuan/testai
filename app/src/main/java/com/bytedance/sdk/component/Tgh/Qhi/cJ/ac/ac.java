package com.bytedance.sdk.component.Tgh.Qhi.cJ.ac;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.Tgh.Qhi.CJ.ROR;
import com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh;
import com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl;
import com.bytedance.sdk.component.Tgh.Qhi.hm;
import com.google.android.gms.common.api.Api;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdPriorityLogThread.java */
/* loaded from: classes.dex */
public class ac extends HandlerThread implements Handler.Callback {
    private static int HzH = 10;
    private static int kYc = 200;
    private volatile Handler ABk;
    private com.bytedance.sdk.component.Tgh.Qhi.cJ.ac CJ;
    private final long Gm;
    private final int MQ;
    protected fl Qhi;
    private volatile long ROR;
    private volatile long Sf;
    private volatile int Tgh;
    private final long WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final Object f8092ac;
    private volatile boolean cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final PriorityBlockingQueue<Tgh> f8093fl;

    /* renamed from: hm  reason: collision with root package name */
    private final AtomicInteger f8094hm;
    private final AtomicInteger hpZ;
    private final List<Tgh> iMK;
    private final AtomicInteger pA;
    private final int qMt;
    private final int tP;

    /* renamed from: zc  reason: collision with root package name */
    private final AtomicInteger f8095zc;

    public ac(PriorityBlockingQueue<Tgh> priorityBlockingQueue) {
        super("csj_log");
        this.cJ = true;
        this.f8092ac = new Object();
        this.ROR = 0L;
        this.Sf = 0L;
        this.f8094hm = new AtomicInteger(0);
        this.WAv = TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL;
        this.Gm = 5000000000L;
        this.f8095zc = new AtomicInteger(0);
        this.iMK = new ArrayList();
        this.pA = new AtomicInteger(0);
        this.hpZ = new AtomicInteger(0);
        this.tP = 1;
        this.MQ = 2;
        this.qMt = 3;
        this.f8093fl = priorityBlockingQueue;
        this.Qhi = new com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ();
    }

    private void CJ() {
        if (!isAlive()) {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.Qhi.CJ();
        } else if (Qhi()) {
        } else {
            ac(6);
        }
    }

    private void ROR() {
        if (this.f8093fl.size() >= 100) {
            for (int i10 = 0; i10 < 100; i10++) {
                Tgh poll = this.f8093fl.poll();
                if (!(poll instanceof ROR) && poll != null) {
                    Qhi(poll);
                }
            }
        }
    }

    private boolean Sf() {
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.Qhi.cJ) {
            if (this.Tgh == 4 || this.Tgh == 7 || this.Tgh == 6 || this.Tgh == 5 || this.Tgh == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    private void Tgh() {
        com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.EBS(), 1);
        Qhi(false);
        com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.Qhi.ac();
    }

    private void WAv() {
        long nanoTime;
        com.bytedance.sdk.component.Tgh.Qhi.cJ.fl flVar;
        if (this.ABk.hasMessages(11)) {
            hm();
        } else {
            fl(1);
        }
        com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi qhi = com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ;
        com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(qhi.cJ(), 1);
        if (this.Tgh == 2) {
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(qhi.ROR(), 1);
            synchronized (this.f8092ac) {
                try {
                    try {
                        long nanoTime2 = System.nanoTime();
                        this.f8092ac.wait(TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
                        nanoTime = System.nanoTime() - nanoTime2;
                        flVar = com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.Qhi;
                        if (!flVar.cJ) {
                            boolean z10 = flVar.f8102ac;
                        }
                    } catch (InterruptedException e10) {
                        e10.getMessage();
                    }
                    if (nanoTime < 5000000000L && 5000000000L - nanoTime >= 50000000) {
                        if (!flVar.cJ && !flVar.f8102ac) {
                            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(qhi.es(), 1);
                            ac(2);
                            return;
                        }
                        com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(qhi.Gm(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(qhi.WAv(), 1);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void ac() {
        CJ();
        com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.zn(), 1);
        ac(1);
    }

    private void fl() {
        while (Qhi()) {
            try {
                com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi qhi = com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ;
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(qhi.Sf(), 1);
                Tgh poll = this.f8093fl.poll(60000L, TimeUnit.MILLISECONDS);
                int size = this.f8093fl.size();
                if (poll instanceof ROR) {
                    Qhi(poll, size);
                } else if (poll == null) {
                    int incrementAndGet = this.f8094hm.incrementAndGet();
                    com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(qhi.xyz(), 1);
                    if (CJ(incrementAndGet)) {
                        Tgh();
                        return;
                    } else if (incrementAndGet < 4) {
                        this.Tgh = 1;
                        cJ((Tgh) null);
                    }
                } else {
                    Qhi(poll);
                    cJ(poll);
                }
            } catch (Throwable th2) {
                th2.getMessage();
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.yN(), 1);
            }
        }
    }

    private void hm() {
        try {
            if (this.f8093fl.size() == 0 && this.ABk.hasMessages(11) && Qhi()) {
                Qhi(false);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
        } catch (Throwable th2) {
            th2.getMessage();
        }
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 11) {
                    ArrayList arrayList = new ArrayList(this.iMK);
                    this.iMK.clear();
                    Qhi((List<Tgh>) arrayList, false, "timeout_dispatch");
                    WAv();
                }
                return true;
            }
            ac();
        } else {
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.hm(), 1);
            cJ();
            Qhi(true);
            fl();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.ABk = new Handler(getLooper(), this);
        com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.Qhi.Qhi(this.ABk);
        this.ABk.sendEmptyMessage(1);
    }

    public static void cJ(int i10) {
        kYc = i10;
    }

    private void cJ() {
        long HzH2 = hm.ROR().HzH();
        if (HzH2 <= 0) {
            return;
        }
        this.Qhi.Qhi(Api.BaseClientBuilder.API_PRIORITY_OTHER, HzH2);
    }

    public static void Qhi(int i10) {
        HzH = i10;
    }

    public void ac(int i10) {
        try {
            boolean Qhi = Qhi(i10, com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.Qhi.cJ);
            if (i10 == 6 || Qhi) {
                ROR ror = new ROR();
                ror.cJ(i10);
                this.f8093fl.add(ror);
                fl(3);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private boolean CJ(int i10) {
        if (i10 < 4 || this.f8095zc.get() != 0) {
            return false;
        }
        com.bytedance.sdk.component.Tgh.Qhi.cJ.fl flVar = com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.Qhi;
        return (flVar.cJ || flVar.f8102ac) ? false : true;
    }

    private void cJ(Tgh tgh) {
        if (com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.cJ() && hm.ROR().Qhi()) {
            return;
        }
        int i10 = 0;
        if (Sf()) {
            com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.Qhi(this.Tgh);
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.zc(), 1);
            if (this.f8093fl.size() != 0) {
                return;
            }
            if (!this.ABk.hasMessages(2)) {
                com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.Qhi.cJ = false;
                this.Sf = 0L;
                this.ROR = 0L;
                this.pA.set(0);
                this.hpZ.set(0);
            } else {
                Qhi(false);
                return;
            }
        }
        do {
            boolean Qhi = Qhi(this.Tgh, com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.Qhi.cJ);
            com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.Qhi(Qhi, this.Tgh, tgh);
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.ABk(), 1);
            if (Qhi) {
                List<Tgh> Qhi2 = this.Qhi.Qhi(this.Tgh, -1, null);
                if (Qhi2 != null) {
                    Qhi2.size();
                    Qhi(Qhi2);
                } else {
                    hm();
                }
            } else {
                hm();
            }
            i10++;
            if (!Qhi) {
                return;
            }
        } while (i10 <= 6);
    }

    public void Qhi(boolean z10) {
        this.cJ = z10;
    }

    public boolean Qhi() {
        return this.cJ;
    }

    public boolean Qhi(int i10, boolean z10) {
        com.bytedance.sdk.component.Tgh.Qhi.Tgh hpZ = hm.ROR().hpZ();
        if (hpZ == null || !hpZ.Qhi(hm.ROR().Tgh())) {
            return false;
        }
        return this.Qhi.Qhi(i10, z10);
    }

    public void Qhi(Tgh tgh, boolean z10) {
        if (tgh == null) {
            return;
        }
        tgh.CJ();
        if (z10) {
            if (this.ABk != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(tgh);
                Qhi((List<Tgh>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.f8093fl.add(tgh);
        fl(2);
    }

    private void Qhi(Tgh tgh, int i10) {
        this.f8094hm.set(0);
        if (i10 == 0) {
            this.Tgh = ((ROR) tgh).Gm();
            if (this.Tgh != 6) {
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.ip(), 1);
                cJ(tgh);
                return;
            }
            return;
        }
        ROR ror = (ROR) tgh;
        if (ror.Gm() == 1) {
            this.Tgh = 1;
            cJ(tgh);
        } else if (ror.Gm() == 2) {
            ROR();
            this.Tgh = 2;
            cJ(tgh);
        }
    }

    private void fl(int i10) {
        if (!Qhi()) {
            if (this.ABk == null) {
                return;
            }
            com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi qhi = com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ;
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(qhi.ac(), 1);
            if (this.ABk.hasMessages(1)) {
                return;
            }
            if (i10 == 1) {
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(qhi.Tgh(), 1);
            } else if (i10 == 2) {
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(qhi.CJ(), 1);
            } else if (i10 == 3) {
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(qhi.fl(), 1);
            }
            this.ABk.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.Qhi(), 1);
    }

    private void cJ(List<Tgh> list) {
        this.iMK.addAll(list);
        this.iMK.size();
        com.bytedance.sdk.component.Tgh.Qhi.Tgh hpZ = hm.ROR().hpZ();
        if (hpZ != null && hpZ.zc() != null) {
            HzH = hpZ.zc().cJ();
        }
        if (this.iMK.size() >= HzH) {
            if (this.ABk.hasMessages(11)) {
                this.ABk.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.iMK);
            this.iMK.clear();
            Qhi((List<Tgh>) arrayList, false, "max_size_dispatch");
            WAv();
        } else if (this.f8093fl.size() == 0) {
            Qhi(false);
            if (this.ABk.hasMessages(11)) {
                this.ABk.removeMessages(11);
            }
            if (this.ABk.hasMessages(1)) {
                this.ABk.removeMessages(1);
            }
            long j10 = kYc;
            if (hpZ != null && hpZ.zc() != null) {
                j10 = hpZ.zc().Qhi();
            }
            this.ABk.sendEmptyMessageDelayed(11, j10);
        } else {
            this.iMK.size();
        }
    }

    private void Qhi(Tgh tgh) {
        this.f8094hm.set(0);
        com.bytedance.sdk.component.Tgh.Qhi.cJ.fl flVar = com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.Qhi;
        if (flVar.cJ) {
            this.Tgh = 5;
        } else if (flVar.f8102ac) {
            this.Tgh = 7;
        } else {
            this.Tgh = 4;
        }
        com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.cjC(), 1);
        this.Qhi.Qhi(tgh, this.Tgh);
        com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.ROR(tgh);
    }

    private void Qhi(List<Tgh> list, String str) {
        Qhi(str);
        Qhi(list, false, str);
        WAv();
    }

    private void Qhi(List<Tgh> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.Qhi(list, this.f8093fl.size());
            if (list.size() <= 1 && !com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.ac()) {
                Tgh tgh = list.get(0);
                if (tgh != null) {
                    if (tgh.fl() == 1) {
                        Qhi(list, "highPriority");
                        return;
                    } else if (tgh.CJ() == 0 && tgh.fl() == 2) {
                        if (tgh.cJ() == 3) {
                            Qhi(list, "version_v3");
                            return;
                        } else {
                            cJ(list);
                            return;
                        }
                    } else if (tgh.CJ() == 1) {
                        Qhi(list, "stats");
                        return;
                    } else if (tgh.CJ() == 3) {
                        Qhi(list, "adType_v3");
                        return;
                    } else if (tgh.CJ() == 2) {
                        Qhi(list, "other");
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            Qhi(list, "batchRead");
            return;
        }
        hm();
    }

    private void cJ(List<Tgh> list, final boolean z10, final long j10) {
        this.f8095zc.incrementAndGet();
        com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.oU(), 1);
        try {
            HashMap hashMap = new HashMap();
            Iterator<Tgh> it = list.iterator();
            while (it.hasNext()) {
                Tgh next = it.next();
                int WAv = next == null ? 0 : next.WAv();
                if (hashMap.get(Integer.valueOf(WAv)) == null) {
                    hashMap.put(Integer.valueOf(WAv), new ArrayList());
                }
                ((List) hashMap.get(Integer.valueOf(WAv))).add(next);
            }
            for (Integer num : hashMap.keySet()) {
                int intValue = num.intValue();
                if (intValue != 0 && hm.ROR().ac() != null && hm.ROR().ac().get(Integer.valueOf(intValue)) != null) {
                    hm.ROR().ac().get(Integer.valueOf(intValue)).Qhi(list, new com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ() { // from class: com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.ac.3
                        @Override // com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ
                        public void Qhi(List<Qhi> list2) {
                            try {
                                ac.this.f8095zc.decrementAndGet();
                                if (list2 != null && list2.size() != 0) {
                                    int size = list2.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        Qhi qhi = list2.get(i10);
                                        if (qhi != null) {
                                            ac.this.Qhi(z10, qhi.Qhi(), qhi.cJ(), j10);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
                this.CJ.Qhi(list, new com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ() { // from class: com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.ac.2
                    @Override // com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ
                    public void Qhi(List<Qhi> list2) {
                        try {
                            ac.this.f8095zc.decrementAndGet();
                            if (list2 != null && list2.size() != 0) {
                                int size = list2.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    Qhi qhi = list2.get(i10);
                                    if (qhi != null) {
                                        ac.this.Qhi(z10, qhi.Qhi(), qhi.cJ(), j10);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        } catch (Exception e10) {
            e10.getMessage();
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.yN(), 1);
            this.f8095zc.decrementAndGet();
        }
    }

    private void Qhi(String str) {
        if (this.ABk.hasMessages(11)) {
            this.ABk.removeMessages(11);
        }
        if (this.iMK.size() != 0) {
            ArrayList arrayList = new ArrayList(this.iMK);
            this.iMK.clear();
            Qhi((List<Tgh>) arrayList, false, "before_".concat(String.valueOf(str)));
            WAv();
            arrayList.size();
        }
    }

    private void Qhi(List<Tgh> list, boolean z10, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.Qhi(list, this.Tgh, str);
        com.bytedance.sdk.component.Tgh.Qhi.cJ.ac Sf = hm.ROR().Sf();
        this.CJ = Sf;
        if (Sf != null) {
            cJ(list, z10, currentTimeMillis);
        } else {
            Qhi(list, z10, currentTimeMillis);
        }
    }

    private void Qhi(final List<Tgh> list, final boolean z10, final long j10) {
        com.bytedance.sdk.component.Tgh.Qhi.Tgh hpZ = hm.ROR().hpZ();
        if (hpZ != null) {
            Executor fl2 = hpZ.fl();
            if (list.get(0).fl() == 1) {
                fl2 = hpZ.CJ();
            }
            if (fl2 == null) {
                return;
            }
            this.f8095zc.incrementAndGet();
            fl2.execute(new com.bytedance.sdk.component.Tgh.Qhi.fl.Tgh("csj_log_upload") { // from class: com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.ac.1
                @Override // java.lang.Runnable
                public void run() {
                    ac acVar = ac.this;
                    acVar.Qhi(list, z10, j10, acVar.Tgh);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(List<Tgh> list, boolean z10, long j10, int i10) {
        cJ Qhi;
        try {
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.oU(), 1);
            if (list.get(0).CJ() == 0) {
                Qhi = hm.fl().Qhi(list);
                Qhi(Qhi, list);
                if (Qhi != null) {
                    com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.Qhi(list, Qhi.CJ);
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Tgh tgh : list) {
                        jSONArray.put(tgh.ROR());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e10) {
                    e10.getMessage();
                }
                Qhi = hm.fl().Qhi(jSONObject);
            }
            cJ cJVar = Qhi;
            this.f8095zc.decrementAndGet();
            Qhi(z10, cJVar, list, j10);
        } catch (Throwable th2) {
            th2.getMessage();
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.yN(), 1);
            this.f8095zc.decrementAndGet();
        }
    }

    private void Qhi(cJ cJVar, List<Tgh> list) {
        if (cJVar == null || !cJVar.Qhi) {
            return;
        }
        List<Object> Qhi = com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi();
        if (list == null || Qhi == null || Qhi.size() == 0) {
            return;
        }
        for (Tgh tgh : list) {
            if (tgh.fl() == 1) {
                com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.Qhi(tgh);
                com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.fl(tgh);
                Iterator<Object> it = Qhi.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(boolean z10, cJ cJVar, List<Tgh> list, long j10) {
        if (z10 || cJVar == null) {
            return;
        }
        int i10 = cJVar.cJ;
        int i11 = -2;
        if (cJVar.f8100fl) {
            i10 = -1;
        } else if (i10 < 0) {
            i10 = -2;
        }
        if (i10 == 510 || i10 == 511) {
            i10 = -2;
        }
        if (cJVar.Qhi || ((i10 < 500 || i10 >= 509) && i10 <= 513)) {
            i11 = i10;
        }
        if (list != null) {
            list.size();
            this.f8095zc.get();
        }
        Qhi(i11, list, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5 A[Catch: all -> 0x00f3, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00e1, B:55:0x00e5, B:56:0x00ea, B:18:0x0030, B:20:0x003e, B:22:0x0040, B:24:0x004d, B:26:0x004f, B:28:0x005d, B:29:0x0062, B:30:0x0067, B:32:0x006d, B:34:0x0071, B:36:0x007d, B:37:0x0082, B:39:0x008a, B:40:0x008f, B:41:0x00ac, B:43:0x00ba, B:45:0x00bc, B:47:0x00c9, B:49:0x00cb, B:51:0x00d9, B:52:0x00de, B:59:0x00f1), top: B:64:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Qhi(int r6, java.util.List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> r7, long r8) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.ac.Qhi(int, java.util.List, long):void");
    }

    public void Qhi(int i10, long j10) {
        if (this.ABk == null) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i10;
        if (i10 == 2) {
            this.ABk.sendMessageDelayed(obtain, (((this.pA.incrementAndGet() - 1) % 4) + 1) * j10);
        } else if (i10 == 3) {
            this.ABk.sendMessageDelayed(obtain, (((this.hpZ.incrementAndGet() - 1) % 4) + 1) * j10);
        }
    }
}
