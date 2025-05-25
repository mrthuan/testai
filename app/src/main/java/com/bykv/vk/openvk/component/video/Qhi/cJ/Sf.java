package com.bykv.vk.openvk.component.video.Qhi.cJ;

import android.util.Log;
import com.bykv.vk.openvk.component.video.Qhi.cJ.ABk;
import com.bykv.vk.openvk.component.video.Qhi.cJ.WAv;
import com.bykv.vk.openvk.component.video.Qhi.cJ.cJ;
import com.bykv.vk.openvk.component.video.Qhi.cJ.hm;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProxyTask.java */
/* loaded from: classes.dex */
public class Sf extends com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi {
    private final Socket ABk;
    private volatile boolean HzH;
    private volatile com.bykv.vk.openvk.component.video.Qhi.cJ.cJ hpZ;
    private final ac iMK;
    private final fl pA;

    /* compiled from: ProxyTask.java */
    /* loaded from: classes.dex */
    public interface ac {
        void Qhi(Sf sf2);

        void cJ(Sf sf2);
    }

    /* compiled from: ProxyTask.java */
    /* loaded from: classes.dex */
    public static class cJ {
        private final OutputStream Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private boolean f7142ac;
        private int cJ;

        public cJ(OutputStream outputStream, int i10) {
            this.Qhi = outputStream;
            this.cJ = i10;
        }

        public boolean Qhi() {
            return this.f7142ac;
        }

        public void cJ(byte[] bArr, int i10, int i11) {
            try {
                this.Qhi.write(bArr, i10, i11);
                this.cJ += i11;
            } catch (IOException e10) {
                throw new com.bykv.vk.openvk.component.video.Qhi.cJ.ac.fl(e10);
            }
        }

        public void Qhi(byte[] bArr, int i10, int i11) {
            if (this.f7142ac) {
                return;
            }
            try {
                this.Qhi.write(bArr, i10, i11);
                this.f7142ac = true;
            } catch (IOException e10) {
                throw new com.bykv.vk.openvk.component.video.Qhi.cJ.ac.fl(e10);
            }
        }

        public int cJ() {
            return this.cJ;
        }
    }

    public Sf(Qhi qhi) {
        super(qhi.Qhi, qhi.cJ);
        this.HzH = true;
        this.ABk = qhi.f7141ac;
        this.iMK = qhi.CJ;
        this.pA = fl.ac();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void CJ(com.bykv.vk.openvk.component.video.Qhi.cJ.Sf.cJ r12, com.bykv.vk.openvk.component.video.Qhi.cJ.ABk.Qhi r13) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.Qhi.cJ.Sf.CJ(com.bykv.vk.openvk.component.video.Qhi.cJ.Sf$cJ, com.bykv.vk.openvk.component.video.Qhi.cJ.ABk$Qhi):void");
    }

    private cJ Sf() {
        com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.Qhi qhi;
        try {
            this.f7132hm = WAv.Qhi(this.ABk.getInputStream());
            OutputStream outputStream = this.ABk.getOutputStream();
            if (this.f7132hm.f7151ac.Qhi == 1) {
                qhi = Tgh.Qhi;
            } else {
                qhi = Tgh.cJ;
            }
            if (qhi == null) {
                boolean z10 = Tgh.f7143ac;
                return null;
            }
            this.Qhi = qhi;
            this.ROR = this.f7132hm.f7151ac.cJ;
            this.Sf = this.f7132hm.f7151ac.f7152ac;
            this.WAv = new ABk(this.f7132hm.f7151ac.ROR);
            this.Tgh = this.f7132hm.cJ;
            if (Tgh.f7143ac) {
                this.f7132hm.toString();
            }
            return new cJ(outputStream, this.f7132hm.f7151ac.CJ);
        } catch (WAv.fl e10) {
            com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(this.ABk);
            if (Tgh.f7143ac) {
                Log.getStackTraceString(e10);
            }
            if (this.Qhi != null) {
                ROR();
            }
            return null;
        } catch (IOException e11) {
            com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(this.ABk);
            if (Tgh.f7143ac) {
                Log.getStackTraceString(e11);
            }
            if (this.Qhi != null) {
                ROR();
            }
            return null;
        }
    }

    private void ac(cJ cJVar, ABk.Qhi qhi) {
        if (this.HzH) {
            File ac2 = this.Qhi.ac(this.Sf);
            long length = ac2.length();
            com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.Qhi Qhi2 = this.cJ.Qhi(this.Sf, this.f7132hm.f7151ac.Qhi);
            cJVar.cJ();
            if (length > cJVar.cJ()) {
                boolean z10 = Tgh.f7143ac;
                Qhi(Qhi2, ac2, cJVar, qhi);
                return;
            }
        } else {
            cJVar.cJ();
        }
        CJ(cJVar, qhi);
    }

