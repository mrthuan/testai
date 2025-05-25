package com.bykv.vk.openvk.component.video.Qhi.Qhi.cJ;

import android.content.Context;
import com.bykv.vk.openvk.component.video.api.fl.Qhi;
import com.bytedance.sdk.component.cJ.Qhi.iMK;
import com.bytedance.sdk.component.cJ.Qhi.zc;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: ReallyVideoPreload.java */
/* loaded from: classes.dex */
public class cJ {
    private File CJ;
    private Context Qhi;
    private com.bykv.vk.openvk.component.video.api.ac.ac cJ;

    /* renamed from: fl  reason: collision with root package name */
    private File f7125fl;

    /* renamed from: ac  reason: collision with root package name */
    private volatile boolean f7124ac = false;
    private final List<Qhi.InterfaceC0063Qhi> Tgh = new ArrayList();
    private volatile boolean ROR = false;

    public cJ(Context context, com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
        this.CJ = null;
        this.f7125fl = null;
        this.Qhi = context;
        this.cJ = acVar;
        this.CJ = com.bykv.vk.openvk.component.video.Qhi.fl.cJ.cJ(acVar.cJ(), acVar.iMK());
        this.f7125fl = com.bykv.vk.openvk.component.video.Qhi.fl.cJ.ac(acVar.cJ(), acVar.iMK());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CJ() {
        try {
            this.f7125fl.delete();
            this.CJ.delete();
        } catch (Throwable unused) {
        }
    }

    private void ac() {
        zc.Qhi qhi;
        if (com.bykv.vk.openvk.component.video.api.ac.CJ() != null) {
            qhi = com.bykv.vk.openvk.component.video.api.ac.CJ().cJ();
        } else {
            qhi = new zc.Qhi("v_preload");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qhi.Qhi(this.cJ.hpZ(), timeUnit).cJ(this.cJ.HzH(), timeUnit).ac(this.cJ.kYc(), timeUnit);
        zc Qhi = qhi.Qhi();
        iMK.Qhi qhi2 = new iMK.Qhi();
        final long length = this.CJ.length();
        int ac2 = this.cJ.ac();
        boolean WAv = this.cJ.WAv();
        int Qhi2 = this.cJ.Qhi();
        if (Qhi2 > 0) {
            if (Qhi2 >= this.cJ.hm()) {
                WAv = true;
            } else {
                ac2 = Qhi2;
            }
        }
        qhi2.Qhi("videoPreload").Qhi(6);
        if (WAv) {
            qhi2.Qhi("RANGE", "bytes=" + length + "-").cJ(this.cJ.ABk()).Qhi().cJ();
        } else {
            qhi2.Qhi("RANGE", "bytes=" + length + "-" + ac2).cJ(this.cJ.ABk()).Qhi().cJ();
        }
        Qhi.Qhi(qhi2.cJ()).Qhi(new com.bytedance.sdk.component.cJ.Qhi.ac() { // from class: com.bykv.vk.openvk.component.video.Qhi.Qhi.cJ.cJ.1
            @Override // com.bytedance.sdk.component.cJ.Qhi.ac
            public void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ cJVar, IOException iOException) {
                cJ cJVar2 = cJ.this;
                cJVar2.Qhi(cJVar2.cJ, 601, iOException.getMessage());
                ac.Qhi(cJ.this.cJ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:70:0x015d A[Catch: all -> 0x0174, TryCatch #1 {all -> 0x0174, blocks: (B:68:0x0150, B:70:0x015d, B:71:0x0161), top: B:77:0x0150 }] */
            /* JADX WARN: Type inference failed for: r13v5 */
            @Override // com.bytedance.sdk.component.cJ.Qhi.ac
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ r18, com.bytedance.sdk.component.cJ.Qhi.hpZ r19) {
                /*
                    Method dump skipped, instructions count: 421
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.Qhi.Qhi.cJ.cJ.AnonymousClass1.Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ, com.bytedance.sdk.component.cJ.Qhi.hpZ):void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fl() {
        try {
            if (this.CJ.renameTo(this.f7125fl)) {
                return;
            }
            throw new IOException("Error renaming file " + this.CJ + " to " + this.f7125fl + " for completion!");
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private boolean cJ() {
        if (this.f7125fl.exists()) {
            return true;
        }
        if (!this.cJ.WAv()) {
            if (this.CJ.length() >= this.cJ.ac()) {
                return true;
            }
            if (this.cJ.Qhi() > 0 && this.CJ.length() >= this.cJ.Qhi()) {
                return true;
            }
        }
        return false;
    }

    public void Qhi(Qhi.InterfaceC0063Qhi interfaceC0063Qhi) {
        if (this.ROR) {
            synchronized (Qhi.InterfaceC0063Qhi.class) {
                this.Tgh.add(interfaceC0063Qhi);
            }
            return;
        }
        this.Tgh.add(interfaceC0063Qhi);
        if (cJ()) {
            this.cJ.ROR(1);
            Qhi(this.cJ, 200);
            ac.Qhi(this.cJ);
            return;
        }
        this.ROR = true;
        this.cJ.ROR(0);
        ac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(com.bykv.vk.openvk.component.video.api.ac.ac acVar, int i10) {
        synchronized (Qhi.InterfaceC0063Qhi.class) {
            for (Qhi.InterfaceC0063Qhi interfaceC0063Qhi : this.Tgh) {
                if (interfaceC0063Qhi != null) {
                    interfaceC0063Qhi.cJ(acVar, i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public com.bykv.vk.openvk.component.video.api.ac.ac Qhi() {
        return this.cJ;
    }

    public void Qhi(boolean z10) {
        this.f7124ac = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar, int i10) {
        synchronized (Qhi.InterfaceC0063Qhi.class) {
            for (Qhi.InterfaceC0063Qhi interfaceC0063Qhi : this.Tgh) {
                if (interfaceC0063Qhi != null) {
                    interfaceC0063Qhi.Qhi(acVar, i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar, int i10, String str) {
        synchronized (Qhi.InterfaceC0063Qhi.class) {
            for (Qhi.InterfaceC0063Qhi interfaceC0063Qhi : this.Tgh) {
                if (interfaceC0063Qhi != null) {
                    interfaceC0063Qhi.Qhi(acVar, i10, str);
                }
            }
        }
    }
}
