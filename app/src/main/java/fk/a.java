package fk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import kk.n;
import kk.o;
import kk.q;
import kk.z;
import kotlin.jvm.internal.g;

/* compiled from: FileSystem.kt */
/* loaded from: classes3.dex */
public final class a implements b {
    @Override // fk.b
    public final n a(File file) {
        g.e(file, "file");
        Logger logger = o.f19839a;
        return new n(new FileInputStream(file), z.f19858d);
    }

    @Override // fk.b
    public final q b(File file) {
        g.e(file, "file");
        try {
            Logger logger = o.f19839a;
            return new q(new FileOutputStream(file, false), new z());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = o.f19839a;
            return new q(new FileOutputStream(file, false), new z());
        }
    }

    @Override // fk.b
    public final void c(File directory) {
        g.e(directory, "directory");
        File[] listFiles = directory.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i10 = 0;
            while (i10 < length) {
                File file = listFiles[i10];
                i10++;
                if (file.isDirectory()) {
                    c(file);
                }
                if (!file.delete()) {
                    throw new IOException(g.h(file, "failed to delete "));
                }
            }
            return;
        }
        throw new IOException(g.h(directory, "not a readable directory: "));
    }

    @Override // fk.b
    public final boolean d(File file) {
        g.e(file, "file");
        return file.exists();
    }

    @Override // fk.b
    public final void e(File from, File to2) {
        g.e(from, "from");
        g.e(to2, "to");
        f(to2);
        if (from.renameTo(to2)) {
            return;
        }
        throw new IOException("failed to rename " + from + " to " + to2);
    }

    @Override // fk.b
    public final void f(File file) {
        g.e(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException(g.h(file, "failed to delete "));
        }
    }

    @Override // fk.b
    public final q g(File file) {
        g.e(file, "file");
        try {
            Logger logger = o.f19839a;
            return new q(new FileOutputStream(file, true), new z());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = o.f19839a;
            return new q(new FileOutputStream(file, true), new z());
        }
    }

    @Override // fk.b
    public final long h(File file) {
        g.e(file, "file");
        return file.length();
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