    private void cJ(cJ cJVar, ABk.Qhi qhi) {
        byte[] Qhi2 = Qhi(this.cJ.Qhi(this.Sf, this.f7132hm.f7151ac.Qhi), cJVar, qhi);
        if (Qhi2 == null) {
            return;
        }
        cJVar.Qhi(Qhi2, 0, Qhi2.length);
    }

    private void hm() {
        com.bykv.vk.openvk.component.video.Qhi.cJ.cJ cJVar = this.hpZ;
        this.hpZ = null;
        if (cJVar != null) {
            cJVar.Qhi();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.Qhi Qhi2;
        cJ Sf = Sf();
        if (Sf == null) {
            return;
        }
        ac acVar = this.iMK;
        if (acVar != null) {
            acVar.Qhi(this);
        }
        this.Qhi.Qhi(this.Sf);
        if (Tgh.Sf != 0 && ((Qhi2 = this.cJ.Qhi(this.Sf, this.f7132hm.f7151ac.Qhi)) == null || this.Qhi.ac(this.Sf).length() < Qhi2.f7158ac)) {
            this.pA.Qhi(ROR(), this.Sf);
        }
        try {
            Qhi(Sf);
        } catch (com.bykv.vk.openvk.component.video.Qhi.cJ.ac.Qhi e10) {
            if (Tgh.f7143ac) {
                Log.getStackTraceString(e10);
            }
        } catch (Throwable th2) {
            if (Tgh.f7143ac) {
                Log.getStackTraceString(th2);
            }
        }
        this.Qhi.cJ(this.Sf);
        this.pA.Qhi(ROR(), null);
        Qhi();
        com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(this.ABk);
        ac acVar2 = this.iMK;
        if (acVar2 != null) {
            acVar2.cJ(this);
        }
    }

    /* compiled from: ProxyTask.java */
    /* loaded from: classes.dex */
    public static final class Qhi {
        ac CJ;
        com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.Qhi Qhi;

        /* renamed from: ac  reason: collision with root package name */
        Socket f7141ac;
        com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac cJ;

        public Qhi Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac acVar) {
            if (acVar != null) {
                this.cJ = acVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        public Qhi Qhi(Socket socket) {
            if (socket != null) {
                this.f7141ac = socket;
                return this;
            }
            throw new IllegalArgumentException("socket == null");
        }

        public Qhi Qhi(ac acVar) {
            this.CJ = acVar;
            return this;
        }

        public Sf Qhi() {
            if (this.cJ != null && this.f7141ac != null) {
                return new Sf(this);
            }
            throw new IllegalArgumentException();
        }
    }

    private boolean Qhi(cJ cJVar) {
        while (this.WAv.Qhi()) {
            fl();
            ABk.Qhi cJ2 = this.WAv.cJ();
            try {
                Qhi(cJVar, cJ2);
                return true;
            } catch (com.bykv.vk.openvk.component.video.Qhi.cJ.ac.ac unused) {
                cJ2.Qhi();
                ROR();
            } catch (com.bykv.vk.openvk.component.video.Qhi.cJ.ac.cJ e10) {
                if (Tgh.f7143ac) {
                    Log.getStackTraceString(e10);
                }
                return false;
            } catch (com.bykv.vk.openvk.component.video.Qhi.cJ.ac.fl e11) {
                if (Tgh.f7143ac) {
                    Log.getStackTraceString(e11);
                }
                return true;
            } catch (hm.Qhi e12) {
                if (Tgh.f7143ac) {
                    Log.getStackTraceString(e12);
                }
                this.HzH = false;
                ROR();
            } catch (IOException e13) {
                if (e13 instanceof SocketTimeoutException) {
                    cJ2.cJ();
                }
                if (cJ()) {
                    if (Tgh.f7143ac && !"Canceled".equalsIgnoreCase(e13.getMessage())) {
                        Log.getStackTraceString(e13);
                    }
                } else {
                    ROR();
                }
            } catch (Exception e14) {
                if (Tgh.f7143ac) {
                    Log.getStackTraceString(e14);
                }
            }
        }
        return false;
    }

    private void Qhi(cJ cJVar, ABk.Qhi qhi) {
        if ("HEAD".equalsIgnoreCase(this.f7132hm.Qhi.Qhi)) {
            cJ(cJVar, qhi);
        } else {
            ac(cJVar, qhi);
        }
    }

    private byte[] Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.Qhi qhi, cJ cJVar, ABk.Qhi qhi2) {
        if (qhi != null) {
            boolean z10 = Tgh.f7143ac;
            return com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(qhi, cJVar.cJ()).getBytes(com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi);
        }
        com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi Qhi2 = Qhi(qhi2, 0, -1, "HEAD");
        if (Qhi2 == null) {
            return null;
        }
        try {
            String Qhi3 = com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(Qhi2, false, false);
            if (Qhi3 == null) {
                com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.Qhi Qhi4 = com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(Qhi2, this.cJ, this.Sf, this.f7132hm.f7151ac.Qhi);
                boolean z11 = Tgh.f7143ac;
                return com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(Qhi4, cJVar.cJ()).getBytes(com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi);
            }
            throw new com.bykv.vk.openvk.component.video.Qhi.cJ.ac.ac(Qhi3 + ", rawKey: " + this.ROR + ", url: " + qhi2);
        } finally {
            com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(Qhi2.CJ());
        }
    }

    private void Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.Qhi qhi, File file, cJ cJVar, ABk.Qhi qhi2) {
        final com.bytedance.sdk.component.Sf.Sf sf2;
        hm hmVar;
        com.bykv.vk.openvk.component.video.Qhi.cJ.cJ cJVar2;
        if (!cJVar.Qhi()) {
            byte[] Qhi2 = Qhi(qhi, cJVar, qhi2);
            fl();
            if (Qhi2 == null) {
                return;
            }
            cJVar.Qhi(Qhi2, 0, Qhi2.length);
        }
        hm hmVar2 = null;
        if (qhi == null && (qhi = this.cJ.Qhi(this.Sf, this.f7132hm.f7151ac.Qhi)) == null) {
            boolean z10 = Tgh.f7143ac;
            Qhi(null, cJVar, qhi2);
            qhi = this.cJ.Qhi(this.Sf, this.f7132hm.f7151ac.Qhi);
            if (qhi == null) {
                throw new com.bykv.vk.openvk.component.video.Qhi.cJ.ac.ac("failed to get header, rawKey: " + this.ROR + ", url: " + qhi2);
            }
        }
        if (file.length() >= qhi.f7158ac || !((cJVar2 = this.hpZ) == null || cJVar2.cJ() || cJVar2.CJ())) {
            sf2 = null;
        } else {
            com.bykv.vk.openvk.component.video.Qhi.cJ.cJ Qhi3 = new cJ.Qhi().Qhi(this.Qhi).Qhi(this.cJ).Qhi(this.ROR).cJ(this.Sf).Qhi(new ABk(qhi2.Qhi)).Qhi(this.Tgh).Qhi(this.f7132hm).Qhi(new cJ.InterfaceC0060cJ() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.Sf.1
                @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.InterfaceC0060cJ
                public void Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.cJ cJVar3) {
                    Sf.this.f7130ac.addAndGet(cJVar3.f7130ac.get());
                    Sf.this.CJ.addAndGet(cJVar3.CJ.get());
                    synchronized (cJVar3.ABk) {
                        cJVar3.ABk.notifyAll();
                    }
                    if (cJVar3.CJ()) {
                        Sf.this.pA.Qhi(Sf.this.ROR(), null);
                    }
                }
            }).Qhi();
            this.hpZ = Qhi3;
            sf2 = new com.bytedance.sdk.component.Sf.Sf(Qhi3, null, 10, 1);
            com.bytedance.sdk.component.Sf.ROR.cJ(new com.bytedance.sdk.component.Sf.hm("processCacheNetWorkConcurrent") { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.Sf.2
                @Override // java.lang.Runnable
                public void run() {
                    sf2.run();
                }
            });
            boolean z11 = Tgh.f7143ac;
        }
        byte[] bArr = new byte[8192];
        try {
            hmVar = new hm(file, "r");
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            hmVar.Qhi(cJVar.cJ());
            int min = this.f7132hm.f7151ac.f7153fl > 0 ? Math.min(qhi.f7158ac, this.f7132hm.f7151ac.f7153fl) : qhi.f7158ac;
            while (cJVar.cJ() < min) {
                fl();
                int Qhi4 = hmVar.Qhi(bArr);
                if (Qhi4 <= 0) {
                    com.bykv.vk.openvk.component.video.Qhi.cJ.cJ cJVar3 = this.hpZ;
                    if (cJVar3 != null) {
                        com.bykv.vk.openvk.component.video.Qhi.cJ.ac.cJ hm2 = cJVar3.hm();
                        if (hm2 == null) {
                            hm.Qhi Sf = cJVar3.Sf();
                            if (Sf != null) {
                                throw Sf;
                            }
                        } else {
                            throw hm2;
                        }
                    }
                    if (cJVar3 != null && !cJVar3.cJ() && !cJVar3.CJ()) {
                        fl();
                        synchronized (cJVar3.ABk) {
                            try {
                                cJVar3.ABk.wait(1000L);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                    boolean z12 = Tgh.f7143ac;
                    throw new com.bykv.vk.openvk.component.video.Qhi.cJ.ac.ac("illegal state download task has finished, rawKey: " + this.ROR + ", url: " + qhi2);
                }
                cJVar.cJ(bArr, 0, Qhi4);
                fl();
            }
            if (Tgh.f7143ac) {
                cJVar.cJ();
            }
            ac();
            hmVar.Qhi();
            if (sf2 != null) {
                try {
                    sf2.get();
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            hmVar2 = hmVar;
            if (hmVar2 != null) {
                hmVar2.Qhi();
            }
            if (sf2 != null) {
                try {
                    sf2.get();
                } catch (Throwable unused3) {
                }
            }
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi
    public void Qhi() {
        super.Qhi();
        hm();
    }
}
