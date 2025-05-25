package com.bytedance.sdk.component.ROR.ac;

import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.Map;

/* compiled from: TNCConfig.java */
/* loaded from: classes.dex */
public class fl {
    public boolean Qhi = false;
    public boolean cJ = true;

    /* renamed from: ac  reason: collision with root package name */
    public Map<String, Integer> f8013ac = null;
    public Map<String, String> CJ = null;

    /* renamed from: fl  reason: collision with root package name */
    public int f8014fl = 10;
    public int Tgh = 1;
    public int ROR = 1;
    public int Sf = 10;

    /* renamed from: hm  reason: collision with root package name */
    public int f8015hm = 1;
    public int WAv = 1;
    public int Gm = OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK;

    /* renamed from: zc  reason: collision with root package name */
    public int f8016zc = 120;
    public String ABk = null;
    public int iMK = 0;
    public long pA = 0;

    public String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder(" localEnable: ");
        sb2.append(this.Qhi);
        sb2.append(" probeEnable: ");
        sb2.append(this.cJ);
        sb2.append(" hostFilter: ");
        Map<String, Integer> map = this.f8013ac;
        int i11 = 0;
        if (map != null) {
            i10 = map.size();
        } else {
            i10 = 0;
        }
        sb2.append(i10);
        sb2.append(" hostMap: ");
        Map<String, String> map2 = this.CJ;
        if (map2 != null) {
            i11 = map2.size();
        }
        sb2.append(i11);
        sb2.append(" reqTo: ");
        sb2.append(this.f8014fl);
        sb2.append("#");
        sb2.append(this.Tgh);
        sb2.append("#");
        sb2.append(this.ROR);
        sb2.append(" reqErr: ");
        sb2.append(this.Sf);
        sb2.append("#");
        sb2.append(this.f8015hm);
        sb2.append("#");
        sb2.append(this.WAv);
        sb2.append(" updateInterval: ");
        sb2.append(this.Gm);
        sb2.append(" updateRandom: ");
        sb2.append(this.f8016zc);
        sb2.append(" httpBlack: ");
        sb2.append(this.ABk);
        return sb2.toString();
    }
}
