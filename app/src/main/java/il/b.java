package il;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;
import wd.a;

/* compiled from: TaiChiDataManager.java */
/* loaded from: classes3.dex */
public final class b implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f18550a;

    public b(c cVar) {
        this.f18550a = cVar;
    }

    public final void a(Bundle bundle) {
        double d10 = c.c + bundle.getDouble(ea.a.p("RWEndWU=", "lTXdSel7"));
        c.c = d10;
        int i10 = (d10 > 0.01d ? 1 : (d10 == 0.01d ? 0 : -1));
        c cVar = this.f18550a;
        if (i10 >= 0) {
            Bundle bundle2 = new Bundle();
            bundle2.putDouble(ea.a.p("MWEgdWU=", "OiGLuuqr"), c.c);
            bundle2.putString(ea.a.p("UHU5chZuAXk=", "PGBxIaO2"), ea.a.p("ZlNE", "EbyLz4oa"));
            FirebaseAnalytics.getInstance(cVar.f18552a).b(bundle2, ea.a.p("d2EibApfI2QBX2ZlH2U4dWU=", "7QsXOU0c"));
            c.c = 0.0d;
        }
        Context context = cVar.f18552a;
        if (a.f18547e == null) {
            a.f18547e = new a(context);
        }
        a aVar = a.f18547e;
        aVar.f18549b = c.c;
        Context context2 = cVar.f18552a;
        if (aVar == null) {
            a.f18547e = new a(context2);
        }
        a aVar2 = a.f18547e;
        aVar2.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ea.a.p("X2E4dCNhC2QmaVll", "lIzcHaqD"), aVar2.f18548a);
            jSONObject.put(ea.a.p("Gm9AYTRWB2w9ZStpV3I4cw==", "sMn4XfHB"), aVar2.f18549b);
            String jSONObject2 = jSONObject.toString();
            String str = a.c;
            String str2 = a.f18546d;
            SharedPreferences sharedPreferences = context2.getSharedPreferences(str, 0);
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(str2, jSONObject2).commit();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
