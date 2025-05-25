package com.bytedance.sdk.openadsdk.core.ugen.Qhi;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: UGenTmplDbHelper.java */
/* loaded from: classes.dex */
public class ac {
    public static int Qhi = 20;
    private static volatile ac cJ;

    /* renamed from: ac  reason: collision with root package name */
    private final Object f9184ac = new Object();
    private final LruCache<String, Qhi> CJ = new LruCache<String, Qhi>(Qhi) { // from class: com.bytedance.sdk.openadsdk.core.ugen.Qhi.ac.1
        @Override // android.util.LruCache
        /* renamed from: Qhi */
        public int sizeOf(String str, Qhi qhi) {
            return 1;
        }
    };

    private ac() {
    }

    public static String CJ() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public static ac Qhi() {
        if (cJ == null) {
            synchronized (ac.class) {
                if (cJ == null) {
                    cJ = new ac();
                }
            }
        }
        return cJ;
    }

    public static String ac() {
        return "CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)";
    }

    public List<Qhi> cJ() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.multipro.aidl.ac acVar = new com.bytedance.sdk.openadsdk.multipro.aidl.ac(com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(HzH.Qhi(), "ugen_template", null, null, null, null, null, null));
        try {
            if (acVar.moveToFirst()) {
                do {
                    int columnIndex = acVar.getColumnIndex(FacebookMediationAdapter.KEY_ID);
                    int columnIndex2 = acVar.getColumnIndex("md5");
                    int columnIndex3 = acVar.getColumnIndex(InMobiNetworkValues.URL);
                    int columnIndex4 = acVar.getColumnIndex("data");
                    int columnIndex5 = acVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = acVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? acVar.getString(columnIndex6) : null;
                        String string2 = acVar.getString(columnIndex);
                        String string3 = acVar.getString(columnIndex2);
                        String string4 = acVar.getString(columnIndex3);
                        Qhi Qhi2 = new Qhi().Qhi(string2).cJ(string3).ac(string4).CJ(acVar.getString(columnIndex4)).fl(string).Qhi(Long.valueOf(acVar.getLong(columnIndex5)));
                        arrayList.add(Qhi2);
                        synchronized (this.f9184ac) {
                            this.CJ.put(string2, Qhi2);
                        }
                    }
                } while (acVar.moveToNext());
            }
        } finally {
            try {
                return arrayList;
            } finally {
            }
        }
        return arrayList;
    }

    public Qhi Qhi(String str, String str2) {
        Qhi qhi;
        Qhi Qhi2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f9184ac) {
            qhi = this.CJ.get(str);
        }
        if (qhi != null) {
            if (TextUtils.equals(str2, qhi.cJ())) {
                return qhi;
            }
            cJ(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.ac acVar = new com.bytedance.sdk.openadsdk.multipro.aidl.ac(com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(HzH.Qhi(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (acVar.moveToFirst()) {
                do {
                    int columnIndex = acVar.getColumnIndex(FacebookMediationAdapter.KEY_ID);
                    int columnIndex2 = acVar.getColumnIndex("md5");
                    int columnIndex3 = acVar.getColumnIndex(InMobiNetworkValues.URL);
                    int columnIndex4 = acVar.getColumnIndex("data");
                    int columnIndex5 = acVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = acVar.getColumnIndex("rit");
                        String string = acVar.getString(columnIndex);
                        String string2 = acVar.getString(columnIndex2);
                        String string3 = acVar.getString(columnIndex3);
                        String string4 = acVar.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            return null;
                        }
                        Qhi2 = new Qhi().Qhi(string).cJ(string2).CJ(string4).ac(string3).fl(columnIndex6 != -1 ? acVar.getString(columnIndex6) : null).Qhi(Long.valueOf(acVar.getLong(columnIndex5)));
                        synchronized (this.f9184ac) {
                            this.CJ.put(string, Qhi2);
                        }
                    }
                    return null;
                } while (acVar.moveToNext());
                return Qhi2;
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }

    private void cJ(String str) {
        if (!TextUtils.isEmpty(str) && this.CJ.size() > 0) {
            synchronized (this.f9184ac) {
                this.CJ.remove(str);
            }
        }
    }

    public void Qhi(Qhi qhi) {
        if (qhi == null || TextUtils.isEmpty(qhi.Qhi())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.ac acVar = new com.bytedance.sdk.openadsdk.multipro.aidl.ac(com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(HzH.Qhi(), "ugen_template", null, "id=?", new String[]{qhi.Qhi()}, null, null, null));
        boolean z10 = acVar.getCount() > 0;
        try {
            acVar.close();
        } catch (Throwable unused) {
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, qhi.Qhi());
        contentValues.put("md5", qhi.cJ());
        contentValues.put(InMobiNetworkValues.URL, qhi.ac());
        contentValues.put("data", qhi.fl());
        contentValues.put("rit", qhi.Tgh());
        contentValues.put("update_time", qhi.CJ());
        if (z10) {
            com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(HzH.Qhi(), "ugen_template", contentValues, "id=?", new String[]{qhi.Qhi()});
        } else {
            com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(HzH.Qhi(), "ugen_template", contentValues);
        }
        synchronized (this.f9184ac) {
            this.CJ.put(qhi.Qhi(), qhi);
        }
    }

    public Set<Qhi> Qhi(String str) {
        Qhi qhi;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.multipro.aidl.ac acVar = new com.bytedance.sdk.openadsdk.multipro.aidl.ac(com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(HzH.Qhi(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (acVar.moveToFirst()) {
                do {
                    int columnIndex = acVar.getColumnIndex(FacebookMediationAdapter.KEY_ID);
                    if (columnIndex != -1) {
                        String string = acVar.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.f9184ac) {
                                qhi = this.CJ.get(string);
                            }
                            if (qhi != null) {
                                hashSet.add(qhi);
                            } else {
                                Qhi qhi2 = new Qhi();
                                int columnIndex2 = acVar.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = acVar.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        qhi2.CJ(string2);
                                        qhi2.Qhi(string);
                                        qhi2.fl(str);
                                        int columnIndex3 = acVar.getColumnIndex("md5");
                                        int columnIndex4 = acVar.getColumnIndex(InMobiNetworkValues.URL);
                                        int columnIndex5 = acVar.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            qhi2.cJ(acVar.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            qhi2.ac(acVar.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            qhi2.Qhi(Long.valueOf(acVar.getLong(columnIndex5)));
                                        }
                                        hashSet.add(qhi2);
                                        synchronized (this.f9184ac) {
                                            this.CJ.put(string, qhi2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (acVar.moveToNext());
            }
        } finally {
            try {
                return hashSet;
            } finally {
            }
        }
        return hashSet;
    }

    public void Qhi(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                cJ(str);
                com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi.Qhi(HzH.Qhi(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
