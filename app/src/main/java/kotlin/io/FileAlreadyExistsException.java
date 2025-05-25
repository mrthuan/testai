package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.g;

/* compiled from: Exceptions.kt */
/* loaded from: classes.dex */
public final class FileAlreadyExistsException extends FileSystemException {
    public /* synthetic */ FileAlreadyExistsException(File file, File file2, String str, int i10, d dVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAlreadyExistsException(File file, File file2, String str) {
        super(file, file2, str);
        g.e(file, "file");
    }
}
