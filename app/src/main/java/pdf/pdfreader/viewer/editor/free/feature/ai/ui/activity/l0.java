package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.SpannableString;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.TypingTextView;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class l0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AISelfInfoActivity f24618a;

    public l0(AISelfInfoActivity aISelfInfoActivity) {
        this.f24618a = aISelfInfoActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
        final AISelfInfoActivity aISelfInfoActivity = this.f24618a;
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aISelfInfoActivity)) {
            AISelfInfoActivity.a aVar = AISelfInfoActivity.G;
            aISelfInfoActivity.b2().f881l.setVisibility(8);
            if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aISelfInfoActivity)) {
                tn.a.d(aISelfInfoActivity, ea.a.p("Lmk=", "ZcXGnpbW"), ea.a.p("K2kldRlkCl84YQFla3M_b3c=", "9GJBpowA"), ea.a.p("Q2EsZTI=", "2DfEfiSX"), false);
                aISelfInfoActivity.b2().f882m.l(null, 25L, new SpannableString(aISelfInfoActivity.getString(R.string.arg_res_0x7f130077)), 0, new cg.p<CharSequence, Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity$setAiInfo2$1
                    {
                        super(2);
                    }

                    @Override // cg.p
                    public /* bridge */ /* synthetic */ tf.d invoke(CharSequence charSequence, Boolean bool) {
                        invoke(charSequence, bool.booleanValue());
                        return tf.d.f30009a;
                    }

                    public final void invoke(CharSequence text, boolean z10) {
                        kotlin.jvm.internal.g.e(text, "text");
                        final AISelfInfoActivity aISelfInfoActivity2 = AISelfInfoActivity.this;
                        AISelfInfoActivity.a aVar2 = AISelfInfoActivity.G;
                        aISelfInfoActivity2.getClass();
                        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aISelfInfoActivity2)) {
                            return;
                        }
                        aISelfInfoActivity2.b2().c.setVisibility(0);
                        TypingTextView typingTextView = aISelfInfoActivity2.b2().f880k;
                        String string = aISelfInfoActivity2.getString(R.string.arg_res_0x7f13005b);
                        kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGErcxJlCF8mdQlzLGkgbkJfHnBDKQ==", "E4y8zWlX"));
                        typingTextView.m(string, 25L, new cg.p<CharSequence, Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity$setAiAbility$1
                            {
                                super(2);
                            }

                            @Override // cg.p
                            public /* bridge */ /* synthetic */ tf.d invoke(CharSequence charSequence, Boolean bool) {
                                invoke(charSequence, bool.booleanValue());
                                return tf.d.f30009a;
                            }

                            public final void invoke(CharSequence text2, boolean z11) {
                                kotlin.jvm.internal.g.e(text2, "text");
                                AISelfInfoActivity aISelfInfoActivity3 = AISelfInfoActivity.this;
                                AISelfInfoActivity.a aVar3 = AISelfInfoActivity.G;
                                aISelfInfoActivity3.b2().f874e.setVisibility(0);
                                TypingTextView typingTextView2 = AISelfInfoActivity.this.b2().f884o;
                                String string2 = AISelfInfoActivity.this.getString(R.string.arg_res_0x7f1304a5);
                                kotlin.jvm.internal.g.d(string2, ea.a.p("P2UbUyNyI24vKDQuR3QlaVZnfHM8bVthBmkLZQ50J3gsXwhwIyk=", "9xXoWJgs"));
                                final AISelfInfoActivity aISelfInfoActivity4 = AISelfInfoActivity.this;
                                typingTextView2.m(string2, 25L, new cg.p<CharSequence, Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity$setAiAbility$1.1
                                    {
                                        super(2);
                                    }

                                    @Override // cg.p
                                    public /* bridge */ /* synthetic */ tf.d invoke(CharSequence charSequence, Boolean bool) {
                                        invoke(charSequence, bool.booleanValue());
                                        return tf.d.f30009a;
                                    }

                                    public final void invoke(CharSequence text3, boolean z12) {
                                        kotlin.jvm.internal.g.e(text3, "text");
                                        AISelfInfoActivity aISelfInfoActivity5 = AISelfInfoActivity.this;
                                        AISelfInfoActivity.a aVar4 = AISelfInfoActivity.G;
                                        aISelfInfoActivity5.b2().f876g.setVisibility(0);
                                        TypingTextView typingTextView3 = AISelfInfoActivity.this.b2().f886q;
                                        String string3 = AISelfInfoActivity.this.getString(R.string.arg_res_0x7f13018e);
                                        kotlin.jvm.internal.g.d(string3, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGgjbDNfTG8nXy9yDnRWXyxwByk=", "5RXgd8Ke"));
                                        final AISelfInfoActivity aISelfInfoActivity6 = AISelfInfoActivity.this;
                                        typingTextView3.m(string3, 25L, new cg.p<CharSequence, Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity.setAiAbility.1.1.1
                                            {
                                                super(2);
                                            }

                                            @Override // cg.p
                                            public /* bridge */ /* synthetic */ tf.d invoke(CharSequence charSequence, Boolean bool) {
                                                invoke(charSequence, bool.booleanValue());
                                                return tf.d.f30009a;
                                            }

                                            public final void invoke(CharSequence text4, boolean z13) {
                                                kotlin.jvm.internal.g.e(text4, "text");
                                                AISelfInfoActivity aISelfInfoActivity7 = AISelfInfoActivity.this;
                                                AISelfInfoActivity.a aVar5 = AISelfInfoActivity.G;
                                                aISelfInfoActivity7.b2().f875f.setVisibility(0);
                                                TypingTextView typingTextView4 = AISelfInfoActivity.this.b2().f885p;
                                                String string4 = AISelfInfoActivity.this.getString(R.string.arg_res_0x7f1304dd);
                                                kotlin.jvm.internal.g.d(string4, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHQ3YQtzGWEtZWxhOHQmY11lJmdHdCk=", "xhUCuY3J"));
                                                final AISelfInfoActivity aISelfInfoActivity8 = AISelfInfoActivity.this;
                                                typingTextView4.m(string4, 25L, new cg.p<CharSequence, Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity.setAiAbility.1.1.1.1
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // cg.p
                                                    public /* bridge */ /* synthetic */ tf.d invoke(CharSequence charSequence, Boolean bool) {
                                                        invoke(charSequence, bool.booleanValue());
                                                        return tf.d.f30009a;
                                                    }

                                                    public final void invoke(CharSequence text5, boolean z14) {
                                                        kotlin.jvm.internal.g.e(text5, "text");
                                                        AISelfInfoActivity aISelfInfoActivity9 = AISelfInfoActivity.this;
                                                        AISelfInfoActivity.a aVar6 = AISelfInfoActivity.G;
                                                        TypingTextView typingTextView5 = aISelfInfoActivity9.b2().f883n;
                                                        String p10 = ea.a.p("YS4u", "ZuF8kOCD");
                                                        final AISelfInfoActivity aISelfInfoActivity10 = AISelfInfoActivity.this;
                                                        typingTextView5.m(p10, 25L, new cg.p<CharSequence, Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity.setAiAbility.1.1.1.1.1
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // cg.p
                                                            public /* bridge */ /* synthetic */ tf.d invoke(CharSequence charSequence, Boolean bool) {
                                                                invoke(charSequence, bool.booleanValue());
                                                                return tf.d.f30009a;
                                                            }

                                                            public final void invoke(CharSequence text6, boolean z15) {
                                                                kotlin.jvm.internal.g.e(text6, "text");
                                                                AISelfInfoActivity aISelfInfoActivity11 = AISelfInfoActivity.this;
                                                                AISelfInfoActivity.a aVar7 = AISelfInfoActivity.G;
                                                                aISelfInfoActivity11.getClass();
                                                                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aISelfInfoActivity11)) {
                                                                    aISelfInfoActivity11.b2().f878i.setVisibility(0);
                                                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aISelfInfoActivity11.b2().f878i, ea.a.p("LmxBaGE=", "Fv1hX1Iv"), 0.0f, 1.0f, 1.0f, 1.0f);
                                                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aISelfInfoActivity11.b2().f878i, ea.a.p("GmNWbBdY", "dyi7rBg2"), 0.0f, 1.0f);
                                                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aISelfInfoActivity11.b2().f878i, ea.a.p("QGMqbBZZ", "tIeA9YP5"), 0.0f, 1.0f);
                                                                    AnimatorSet animatorSet = new AnimatorSet();
                                                                    aISelfInfoActivity11.D = animatorSet;
                                                                    animatorSet.setDuration(300L);
                                                                    AnimatorSet animatorSet2 = aISelfInfoActivity11.D;
                                                                    if (animatorSet2 != null) {
                                                                        animatorSet2.addListener(new k0(aISelfInfoActivity11));
                                                                    }
                                                                    AnimatorSet animatorSet3 = aISelfInfoActivity11.D;
                                                                    if (animatorSet3 != null) {
                                                                        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3);
                                                                    }
                                                                    AnimatorSet animatorSet4 = aISelfInfoActivity11.D;
                                                                    if (animatorSet4 != null) {
                                                                        animatorSet4.start();
                                                                    }
                                                                }
                                                                AISelfInfoActivity.this.b2().f872b.setVisibility(0);
                                                                AISelfInfoActivity.this.b2().f887r.setVisibility(0);
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }
}
