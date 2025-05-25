package o4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p4.j;

/* compiled from: AndroidResourceSignature.java */
/* loaded from: classes.dex */
public final class a implements t3.b {

    /* renamed from: b  reason: collision with root package name */
    public final int f22738b;
    public final t3.b c;

    public a(int i10, t3.b bVar) {
        this.f22738b = i10;
        this.c = bVar;
    }

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f22738b).array());
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f22738b != aVar.f22738b || !this.c.equals(aVar.c)) {
            return false;
        }
        return true;
    }

    @Override // t3.b
    public final int hashCode() {
        return j.e(this.f22738b, this.c);
    }
}
