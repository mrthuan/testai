package lib.zj.pdfeditor.text.editor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.i;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.ArrayList;
import java.util.Arrays;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.text.editor.EditorView;
import mj.c;

/* loaded from: classes3.dex */
public class EditorView extends AppCompatEditText implements TextWatcher {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f21667o = 0;

    /* renamed from: g  reason: collision with root package name */
    public c f21668g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f21669h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f21670i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f21671j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<Character> f21672k;

    /* renamed from: l  reason: collision with root package name */
    public int f21673l;

    /* renamed from: m  reason: collision with root package name */
    public int f21674m;

    /* renamed from: n  reason: collision with root package name */
    public int f21675n;

    public EditorView(Context context) {
        super(context);
        this.f21669h = false;
        this.f21670i = false;
        this.f21672k = new ArrayList<>();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        if (editable == null || !this.f21670i) {
            return;
        }
        int i11 = this.f21673l;
        ArrayList<Character> arrayList = this.f21672k;
        if (i11 == 0 && this.f21674m == 0 && this.f21675n == 0 && editable.length() > 0) {
            arrayList.clear();
            for (int i12 = 0; i12 < editable.length(); i12++) {
                arrayList.add(Character.valueOf(editable.charAt(i12)));
            }
            if (!arrayList.isEmpty()) {
                int[] iArr = new int[arrayList.size()];
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    iArr[i13] = arrayList.get(i13).charValue();
                }
                c cVar = this.f21668g;
                if (cVar != null) {
                    ((PDFReaderView) cVar).A0(iArr);
                }
            }
            this.f21671j = null;
            arrayList.clear();
            this.f21673l = 0;
            this.f21674m = 0;
            this.f21675n = 0;
            return;
        }
        int i14 = this.f21675n;
        if (i14 == 0) {
            int i15 = this.f21674m;
            if (i15 == 1) {
                c cVar2 = this.f21668g;
                if (cVar2 != null) {
                    ((PDFReaderView) cVar2).w0();
                }
            } else {
                int[] iArr2 = new int[i15];
                Arrays.fill(iArr2, -1);
                c cVar3 = this.f21668g;
                if (cVar3 != null) {
                    ((PDFReaderView) cVar3).A0(iArr2);
                }
            }
        } else if (this.f21671j != null && (i10 = this.f21673l) >= 0 && i10 + i14 <= editable.length()) {
            int i16 = this.f21673l;
            CharSequence subSequence = editable.subSequence(i16, this.f21675n + i16);
            arrayList.clear();
            int length = subSequence.length();
            int i17 = this.f21674m;
            for (int i18 = 0; i18 < length; i18++) {
                arrayList.add(Character.valueOf(subSequence.charAt(i18)));
            }
            if (!arrayList.isEmpty()) {
                int[] iArr3 = new int[arrayList.size() + i17];
                for (int i19 = 0; i19 < i17; i19++) {
                    iArr3[i19] = -1;
                }
                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                    iArr3[i20 + i17] = arrayList.get(i20).charValue();
                }
                c cVar4 = this.f21668g;
                if (cVar4 != null) {
                    ((PDFReaderView) cVar4).A0(iArr3);
                }
            } else if (subSequence.length() < this.f21671j.length()) {
                int[] iArr4 = new int[this.f21671j.length() - subSequence.length()];
                Arrays.fill(iArr4, -1);
                c cVar5 = this.f21668g;
                if (cVar5 != null) {
                    ((PDFReaderView) cVar5).A0(iArr4);
                }
            }
        }
        this.f21671j = null;
        arrayList.clear();
        this.f21673l = 0;
        this.f21674m = 0;
        this.f21675n = 0;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        if (charSequence == null || charSequence.length() == 0 || !this.f21670i) {
            return;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        this.f21671j = null;
        this.f21672k.clear();
        this.f21673l = i10;
        this.f21674m = i11;
        this.f21675n = i12;
        if (i10 >= 0 && i11 >= 0 && charSequence.length() >= (i13 = i11 + i10)) {
            this.f21671j = charSequence.subSequence(i10, i13);
        }
    }

    public final void c() {
        try {
            clearFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            }
        } catch (Exception unused) {
        }
    }

    public final void d() {
        this.f21670i = false;
        setText("");
    }

    public final void e() {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                setFocusable(true);
                setFocusableInTouchMode(true);
                requestFocus();
                inputMethodManager.showSoftInput(this, 0, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        addTextChangedListener(this);
        setBackground(null);
        setMaxLines(1);
        setOnKeyListener(new View.OnKeyListener() { // from class: mj.d
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                c cVar;
                EditorView editorView = EditorView.this;
                if (editorView.f21670i && i10 == 67) {
                    int action = keyEvent.getAction();
                    boolean z10 = true;
                    if (action != 0) {
                        if (action == 1 && editorView.f21669h && (cVar = editorView.f21668g) != null) {
                            ((PDFReaderView) cVar).w0();
                        }
                    } else {
                        Editable text = editorView.getText();
                        if (text != null && text.length() != 0) {
                            z10 = false;
                        }
                        editorView.f21669h = z10;
                    }
                }
                return false;
            }
        });
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeTextChangedListener(this);
        setOnKeyListener(null);
    }

    @Override // android.widget.TextView
    public final void onEndBatchEdit() {
        super.onEndBatchEdit();
        post(new i(this, 20));
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setListener(c cVar) {
        this.f21668g = cVar;
    }

    public EditorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21669h = false;
        this.f21670i = false;
        this.f21672k = new ArrayList<>();
    }

    public EditorView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21669h = false;
        this.f21670i = false;
        this.f21672k = new ArrayList<>();
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
