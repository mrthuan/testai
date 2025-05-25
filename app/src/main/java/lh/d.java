package lh;

/* compiled from: Arrow.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f20613a;

    /* renamed from: b  reason: collision with root package name */
    public int f20614b;
    public byte c;

    public d(byte b10, int i10, int i11) {
        this.c = b10;
        this.f20613a = i10;
        this.f20614b = i11;
    }

    public static int a(String str) {
        if (str != null && !str.equals("med")) {
            if (str.equals("sm")) {
                return 0;
            }
            if (str.equals("lg")) {
                return 2;
            }
        }
        return 1;
    }

    public static byte b(String str) {
        if (str != null && str.length() > 0) {
            if ("triangle".equalsIgnoreCase(str)) {
                return (byte) 1;
            }
            if ("arrow".equalsIgnoreCase(str)) {
                return (byte) 5;
            }
            if ("diamond".equalsIgnoreCase(str)) {
                return (byte) 3;
            }
            if ("stealth".equalsIgnoreCase(str)) {
                return (byte) 2;
            }
            if ("oval".equalsIgnoreCase(str)) {
                return (byte) 4;
            }
            return (byte) 0;
        }
        return (byte) 0;
    }
}
