package f4;

import com.google.android.play.core.assetpacks.c;
import java.io.File;
import v3.l;

/* compiled from: FileResource.java */
/* loaded from: classes.dex */
public final class b implements l<File> {

    /* renamed from: a  reason: collision with root package name */
    public final File f17096a;

    public b(File file) {
        c.l(file);
        this.f17096a = file;
    }

    @Override // v3.l
    public final Class<File> c() {
        return this.f17096a.getClass();
    }

    @Override // v3.l
    public final File get() {
        return this.f17096a;
    }

    @Override // v3.l
    public final /* bridge */ /* synthetic */ int getSize() {
        return 1;
    }

    @Override // v3.l
    public final /* bridge */ /* synthetic */ void a() {
    }
}
