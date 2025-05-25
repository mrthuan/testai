package be;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InterstitialMediation.java */
/* loaded from: classes.dex */
public abstract class c extends be.a {

    /* compiled from: InterstitialMediation.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    public static ee.b j(Context context, String str, String str2) {
        String e10;
        int i10 = 0;
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    e10 = de.e.e(context, str2);
                } else {
                    e10 = de.e.e(context, null);
                }
                if (!TextUtils.isEmpty(e10)) {
                    i10 = new JSONObject(e10).optInt(str, 0);
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        if (i10 <= 0) {
            return null;
        }
        return new ee.b(context, i10);
    }

    public abstract boolean k();

    public abstract void l(Activity activity, a aVar);
}
