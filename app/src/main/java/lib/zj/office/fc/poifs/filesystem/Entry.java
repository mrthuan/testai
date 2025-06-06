package lib.zj.office.fc.poifs.filesystem;

/* loaded from: classes3.dex */
public interface Entry {
    boolean delete();

    String getName();

    DirectoryEntry getParent();

    boolean isDirectoryEntry();

    boolean isDocumentEntry();

    boolean renameTo(String str);
}
