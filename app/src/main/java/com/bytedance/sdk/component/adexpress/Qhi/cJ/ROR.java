package com.bytedance.sdk.component.adexpress.Qhi.cJ;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.LruCache;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TmplDbHelper.java */
/* loaded from: classes.dex */
public class ROR {
    public static int Qhi = 20;
    private static volatile ROR cJ;

    /* renamed from: fl  reason: collision with root package name */
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.Qhi.ac.ac> f8132fl;
    private final Object CJ = new Object();
    private AtomicBoolean Tgh = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.Qhi.ac.cJ> ROR = new LruCache<String, com.bytedance.sdk.component.adexpress.Qhi.ac.cJ>(Qhi) { // from class: com.bytedance.sdk.component.adexpress.Qhi.cJ.ROR.1
        @Override // android.util.LruCache
        /* renamed from: Qhi */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.Qhi.ac.cJ cJVar) {
            return 1;
        }
    };

    /* renamed from: ac  reason: collision with root package name */
    private Set<String> f8131ac = Collections.synchronizedSet(new HashSet());

    private ROR() {
    }

    private void CJ(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.Qhi.ac.cJ> lruCache;
        if (!TextUtils.isEmpty(str) && (lruCache = this.ROR) != null && lruCache.size() > 0) {
            synchronized (this.CJ) {
                this.ROR.remove(str);
            }
        }
    }

    public static void Qhi(int i10) {
        Qhi = i10;
    }

    public static String ac() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    public Set<String> cJ(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().cJ() != null) {
            HashSet hashSet = new HashSet();
            Cursor Qhi2 = com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().cJ().Qhi("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (Qhi2 != null) {
                try {
                    if (Qhi2.moveToFirst()) {
                        do {
                            hashSet.add(Qhi2.getString(Qhi2.getColumnIndex(FacebookMediationAdapter.KEY_ID)));
                        } while (Qhi2.moveToNext());
                        Qhi2.close();
                        return hashSet;
                    }
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    Qhi2.close();
                    throw th2;
                }
                Qhi2.close();
            }
        }
        return null;
    }

    public static ROR Qhi() {
        if (cJ == null) {
            synchronized (ROR.class) {
                if (cJ == null) {
                    cJ = new ROR();
                }
            }
        }
        return cJ;
    }

    public void ac(String str) {
        com.bytedance.sdk.component.adexpress.Qhi.ac.ac acVar;
        try {
            if (this.f8132fl == null || this.f8132fl.isEmpty() || (acVar = this.f8132fl.get(str)) == null) {
                return;
            }
            if (!TextUtils.isEmpty(acVar.Qhi()) && com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().Tgh() != null) {
                com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().Tgh();
            }
            this.f8132fl.remove(str);
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.Qhi.ac.cJ Qhi(String str) {
        com.bytedance.sdk.component.adexpress.Qhi.ac.cJ cJVar;
        com.bytedance.sdk.component.adexpress.Qhi.ac.cJ Qhi2;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().cJ() == null) {
            return null;
        }
        synchronized (this.CJ) {
            cJVar = this.ROR.get(String.valueOf(str));
        }
        if (cJVar != null) {
            return cJVar;
        }
        Cursor Qhi3 = com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().cJ().Qhi("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (Qhi3 != null) {
            try {
                if (Qhi3.moveToFirst()) {
                    do {
                        String string = Qhi3.getString(Qhi3.getColumnIndex("rit"));
                        String string2 = Qhi3.getString(Qhi3.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                        String string3 = Qhi3.getString(Qhi3.getColumnIndex("md5"));
                        String string4 = Qhi3.getString(Qhi3.getColumnIndex(InMobiNetworkValues.URL));
                        String string5 = Qhi3.getString(Qhi3.getColumnIndex("data"));
                        String string6 = Qhi3.getString(Qhi3.getColumnIndex("version"));
                        Qhi2 = new com.bytedance.sdk.component.adexpress.Qhi.ac.cJ().Qhi(string).cJ(string2).ac(string3).CJ(string4).fl(string5).Tgh(string6).Qhi(Long.valueOf(Qhi3.getLong(Qhi3.getColumnIndex("update_time"))));
                        synchronized (this.CJ) {
                            this.ROR.put(string2, Qhi2);
                        }
                        this.f8131ac.add(string2);
                    } while (Qhi3.moveToNext());
                    return Qhi2;
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<com.bytedance.sdk.component.adexpress.Qhi.ac.cJ> cJ() {
        if (com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().cJ() == null) {
            return null;
        }
        boolean z10 = this.Tgh.get();
        this.Tgh.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor Qhi2 = com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().cJ().Qhi("template_diff_new", null, null, null, null, null, null);
        if (Qhi2 != null) {
            while (Qhi2.moveToNext()) {
                try {
                    String string = Qhi2.getString(Qhi2.getColumnIndex("rit"));
                    String string2 = Qhi2.getString(Qhi2.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                    String string3 = Qhi2.getString(Qhi2.getColumnIndex("md5"));
                    String string4 = Qhi2.getString(Qhi2.getColumnIndex(InMobiNetworkValues.URL));
                    String string5 = Qhi2.getString(Qhi2.getColumnIndex("data"));
                    String string6 = Qhi2.getString(Qhi2.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.Qhi.ac.cJ().Qhi(string).cJ(string2).ac(string3).CJ(string4).fl(string5).Tgh(string6).Qhi(Long.valueOf(Qhi2.getLong(Qhi2.getColumnIndex("update_time")))));
                    synchronized (this.CJ) {
                        this.ROR.put(string2, arrayList.get(arrayList.size() - 1));
                    }
                    this.f8131ac.add(string2);
                    if (!z10 && com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().Tgh() != null) {
                        if (this.f8132fl == null) {
                            this.f8132fl = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.f8132fl.contains(string2)) {
                            this.f8132fl.put(string2, new com.bytedance.sdk.component.adexpress.Qhi.ac.ac(string, string2, string3));
                        }
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        return arrayList;
    }

    public void Qhi(com.bytedance.sdk.component.adexpress.Qhi.ac.cJ cJVar, boolean z10) {
        if (cJVar == null || com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().cJ() == null || TextUtils.isEmpty(cJVar.cJ())) {
            return;
        }
        Cursor Qhi2 = com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().cJ().Qhi("template_diff_new", null, "id=?", new String[]{cJVar.cJ()}, null, null, null);
        boolean z11 = Qhi2 != null && Qhi2.getCount() > 0;
        if (Qhi2 != null) {
            try {
                r2 = Qhi2.moveToFirst() ? Qhi2.getString(Qhi2.getColumnIndex("rit")) : null;
                Qhi2.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", cJVar.Qhi());
        contentValues.put(FacebookMediationAdapter.KEY_ID, cJVar.cJ());
        contentValues.put("md5", cJVar.ac());
        contentValues.put(InMobiNetworkValues.URL, cJVar.CJ());
        contentValues.put("data", cJVar.fl());
        contentValues.put("version", cJVar.Tgh());
        contentValues.put("update_time", cJVar.ROR());
        if (z11) {
            com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().cJ().Qhi("template_diff_new", contentValues, "id=?", new String[]{cJVar.cJ()});
        } else {
            com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().cJ().Qhi("template_diff_new", contentValues);
        }
        synchronized (this.CJ) {
            this.ROR.put(cJVar.cJ(), cJVar);
        }
        this.f8131ac.add(cJVar.cJ());
        if (z10) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().Tgh() == null) {
                return;
            }
            if (this.f8132fl == null) {
                this.f8132fl = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.Qhi.ac.ac acVar = new com.bytedance.sdk.component.adexpress.Qhi.ac.ac(cJVar.Qhi(), cJVar.cJ(), cJVar.ac());
            this.f8132fl.put(cJVar.cJ(), acVar);
            if (r2 != null) {
                com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().Tgh();
                acVar.cJ();
            }
            com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().Tgh();
            cJVar.Qhi();
        } catch (Throwable unused2) {
        }
    }

    public void Qhi(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().cJ() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                CJ(strArr[i10]);
                com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().cJ().Qhi("template_diff_new", "id=?", new String[]{strArr[i10]});
                ac(strArr[i10]);
            }
        }
    }
}
