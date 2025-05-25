package w3;

/* compiled from: IntegerArrayAdapter.java */
/* loaded from: classes.dex */
public final class g implements a<int[]> {
    @Override // w3.a
    public final int a() {
        return 4;
    }

    @Override // w3.a
    public final String b() {
        return "IntegerArrayPool";
    }

    @Override // w3.a
    public final int c(int[] iArr) {
        return iArr.length;
    }

    @Override // w3.a
    public final int[] newArray(int i10) {
        return new int[i10];
    }
}
