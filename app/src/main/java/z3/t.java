package z3;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import z3.o;

/* compiled from: ResourceLoader.java */
/* loaded from: classes.dex */
public final class t<Data> implements o<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final o<Uri, Data> f32278a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f32279b;

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f32280a;

        public a(Resources resources) {
            this.f32280a = resources;
        }

        @Override // z3.p
        public final o<Integer, AssetFileDescriptor> b(s sVar) {
            return new t(this.f32280a, sVar.c(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class b implements p<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f32281a;

        public b(Resources resources) {
            this.f32281a = resources;
        }

        @Override // z3.p
        public final o<Integer, ParcelFileDescriptor> b(s sVar) {
            return new t(this.f32281a, sVar.c(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class c implements p<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f32282a;

        public c(Resources resources) {
            this.f32282a = resources;
        }

        @Override // z3.p
        public final o<Integer, InputStream> b(s sVar) {
            return new t(this.f32282a, sVar.c(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class d implements p<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f32283a;

        public d(Resources resources) {
            this.f32283a = resources;
        }

        @Override // z3.p
        public final o<Integer, Uri> b(s sVar) {
            return new t(this.f32283a, v.f32285a);
        }
    }

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f32279b = resources;
        this.f32278a = oVar;
    }

    @Override // z3.o
    public final /* bridge */ /* synthetic */ boolean a(Integer num) {
        return true;
    }

    @Override // z3.o
    public final o.a b(Integer num, int i10, int i11, t3.e eVar) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.f32279b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + PackagingURIHelper.FORWARD_SLASH_CHAR + resources.getResourceTypeName(num2.intValue()) + PackagingURIHelper.FORWARD_SLASH_CHAR + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException unused) {
            Log.isLoggable("ResourceLoader", 5);
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f32278a.b(uri, i10, i11, eVar);
    }
}
