package jb;

import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.util.HashMap;
import za.e;

/* compiled from: ProtoEncoderDoNotUse.java */
/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final za.e f19151a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        za.d dVar = e.a.f32328a;
        hashMap.put(r.class, c.f19102a);
        hashMap2.remove(r.class);
        hashMap.put(kb.a.class, b.f19096a);
        hashMap2.remove(kb.a.class);
        hashMap.put(MessagingClientEvent.class, a.f19078a);
        hashMap2.remove(MessagingClientEvent.class);
        f19151a = new za.e(new HashMap(hashMap), new HashMap(hashMap2), dVar);
    }

    public abstract kb.a a();
}
