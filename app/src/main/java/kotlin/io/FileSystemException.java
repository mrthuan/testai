package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.d;

/* compiled from: Exceptions.kt */
/* loaded from: classes.dex */
public class FileSystemException extends IOException {
    private final File file;
    private final File other;
    private final String reason;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FileSystemException(java.io.File r4, java.io.File r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g.e(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            if (r5 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " -> "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L21:
            if (r6 == 0) goto L2c
            java.lang.String r1 = ": "
            java.lang.String r1 = r1.concat(r6)
            r0.append(r1)
        L2c:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "sb.toString()"
            kotlin.jvm.internal.g.d(r0, r1)
            r3.<init>(r0)
            r3.file = r4
            r3.other = r5
            r3.reason = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileSystemException.<init>(java.io.File, java.io.File, java.lang.String):void");
    }

    public final File getFile() {
        return this.file;
    }

    public final File getOther() {
        return this.other;
    }

    public final String getReason() {
        return this.reason;
    }

    public /* synthetic */ FileSystemException(File file, File file2, String str, int i10, d dVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }
}
