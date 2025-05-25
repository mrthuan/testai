package z3;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import z3.o;

/* compiled from: ByteArrayLoader.java */
/* loaded from: classes.dex */
public final class b<Data> implements o<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0427b<Data> f32225a;

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class a implements p<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: z3.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0426a implements InterfaceC0427b<ByteBuffer> {
            @Override // z3.b.InterfaceC0427b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // z3.b.InterfaceC0427b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // z3.p
        public final o<byte[], ByteBuffer> b(s sVar) {
            return new b(new C0426a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: z3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0427b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class d implements p<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* loaded from: classes.dex */
        public class a implements InterfaceC0427b<InputStream> {
            @Override // z3.b.InterfaceC0427b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // z3.b.InterfaceC0427b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // z3.p
        public final o<byte[], InputStream> b(s sVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0427b<Data> interfaceC0427b) {
        this.f32225a = interfaceC0427b;
    }

    @Override // z3.o
    public final /* bridge */ /* synthetic */ boolean a(byte[] bArr) {
        return true;
    }

    @Override // z3.o
    public final o.a b(byte[] bArr, int i10, int i11, t3.e eVar) {
        byte[] bArr2 = bArr;
        return new o.a(new o4.d(bArr2), new c(bArr2, this.f32225a));
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f32226a;

        /* renamed from: b  reason: collision with root package name */
        public final InterfaceC0427b<Data> f32227b;

        public c(byte[] bArr, InterfaceC0427b<Data> interfaceC0427b) {
            this.f32226a = bArr;
            this.f32227b = interfaceC0427b;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f32227b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(Priority priority, d.a<? super Data> aVar) {
            aVar.f((Data) this.f32227b.b(this.f32226a));
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
