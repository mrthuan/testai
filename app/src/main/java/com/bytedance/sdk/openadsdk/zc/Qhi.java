package com.bytedance.sdk.openadsdk.zc;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.CJ.tP;
import com.inmobi.media.C1646h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: FeatureCollectionModel.java */
/* loaded from: classes.dex */
public class Qhi implements Comparable<Qhi> {
    private int ROR;

    /* renamed from: ac  reason: collision with root package name */
    private int f9401ac;
    private final String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f9402fl;
    private long iMK;
    private final ArrayList<Long> Qhi = new ArrayList<>();
    private final ArrayList<Long> CJ = new ArrayList<>();
    private final ArrayList<Long> Tgh = new ArrayList<>();
    private final ArrayList<Long> Sf = new ArrayList<>();

    /* renamed from: hm  reason: collision with root package name */
    private final HashMap<String, cJ> f9403hm = new HashMap<>();
    private int WAv = 0;
    private int Gm = 0;

    /* renamed from: zc  reason: collision with root package name */
    private final HashMap<String, cJ> f9404zc = new HashMap<>();
    private int ABk = 0;

    public Qhi(String str) {
        this.cJ = str;
    }

    private void cJ(JSONObject jSONObject, JSONObject jSONObject2) {
        int i10;
        int i11;
        int i12;
        long j10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] zc2 = tP.Qhi().zc();
        long j11 = 60000;
        if (zc2 != null) {
            int i13 = 0;
            while (i13 < zc2.length) {
                int i14 = zc2[i13];
                long j12 = elapsedRealtime - (i14 * j11);
                long j13 = 0;
                for (String str : this.f9404zc.keySet()) {
                    int[] iArr = zc2;
                    cJ cJVar = this.f9404zc.get(str);
                    if (cJVar != null) {
                        j13 = cJVar.Qhi(j12, elapsedRealtime) + j13;
                    }
                    zc2 = iArr;
                }
                int[] iArr2 = zc2;
                if (j13 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i14)), j13);
                    long optInt = jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i14))) + j13;
                    if (optInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i14)), optInt);
                    }
                }
                i13++;
                zc2 = iArr2;
                j11 = 60000;
            }
        }
        int[] ABk = tP.Qhi().ABk();
        if (ABk != null) {
            int i15 = 0;
            while (i15 < ABk.length) {
                int i16 = ABk[i15];
                long j14 = elapsedRealtime - (i16 * 60000);
                Iterator<String> it = this.f9403hm.keySet().iterator();
                long j15 = 0;
                int i17 = 0;
                while (it.hasNext()) {
                    int[] iArr3 = ABk;
                    Iterator<String> it2 = it;
                    cJ cJVar2 = this.f9403hm.get(it.next());
                    if (cJVar2 != null) {
                        long Qhi = cJVar2.Qhi(j14, elapsedRealtime);
                        j15 += Qhi;
                        if (Qhi > 20000) {
                            i17++;
                        }
                    }
                    it = it2;
                    ABk = iArr3;
                }
                int[] iArr4 = ABk;
                if (j15 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i16)), j15);
                    j10 = elapsedRealtime;
                    long optInt2 = jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i16))) + j15;
                    if (optInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i16)), optInt2);
                    }
                } else {
                    j10 = elapsedRealtime;
                }
                if (i17 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i16)), i17);
                    int optInt3 = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i16))) + i17;
                    if (optInt3 != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i16)), optInt3);
                    }
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    this.f9404zc.remove((String) it3.next());
                }
                Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    this.f9403hm.remove((String) it4.next());
                }
                i15++;
                ABk = iArr4;
                elapsedRealtime = j10;
            }
        }
        if (tP.Qhi().pA() && (i12 = this.WAv) != 0) {
            jSONObject.put("v_stay_t_s", i12);
            int optInt4 = jSONObject2.optInt("v_stay_t_s") + this.WAv;
            if (optInt4 != 0) {
                jSONObject2.put("v_stay_t_s", optInt4);
            }
        }
        if (tP.Qhi().iMK() && (i11 = this.ABk) != 0) {
            jSONObject.put("lp_stay_t_s", i11);
            int optInt5 = jSONObject2.optInt("lp_stay_t_s") + this.ABk;
            if (optInt5 != 0) {
                jSONObject2.put("lp_stay_t_s", optInt5);
            }
        }
        if (!tP.Qhi().HzH() || (i10 = this.Gm) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i10);
        int optInt6 = jSONObject2.optInt("v_30p_play_c_s") + this.Gm;
        if (optInt6 != 0) {
            jSONObject2.put("v_30p_play_c_s", optInt6);
        }
    }

    public void Qhi(String str, String str2) {
        cJ cJVar;
        cJ cJVar2;
        cJ cJVar3;
        cJ cJVar4;
        cJ cJVar5;
        cJ cJVar6;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1908685858:
                if (str.equals("landingContinue")) {
                    c = 0;
                    break;
                }
                break;
            case -1769688545:
                if (str.equals("landingPause")) {
                    c = 1;
                    break;
                }
                break;
            case -1766371189:
                if (str.equals("landingStart")) {
                    c = 2;
                    break;
                }
                break;
            case -1643912491:
                if (str.equals("feed_over")) {
                    c = 3;
                    break;
                }
                break;
            case 3529469:
                if (str.equals("show")) {
                    c = 4;
                    break;
                }
                break;
            case 94750088:
                if (str.equals(C1646h.CLICK_BEACON)) {
                    c = 5;
                    break;
                }
                break;
            case 533457448:
                if (str.equals("feed_continue")) {
                    c = 6;
                    break;
                }
                break;
            case 566194974:
                if (str.equals("feed_break")) {
                    c = 7;
                    break;
                }
                break;
            case 578633749:
                if (str.equals("feed_pause")) {
                    c = '\b';
                    break;
                }
                break;
            case 695109002:
                if (str.equals("landingFinish")) {
                    c = '\t';
                    break;
                }
                break;
            case 702698279:
                if (str.equals("videoPercent30")) {
                    c = '\n';
                    break;
                }
                break;
            case 1671642405:
                if (str.equals("dislike")) {
                    c = 11;
                    break;
                }
                break;
            case 1925938071:
                if (str.equals("play_start")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (TextUtils.isEmpty(str2) || (cJVar = this.f9404zc.get(str2)) == null) {
                    return;
                }
                cJVar.CJ(SystemClock.elapsedRealtime());
                return;
            case 1:
                if (TextUtils.isEmpty(str2) || (cJVar2 = this.f9404zc.get(str2)) == null) {
                    return;
                }
                cJVar2.ac(SystemClock.elapsedRealtime());
                return;
            case 2:
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                cJ cJVar7 = this.f9404zc.get(str2);
                if (cJVar7 == null) {
                    cJVar7 = new cJ();
                    this.f9404zc.put(str2, cJVar7);
                }
                cJVar7.Qhi(SystemClock.elapsedRealtime());
                return;
            case 3:
            case 7:
                if (TextUtils.isEmpty(str2) || (cJVar3 = this.f9403hm.get(str2)) == null) {
                    return;
                }
                cJVar3.cJ(SystemClock.elapsedRealtime());
                if (tP.Qhi().pA()) {
                    this.WAv = (int) (cJVar3.Qhi(this.iMK, SystemClock.elapsedRealtime()) + this.WAv);
                    return;
                }
                return;
            case 4:
                this.Qhi.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (tP.Qhi().Tgh()) {
                    this.f9401ac++;
                    return;
                }
                return;
            case 5:
                this.CJ.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (tP.Qhi().ROR()) {
                    this.f9402fl++;
                    return;
                }
                return;
            case 6:
                if (TextUtils.isEmpty(str2) || (cJVar4 = this.f9403hm.get(str2)) == null) {
                    return;
                }
                cJVar4.CJ(SystemClock.elapsedRealtime());
                return;
            case '\b':
                if (TextUtils.isEmpty(str2) || (cJVar5 = this.f9403hm.get(str2)) == null) {
                    return;
                }
                cJVar5.ac(SystemClock.elapsedRealtime());
                return;
            case '\t':
                if (TextUtils.isEmpty(str2) || (cJVar6 = this.f9404zc.get(str2)) == null) {
                    return;
                }
                cJVar6.cJ(SystemClock.elapsedRealtime());
                if (tP.Qhi().iMK()) {
                    this.ABk = (int) (cJVar6.Qhi(this.iMK, SystemClock.elapsedRealtime()) + this.ABk);
                    return;
                }
                return;
            case '\n':
                if (tP.Qhi().HzH()) {
                    this.Gm++;
                    return;
                }
                return;
            case 11:
                this.Sf.add(Long.valueOf(SystemClock.elapsedRealtime()));
                return;
            case '\f':
                this.Tgh.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (tP.Qhi().Sf()) {
                    this.ROR++;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                cJ cJVar8 = this.f9403hm.get(str2);
                if (cJVar8 == null) {
                    cJVar8 = new cJ();
                    this.f9403hm.put(str2, cJVar8);
                }
                cJVar8.Qhi(SystemClock.elapsedRealtime());
                return;
            default:
                return;
        }
    }

    public JSONObject Qhi(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            Qhi(jSONObject2, jSONObject);
            cJ(jSONObject2, jSONObject);
        } catch (Throwable th2) {
            ABk.cJ(th2.getMessage());
        }
        return jSONObject2;
    }

    public String cJ() {
        return this.cJ;
    }

    private void Qhi(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j10, JSONObject jSONObject2) {
        int size = arrayList.size() - 1;
        int i10 = 0;
        for (int i11 : iArr) {
            long j11 = j10 - (i11 * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j11) {
                i10++;
                size--;
            }
            if (i10 != 0) {
                jSONObject.put(str + i11, i10);
                int optInt = jSONObject2.optInt(str + i11) + i10;
                if (optInt != 0) {
                    jSONObject2.put(str + i11, optInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void Qhi(JSONObject jSONObject, JSONObject jSONObject2) {
        int i10;
        int i11;
        int i12;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Qhi("show_c_", jSONObject, this.Qhi, tP.Qhi().hm(), elapsedRealtime, jSONObject2);
        Qhi("click_c_", jSONObject, this.CJ, tP.Qhi().WAv(), elapsedRealtime, jSONObject2);
        Qhi("v_play_c_", jSONObject, this.Tgh, tP.Qhi().Gm(), elapsedRealtime, jSONObject2);
        Qhi("dislike_c_", jSONObject, this.Sf, tP.Qhi().hpZ(), elapsedRealtime, jSONObject2);
        if (tP.Qhi().Tgh() && (i12 = this.f9401ac) != 0) {
            jSONObject.put("show_c_s", i12);
            int optInt = jSONObject2.optInt("show_c_s") + this.f9401ac;
            if (optInt != 0) {
                jSONObject2.put("show_c_s", optInt);
            }
        }
        if (tP.Qhi().ROR() && (i11 = this.f9402fl) != 0) {
            jSONObject.put("click_c_s", i11);
            int optInt2 = jSONObject2.optInt("click_c_s") + this.f9402fl;
            if (optInt2 != 0) {
                jSONObject2.put("click_c_s", optInt2);
            }
        }
        if (!tP.Qhi().Sf() || (i10 = this.ROR) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i10);
        int optInt3 = jSONObject2.optInt("v_play_c_s") + this.ROR;
        if (optInt3 != 0) {
            jSONObject2.put("v_play_c_s", optInt3);
        }
    }

    public void Qhi() {
        this.iMK = SystemClock.elapsedRealtime();
        this.Gm = 0;
        this.f9402fl = 0;
        this.f9401ac = 0;
        this.ABk = 0;
        this.WAv = 0;
        this.ROR = 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: Qhi */
    public int compareTo(Qhi qhi) {
        return qhi.f9401ac - this.f9401ac;
    }
}
