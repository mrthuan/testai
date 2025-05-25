package ya;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes2.dex */
public final class e implements xa.a<e> {

    /* renamed from: e  reason: collision with root package name */
    public static final ya.a f32099e = new ya.a();

    /* renamed from: f  reason: collision with root package name */
    public static final b f32100f = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final c f32101g = new c();

    /* renamed from: h  reason: collision with root package name */
    public static final a f32102h = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f32103a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f32104b;
    public final ya.a c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f32105d;

    /* compiled from: JsonDataEncoderBuilder.java */
    /* loaded from: classes2.dex */
    public static final class a implements wa.e<Date> {

        /* renamed from: a  reason: collision with root package name */
        public static final SimpleDateFormat f32106a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f32106a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // wa.a
        public final void a(Object obj, wa.f fVar) {
            fVar.d(f32106a.format((Date) obj));
        }
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.f32103a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f32104b = hashMap2;
        this.c = f32099e;
        this.f32105d = false;
        hashMap2.put(String.class, f32100f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f32101g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f32102h);
        hashMap.remove(Date.class);
    }

    public final xa.a a(Class cls, wa.c cVar) {
        this.f32103a.put(cls, cVar);
        this.f32104b.remove(cls);
        return this;
    }
}
