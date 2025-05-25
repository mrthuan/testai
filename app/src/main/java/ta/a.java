package ta;

import com.adjust.sdk.Constants;
import kotlinx.coroutines.y;
import org.json.JSONObject;
import ta.c;

/* compiled from: DefaultSettingsJsonTransform.java */
/* loaded from: classes2.dex */
public final class a implements e {
    public static c b(y yVar) {
        c.b bVar = new c.b(8);
        c.a aVar = new c.a(true, false, false);
        yVar.getClass();
        return new c(System.currentTimeMillis() + ((long) Constants.ONE_HOUR), bVar, aVar, 10.0d, 1.2d, 60);
    }

    @Override // ta.e
    public final c a(y yVar, JSONObject jSONObject) {
        return b(yVar);
    }
}
