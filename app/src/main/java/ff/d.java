package ff;

import androidx.activity.s;
import gf.h;
import hf.a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LocalizationChannel.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final gf.h f17276a;

    /* renamed from: b  reason: collision with root package name */
    public b f17277b;

    /* compiled from: LocalizationChannel.java */
    /* loaded from: classes.dex */
    public class a implements h.b {
        public a() {
        }

        @Override // gf.h.b
        public final void a(wk.g gVar, gf.g gVar2) {
            String str;
            d dVar = d.this;
            if (dVar.f17277b == null) {
                return;
            }
            String str2 = (String) gVar.f31333a;
            str2.getClass();
            if (!str2.equals("Localization.getStringResource")) {
                gVar2.b();
                return;
            }
            JSONObject jSONObject = (JSONObject) gVar.f31334b;
            try {
                String string = jSONObject.getString("key");
                if (jSONObject.has("locale")) {
                    str = jSONObject.getString("locale");
                } else {
                    str = null;
                }
                gVar2.c(((a.C0245a) dVar.f17277b).a(string, str));
            } catch (JSONException e10) {
                gVar2.a("error", e10.getMessage(), null);
            }
        }
    }

    /* compiled from: LocalizationChannel.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public d(we.a aVar) {
        a aVar2 = new a();
        gf.h hVar = new gf.h(aVar, "flutter/localization", s.f1849d);
        this.f17276a = hVar;
        hVar.b(aVar2);
    }
}
