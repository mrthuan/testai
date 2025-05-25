package com.bytedance.sdk.openadsdk.kYc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: SPUnit.java */
/* loaded from: classes.dex */
public class cJ {
    private SharedPreferences Qhi;
    private final String cJ;

    public cJ(Context context, String str) {
        this.cJ = str;
        if (!TextUtils.isEmpty(str) && context != null) {
            this.Qhi = context.getSharedPreferences(str, 0);
        }
    }

    public void Qhi(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferences = this.Qhi;
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof Integer) {
                            edit.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            edit.putLong(next, ((Long) obj).longValue());
                        } else if (obj instanceof String) {
                            edit.putString(next, (String) obj);
                        } else if (obj instanceof Boolean) {
                            edit.putBoolean(next, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof Float) {
                            edit.putFloat(next, ((Float) obj).floatValue());
                        } else if (obj instanceof Double) {
                            edit.putFloat(next, Double.valueOf(((Double) obj).doubleValue()).floatValue());
                        }
                    }
                }
                edit.apply();
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public long cJ(String str, long j10) {
        try {
            SharedPreferences sharedPreferences = this.Qhi;
            if (sharedPreferences != null && sharedPreferences.contains(str)) {
                return this.Qhi.getLong(str, j10);
            }
            return j10;
        } catch (Throwable th2) {
            th2.getMessage();
            return j10;
        }
    }

    public void Qhi(String str, long j10) {
        try {
            SharedPreferences sharedPreferences = this.Qhi;
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(str, j10);
                edit.apply();
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public int Qhi(String str, int i10) {
        try {
            SharedPreferences sharedPreferences = this.Qhi;
            if (sharedPreferences != null && sharedPreferences.contains(str)) {
                return this.Qhi.getInt(str, i10);
            }
            return i10;
        } catch (Throwable th2) {
            th2.getMessage();
            return i10;
        }
    }

    public String Qhi(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.Qhi;
            if (sharedPreferences != null && sharedPreferences.contains(str)) {
                return this.Qhi.getString(str, str2);
            }
            return str2;
        } catch (Throwable th2) {
            th2.getMessage();
            return str2;
        }
    }

    public boolean Qhi(String str, boolean z10) {
        try {
            SharedPreferences sharedPreferences = this.Qhi;
            if (sharedPreferences != null && sharedPreferences.contains(str)) {
                return this.Qhi.getBoolean(str, z10);
            }
            return z10;
        } catch (Throwable th2) {
            th2.getMessage();
            return z10;
        }
    }

    public void Qhi() {
        SharedPreferences sharedPreferences = this.Qhi;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.commit();
        }
    }
}
