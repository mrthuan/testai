package pdf.pdfreader.viewer.editor.free.ui.act;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import industries.deepthought.decode.Decoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ui.adapter.o;
import pdf.pdfreader.viewer.editor.free.utils.z;

/* compiled from: ReaderFeedbackActivity.kt */
/* loaded from: classes3.dex */
public class ReaderFeedbackActivity extends e {
    public static final /* synthetic */ int F = 0;
    public final tf.c A;
    public pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f B;
    public final androidx.activity.result.c<String> C;
    public boolean D;
    public ObjectAnimator E;

    /* renamed from: v  reason: collision with root package name */
    public final int f26631v = 4;

    /* renamed from: w  reason: collision with root package name */
    public TextView f26632w;

    /* renamed from: x  reason: collision with root package name */
    public String f26633x;

    /* renamed from: y  reason: collision with root package name */
    public EditText f26634y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f26635z;

    /* compiled from: ReaderFeedbackActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a implements o.a {
        public a() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.o.a
        public final void a() {
            int i10 = ReaderFeedbackActivity.F;
            ReaderFeedbackActivity readerFeedbackActivity = ReaderFeedbackActivity.this;
            Object obj = readerFeedbackActivity.G1()[0];
            kotlin.jvm.internal.g.c(obj, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuOW53bi1sAiBHeTtlU2sNdB5pWi4gbnQ=", "VZXn392S"));
            if (((Integer) obj).intValue() > 0) {
                TextView textView = readerFeedbackActivity.f26632w;
                if (textView != null) {
                    textView.setVisibility(8);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("O3ZmYQtuXm5n", "U2TlKYdz"));
                    throw null;
                }
            }
        }
    }

    public ReaderFeedbackActivity() {
        ea.a.p("N2UbdDJlUWQqYQVrdWMjaU5pJnk=", "9Zcht4yE");
        this.f26633x = "";
        this.A = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.utils.z>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderFeedbackActivity$keyboardUtils$2
            @Override // cg.a
            public final pdf.pdfreader.viewer.editor.free.utils.z invoke() {
                return new pdf.pdfreader.viewer.editor.free.utils.z();
            }
        });
        androidx.activity.result.c<String> registerForActivityResult = registerForActivityResult(new j.c(), new b(this, 1));
        kotlin.jvm.internal.g.d(registerForActivityResult, ea.a.p("M2UBaQt0FnIObxRBV3Q-dlF0K1Isc0NsloDXfVsgYiBhIEYgWCBTIGh9bCAUIHcgGCByfQ==", "OqAfxs71"));
        this.C = registerForActivityResult;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.e
    public final void B1() {
        this.f26633x = getIntent().getStringExtra(ea.a.p("O2Fn", "KBNKJxlU"));
        if (kotlin.jvm.internal.g.a(ea.a.p("LGxQaW0=", "DutZeWVG"), this.f26633x)) {
            this.f26914i = new pn.a[]{new pn.a(getString(R.string.arg_res_0x7f1300a8), y1(0)), new pn.a(getString(R.string.arg_res_0x7f130141), y1(1)), new pn.a(getString(R.string.arg_res_0x7f13047e), y1(2)), new pn.a(getString(R.string.arg_res_0x7f1302cd), y1(3)), new pn.a(getString(R.string.arg_res_0x7f13047f), y1(4))};
        } else {
            this.f26914i = new pn.a[]{new pn.a(getString(R.string.arg_res_0x7f13031b), y1(0)), new pn.a(getString(R.string.arg_res_0x7f130141), y1(1)), new pn.a(getString(R.string.arg_res_0x7f13047e), y1(2)), new pn.a(getString(R.string.arg_res_0x7f1303d7), y1(3)), new pn.a(getString(R.string.arg_res_0x7f13047f), y1(4))};
        }
        this.f26917l = this.f26631v;
        this.f26916k = ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpGG8aLgRyP2VhZlhsHHBFbyxpLmVy", "MFEGlhbZ");
        this.f26918m = 0.98f;
        this.f26919n = false;
        this.f26915j = new a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:28|(3:30|(4:33|(5:38|39|(1:41)|42|43)|44|31)|47)|48|(1:50)|(2:51|52)|(3:54|(1:56)(1:194)|(49:58|59|60|(7:178|179|180|181|182|(1:184)(1:187)|185)|62|(1:64)|65|66|67|68|69|70|71|72|73|74|(1:78)|79|80|81|82|(1:84)|85|(1:87)|88|89|90|91|92|93|(2:96|94)|97|98|(1:100)|101|4a7|109|110|111|112|(8:114|(1:116)(6:125|126|127|(2:129|(1:131))|132|(0))|117|118|(2:121|119)|122|123|124)|136|(0)(0)|117|118|(1:119)|122|123|124))|195|60|(0)|62|(0)|65|66|67|68|69|70|71|72|73|74|(2:76|78)|79|80|81|82|(0)|85|(0)|88|89|90|91|92|93|(1:94)|97|98|(0)|101|4a7) */
    /* JADX WARN: Can't wrap try/catch for region: R(42:28|(3:30|(4:33|(5:38|39|(1:41)|42|43)|44|31)|47)|48|(1:50)|51|52|(3:54|(1:56)(1:194)|(49:58|59|60|(7:178|179|180|181|182|(1:184)(1:187)|185)|62|(1:64)|65|66|67|68|69|70|71|72|73|74|(1:78)|79|80|81|82|(1:84)|85|(1:87)|88|89|90|91|92|93|(2:96|94)|97|98|(1:100)|101|4a7|109|110|111|112|(8:114|(1:116)(6:125|126|127|(2:129|(1:131))|132|(0))|117|118|(2:121|119)|122|123|124)|136|(0)(0)|117|118|(1:119)|122|123|124))|195|60|(0)|62|(0)|65|66|67|68|69|70|71|72|73|74|(2:76|78)|79|80|81|82|(0)|85|(0)|88|89|90|91|92|93|(1:94)|97|98|(0)|101|4a7) */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x051c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x051e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x051f, code lost:
        pdf.pdfreader.viewer.editor.free.utils.t1.b("sendFeedback: " + r0.getMessage());
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0539, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x053a, code lost:
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x053c, code lost:
        pdf.pdfreader.viewer.editor.free.utils.t1.c(ea.a.p("QGUlZDVlB2QQYVdrUyA=", "zEHqxR0t"), r0);
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x054b, code lost:
        r0 = new android.content.Intent(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhBFIERvTQVMHUljTEU=", "n0PILogQ"));
        r0.setType(ea.a.p("UnA7bBpjA3Qbb1ovBmMiZTAtQXQ0ZSJt", "XyxZpSgD"));
        r0.putExtra(ea.a.p("Lm5VchZpUy4zbj5lG3RGZU10HGFrRShBGEw=", "MncwQvtk"), new java.lang.String[]{ea.a.p("Q2QtchZhBmUAYURwD2UzZCZhUWsGZy5hH2xmYzlt", "vHV0TTKl")});
        r0.putExtra(ea.a.p("Lm5VchZpUy4zbj5lG3RGZU10HGFrUzBCP0UtVA==", "V2deunsO"), r2);
        r0.putExtra(ea.a.p(r7, "OacPjnmW"), r12.toString());
        r2 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x059d, code lost:
        if (r2.hasNext() != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x059f, code lost:
        r11.add((android.net.Uri) r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x05a9, code lost:
        r0.addFlags(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x05b1, code lost:
        if (r11.size() > 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x05b3, code lost:
        r0.putParcelableArrayListExtra(ea.a.p("EW4PclZpMi4hbhJlWnR5ZUB0IGFnU2JSMUFN", "Vwpk9Vep"), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x05be, code lost:
        r0.addFlags(268435456);
        r0.addFlags(lib.zj.office.fc.hpsf.Variant.VT_RESERVED);
        startActivity(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x05c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x05c9, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0351, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0353, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0354, code lost:
        r19 = "LG9cLh5vWGc2ZWRhG2Qab1xkQGdt";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0357, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0358, code lost:
        r19 = "LG9cLh5vWGc2ZWRhG2Qab1xkQGdt";
        r16 = "_";
        r18 = "Um4vchxpBi4bbkBlB3R4ZTx0QGFoVAZYVA==";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x035e, code lost:
        r0.printStackTrace();
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03d8, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03dd, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0484 A[Catch: Exception -> 0x051c, Error -> 0x051e, LOOP:2: B:108:0x047e->B:110:0x0484, LOOP_END, TryCatch #8 {Error -> 0x051e, blocks: (B:105:0x042e, B:107:0x046f, B:108:0x047e, B:110:0x0484, B:111:0x048e, B:113:0x0498, B:114:0x04a3, B:115:0x04a7, B:120:0x04b5, B:121:0x04b6, B:130:0x04d6, B:140:0x050e, B:131:0x04e0, B:139:0x0502, B:136:0x04fc, B:127:0x04d0, B:142:0x051a, B:143:0x051b), top: B:184:0x042e }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0498 A[Catch: Exception -> 0x051c, Error -> 0x051e, TryCatch #8 {Error -> 0x051e, blocks: (B:105:0x042e, B:107:0x046f, B:108:0x047e, B:110:0x0484, B:111:0x048e, B:113:0x0498, B:114:0x04a3, B:115:0x04a7, B:120:0x04b5, B:121:0x04b6, B:130:0x04d6, B:140:0x050e, B:131:0x04e0, B:139:0x0502, B:136:0x04fc, B:127:0x04d0, B:142:0x051a, B:143:0x051b), top: B:184:0x042e }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04d6 A[Catch: Exception -> 0x051c, Error -> 0x051e, TryCatch #8 {Error -> 0x051e, blocks: (B:105:0x042e, B:107:0x046f, B:108:0x047e, B:110:0x0484, B:111:0x048e, B:113:0x0498, B:114:0x04a3, B:115:0x04a7, B:120:0x04b5, B:121:0x04b6, B:130:0x04d6, B:140:0x050e, B:131:0x04e0, B:139:0x0502, B:136:0x04fc, B:127:0x04d0, B:142:0x051a, B:143:0x051b), top: B:184:0x042e }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04e0 A[Catch: Exception -> 0x051c, Error -> 0x051e, TRY_LEAVE, TryCatch #8 {Error -> 0x051e, blocks: (B:105:0x042e, B:107:0x046f, B:108:0x047e, B:110:0x0484, B:111:0x048e, B:113:0x0498, B:114:0x04a3, B:115:0x04a7, B:120:0x04b5, B:121:0x04b6, B:130:0x04d6, B:140:0x050e, B:131:0x04e0, B:139:0x0502, B:136:0x04fc, B:127:0x04d0, B:142:0x051a, B:143:0x051b), top: B:184:0x042e }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0502 A[Catch: Exception -> 0x051c, Error -> 0x051e, TryCatch #8 {Error -> 0x051e, blocks: (B:105:0x042e, B:107:0x046f, B:108:0x047e, B:110:0x0484, B:111:0x048e, B:113:0x0498, B:114:0x04a3, B:115:0x04a7, B:120:0x04b5, B:121:0x04b6, B:130:0x04d6, B:140:0x050e, B:131:0x04e0, B:139:0x0502, B:136:0x04fc, B:127:0x04d0, B:142:0x051a, B:143:0x051b), top: B:184:0x042e }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05e1 A[LOOP:3: B:163:0x05db->B:165:0x05e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0379  */
    @Override // pdf.pdfreader.viewer.editor.free.ui.act.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C1(java.lang.String r18, java.util.ArrayList r19) {
        /*
            Method dump skipped, instructions count: 1544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.ReaderFeedbackActivity.C1(java.lang.String, java.util.ArrayList):void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.e
    public final void E1() {
        dp.a a10 = dp.a.a();
        String p10 = ea.a.p("HWVQZBxycWU_ZChhFmspY0FpGGkxeUVyUXEBZQF0cHAqclxpCnNebzQgK24RIAdwUG4tYShlF2E=", "lnei4trP");
        a10.getClass();
        dp.a.b(this, p10);
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.a(this)) {
            D1();
            return;
        }
        this.C.a(ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHEMHTQZSQQ==", "rMkjBF0N"));
    }

    public final ArrayList<String> F1() {
        ArrayList<String> arrayList = new ArrayList<>();
        pn.a[] aVarArr = this.f26914i;
        if (aVarArr != null) {
            for (pn.a aVar : aVarArr) {
                if (aVar.f28985b) {
                    String string = getString(R.string.arg_res_0x7f13031b);
                    String str = aVar.f28984a;
                    if (TextUtils.equals(string, str)) {
                        arrayList.add(ea.a.p("W2EidFRvQmVu", "9U8Lt2G6"));
                    } else if (TextUtils.equals(getString(R.string.arg_res_0x7f130141), str)) {
                        arrayList.add(ea.a.p("QHUsZxZzFmkdbg==", "3jLF10qq"));
                    } else if (TextUtils.equals(getString(R.string.arg_res_0x7f13047e), str)) {
                        arrayList.add(ea.a.p("PGxedw==", "kOlz833Z"));
                    } else if (TextUtils.equals(getString(R.string.arg_res_0x7f1303d7), str)) {
                        arrayList.add(ea.a.p("LHJQcxFlcw==", "ocBFnlfy"));
                    } else if (TextUtils.equals(getString(R.string.arg_res_0x7f13047f), str)) {
                        arrayList.add(ea.a.p("IHRZZQtz", "RYPpgj8G"));
                    } else if (TextUtils.equals(getString(R.string.arg_res_0x7f1300a8), str)) {
                        arrayList.add(ea.a.p("Um44dxZy", "79ZE2p5R"));
                    } else if (TextUtils.equals(getString(R.string.arg_res_0x7f1302cd), str)) {
                        arrayList.add(ea.a.p("RnNl", "rJz0w8Mc"));
                    } else {
                        arrayList.add(ea.a.p("UGEldFNvEmVu", "SpWANYTF"));
                    }
                }
            }
        }
        return arrayList;
    }

    public final Object[] G1() {
        int i10;
        String str;
        pn.a aVar;
        Object[] objArr = {0, ""};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ea.a.p("G2EqOg==", "gwoMimA9"));
        pn.a[] aVarArr = this.f26914i;
        if (aVarArr != null) {
            int length = aVarArr.length;
            int i11 = 0;
            i10 = 0;
            int i12 = 0;
            while (i11 < length) {
                int i13 = i12 + 1;
                if (aVarArr[i11].f28985b) {
                    pn.a[] aVarArr2 = this.f26914i;
                    if (aVarArr2 != null && (aVar = aVarArr2[i12]) != null) {
                        str = aVar.f28984a;
                    } else {
                        str = null;
                    }
                    sb2.append(str + ",");
                    i10++;
                }
                i11++;
                i12 = i13;
            }
        } else {
            i10 = 0;
        }
        if (kotlin.text.k.Q(sb2, ea.a.p("LA==", "P4RoGl2a"))) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        objArr[0] = Integer.valueOf(i10);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, ea.a.p("PGIfdBZTQ3Izbi0oKQ==", "sUKPGYov"));
        objArr[1] = sb3;
        return objArr;
    }

    public final void H1(final boolean z10) {
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f fVar = this.B;
        boolean z11 = false;
        if (fVar != null && fVar.isShowing()) {
            z11 = true;
        }
        if (!z11) {
            pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f fVar2 = new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f(this, z10 ? 1 : 0, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderFeedbackActivity$showCameraRationale$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return tf.d.f30009a;
                }

                public final void invoke(boolean z12) {
                    if (z12) {
                        if (z10) {
                            ReaderFeedbackActivity readerFeedbackActivity = this;
                            readerFeedbackActivity.D = true;
                            pdf.pdfreader.viewer.editor.free.utils.r0.b(readerFeedbackActivity);
                            return;
                        }
                        ReaderFeedbackActivity readerFeedbackActivity2 = this;
                        int i10 = ReaderFeedbackActivity.F;
                        readerFeedbackActivity2.getClass();
                        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.a(readerFeedbackActivity2)) {
                            readerFeedbackActivity2.D1();
                            return;
                        }
                        readerFeedbackActivity2.C.a(ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHEMHTQZSQQ==", "rMkjBF0N"));
                    }
                }
            });
            this.B = fVar2;
            fVar2.show();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.e, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c;
        dp.a a10 = dp.a.a();
        String p10 = ea.a.p("GWUXZCJyf2UtZARhV2sWY0xpJGk9eRZvGkMDZTB0ZQ==", "7YKvG9nE");
        a10.getClass();
        dp.a.b(this, p10);
        pdf.pdfreader.viewer.editor.free.utils.a0.a(this, false);
        super.onCreate(bundle);
        no.f.b(this).getClass();
        this.f26635z = no.f.d(this);
        Window window = getWindow();
        if (window != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.i.g(window, androidx.core.content.a.getColor(this, R.color.feedbackBgColor), androidx.core.content.a.getColor(this, R.color.colorPrimary));
            pdf.pdfreader.viewer.editor.free.utils.extension.i.h(window, !pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
            pdf.pdfreader.viewer.editor.free.utils.extension.i.c(window, !this.f26635z);
        }
        if (ReaderPdfApplication.f23861m) {
            ReaderPdfApplication.o(this);
            finish();
            return;
        }
        if (Decoder.f18572a) {
            try {
                String substring = kc.a.b(this).substring(2449, 2480);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "f55d7f557bf186481d39ae0d49c28e4".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % 2 == 0) {
                    int nextInt = kc.a.f19731a.nextInt(0, bytes.length / 2);
                    int i10 = 0;
                    while (true) {
                        if (i10 <= nextInt) {
                            if (bytes[i10] != bytes2[i10]) {
                                c = 16;
                                break;
                            }
                            i10++;
                        } else {
                            c = 0;
                            break;
                        }
                    }
                    if ((c ^ 0) != 0) {
                        kc.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    kc.a.a();
                    throw null;
                }
                pd.a.c(this);
            } catch (Exception e10) {
                e10.printStackTrace();
                kc.a.a();
                throw null;
            }
        } else {
            ReaderPdfApplication.o(this);
        }
        b.b.Z(this);
        ((pdf.pdfreader.viewer.editor.free.utils.z) this.A.getValue()).a(this, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderFeedbackActivity$onCreate$2
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z10) {
                if (!z10) {
                    Window window2 = ReaderFeedbackActivity.this.getWindow();
                    if (window2 != null) {
                        pdf.pdfreader.viewer.editor.free.utils.extension.i.c(window2, true ^ ReaderFeedbackActivity.this.f26635z);
                        return;
                    }
                    return;
                }
                Window window3 = ReaderFeedbackActivity.this.getWindow();
                if (window3 != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.i.c(window3, true);
                }
            }
        });
        View findViewById = findViewById(R.id.view_space);
        View findViewById2 = findViewById(R.id.et_input);
        kotlin.jvm.internal.g.d(findViewById2, ea.a.p("KWlfZC9pUncYeQNkSUUMaUFUC3gxPk1SWWkGLhB0HmkhcER0KQ==", "fr4gwbuA"));
        this.f26634y = (EditText) findViewById2;
        findViewById.post(new androidx.fragment.app.a1(17, this, findViewById));
        tn.a.d(this, ea.a.p("VWUuZBFhAWs=", "HB582CWY"), ea.a.p("UWVdZCRhLWsXcw5vdw==", "GH78FN1L"), this.f26633x, false);
        View findViewById3 = findViewById(R.id.tv_warning);
        kotlin.jvm.internal.g.d(findViewById3, ea.a.p("KWlfZC9pUncYeQNkSVQNeEFWB2UyPk1Sb2kOLjp2DXcucl9pF2cp", "woMMAjNR"));
        this.f26632w = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.tv_submit);
        kotlin.jvm.internal.g.d(findViewById4, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRnYZczZiXWkSKQ==", "0feWZ9bc"));
        TextView textView = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.iv_back);
        kotlin.jvm.internal.g.d(findViewById5, ea.a.p("KWlfZC9pUncYeQNkSUEYcHZvA3AkdCxtL2cBVgBlRD5nUh9pHS5edgViK2MeKQ==", "3KelNdi3"));
        ((AppCompatImageView) findViewById5).setOnClickListener(new qb.j0(this, 15));
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        z.a aVar;
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        pdf.pdfreader.viewer.editor.free.utils.z zVar = (pdf.pdfreader.viewer.editor.free.utils.z) this.A.getValue();
        View view = zVar.f28799b;
        if (view != null && (aVar = zVar.f28798a) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(aVar);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.e, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.D && pdf.pdfreader.viewer.editor.free.utils.extension.c.a(this)) {
            D1();
        }
        this.D = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        Window window;
        super.onWindowFocusChanged(z10);
        if (z10 && (window = getWindow()) != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.i.c(window, !this.f26635z);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.e
    public final void z1() {
        dp.a a10 = dp.a.a();
        String p10 = ea.a.p("HWVQZBxycWU_ZChhFmspY0FpGGkxeUVvBWVWRzBsLWU9eQ==", "yiUPu8QA");
        a10.getClass();
        dp.a.b(this, p10);
        Intent intent = new Intent(ea.a.p("A24xchhpFS4hbhJlWnR5YVt0O28nLnFFIF8yTx9UB05U", "xAbUwqOR"));
        intent.setType(ea.a.p("Jm1QZxwvKg==", "ubWOXYi6"));
        try {
            startActivityForResult(intent, 1002);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
