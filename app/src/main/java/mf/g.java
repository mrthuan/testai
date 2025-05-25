package mf;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import com.adjust.sdk.Constants;
import kf.p;

/* compiled from: LinkSpan.java */
/* loaded from: classes.dex */
public final class g extends URLSpan {

    /* renamed from: a  reason: collision with root package name */
    public final p f22030a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22031b;
    public final jf.c c;

    public g(p pVar, String str, jf.c cVar) {
        super(str);
        this.f22030a = pVar;
        this.f22031b = str;
        this.c = cVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        ((jf.d) this.c).getClass();
        Uri parse = Uri.parse(this.f22031b);
        if (TextUtils.isEmpty(parse.getScheme())) {
            parse = parse.buildUpon().scheme(Constants.SCHEME).build();
        }
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f22030a.getClass();
        textPaint.setUnderlineText(true);
        textPaint.setColor(textPaint.linkColor);
    }
}
