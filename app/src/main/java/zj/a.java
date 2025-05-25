package zj;

import bb.g;
import bb.l;
import com.google.android.play.core.assetpacks.c;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: FileUtils.java */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: FileUtils.java */
    /* renamed from: zj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0431a implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32396a;

        public C0431a(String str) {
            this.f32396a = str;
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(this.f32396a + ".");
        }
    }

    public static void a(byte b10, int i10, HashSet hashSet, PosixFilePermission posixFilePermission) {
        if (c.K(b10, i10)) {
            hashSet.add(posixFilePermission);
        }
    }

    public static File[] b(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf != -1) {
            name = name.substring(0, lastIndexOf);
        }
        File[] listFiles = file.getParentFile().listFiles(new C0431a(name));
        if (listFiles == null) {
            return new File[0];
        }
        Arrays.sort(listFiles);
        return listFiles;
    }

    public static void c(Path path, byte[] bArr) {
        PosixFilePermission posixFilePermission;
        PosixFilePermission posixFilePermission2;
        PosixFilePermission posixFilePermission3;
        PosixFilePermission posixFilePermission4;
        PosixFilePermission posixFilePermission5;
        PosixFilePermission posixFilePermission6;
        PosixFilePermission posixFilePermission7;
        PosixFilePermission posixFilePermission8;
        PosixFilePermission posixFilePermission9;
        LinkOption linkOption;
        FileAttributeView fileAttributeView;
        if (bArr != null && bArr.length != 0) {
            try {
                if (System.getProperty("os.name").toLowerCase().contains("win")) {
                    if (bArr[0] != 0) {
                        Class f10 = l.f();
                        linkOption = LinkOption.NOFOLLOW_LINKS;
                        fileAttributeView = Files.getFileAttributeView(path, f10, linkOption);
                        DosFileAttributeView g10 = g.g(fileAttributeView);
                        if (g10 != null) {
                            g10.setReadOnly(c.K(bArr[0], 0));
                            g10.setHidden(c.K(bArr[0], 1));
                            g10.setSystem(c.K(bArr[0], 2));
                            g10.setArchive(c.K(bArr[0], 5));
                        }
                    }
                } else if (System.getProperty("os.name").toLowerCase().contains("mac") || System.getProperty("os.name").toLowerCase().contains("nux")) {
                    if (bArr[2] != 0 || bArr[3] != 0) {
                        HashSet hashSet = new HashSet();
                        byte b10 = bArr[3];
                        posixFilePermission = PosixFilePermission.OWNER_READ;
                        a(b10, 0, hashSet, posixFilePermission);
                        byte b11 = bArr[2];
                        posixFilePermission2 = PosixFilePermission.OWNER_WRITE;
                        a(b11, 7, hashSet, posixFilePermission2);
                        byte b12 = bArr[2];
                        posixFilePermission3 = PosixFilePermission.OWNER_EXECUTE;
                        a(b12, 6, hashSet, posixFilePermission3);
                        byte b13 = bArr[2];
                        posixFilePermission4 = PosixFilePermission.GROUP_READ;
                        a(b13, 5, hashSet, posixFilePermission4);
                        byte b14 = bArr[2];
                        posixFilePermission5 = PosixFilePermission.GROUP_WRITE;
                        a(b14, 4, hashSet, posixFilePermission5);
                        byte b15 = bArr[2];
                        posixFilePermission6 = PosixFilePermission.GROUP_EXECUTE;
                        a(b15, 3, hashSet, posixFilePermission6);
                        byte b16 = bArr[2];
                        posixFilePermission7 = PosixFilePermission.OTHERS_READ;
                        a(b16, 2, hashSet, posixFilePermission7);
                        byte b17 = bArr[2];
                        posixFilePermission8 = PosixFilePermission.OTHERS_WRITE;
                        a(b17, 1, hashSet, posixFilePermission8);
                        byte b18 = bArr[2];
                        posixFilePermission9 = PosixFilePermission.OTHERS_EXECUTE;
                        a(b18, 0, hashSet, posixFilePermission9);
                        Files.setPosixFilePermissions(path, hashSet);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }
}
