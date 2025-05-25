package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: EmojiMetadata.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<h1.a> f3637d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f3638a;

    /* renamed from: b  reason: collision with root package name */
    public final o f3639b;
    public volatile int c = 0;

    public j(o oVar, int i10) {
        this.f3639b = oVar;
        this.f3638a = i10;
    }

    public final int a(int i10) {
        h1.a c = c();
        int a10 = c.a(16);
        if (a10 != 0) {
            ByteBuffer byteBuffer = c.f17948b;
            int i11 = a10 + c.f17947a;
            return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
        }
        return 0;
    }

    public final int b() {
        h1.a c = c();
        int a10 = c.a(16);
        if (a10 != 0) {
            int i10 = a10 + c.f17947a;
            return c.f17948b.getInt(c.f17948b.getInt(i10) + i10);
        }
        return 0;
    }

    public final h1.a c() {
        ThreadLocal<h1.a> threadLocal = f3637d;
        h1.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new h1.a();
            threadLocal.set(aVar);
        }
        h1.b bVar = this.f3639b.f3658a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i10 = a10 + bVar.f17947a;
            int i11 = (this.f3638a * 4) + bVar.f17948b.getInt(i10) + i10 + 4;
            aVar.b(bVar.f17948b.getInt(i11) + i11, bVar.f17948b);
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        h1.a c = c();
        int a10 = c.a(4);
        if (a10 != 0) {
            i10 = c.f17948b.getInt(a10 + c.f17947a);
        } else {
            i10 = 0;
        }
        sb2.append(Integer.toHexString(i10));
        sb2.append(", codepoints:");
        int b10 = b();
        for (int i11 = 0; i11 < b10; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
