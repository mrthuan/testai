package z3;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import z3.o;

/* compiled from: ByteBufferFileLoader.java */
/* loaded from: classes.dex */
public final class d implements o<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: classes.dex */
    public static class b implements p<File, ByteBuffer> {
        @Override // z3.p
        public final o<File, ByteBuffer> b(s sVar) {
            return new d();
        }
    }

    @Override // z3.o
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // z3.o
    public final o.a<ByteBuffer> b(File file, int i10, int i11, t3.e eVar) {
        File file2 = file;
        return new o.a<>(new o4.d(file2), new a(file2));
    }

    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: a  reason: collision with root package name */
        public final File f32229a;

        public a(File file) {
            this.f32229a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(Priority priority, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(p4.a.a(this.f32229a));
            } catch (IOException e10) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
