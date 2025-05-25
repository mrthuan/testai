package ya;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: JsonValueObjectEncoderContext.java */
/* loaded from: classes2.dex */
public final class f implements wa.d, wa.f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f32107a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f32108b;
    public final Map<Class<?>, wa.c<?>> c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, wa.e<?>> f32109d;

    /* renamed from: e  reason: collision with root package name */
    public final wa.c<Object> f32110e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f32111f;

    public f(Writer writer, HashMap hashMap, HashMap hashMap2, a aVar, boolean z10) {
        this.f32108b = new JsonWriter(writer);
        this.c = hashMap;
        this.f32109d = hashMap2;
        this.f32110e = aVar;
        this.f32111f = z10;
    }

    @Override // wa.d
    public final wa.d a(wa.b bVar, boolean z10) {
        String str = bVar.f31069a;
        i();
        JsonWriter jsonWriter = this.f32108b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(z10);
        return this;
    }

    @Override // wa.d
    public final wa.d b(wa.b bVar, long j10) {
        String str = bVar.f31069a;
        i();
        JsonWriter jsonWriter = this.f32108b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(j10);
        return this;
    }

    @Override // wa.d
    public final wa.d c(wa.b bVar, int i10) {
        String str = bVar.f31069a;
        i();
        JsonWriter jsonWriter = this.f32108b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(i10);
        return this;
    }

    @Override // wa.f
    public final wa.f d(String str) {
        i();
        this.f32108b.value(str);
        return this;
    }

    @Override // wa.f
    public final wa.f e(boolean z10) {
        i();
        this.f32108b.value(z10);
        return this;
    }

    @Override // wa.d
    public final wa.d f(wa.b bVar, Object obj) {
        return h(obj, bVar.f31069a);
    }

    public final f g(Object obj) {
        JsonWriter jsonWriter = this.f32108b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else {
            int i10 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    i();
                    jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                    return this;
                }
                jsonWriter.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i10 < length) {
                        jsonWriter.value(iArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i10 < length2) {
                        long j10 = jArr[i10];
                        i();
                        jsonWriter.value(j10);
                        i10++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i10 < length3) {
                        jsonWriter.value(dArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i10 < length4) {
                        jsonWriter.value(zArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i10 < length5) {
                        g(numberArr[i10]);
                        i10++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i10 < length6) {
                        g(objArr[i10]);
                        i10++;
                    }
                }
                jsonWriter.endArray();
                return this;
            } else if (obj instanceof Collection) {
                jsonWriter.beginArray();
                for (Object obj2 : (Collection) obj) {
                    g(obj2);
                }
                jsonWriter.endArray();
                return this;
            } else if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            } else {
                wa.c<?> cVar = this.c.get(obj.getClass());
                if (cVar != null) {
                    jsonWriter.beginObject();
                    cVar.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
                wa.e<?> eVar = this.f32109d.get(obj.getClass());
                if (eVar != null) {
                    eVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    String name = ((Enum) obj).name();
                    i();
                    jsonWriter.value(name);
                    return this;
                } else {
                    jsonWriter.beginObject();
                    this.f32110e.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
            }
        }
    }

    public final f h(Object obj, String str) {
        boolean z10 = this.f32111f;
        JsonWriter jsonWriter = this.f32108b;
        if (z10) {
            if (obj == null) {
                return this;
            }
            i();
            jsonWriter.name(str);
            return g(obj);
        }
        i();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        return g(obj);
    }

    public final void i() {
        if (this.f32107a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
