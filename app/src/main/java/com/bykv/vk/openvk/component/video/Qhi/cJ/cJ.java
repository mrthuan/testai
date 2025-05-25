package com.bykv.vk.openvk.component.video.Qhi.cJ;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.Qhi.cJ.ABk;
import com.bykv.vk.openvk.component.video.Qhi.cJ.WAv;
import com.bykv.vk.openvk.component.video.Qhi.cJ.hm;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DownloadTask.java */
/* loaded from: classes.dex */
public class cJ extends com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi {
    final Object ABk;
    private volatile hm.Qhi HzH;
    private final InterfaceC0060cJ hpZ;
    final Object iMK;
    private volatile com.bykv.vk.openvk.component.video.Qhi.cJ.ac.cJ kYc;
    private final int pA;

    /* compiled from: DownloadTask.java */
    /* renamed from: com.bykv.vk.openvk.component.video.Qhi.cJ.cJ$cJ  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0060cJ {
        void Qhi(cJ cJVar);
    }

    public cJ(Qhi qhi) {
        super(qhi.CJ, qhi.f7156fl);
        this.pA = qhi.ROR;
        this.hpZ = qhi.f7157hm;
        this.ABk = this;
        this.ROR = qhi.Qhi;
        this.Sf = qhi.cJ;
        this.Tgh = qhi.Tgh;
        this.WAv = qhi.f7155ac;
        this.f7132hm = qhi.Sf;
        this.iMK = qhi.WAv;
    }

    private void Qhi(ABk.Qhi qhi) {
        boolean z10;
        int i10;
        String str;
        File ac2 = this.Qhi.ac(this.Sf);
        long length = ac2.length();
        int i11 = this.pA;
        if (i11 > 0 && length >= i11) {
            boolean z11 = Tgh.f7143ac;
            return;
        }
        int Tgh = Tgh();
        com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.Qhi Qhi2 = this.cJ.Qhi(this.Sf, Tgh);
        if (Qhi2 != null && length >= Qhi2.f7158ac) {
            boolean z12 = Tgh.f7143ac;
            return;
        }
        fl();
        int i12 = (int) length;
        com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi Qhi3 = Qhi(qhi, i12, this.pA, "GET");
        if (Qhi3 == null) {
            return;
        }
        boolean z13 = true;
        hm hmVar = null;
        try {
            fl();
            if (this.f7132hm == null && Tgh.f7144fl) {
                z10 = true;
            } else {
                z10 = false;
            }
            String Qhi4 = com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(Qhi3, z10, true);
            if (Qhi4 == null) {
                int Qhi5 = com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(Qhi3);
                if (Qhi2 != null && Qhi2.f7158ac != Qhi5) {
                    boolean z14 = Tgh.f7143ac;
                    throw new com.bykv.vk.openvk.component.video.Qhi.cJ.ac.cJ("Content-Length not match, old length: " + Qhi2.f7158ac + ", new length: " + Qhi5 + ", rawKey: " + this.ROR + ", currentUrl: " + qhi + ", previousInfo: " + Qhi2.f7159fl);
                }
                com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(Qhi3, this.cJ, this.Sf, Tgh);
                com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.Qhi Qhi6 = this.cJ.Qhi(this.Sf, Tgh);
                if (Qhi6 == null) {
                    i10 = 0;
                } else {
                    i10 = Qhi6.f7158ac;
                }
                InputStream CJ = Qhi3.CJ();
                if (Tgh.CJ) {
                    str = "rwd";
                } else {
                    str = "rw";
                }
                hm hmVar2 = new hm(ac2, str);
                try {
                    hmVar2.Qhi(length);
                    if (Tgh.f7143ac) {
                        "preload start from: ".concat(String.valueOf(length));
                    }
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = CJ.read(bArr);
                        if (read >= 0) {
                            fl();
                            if (read > 0) {
                                hmVar2.Qhi(bArr, 0, read);
                                i12 += read;
                                if (this.f7132hm != null) {
                                    synchronized (this.ABk) {
                                        this.ABk.notifyAll();
                                    }
                                }
                                this.f7130ac.addAndGet(read);
                                Qhi(i10, i12);
                            }
                            int i13 = this.pA;
                            if (i13 > 0 && i12 >= i13) {
                                boolean z15 = Tgh.f7143ac;
                                com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(Qhi3.CJ());
                                hmVar2.Qhi();
                                Qhi();
                                return;
                            }
                            fl();
                        } else {
                            try {
                                ac();
                                boolean z16 = Tgh.f7143ac;
                                com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(Qhi3.CJ());
                                hmVar2.Qhi();
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                hmVar = hmVar2;
                                z13 = false;
                                com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(Qhi3.CJ());
                                if (hmVar != null) {
                                    hmVar.Qhi();
                                }
                                if (z13) {
                                    Qhi();
                                    boolean z17 = Tgh.f7143ac;
                                }
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    hmVar = hmVar2;
                }
            } else {
                throw new com.bykv.vk.openvk.component.video.Qhi.cJ.ac.ac(Qhi4 + ", rawKey: " + this.ROR + ", url: " + qhi);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private boolean WAv() {
        while (this.WAv.Qhi()) {
            fl();
            ABk.Qhi cJ = this.WAv.cJ();
            try {
                Qhi(cJ);
                return true;
            } catch (com.bykv.vk.openvk.component.video.Qhi.cJ.ac.ac unused) {
                cJ.Qhi();
                ROR();
            } catch (com.bykv.vk.openvk.component.video.Qhi.cJ.ac.cJ e10) {
                this.kYc = e10;
                return false;
            } catch (hm.Qhi e11) {
                this.HzH = e11;
                ROR();
                return false;
            } catch (IOException e12) {
                if (e12 instanceof SocketTimeoutException) {
                    cJ.cJ();
                }
                if (!cJ()) {
                    ROR();
                }
            } catch (Throwable unused2) {
                return false;
            }
        }
        return false;
    }

    public hm.Qhi Sf() {
        return this.HzH;
    }

    public com.bykv.vk.openvk.component.video.Qhi.cJ.ac.cJ hm() {
        return this.kYc;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.Qhi.Qhi(this.Sf);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            WAv();
        } catch (Throwable unused) {
        }
        this.CJ.set(SystemClock.elapsedRealtime() - elapsedRealtime);
        this.Qhi.cJ(this.Sf);
        InterfaceC0060cJ interfaceC0060cJ = this.hpZ;
        if (interfaceC0060cJ != null) {
            interfaceC0060cJ.Qhi(this);
        }
    }

    /* compiled from: DownloadTask.java */
    /* loaded from: classes.dex */
    public static final class Qhi {
        com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.Qhi CJ;
        String Qhi;
        int ROR;
        WAv Sf;
        List<WAv.cJ> Tgh;
        Object WAv;

