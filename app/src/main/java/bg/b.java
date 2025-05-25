package bg;

import bg.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.FileWalkDirection;
import kotlin.io.NoSuchFileException;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import o9.d;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public class b extends t0 {
    public static final String A0(File file) {
        g.e(file, "<this>");
        String name = file.getName();
        g.d(name, "name");
        return k.k0(name, "");
    }

    public static final String B0(File file) {
        g.e(file, "<this>");
        String name = file.getName();
        g.d(name, "name");
        return k.m0(name, ".");
    }

    public static final void y0(File file, File target, boolean z10, int i10) {
        g.e(file, "<this>");
        g.e(target, "target");
        if (file.exists()) {
            if (target.exists()) {
                if (z10) {
                    if (!target.delete()) {
                        throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
                    }
                } else {
                    throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
                }
            }
            if (file.isDirectory()) {
                if (!target.mkdirs()) {
                    throw new FileSystemException(file, target, "Failed to create target directory.");
                }
                return;
            }
            File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(target);
                ea.a.m(fileInputStream, fileOutputStream, i10);
                d.l(fileOutputStream, null);
                d.l(fileInputStream, null);
                return;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    d.l(fileInputStream, th2);
                    throw th3;
                }
            }
        }
        throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
    }

    public static final boolean z0(File file) {
        g.e(file, "<this>");
        FileWalkDirection direction = FileWalkDirection.BOTTOM_UP;
        g.e(direction, "direction");
        a.b bVar = new a.b();
        while (true) {
            boolean z10 = true;
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (next.delete() || !next.exists()) {
                    if (z10) {
                        break;
                    }
                }
                z10 = false;
            }
            return z10;
        }
    }
}
