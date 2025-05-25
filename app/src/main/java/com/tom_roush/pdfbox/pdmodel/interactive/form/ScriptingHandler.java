package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionJavaScript;

/* loaded from: classes2.dex */
public interface ScriptingHandler {
    String calculate(PDActionJavaScript pDActionJavaScript, String str);

    String format(PDActionJavaScript pDActionJavaScript, String str);

    String keyboard(PDActionJavaScript pDActionJavaScript, String str);

    boolean validate(PDActionJavaScript pDActionJavaScript, String str);
}
