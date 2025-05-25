package h1;

import java.nio.ByteBuffer;
import kotlinx.coroutines.y;

/* compiled from: Table.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f17947a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f17948b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f17949d;

    public c() {
        if (y.f20275a == null) {
            y.f20275a = new y();
        }
    }

    public final int a(int i10) {
        if (i10 < this.f17949d) {
            return this.f17948b.getShort(this.c + i10);
        }
        return 0;
    }

    public final void b(int i10, ByteBuffer byteBuffer) {
        this.f17948b = byteBuffer;
        if (byteBuffer != null) {
            this.f17947a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.c = i11;
            this.f17949d = this.f17948b.getShort(i11);
            return;
        }
        this.f17947a = 0;
        this.c = 0;
        this.f17949d = 0;
    }
}
