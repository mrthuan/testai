package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.b.a.n;
import com.bykv.vk.openvk.preload.a.m;
import com.bykv.vk.openvk.preload.a.r;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* compiled from: Streams.java */
/* loaded from: classes.dex */
public final class k {
    public static com.bykv.vk.openvk.preload.a.k a(com.bykv.vk.openvk.preload.a.d.a aVar) {
        boolean z10;
        try {
            try {
                aVar.f();
                z10 = false;
                try {
                    return n.X.a(aVar);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return m.f7444a;
                    }
                    throw new r(e);
                }
            } catch (com.bykv.vk.openvk.preload.a.d.d e11) {
                throw new r(e11);
            } catch (IOException e12) {
                throw new com.bykv.vk.openvk.preload.a.l(e12);
            } catch (NumberFormatException e13) {
                throw new r(e13);
            }
        } catch (EOFException e14) {
            e = e14;
            z10 = true;
        }
    }

    /* compiled from: Streams.java */
    /* loaded from: classes.dex */
    public static final class a extends Writer {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f7351a;

        /* renamed from: b  reason: collision with root package name */
        private final C0065a f7352b = new C0065a();

        /* compiled from: Streams.java */
        /* renamed from: com.bykv.vk.openvk.preload.a.b.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0065a implements CharSequence {

            /* renamed from: a  reason: collision with root package name */
            char[] f7353a;

            @Override // java.lang.CharSequence
            public final char charAt(int i10) {
                return this.f7353a[i10];
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.f7353a.length;
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i10, int i11) {
                return new String(this.f7353a, i10, i11 - i10);
            }
        }

        public a(Appendable appendable) {
            this.f7351a = appendable;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i10, int i11) {
            C0065a c0065a = this.f7352b;
            c0065a.f7353a = cArr;
            this.f7351a.append(c0065a, i10, i11 + i10);
        }

        @Override // java.io.Writer
        public final void write(int i10) {
            this.f7351a.append((char) i10);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }
    }

    public static void a(com.bykv.vk.openvk.preload.a.k kVar, com.bykv.vk.openvk.preload.a.d.c cVar) {
        n.X.a(cVar, kVar);
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
