package com.bytedance.sdk.component.Tgh.Qhi.Tgh;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.LinkedList;
import java.util.List;

/* compiled from: TrackRetryRepertoryImpl.java */
/* loaded from: classes.dex */
public class ROR implements Tgh {
    private Context Qhi;

    public ROR(Context context) {
        this.Qhi = context;
    }

    public static String cJ() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh.Tgh
    public List<fl> Qhi() {
        LinkedList linkedList = new LinkedList();
        Cursor Qhi = com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(this.Qhi, "trackurl", null, null, null, null, null, null);
        if (Qhi != null) {
            while (Qhi.moveToNext()) {
                try {
                    try {
                        String string = Qhi.getString(Qhi.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                        String string2 = Qhi.getString(Qhi.getColumnIndex(InMobiNetworkValues.URL));
                        boolean z10 = Qhi.getInt(Qhi.getColumnIndex("replaceholder")) > 0;
                        int i10 = Qhi.getInt(Qhi.getColumnIndex("retry"));
                        int i11 = Qhi.getInt(Qhi.getColumnIndex("url_type"));
                        String string3 = Qhi.getString(Qhi.getColumnIndex("ad_id"));
                        String string4 = Qhi.getString(Qhi.getColumnIndex("error_code"));
                        String string5 = Qhi.getString(Qhi.getColumnIndex("error_msg"));
                        fl flVar = new fl(string, string2, z10, i11, string3);
                        flVar.Qhi(i10);
                        if (!TextUtils.isEmpty(string4)) {
                            flVar.Qhi(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            flVar.cJ(string5);
                        }
                        linkedList.add(flVar);
                    } finally {
                        Qhi.close();
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh.Tgh
    public void ac(fl flVar) {
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(this.Qhi, "trackurl", "id=?", new String[]{flVar.Qhi()});
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh.Tgh
    public void cJ(fl flVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, flVar.Qhi());
        contentValues.put(InMobiNetworkValues.URL, flVar.cJ());
        contentValues.put("replaceholder", Integer.valueOf(flVar.ac() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(flVar.CJ()));
        contentValues.put("error_code", flVar.ROR());
        contentValues.put("error_msg", flVar.hm());
        contentValues.put("url_type", Integer.valueOf(flVar.fl()));
        contentValues.put("ad_id", flVar.Tgh());
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(this.Qhi, "trackurl", contentValues, "id=?", new String[]{flVar.Qhi()});
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh.Tgh
    public fl Qhi(String str) {
        Cursor Qhi = com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(this.Qhi, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (Qhi != null && Qhi.moveToFirst()) {
            try {
                String string = Qhi.getString(Qhi.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                String string2 = Qhi.getString(Qhi.getColumnIndex(InMobiNetworkValues.URL));
                boolean z10 = Qhi.getInt(Qhi.getColumnIndex("replaceholder")) > 0;
                int i10 = Qhi.getInt(Qhi.getColumnIndex("retry"));
                int i11 = Qhi.getInt(Qhi.getColumnIndex("url_type"));
                String string3 = Qhi.getString(Qhi.getColumnIndex("ad_id"));
                String string4 = Qhi.getString(Qhi.getColumnIndex("error_code"));
                String string5 = Qhi.getString(Qhi.getColumnIndex("error_msg"));
                fl flVar = new fl(string, string2, z10, i11, string3);
                flVar.Qhi(i10);
                if (!TextUtils.isEmpty(string4)) {
                    flVar.Qhi(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    flVar.cJ(string5);
                }
                return flVar;
            } catch (Throwable th2) {
                try {
                    th2.getMessage();
                    Qhi.close();
                    Qhi = null;
                } finally {
                    Qhi.close();
                }
            }
        }
        if (Qhi != null) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Tgh.Tgh
    public void Qhi(fl flVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, flVar.Qhi());
        contentValues.put(InMobiNetworkValues.URL, flVar.cJ());
        contentValues.put("replaceholder", Integer.valueOf(flVar.ac() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(flVar.CJ()));
        contentValues.put("url_type", Integer.valueOf(flVar.fl()));
        contentValues.put("ad_id", flVar.Tgh());
        contentValues.put("error_code", flVar.ROR());
        contentValues.put("error_msg", flVar.hm());
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(this.Qhi, "trackurl", contentValues);
    }
}
