package pdf.pdfreader.viewer.editor.free.widget.ticker;

import java.util.HashMap;
import pdf.pdfreader.viewer.editor.free.widget.ticker.TickerView;

/* compiled from: TickerCharacterList.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f28902a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f28903b;
    public final HashMap c;

    /* compiled from: TickerCharacterList.java */
    /* renamed from: pdf.pdfreader.viewer.editor.free.widget.ticker.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C0359a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28904a;

        static {
            int[] iArr = new int[TickerView.ScrollingDirection.values().length];
            f28904a = iArr;
            try {
                iArr[TickerView.ScrollingDirection.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28904a[TickerView.ScrollingDirection.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28904a[TickerView.ScrollingDirection.ANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: TickerCharacterList.java */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f28905a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28906b;

        public b(int i10, int i11) {
            this.f28905a = i10;
            this.f28906b = i11;
        }
    }

    public a(String str) {
        int i10 = 0;
        if (!str.contains(Character.toString((char) 0))) {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            this.f28902a = length;
            this.c = new HashMap(length);
            for (int i11 = 0; i11 < length; i11++) {
                this.c.put(Character.valueOf(charArray[i11]), Integer.valueOf(i11));
            }
            char[] cArr = new char[(length * 2) + 1];
            this.f28903b = cArr;
            cArr[0] = 0;
            while (i10 < length) {
                char[] cArr2 = this.f28903b;
                int i12 = i10 + 1;
                cArr2[i12] = charArray[i10];
                cArr2[length + 1 + i10] = charArray[i10];
                i10 = i12;
            }
            return;
        }
        throw new IllegalArgumentException(ea.a.p("am8-IBBhDG4ddBRpB2M6dSBlElQvYyhlOlUdaS5zfkV-UB9ZLEMqQSAgXW5JdD5lZGNaYTRhIHQtcklsK3MkLg==", "HiBPSEui"));
    }

    public final int a(char c) {
        if (c == 0) {
            return 0;
        }
        HashMap hashMap = this.c;
        if (hashMap.containsKey(Character.valueOf(c))) {
            return ((Integer) hashMap.get(Character.valueOf(c))).intValue() + 1;
        }
        return -1;
    }
}
