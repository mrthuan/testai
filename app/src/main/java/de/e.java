package de;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ServerData.java */
/* loaded from: classes.dex */
public final class e {
    public static void a(Context context, int i10, String str) {
        String string = i(context).getString("ad_click_cache", "");
        try {
            if (!string.equals("")) {
                JSONObject jSONObject = new JSONObject(string);
                JSONArray optJSONArray = jSONObject.optJSONArray("" + i10);
                JSONArray jSONArray = new JSONArray();
                if (optJSONArray != null) {
                    jSONArray.put(str);
                    int i11 = 0;
                    while (i11 < optJSONArray.length() && i11 < 9) {
                        int i12 = i11 + 1;
                        jSONArray.put(i12, optJSONArray.get(i11));
                        i11 = i12;
                    }
                } else {
                    jSONArray.put(str);
                }
                jSONObject.put("" + i10, jSONArray);
                i(context).edit().putString("ad_click_cache", jSONObject.toString()).apply();
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str);
            jSONObject2.put("" + i10, jSONArray2);
            i(context).edit().putString("ad_click_cache", jSONObject2.toString()).apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void b(Context context, String str) {
        String string = i(context).getString("ad_view_count", "");
        try {
            if (!string.equals("")) {
                JSONObject jSONObject = new JSONObject(string);
                if (jSONObject.has("1")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("1");
                    JSONArray jSONArray = new JSONArray();
                    boolean z10 = false;
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        if (jSONObject2.has(str)) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(str, jSONObject2.optInt(str) + 1);
                            jSONArray.put(jSONObject3);
                            z10 = true;
                        } else {
                            jSONArray.put(jSONObject2);
                        }
                    }
                    if (!z10) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(str, 1);
                        jSONArray.put(jSONObject4);
                    }
                    jSONObject.remove("1");
                    jSONObject.put("1", jSONArray);
                } else {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(str, 1);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(jSONObject5);
                    jSONObject.put("1", jSONArray2);
                }
                i(context).edit().putString("ad_view_count", jSONObject.toString()).apply();
                return;
            }
            JSONObject jSONObject6 = new JSONObject();
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put(str, 1);
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put(jSONObject7);
            jSONObject6.put("1", jSONArray3);
            i(context).edit().putString("ad_view_count", jSONObject6.toString()).apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String c(Context context) {
        String str;
        String str2 = null;
        if (TextUtils.isEmpty(null)) {
            str = "ad_config";
        } else {
            str = null;
        }
        if (n(context)) {
            try {
                String b10 = d.a(null).b(str, "");
                if (!TextUtils.isEmpty(b10)) {
                    str2 = b10;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return f(context);
        }
        return str2;
    }

    public static int d(Context context, String str, String str2, int i10) {
        if (n(context)) {
            try {
                if (TextUtils.isEmpty(str)) {
                    str = "common_config";
                }
                String b10 = d.a(null).b(str, "");
                if (!TextUtils.isEmpty(b10)) {
                    JSONObject jSONObject = new JSONObject(b10);
                    if (jSONObject.has(str2)) {
                        return jSONObject.optInt(str2, i10);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        String f10 = f(context);
        if (!f10.equals("")) {
            try {
                JSONObject jSONObject2 = new JSONObject(f10);
                if (jSONObject2.has(str2)) {
                    return jSONObject2.optInt(str2, i10);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return i10;
    }

    public static String e(Context context, String str) {
        if (n(context)) {
            try {
                if (TextUtils.isEmpty(str)) {
                    str = "common_config";
                }
                String b10 = d.a(null).b(str, "");
                if (!TextUtils.isEmpty(b10)) {
                    JSONObject jSONObject = new JSONObject(b10);
                    if (jSONObject.has("admob_i_loading_time")) {
                        return jSONObject.optString("admob_i_loading_time", "");
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        String f10 = f(context);
        if (!f10.equals("")) {
            try {
                JSONObject jSONObject2 = new JSONObject(f10);
                if (jSONObject2.has("admob_i_loading_time")) {
                    return jSONObject2.optString("admob_i_loading_time", "");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return "";
    }

    public static String f(Context context) {
        return i(context).getString("extends_data", "");
    }

    public static String g(Context context) {
        String absolutePath;
        try {
            File filesDir = context.getFilesDir();
            if (!filesDir.exists()) {
                return "";
            }
            File file = new File(filesDir.getAbsolutePath() + File.separator + "lib_promote_ad");
            if (!file.exists()) {
                if (!file.mkdir()) {
                    return "";
                }
                absolutePath = file.getAbsolutePath();
            } else {
                absolutePath = file.getAbsolutePath();
            }
            return absolutePath;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    public static String h(String str, String str2) {
        try {
            return d.a(null).b(str, str2);
        } catch (Exception e10) {
            e10.printStackTrace();
            return str2;
        }
    }

    public static SharedPreferences i(Context context) {
        try {
            return context.getSharedPreferences("ServerConfig", 0);
        } catch (NullPointerException e10) {
            e10.printStackTrace();
            return context.getSharedPreferences("ServerConfig", 0);
        }
    }

    public static int j(Context context, String str) {
        String string = i(context).getString("ad_view_count", "");
        if (!string.equals("")) {
            try {
                JSONArray optJSONArray = new JSONObject(string).optJSONArray("1");
                if (optJSONArray != null) {
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i10);
                        if (jSONObject.has(str)) {
                            return jSONObject.optInt(str);
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return 0;
    }

    public static boolean k(String str) {
        String h10 = h("ad_key_words_filter", "[]");
        if (!TextUtils.isEmpty(h10) && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(h10);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (str.contains(jSONArray.getString(i10))) {
                        return true;
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public static boolean l(Context context, int i10, String str) {
        String string = i(context).getString("ad_click_cache", "");
        if (!string.equals("")) {
            try {
                JSONArray optJSONArray = new JSONObject(string).optJSONArray("" + i10);
                if (optJSONArray != null) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        if (optJSONArray.get(i11).equals(str)) {
                            return true;
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public static void m(Context context, int i10) {
        i(context).edit().putInt("update_later_count", i10).apply();
    }

    public static boolean n(Context context) {
        String f10 = f(context);
        if (!TextUtils.isEmpty(f10)) {
            try {
                JSONObject jSONObject = new JSONObject(f10);
                if (jSONObject.has("use_remote_config")) {
                    if (jSONObject.optInt("use_remote_config", 1) == 1) {
                        return true;
                    }
                    return false;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return true;
    }
}
