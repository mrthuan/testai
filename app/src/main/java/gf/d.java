package gf;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: JSONMessageCodec.java */
/* loaded from: classes.dex */
public final class d implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f17794a = new d();

    @Override // gf.f
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object a10 = e.a(obj);
        if (a10 instanceof String) {
            l lVar = l.f17805b;
            String quote = JSONObject.quote((String) a10);
            lVar.getClass();
            return l.d(quote);
        }
        l lVar2 = l.f17805b;
        String obj2 = a10.toString();
        lVar2.getClass();
        return l.d(obj2);
    }

    @Override // gf.f
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            l.f17805b.getClass();
            JSONTokener jSONTokener = new JSONTokener(l.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }
}
