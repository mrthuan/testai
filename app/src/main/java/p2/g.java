package p2;

import a2.c;
import android.content.Context;
import android.text.TextUtils;

/* compiled from: WorkDatabase.java */
/* loaded from: classes.dex */
public final class g implements c.InterfaceC0000c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f23622a;

    public g(Context context) {
        this.f23622a = context;
    }

    @Override // a2.c.InterfaceC0000c
    public final a2.c a(c.b bVar) {
        c.a aVar = bVar.c;
        if (aVar != null) {
            Context context = this.f23622a;
            if (context != null) {
                String str = bVar.f29b;
                if (!TextUtils.isEmpty(str)) {
                    return new b2.b(context, str, aVar, true);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}
