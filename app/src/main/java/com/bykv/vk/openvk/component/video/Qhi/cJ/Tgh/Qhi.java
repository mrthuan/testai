package com.bykv.vk.openvk.component.video.Qhi.cJ.Tgh;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.Qhi.cJ.ROR;
import com.bykv.vk.openvk.component.video.Qhi.cJ.Tgh;
import com.bykv.vk.openvk.component.video.Qhi.cJ.fl;
import com.bykv.vk.openvk.component.video.api.Tgh.ac;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: VideoCachePreloader.java */
/* loaded from: classes.dex */
public class Qhi {
    public static final boolean Qhi = ac.ac();

    /* renamed from: ac  reason: collision with root package name */
    private C0058Qhi f7146ac;
    private HashMap<String, Boolean> cJ;

    /* compiled from: VideoCachePreloader.java */
    /* loaded from: classes.dex */
    public static class cJ {
        private static final Qhi Qhi = new Qhi();
    }

    public static Qhi Qhi() {
        return cJ.Qhi;
    }

    private static com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac ac() {
        File file = new File(com.bykv.vk.openvk.component.video.api.ac.Qhi().getCacheDir(), "proxy_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac acVar = new com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac(file);
            try {
                acVar.Qhi(104857600L);
                return acVar;
            } catch (IOException unused) {
                return acVar;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public boolean cJ() {
        if (this.f7146ac != null) {
            return true;
        }
        com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac ac2 = ac();
        if (ac2 == null) {
            return false;
        }
        Tgh.Qhi(true);
        Tgh.cJ(true);
        Tgh.Qhi(1);
        ROR.Qhi().CJ();
        try {
            C0058Qhi c0058Qhi = new C0058Qhi();
            this.f7146ac = c0058Qhi;
            c0058Qhi.setName("csj_video_cache_preloader");
            this.f7146ac.start();
            Tgh.Qhi(ac2, com.bykv.vk.openvk.component.video.api.ac.Qhi());
            fl.ac();
            fl.ac().Qhi(10485759);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private Qhi() {
        this.cJ = new HashMap<>();
        cJ();
    }

    public boolean Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
        if (cJ()) {
            this.f7146ac.Qhi(acVar);
            return true;
        }
        return false;
    }

    /* compiled from: VideoCachePreloader.java */
    /* renamed from: com.bykv.vk.openvk.component.video.Qhi.cJ.Tgh.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0058Qhi extends Thread {
        private final Queue<C0059Qhi> CJ = new ArrayBlockingQueue(10);
        private Queue<C0059Qhi> cJ = new LinkedBlockingQueue();

        /* renamed from: ac  reason: collision with root package name */
        private boolean f7147ac = true;

        /* renamed from: fl  reason: collision with root package name */
        private Queue<C0059Qhi> f7148fl = new LinkedBlockingQueue();

        /* compiled from: VideoCachePreloader.java */
        /* renamed from: com.bykv.vk.openvk.component.video.Qhi.cJ.Tgh.Qhi$Qhi$Qhi  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0059Qhi {
            public int CJ;
            public int Qhi;
            public com.bykv.vk.openvk.component.video.api.ac.ac Tgh;

            /* renamed from: ac  reason: collision with root package name */
            public String[] f7149ac;
            public String cJ;

            /* renamed from: fl  reason: collision with root package name */
            public String f7150fl;

            public C0059Qhi() {
            }
        }

        public C0058Qhi() {
        }

        private C0059Qhi Qhi(int i10, com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
            this.CJ.size();
            C0059Qhi poll = this.CJ.poll();
            if (poll == null) {
                poll = new C0059Qhi();
            }
            poll.Qhi = i10;
            poll.Tgh = acVar;
            return poll;
        }

        private void ac(C0059Qhi c0059Qhi) {
            if (c0059Qhi == null) {
                return;
            }
            this.cJ.offer(c0059Qhi);
            notify();
        }

        private synchronized void cJ(C0059Qhi c0059Qhi) {
            this.f7148fl.add(c0059Qhi);
            notify();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            String[] strArr;
            boolean z10;
            while (this.f7147ac) {
                synchronized (this) {
                    if (!this.f7148fl.isEmpty()) {
                        Qhi();
                    }
                    while (!this.cJ.isEmpty()) {
                        C0059Qhi poll = this.cJ.poll();
                        if (poll != null) {
                            int i10 = poll.Qhi;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            if (i10 == 4) {
                                                fl.ac().CJ();
                                                this.f7147ac = false;
                                            }
                                        } else {
                                            fl.ac().CJ();
                                            if (Tgh.ac() == null) {
                                                if (Tgh.cJ() != null) {
                                                    Tgh.cJ().Qhi();
                                                }
                                            } else {
                                                Tgh.ac();
                                                throw null;
                                            }
                                        }
                                    } else {
                                        fl.ac().CJ();
                                    }
                                } else {
                                    fl.ac().Qhi(poll.cJ);
                                }
                            } else {
                                String[] strArr2 = poll.f7149ac;
                                if (strArr2 != null && strArr2.length > 0) {
                                    ArrayList arrayList = new ArrayList();
                                    for (String str : poll.f7149ac) {
                                        if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(str)) {
                                            arrayList.add(str);
                                        }
                                    }
                                    String[] strArr3 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                                    if (!TextUtils.isEmpty(poll.f7150fl)) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    fl.ac().Qhi(false, z10, poll.CJ, poll.cJ, strArr3);
                                }
                            }
                            Qhi(poll);
                        }
                    }
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        private void Qhi(C0059Qhi c0059Qhi) {
            c0059Qhi.f7149ac = null;
            c0059Qhi.cJ = null;
            c0059Qhi.Qhi = -1;
            c0059Qhi.Tgh = null;
            this.CJ.offer(c0059Qhi);
        }

        private void Qhi() {
            while (true) {
                C0059Qhi poll = this.f7148fl.poll();
                if (poll == null) {
                    return;
                }
                poll.cJ = poll.Tgh.ABk();
                poll.f7149ac = new String[]{poll.Tgh.ABk()};
                int Qhi = poll.Tgh.Qhi();
                if (Qhi <= 0) {
                    Qhi = poll.Tgh.ac();
                }
                poll.CJ = Qhi;
                poll.f7150fl = poll.Tgh.iMK();
                if (!TextUtils.isEmpty(poll.Tgh.iMK())) {
                    poll.cJ = poll.Tgh.iMK();
                }
                poll.Tgh = null;
                ac(poll);
            }
        }

        public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
            cJ(Qhi(0, acVar));
        }
    }

    public String cJ(com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
        if (acVar == null) {
            return null;
        }
        boolean z10 = !TextUtils.isEmpty(acVar.iMK());
        return ROR.Qhi().Qhi(false, z10, z10 ? acVar.iMK() : acVar.ABk(), acVar.ABk());
    }
}