        /* renamed from: ac  reason: collision with root package name */
        ABk f7155ac;
        String cJ;

        /* renamed from: fl  reason: collision with root package name */
        com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac f7156fl;

        /* renamed from: hm  reason: collision with root package name */
        InterfaceC0060cJ f7157hm;

        public Qhi Qhi(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.Qhi = str;
                return this;
            }
            throw new IllegalArgumentException("rawKey == null");
        }

        public Qhi cJ(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.cJ = str;
                return this;
            }
            throw new IllegalArgumentException("key == null");
        }

        public Qhi Qhi(ABk aBk) {
            if (aBk != null) {
                this.f7155ac = aBk;
                return this;
            }
            throw new IllegalArgumentException("urls is empty");
        }

        public Qhi Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.Qhi qhi) {
            if (qhi != null) {
                this.CJ = qhi;
                return this;
            }
            throw new IllegalArgumentException("cache == null");
        }

        public Qhi Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac acVar) {
            if (acVar != null) {
                this.f7156fl = acVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        public Qhi Qhi(List<WAv.cJ> list) {
            this.Tgh = list;
            return this;
        }

        public Qhi Qhi(int i10) {
            this.ROR = i10;
            return this;
        }

        public Qhi Qhi(InterfaceC0060cJ interfaceC0060cJ) {
            this.f7157hm = interfaceC0060cJ;
            return this;
        }

        public Qhi Qhi(WAv wAv) {
            this.Sf = wAv;
            return this;
        }

        public Qhi Qhi(Object obj) {
            this.WAv = obj;
            return this;
        }

        public cJ Qhi() {
            if (this.CJ != null && this.f7156fl != null && !TextUtils.isEmpty(this.Qhi) && !TextUtils.isEmpty(this.cJ) && this.f7155ac != null) {
                return new cJ(this);
            }
            throw new IllegalArgumentException();
        }
    }
}
