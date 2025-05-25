package jb;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: NotificationParams.java */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f19150a;

    public q(Bundle bundle) {
        this.f19150a = new Bundle(bundle);
    }

    public static boolean f(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static void h(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public final boolean a(String str) {
        String e10 = e(str);
        if (!"1".equals(e10) && !Boolean.parseBoolean(e10)) {
            return false;
        }
        return true;
    }

    public final Integer b(String str) {
        String e10 = e(str);
        if (!TextUtils.isEmpty(e10)) {
            try {
                return Integer.valueOf(Integer.parseInt(e10));
            } catch (NumberFormatException unused) {
                h(str);
                return null;
            }
        }
        return null;
    }

    public final JSONArray c(String str) {
        String e10 = e(str);
        if (!TextUtils.isEmpty(e10)) {
            try {
                return new JSONArray(e10);
            } catch (JSONException unused) {
                h(str);
                return null;
            }
        }
        return null;
    }

    public final String d(Resources resources, String str, String str2) {
        String[] strArr;
        String e10 = e(str2);
        if (!TextUtils.isEmpty(e10)) {
            return e10;
        }
        String e11 = e(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(e11)) {
            return null;
        }
        int identifier = resources.getIdentifier(e11, "string", str);
        if (identifier == 0) {
            h(str2.concat("_loc_key"));
            return null;
        }
        JSONArray c = c(str2.concat("_loc_args"));
        if (c == null) {
            strArr = null;
        } else {
            int length = c.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = c.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            h(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    public final String e(String str) {
        String replace;
        Bundle bundle = this.f19150a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final Bundle g() {
        boolean z10;
        Bundle bundle = this.f19150a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }
}
