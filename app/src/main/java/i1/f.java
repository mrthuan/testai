package i1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: EmojiTextViewHelper.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f18420a;

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f18421a;

        /* renamed from: b  reason: collision with root package name */
        public final d f18422b;
        public boolean c = true;

        public a(TextView textView) {
            this.f18421a = textView;
            this.f18422b = new d(textView);
        }

        @Override // i1.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                    InputFilter inputFilter = inputFilterArr[i10];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i10, inputFilter);
                    }
                }
                if (sparseArray.size() != 0) {
                    int length = inputFilterArr.length;
                    InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (sparseArray.indexOfKey(i12) < 0) {
                            inputFilterArr2[i11] = inputFilterArr[i12];
                            i11++;
                        }
                    }
                    return inputFilterArr2;
                }
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            int i13 = 0;
            while (true) {
                d dVar = this.f18422b;
                if (i13 < length2) {
                    if (inputFilterArr[i13] != dVar) {
                        i13++;
                    } else {
                        return inputFilterArr;
                    }
                } else {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = dVar;
                    return inputFilterArr3;
                }
            }
        }

        @Override // i1.f.b
        public final boolean b() {
            return this.c;
        }

        @Override // i1.f.b
        public final void c(boolean z10) {
            if (z10) {
                TextView textView = this.f18421a;
                textView.setTransformationMethod(e(textView.getTransformationMethod()));
            }
        }

        @Override // i1.f.b
        public final void d(boolean z10) {
            this.c = z10;
            TextView textView = this.f18421a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
            textView.setFilters(a(textView.getFilters()));
        }

        @Override // i1.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    return new h(transformationMethod);
                }
                return transformationMethod;
            } else if (transformationMethod instanceof h) {
                return ((h) transformationMethod).f18428a;
            } else {
                return transformationMethod;
            }
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f18423a;

        public c(TextView textView) {
            this.f18423a = new a(textView);
        }

        @Override // i1.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            boolean z10;
            if (androidx.emoji2.text.g.f3618j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return inputFilterArr;
            }
            return this.f18423a.a(inputFilterArr);
        }

        @Override // i1.f.b
        public final boolean b() {
            return this.f18423a.c;
        }

        @Override // i1.f.b
        public final void c(boolean z10) {
            boolean z11;
            if (androidx.emoji2.text.g.f3618j != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return;
            }
            this.f18423a.c(z10);
        }

        @Override // i1.f.b
        public final void d(boolean z10) {
            boolean z11;
            if (androidx.emoji2.text.g.f3618j != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !z11;
            a aVar = this.f18423a;
            if (z12) {
                aVar.c = z10;
            } else {
                aVar.d(z10);
            }
        }

        @Override // i1.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            boolean z10;
            if (androidx.emoji2.text.g.f3618j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return transformationMethod;
            }
            return this.f18423a.e(transformationMethod);
        }
    }

    public f(TextView textView) {
        if (textView != null) {
            this.f18420a = new c(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }
}
