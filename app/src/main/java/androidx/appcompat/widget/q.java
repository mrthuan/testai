package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f2652a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f2653b;

    /* compiled from: AppCompatTextClassifierHelper.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public q(TextView textView) {
        textView.getClass();
        this.f2652a = textView;
    }
}
