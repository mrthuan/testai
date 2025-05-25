package com.bykv.vk.openvk.component.video.api.ac;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import lib.zj.office.fc.hpsf.Constants;
import org.json.JSONObject;

/* compiled from: VideoUrlModel.java */
/* loaded from: classes.dex */
public class ac implements Serializable {
    private int ABk;
    public int CJ;
    private String Gm;
    private boolean HzH;
    public String Qhi;
    private String ROR;
    private cJ Tgh;
    public int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private cJ f7177fl;
    private boolean hpZ;
    private String iMK;
    private int kYc;
    private long pA;
    private int tP;

    /* renamed from: zc  reason: collision with root package name */
    private int f7179zc;
    private int Sf = 204800;

    /* renamed from: hm  reason: collision with root package name */
    private int f7178hm = 0;
    private int WAv = 0;

    /* renamed from: ac  reason: collision with root package name */
    public final HashMap<String, Object> f7176ac = new HashMap<>();
    private int MQ = Constants.CP_MAC_ROMAN;
    private int qMt = Constants.CP_MAC_ROMAN;
    private int EBS = Constants.CP_MAC_ROMAN;
    private int bxS = 0;
    private JSONObject Dww = new JSONObject();

    public ac(String str, cJ cJVar, cJ cJVar2, int i10, int i11) {
        this.kYc = 0;
        this.tP = 0;
        this.ROR = str;
        this.f7177fl = cJVar;
        this.Tgh = cJVar2;
        this.kYc = i10;
        this.tP = i11;
    }

    public String ABk() {
        if (Gm()) {
            return this.Tgh.Gm();
        }
        cJ cJVar = this.f7177fl;
        if (cJVar != null) {
            return cJVar.Gm();
        }
        return null;
    }

    public boolean CJ() {
        return this.HzH;
    }

    public boolean Gm() {
        cJ cJVar;
        if (this.tP == 1 && (cJVar = this.Tgh) != null && !TextUtils.isEmpty(cJVar.Gm())) {
            if (com.bykv.vk.openvk.component.video.api.ac.Tgh() == 2) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
            } else if (this.kYc == 1) {
                return true;
            }
        }
        return false;
    }

    public int HzH() {
        return this.qMt;
    }

    public cJ MQ() {
        return this.f7177fl;
    }

    public int Qhi() {
        return this.Dww.optInt("pitaya_cache_size", 0);
    }

    public long ROR() {
        return this.pA;
    }

    public boolean Sf() {
        return this.hpZ;
    }

    public int Tgh() {
        return this.ABk;
    }

    public boolean WAv() {
        if (Gm()) {
            return this.Tgh.qMt();
        }
        cJ cJVar = this.f7177fl;
        if (cJVar != null) {
            return cJVar.qMt();
        }
        return true;
    }

    public int ac() {
        if (Gm()) {
            return this.Tgh.pA();
        }
        cJ cJVar = this.f7177fl;
        if (cJVar != null) {
            return cJVar.pA();
        }
        return 0;
    }

    public String cJ() {
        return this.ROR;
    }

    public int fl() {
        return this.f7179zc;
    }

    public long hm() {
        if (Gm()) {
            return this.Tgh.fl();
        }
        cJ cJVar = this.f7177fl;
        if (cJVar != null) {
            return cJVar.fl();
        }
        return 0L;
    }

    public int hpZ() {
        return this.MQ;
    }

    public String iMK() {
        if (Gm()) {
            return this.Tgh.iMK();
        }
        cJ cJVar = this.f7177fl;
        if (cJVar != null) {
            return cJVar.iMK();
        }
        return null;
    }

    public int kYc() {
        return this.EBS;
    }

    public int pA() {
        return this.kYc;
    }

    public cJ qMt() {
        return this.Tgh;
    }

    public int tP() {
        return this.bxS;
    }

    public float zc() {
        if (Gm()) {
            return this.Tgh.Sf();
        }
        cJ cJVar = this.f7177fl;
        if (cJVar != null) {
            return cJVar.Sf();
        }
        return -1.0f;
    }

    public void CJ(String str) {
        this.Qhi = str;
    }

    public void Qhi(String str) {
        this.ROR = str;
    }

    public void ROR(int i10) {
        this.bxS = i10;
    }

    public void Tgh(int i10) {
        this.EBS = i10;
    }

    public void cJ(String str) {
        this.Gm = str;
    }

    public synchronized Object fl(String str) {
        return this.f7176ac.get(str);
    }

    public void CJ(int i10) {
        this.MQ = i10;
    }

    public void Qhi(int i10) {
        this.f7179zc = i10;
    }

    public void cJ(int i10) {
        this.ABk = i10;
    }

    public void fl(int i10) {
        this.qMt = i10;
    }

    public void Qhi(long j10) {
        this.pA = j10;
    }

    public void Qhi(boolean z10) {
        this.hpZ = z10;
    }

    public void ac(String str) {
        this.iMK = str;
    }

    public synchronized void Qhi(String str, Object obj) {
        this.f7176ac.put(str, obj);
    }

    public void ac(int i10) {
        this.cJ = i10;
    }
}
