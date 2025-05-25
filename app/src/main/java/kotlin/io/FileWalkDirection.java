package kotlin.io;

import xf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FileTreeWalk.kt */
/* loaded from: classes.dex */
public final class FileWalkDirection {
    public static final FileWalkDirection BOTTOM_UP;
    public static final FileWalkDirection TOP_DOWN;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ FileWalkDirection[] f19941a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ a f19942b;

    static {
        FileWalkDirection fileWalkDirection = new FileWalkDirection("TOP_DOWN", 0);
        TOP_DOWN = fileWalkDirection;
        FileWalkDirection fileWalkDirection2 = new FileWalkDirection("BOTTOM_UP", 1);
        BOTTOM_UP = fileWalkDirection2;
        FileWalkDirection[] fileWalkDirectionArr = {fileWalkDirection, fileWalkDirection2};
        f19941a = fileWalkDirectionArr;
        f19942b = kotlin.enums.a.a(fileWalkDirectionArr);
    }

    public FileWalkDirection(String str, int i10) {
    }

    public static a<FileWalkDirection> getEntries() {
        return f19942b;
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f19941a.clone();
    }
}
