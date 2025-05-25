package com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi;

import a6.h;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.activity.f;
import com.bytedance.sdk.component.Tgh.Qhi.hm;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: AdEventRepoImpl.java */
/* loaded from: classes.dex */
public class Qhi extends ac {
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac CJ;
    protected List<String> Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final Context f8063ac;

    public Qhi(Context context, com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar) {
        super(context);
        this.Qhi = new ArrayList();
        this.f8063ac = context;
        this.CJ = acVar;
        if (acVar == null) {
            this.CJ = com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac.ac();
        }
    }

    public static String cJ(String str) {
        return h.d("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public byte CJ() {
        return (byte) 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
        r0.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int Qhi() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            android.content.Context r2 = r10.fl()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
            java.lang.String r3 = r10.cJ()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
            java.lang.String r5 = "count(1)"
            r4[r1] = r5     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r0 = com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
            if (r0 == 0) goto L23
            r0.moveToFirst()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
            int r1 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
        L23:
            if (r0 == 0) goto L33
        L25:
            r0.close()     // Catch: java.lang.Exception -> L33
            goto L33
        L29:
            r1 = move-exception
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.lang.Exception -> L2f
        L2f:
            throw r1
        L30:
            if (r0 == 0) goto L33
            goto L25
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Qhi.Qhi():int");
    }

    public byte ac() {
        return (byte) 2;
    }

    public List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi(int i10, String str) {
        String str2;
        String[] strArr;
        Cursor Qhi;
        long Qhi2 = com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi(i10, fl());
        cJ();
        if (Qhi2 <= 0) {
            Qhi2 = 1;
        } else if (Qhi2 > 100) {
            Qhi2 = 100;
        }
        String str3 = str + " DESC limit " + Qhi2;
        ArrayList arrayList = new ArrayList();
        this.Qhi.clear();
        long HzH = hm.ROR().HzH();
        if (HzH > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - HzH)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.CJ() && CJ() == 3) {
            Qhi = com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(fl(), cJ(), new String[]{FacebookMediationAdapter.KEY_ID, "value", "encrypt", "channel"}, str2, strArr, null, null, str3);
        } else {
            Qhi = com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(fl(), cJ(), new String[]{FacebookMediationAdapter.KEY_ID, "value", "encrypt"}, str2, strArr, null, null, str3);
        }
        if (Qhi != null) {
            try {
                com.bytedance.sdk.component.Tgh.Qhi.Tgh hpZ = hm.ROR().hpZ();
                while (Qhi.moveToNext()) {
                    String string = Qhi.getString(Qhi.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                    String string2 = Qhi.getString(Qhi.getColumnIndex("value"));
                    int i11 = Qhi.getInt(Qhi.getColumnIndex("encrypt"));
                    int i12 = (com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.CJ() && CJ() == 3) ? Qhi.getInt(Qhi.getColumnIndex("channel")) : 0;
                    if (i11 == 1) {
                        string2 = hpZ.Qhi(string2);
                    }
                    if (TextUtils.isEmpty(string2)) {
                        this.Qhi.add(string);
                    } else if (arrayList.size() > 100) {
                        break;
                    } else {
                        JSONObject jSONObject = new JSONObject(string2);
                        com.bytedance.sdk.component.Tgh.Qhi.CJ.Qhi.cJ cJVar = new com.bytedance.sdk.component.Tgh.Qhi.CJ.Qhi.cJ(string, jSONObject);
                        cJVar.Qhi(CJ());
                        cJVar.cJ(ac());
                        if (com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.CJ() && CJ() == 3) {
                            cJVar.Qhi(i12);
                        }
                        com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.Qhi(jSONObject, cJVar);
                        arrayList.add(cJVar);
                    }
                }
            } finally {
                try {
                    Qhi.close();
                    if (!this.Qhi.isEmpty()) {
                        Qhi(this.Qhi);
                        this.Qhi.clear();
                    }
                } catch (Exception unused) {
                }
            }
        }
        cJ();
        arrayList.size();
        return arrayList;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.ac
    public String cJ() {
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh CJ = hm.ROR().CJ();
        if (CJ != null) {
            return CJ.cJ();
        }
        return null;
    }

    public void cJ(List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh : list) {
            linkedList.add(tgh.ac());
            com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.WAv(tgh);
        }
        cJ();
        linkedList.size();
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(fl(), "DELETE FROM " + cJ() + " WHERE " + Qhi(FacebookMediationAdapter.KEY_ID, linkedList, 1000, true));
        ac(linkedList);
    }

    private void cJ(int i10, long j10) {
        if (j10 > 0 || i10 > 0) {
            com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(fl(), cJ(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
            cJ();
        }
    }

    public List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi(String str) {
        com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar = this.CJ;
        if (acVar == null) {
            return new ArrayList();
        }
        return Qhi(acVar.cJ(), str);
    }

    public void Qhi(List<String> list) {
        cJ();
        list.size();
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(fl(), "DELETE FROM " + cJ() + " WHERE " + Qhi(FacebookMediationAdapter.KEY_ID, list, 1000, true));
        com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.dI(), list.size());
        ac(list);
    }

    public void Qhi(int i10, long j10) {
        cJ(i10, j10);
    }

    public boolean Qhi(int i10) {
        if (this.CJ == null) {
            return false;
        }
        int Qhi = Qhi();
        int Qhi2 = this.CJ.Qhi();
        cJ();
        return (com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.ac() && (i10 == 1 || i10 == 2)) ? Qhi > 0 : Qhi >= Qhi2;
    }

    private static String Qhi(String str, List<?> list, int i10, boolean z10) {
        int i11;
        String str2 = z10 ? " IN " : " NOT IN ";
        String str3 = z10 ? " OR " : " AND ";
        int min = Math.min(i10, 1000);
        int size = list.size();
        if (size % min == 0) {
            i11 = size / min;
        } else {
            i11 = (size / min) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * min;
            String Qhi = Qhi(TextUtils.join("','", list.subList(i13, Math.min(i13 + min, size))), "");
            if (i12 != 0) {
                sb2.append(str3);
            }
            h.l(sb2, str, str2, "('", Qhi);
            sb2.append("')");
        }
        return Qhi(sb2.toString(), f.m(str, str2, "('')"));
    }

    private static String Qhi(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
