package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.text.Selection;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowInsets;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import bb.i;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.editing.f;
import io.flutter.plugin.platform.j;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes.dex */
public final class TextInputPlugin implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public final View f18730a;

    /* renamed from: b  reason: collision with root package name */
    public final InputMethodManager f18731b;
    public final AutofillManager c;

    /* renamed from: d  reason: collision with root package name */
    public final TextInputChannel f18732d;

    /* renamed from: e  reason: collision with root package name */
    public InputTarget f18733e = new InputTarget(InputTarget.Type.NO_TARGET, 0);

    /* renamed from: f  reason: collision with root package name */
    public TextInputChannel.b f18734f;

    /* renamed from: g  reason: collision with root package name */
    public SparseArray<TextInputChannel.b> f18735g;

    /* renamed from: h  reason: collision with root package name */
    public f f18736h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f18737i;

    /* renamed from: j  reason: collision with root package name */
    public InputConnection f18738j;

    /* renamed from: k  reason: collision with root package name */
    public final j f18739k;

    /* renamed from: l  reason: collision with root package name */
    public Rect f18740l;

    /* renamed from: m  reason: collision with root package name */
    public TextInputChannel.d f18741m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f18742n;

    /* loaded from: classes.dex */
    public static class InputTarget {

        /* renamed from: a  reason: collision with root package name */
        public final Type f18743a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18744b;

        /* loaded from: classes.dex */
        public enum Type {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public InputTarget(Type type, int i10) {
            this.f18743a = type;
            this.f18744b = i10;
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextInputChannel.e {
        public a() {
        }

        public final void a() {
            TextInputPlugin textInputPlugin = TextInputPlugin.this;
            if (textInputPlugin.f18733e.f18743a != InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                textInputPlugin.f18736h.d(textInputPlugin);
                textInputPlugin.e();
                textInputPlugin.f18734f = null;
                textInputPlugin.g(null);
                textInputPlugin.f18733e = new InputTarget(InputTarget.Type.NO_TARGET, 0);
                textInputPlugin.f();
                textInputPlugin.f18740l = null;
            }
        }

        public final void b() {
            TextInputPlugin textInputPlugin = TextInputPlugin.this;
            if (textInputPlugin.f18733e.f18743a == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                textInputPlugin.e();
                return;
            }
            textInputPlugin.e();
            textInputPlugin.f18731b.hideSoftInputFromWindow(textInputPlugin.f18730a.getApplicationWindowToken(), 0);
        }

        public final void c(int i10, TextInputChannel.b bVar) {
            boolean z10;
            TextInputChannel.d dVar;
            TextInputPlugin textInputPlugin = TextInputPlugin.this;
            textInputPlugin.e();
            textInputPlugin.f18734f = bVar;
            TextInputChannel.c cVar = bVar.f18714g;
            if (cVar == null || cVar.f18723a != TextInputChannel.TextInputType.NONE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                textInputPlugin.f18733e = new InputTarget(InputTarget.Type.FRAMEWORK_CLIENT, i10);
            } else {
                textInputPlugin.f18733e = new InputTarget(InputTarget.Type.NO_TARGET, i10);
            }
            textInputPlugin.f18736h.d(textInputPlugin);
            TextInputChannel.b.a aVar = bVar.f18717j;
            if (aVar != null) {
                dVar = aVar.c;
            } else {
                dVar = null;
            }
            textInputPlugin.f18736h = new f(textInputPlugin.f18730a, dVar);
            textInputPlugin.g(bVar);
            textInputPlugin.f18737i = true;
            textInputPlugin.f();
            textInputPlugin.f18740l = null;
            f fVar = textInputPlugin.f18736h;
            int i11 = fVar.f18762b;
            if (fVar.f18761a > 0) {
                fVar.f18763d.add(textInputPlugin);
            } else {
                fVar.c.add(textInputPlugin);
            }
        }

        public final void d(double d10, double d11, double[] dArr) {
            boolean z10;
            TextInputPlugin textInputPlugin = TextInputPlugin.this;
            textInputPlugin.getClass();
            double[] dArr2 = new double[4];
            if (dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d) {
                z10 = true;
            } else {
                z10 = false;
            }
            double d12 = dArr[12];
            double d13 = dArr[15];
            double d14 = d12 / d13;
            dArr2[1] = d14;
            dArr2[0] = d14;
            double d15 = dArr[13] / d13;
            dArr2[3] = d15;
            dArr2[2] = d15;
            h hVar = new h(z10, dArr, dArr2);
            hVar.a(d10, 0.0d);
            hVar.a(d10, d11);
            hVar.a(0.0d, d11);
            Float valueOf = Float.valueOf(textInputPlugin.f18730a.getContext().getResources().getDisplayMetrics().density);
            textInputPlugin.f18740l = new Rect((int) (dArr2[0] * valueOf.floatValue()), (int) (dArr2[2] * valueOf.floatValue()), (int) Math.ceil(dArr2[1] * valueOf.floatValue()), (int) Math.ceil(dArr2[3] * valueOf.floatValue()));
        }

        public final void e(TextInputChannel.d dVar) {
            TextInputChannel.d dVar2;
            boolean z10;
            TextInputPlugin textInputPlugin = TextInputPlugin.this;
            View view = textInputPlugin.f18730a;
            if (!textInputPlugin.f18737i && (dVar2 = textInputPlugin.f18741m) != null) {
                boolean z11 = true;
                int i10 = dVar2.f18728e;
                int i11 = dVar2.f18727d;
                if (i11 >= 0 && i10 > i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i12 = i10 - i11;
                    int i13 = dVar.f18728e;
                    int i14 = dVar.f18727d;
                    if (i12 == i13 - i14) {
                        int i15 = 0;
                        while (true) {
                            if (i15 < i12) {
                                if (dVar2.f18725a.charAt(i15 + i11) != dVar.f18725a.charAt(i15 + i14)) {
                                    break;
                                }
                                i15++;
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    textInputPlugin.f18737i = z11;
                }
            }
            textInputPlugin.f18741m = dVar;
            textInputPlugin.f18736h.e(dVar);
            if (textInputPlugin.f18737i) {
                textInputPlugin.f18731b.restartInput(view);
                textInputPlugin.f18737i = false;
            }
        }

        public final void f(int i10, boolean z10) {
            TextInputPlugin textInputPlugin = TextInputPlugin.this;
            if (z10) {
                View view = textInputPlugin.f18730a;
                view.requestFocus();
                textInputPlugin.f18733e = new InputTarget(InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, i10);
                textInputPlugin.f18731b.restartInput(view);
                textInputPlugin.f18737i = false;
                return;
            }
            textInputPlugin.getClass();
            textInputPlugin.f18733e = new InputTarget(InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, i10);
            textInputPlugin.f18738j = null;
        }
    }

    @SuppressLint({"NewApi"})
    public TextInputPlugin(View view, TextInputChannel textInputChannel, j jVar) {
        int ime;
        int statusBars;
        int navigationBars;
        int i10 = 0;
        this.f18730a = view;
        this.f18736h = new f(view, null);
        this.f18731b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.c = bb.j.m(view.getContext().getSystemService(i.j()));
        } else {
            this.c = null;
        }
        if (i11 >= 30) {
            if ((view.getWindowSystemUiVisibility() & 2) == 0) {
                navigationBars = WindowInsets.Type.navigationBars();
                i10 = 0 | navigationBars;
            }
            if ((view.getWindowSystemUiVisibility() & 4) == 0) {
                statusBars = WindowInsets.Type.statusBars();
                i10 |= statusBars;
            }
            ime = WindowInsets.Type.ime();
            new ImeSyncDeferringInsetsCallback(view, i10, ime).install();
        }
        this.f18732d = textInputChannel;
        textInputChannel.f18705b = new a();
        textInputChannel.f18704a.a(null, "TextInputClient.requestExistingInputState");
        this.f18739k = jVar;
        jVar.f18815e = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r9 == r0.f18728e) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016d  */
    @Override // io.flutter.plugin.editing.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r17) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.TextInputPlugin.a(boolean):void");
    }

    public final void b(int i10) {
        InputTarget inputTarget = this.f18733e;
        InputTarget.Type type = inputTarget.f18743a;
        if ((type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW || type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) && inputTarget.f18744b == i10) {
            this.f18733e = new InputTarget(InputTarget.Type.NO_TARGET, 0);
            e();
            View view = this.f18730a;
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f18731b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.f18737i = false;
        }
    }

    public final InputConnection c(View view, io.flutter.embedding.android.f fVar, EditorInfo editorInfo) {
        int i10;
        int i11;
        InputTarget inputTarget = this.f18733e;
        InputTarget.Type type = inputTarget.f18743a;
        if (type == InputTarget.Type.NO_TARGET) {
            this.f18738j = null;
            return null;
        } else if (type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        } else {
            if (type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                if (this.f18742n) {
                    return this.f18738j;
                }
                InputConnection onCreateInputConnection = this.f18739k.b(inputTarget.f18744b).onCreateInputConnection(editorInfo);
                this.f18738j = onCreateInputConnection;
                return onCreateInputConnection;
            }
            TextInputChannel.b bVar = this.f18734f;
            TextInputChannel.c cVar = bVar.f18714g;
            boolean z10 = bVar.f18709a;
            boolean z11 = bVar.f18710b;
            boolean z12 = bVar.c;
            boolean z13 = bVar.f18711d;
            TextInputChannel.TextCapitalization textCapitalization = bVar.f18713f;
            TextInputChannel.TextInputType textInputType = cVar.f18723a;
            int i12 = 1;
            if (textInputType == TextInputChannel.TextInputType.DATETIME) {
                i10 = 4;
            } else if (textInputType == TextInputChannel.TextInputType.NUMBER) {
                if (cVar.f18724b) {
                    i11 = 4098;
                } else {
                    i11 = 2;
                }
                if (cVar.c) {
                    i10 = i11 | 8192;
                } else {
                    i10 = i11;
                }
            } else if (textInputType == TextInputChannel.TextInputType.PHONE) {
                i10 = 3;
            } else if (textInputType == TextInputChannel.TextInputType.NONE) {
                i10 = 0;
            } else {
                if (textInputType == TextInputChannel.TextInputType.MULTILINE) {
                    i10 = 131073;
                } else if (textInputType == TextInputChannel.TextInputType.EMAIL_ADDRESS) {
                    i10 = 33;
                } else if (textInputType == TextInputChannel.TextInputType.URL) {
                    i10 = 17;
                } else if (textInputType == TextInputChannel.TextInputType.VISIBLE_PASSWORD) {
                    i10 = ShapeTypes.FLOW_CHART_PUNCHED_TAPE;
                } else if (textInputType == TextInputChannel.TextInputType.NAME) {
                    i10 = 97;
                } else if (textInputType == TextInputChannel.TextInputType.POSTAL_ADDRESS) {
                    i10 = 113;
                } else {
                    i10 = 1;
                }
                if (z10) {
                    i10 = i10 | 524288 | 128;
                } else {
                    if (z11) {
                        i10 |= Variant.VT_RESERVED;
                    }
                    if (!z12) {
                        i10 |= 524288;
                    }
                }
                if (textCapitalization == TextInputChannel.TextCapitalization.CHARACTERS) {
                    i10 |= 4096;
                } else if (textCapitalization == TextInputChannel.TextCapitalization.WORDS) {
                    i10 |= 8192;
                } else if (textCapitalization == TextInputChannel.TextCapitalization.SENTENCES) {
                    i10 |= 16384;
                }
            }
            editorInfo.inputType = i10;
            editorInfo.imeOptions = 33554432;
            if (Build.VERSION.SDK_INT >= 26 && !z13) {
                editorInfo.imeOptions = 33554432 | 16777216;
            }
            Integer num = bVar.f18715h;
            if (num == null) {
                if ((131072 & i10) == 0) {
                    i12 = 6;
                }
            } else {
                i12 = num.intValue();
            }
            TextInputChannel.b bVar2 = this.f18734f;
            String str = bVar2.f18716i;
            if (str != null) {
                editorInfo.actionLabel = str;
                editorInfo.actionId = i12;
            }
            editorInfo.imeOptions |= i12;
            String[] strArr = bVar2.f18718k;
            if (strArr != null) {
                a1.c.a(editorInfo, strArr);
            }
            d dVar = new d(view, this.f18733e.f18744b, this.f18732d, fVar, this.f18736h, editorInfo);
            f fVar2 = this.f18736h;
            fVar2.getClass();
            editorInfo.initialSelStart = Selection.getSelectionStart(fVar2);
            f fVar3 = this.f18736h;
            fVar3.getClass();
            editorInfo.initialSelEnd = Selection.getSelectionEnd(fVar3);
            this.f18738j = dVar;
            return dVar;
        }
    }

    public final void d() {
        if (this.f18733e.f18743a == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f18742n = true;
        }
    }

    public final void e() {
        AutofillManager autofillManager;
        TextInputChannel.b bVar;
        TextInputChannel.b.a aVar;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.c) != null && (bVar = this.f18734f) != null && (aVar = bVar.f18717j) != null) {
            if (this.f18735g != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                autofillManager.notifyViewExited(this.f18730a, aVar.f18720a.hashCode());
            }
        }
    }

    public final void f() {
        if (this.f18733e.f18743a == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f18742n = false;
        }
    }

    public final void g(TextInputChannel.b bVar) {
        TextInputChannel.b.a aVar;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar != null && (aVar = bVar.f18717j) != null) {
            SparseArray<TextInputChannel.b> sparseArray = new SparseArray<>();
            this.f18735g = sparseArray;
            TextInputChannel.b[] bVarArr = bVar.f18719l;
            if (bVarArr == null) {
                sparseArray.put(aVar.f18720a.hashCode(), bVar);
                return;
            }
            for (TextInputChannel.b bVar2 : bVarArr) {
                TextInputChannel.b.a aVar2 = bVar2.f18717j;
                if (aVar2 != null) {
                    SparseArray<TextInputChannel.b> sparseArray2 = this.f18735g;
                    String str = aVar2.f18720a;
                    sparseArray2.put(str.hashCode(), bVar2);
                    int hashCode = str.hashCode();
                    forText = AutofillValue.forText(aVar2.c.f18725a);
                    this.c.notifyValueChanged(this.f18730a, hashCode, forText);
                }
            }
            return;
        }
        this.f18735g = null;
    }
}
