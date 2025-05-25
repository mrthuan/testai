package v6;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.HashMap;
import za.e;

/* compiled from: ProtoEncoderDoNotUse.java */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final za.e f30723a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        za.d dVar = e.a.f32328a;
        hashMap.put(p.class, e.f30691a);
        hashMap2.remove(p.class);
        hashMap.put(y6.a.class, a.f30681a);
        hashMap2.remove(y6.a.class);
        hashMap.put(y6.e.class, g.f30695a);
        hashMap2.remove(y6.e.class);
        hashMap.put(y6.c.class, d.f30689a);
        hashMap2.remove(y6.c.class);
        hashMap.put(LogEventDropped.class, c.f30687a);
        hashMap2.remove(LogEventDropped.class);
        hashMap.put(y6.b.class, b.f30685a);
        hashMap2.remove(y6.b.class);
        hashMap.put(y6.d.class, f.f30693a);
        hashMap2.remove(y6.d.class);
        f30723a = new za.e(new HashMap(hashMap), new HashMap(hashMap2), dVar);
    }

    public abstract y6.a a();
}
