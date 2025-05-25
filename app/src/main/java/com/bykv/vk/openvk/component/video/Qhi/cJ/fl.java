package com.bykv.vk.openvk.component.video.Qhi.cJ;

import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bykv.vk.openvk.component.video.Qhi.cJ.WAv;
import com.bykv.vk.openvk.component.video.Qhi.cJ.cJ;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Preloader.java */
/* loaded from: classes.dex */
public class fl {

    /* renamed from: fl  reason: collision with root package name */
    private static volatile fl f7162fl;
    private volatile String ABk;
    private final ExecutorService CJ;
    private volatile ac Gm;
    private volatile int Qhi = 163840;
    private volatile com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac ROR;
    private volatile com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.cJ Sf;
    private volatile com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac Tgh;
    private final cJ.InterfaceC0060cJ WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final cJ<Runnable> f7163ac;
    private final SparseArray<Map<String, com.bykv.vk.openvk.component.video.Qhi.cJ.cJ>> cJ;

    /* renamed from: hm  reason: collision with root package name */
    private final HashSet<Qhi> f7164hm;
    private volatile boolean iMK;

    /* renamed from: zc  reason: collision with root package name */
    private volatile ac f7165zc;

    /* compiled from: Preloader.java */
    /* loaded from: classes.dex */
    public static final class Qhi {
        final String CJ;
        final boolean Qhi;
        final String[] Tgh;

        /* renamed from: ac  reason: collision with root package name */
        final int f7167ac;
        final boolean cJ;

        /* renamed from: fl  reason: collision with root package name */
        final Map<String, String> f7168fl;

        public Qhi(boolean z10, boolean z11, int i10, String str, Map<String, String> map, String[] strArr) {
            this.Qhi = z10;
            this.cJ = z11;
            this.f7167ac = i10;
            this.CJ = str;
            this.f7168fl = map;
            this.Tgh = strArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Qhi.class != obj.getClass()) {
                return false;
            }
            Qhi qhi = (Qhi) obj;
            if (this.Qhi != qhi.Qhi || this.cJ != qhi.cJ || this.f7167ac != qhi.f7167ac) {
                return false;
            }
            return this.CJ.equals(qhi.CJ);
        }

