package androidx.profileinstaller;

import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: ProfileInstaller.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4170a = new a();

    /* compiled from: ProfileInstaller.java */
    /* renamed from: androidx.profileinstaller.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0021c {
        void a();

        void b(int i10, Object obj);
    }

    static {
        new b();
    }

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0138  */
    /* JADX WARN: Type inference failed for: r1v1, types: [u1.b[], byte[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [u1.b[], byte[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r17, java.util.concurrent.Executor r18, androidx.profileinstaller.c.InterfaceC0021c r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.c.b(android.content.Context, java.util.concurrent.Executor, androidx.profileinstaller.c$c, boolean):void");
    }

    /* compiled from: ProfileInstaller.java */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0021c {
        @Override // androidx.profileinstaller.c.InterfaceC0021c
        public final void a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0021c
        public final void b(int i10, Object obj) {
        }
    }

    /* compiled from: ProfileInstaller.java */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0021c {
        @Override // androidx.profileinstaller.c.InterfaceC0021c
        public final void b(int i10, Object obj) {
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Throwable th2 = (Throwable) obj;
            }
        }

        @Override // androidx.profileinstaller.c.InterfaceC0021c
        public final void a() {
        }
    }
}
