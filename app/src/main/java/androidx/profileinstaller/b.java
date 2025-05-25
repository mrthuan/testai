package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: DeviceProfileWriter.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f4163a;

    /* renamed from: b  reason: collision with root package name */
    public final c.InterfaceC0021c f4164b;
    public final byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public final File f4165d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4166e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4167f = false;

    /* renamed from: g  reason: collision with root package name */
    public u1.b[] f4168g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f4169h;

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0021c interfaceC0021c, String str, File file) {
        byte[] bArr;
        this.f4163a = executor;
        this.f4164b = interfaceC0021c;
        this.f4166e = str;
        this.f4165d = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24 && i10 <= 33) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = u1.f.f30138e;
                    break;
                case 26:
                    bArr = u1.f.f30137d;
                    break;
                case 27:
                    bArr = u1.f.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = u1.f.f30136b;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = u1.f.f30135a;
                    break;
            }
            this.c = bArr;
        }
        bArr = null;
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f4164b.a();
            }
            return null;
        }
    }

    public final void b(int i10, Serializable serializable) {
        this.f4163a.execute(new u1.a(this, i10, serializable, 0));
    }
}
