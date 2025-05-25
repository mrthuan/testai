package pdf.pdfreader.viewer.editor.free.ui.widget.sign.db;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;

/* compiled from: SignPathInfoConverter.java */
/* loaded from: classes3.dex */
public final class e {
    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                int optInt = jSONObject.optInt(ea.a.p("GWMkaTZuNnk4ZQ==", "hHxPYbGl"), 0);
                double optDouble = jSONObject.optDouble(ea.a.p("eA==", "Tqa5aHgt"), 0.0d);
                double optDouble2 = jSONObject.optDouble(ea.a.p("eQ==", "AcjTi1lI"), 0.0d);
                double optDouble3 = jSONObject.optDouble(ea.a.p("NzI=", "vJ3hCfDw"), 0.0d);
                double optDouble4 = jSONObject.optDouble(ea.a.p("SjI=", "12GYW43S"), 0.0d);
                SignPathActionInfo.a aVar = new SignPathActionInfo.a();
                aVar.f28501b = (float) optDouble;
                aVar.c = (float) optDouble2;
                aVar.f28502d = (float) optDouble3;
                aVar.f28503e = (float) optDouble4;
                aVar.f28500a = optInt;
                arrayList.add(aVar);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }
}
