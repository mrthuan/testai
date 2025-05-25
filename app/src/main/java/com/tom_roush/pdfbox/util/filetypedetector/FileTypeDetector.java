package com.tom_roush.pdfbox.util.filetypedetector;

import com.tom_roush.pdfbox.util.Charsets;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: classes2.dex */
public final class FileTypeDetector {
    private static final ByteTrie<FileType> root;

    static {
        ByteTrie<FileType> byteTrie = new ByteTrie<>();
        root = byteTrie;
        byteTrie.setDefaultValue(FileType.UNKNOWN);
        byteTrie.addPath(FileType.JPEG, new byte[]{-1, -40});
        FileType fileType = FileType.TIFF;
        Charset charset = Charsets.ISO_8859_1;
        byteTrie.addPath(fileType, "II".getBytes(charset), new byte[]{42, 0});
        byteTrie.addPath(fileType, "MM".getBytes(charset), new byte[]{0, 42});
        byteTrie.addPath(FileType.PSD, "8BPS".getBytes(charset));
        byteTrie.addPath(FileType.PNG, new byte[]{-119, 80, 78, Field.FORMCHECKBOX, 13, 10, 26, 10, 0, 0, 0, 13, Field.TOA, Field.NOTEREF, Field.INCLUDETEXT, 82});
        byteTrie.addPath(FileType.BMP, "BM".getBytes(charset));
        FileType fileType2 = FileType.GIF;
        byteTrie.addPath(fileType2, "GIF87a".getBytes(charset));
        byteTrie.addPath(fileType2, "GIF89a".getBytes(charset));
        byteTrie.addPath(FileType.ICO, new byte[]{0, 0, 1, 0});
        FileType fileType3 = FileType.PCX;
        byteTrie.addPath(fileType3, new byte[]{10, 0, 1});
        byteTrie.addPath(fileType3, new byte[]{10, 2, 1});
        byteTrie.addPath(fileType3, new byte[]{10, 3, 1});
        byteTrie.addPath(fileType3, new byte[]{10, 5, 1});
        byteTrie.addPath(FileType.RIFF, "RIFF".getBytes(charset));
        byteTrie.addPath(FileType.CRW, "II".getBytes(charset), new byte[]{26, 0, 0, 0}, "HEAPCCDR".getBytes(charset));
        byteTrie.addPath(FileType.CR2, "II".getBytes(charset), new byte[]{42, 0, 16, 0, 0, 0, Field.INCLUDEPICTURE, 82});
        byteTrie.addPath(FileType.NEF, "MM".getBytes(charset), new byte[]{0, 42, 0, 0, 0, Byte.MIN_VALUE, 0});
        FileType fileType4 = FileType.ORF;
        byteTrie.addPath(fileType4, "IIRO".getBytes(charset), new byte[]{8, 0});
        byteTrie.addPath(fileType4, "IIRS".getBytes(charset), new byte[]{8, 0});
        byteTrie.addPath(FileType.RAF, "FUJIFILMCCD-RAW".getBytes(charset));
        byteTrie.addPath(FileType.RW2, "II".getBytes(charset), new byte[]{Field.DOCPROPERTY, 0});
    }

    private FileTypeDetector() {
    }

    public static FileType detectFileType(BufferedInputStream bufferedInputStream) {
        if (bufferedInputStream.markSupported()) {
            ByteTrie<FileType> byteTrie = root;
            int maxDepth = byteTrie.getMaxDepth();
            bufferedInputStream.mark(maxDepth);
            byte[] bArr = new byte[maxDepth];
            if (bufferedInputStream.read(bArr) != -1) {
                bufferedInputStream.reset();
                return byteTrie.find(bArr);
            }
            throw new IOException("Stream ended before file's magic number could be determined.");
        }
        throw new IOException("Stream must support mark/reset");
    }

    public static FileType detectFileType(byte[] bArr) {
        return root.find(bArr);
    }
}
