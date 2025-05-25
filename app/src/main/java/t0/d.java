package t0;

import java.util.Comparator;
import oa.b0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29875a;

    public /* synthetic */ d(int i10) {
        this.f29875a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f29875a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b10 = bArr[i10];
                    byte b11 = bArr2[i10];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            default:
                return ((b0.c) obj).a().compareTo(((b0.c) obj2).a());
        }
    }
}
