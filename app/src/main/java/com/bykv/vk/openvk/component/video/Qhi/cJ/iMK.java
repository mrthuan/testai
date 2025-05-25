package com.bykv.vk.openvk.component.video.Qhi.CJ;

import com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ;

/* compiled from: AbstractMediaPlayer.java */
/* loaded from: classes.dex */
public abstract class iMK implements hpZ {
    private hpZ.Qhi CJ;
    protected boolean Qhi = false;
    private hpZ.ac ROR;
    private hpZ.fl Sf;
    private hpZ.Sf Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private hpZ.cJ f7110ac;
    private hpZ.Tgh cJ;

    /* renamed from: fl  reason: collision with root package name */
    private hpZ.ROR f7111fl;

    public final void CJ() {
        try {
            hpZ.ROR ror = this.f7111fl;
            if (ror != null) {
                ror.ac(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public final void Qhi(hpZ.Tgh tgh) {
        this.cJ = tgh;
    }

    public final void ac() {
        try {
            hpZ.cJ cJVar = this.f7110ac;
            if (cJVar != null) {
                cJVar.Qhi(this);
            }
        } catch (Throwable unused) {
        }
    }

    public final void cJ() {
        try {
            hpZ.Tgh tgh = this.cJ;
            if (tgh != null) {
                tgh.cJ(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public final void Qhi(hpZ.cJ cJVar) {
        this.f7110ac = cJVar;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public final void Qhi(hpZ.Qhi qhi) {
        this.CJ = qhi;
    }

    public final boolean cJ(int i10, int i11) {
        try {
            hpZ.fl flVar = this.Sf;
            if (flVar != null) {
                if (flVar.cJ(this, i10, i11)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public final void Qhi(hpZ.ROR ror) {
        this.f7111fl = ror;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public final void Qhi(hpZ.ac acVar) {
        this.ROR = acVar;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public final void Qhi(hpZ.fl flVar) {
        this.Sf = flVar;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public final void Qhi(hpZ.Sf sf2) {
        this.Tgh = sf2;
    }

    public void Qhi() {
        this.cJ = null;
        this.CJ = null;
        this.f7110ac = null;
        this.f7111fl = null;
        this.Tgh = null;
        this.ROR = null;
        this.Sf = null;
    }

    public final void Qhi(int i10) {
        try {
            hpZ.Qhi qhi = this.CJ;
            if (qhi != null) {
                qhi.Qhi(this, i10);
            }
        } catch (Throwable unused) {
        }
    }

    public final void Qhi(int i10, int i11, int i12, int i13) {
        try {
            hpZ.Sf sf2 = this.Tgh;
            if (sf2 != null) {
                sf2.Qhi(this, i10, i11, i12, i13);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean Qhi(int i10, int i11) {
        try {
            hpZ.ac acVar = this.ROR;
            if (acVar != null) {
                if (acVar.Qhi(this, i10, i11)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.hpZ
    public void Qhi(boolean z10) {
        this.Qhi = z10;
    }
}
