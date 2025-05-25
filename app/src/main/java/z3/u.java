package z3;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import z3.o;

/* compiled from: StringLoader.java */
/* loaded from: classes.dex */
public final class u<Data> implements o<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final o<Uri, Data> f32284a;

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // z3.p
        public final o<String, AssetFileDescriptor> b(s sVar) {
            return new u(sVar.c(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // z3.p
        public final o<String, ParcelFileDescriptor> b(s sVar) {
            return new u(sVar.c(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static class c implements p<String, InputStream> {
        @Override // z3.p
        public final o<String, InputStream> b(s sVar) {
            return new u(sVar.c(Uri.class, InputStream.class));
        }
    }

    public u(o<Uri, Data> oVar) {
        this.f32284a = oVar;
    }

    @Override // z3.o
    public final /* bridge */ /* synthetic */ boolean a(String str) {
        return true;
    }

    @Override // z3.o
    public final o.a b(String str, int i10, int i11, t3.e eVar) {
        Uri uri;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else if (str2.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str2));
        } else {
            Uri parse = Uri.parse(str2);
            if (parse.getScheme() == null) {
                uri = Uri.fromFile(new File(str2));
            } else {
                uri = parse;
            }
        }
        if (uri == null) {
            return null;
        }
        o<Uri, Data> oVar = this.f32284a;
        if (!oVar.a(uri)) {
            return null;
        }
        return oVar.b(uri, i10, i11, eVar);
    }
}
