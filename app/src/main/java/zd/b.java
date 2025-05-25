package zd;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.ADRequestList;
import org.json.JSONArray;
import org.json.JSONException;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: BaseAD.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public ADRequestList f32354a;

    /* renamed from: b  reason: collision with root package name */
    public int f32355b = 0;
    public boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public String f32356d = "";

    public final void a(Context context) {
        if (!this.c) {
            return;
        }
        de.e.i(context).edit().putInt("have_click_ad_times", de.e.i(context).getInt("have_click_ad_times", 0) + 1).apply();
    }

    public final yd.b b() {
        JSONArray orderList;
        int i10;
        ADRequestList aDRequestList = this.f32354a;
        if (aDRequestList == null || aDRequestList.size() == 0 || (orderList = this.f32354a.getOrderList()) == null || orderList.length() != this.f32354a.size() || this.f32355b - 1 < 0) {
            return null;
        }
        try {
            return new yd.b(i10, this.f32354a.size(), orderList.getString(i10));
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final boolean c(Context context) {
        int d10;
        if (!this.c) {
            return false;
        }
        if (!t0.b0(de.e.i(context).getLong("last_start_click_ad_time", 0L), System.currentTimeMillis())) {
            de.e.i(context).edit().putInt("have_click_ad_times", 0).apply();
            de.e.i(context).edit().putLong("last_start_click_ad_time", System.currentTimeMillis()).apply();
            return false;
        }
        int i10 = de.e.i(context).getInt("have_click_ad_times", 0);
        if (!TextUtils.isEmpty(this.f32356d)) {
            d10 = de.e.d(context, this.f32356d, "ad_click_times", 10);
        } else {
            d10 = de.e.d(context, null, "ad_click_times", 10);
        }
        if (i10 < d10) {
            return false;
        }
        return true;
    }
}
