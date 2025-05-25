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

/* compiled from: StatsLogEventRepoImpl.java */
/* loaded from: classes.dex */
public class Sf extends ac {
    protected List<String> Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac f8064ac;

    public Sf(Context context, com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar) {
        super(context);
        this.Qhi = new ArrayList();
        this.f8064ac = acVar;
        if (acVar == null) {
            this.f8064ac = com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac.ac();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r1 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int CJ() {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.fl()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r9.cJ()     // Catch: java.lang.Throwable -> L28
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "count(1)"
            r3[r0] = r4     // Catch: java.lang.Throwable -> L28
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L22
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L29
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L29
        L22:
            if (r1 == 0) goto L2c
        L24:
            r1.close()     // Catch: java.lang.Exception -> L2c
            goto L2c
        L28:
            r1 = 0
        L29:
            if (r1 == 0) goto L2c
            goto L24
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Sf.CJ():int");
    }

    public byte Qhi() {
        return (byte) 1;
    }

    public byte ac() {
        return (byte) 2;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.ac
    public String cJ() {
        return hm.ROR().CJ().CJ();
    }

    public static String ac(String str) {
        return h.d("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi(int i10, String str) {
        long Qhi = com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi(i10, fl());
        if (Qhi <= 0) {
            Qhi = 1;
        } else if (Qhi > 100) {
            Qhi = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.Qhi.clear();
        Cursor Qhi2 = com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(fl(), cJ(), new String[]{FacebookMediationAdapter.KEY_ID, "value", "encrypt"}, null, null, null, null, str + " DESC limit " + Qhi);
        if (Qhi2 != null) {
            while (Qhi2.moveToNext()) {
                try {
                    try {
                        String string = Qhi2.getString(Qhi2.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                        String string2 = Qhi2.getString(Qhi2.getColumnIndex("value"));
                        if (Qhi2.getInt(Qhi2.getColumnIndex("encrypt")) == 1) {
                            string2 = hm.ROR().hpZ().Qhi(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.Qhi.add(string);
                        } else if (arrayList.size() > 100) {
                            break;
                        } else {
                            com.bytedance.sdk.component.Tgh.Qhi.CJ.Qhi.cJ cJVar = new com.bytedance.sdk.component.Tgh.Qhi.CJ.Qhi.cJ(string, new JSONObject(string2));
                            cJVar.cJ(ac());
                            cJVar.Qhi(Qhi());
                            arrayList.add(cJVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        Qhi2.close();
                        if (!this.Qhi.isEmpty()) {
                            Qhi(this.Qhi);
                            this.Qhi.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    public List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> cJ(String str) {
        com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar = this.f8064ac;
        if (acVar == null) {
            return new ArrayList();
        }
        return Qhi(acVar.cJ(), str);
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
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(fl(), cJ(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
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
        return this.f8064ac != null && CJ() >= this.f8064ac.Qhi();
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
