package w5;

import com.facebook.appevents.codeless.internal.PathComponent;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.ArrayList;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ParameterComponent.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f30973a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30974b;
    public final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30975d;

    public a(JSONObject jSONObject) {
        String string = jSONObject.getString(NamingTable.TAG);
        g.d(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f30973a = string;
        String optString = jSONObject.optString("value");
        g.d(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f30974b = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        g.d(optString2, "component.optString(Cons…tants.PATH_TYPE_ABSOLUTE)");
        this.f30975d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                g.d(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new PathComponent(jSONObject2));
            }
        }
        this.c = arrayList;
    }
}
