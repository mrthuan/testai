package androidx.appcompat.libconvert;

import android.content.Context;
import androidx.activity.r;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import java.io.File;

/* compiled from: MyConvertCore.java */
/* loaded from: classes.dex */
public final class c extends ConvertCore {

    /* renamed from: a  reason: collision with root package name */
    public static c f1932a;

    public static synchronized ConvertCore c(Context context) {
        c cVar;
        synchronized (c.class) {
            if (f1932a == null) {
                f1932a = new c(context);
            }
            cVar = f1932a;
        }
        return cVar;
    }

    @Override // androidx.appcompat.libconvert.ConvertCore
    public final File baseNativeLibDir() {
        String str = NativeSoLoaderHelper.f1933a;
        return new File(NativeSoLoaderHelper.c, NativeSoLoaderHelper.f1940i);
    }

    @Override // androidx.appcompat.libconvert.ConvertCore
    public final File nativeLogPath() {
        return new File(this.context.getFilesDir(), "p2wLog.txt");
    }

    @Override // androidx.appcompat.libconvert.ConvertCore
    public final File pythonDir() {
        String str = NativeSoLoaderHelper.f1933a;
        return new File(NativeSoLoaderHelper.c, r.g(new StringBuilder(), NativeSoLoaderHelper.f1939h, "/python"));
    }
}