        public int hashCode() {
            return this.CJ.hashCode() + ((((((this.Qhi ? 1 : 0) * 31) + (this.cJ ? 1 : 0)) * 31) + this.f7167ac) * 31);
        }
    }

    /* compiled from: Preloader.java */
    /* loaded from: classes.dex */
    public static final class cJ<T> extends LinkedBlockingDeque<T> {
        private ThreadPoolExecutor Qhi;

        private cJ() {
        }

        public void Qhi(ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                if (this.Qhi == null) {
                    if (threadPoolExecutor != null) {
                        this.Qhi = threadPoolExecutor;
                    } else {
                        throw new NullPointerException("executor argument can't be null!");
                    }
                } else {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                }
            }
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        public boolean offer(T t4) {
            synchronized (this) {
                int poolSize = this.Qhi.getPoolSize();
                int activeCount = this.Qhi.getActiveCount();
                int maximumPoolSize = this.Qhi.getMaximumPoolSize();
                if (activeCount >= poolSize && poolSize < maximumPoolSize) {
                    boolean z10 = Tgh.f7143ac;
                    return false;
                }
                return offerFirst(t4);
            }
        }
    }

    private fl() {
        SparseArray<Map<String, com.bykv.vk.openvk.component.video.Qhi.cJ.cJ>> sparseArray = new SparseArray<>(2);
        this.cJ = sparseArray;
        this.f7164hm = new HashSet<>();
        this.WAv = new cJ.InterfaceC0060cJ() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.fl.1
            @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.InterfaceC0060cJ
            public void Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.cJ cJVar) {
                int Tgh = cJVar.Tgh();
                synchronized (fl.this.cJ) {
                    Map map = (Map) fl.this.cJ.get(Tgh);
                    if (map != null) {
                        map.remove(cJVar.Sf);
                    }
                }
                boolean z10 = Tgh.f7143ac;
            }
        };
        cJ<Runnable> cJVar = new cJ<>();
        this.f7163ac = cJVar;
        ExecutorService Qhi2 = Qhi(cJVar);
        this.CJ = Qhi2;
        cJVar.Qhi((ThreadPoolExecutor) Qhi2);
        sparseArray.put(0, new HashMap());
        sparseArray.put(1, new HashMap());
    }

    public static fl ac() {
        if (f7162fl == null) {
            synchronized (fl.class) {
                if (f7162fl == null) {
                    f7162fl = new fl();
                }
            }
        }
        return f7162fl;
    }

    public void CJ() {
        com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(new com.bytedance.sdk.component.Sf.hm("cancelAll") { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.fl.3
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                synchronized (fl.this.cJ) {
                    int size = fl.this.cJ.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Map map = (Map) fl.this.cJ.get(fl.this.cJ.keyAt(i10));
                        if (map != null) {
                            arrayList.addAll(map.values());
                            map.clear();
                        }
                    }
                    fl.this.f7163ac.clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.bykv.vk.openvk.component.video.Qhi.cJ.cJ cJVar = (com.bykv.vk.openvk.component.video.Qhi.cJ.cJ) it.next();
                    cJVar.Qhi();
                    if (Tgh.f7143ac) {
                        cJVar.toString();
                    }
                }
            }
        });
    }

    public void Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac acVar) {
        this.ROR = acVar;
    }

    public ac cJ() {
        return this.f7165zc;
    }

    public void Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac acVar) {
        this.Tgh = acVar;
    }

    public void Qhi(int i10) {
        if (i10 > 0) {
            this.Qhi = i10;
        }
        if (Tgh.f7143ac) {
            "MaxPreloadSize: ".concat(String.valueOf(i10));
        }
    }

    public ac Qhi() {
        return this.Gm;
    }

    public void Qhi(boolean z10, String str) {
        com.bykv.vk.openvk.component.video.Qhi.cJ.cJ remove;
        this.ABk = str;
        this.iMK = z10;
        if (Tgh.f7143ac) {
            "setCurrentPlayKey, ".concat(String.valueOf(str));
        }
        HashSet hashSet = null;
        HashSet hashSet2 = null;
        if (str == null) {
            synchronized (this.f7164hm) {
                if (!this.f7164hm.isEmpty()) {
                    hashSet2 = new HashSet(this.f7164hm);
                    this.f7164hm.clear();
                }
            }
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    Qhi qhi = (Qhi) it.next();
                    Qhi(qhi.Qhi, qhi.cJ, qhi.f7167ac, qhi.CJ, qhi.f7168fl, qhi.Tgh);
                    boolean z11 = Tgh.f7143ac;
                }
                return;
            }
            return;
        }
        int i10 = Tgh.Sf;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 1) {
                synchronized (this.cJ) {
                    Map<String, com.bykv.vk.openvk.component.video.Qhi.cJ.cJ> map = this.cJ.get(com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.cJ.Qhi(z10));
                    remove = map != null ? map.remove(str) : null;
                }
                if (remove != null) {
                    remove.Qhi();
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this.cJ) {
            int size = this.cJ.size();
            for (int i11 = 0; i11 < size; i11++) {
                SparseArray<Map<String, com.bykv.vk.openvk.component.video.Qhi.cJ.cJ>> sparseArray = this.cJ;
                Map<String, com.bykv.vk.openvk.component.video.Qhi.cJ.cJ> map2 = sparseArray.get(sparseArray.keyAt(i11));
                if (map2 != null) {
                    Collection<com.bykv.vk.openvk.component.video.Qhi.cJ.cJ> values = map2.values();
                    if (values != null && !values.isEmpty()) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.addAll(values);
                    }
                    map2.clear();
                }
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((com.bykv.vk.openvk.component.video.Qhi.cJ.cJ) it2.next()).Qhi();
            boolean z12 = Tgh.f7143ac;
        }
        if (i10 == 3) {
            synchronized (this.f7164hm) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    Qhi qhi2 = (Qhi) ((com.bykv.vk.openvk.component.video.Qhi.cJ.cJ) it3.next()).iMK;
                    if (qhi2 != null) {
                        this.f7164hm.add(qhi2);
                    }
                }
            }
        }
    }

    public void Qhi(boolean z10, boolean z11, int i10, String str, String... strArr) {
        Qhi(z10, z11, i10, str, null, strArr);
    }

    public void Qhi(boolean z10, boolean z11, int i10, String str, Map<String, String> map, String... strArr) {
        ArrayList arrayList;
        boolean z12 = Tgh.f7143ac;
        com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.Qhi qhi = z10 ? this.Sf : this.ROR;
        com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac acVar = this.Tgh;
        if (qhi == null || acVar == null || TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return;
        }
        int i11 = i10 <= 0 ? this.Qhi : i10;
        String Qhi2 = z11 ? str : com.bykv.vk.openvk.component.video.api.Tgh.cJ.Qhi(str);
        File CJ = qhi.CJ(Qhi2);
        if (CJ != null && CJ.length() >= i11) {
            if (z12) {
                CJ.length();
            }
        } else if (ROR.Qhi().Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.cJ.Qhi(z10), Qhi2)) {
            if (z12) {
                "has running proxy task, skip preload for key: ".concat(String.valueOf(str));
            }
        } else {
            synchronized (this.cJ) {
                Map<String, com.bykv.vk.openvk.component.video.Qhi.cJ.cJ> map2 = this.cJ.get(z10 ? 1 : 0);
                if (map2.containsKey(Qhi2)) {
                    return;
                }
                int i12 = i11;
                Qhi qhi2 = new Qhi(z10, z11, i11, str, map, strArr);
                String str2 = this.ABk;
                if (str2 != null) {
                    int i13 = Tgh.Sf;
                    if (i13 == 3) {
                        synchronized (this.f7164hm) {
                            this.f7164hm.add(qhi2);
                        }
                        return;
                    } else if (i13 == 2) {
                        if (z12) {
                            "cancel preload: ".concat(String.valueOf(str));
                        }
                        return;
                    } else if (i13 == 1 && this.iMK == z10 && str2.equals(Qhi2)) {
                        return;
                    }
                }
                List<WAv.cJ> Qhi3 = com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(map));
                if (Qhi3 != null) {
                    arrayList = new ArrayList(Qhi3.size());
                    int size = Qhi3.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        WAv.cJ cJVar = Qhi3.get(i14);
                        if (cJVar != null) {
                            arrayList.add(new WAv.cJ(cJVar.Qhi, cJVar.cJ));
                        }
                    }
                } else {
                    arrayList = null;
                }
                com.bykv.vk.openvk.component.video.Qhi.cJ.cJ Qhi4 = new cJ.Qhi().Qhi(qhi).Qhi(acVar).Qhi(str).cJ(Qhi2).Qhi(new ABk(com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(strArr))).Qhi((List<WAv.cJ>) arrayList).Qhi(i12).Qhi(this.WAv).Qhi(qhi2).Qhi();
                map2.put(Qhi2, Qhi4);
                this.CJ.execute(Qhi4);
            }
        }
    }

    public void Qhi(String str) {
        Qhi(false, false, str);
    }

    public void Qhi(final boolean z10, final boolean z11, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(new com.bytedance.sdk.component.Sf.hm("cancel b b S") { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.fl.2
            @Override // java.lang.Runnable
            public void run() {
                com.bykv.vk.openvk.component.video.Qhi.cJ.cJ cJVar;
                String Qhi2;
                synchronized (fl.this.cJ) {
                    Map map = (Map) fl.this.cJ.get(com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.cJ.Qhi(z10));
                    if (map != null) {
                        if (z11) {
                            Qhi2 = str;
                        } else {
                            Qhi2 = com.bykv.vk.openvk.component.video.api.Tgh.cJ.Qhi(str);
                        }
                        cJVar = (com.bykv.vk.openvk.component.video.Qhi.cJ.cJ) map.remove(Qhi2);
                    } else {
                        cJVar = null;
                    }
                }
                if (cJVar != null) {
                    cJVar.Qhi();
                }
            }
        });
    }

    private static ExecutorService Qhi(final cJ<Runnable> cJVar) {
        int i10;
        int Qhi2 = com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi();
        if (Qhi2 <= 0) {
            Qhi2 = 1;
        } else if (Qhi2 > 4) {
            i10 = 4;
            return new ThreadPoolExecutor(0, i10, 60L, TimeUnit.SECONDS, cJVar, new ThreadFactory() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.fl.4
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable) { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.fl.4.1
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            try {
                                Process.setThreadPriority(10);
                            } catch (Throwable unused) {
                            }
                            super.run();
                        }
                    };
                    thread.setName("csj_video_preload_" + thread.getId());
                    thread.setDaemon(true);
                    if (Tgh.f7143ac) {
                        thread.getName();
                    }
                    return thread;
                }
            }, new RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.fl.5
                @Override // java.util.concurrent.RejectedExecutionHandler
                public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    try {
                        cJ.this.offerFirst(runnable);
                        boolean z10 = Tgh.f7143ac;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
        i10 = Qhi2;
        return new ThreadPoolExecutor(0, i10, 60L, TimeUnit.SECONDS, cJVar, new ThreadFactory() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.fl.4
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable) { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.fl.4.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable unused) {
                        }
                        super.run();
                    }
                };
                thread.setName("csj_video_preload_" + thread.getId());
                thread.setDaemon(true);
                if (Tgh.f7143ac) {
                    thread.getName();
                }
                return thread;
            }
        }, new RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.fl.5
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    cJ.this.offerFirst(runnable);
                    boolean z10 = Tgh.f7143ac;
                } catch (Throwable unused) {
                }
            }
        });
    }
}
