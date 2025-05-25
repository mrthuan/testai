package u5;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import org.json.JSONObject;

/* compiled from: MetadataRule.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final CopyOnWriteArraySet f30223d = new CopyOnWriteArraySet();

    /* renamed from: a  reason: collision with root package name */
    public final String f30224a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30225b;
    public final List<String> c;

    /* compiled from: MetadataRule.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(JSONObject jSONObject) {
            boolean z10;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(key);
                if (optJSONObject != null) {
                    String k10 = optJSONObject.optString(OperatorName.NON_STROKING_CMYK);
                    String v10 = optJSONObject.optString(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT);
                    g.d(k10, "k");
                    if (k10.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        CopyOnWriteArraySet a10 = d.a();
                        g.d(key, "key");
                        List h02 = k.h0(k10, new String[]{","}, 0, 6);
                        g.d(v10, "v");
                        a10.add(new d(key, h02, v10));
                    }
                }
            }
        }
    }

    public d(String str, List list, String str2) {
        this.f30224a = str;
        this.f30225b = str2;
        this.c = list;
    }

    public static final /* synthetic */ CopyOnWriteArraySet a() {
        if (k6.a.b(d.class)) {
            return null;
        }
        try {
            return f30223d;
        } catch (Throwable th2) {
            k6.a.a(d.class, th2);
            return null;
        }
    }

    public final String b() {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            return this.f30224a;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }
}
