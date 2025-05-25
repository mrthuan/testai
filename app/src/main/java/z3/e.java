package z3;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import z3.o;

/* compiled from: DataUrlLoader.java */
/* loaded from: classes.dex */
public final class e<Model, Data> implements o<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Data> f32230a;

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public interface a<Data> {
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public static final class c<Model> implements p<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final a f32233a = new a();

        /* compiled from: DataUrlLoader.java */
        /* loaded from: classes.dex */
        public class a implements a<InputStream> {
            public final ByteArrayInputStream a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // z3.p
        public final o<Model, InputStream> b(s sVar) {
            return new e(this.f32233a);
        }
    }

    public e(c.a aVar) {
        this.f32230a = aVar;
    }

    @Override // z3.o
    public final boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // z3.o
    public final o.a<Data> b(Model model, int i10, int i11, t3.e eVar) {
        return new o.a<>(new o4.d(model), new b(model.toString(), this.f32230a));
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final String f32231a;

        /* renamed from: b  reason: collision with root package name */
        public final a<Data> f32232b;
        public ByteArrayInputStream c;

        public b(String str, a<Data> aVar) {
            this.f32231a = str;
            this.f32232b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            this.f32232b.getClass();
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            try {
                a<Data> aVar = this.f32232b;
                ByteArrayInputStream byteArrayInputStream = this.c;
                ((c.a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(Priority priority, d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream a10 = ((c.a) this.f32232b).a(this.f32231a);
                this.c = a10;
                aVar.f(a10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
