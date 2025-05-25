package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Un  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC1183Un extends AsyncTask<String, Void, Bitmap[]> implements InterfaceC06097e {
    public static byte[] A0A;
    public static String[] A0B = {"", "", "tk2ciTRcvMIsX7PNNAsbqXfz4cjsZNd3", "5z01THRYCfHu8Ay0wH5meUoLhFHMZyns", "VYXg8wObxMc7BeMRrzz5UEer", "1KBjMNFbEleLBxdQS2J3kw1LUfJ9GnIf", "PvEnCL5gthOso5MBRjJGXOGrZMhqPY73", "dw8jODS3DySi5ymezTFU6bMU1A3tjNXQ"};
    public int A00;
    public int A01;
    public O7 A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final WeakReference<O5> A06;
    public final WeakReference<C1314Zs> A07;
    public final WeakReference<ImageView> A08;
    public final WeakReference<ViewGroup> A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{Field.DDE, Field.GLOSSARY, 36, Field.GLOSSARY, 56, Field.QUOTE, 41};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final Bitmap[] A03(String... strArr) {
        if (KQ.A02(this)) {
            return null;
        }
        if (A0B[2].charAt(8) != 'z') {
            A0B[2] = "Jzd8uX0XYQJZtrGuhrAJ2cBOXObB1Sdn";
            try {
                String str = strArr[0];
                Bitmap bitmap = null;
                C1314Zs c1314Zs = this.A07.get();
                String[] strArr2 = A0B;
                if (strArr2[6].charAt(7) != strArr2[5].charAt(7)) {
                    A0B[2] = "bv0UYUwFwYp94NQ105UqaFrunwxSHAuK";
                    if (c1314Zs == null) {
                        return new Bitmap[]{null, null};
                    }
                    Bitmap A0N = new C05906f(c1314Zs).A0N(str, this.A00, this.A01);
                    if (A0N != null && !this.A03) {
                        bitmap = MA.A01(c1314Zs, A0N, this.A04, this.A05);
                    }
                    return new Bitmap[]{A0N, bitmap};
                }
                throw new RuntimeException();
            } catch (Throwable th2) {
                KQ.A00(th2, this);
                String[] strArr3 = A0B;
                if (strArr3[7].charAt(9) != strArr3[3].charAt(9)) {
                    A0B[2] = "caPrFgLZt2WaPlUZLvOtKYt7S4BN2jGU";
                    return null;
                }
                return null;
            }
        }
        throw new RuntimeException();
    }

    static {
        A01();
    }

    public AsyncTaskC1183Un(ViewGroup viewGroup, int i10, int i11, C1314Zs c1314Zs) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1314Zs);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new WeakReference<>(viewGroup);
        this.A04 = i10;
        this.A05 = i11;
    }

    public AsyncTaskC1183Un(ViewGroup viewGroup, C1314Zs c1314Zs) {
        this(viewGroup, 12, 16, c1314Zs);
    }

    public AsyncTaskC1183Un(ImageView imageView, C1314Zs c1314Zs) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1314Zs);
        this.A06 = null;
        this.A08 = new WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public AsyncTaskC1183Un(O5 o52, C1314Zs c1314Zs) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1314Zs);
        this.A06 = new WeakReference<>(o52);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(Bitmap[] result) {
        O5 o52;
        if (KQ.A02(this)) {
            return;
        }
        try {
            if (this.A08 != null) {
                ImageView imageView = this.A08.get();
                if (result[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(result[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(result[0]);
                }
            }
            if (this.A06 != null && (o52 = this.A06.get()) != null) {
                o52.setImage(result[0], result[1]);
            }
            if (this.A09 != null && this.A09.get() != null && result[1] != null) {
                M3.A0S(this.A09.get(), new BitmapDrawable(this.A07.get().getResources(), result[1]));
            }
            if (this.A02 != null) {
                this.A02.AC8(result[0] != null);
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }

    public final AsyncTaskC1183Un A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final AsyncTaskC1183Un A05(int i10, int i11) {
        this.A00 = i10;
        this.A01 = i11;
        return this;
    }

    public final AsyncTaskC1183Un A06(O7 o72) {
        this.A02 = o72;
        return this;
    }

    public final void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.A02 != null) {
                this.A02.AC8(false);
                return;
            }
            return;
        }
        executeOnExecutor(M8.A06, str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06097e
    public final C1314Zs A6G() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap[] doInBackground(String[] strArr) {
        if (KQ.A02(this)) {
            return null;
        }
        try {
            return A03(strArr);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            A02(bitmapArr);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
