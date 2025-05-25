package com.tom_roush.pdfbox.contentstream.operator.state;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class EmptyGraphicsStackException extends IOException {
    private static final long serialVersionUID = 1;

    public EmptyGraphicsStackException() {
        super("Cannot execute restore, the graphics stack is empty");
    }
}
