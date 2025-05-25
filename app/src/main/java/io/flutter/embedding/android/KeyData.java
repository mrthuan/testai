package io.flutter.embedding.android;

/* loaded from: classes.dex */
public final class KeyData {

    /* renamed from: a  reason: collision with root package name */
    public long f18595a;

    /* renamed from: b  reason: collision with root package name */
    public Type f18596b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public long f18597d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18598e;

    /* renamed from: f  reason: collision with root package name */
    public String f18599f;

    /* loaded from: classes.dex */
    public enum Type {
        kDown("kDown"),
        kUp("kUp"),
        kRepeat("kRepeat");
        
        private long value;

        Type(String str) {
            this.value = r2;
        }

        public static Type fromLong(long j10) {
            int i10 = (int) j10;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return kRepeat;
                    }
                    throw new AssertionError("Unexpected Type value");
                }
                return kUp;
            }
            return kDown;
        }

        public long getValue() {
            return this.value;
        }
    }
}
