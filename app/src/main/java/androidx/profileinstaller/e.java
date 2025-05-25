package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: ProfileVerifier.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final z.b<c> f4173a = new z.b<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f4174b = new Object();
    public static c c = null;

    /* compiled from: ProfileVerifier.java */
    /* loaded from: classes.dex */
    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* compiled from: ProfileVerifier.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f4175a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4176b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final long f4177d;

        public b(int i10, int i11, long j10, long j11) {
            this.f4175a = i10;
            this.f4176b = i11;
            this.c = j10;
            this.f4177d = j11;
        }

        public static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public final void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f4175a);
                dataOutputStream.writeInt(this.f4176b);
                dataOutputStream.writeLong(this.c);
                dataOutputStream.writeLong(this.f4177d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f4176b == bVar.f4176b && this.c == bVar.c && this.f4175a == bVar.f4175a && this.f4177d == bVar.f4177d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f4176b), Long.valueOf(this.c), Integer.valueOf(this.f4175a), Long.valueOf(this.f4177d));
        }
    }

    /* compiled from: ProfileVerifier.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return a.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int i10, boolean z10, boolean z11) {
        c cVar = new c();
        c = cVar;
        f4173a.h(cVar);
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009c, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cb, code lost:
        r3 = 196608;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.e.c(android.content.Context, boolean):void");
    }
}
