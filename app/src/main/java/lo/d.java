package lo;

import android.content.Context;
import bg.a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: ThumbnailUtil.kt */
/* loaded from: classes3.dex */
public final class d {
    public static final void a(String str) {
        if (str == null) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            FileWalkDirection direction = FileWalkDirection.BOTTOM_UP;
            g.e(direction, "direction");
            a.b bVar = new a.b();
            while (true) {
                boolean z10 = true;
                while (bVar.hasNext()) {
                    File next = bVar.next();
                    if (next.isFile()) {
                        if (next.delete() || !next.exists()) {
                            if (z10) {
                                break;
                            }
                        }
                        z10 = false;
                    }
                }
                return;
            }
        }
    }

    public static final void b(String str) {
        if (str == null) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            bg.b.z0(file);
        }
    }

    public static final void c(int i10, String parentPath) {
        g.e(parentPath, "parentPath");
        File file = new File(parentPath, i10 + ".png");
        if (file.exists()) {
            file.delete();
        }
    }

    public static final boolean d(int i10, String parentPath) {
        g.e(parentPath, "parentPath");
        File file = new File(parentPath, i10 + ".png");
        File file2 = new File(parentPath, i10 + "_writing.png");
        if (!file.exists() && !file2.exists()) {
            return false;
        }
        return true;
    }

    public static final String e(Context context, String fileName) {
        g.e(context, "context");
        g.e(fileName, "fileName");
        ConcurrentHashMap<String, File> concurrentHashMap = v.f28781a;
        String B = v.B(context, ea.a.p("Z2g-bRFuA2ls", "5uvjxY9Z"));
        String str = System.currentTimeMillis() + "_" + fileName;
        try {
            Charset charset = kotlin.text.a.f19966b;
            byte[] bytes = str.getBytes(charset);
            g.d(bytes, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtneC4DZTZCS3QqcxljEWFFcz90KQ==", "WC6ZQdB2"));
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            if (ea.a.w(byteArrayInputStream).length >= 255) {
                byte[] bArr = new byte[254];
                byteArrayInputStream.read(bArr);
                String str2 = new String(bArr, charset);
                o9.d.l(byteArrayInputStream, null);
                str = str2;
            } else {
                o9.d.l(byteArrayInputStream, null);
            }
        } catch (Error unused) {
            str = String.valueOf(System.currentTimeMillis());
        }
        File file = new File(B, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath = file.getAbsolutePath();
        g.d(absolutePath, ea.a.p("OGE3ZT90MW8kZANyGmE1c1dsJ3QsUFd0aA==", "zwHEQw7z"));
        return absolutePath;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(java.lang.String r5, android.graphics.Bitmap r6, int r7) {
        /*
            java.lang.String r0 = "parentPath"
            kotlin.jvm.internal.g.e(r5, r0)
            java.lang.String r0 = "bitmap"
            kotlin.jvm.internal.g.e(r6, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto Lc0
            boolean r0 = r6.isRecycled()
            if (r0 == 0) goto L18
            goto Lc0
        L18:
            android.os.StatFs r0 = new android.os.StatFs     // Catch: java.lang.Error -> L33
            r0.<init>(r5)     // Catch: java.lang.Error -> L33
            long r1 = r0.getBlockSizeLong()     // Catch: java.lang.Error -> L33
            long r3 = r0.getAvailableBlocksLong()     // Catch: java.lang.Error -> L33
            long r3 = r3 * r1
            float r0 = (float) r3
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r1
            float r0 = r0 / r1
            r1 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L33
            goto Lc0
        L33:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r2 = ".png"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r5, r1)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r7 = "_writing.png"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r1.<init>(r5, r7)
            boolean r5 = r1.exists()
            if (r5 == 0) goto L66
            goto Lc0
        L66:
            boolean r5 = r0.exists()
            if (r5 == 0) goto L6d
            goto Lc0
        L6d:
            r5 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            r2 = 100
            r6.compress(r5, r2, r7)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            r7.flush()     // Catch: java.io.IOException -> L81
            r7.close()     // Catch: java.io.IOException -> L81
            goto L9f
        L81:
            r5 = move-exception
            r5.printStackTrace()
            goto L9f
        L86:
            r5 = move-exception
            goto La8
        L88:
            r5 = move-exception
            goto L8f
        L8a:
            r6 = move-exception
            goto Laa
        L8c:
            r6 = move-exception
            r7 = r5
            r5 = r6
        L8f:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L86
            if (r7 == 0) goto L9f
            r7.flush()     // Catch: java.io.IOException -> L9b
            r7.close()     // Catch: java.io.IOException -> L9b
            goto L9f
        L9b:
            r5 = move-exception
            r5.printStackTrace()
        L9f:
            r1.renameTo(r0)     // Catch: java.lang.Exception -> La3
            goto Lc0
        La3:
            r5 = move-exception
            r5.printStackTrace()
            goto Lc0
        La8:
            r6 = r5
            r5 = r7
        Laa:
            if (r5 == 0) goto Lb7
            r5.flush()     // Catch: java.io.IOException -> Lb3
            r5.close()     // Catch: java.io.IOException -> Lb3
            goto Lb7
        Lb3:
            r5 = move-exception
            r5.printStackTrace()
        Lb7:
            r1.renameTo(r0)     // Catch: java.lang.Exception -> Lbb
            goto Lbf
        Lbb:
            r5 = move-exception
            r5.printStackTrace()
        Lbf:
            throw r6
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lo.d.f(java.lang.String, android.graphics.Bitmap, int):void");
    }
}
