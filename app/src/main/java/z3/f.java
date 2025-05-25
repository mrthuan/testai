package z3;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import z3.o;

/* compiled from: FileLoader.java */
/* loaded from: classes.dex */
public final class f<Data> implements o<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final d<Data> f32234a;

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> implements p<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d<Data> f32235a;

        public a(d<Data> dVar) {
            this.f32235a = dVar;
        }

        @Override // z3.p
        public final o<File, Data> b(s sVar) {
            return new f(this.f32235a);
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        /* loaded from: classes.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // z3.f.d
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // z3.f.d
            public final ParcelFileDescriptor b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // z3.f.d
            public final void c(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        Data b(File file);

        void c(Data data);
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        /* loaded from: classes.dex */
        public class a implements d<InputStream> {
            @Override // z3.f.d
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // z3.f.d
            public final InputStream b(File file) {
                return new FileInputStream(file);
            }

            @Override // z3.f.d
            public final void c(InputStream inputStream) {
                inputStream.close();
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.f32234a = dVar;
    }

    @Override // z3.o
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // z3.o
    public final o.a b(File file, int i10, int i11, t3.e eVar) {
        File file2 = file;
        return new o.a(new o4.d(file2), new c(file2, this.f32234a));
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final File f32236a;

        /* renamed from: b  reason: collision with root package name */
        public final d<Data> f32237b;
        public Data c;

        public c(File file, d<Data> dVar) {
            this.f32236a = file;
            this.f32237b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f32237b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            Data data = this.c;
            if (data != null) {
                try {
                    this.f32237b.c(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final DataSource d() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public final void e(Priority priority, d.a<? super Data> aVar) {
            try {
                Data b10 = this.f32237b.b(this.f32236a);
                this.c = b10;
                aVar.f(b10);
            } catch (FileNotFoundException e10) {
                Log.isLoggable("FileLoader", 3);
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
